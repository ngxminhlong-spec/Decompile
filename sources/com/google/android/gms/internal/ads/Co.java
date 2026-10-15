package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Co implements Fo {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f4545a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4546b;
    public final String c;
    public final boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4547e;

    /* renamed from: f, reason: collision with root package name */
    public final int f4548f;

    /* renamed from: g, reason: collision with root package name */
    public final int f4549g;

    /* renamed from: h, reason: collision with root package name */
    public final String f4550h;

    public Co(boolean z4, boolean z5, String str, boolean z6, int i4, int i5, int i6, String str2) {
        this.f4545a = z4;
        this.f4546b = z5;
        this.c = str;
        this.d = z6;
        this.f4547e = i4;
        this.f4548f = i5;
        this.f4549g = i6;
        this.f4550h = str2;
    }

    @Override // com.google.android.gms.internal.ads.Fo
    public final void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putString("js", this.c);
        bundle.putBoolean("is_nonagon", true);
        C0937n6 c0937n6 = AbstractC1066q6.f10228g3;
        O1.r rVar = O1.r.d;
        bundle.putString("extra_caps", (String) rVar.c.a(c0937n6));
        bundle.putInt("target_api", this.f4547e);
        bundle.putInt("dv", this.f4548f);
        bundle.putInt("lv", this.f4549g);
        if (((Boolean) rVar.c.a(AbstractC1066q6.e5)).booleanValue()) {
            String str = this.f4550h;
            if (!TextUtils.isEmpty(str)) {
                bundle.putString("ev", str);
            }
        }
        Bundle d = Zf.d(bundle, "sdk_env");
        d.putBoolean("mf", ((Boolean) N6.f6304a.r()).booleanValue());
        d.putBoolean("instant_app", this.f4545a);
        d.putBoolean("lite", this.f4546b);
        d.putBoolean("is_privileged_process", this.d);
        bundle.putBundle("sdk_env", d);
        Bundle d4 = Zf.d(d, "build_meta");
        d4.putString("cl", "579009612");
        d4.putString("rapid_rc", "dev");
        d4.putString("rapid_rollup", "HEAD");
        d.putBundle("build_meta", d4);
    }
}
