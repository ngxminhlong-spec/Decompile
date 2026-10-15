package com.google.android.gms.internal.ads;

import O1.C0081p;
import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Xn implements Fo {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7691a;

    /* renamed from: b, reason: collision with root package name */
    public final Bundle f7692b;

    public /* synthetic */ Xn(int i4, Bundle bundle) {
        this.f7691a = i4;
        this.f7692b = bundle;
    }

    @Override // com.google.android.gms.internal.ads.Fo
    public final void a(Object obj) {
        switch (this.f7691a) {
            case 0:
                Bundle bundle = (Bundle) obj;
                Bundle bundle2 = this.f7692b;
                if (bundle2.isEmpty()) {
                    return;
                }
                bundle.putBundle("installed_adapter_data", bundle2);
                return;
            case 1:
                ((Bundle) obj).putBundle("content_info", this.f7692b);
                return;
            case 2:
                Bundle bundle3 = (Bundle) obj;
                Bundle d = Zf.d(bundle3, "device");
                d.putBundle("android_mem_info", this.f7692b);
                bundle3.putBundle("device", d);
                return;
            case 3:
                Bundle bundle4 = (Bundle) obj;
                Bundle bundle5 = this.f7692b;
                if (bundle5 != null) {
                    bundle4.putAll(bundle5);
                    return;
                }
                return;
            case 4:
                ((Bundle) obj).putBundle("shared_pref", this.f7692b);
                return;
            default:
                JSONObject jSONObject = (JSONObject) obj;
                Bundle bundle6 = this.f7692b;
                if (bundle6 != null) {
                    try {
                        android.support.v4.media.session.a.D("play_store", android.support.v4.media.session.a.D("device", jSONObject)).put("parental_controls", C0081p.f1374f.f1375a.f(bundle6));
                        return;
                    } catch (JSONException unused) {
                        Q1.I.w("Failed putting parental controls bundle.");
                        return;
                    }
                }
                return;
        }
    }
}
