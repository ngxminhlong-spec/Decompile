package com.google.android.gms.internal.ads;

import android.content.Context;
import c3.InterfaceFutureC0239a;
import org.json.JSONObject;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Po implements Go {

    /* renamed from: a, reason: collision with root package name */
    public final JSONObject f6602a;

    public Po(Context context) {
        this.f6602a = C0326Qb.K(context);
    }

    @Override // com.google.android.gms.internal.ads.Go
    public final int b() {
        return 46;
    }

    @Override // com.google.android.gms.internal.ads.Go
    public final InterfaceFutureC0239a c() {
        return ((Boolean) O1.r.d.c.a(AbstractC1066q6.da)).booleanValue() ? Bs.h0(C1090qo.f10405e) : Bs.h0(new C0619fo(4, this));
    }
}
