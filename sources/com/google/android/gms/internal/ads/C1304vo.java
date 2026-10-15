package com.google.android.gms.internal.ads;

import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.vo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1304vo implements Fo {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11064a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11065b;
    public final String c;

    public /* synthetic */ C1304vo(int i4, String str, String str2) {
        this.f11064a = i4;
        this.f11065b = str;
        this.c = str2;
    }

    @Override // com.google.android.gms.internal.ads.Fo
    public final void a(Object obj) {
        switch (this.f11064a) {
            case 0:
                Bundle bundle = (Bundle) obj;
                if (((Boolean) O1.r.d.c.a(AbstractC1066q6.e6)).booleanValue()) {
                    bundle.putString("request_id", this.c);
                    return;
                } else {
                    bundle.putString("request_id", this.f11065b);
                    return;
                }
            default:
                try {
                    JSONObject D4 = android.support.v4.media.session.a.D("pii", (JSONObject) obj);
                    D4.put("doritos", this.f11065b);
                    D4.put("doritos_v2", this.c);
                    return;
                } catch (JSONException unused) {
                    Q1.I.w("Failed putting doritos string.");
                    return;
                }
        }
    }
}
