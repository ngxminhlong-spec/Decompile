package com.google.android.gms.internal.ads;

import android.content.Context;
import l2.C1798a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.Pb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0321Pb implements InterfaceC1457zB {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6582a;

    /* renamed from: b, reason: collision with root package name */
    public final C1414yB f6583b;
    public final AB c;

    public C0321Pb(AB ab, C1414yB c1414yB) {
        this.f6582a = 0;
        this.c = ab;
        this.f6583b = c1414yB;
    }

    public /* synthetic */ C0321Pb(C1414yB c1414yB, AB ab, int i4) {
        this.f6582a = i4;
        this.f6583b = c1414yB;
        this.c = ab;
    }

    @Override // com.google.android.gms.internal.ads.FB
    public final Object c() {
        switch (this.f6582a) {
            case 0:
                return new C0258Da(15, (C1798a) this.c.f3930a, (C0316Ob) this.f6583b.c());
            case 1:
                Context context = (Context) this.f6583b.c();
                C0250Be c0250Be = (C0250Be) this.c.f3930a;
                C0260Dc c0260Dc = AbstractC0266Ec.f4897a;
                AbstractC0587ez.n(c0260Dc);
                return new C1173sm(context, c0250Be, c0260Dc, 0);
            default:
                return new C1259um((Context) this.f6583b.c(), (C0250Be) this.c.f3930a, 0);
        }
    }
}
