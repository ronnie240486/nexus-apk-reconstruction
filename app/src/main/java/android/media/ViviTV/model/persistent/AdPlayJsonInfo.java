package android.media.ViviTV.model.persistent;

import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import java.util.List;
import p000.C4875nU;

/* JADX INFO: loaded from: classes.dex */
public class AdPlayJsonInfo extends C4875nU implements Serializable {

    @JSONField(name = "PlayPeriod")
    private String playPeriod;

    @JSONField(name = "playPeriodList")
    private List<String> playPeriodList;

    @JSONField(name = "PlayTimes")
    private List<AdPlayTimeInfo> playTimes;
    private int scheduleId;

    /* JADX WARN: Invalid debug info offset */
    public String getPlayPeriod() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public List<String> getPlayPeriodList() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public List<AdPlayTimeInfo> getPlayTimes() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public int getScheduleId() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public void setPlayPeriod(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setPlayPeriodList(List<String> list) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setPlayTimes(List<AdPlayTimeInfo> list) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setScheduleId(int i) {
    }
}
