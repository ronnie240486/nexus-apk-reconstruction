package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import p000.C0786MA;
import p000.C4515i2;

/* JADX INFO: loaded from: classes2.dex */
final class AutoValue_CrashlyticsReport_Session_Device extends CrashlyticsReport.Session.Device {
    private final int arch;
    private final int cores;
    private final long diskSpace;
    private final String manufacturer;
    private final String model;
    private final String modelClass;
    private final long ram;
    private final boolean simulator;
    private final int state;

    public static final class Builder extends CrashlyticsReport.Session.Device.Builder {
        private Integer arch;
        private Integer cores;
        private Long diskSpace;
        private String manufacturer;
        private String model;
        private String modelClass;
        private Long ram;
        private Boolean simulator;
        private Integer state;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder
        public CrashlyticsReport.Session.Device build() {
            String strM21289a = this.arch == null ? " arch" : "";
            if (this.model == null) {
                strM21289a = C4515i2.m21289a(strM21289a, " model");
            }
            if (this.cores == null) {
                strM21289a = C4515i2.m21289a(strM21289a, " cores");
            }
            if (this.ram == null) {
                strM21289a = C4515i2.m21289a(strM21289a, " ram");
            }
            if (this.diskSpace == null) {
                strM21289a = C4515i2.m21289a(strM21289a, " diskSpace");
            }
            if (this.simulator == null) {
                strM21289a = C4515i2.m21289a(strM21289a, " simulator");
            }
            if (this.state == null) {
                strM21289a = C4515i2.m21289a(strM21289a, " state");
            }
            if (this.manufacturer == null) {
                strM21289a = C4515i2.m21289a(strM21289a, " manufacturer");
            }
            if (this.modelClass == null) {
                strM21289a = C4515i2.m21289a(strM21289a, " modelClass");
            }
            if (strM21289a.isEmpty()) {
                return new AutoValue_CrashlyticsReport_Session_Device(this.arch.intValue(), this.model, this.cores.intValue(), this.ram.longValue(), this.diskSpace.longValue(), this.simulator.booleanValue(), this.state.intValue(), this.manufacturer, this.modelClass);
            }
            throw new IllegalStateException("Missing required properties:".concat(strM21289a));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder
        public CrashlyticsReport.Session.Device.Builder setArch(int i) {
            this.arch = Integer.valueOf(i);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder
        public CrashlyticsReport.Session.Device.Builder setCores(int i) {
            this.cores = Integer.valueOf(i);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder
        public CrashlyticsReport.Session.Device.Builder setDiskSpace(long j) {
            this.diskSpace = Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder
        public CrashlyticsReport.Session.Device.Builder setManufacturer(String str) {
            if (str == null) {
                throw new NullPointerException("Null manufacturer");
            }
            this.manufacturer = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder
        public CrashlyticsReport.Session.Device.Builder setModel(String str) {
            if (str == null) {
                throw new NullPointerException("Null model");
            }
            this.model = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder
        public CrashlyticsReport.Session.Device.Builder setModelClass(String str) {
            if (str == null) {
                throw new NullPointerException("Null modelClass");
            }
            this.modelClass = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder
        public CrashlyticsReport.Session.Device.Builder setRam(long j) {
            this.ram = Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder
        public CrashlyticsReport.Session.Device.Builder setSimulator(boolean z) {
            this.simulator = Boolean.valueOf(z);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder
        public CrashlyticsReport.Session.Device.Builder setState(int i) {
            this.state = Integer.valueOf(i);
            return this;
        }
    }

    private AutoValue_CrashlyticsReport_Session_Device(int i, String str, int i2, long j, long j2, boolean z, int i3, String str2, String str3) {
        this.arch = i;
        this.model = str;
        this.cores = i2;
        this.ram = j;
        this.diskSpace = j2;
        this.simulator = z;
        this.state = i3;
        this.manufacturer = str2;
        this.modelClass = str3;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Device)) {
            return false;
        }
        CrashlyticsReport.Session.Device device = (CrashlyticsReport.Session.Device) obj;
        return this.arch == device.getArch() && this.model.equals(device.getModel()) && this.cores == device.getCores() && this.ram == device.getRam() && this.diskSpace == device.getDiskSpace() && this.simulator == device.isSimulator() && this.state == device.getState() && this.manufacturer.equals(device.getManufacturer()) && this.modelClass.equals(device.getModelClass());
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device
    @NonNull
    public int getArch() {
        return this.arch;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device
    public int getCores() {
        return this.cores;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device
    public long getDiskSpace() {
        return this.diskSpace;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device
    @NonNull
    public String getManufacturer() {
        return this.manufacturer;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device
    @NonNull
    public String getModel() {
        return this.model;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device
    @NonNull
    public String getModelClass() {
        return this.modelClass;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device
    public long getRam() {
        return this.ram;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device
    public int getState() {
        return this.state;
    }

    public int hashCode() {
        int iHashCode = (((((this.arch ^ 1000003) * 1000003) ^ this.model.hashCode()) * 1000003) ^ this.cores) * 1000003;
        long j = this.ram;
        int i = (iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.diskSpace;
        return ((((((((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ (this.simulator ? 1231 : 1237)) * 1000003) ^ this.state) * 1000003) ^ this.manufacturer.hashCode()) * 1000003) ^ this.modelClass.hashCode();
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device
    public boolean isSimulator() {
        return this.simulator;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Device{arch=");
        sb.append(this.arch);
        sb.append(", model=");
        sb.append(this.model);
        sb.append(", cores=");
        sb.append(this.cores);
        sb.append(", ram=");
        sb.append(this.ram);
        sb.append(", diskSpace=");
        sb.append(this.diskSpace);
        sb.append(", simulator=");
        sb.append(this.simulator);
        sb.append(", state=");
        sb.append(this.state);
        sb.append(", manufacturer=");
        sb.append(this.manufacturer);
        sb.append(", modelClass=");
        return C0786MA.m3668a(sb, this.modelClass, "}");
    }
}
