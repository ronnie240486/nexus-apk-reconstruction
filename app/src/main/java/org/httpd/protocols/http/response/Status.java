package org.httpd.protocols.http.response;

import android.media.ViviTV.fragmens.VodPlayFragment;
import com.tencent.smtt.sdk.TbsListener;

/* JADX INFO: loaded from: classes2.dex */
public enum Status implements IStatus {
    SWITCH_PROTOCOL(101, "Switching Protocols"),
    OK(200, "OK"),
    CREATED(201, "Created"),
    ACCEPTED(202, "Accepted"),
    NO_CONTENT(204, "No Content"),
    PARTIAL_CONTENT(206, "Partial Content"),
    MULTI_STATUS(TbsListener.ErrorCode.UNZIP_OTHER_ERROR, "Multi-Status"),
    REDIRECT(VodPlayFragment.f8484m3, "Moved Permanently"),
    FOUND(302, "Found"),
    REDIRECT_SEE_OTHER(TbsListener.ErrorCode.ERROR_UNMATCH_TBSCORE_VER, "See Other"),
    NOT_MODIFIED(VodPlayFragment.f8485n3, "Not Modified"),
    TEMPORARY_REDIRECT(307, "Temporary Redirect"),
    BAD_REQUEST(TbsListener.ErrorCode.INFO_CODE_BASE, "Bad Request"),
    UNAUTHORIZED(TbsListener.ErrorCode.INFO_FORCE_SYSTEM_WEBVIEW_INNER, "Unauthorized"),
    FORBIDDEN(TbsListener.ErrorCode.INFO_MISS_SDKEXTENSION_JAR, "Forbidden"),
    NOT_FOUND(TbsListener.ErrorCode.INFO_CORE_NOT_EXIST, "Not Found"),
    METHOD_NOT_ALLOWED(TbsListener.ErrorCode.INFO_CAN_NOT_LOAD_TBS, "Method Not Allowed"),
    NOT_ACCEPTABLE(TbsListener.ErrorCode.INFO_MISS_SDKEXTENSION_JAR_OLD, "Not Acceptable"),
    REQUEST_TIMEOUT(TbsListener.ErrorCode.INFO_CAN_NOT_DISABLED_BY_CRASH, "Request Timeout"),
    CONFLICT(TbsListener.ErrorCode.INFO_CAN_NOT_USE_X5_TBS_AVAILABLE, "Conflict"),
    GONE(TbsListener.ErrorCode.INFO_CAN_NOT_USE_X5_TBS_NOTAVAILABLE, "Gone"),
    LENGTH_REQUIRED(TbsListener.ErrorCode.INFO_CAN_NOT_USE_X5_FINAL_REASON, "Length Required"),
    PRECONDITION_FAILED(TbsListener.ErrorCode.INFO_MISS_SDKEXTENSION_JAR_WITHOUT_FUSION_DEX, "Precondition Failed"),
    PAYLOAD_TOO_LARGE(TbsListener.ErrorCode.INFO_MISS_SDKEXTENSION_JAR_WITH_FUSION_DEX, "Payload Too Large"),
    UNSUPPORTED_MEDIA_TYPE(TbsListener.ErrorCode.INFO_INITX5_FALSE_DEFAULT, "Unsupported Media Type"),
    RANGE_NOT_SATISFIABLE(TbsListener.ErrorCode.INFO_USE_BACKUP_FILE_INSTALL_BY_SERVER, "Requested Range Not Satisfiable"),
    EXPECTATION_FAILED(TbsListener.ErrorCode.INFO_TEMP_CORE_EXIST_CONF_ERROR, "Expectation Failed"),
    TOO_MANY_REQUESTS(429, "Too Many Requests"),
    INTERNAL_ERROR(500, "Internal Server Error"),
    NOT_IMPLEMENTED(501, "Not Implemented"),
    SERVICE_UNAVAILABLE(503, "Service Unavailable"),
    UNSUPPORTED_HTTP_VERSION(TbsListener.ErrorCode.INFO_CODE_FILEREADER_OPENFILEREADER_COUNTS, "HTTP Version Not Supported");

    private final String description;
    private final int requestStatus;

    Status(int i, String str) {
        this.requestStatus = i;
        this.description = str;
    }

    public static Status lookup(int i) {
        for (Status status : values()) {
            if (status.getRequestStatus() == i) {
                return status;
            }
        }
        return null;
    }

    @Override // org.httpd.protocols.http.response.IStatus
    public String getDescription() {
        return "" + this.requestStatus + " " + this.description;
    }

    @Override // org.httpd.protocols.http.response.IStatus
    public int getRequestStatus() {
        return this.requestStatus;
    }
}
