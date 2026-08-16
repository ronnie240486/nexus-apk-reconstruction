package android.media.ViviTV.model.persistent;

import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import java.util.List;
import p000.C4875nU;
import p000.InterfaceC4679kV;
import p000.InterfaceC5617vr;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC4679kV
public class AdScheduleInfo extends C4875nU implements Serializable {

    @JSONField(name = "DeviceGroupId")
    private String deviceGroupId;

    @JSONField(name = "EndDate")
    private String endDate;

    @JSONField(name = "LoopPlayBack")
    private int loopPlayBack;

    @JSONField(name = "PlayJson")
    private String playJson;
    private AdPlayJsonInfo playJsonInfo;

    @JSONField(name = "PlayPeriod")
    private String playPeriod;

    @JSONField(name = "ProgramList")
    @InterfaceC5617vr
    private List<AdProgramInfo> programList;

    @JSONField(name = "ProgramListId")
    private String programListId;

    @JSONField(name = "ScheduleId")
    private int scheduleId;

    @JSONField(name = "ScheduleName")
    private String scheduleName;

    @JSONField(name = "StartDate")
    private String startDate;

    /* JADX WARN: Invalid debug info offset */
    public static String getDateToString(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public String getDeviceGroupId() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public String getEndDate() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public int getLoopPlayBack() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public String getPlayJson() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public AdPlayJsonInfo getPlayJsonInfo() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public String getPlayPeriod() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public List<AdProgramInfo> getProgramList() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public String getProgramListId() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public int getScheduleId() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public String getScheduleName() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public String getStartDate() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public void setDeviceGroupId(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setEndDate(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setLoopPlayBack(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setPlayJson(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setPlayJsonInfo(AdPlayJsonInfo adPlayJsonInfo) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setPlayPeriod(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setProgramList(List<AdProgramInfo> list) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setProgramListId(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setScheduleId(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setScheduleName(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setStartDate(String str) {
    }
}
