package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Bo implements Fo {

    /* renamed from: a, reason: collision with root package name */
    public final String f4184a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4185b;
    public final String c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final Long f4186e;

    public Bo(String str, String str2, String str3, String str4, Long l4) {
        this.f4184a = str;
        this.f4185b = str2;
        this.c = str3;
        this.d = str4;
        this.f4186e = l4;
    }

    @Override // com.google.android.gms.internal.ads.Fo
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        Zf.I("gmp_app_id", this.f4184a, bundle);
        Zf.I("fbs_aiid", this.f4185b, bundle);
        Zf.I("fbs_aeid", this.c, bundle);
        Zf.I("apm_id_origin", this.d, bundle);
        Long l4 = this.f4186e;
        if (l4 != null) {
            bundle.putLong("sai_timeout", l4.longValue());
        }
    }
}
