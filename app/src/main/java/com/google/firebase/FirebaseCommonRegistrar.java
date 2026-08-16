package com.google.firebase;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.heartbeatinfo.DefaultHeartBeatController;
import com.google.firebase.platforminfo.DefaultUserAgentPublisher;
import com.google.firebase.platforminfo.KotlinDetector;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import java.util.ArrayList;
import java.util.List;
import p000.C1270Tk;

/* JADX INFO: loaded from: classes2.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    private static final String ANDROID_INSTALLER = "android-installer";
    private static final String ANDROID_PLATFORM = "android-platform";
    private static final String DEVICE_BRAND = "device-brand";
    private static final String DEVICE_MODEL = "device-model";
    private static final String DEVICE_NAME = "device-name";
    private static final String FIREBASE_ANDROID = "fire-android";
    private static final String FIREBASE_COMMON = "fire-core";
    private static final String KOTLIN = "kotlin";
    private static final String MIN_SDK = "android-min-sdk";
    private static final String TARGET_SDK = "android-target-sdk";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$getComponents$0(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return applicationInfo != null ? String.valueOf(applicationInfo.targetSdkVersion) : "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$getComponents$1(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return (applicationInfo == null || Build.VERSION.SDK_INT < 24) ? "" : String.valueOf(C1270Tk.m6033a(applicationInfo));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$getComponents$2(Context context) {
        int i = Build.VERSION.SDK_INT;
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
            return "tv";
        }
        if (i >= 20 && context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
            return "watch";
        }
        if (i < 23 || !context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
            return (i < 26 || !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) ? "" : "embedded";
        }
        return "auto";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$getComponents$3(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName != null ? safeValue(installerPackageName) : "";
    }

    private static String safeValue(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<Component<?>> getComponents() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(DefaultUserAgentPublisher.component());
        arrayList.add(DefaultHeartBeatController.component());
        arrayList.add(LibraryVersionComponent.create(FIREBASE_ANDROID, String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(LibraryVersionComponent.create(FIREBASE_COMMON, BuildConfig.VERSION_NAME));
        arrayList.add(LibraryVersionComponent.create(DEVICE_NAME, safeValue(Build.PRODUCT)));
        arrayList.add(LibraryVersionComponent.create(DEVICE_MODEL, safeValue(Build.DEVICE)));
        arrayList.add(LibraryVersionComponent.create(DEVICE_BRAND, safeValue(Build.BRAND)));
        arrayList.add(LibraryVersionComponent.fromContext(TARGET_SDK, new LibraryVersionComponent.VersionExtractor() { // from class: Uk
            /* JADX WARN: Invalid debug info offset */
            @Override // com.google.firebase.platforminfo.LibraryVersionComponent.VersionExtractor
            public final String extract(Object obj) {
                return null;
            }
        }));
        arrayList.add(LibraryVersionComponent.fromContext(MIN_SDK, new LibraryVersionComponent.VersionExtractor() { // from class: Vk
            /* JADX WARN: Invalid debug info offset */
            @Override // com.google.firebase.platforminfo.LibraryVersionComponent.VersionExtractor
            public final String extract(Object obj) {
                return null;
            }
        }));
        arrayList.add(LibraryVersionComponent.fromContext(ANDROID_PLATFORM, new LibraryVersionComponent.VersionExtractor() { // from class: Wk
            /* JADX WARN: Invalid debug info offset */
            @Override // com.google.firebase.platforminfo.LibraryVersionComponent.VersionExtractor
            public final String extract(Object obj) {
                return null;
            }
        }));
        arrayList.add(LibraryVersionComponent.fromContext(ANDROID_INSTALLER, new LibraryVersionComponent.VersionExtractor() { // from class: Xk
            /* JADX WARN: Invalid debug info offset */
            @Override // com.google.firebase.platforminfo.LibraryVersionComponent.VersionExtractor
            public final String extract(Object obj) {
                return null;
            }
        }));
        String strDetectVersion = KotlinDetector.detectVersion();
        if (strDetectVersion != null) {
            arrayList.add(LibraryVersionComponent.create(KOTLIN, strDetectVersion));
        }
        return arrayList;
    }
}
