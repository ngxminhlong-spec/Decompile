package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.Ob, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0316Ob {

    /* renamed from: a, reason: collision with root package name */
    public final Q1.K f6464a;

    /* renamed from: b, reason: collision with root package name */
    public final C0356Wb f6465b;

    public C0316Ob(Q1.K k3, C0356Wb c0356Wb) {
        this.f6464a = k3;
        this.f6465b = c0356Wb;
    }

    public final void a() {
        if (((Boolean) O1.r.d.c.a(AbstractC1066q6.f10245k0)).booleanValue()) {
            synchronized (this.f6465b.f7456l) {
            }
        }
    }

    public final void b(int i4, long j4) {
        long j5;
        C0937n6 c0937n6 = AbstractC1066q6.f10240j0;
        O1.r rVar = O1.r.d;
        if (((Boolean) rVar.c.a(c0937n6)).booleanValue()) {
            return;
        }
        Q1.K k3 = this.f6464a;
        k3.r();
        synchronized (k3.f1642a) {
            j5 = k3.f1641E;
        }
        if (j4 - j5 < 0) {
            Q1.I.w("Receiving npa decision in the past, ignoring.");
            return;
        }
        if (((Boolean) rVar.c.a(AbstractC1066q6.f10245k0)).booleanValue()) {
            this.f6464a.l(i4);
            this.f6464a.m(j4);
        } else {
            this.f6464a.l(-1);
            this.f6464a.m(j4);
        }
        a();
    }
}
