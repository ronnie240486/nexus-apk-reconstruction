package android.media.ViviTV.model.persistent;

import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import p000.C4875nU;
import p000.InterfaceC4679kV;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC4679kV
public class AdMaterialInfo extends C4875nU implements Serializable {

    @JSONField(name = "DownloadFile")
    private String downloadFile;

    @JSONField(name = "DownloadUrl")
    private String downloadUrl;

    @JSONField(name = "Duration")
    private int duration;
    private String hash;

    @JSONField(name = "MaterialName")
    private String materialName;

    @JSONField(name = "MaterialType")
    private int materialType;

    @JSONField(name = "MaterialsId")
    private int materialsId;
    private int programId;
    private String saveFileName;

    @JSONField(name = "SortNum")
    private int sortNum;

    /* JADX WARN: Invalid debug info offset */
    public String getDownloadUrl() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public int getDuration() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public String getHash() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public String getMaterialName() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public int getMaterialType() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public int getMaterialsId() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public int getProgramId() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public int getSortNum() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public void setDownloadFile(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setDownloadUrl(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setDuration(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setHash(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setMaterialName(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setMaterialType(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setMaterialsId(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setProgramId(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setSaveFileName(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setSortNum(int i) {
    }
}
