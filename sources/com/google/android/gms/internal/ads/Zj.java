package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Zj implements InterfaceC1457zB {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8027a;

    /* renamed from: b, reason: collision with root package name */
    public final FB f8028b;
    public final AB c;

    public /* synthetic */ Zj(C1414yB c1414yB, AB ab, int i4) {
        this.f8027a = i4;
        this.f8028b = c1414yB;
        this.c = ab;
    }

    @Override // com.google.android.gms.internal.ads.FB
    public final Object c() {
        switch (this.f8027a) {
            case 0:
                return new Yj((C0764j5) this.f8028b.c(), (C0919mp) this.c.f3930a);
            case 1:
                return new Am((Context) this.f8028b.c(), (C0262De) this.c.f3930a);
            case 2:
                return new C1259um((Context) this.f8028b.c(), (C0279Ge) this.c.f3930a, 1);
            default:
                return new C1259um((Context) this.f8028b.c(), (C0289Ie) this.c.f3930a, 2);
        }
    }
}
