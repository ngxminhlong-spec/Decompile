package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.ks, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0836ks {
    public static final Iv c = new Iv("OverlayDisplayService");
    public static final Intent d = new Intent("com.google.android.play.core.lmd.BIND_OVERLAY_DISPLAY_SERVICE").setPackage("com.android.vending");

    /* renamed from: a, reason: collision with root package name */
    public final C1308vs f9327a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9328b;

    public C0836ks(Context context) {
        if (AbstractC1351ws.a(context)) {
            this.f9327a = new C1308vs(context.getApplicationContext(), c, d);
        } else {
            this.f9327a = null;
        }
        this.f9328b = context.getPackageName();
    }

    public final void a(C0623fs c0623fs, x0.f fVar, int i4) {
        C1308vs c1308vs = this.f9327a;
        if (c1308vs == null) {
            c.e("error: %s", "Play Store not found.");
        } else {
            A2.i iVar = new A2.i();
            c1308vs.a().post(new C1136rs(c1308vs, iVar, iVar, new C0709hs(this, iVar, c0623fs, i4, fVar, iVar)));
        }
    }
}
