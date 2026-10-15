package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.Bd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0249Bd implements InterfaceC1072qC {

    /* renamed from: a, reason: collision with root package name */
    public final C1058pz f4089a = new C1058pz();

    /* renamed from: b, reason: collision with root package name */
    public long f4090b = 15000000;
    public long c = 30000000;
    public long d = 2500000;

    /* renamed from: e, reason: collision with root package name */
    public long f4091e = 5000000;

    /* renamed from: f, reason: collision with root package name */
    public int f4092f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4093g;

    @Override // com.google.android.gms.internal.ads.InterfaceC1072qC
    public final /* synthetic */ boolean a(long j4, float f4, boolean z4, long j5) {
        long j6 = z4 ? this.f4091e : this.d;
        return j6 <= 0 || j4 >= j6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1072qC
    public final long b() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1072qC
    public final void c() {
        this.f4092f = 0;
        this.f4093g = false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1072qC
    public final boolean d(long j4, float f4) {
        int i4;
        boolean z4 = true;
        char c = j4 > this.c ? (char) 0 : j4 < this.f4090b ? (char) 2 : (char) 1;
        C1058pz c1058pz = this.f4089a;
        synchronized (c1058pz) {
            i4 = c1058pz.f10061b * 65536;
        }
        int i5 = this.f4092f;
        if (c != 2 && (c != 1 || !this.f4093g || i4 >= i5)) {
            z4 = false;
        }
        this.f4093g = z4;
        return z4;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1072qC
    public final void e() {
        this.f4092f = 0;
        this.f4093g = false;
        C1058pz c1058pz = this.f4089a;
        synchronized (c1058pz) {
            c1058pz.u(0);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1072qC
    public final void f(WD[] wdArr, InterfaceC0690hF[] interfaceC0690hFArr) {
        int i4 = 0;
        this.f4092f = 0;
        while (true) {
            int length = wdArr.length;
            if (i4 >= 2) {
                this.f4089a.u(this.f4092f);
                return;
            } else {
                if (interfaceC0690hFArr[i4] != null) {
                    this.f4092f += wdArr[i4].f7410p != 1 ? 131072000 : 13107200;
                }
                i4++;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1072qC
    public final C1058pz g() {
        return this.f4089a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1072qC
    public final void i() {
        this.f4092f = 0;
        this.f4093g = false;
        C1058pz c1058pz = this.f4089a;
        synchronized (c1058pz) {
            c1058pz.u(0);
        }
    }
}
