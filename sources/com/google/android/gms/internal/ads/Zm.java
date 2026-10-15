package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Zm implements InterfaceC1457zB {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8033a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final C1414yB f8034b;
    public final C1414yB c;
    public final C1414yB d;

    /* renamed from: e, reason: collision with root package name */
    public final FB f8035e;

    /* renamed from: f, reason: collision with root package name */
    public final FB f8036f;

    /* renamed from: g, reason: collision with root package name */
    public final FB f8037g;

    /* renamed from: h, reason: collision with root package name */
    public final FB f8038h;

    /* renamed from: i, reason: collision with root package name */
    public final FB f8039i;

    /* renamed from: j, reason: collision with root package name */
    public final FB f8040j;

    /* renamed from: k, reason: collision with root package name */
    public final FB f8041k;

    /* renamed from: l, reason: collision with root package name */
    public final FB f8042l;

    public Zm(C0865le c0865le, C1414yB c1414yB, C1414yB c1414yB2, C1414yB c1414yB3, C1414yB c1414yB4, C1414yB c1414yB5, C1414yB c1414yB6, C1414yB c1414yB7, C1414yB c1414yB8, C1414yB c1414yB9, C0245Af c0245Af) {
        this.f8035e = c0865le;
        this.f8036f = c1414yB;
        this.f8037g = c1414yB2;
        this.f8034b = c1414yB3;
        this.c = c1414yB4;
        this.f8038h = c1414yB5;
        this.d = c1414yB6;
        this.f8039i = c1414yB7;
        this.f8040j = c1414yB8;
        this.f8041k = c1414yB9;
        this.f8042l = c0245Af;
    }

    public Zm(C1414yB c1414yB, C1414yB c1414yB2, C1414yB c1414yB3, C1414yB c1414yB4, C1414yB c1414yB5, C1414yB c1414yB6, C1414yB c1414yB7, C1414yB c1414yB8, C1414yB c1414yB9, C1414yB c1414yB10, C1414yB c1414yB11) {
        this.f8034b = c1414yB;
        this.c = c1414yB2;
        this.d = c1414yB3;
        this.f8036f = c1414yB4;
        this.f8037g = c1414yB5;
        this.f8038h = c1414yB6;
        this.f8035e = c1414yB7;
        this.f8039i = c1414yB8;
        this.f8040j = c1414yB9;
        this.f8041k = c1414yB10;
        this.f8042l = c1414yB11;
    }

    public Ym a() {
        Context a4 = ((C0865le) this.f8035e).a();
        C1006oq c1006oq = (C1006oq) this.f8036f.c();
        Um um = (Um) this.f8037g.c();
        Kg kg = (Kg) this.f8034b.c();
        Nq nq = (Nq) this.c.c();
        Oq oq = (Oq) this.f8038h.c();
        InterfaceC0441bg interfaceC0441bg = (InterfaceC0441bg) this.d.c();
        C0260Dc c0260Dc = AbstractC0266Ec.f4897a;
        AbstractC0587ez.n(c0260Dc);
        return new Ym(a4, c1006oq, um, kg, nq, oq, interfaceC0441bg, c0260Dc, (ScheduledExecutorService) this.f8039i.c(), (C0959nm) this.f8040j.c(), (Eq) this.f8041k.c(), ((C0245Af) this.f8042l).a());
    }

    @Override // com.google.android.gms.internal.ads.FB
    public final /* bridge */ /* synthetic */ Object c() {
        switch (this.f8033a) {
            case 0:
                return a();
            default:
                return new BinderC0490cn((Gg) this.f8034b.c(), (Rh) this.c.c(), (Qg) this.d.c(), (Vg) ((C1414yB) this.f8036f).c(), (Xg) ((C1414yB) this.f8037g).c(), (Og) ((C1414yB) this.f8038h).c(), (C1254uh) this.f8035e.c(), (Wh) ((C1414yB) this.f8039i).c(), (C0655gh) ((C1414yB) this.f8040j).c(), (Vh) ((C1414yB) this.f8041k).c(), (C1168sh) ((C1414yB) this.f8042l).c());
        }
    }
}
