package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class P4 {

    /* renamed from: a, reason: collision with root package name */
    public final S4 f6565a;

    /* renamed from: b, reason: collision with root package name */
    public final Q4 f6566b = new AbstractBinderC1149s4("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.Q4, com.google.android.gms.internal.ads.s4] */
    public P4(S4 s4) {
        this.f6565a = s4;
    }

    public static void a(Context context, String str, H1.e eVar, Rk rk) {
        h2.y.j(context, "Context cannot be null.");
        h2.y.j(str, "adUnitId cannot be null.");
        h2.y.d("#008 Must be called on the main UI thread.");
        AbstractC1066q6.a(context);
        if (((Boolean) L6.d.r()).booleanValue()) {
            if (((Boolean) O1.r.d.c.a(AbstractC1066q6.x9)).booleanValue()) {
                AbstractC1249uc.f10789b.execute(new J1.a(context, str, eVar, rk, 0));
                return;
            }
        }
        new Y4(context, str, eVar.f863a, rk).a();
    }
}
