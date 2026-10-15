package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.qq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1092qq implements InterfaceC1457zB {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10415a;

    /* renamed from: b, reason: collision with root package name */
    public final C0865le f10416b;
    public final C1122re c;
    public final C1414yB d;

    public /* synthetic */ C1092qq(C0865le c0865le, C1122re c1122re, C1414yB c1414yB, int i4) {
        this.f10415a = i4;
        this.f10416b = c0865le;
        this.c = c1122re;
        this.d = c1414yB;
    }

    @Override // com.google.android.gms.internal.ads.FB
    public final Object c() {
        C0641g9 c0641g9;
        switch (this.f10415a) {
            case 0:
                Context a4 = this.f10416b.a();
                C0248Bc a5 = this.c.a();
                Fq fq = (Fq) this.d.c();
                synchronized (new Object()) {
                    Context applicationContext = a4.getApplicationContext();
                    if (applicationContext != null) {
                        a4 = applicationContext;
                    }
                    c0641g9 = new C0641g9(a4, a5, (String) O1.r.d.c.a(AbstractC1066q6.f10197a), fq);
                }
                return c0641g9;
            default:
                return new Fq(this.f10416b.a(), this.c.a(), (Sj) this.d.c(), new C1016p(22));
        }
    }
}
