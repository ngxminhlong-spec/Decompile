package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.measurement.C1510e1;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.ni, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0955ni implements InterfaceC1457zB {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9760a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final FB f9761b;
    public final Lf c;
    public final Bg d;

    /* renamed from: e, reason: collision with root package name */
    public final Eh f9762e;

    /* renamed from: f, reason: collision with root package name */
    public final FB f9763f;

    /* renamed from: g, reason: collision with root package name */
    public final FB f9764g;

    public C0955ni(AB ab, Bg bg, Eh eh, Lf lf, C0269Ef c0269Ef, C1414yB c1414yB) {
        this.f9761b = ab;
        this.d = bg;
        this.f9762e = eh;
        this.c = lf;
        this.f9763f = c0269Ef;
        this.f9764g = c1414yB;
    }

    public C0955ni(AB ab, Lf lf, Bg bg, Eh eh, C1414yB c1414yB, C1414yB c1414yB2) {
        this.f9761b = ab;
        this.c = lf;
        this.d = bg;
        this.f9762e = eh;
        this.f9763f = c1414yB;
        this.f9764g = c1414yB2;
    }

    @Override // com.google.android.gms.internal.ads.FB
    public final Object c() {
        switch (this.f9760a) {
            case 0:
                C1423ye c1423ye = (C1423ye) this.f9761b.c();
                C1468zg a4 = this.d.f4149b.a();
                Dh dh = this.f9762e.f4912b;
                C0783ji c0783ji = (C0783ji) this.c.f6149b;
                C0825kh c = ((C0269Ef) this.f9763f).c();
                Um um = (Um) this.f9764g.c();
                C1423ye c1423ye2 = c1423ye.f11395b;
                C1468zg c1468zg = new C1468zg(a4);
                Xj xj = null;
                C0874ln c0874ln = new C0874ln(0, null);
                C1510e1 c1510e1 = new C1510e1((Object) c, (Object) null, 22, false);
                C0874ln c0874ln2 = new C0874ln(20, null);
                if (((Boolean) O1.r.d.c.a(AbstractC1066q6.f10206b3)).booleanValue()) {
                    xj = new Xj(7, false);
                    xj.f7687p = um;
                }
                AbstractC0587ez.p(dh, Dh.class);
                if (xj == null) {
                    xj = new Xj(7, false);
                }
                AbstractC0587ez.p(c0783ji, C0783ji.class);
                InterfaceC0441bg interfaceC0441bg = (InterfaceC0441bg) new C0262De(c1423ye2, c0874ln2, c0783ji, dh, c1468zg, xj, c0874ln, c1510e1, null, null).f4657O0.c();
                AbstractC0587ez.n(interfaceC0441bg);
                return interfaceC0441bg;
            default:
                return new Om((C1423ye) this.f9761b.c(), (C0783ji) this.c.f6149b, this.d.f4149b.a(), this.f9762e.f4912b, (Um) this.f9763f.c(), (C0959nm) this.f9764g.c());
        }
    }
}
