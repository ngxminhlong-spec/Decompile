package com.google.android.gms.internal.ads;

import b0.C0208u;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class T1 implements J1 {

    /* renamed from: a, reason: collision with root package name */
    public final C0463c2 f7031a;

    /* renamed from: b, reason: collision with root package name */
    public String f7032b;
    public V c;
    public S1 d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f7033e;

    /* renamed from: l, reason: collision with root package name */
    public long f7040l;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f7034f = new boolean[3];

    /* renamed from: g, reason: collision with root package name */
    public final C0208u f7035g = new C0208u(32);

    /* renamed from: h, reason: collision with root package name */
    public final C0208u f7036h = new C0208u(33);

    /* renamed from: i, reason: collision with root package name */
    public final C0208u f7037i = new C0208u(34);

    /* renamed from: j, reason: collision with root package name */
    public final C0208u f7038j = new C0208u(39);

    /* renamed from: k, reason: collision with root package name */
    public final C0208u f7039k = new C0208u(40);

    /* renamed from: m, reason: collision with root package name */
    public long f7041m = -9223372036854775807L;

    /* renamed from: n, reason: collision with root package name */
    public final C1134rq f7042n = new C1134rq();

    public T1(C0463c2 c0463c2) {
        this.f7031a = c0463c2;
    }

    @Override // com.google.android.gms.internal.ads.J1
    public final void a() {
        this.f7040l = 0L;
        this.f7041m = -9223372036854775807L;
        Wj.m(this.f7034f);
        this.f7035g.f();
        this.f7036h.f();
        this.f7037i.f();
        this.f7038j.f();
        this.f7039k.f();
        S1 s12 = this.d;
        if (s12 != null) {
            s12.f6937f = false;
            s12.f6938g = false;
            s12.f6939h = false;
            s12.f6940i = false;
            s12.f6941j = false;
        }
    }

    public final void b(byte[] bArr, int i4, int i5) {
        S1 s12 = this.d;
        if (s12.f6937f) {
            int i6 = s12.d;
            int i7 = (i4 + 2) - i6;
            if (i7 < i5) {
                s12.f6938g = (bArr[i7] & 128) != 0;
                s12.f6937f = false;
            } else {
                s12.d = (i5 - i4) + i6;
            }
        }
        if (!this.f7033e) {
            this.f7035g.e(bArr, i4, i5);
            this.f7036h.e(bArr, i4, i5);
            this.f7037i.e(bArr, i4, i5);
        }
        this.f7038j.e(bArr, i4, i5);
        this.f7039k.e(bArr, i4, i5);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x021d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0190  */
    @Override // com.google.android.gms.internal.ads.J1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(com.google.android.gms.internal.ads.C1134rq r31) {
        /*
            Method dump skipped, instructions count: 569
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.T1.f(com.google.android.gms.internal.ads.rq):void");
    }

    @Override // com.google.android.gms.internal.ads.J1
    public final void g(boolean z4) {
        Zf.C(this.c);
        int i4 = AbstractC0751is.f9071a;
        if (z4) {
            S1 s12 = this.d;
            s12.f6935b = this.f7040l;
            s12.a(0);
            s12.f6940i = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.J1
    public final void h(D d, C0591f2 c0591f2) {
        c0591f2.a();
        c0591f2.b();
        this.f7032b = c0591f2.f8675e;
        c0591f2.b();
        V z4 = d.z(c0591f2.d, 2);
        this.c = z4;
        this.d = new S1(z4);
        this.f7031a.b(d, c0591f2);
    }

    @Override // com.google.android.gms.internal.ads.J1
    public final void i(int i4, long j4) {
        if (j4 != -9223372036854775807L) {
            this.f7041m = j4;
        }
    }
}
