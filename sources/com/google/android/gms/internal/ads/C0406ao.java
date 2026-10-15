package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.ao, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0406ao implements Fo {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8165a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8166b;
    public final int c;

    public /* synthetic */ C0406ao(int i4, int i5, String str) {
        this.f8165a = i5;
        this.f8166b = str;
        this.c = i4;
    }

    @Override // com.google.android.gms.internal.ads.Fo
    public final void a(Object obj) {
        int i4;
        int i5;
        switch (this.f8165a) {
            case 0:
                Bundle bundle = (Bundle) obj;
                String str = this.f8166b;
                if (TextUtils.isEmpty(str) || (i4 = this.c) == -1) {
                    return;
                }
                Bundle d = Zf.d(bundle, "pii");
                bundle.putBundle("pii", d);
                d.putString("pvid", str);
                d.putInt("pvid_s", i4);
                return;
            case 1:
                Bundle bundle2 = (Bundle) obj;
                if (((Boolean) O1.r.d.c.a(AbstractC1066q6.O8)).booleanValue()) {
                    String str2 = this.f8166b;
                    if (!TextUtils.isEmpty(str2)) {
                        bundle2.putString("topics", str2);
                    }
                    int i6 = this.c;
                    if (i6 != -1) {
                        bundle2.putInt("atps", i6);
                        return;
                    }
                    return;
                }
                return;
            default:
                JSONObject jSONObject = (JSONObject) obj;
                String str3 = this.f8166b;
                if (TextUtils.isEmpty(str3) || (i5 = this.c) == -1) {
                    return;
                }
                try {
                    JSONObject D4 = android.support.v4.media.session.a.D("pii", jSONObject);
                    D4.put("pvid", str3);
                    D4.put("pvid_s", i5);
                    return;
                } catch (JSONException e4) {
                    Q1.I.x("Failed putting gms core app set ID info.", e4);
                    return;
                }
        }
    }
}
