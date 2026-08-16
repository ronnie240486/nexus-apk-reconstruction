package android.media.ViviTV.p001ad.model;

import java.io.Serializable;
import java.util.List;
import p000.InterfaceC4834mq;

/* JADX INFO: loaded from: classes.dex */
public class BaseAdInfo implements InterfaceC4834mq, Serializable {
    private static int DURATION_DEFAULT = 3;
    private String content;
    private int duration;
    private int location;

    /* JADX INFO: renamed from: sn */
    private String f5540sn;
    private float transparency;

    /* JADX WARN: Invalid debug info offset */
    public BaseAdInfo() {
    }

    /* JADX WARN: Invalid debug info offset */
    public BaseAdInfo(String str, String str2, int i, float f) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static int getTotalDuration(List<? extends InterfaceC4834mq> list) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public String getContent() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public int getDuration() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC4834mq
    public int getDurationSeconds() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public int getLocation() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC4834mq
    public String getSN() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public String getSn() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public float getTransparency() {
        return 0.0f;
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean hasSameSnWith(BaseAdInfo baseAdInfo) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public void setContent(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setDuration(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setLocation(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setSn(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setTransparency(float f) {
    }
}
