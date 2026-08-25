#!/usr/bin/env bash
set -euo pipefail

ROOT="$(cd "$(dirname "$0")" && pwd)"
BUILD_TOOLS="${ANDROID_BUILD_TOOLS:-/home/ubuntu/android-sdk/build-tools/35.0.0}"
ANDROID_JAR="${ANDROID_JAR:-/home/ubuntu/android-sdk/platforms/android-23/android.jar}"
R8_JAR="${R8_JAR:-}"
OUT="${OUT:-$ROOT/build}"

rm -rf "$OUT"
mkdir -p "$OUT/compiled" "$OUT/linked" "$OUT/gen" "$OUT/classes" "$OUT/dex"

"$BUILD_TOOLS/aapt2" compile --dir "$ROOT/res" -o "$OUT/compiled/resources.zip"
"$BUILD_TOOLS/aapt2" link \
  --manifest "$ROOT/AndroidManifest.xml" \
  --min-sdk-version 23 \
  --target-sdk-version 35 \
  --version-code 1 \
  --version-name 1.0.0 \
  --java "$OUT/gen" \
  -I "$ANDROID_JAR" \
  -A "$ROOT/assets" \
  -o "$OUT/linked/base-res.apk" \
  "$OUT/compiled/resources.zip"

javac -source 8 -target 8 -encoding UTF-8 \
  -classpath "$ANDROID_JAR" \
  -d "$OUT/classes" \
  "$OUT/gen/cn/dolit/nexus/R.java" \
  "$ROOT/src/main/java/cn/dolit/nexus/MainActivity.java"

jar cf "$OUT/app.jar" -C "$OUT/classes" .
"$BUILD_TOOLS/d8" \
  --lib "$ANDROID_JAR" \
  --min-api 23 \
  --output "$OUT/dex" \
  "$OUT/app.jar"

cp "$OUT/linked/base-res.apk" "$OUT/nexus-clean-unsigned.apk"
zip -q -j "$OUT/nexus-clean-unsigned.apk" "$OUT/dex/classes.dex"

printf 'APK unsigned gerado em: %s\n' "$OUT/nexus-clean-unsigned.apk"
