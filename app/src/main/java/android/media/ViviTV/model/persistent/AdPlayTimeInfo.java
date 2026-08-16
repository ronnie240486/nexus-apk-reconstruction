package android.media.ViviTV.model.persistent;

import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import java.util.List;
import p000.C4875nU;

/* JADX INFO: loaded from: classes.dex */
public class AdPlayTimeInfo extends C4875nU implements Serializable {
    private String endTime;

    @JSONField(name = "name")
    private String name;
    private int scheduleId;
    private String startTime;

    @JSONField(name = "time")
    private String time;

    @JSONField(name = "timeList")
    private List<String> timeList;

    /* JADX WARN: Invalid debug info offset */
    public String getEndTime() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public String getName() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public int getScheduleId() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public String getStartTime() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public String getTime() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public List<String> getTimeList() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public void setEndTime(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setName(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setScheduleId(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setStartTime(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setTime(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setTimeList(List<String> list) {
    }
}
