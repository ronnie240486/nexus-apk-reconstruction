package androidx.media;

import android.content.Context;
import androidx.annotation.RequiresApi;
import androidx.core.util.ObjectsCompat;
import p000.C0914OB;
import p000.C0980PB;
import p000.C1045QB;
import p000.C1107RB;
import p000.C1170SB;
import p000.C1235TB;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(28)
class MediaSessionManagerImplApi28 extends MediaSessionManagerImplApi21 {
    android.media.session.MediaSessionManager mObject;

    public static final class RemoteUserInfoImplApi28 implements MediaSessionManager.RemoteUserInfoImpl {
        final android.media.session.MediaSessionManager.RemoteUserInfo mObject;

        public RemoteUserInfoImplApi28(android.media.session.MediaSessionManager.RemoteUserInfo remoteUserInfo) {
            this.mObject = remoteUserInfo;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof RemoteUserInfoImplApi28) {
                return C1107RB.m4973a(this.mObject, ((RemoteUserInfoImplApi28) obj).mObject);
            }
            return false;
        }

        @Override // androidx.media.MediaSessionManager.RemoteUserInfoImpl
        public String getPackageName() {
            return C1235TB.m5767a(this.mObject);
        }

        @Override // androidx.media.MediaSessionManager.RemoteUserInfoImpl
        public int getPid() {
            return C1045QB.m4605a(this.mObject);
        }

        @Override // androidx.media.MediaSessionManager.RemoteUserInfoImpl
        public int getUid() {
            return C1170SB.m5464a(this.mObject);
        }

        public int hashCode() {
            return ObjectsCompat.hash(this.mObject);
        }

        public RemoteUserInfoImplApi28(String str, int i, int i2) {
            this.mObject = new android.media.session.MediaSessionManager.RemoteUserInfo(str, i, i2);
        }
    }

    public MediaSessionManagerImplApi28(Context context) {
        super(context);
        this.mObject = C0980PB.m4379a(context.getSystemService("media_session"));
    }

    @Override // androidx.media.MediaSessionManagerImplApi21, androidx.media.MediaSessionManagerImplBase, androidx.media.MediaSessionManager.MediaSessionManagerImpl
    public boolean isTrustedForMediaControl(MediaSessionManager.RemoteUserInfoImpl remoteUserInfoImpl) {
        if (remoteUserInfoImpl instanceof RemoteUserInfoImplApi28) {
            return C0914OB.m4232a(this.mObject, ((RemoteUserInfoImplApi28) remoteUserInfoImpl).mObject);
        }
        return false;
    }
}
