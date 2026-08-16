package android.media.ViviTV.model.persistent;

import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import java.util.List;
import p000.C4875nU;

/* JADX INFO: loaded from: classes.dex */
public class AdProgramInfo extends C4875nU implements Serializable {

    @JSONField(name = "Materials")
    private List<AdMaterialInfo> materials;

    @JSONField(name = "ProgramId")
    private int programId;
    private int scheduleId;

    /* JADX WARN: Invalid debug info offset */
    public List<AdMaterialInfo> getMaterials() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public int getProgramId() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public int getScheduleId() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public void setMaterials(List<AdMaterialInfo> list) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setProgramId(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setScheduleId(int i) {
    }
}
