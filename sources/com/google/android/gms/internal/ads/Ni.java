package com.google.android.gms.internal.ads;

import l2.C1798a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Ni implements InterfaceC1457zB {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6353a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final FB f6354b;
    public final C1126ri c;

    public Ni(C1126ri c1126ri, C1414yB c1414yB) {
        this.c = c1126ri;
        this.f6354b = c1414yB;
    }

    public Ni(C1414yB c1414yB, C1126ri c1126ri) {
        this.f6354b = c1414yB;
        this.c = c1126ri;
    }

    @Override // com.google.android.gms.internal.ads.FB
    public final Object c() {
        switch (this.f6353a) {
            case 0:
                Aj aj = (Aj) this.c.f10496b.f11915q;
                AbstractC0587ez.n(aj);
                return new Mi(aj, (C1798a) this.f6354b.c());
            default:
                Oj oj = (Oj) this.f6354b.c();
                Aj aj2 = (Aj) this.c.f10496b.f11915q;
                AbstractC0587ez.n(aj2);
                return new Ti(oj, aj2);
        }
    }
}
