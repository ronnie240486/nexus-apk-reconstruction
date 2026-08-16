package com.google.android.exoplayer2;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.ExoMediaCrypto;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.video.ColorInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.slf4j.impl.AndroidLoggerFactory;
import p000.C0978P9;

/* JADX INFO: loaded from: classes2.dex */
public final class Format implements Parcelable {
    public static final Parcelable.Creator<Format> CREATOR = new Parcelable.Creator<Format>() { // from class: com.google.android.exoplayer2.Format.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Format createFromParcel(Parcel parcel) {
            return new Format(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Format[] newArray(int i) {
            return new Format[i];
        }
    };
    public static final int NO_VALUE = -1;
    public static final long OFFSET_SAMPLE_RELATIVE = Long.MAX_VALUE;
    public final int accessibilityChannel;
    public final int bitrate;
    public final int channelCount;

    @Nullable
    public final String codecs;

    @Nullable
    public final ColorInfo colorInfo;

    @Nullable
    public final String containerMimeType;

    @Nullable
    public final DrmInitData drmInitData;
    public final int encoderDelay;
    public final int encoderPadding;

    @Nullable
    public final Class<? extends ExoMediaCrypto> exoMediaCryptoType;
    public final float frameRate;
    private int hashCode;
    public final int height;

    /* JADX INFO: renamed from: id */
    @Nullable
    public final String f11055id;
    public final List<byte[]> initializationData;

    @Nullable
    public final String label;

    @Nullable
    public final String language;
    public final int maxInputSize;

    @Nullable
    public final Metadata metadata;
    public final int pcmEncoding;
    public final float pixelWidthHeightRatio;

    @Nullable
    public final byte[] projectionData;
    public final int roleFlags;
    public final int rotationDegrees;

    @Nullable
    public final String sampleMimeType;
    public final int sampleRate;
    public final int selectionFlags;
    public final int stereoMode;
    public final long subsampleOffsetUs;
    public final int width;

    public Format(Parcel parcel) {
        this.f11055id = parcel.readString();
        this.label = parcel.readString();
        this.selectionFlags = parcel.readInt();
        this.roleFlags = parcel.readInt();
        this.bitrate = parcel.readInt();
        this.codecs = parcel.readString();
        this.metadata = (Metadata) parcel.readParcelable(Metadata.class.getClassLoader());
        this.containerMimeType = parcel.readString();
        this.sampleMimeType = parcel.readString();
        this.maxInputSize = parcel.readInt();
        int i = parcel.readInt();
        this.initializationData = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            this.initializationData.add(parcel.createByteArray());
        }
        this.drmInitData = (DrmInitData) parcel.readParcelable(DrmInitData.class.getClassLoader());
        this.subsampleOffsetUs = parcel.readLong();
        this.width = parcel.readInt();
        this.height = parcel.readInt();
        this.frameRate = parcel.readFloat();
        this.rotationDegrees = parcel.readInt();
        this.pixelWidthHeightRatio = parcel.readFloat();
        this.projectionData = Util.readBoolean(parcel) ? parcel.createByteArray() : null;
        this.stereoMode = parcel.readInt();
        this.colorInfo = (ColorInfo) parcel.readParcelable(ColorInfo.class.getClassLoader());
        this.channelCount = parcel.readInt();
        this.sampleRate = parcel.readInt();
        this.pcmEncoding = parcel.readInt();
        this.encoderDelay = parcel.readInt();
        this.encoderPadding = parcel.readInt();
        this.language = parcel.readString();
        this.accessibilityChannel = parcel.readInt();
        this.exoMediaCryptoType = null;
    }

    @Deprecated
    public static Format createAudioContainerFormat(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, int i, int i2, int i3, @Nullable List<byte[]> list, int i4, @Nullable String str5) {
        return createAudioContainerFormat(str, null, str2, str3, str4, null, i, i2, i3, list, i4, 0, str5);
    }

    public static Format createAudioSampleFormat(@Nullable String str, @Nullable String str2, @Nullable String str3, int i, int i2, int i3, int i4, int i5, int i6, int i7, @Nullable List<byte[]> list, @Nullable DrmInitData drmInitData, int i8, @Nullable String str4, @Nullable Metadata metadata) {
        return new Format(str, null, i8, 0, i, str3, metadata, null, str2, i2, list, drmInitData, Long.MAX_VALUE, -1, -1, -1.0f, -1, -1.0f, null, -1, null, i3, i4, i5, i6, i7, str4, -1, null);
    }

    @Deprecated
    public static Format createContainerFormat(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, int i, int i2, @Nullable String str5) {
        return createContainerFormat(str, null, str2, str3, str4, i, i2, 0, str5);
    }

    public static Format createImageSampleFormat(@Nullable String str, @Nullable String str2, @Nullable String str3, int i, int i2, @Nullable List<byte[]> list, @Nullable String str4, @Nullable DrmInitData drmInitData) {
        return new Format(str, null, i2, 0, i, str3, null, null, str2, -1, list, drmInitData, Long.MAX_VALUE, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, str4, -1, null);
    }

    public static Format createSampleFormat(@Nullable String str, @Nullable String str2, long j) {
        return new Format(str, null, 0, 0, -1, null, null, null, str2, -1, null, null, j, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, null, -1, null);
    }

    public static Format createTextContainerFormat(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, int i, int i2, int i3, @Nullable String str6) {
        return createTextContainerFormat(str, str2, str3, str4, str5, i, i2, i3, str6, -1);
    }

    public static Format createTextSampleFormat(@Nullable String str, @Nullable String str2, int i, @Nullable String str3) {
        return createTextSampleFormat(str, str2, i, str3, null);
    }

    @Deprecated
    public static Format createVideoContainerFormat(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, int i, int i2, int i3, float f, @Nullable List<byte[]> list, int i4) {
        return createVideoContainerFormat(str, null, str2, str3, str4, null, i, i2, i3, f, list, i4, 0);
    }

    public static Format createVideoSampleFormat(@Nullable String str, @Nullable String str2, @Nullable String str3, int i, int i2, int i3, int i4, float f, @Nullable List<byte[]> list, int i5, float f2, @Nullable DrmInitData drmInitData) {
        return createVideoSampleFormat(str, str2, str3, i, i2, i3, i4, f, list, i5, f2, null, -1, null, drmInitData);
    }

    public static String toLogString(@Nullable Format format) {
        if (format == null) {
            return AndroidLoggerFactory.f17234b;
        }
        StringBuilder sb = new StringBuilder("id=");
        sb.append(format.f11055id);
        sb.append(", mimeType=");
        sb.append(format.sampleMimeType);
        if (format.bitrate != -1) {
            sb.append(", bitrate=");
            sb.append(format.bitrate);
        }
        if (format.codecs != null) {
            sb.append(", codecs=");
            sb.append(format.codecs);
        }
        if (format.width != -1 && format.height != -1) {
            sb.append(", res=");
            sb.append(format.width);
            sb.append("x");
            sb.append(format.height);
        }
        if (format.frameRate != -1.0f) {
            sb.append(", fps=");
            sb.append(format.frameRate);
        }
        if (format.channelCount != -1) {
            sb.append(", channels=");
            sb.append(format.channelCount);
        }
        if (format.sampleRate != -1) {
            sb.append(", sample_rate=");
            sb.append(format.sampleRate);
        }
        if (format.language != null) {
            sb.append(", language=");
            sb.append(format.language);
        }
        if (format.label != null) {
            sb.append(", label=");
            sb.append(format.label);
        }
        return sb.toString();
    }

    public Format copyWithAdjustments(@Nullable DrmInitData drmInitData, @Nullable Metadata metadata) {
        if (drmInitData == this.drmInitData && metadata == this.metadata) {
            return this;
        }
        return new Format(this.f11055id, this.label, this.selectionFlags, this.roleFlags, this.bitrate, this.codecs, metadata, this.containerMimeType, this.sampleMimeType, this.maxInputSize, this.initializationData, drmInitData, this.subsampleOffsetUs, this.width, this.height, this.frameRate, this.rotationDegrees, this.pixelWidthHeightRatio, this.projectionData, this.stereoMode, this.colorInfo, this.channelCount, this.sampleRate, this.pcmEncoding, this.encoderDelay, this.encoderPadding, this.language, this.accessibilityChannel, this.exoMediaCryptoType);
    }

    public Format copyWithBitrate(int i) {
        return new Format(this.f11055id, this.label, this.selectionFlags, this.roleFlags, i, this.codecs, this.metadata, this.containerMimeType, this.sampleMimeType, this.maxInputSize, this.initializationData, this.drmInitData, this.subsampleOffsetUs, this.width, this.height, this.frameRate, this.rotationDegrees, this.pixelWidthHeightRatio, this.projectionData, this.stereoMode, this.colorInfo, this.channelCount, this.sampleRate, this.pcmEncoding, this.encoderDelay, this.encoderPadding, this.language, this.accessibilityChannel, this.exoMediaCryptoType);
    }

    public Format copyWithContainerInfo(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Metadata metadata, int i, int i2, int i3, int i4, int i5, @Nullable String str5) {
        Metadata metadata2 = this.metadata;
        return new Format(str, str2, i5, this.roleFlags, i, str4, metadata2 != null ? metadata2.copyWithAppendedEntriesFrom(metadata) : metadata, this.containerMimeType, str3, this.maxInputSize, this.initializationData, this.drmInitData, this.subsampleOffsetUs, i2, i3, this.frameRate, this.rotationDegrees, this.pixelWidthHeightRatio, this.projectionData, this.stereoMode, this.colorInfo, i4, this.sampleRate, this.pcmEncoding, this.encoderDelay, this.encoderPadding, str5, this.accessibilityChannel, this.exoMediaCryptoType);
    }

    public Format copyWithDrmInitData(@Nullable DrmInitData drmInitData) {
        return copyWithAdjustments(drmInitData, this.metadata);
    }

    public Format copyWithExoMediaCryptoType(@Nullable Class<? extends ExoMediaCrypto> cls) {
        return new Format(this.f11055id, this.label, this.selectionFlags, this.roleFlags, this.bitrate, this.codecs, this.metadata, this.containerMimeType, this.sampleMimeType, this.maxInputSize, this.initializationData, this.drmInitData, this.subsampleOffsetUs, this.width, this.height, this.frameRate, this.rotationDegrees, this.pixelWidthHeightRatio, this.projectionData, this.stereoMode, this.colorInfo, this.channelCount, this.sampleRate, this.pcmEncoding, this.encoderDelay, this.encoderPadding, this.language, this.accessibilityChannel, cls);
    }

    public Format copyWithFrameRate(float f) {
        return new Format(this.f11055id, this.label, this.selectionFlags, this.roleFlags, this.bitrate, this.codecs, this.metadata, this.containerMimeType, this.sampleMimeType, this.maxInputSize, this.initializationData, this.drmInitData, this.subsampleOffsetUs, this.width, this.height, f, this.rotationDegrees, this.pixelWidthHeightRatio, this.projectionData, this.stereoMode, this.colorInfo, this.channelCount, this.sampleRate, this.pcmEncoding, this.encoderDelay, this.encoderPadding, this.language, this.accessibilityChannel, this.exoMediaCryptoType);
    }

    public Format copyWithGaplessInfo(int i, int i2) {
        return new Format(this.f11055id, this.label, this.selectionFlags, this.roleFlags, this.bitrate, this.codecs, this.metadata, this.containerMimeType, this.sampleMimeType, this.maxInputSize, this.initializationData, this.drmInitData, this.subsampleOffsetUs, this.width, this.height, this.frameRate, this.rotationDegrees, this.pixelWidthHeightRatio, this.projectionData, this.stereoMode, this.colorInfo, this.channelCount, this.sampleRate, this.pcmEncoding, i, i2, this.language, this.accessibilityChannel, this.exoMediaCryptoType);
    }

    public Format copyWithLabel(@Nullable String str) {
        return new Format(this.f11055id, str, this.selectionFlags, this.roleFlags, this.bitrate, this.codecs, this.metadata, this.containerMimeType, this.sampleMimeType, this.maxInputSize, this.initializationData, this.drmInitData, this.subsampleOffsetUs, this.width, this.height, this.frameRate, this.rotationDegrees, this.pixelWidthHeightRatio, this.projectionData, this.stereoMode, this.colorInfo, this.channelCount, this.sampleRate, this.pcmEncoding, this.encoderDelay, this.encoderPadding, this.language, this.accessibilityChannel, this.exoMediaCryptoType);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0044  */
    public Format copyWithManifestFormatInfo(Format format) {
        String str;
        String str2;
        if (this == format) {
            return this;
        }
        int trackType = MimeTypes.getTrackType(this.sampleMimeType);
        String str3 = format.f11055id;
        String str4 = format.label;
        if (str4 == null) {
            str4 = this.label;
        }
        String str5 = str4;
        String str6 = ((trackType == 3 || trackType == 1) && (str = format.language) != null) ? str : this.language;
        int i = this.bitrate;
        if (i == -1) {
            i = format.bitrate;
        }
        int i2 = i;
        String str7 = this.codecs;
        if (str7 == null) {
            String codecsOfType = Util.getCodecsOfType(format.codecs, trackType);
            if (Util.splitCodecs(codecsOfType).length == 1) {
                str2 = codecsOfType;
            } else {
                str2 = str7;
            }
        } else {
            str2 = str7;
        }
        Metadata metadata = this.metadata;
        Metadata metadataCopyWithAppendedEntriesFrom = metadata == null ? format.metadata : metadata.copyWithAppendedEntriesFrom(format.metadata);
        float f = this.frameRate;
        return new Format(str3, str5, this.selectionFlags | format.selectionFlags, this.roleFlags | format.roleFlags, i2, str2, metadataCopyWithAppendedEntriesFrom, this.containerMimeType, this.sampleMimeType, this.maxInputSize, this.initializationData, DrmInitData.createSessionCreationData(format.drmInitData, this.drmInitData), this.subsampleOffsetUs, this.width, this.height, (f == -1.0f && trackType == 2) ? format.frameRate : f, this.rotationDegrees, this.pixelWidthHeightRatio, this.projectionData, this.stereoMode, this.colorInfo, this.channelCount, this.sampleRate, this.pcmEncoding, this.encoderDelay, this.encoderPadding, str6, this.accessibilityChannel, this.exoMediaCryptoType);
    }

    public Format copyWithMaxInputSize(int i) {
        return new Format(this.f11055id, this.label, this.selectionFlags, this.roleFlags, this.bitrate, this.codecs, this.metadata, this.containerMimeType, this.sampleMimeType, i, this.initializationData, this.drmInitData, this.subsampleOffsetUs, this.width, this.height, this.frameRate, this.rotationDegrees, this.pixelWidthHeightRatio, this.projectionData, this.stereoMode, this.colorInfo, this.channelCount, this.sampleRate, this.pcmEncoding, this.encoderDelay, this.encoderPadding, this.language, this.accessibilityChannel, this.exoMediaCryptoType);
    }

    public Format copyWithMetadata(@Nullable Metadata metadata) {
        return copyWithAdjustments(this.drmInitData, metadata);
    }

    public Format copyWithRotationDegrees(int i) {
        return new Format(this.f11055id, this.label, this.selectionFlags, this.roleFlags, this.bitrate, this.codecs, this.metadata, this.containerMimeType, this.sampleMimeType, this.maxInputSize, this.initializationData, this.drmInitData, this.subsampleOffsetUs, this.width, this.height, this.frameRate, i, this.pixelWidthHeightRatio, this.projectionData, this.stereoMode, this.colorInfo, this.channelCount, this.sampleRate, this.pcmEncoding, this.encoderDelay, this.encoderPadding, this.language, this.accessibilityChannel, this.exoMediaCryptoType);
    }

    public Format copyWithSubsampleOffsetUs(long j) {
        return new Format(this.f11055id, this.label, this.selectionFlags, this.roleFlags, this.bitrate, this.codecs, this.metadata, this.containerMimeType, this.sampleMimeType, this.maxInputSize, this.initializationData, this.drmInitData, j, this.width, this.height, this.frameRate, this.rotationDegrees, this.pixelWidthHeightRatio, this.projectionData, this.stereoMode, this.colorInfo, this.channelCount, this.sampleRate, this.pcmEncoding, this.encoderDelay, this.encoderPadding, this.language, this.accessibilityChannel, this.exoMediaCryptoType);
    }

    public Format copyWithVideoSize(int i, int i2) {
        return new Format(this.f11055id, this.label, this.selectionFlags, this.roleFlags, this.bitrate, this.codecs, this.metadata, this.containerMimeType, this.sampleMimeType, this.maxInputSize, this.initializationData, this.drmInitData, this.subsampleOffsetUs, i, i2, this.frameRate, this.rotationDegrees, this.pixelWidthHeightRatio, this.projectionData, this.stereoMode, this.colorInfo, this.channelCount, this.sampleRate, this.pcmEncoding, this.encoderDelay, this.encoderPadding, this.language, this.accessibilityChannel, this.exoMediaCryptoType);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj == null || Format.class != obj.getClass()) {
            return false;
        }
        Format format = (Format) obj;
        int i2 = this.hashCode;
        return (i2 == 0 || (i = format.hashCode) == 0 || i2 == i) && this.selectionFlags == format.selectionFlags && this.roleFlags == format.roleFlags && this.bitrate == format.bitrate && this.maxInputSize == format.maxInputSize && this.subsampleOffsetUs == format.subsampleOffsetUs && this.width == format.width && this.height == format.height && this.rotationDegrees == format.rotationDegrees && this.stereoMode == format.stereoMode && this.channelCount == format.channelCount && this.sampleRate == format.sampleRate && this.pcmEncoding == format.pcmEncoding && this.encoderDelay == format.encoderDelay && this.encoderPadding == format.encoderPadding && this.accessibilityChannel == format.accessibilityChannel && Float.compare(this.frameRate, format.frameRate) == 0 && Float.compare(this.pixelWidthHeightRatio, format.pixelWidthHeightRatio) == 0 && Util.areEqual(this.exoMediaCryptoType, format.exoMediaCryptoType) && Util.areEqual(this.f11055id, format.f11055id) && Util.areEqual(this.label, format.label) && Util.areEqual(this.codecs, format.codecs) && Util.areEqual(this.containerMimeType, format.containerMimeType) && Util.areEqual(this.sampleMimeType, format.sampleMimeType) && Util.areEqual(this.language, format.language) && Arrays.equals(this.projectionData, format.projectionData) && Util.areEqual(this.metadata, format.metadata) && Util.areEqual(this.colorInfo, format.colorInfo) && Util.areEqual(this.drmInitData, format.drmInitData) && initializationDataEquals(format);
    }

    public int getPixelCount() {
        int i;
        int i2 = this.width;
        if (i2 == -1 || (i = this.height) == -1) {
            return -1;
        }
        return i2 * i;
    }

    public int hashCode() {
        if (this.hashCode == 0) {
            String str = this.f11055id;
            int iHashCode = (527 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.label;
            int iHashCode2 = (((((((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.selectionFlags) * 31) + this.roleFlags) * 31) + this.bitrate) * 31;
            String str3 = this.codecs;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Metadata metadata = this.metadata;
            int iHashCode4 = (iHashCode3 + (metadata == null ? 0 : metadata.hashCode())) * 31;
            String str4 = this.containerMimeType;
            int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.sampleMimeType;
            int iFloatToIntBits = (((((((((((((Float.floatToIntBits(this.pixelWidthHeightRatio) + ((((Float.floatToIntBits(this.frameRate) + ((((((((((iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.maxInputSize) * 31) + ((int) this.subsampleOffsetUs)) * 31) + this.width) * 31) + this.height) * 31)) * 31) + this.rotationDegrees) * 31)) * 31) + this.stereoMode) * 31) + this.channelCount) * 31) + this.sampleRate) * 31) + this.pcmEncoding) * 31) + this.encoderDelay) * 31) + this.encoderPadding) * 31;
            String str6 = this.language;
            int iHashCode6 = (((iFloatToIntBits + (str6 == null ? 0 : str6.hashCode())) * 31) + this.accessibilityChannel) * 31;
            Class<? extends ExoMediaCrypto> cls = this.exoMediaCryptoType;
            this.hashCode = iHashCode6 + (cls != null ? cls.hashCode() : 0);
        }
        return this.hashCode;
    }

    public boolean initializationDataEquals(Format format) {
        if (this.initializationData.size() != format.initializationData.size()) {
            return false;
        }
        for (int i = 0; i < this.initializationData.size(); i++) {
            if (!Arrays.equals(this.initializationData.get(i), format.initializationData.get(i))) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Format(");
        sb.append(this.f11055id);
        sb.append(", ");
        sb.append(this.label);
        sb.append(", ");
        sb.append(this.containerMimeType);
        sb.append(", ");
        sb.append(this.sampleMimeType);
        sb.append(", ");
        sb.append(this.codecs);
        sb.append(", ");
        sb.append(this.bitrate);
        sb.append(", ");
        sb.append(this.language);
        sb.append(", [");
        sb.append(this.width);
        sb.append(", ");
        sb.append(this.height);
        sb.append(", ");
        sb.append(this.frameRate);
        sb.append("], [");
        sb.append(this.channelCount);
        sb.append(", ");
        return C0978P9.m4377a(sb, this.sampleRate, "])");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f11055id);
        parcel.writeString(this.label);
        parcel.writeInt(this.selectionFlags);
        parcel.writeInt(this.roleFlags);
        parcel.writeInt(this.bitrate);
        parcel.writeString(this.codecs);
        parcel.writeParcelable(this.metadata, 0);
        parcel.writeString(this.containerMimeType);
        parcel.writeString(this.sampleMimeType);
        parcel.writeInt(this.maxInputSize);
        int size = this.initializationData.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeByteArray(this.initializationData.get(i2));
        }
        parcel.writeParcelable(this.drmInitData, 0);
        parcel.writeLong(this.subsampleOffsetUs);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeFloat(this.frameRate);
        parcel.writeInt(this.rotationDegrees);
        parcel.writeFloat(this.pixelWidthHeightRatio);
        Util.writeBoolean(parcel, this.projectionData != null);
        byte[] bArr = this.projectionData;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
        parcel.writeInt(this.stereoMode);
        parcel.writeParcelable(this.colorInfo, i);
        parcel.writeInt(this.channelCount);
        parcel.writeInt(this.sampleRate);
        parcel.writeInt(this.pcmEncoding);
        parcel.writeInt(this.encoderDelay);
        parcel.writeInt(this.encoderPadding);
        parcel.writeString(this.language);
        parcel.writeInt(this.accessibilityChannel);
    }

    public Format(@Nullable String str, @Nullable String str2, int i, int i2, int i3, @Nullable String str3, @Nullable Metadata metadata, @Nullable String str4, @Nullable String str5, int i4, @Nullable List<byte[]> list, @Nullable DrmInitData drmInitData, long j, int i5, int i6, float f, int i7, float f2, @Nullable byte[] bArr, int i8, @Nullable ColorInfo colorInfo, int i9, int i10, int i11, int i12, int i13, @Nullable String str6, int i14, @Nullable Class<? extends ExoMediaCrypto> cls) {
        this.f11055id = str;
        this.label = str2;
        this.selectionFlags = i;
        this.roleFlags = i2;
        this.bitrate = i3;
        this.codecs = str3;
        this.metadata = metadata;
        this.containerMimeType = str4;
        this.sampleMimeType = str5;
        this.maxInputSize = i4;
        this.initializationData = list == null ? Collections.emptyList() : list;
        this.drmInitData = drmInitData;
        this.subsampleOffsetUs = j;
        this.width = i5;
        this.height = i6;
        this.frameRate = f;
        int i15 = i7;
        this.rotationDegrees = i15 == -1 ? 0 : i15;
        this.pixelWidthHeightRatio = f2 == -1.0f ? 1.0f : f2;
        this.projectionData = bArr;
        this.stereoMode = i8;
        this.colorInfo = colorInfo;
        this.channelCount = i9;
        this.sampleRate = i10;
        this.pcmEncoding = i11;
        int i16 = i12;
        this.encoderDelay = i16 == -1 ? 0 : i16;
        this.encoderPadding = i13 != -1 ? i13 : 0;
        this.language = Util.normalizeLanguageCode(str6);
        this.accessibilityChannel = i14;
        this.exoMediaCryptoType = cls;
    }

    public static Format createAudioContainerFormat(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Metadata metadata, int i, int i2, int i3, @Nullable List<byte[]> list, int i4, int i5, @Nullable String str6) {
        return new Format(str, str2, i4, i5, i, str5, metadata, str3, str4, -1, list, null, Long.MAX_VALUE, -1, -1, -1.0f, -1, -1.0f, null, -1, null, i2, i3, -1, -1, -1, str6, -1, null);
    }

    public static Format createAudioSampleFormat(@Nullable String str, @Nullable String str2, @Nullable String str3, int i, int i2, int i3, int i4, int i5, @Nullable List<byte[]> list, @Nullable DrmInitData drmInitData, int i6, @Nullable String str4) {
        return createAudioSampleFormat(str, str2, str3, i, i2, i3, i4, i5, -1, -1, list, drmInitData, i6, str4, null);
    }

    public static Format createContainerFormat(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, int i, int i2, int i3, @Nullable String str6) {
        return new Format(str, str2, i2, i3, i, str5, null, str3, str4, -1, null, null, Long.MAX_VALUE, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, str6, -1, null);
    }

    public static Format createSampleFormat(@Nullable String str, @Nullable String str2, @Nullable String str3, int i, @Nullable DrmInitData drmInitData) {
        return new Format(str, null, 0, 0, i, str3, null, null, str2, -1, null, drmInitData, Long.MAX_VALUE, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, null, -1, null);
    }

    public static Format createTextContainerFormat(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, int i, int i2, int i3, @Nullable String str6, int i4) {
        return new Format(str, str2, i2, i3, i, str5, null, str3, str4, -1, null, null, Long.MAX_VALUE, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, str6, i4, null);
    }

    public static Format createTextSampleFormat(@Nullable String str, @Nullable String str2, int i, @Nullable String str3, @Nullable DrmInitData drmInitData) {
        return createTextSampleFormat(str, str2, null, -1, i, str3, -1, drmInitData, Long.MAX_VALUE, Collections.emptyList());
    }

    public static Format createVideoContainerFormat(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Metadata metadata, int i, int i2, int i3, float f, @Nullable List<byte[]> list, int i4, int i5) {
        return new Format(str, str2, i4, i5, i, str5, metadata, str3, str4, -1, list, null, Long.MAX_VALUE, i2, i3, f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, null, -1, null);
    }

    public static Format createVideoSampleFormat(@Nullable String str, @Nullable String str2, @Nullable String str3, int i, int i2, int i3, int i4, float f, @Nullable List<byte[]> list, int i5, float f2, @Nullable byte[] bArr, int i6, @Nullable ColorInfo colorInfo, @Nullable DrmInitData drmInitData) {
        return new Format(str, null, 0, 0, i, str3, null, null, str2, i2, list, drmInitData, Long.MAX_VALUE, i3, i4, f, i5, f2, bArr, i6, colorInfo, -1, -1, -1, -1, -1, null, -1, null);
    }

    public static Format createAudioSampleFormat(@Nullable String str, @Nullable String str2, @Nullable String str3, int i, int i2, int i3, int i4, @Nullable List<byte[]> list, @Nullable DrmInitData drmInitData, int i5, @Nullable String str4) {
        return createAudioSampleFormat(str, str2, str3, i, i2, i3, i4, -1, list, drmInitData, i5, str4);
    }

    public static Format createTextSampleFormat(@Nullable String str, @Nullable String str2, @Nullable String str3, int i, int i2, @Nullable String str4, int i3, @Nullable DrmInitData drmInitData) {
        return createTextSampleFormat(str, str2, str3, i, i2, str4, i3, drmInitData, Long.MAX_VALUE, Collections.emptyList());
    }

    public static Format createVideoSampleFormat(@Nullable String str, @Nullable String str2, @Nullable String str3, int i, int i2, int i3, int i4, float f, @Nullable List<byte[]> list, @Nullable DrmInitData drmInitData) {
        return createVideoSampleFormat(str, str2, str3, i, i2, i3, i4, f, list, -1, -1.0f, drmInitData);
    }

    public static Format createTextSampleFormat(@Nullable String str, @Nullable String str2, @Nullable String str3, int i, int i2, @Nullable String str4, int i3, @Nullable DrmInitData drmInitData, long j, @Nullable List<byte[]> list) {
        return new Format(str, null, i2, 0, i, str3, null, null, str2, -1, list, drmInitData, j, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, str4, i3, null);
    }

    public static Format createTextSampleFormat(@Nullable String str, @Nullable String str2, @Nullable String str3, int i, int i2, @Nullable String str4, @Nullable DrmInitData drmInitData, long j) {
        return createTextSampleFormat(str, str2, str3, i, i2, str4, -1, drmInitData, j, Collections.emptyList());
    }
}
