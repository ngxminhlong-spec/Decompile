package com.google.android.gms.internal.ads;

import O1.C0081p;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.fo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0619fo implements Fo {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8742a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f8743b;

    public /* synthetic */ C0619fo(int i4, Object obj) {
        this.f8742a = i4;
        this.f8743b = obj;
    }

    @Override // com.google.android.gms.internal.ads.Fo
    public final void a(Object obj) {
        boolean z4;
        switch (this.f8742a) {
            case 0:
                Integer num = (Integer) this.f8743b;
                Bundle bundle = (Bundle) obj;
                if (num != null) {
                    bundle.putInt("aos", num.intValue());
                    return;
                }
                return;
            case 1:
                ((Bundle) obj).putString("key_schema", ((C0492cp) ((Kn) this.f8743b).f6059b).f8416a);
                return;
            case 2:
                Boolean bool = (Boolean) this.f8743b;
                Bundle bundle2 = (Bundle) obj;
                if (bool != null) {
                    bundle2.putBoolean("hw_accel", bool.booleanValue());
                    return;
                }
                return;
            case 3:
                Bundle bundle3 = (Bundle) obj;
                if (((C1391xp) this.f8743b) != null) {
                    if (((Boolean) O1.r.d.c.a(AbstractC1066q6.ca)).booleanValue()) {
                        return;
                    }
                    C1391xp c1391xp = (C1391xp) this.f8743b;
                    synchronized (c1391xp.f11303b) {
                        c1391xp.b();
                        z4 = c1391xp.d == 2;
                    }
                    bundle3.putBoolean("render_in_browser", z4);
                    bundle3.putBoolean("disable_ml", ((C1391xp) this.f8743b).a());
                    return;
                }
                return;
            case 4:
                try {
                    ((JSONObject) obj).put("gms_sdk_env", ((Po) this.f8743b).f6602a);
                    return;
                } catch (JSONException unused) {
                    Q1.I.w("Failed putting version constants.");
                    return;
                }
            case 5:
                try {
                    ((JSONObject) obj).put("eid", TextUtils.join(",", (List) this.f8743b));
                    return;
                } catch (JSONException unused2) {
                    Q1.I.w("Failed putting experiment ids.");
                    return;
                }
            default:
                try {
                    ((JSONObject) obj).put("video_decoders", C0081p.f1374f.f1375a.g((HashMap) this.f8743b));
                    return;
                } catch (JSONException e4) {
                    Q1.I.w("Could not encode video decoder properties: ".concat(String.valueOf(e4.getMessage())));
                    return;
                }
        }
    }
}
