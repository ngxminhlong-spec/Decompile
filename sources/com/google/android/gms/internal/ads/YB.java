package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class YB implements InterfaceC1072qC {

    /* renamed from: a, reason: collision with root package name */
    public final C1058pz f7791a;

    /* renamed from: b, reason: collision with root package name */
    public final long f7792b;
    public final long c;
    public final long d;

    /* renamed from: e, reason: collision with root package name */
    public final long f7793e;

    /* renamed from: f, reason: collision with root package name */
    public final long f7794f;

    /* renamed from: g, reason: collision with root package name */
    public int f7795g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f7796h;

    public YB() {
        C1058pz c1058pz = new C1058pz();
        h(2500, 0, "bufferForPlaybackMs", "0");
        h(5000, 0, "bufferForPlaybackAfterRebufferMs", "0");
        h(50000, 2500, "minBufferMs", "bufferForPlaybackMs");
        h(50000, 5000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        h(50000, 50000, "maxBufferMs", "minBufferMs");
        h(0, 0, "backBufferDurationMs", "0");
        this.f7791a = c1058pz;
        long t4 = AbstractC0751is.t(50000L);
        this.f7792b = t4;
        this.c = t4;
        this.d = AbstractC0751is.t(2500L);
        this.f7793e = AbstractC0751is.t(5000L);
        this.f7795g = 13107200;
        this.f7794f = AbstractC0751is.t(0L);
    }

    public static void h(int i4, int i5, String str, String str2) {
        Zf.S(n0.a.i(str, " cannot be less than ", str2), i4 >= i5);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1072qC
    public final boolean a(long j4, float f4, boolean z4, long j5) {
        int i4;
        int i5 = AbstractC0751is.f9071a;
        if (f4 != 1.0f) {
            j4 = Math.round(j4 / f4);
        }
        long j6 = z4 ? this.f7793e : this.d;
        if (j5 != -9223372036854775807L) {
            j6 = Math.min(j5 / 2, j6);
        }
        if (j6 <= 0 || j4 >= j6) {
            return true;
        }
        C1058pz c1058pz = this.f7791a;
        synchronized (c1058pz) {
            i4 = c1058pz.f10061b * 65536;
        }
        return i4 >= this.f7795g;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1072qC
    public final long b() {
        return this.f7794f;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1072qC
    public final void c() {
        this.f7795g = 13107200;
        this.f7796h = false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1072qC
    public final boolean d(long j4, float f4) {
        int i4;
        long j5 = this.c;
        C1058pz c1058pz = this.f7791a;
        synchronized (c1058pz) {
            i4 = c1058pz.f10061b * 65536;
        }
        int i5 = this.f7795g;
        long j6 = this.f7792b;
        if (f4 > 1.0f) {
            j6 = Math.min(AbstractC0751is.s(j6, f4), j5);
        }
        if (j4 < Math.max(j6, 500000L)) {
            boolean z4 = i4 < i5;
            this.f7796h = z4;
            if (!z4 && j4 < 500000) {
                Wj.l("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j4 >= j5 || i4 >= i5) {
            this.f7796h = false;
        }
        return this.f7796h;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1072qC
    public final void e() {
        this.f7795g = 13107200;
        this.f7796h = false;
        C1058pz c1058pz = this.f7791a;
        synchronized (c1058pz) {
            c1058pz.u(0);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1072qC
    public final void f(WD[] wdArr, InterfaceC0690hF[] interfaceC0690hFArr) {
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int length = wdArr.length;
            if (i4 >= 2) {
                int max = Math.max(13107200, i5);
                this.f7795g = max;
                this.f7791a.u(max);
                return;
            } else {
                if (interfaceC0690hFArr[i4] != null) {
                    i5 += wdArr[i4].f7410p != 1 ? 131072000 : 13107200;
                }
                i4++;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1072qC
    public final C1058pz g() {
        return this.f7791a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1072qC
    public final void i() {
        this.f7795g = 13107200;
        this.f7796h = false;
        C1058pz c1058pz = this.f7791a;
        synchronized (c1058pz) {
            c1058pz.u(0);
        }
    }
}
