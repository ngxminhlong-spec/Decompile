package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class QE implements InterfaceC1159sE, InterfaceC1116rE {

    /* renamed from: o, reason: collision with root package name */
    public final InterfaceC1159sE f6654o;

    /* renamed from: p, reason: collision with root package name */
    public final long f6655p;

    /* renamed from: q, reason: collision with root package name */
    public InterfaceC1116rE f6656q;

    public QE(InterfaceC1159sE interfaceC1159sE, long j4) {
        this.f6654o = interfaceC1159sE;
        this.f6655p = j4;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1116rE
    public final /* bridge */ /* synthetic */ void a(ME me) {
        InterfaceC1116rE interfaceC1116rE = this.f6656q;
        interfaceC1116rE.getClass();
        interfaceC1116rE.a(this);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1116rE
    public final void b(InterfaceC1159sE interfaceC1159sE) {
        InterfaceC1116rE interfaceC1116rE = this.f6656q;
        interfaceC1116rE.getClass();
        interfaceC1116rE.b(this);
    }

    @Override // com.google.android.gms.internal.ads.ME
    public final long c() {
        long c = this.f6654o.c();
        if (c == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return c + this.f6655p;
    }

    @Override // com.google.android.gms.internal.ads.ME
    public final void d(long j4) {
        this.f6654o.d(j4 - this.f6655p);
    }

    @Override // com.google.android.gms.internal.ads.ME
    public final long e() {
        long e4 = this.f6654o.e();
        if (e4 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return e4 + this.f6655p;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1159sE
    public final void f() {
        this.f6654o.f();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1159sE
    public final RE g() {
        return this.f6654o.g();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1159sE
    public final long h(long j4) {
        InterfaceC1159sE interfaceC1159sE = this.f6654o;
        long j5 = this.f6655p;
        return interfaceC1159sE.h(j4 - j5) + j5;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1159sE
    public final long i() {
        long i4 = this.f6654o.i();
        if (i4 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return i4 + this.f6655p;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1159sE
    public final void j(InterfaceC1116rE interfaceC1116rE, long j4) {
        this.f6656q = interfaceC1116rE;
        this.f6654o.j(this, j4 - this.f6655p);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.android.gms.internal.ads.rC, java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.ME
    public final boolean k(C1200tC c1200tC) {
        long j4 = c1200tC.f10679a;
        ?? obj = new Object();
        obj.f10467b = c1200tC.f10680b;
        obj.c = c1200tC.c;
        obj.f10466a = j4 - this.f6655p;
        return this.f6654o.k(new C1200tC(obj));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1159sE
    public final void m(long j4) {
        this.f6654o.m(j4 - this.f6655p);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1159sE
    public final long n(InterfaceC0690hF[] interfaceC0690hFArr, boolean[] zArr, LE[] leArr, boolean[] zArr2, long j4) {
        LE[] leArr2 = new LE[leArr.length];
        int i4 = 0;
        while (true) {
            LE le = null;
            if (i4 >= leArr.length) {
                break;
            }
            PE pe = (PE) leArr[i4];
            if (pe != null) {
                le = pe.f6580a;
            }
            leArr2[i4] = le;
            i4++;
        }
        InterfaceC1159sE interfaceC1159sE = this.f6654o;
        long j5 = this.f6655p;
        long n4 = interfaceC1159sE.n(interfaceC0690hFArr, zArr, leArr2, zArr2, j4 - j5);
        for (int i5 = 0; i5 < leArr.length; i5++) {
            LE le2 = leArr2[i5];
            if (le2 == null) {
                leArr[i5] = null;
            } else {
                LE le3 = leArr[i5];
                if (le3 == null || ((PE) le3).f6580a != le2) {
                    leArr[i5] = new PE(le2, j5);
                }
            }
        }
        return n4 + j5;
    }

    @Override // com.google.android.gms.internal.ads.ME
    public final boolean o() {
        return this.f6654o.o();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1159sE
    public final long p(long j4, LC lc) {
        InterfaceC1159sE interfaceC1159sE = this.f6654o;
        long j5 = this.f6655p;
        return interfaceC1159sE.p(j4 - j5, lc) + j5;
    }
}
