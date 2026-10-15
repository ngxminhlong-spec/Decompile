package com.google.android.gms.internal.ads;

import android.content.Context;
import c0.C0228i;
import java.util.ArrayList;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.wg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1339wg implements Yg, Tg {

    /* renamed from: o, reason: collision with root package name */
    public final C1434yp f11182o;

    public C1339wg(C1434yp c1434yp) {
        this.f11182o = c1434yp;
    }

    @Override // com.google.android.gms.internal.ads.Tg
    public final void F(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.Yg
    public final void M() {
        C1434yp c1434yp = this.f11182o;
        C0228i c0228i = c1434yp.f11505d0;
        if (c0228i == null || !c0228i.f3531a) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (c1434yp.f11505d0.f3532b.isEmpty()) {
            return;
        }
        arrayList.add(c1434yp.f11505d0.f3532b);
    }

    @Override // com.google.android.gms.internal.ads.Tg
    public final void l(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.Tg
    public final void o(Context context) {
    }
}
