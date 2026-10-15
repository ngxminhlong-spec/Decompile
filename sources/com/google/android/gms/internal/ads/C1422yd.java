package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.yd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1422yd extends AbstractC1250ud implements InterfaceC0342Tc {

    /* renamed from: r, reason: collision with root package name */
    public C0273Fd f11360r;

    /* renamed from: s, reason: collision with root package name */
    public String f11361s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f11362t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f11363u;

    /* renamed from: v, reason: collision with root package name */
    public C0864ld f11364v;

    /* renamed from: w, reason: collision with root package name */
    public long f11365w;

    /* renamed from: x, reason: collision with root package name */
    public long f11366x;

    public static final String u(String str) {
        return "cache:".concat(String.valueOf(C1335wc.n(str, "MD5")));
    }

    public static String v(String str, Exception exc) {
        return str + "/" + exc.getClass().getCanonicalName() + ":" + exc.getMessage();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0342Tc
    public final void a(int i4) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0342Tc
    public final void b() {
        Y9.s("Precache onRenderedFirstFrame");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0342Tc
    public final void d(int i4, int i5) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0342Tc
    public final void e(boolean z4, long j4) {
        InterfaceC0308Md interfaceC0308Md = (InterfaceC0308Md) this.f10792q.get();
        if (interfaceC0308Md != null) {
            AbstractC0266Ec.f4899e.execute(new RunnableC0565ed(interfaceC0308Md, z4, j4, 1));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0342Tc
    public final void g(IOException iOException) {
        Y9.t("Precache exception", iOException);
        N1.n.f1204A.f1209g.g("VideoStreamExoPlayerCache.onException", iOException);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0342Tc
    public final void h(String str, Exception exc) {
        Y9.t("Precache error", exc);
        N1.n.f1204A.f1209g.g("VideoStreamExoPlayerCache.onError", exc);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1250ud
    public final void i() {
        C0273Fd c0273Fd = this.f11360r;
        if (c0273Fd != null) {
            c0273Fd.f5037x = null;
            MC mc = c0273Fd.f5034u;
            if (mc != null) {
                mc.f6223r.a();
                mc.f6222q.r1(c0273Fd);
                MC mc2 = c0273Fd.f5034u;
                mc2.f6223r.a();
                mc2.f6222q.p();
                c0273Fd.f5034u = null;
                C0273Fd.f5019J.decrementAndGet();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1250ud
    public final void l() {
        synchronized (this) {
            this.f11362t = true;
            notify();
            i();
        }
        String str = this.f11361s;
        if (str != null) {
            m(this.f11361s, u(str), "externalAbort", "Programmatic precache abort.");
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1250ud
    public final void n(int i4) {
        C0249Bd c0249Bd = this.f11360r.f5029p;
        synchronized (c0249Bd) {
            c0249Bd.d = i4 * 1000;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1250ud
    public final void o(int i4) {
        C0249Bd c0249Bd = this.f11360r.f5029p;
        synchronized (c0249Bd) {
            c0249Bd.f4091e = i4 * 1000;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1250ud
    public final void p(int i4) {
        C0249Bd c0249Bd = this.f11360r.f5029p;
        synchronized (c0249Bd) {
            c0249Bd.c = i4 * 1000;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1250ud
    public final void q(int i4) {
        C0249Bd c0249Bd = this.f11360r.f5029p;
        synchronized (c0249Bd) {
            c0249Bd.f4090b = i4 * 1000;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1250ud
    public final boolean r(String str) {
        return s(str, new String[]{str});
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [android.os.Handler] */
    @Override // com.google.android.gms.internal.ads.AbstractC1250ud
    public final boolean s(String str, String[] strArr) {
        boolean z4;
        long j4;
        long j5;
        long j6;
        long j7;
        long j8;
        long j9;
        long j10;
        boolean z5;
        long j11;
        int i4;
        int i5;
        Ur ur;
        long j12;
        long j13;
        C1422yd c1422yd = this;
        String str2 = str;
        c1422yd.f11361s = str2;
        String u2 = u(str2);
        boolean z6 = false;
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i6 = 0; i6 < strArr.length; i6++) {
                uriArr[i6] = Uri.parse(strArr[i6]);
            }
            C0273Fd c0273Fd = c1422yd.f11360r;
            c0273Fd.getClass();
            c0273Fd.p(uriArr, ByteBuffer.allocate(0), false);
            InterfaceC0308Md interfaceC0308Md = (InterfaceC0308Md) c1422yd.f10792q.get();
            if (interfaceC0308Md != null) {
                interfaceC0308Md.c0(u2, c1422yd);
            }
            N1.n.f1204A.f1212j.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            C0937n6 c0937n6 = AbstractC1066q6.f10280s;
            O1.r rVar = O1.r.d;
            long longValue = ((Long) rVar.c.a(c0937n6)).longValue();
            long longValue2 = ((Long) rVar.c.a(AbstractC1066q6.f10276r)).longValue() * 1000;
            long intValue = ((Integer) rVar.c.a(AbstractC1066q6.f10271q)).intValue();
            boolean booleanValue = ((Boolean) rVar.c.a(AbstractC1066q6.f10094D1)).booleanValue();
            long j14 = -1;
            c1422yd = c1422yd;
            while (true) {
                synchronized (this) {
                    try {
                        if (System.currentTimeMillis() - currentTimeMillis > longValue2) {
                            throw new IOException("Timeout reached. Limit: " + longValue2 + " ms");
                        }
                        if (c1422yd.f11362t) {
                            throw new IOException("Abort requested before buffering finished. ");
                        }
                        if (c1422yd.f11363u) {
                            return true;
                        }
                        MC mc = c1422yd.f11360r.f5034u;
                        if (!(mc != null ? true : z6)) {
                            throw new IOException("ExoPlayer was released during preloading.");
                        }
                        long s12 = mc.s1();
                        if (s12 > 0) {
                            long r1 = c1422yd.f11360r.f5034u.r1();
                            if (r1 != j14) {
                                if (r1 > 0) {
                                    j10 = longValue;
                                    j8 = s12;
                                    z5 = true;
                                } else {
                                    j10 = longValue;
                                    j8 = s12;
                                    z5 = z6;
                                }
                                if (booleanValue) {
                                    try {
                                        C0273Fd c0273Fd2 = c1422yd.f11360r;
                                        j11 = (c0273Fd2.f5026G == null || !c0273Fd2.f5026G.f4448C) ? c0273Fd2.y : 0L;
                                    } catch (Throwable th) {
                                        th = th;
                                        z4 = false;
                                    }
                                } else {
                                    j11 = -1;
                                }
                                long s4 = booleanValue ? c1422yd.f11360r.s() : -1L;
                                long o4 = booleanValue ? c1422yd.f11360r.o() : -1L;
                                try {
                                    i4 = C0273Fd.f5018I.get();
                                    i5 = C0273Fd.f5019J.get();
                                    ur = C1335wc.f11173b;
                                    j4 = longValue2;
                                    j7 = j10;
                                    j12 = j11;
                                    j9 = r1;
                                    j5 = intValue;
                                    j13 = s4;
                                    z4 = false;
                                } catch (Throwable th2) {
                                    th = th2;
                                    z4 = false;
                                    c1422yd = this;
                                    str2 = str;
                                    throw th;
                                }
                                try {
                                    RunnableC1036pd runnableC1036pd = new RunnableC1036pd(c1422yd, str2, u2, j9, j8, j12, j13, o4, z5, i4, i5);
                                    ?? r12 = ur;
                                    r12.post(runnableC1036pd);
                                    j14 = j9;
                                    c1422yd = r12;
                                } catch (Throwable th3) {
                                    th = th3;
                                    c1422yd = this;
                                    str2 = str;
                                    throw th;
                                }
                            } else {
                                z4 = z6;
                                j7 = longValue;
                                j4 = longValue2;
                                j8 = s12;
                                j9 = r1;
                                j5 = intValue;
                                c1422yd = c1422yd;
                            }
                            if (j9 >= j8) {
                                C1335wc.f11173b.post(new RunnableC1164sd(this, str, u2, j8));
                                return true;
                            }
                            try {
                                C1422yd c1422yd2 = this;
                                str2 = str;
                                if (c1422yd2.f11360r.y >= j5 && j9 > 0) {
                                    return true;
                                }
                                j6 = j7;
                                c1422yd = c1422yd2;
                            } catch (Throwable th4) {
                                th = th4;
                            }
                        } else {
                            z4 = z6;
                            j4 = longValue2;
                            j5 = intValue;
                            j6 = longValue;
                            c1422yd = c1422yd;
                        }
                        try {
                            c1422yd.wait(j6);
                        } catch (InterruptedException unused) {
                            throw new IOException("Wait interrupted.");
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        z4 = z6;
                    }
                }
                try {
                    throw th;
                } catch (Exception e4) {
                    e = e4;
                    Y9.s("Failed to preload url " + str2 + " Exception: " + e.getMessage());
                    N1.n.f1204A.f1209g.g("VideoStreamExoPlayerCache.preload", e);
                    c1422yd.i();
                    c1422yd.m(str2, u2, "error", v("error", e));
                    return z4;
                }
                longValue = j6;
                intValue = j5;
                z6 = z4;
                longValue2 = j4;
                c1422yd = c1422yd;
            }
        } catch (Exception e5) {
            e = e5;
            z4 = z6;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1250ud
    public final boolean t(String str, String[] strArr, C0864ld c0864ld) {
        this.f11361s = str;
        this.f11364v = c0864ld;
        String u2 = u(str);
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i4 = 0; i4 < strArr.length; i4++) {
                uriArr[i4] = Uri.parse(strArr[i4]);
            }
            C0273Fd c0273Fd = this.f11360r;
            c0273Fd.getClass();
            c0273Fd.p(uriArr, ByteBuffer.allocate(0), false);
            InterfaceC0308Md interfaceC0308Md = (InterfaceC0308Md) this.f10792q.get();
            if (interfaceC0308Md != null) {
                interfaceC0308Md.c0(u2, this);
            }
            N1.n.f1204A.f1212j.getClass();
            this.f11365w = System.currentTimeMillis();
            this.f11366x = -1L;
            Q1.N.f1668k.postDelayed(new D3(13, this), 0L);
            return true;
        } catch (Exception e4) {
            Y9.s("Failed to preload url " + str + " Exception: " + e4.getMessage());
            N1.n.f1204A.f1209g.g("VideoStreamExoPlayerCache.preload", e4);
            i();
            m(str, u2, "error", v("error", e4));
            return false;
        }
    }
}
