package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p000.C4327f4;
import p000.C5713xI;

/* JADX INFO: loaded from: classes2.dex */
public final class zzer {
    final /* synthetic */ zzew zza;
    private final String zzb;
    private final Bundle zzc;
    private Bundle zzd;

    public zzer(zzew zzewVar, String str, Bundle bundle) {
        this.zza = zzewVar;
        Preconditions.checkNotEmpty("default_event_parameters");
        this.zzb = "default_event_parameters";
        this.zzc = new Bundle();
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0068  */
    @WorkerThread
    public final Bundle zza() {
        byte b;
        if (this.zzd == null) {
            String string = this.zza.zza().getString(this.zzb, null);
            if (string != null) {
                try {
                    Bundle bundle = new Bundle();
                    JSONArray jSONArray = new JSONArray(string);
                    for (int i = 0; i < jSONArray.length(); i++) {
                        try {
                            JSONObject jSONObject = jSONArray.getJSONObject(i);
                            String string2 = jSONObject.getString("n");
                            String string3 = jSONObject.getString(C5713xI.f19433h);
                            int iHashCode = string3.hashCode();
                            if (iHashCode != 100) {
                                if (iHashCode != 108) {
                                    if (iHashCode == 115 && string3.equals("s")) {
                                        b = 0;
                                    } else {
                                        b = -1;
                                    }
                                } else if (string3.equals(C5713xI.f19431f)) {
                                    b = 2;
                                } else {
                                    b = -1;
                                }
                            } else if (string3.equals("d")) {
                                b = 1;
                            } else {
                                b = -1;
                            }
                            if (b == 0) {
                                bundle.putString(string2, jSONObject.getString("v"));
                            } else if (b == 1) {
                                bundle.putDouble(string2, Double.parseDouble(jSONObject.getString("v")));
                            } else if (b != 2) {
                                this.zza.zzt.zzay().zzd().zzb("Unrecognized persisted bundle type. Type", string3);
                            } else {
                                bundle.putLong(string2, Long.parseLong(jSONObject.getString("v")));
                            }
                        } catch (NumberFormatException | JSONException unused) {
                            this.zza.zzt.zzay().zzd().zza("Error reading value from SharedPreferences. Value dropped");
                        }
                    }
                    this.zzd = bundle;
                } catch (JSONException unused2) {
                    C4327f4.m20229a(this.zza.zzt, "Error loading bundle from SharedPreferences. Values will be lost");
                }
            }
            if (this.zzd == null) {
                this.zzd = this.zzc;
            }
        }
        return this.zzd;
    }

    @WorkerThread
    public final void zzb(Bundle bundle) {
        String str;
        if (bundle == null) {
            bundle = new Bundle();
        }
        SharedPreferences.Editor editorEdit = this.zza.zza().edit();
        if (bundle.size() == 0) {
            editorEdit.remove(this.zzb);
        } else {
            String str2 = this.zzb;
            JSONArray jSONArray = new JSONArray();
            for (String str3 : bundle.keySet()) {
                Object obj = bundle.get(str3);
                if (obj != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("n", str3);
                        jSONObject.put("v", obj.toString());
                        if (obj instanceof String) {
                            str = "s";
                        } else if (obj instanceof Long) {
                            str = C5713xI.f19431f;
                        } else if (obj instanceof Double) {
                            str = "d";
                        } else {
                            this.zza.zzt.zzay().zzd().zzb("Cannot serialize bundle value to SharedPreferences. Type", obj.getClass());
                        }
                        jSONObject.put(C5713xI.f19433h, str);
                        jSONArray.put(jSONObject);
                    } catch (JSONException e) {
                        this.zza.zzt.zzay().zzd().zzb("Cannot serialize bundle value to SharedPreferences", e);
                    }
                }
            }
            editorEdit.putString(str2, jSONArray.toString());
        }
        editorEdit.apply();
        this.zzd = bundle;
    }
}
