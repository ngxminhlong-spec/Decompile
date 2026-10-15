package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.view.Surface;
import android.view.TextureView;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.net.SocketException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.gd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class TextureViewSurfaceTextureListenerC0651gd extends AbstractC0322Pc implements TextureView.SurfaceTextureListener, InterfaceC0342Tc {

    /* renamed from: A, reason: collision with root package name */
    public C0362Xc f8821A;

    /* renamed from: B, reason: collision with root package name */
    public final boolean f8822B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f8823C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f8824D;

    /* renamed from: E, reason: collision with root package name */
    public int f8825E;

    /* renamed from: F, reason: collision with root package name */
    public int f8826F;

    /* renamed from: G, reason: collision with root package name */
    public float f8827G;

    /* renamed from: q, reason: collision with root package name */
    public final InterfaceC0308Md f8828q;

    /* renamed from: r, reason: collision with root package name */
    public final C0372Zc f8829r;

    /* renamed from: s, reason: collision with root package name */
    public final C0367Yc f8830s;

    /* renamed from: t, reason: collision with root package name */
    public C0337Sc f8831t;

    /* renamed from: u, reason: collision with root package name */
    public Surface f8832u;

    /* renamed from: v, reason: collision with root package name */
    public C0273Fd f8833v;

    /* renamed from: w, reason: collision with root package name */
    public String f8834w;

    /* renamed from: x, reason: collision with root package name */
    public String[] f8835x;
    public boolean y;

    /* renamed from: z, reason: collision with root package name */
    public int f8836z;

    public TextureViewSurfaceTextureListenerC0651gd(Context context, C0372Zc c0372Zc, InterfaceC0308Md interfaceC0308Md, boolean z4, C0367Yc c0367Yc) {
        super(context);
        this.f8836z = 1;
        this.f8828q = interfaceC0308Md;
        this.f8829r = c0372Zc;
        this.f8822B = z4;
        this.f8830s = c0367Yc;
        setSurfaceTextureListener(this);
        C1323w6 c1323w6 = c0372Zc.f8004e;
        AbstractC1230u.l(c1323w6, c0372Zc.d, "vpc2");
        c0372Zc.f8008i = true;
        c1323w6.b("vpn", s());
        c0372Zc.f8013n = this;
    }

    public static String E(String str, Exception exc) {
        return str + "/" + exc.getClass().getCanonicalName() + ":" + exc.getMessage();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0322Pc
    public final Integer A() {
        C0273Fd c0273Fd = this.f8833v;
        if (c0273Fd != null) {
            return c0273Fd.f5024E;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0322Pc
    public final void B(int i4) {
        C0273Fd c0273Fd = this.f8833v;
        if (c0273Fd != null) {
            C0249Bd c0249Bd = c0273Fd.f5029p;
            synchronized (c0249Bd) {
                c0249Bd.d = i4 * 1000;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0322Pc
    public final void C(int i4) {
        C0273Fd c0273Fd = this.f8833v;
        if (c0273Fd != null) {
            C0249Bd c0249Bd = c0273Fd.f5029p;
            synchronized (c0249Bd) {
                c0249Bd.f4091e = i4 * 1000;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0322Pc
    public final void D(int i4) {
        C0273Fd c0273Fd = this.f8833v;
        if (c0273Fd != null) {
            C0249Bd c0249Bd = c0273Fd.f5029p;
            synchronized (c0249Bd) {
                c0249Bd.c = i4 * 1000;
            }
        }
    }

    public final void F() {
        if (this.f8823C) {
            return;
        }
        this.f8823C = true;
        Q1.N.f1668k.post(new RunnableC0523dd(this, 7));
        m();
        C0372Zc c0372Zc = this.f8829r;
        if (c0372Zc.f8008i && !c0372Zc.f8009j) {
            AbstractC1230u.l(c0372Zc.f8004e, c0372Zc.d, "vfr2");
            c0372Zc.f8009j = true;
        }
        if (this.f8824D) {
            u();
        }
    }

    public final void G(boolean z4, Integer num) {
        C0273Fd c0273Fd = this.f8833v;
        if (c0273Fd != null && !z4) {
            c0273Fd.f5024E = num;
            return;
        }
        if (this.f8834w == null || this.f8832u == null) {
            return;
        }
        if (z4) {
            if (!K()) {
                Y9.s("No valid ExoPlayerAdapter exists when switch source.");
                return;
            }
            MC mc = c0273Fd.f5034u;
            mc.f6223r.a();
            mc.f6222q.s();
            H();
        }
        if (this.f8834w.startsWith("cache:")) {
            AbstractC1250ud i4 = this.f8828q.i(this.f8834w);
            if (i4 instanceof C1422yd) {
                C1422yd c1422yd = (C1422yd) i4;
                synchronized (c1422yd) {
                    c1422yd.f11363u = true;
                    c1422yd.notify();
                }
                C0273Fd c0273Fd2 = c1422yd.f11360r;
                c0273Fd2.f5037x = null;
                c1422yd.f11360r = null;
                this.f8833v = c0273Fd2;
                c0273Fd2.f5024E = num;
                if (c0273Fd2.f5034u == null) {
                    Y9.s("Precached video player has been released.");
                    return;
                }
            } else {
                if (!(i4 instanceof C1379xd)) {
                    Y9.s("Stream cache miss: ".concat(String.valueOf(this.f8834w)));
                    return;
                }
                C1379xd c1379xd = (C1379xd) i4;
                InterfaceC0308Md interfaceC0308Md = this.f8828q;
                N1.n.f1204A.c.u(interfaceC0308Md.getContext(), interfaceC0308Md.m().f4084o);
                ByteBuffer u2 = c1379xd.u();
                boolean z5 = c1379xd.f11262B;
                String str = c1379xd.f11263r;
                if (str == null) {
                    Y9.s("Stream cache URL is null.");
                    return;
                }
                C0367Yc c0367Yc = this.f8830s;
                InterfaceC0308Md interfaceC0308Md2 = this.f8828q;
                C0273Fd c0273Fd3 = new C0273Fd(interfaceC0308Md2.getContext(), c0367Yc, interfaceC0308Md2, num);
                Y9.r("ExoPlayerAdapter initialized.");
                this.f8833v = c0273Fd3;
                c0273Fd3.p(new Uri[]{Uri.parse(str)}, u2, z5);
            }
        } else {
            C0367Yc c0367Yc2 = this.f8830s;
            InterfaceC0308Md interfaceC0308Md3 = this.f8828q;
            C0273Fd c0273Fd4 = new C0273Fd(interfaceC0308Md3.getContext(), c0367Yc2, interfaceC0308Md3, num);
            Y9.r("ExoPlayerAdapter initialized.");
            this.f8833v = c0273Fd4;
            InterfaceC0308Md interfaceC0308Md4 = this.f8828q;
            N1.n.f1204A.c.u(interfaceC0308Md4.getContext(), interfaceC0308Md4.m().f4084o);
            Uri[] uriArr = new Uri[this.f8835x.length];
            int i5 = 0;
            while (true) {
                String[] strArr = this.f8835x;
                if (i5 >= strArr.length) {
                    break;
                }
                uriArr[i5] = Uri.parse(strArr[i5]);
                i5++;
            }
            C0273Fd c0273Fd5 = this.f8833v;
            c0273Fd5.getClass();
            c0273Fd5.p(uriArr, ByteBuffer.allocate(0), false);
        }
        this.f8833v.f5037x = this;
        I(this.f8832u);
        MC mc2 = this.f8833v.f5034u;
        if (mc2 != null) {
            int d = mc2.d();
            this.f8836z = d;
            if (d == 3) {
                F();
            }
        }
    }

    public final void H() {
        if (this.f8833v != null) {
            I(null);
            C0273Fd c0273Fd = this.f8833v;
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
                this.f8833v = null;
            }
            this.f8836z = 1;
            this.y = false;
            this.f8823C = false;
            this.f8824D = false;
        }
    }

    public final void I(Surface surface) {
        C0273Fd c0273Fd = this.f8833v;
        if (c0273Fd == null) {
            Y9.s("Trying to set surface before player is initialized.");
            return;
        }
        try {
            MC mc = c0273Fd.f5034u;
            if (mc != null) {
                mc.f6223r.a();
                C0857lC c0857lC = mc.f6222q;
                c0857lC.E1();
                c0857lC.A1(surface);
                int i4 = surface == null ? 0 : -1;
                c0857lC.y1(i4, i4);
            }
        } catch (IOException e4) {
            Y9.t("", e4);
        }
    }

    public final boolean J() {
        return K() && this.f8836z != 1;
    }

    public final boolean K() {
        C0273Fd c0273Fd = this.f8833v;
        return (c0273Fd == null || c0273Fd.f5034u == null || this.y) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0342Tc
    public final void a(int i4) {
        C0273Fd c0273Fd;
        if (this.f8836z != i4) {
            this.f8836z = i4;
            if (i4 == 3) {
                F();
                return;
            }
            if (i4 != 4) {
                return;
            }
            if (this.f8830s.f7831a && (c0273Fd = this.f8833v) != null) {
                c0273Fd.q(false);
            }
            this.f8829r.f8012m = false;
            C0480cd c0480cd = this.f6585p;
            c0480cd.d = false;
            c0480cd.a();
            Q1.N.f1668k.post(new RunnableC0523dd(this, 6));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0342Tc
    public final void b() {
        Q1.N.f1668k.post(new RunnableC0523dd(this, 0));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0322Pc
    public final void c(int i4) {
        C0273Fd c0273Fd = this.f8833v;
        if (c0273Fd != null) {
            C0249Bd c0249Bd = c0273Fd.f5029p;
            synchronized (c0249Bd) {
                c0249Bd.f4090b = i4 * 1000;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0342Tc
    public final void d(int i4, int i5) {
        this.f8825E = i4;
        this.f8826F = i5;
        float f4 = i5 > 0 ? i4 / i5 : 1.0f;
        if (this.f8827G != f4) {
            this.f8827G = f4;
            requestLayout();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0342Tc
    public final void e(boolean z4, long j4) {
        if (this.f8828q != null) {
            AbstractC0266Ec.f4899e.execute(new RunnableC0565ed(this, z4, j4, 0));
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0322Pc
    public final void f(int i4) {
        C0273Fd c0273Fd = this.f8833v;
        if (c0273Fd != null) {
            Iterator it = c0273Fd.f5027H.iterator();
            while (it.hasNext()) {
                C0243Ad c0243Ad = (C0243Ad) ((WeakReference) it.next()).get();
                if (c0243Ad != null) {
                    c0243Ad.f3954F = i4;
                    Iterator it2 = c0243Ad.f3955G.iterator();
                    while (it2.hasNext()) {
                        Socket socket = (Socket) it2.next();
                        if (!socket.isClosed()) {
                            try {
                                socket.setReceiveBufferSize(c0243Ad.f3954F);
                            } catch (SocketException e4) {
                                Y9.t("Failed to update receive buffer size.", e4);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0342Tc
    public final void g(IOException iOException) {
        String E4 = E("onLoadException", iOException);
        Y9.s("ExoPlayerAdapter exception: ".concat(E4));
        N1.n.f1204A.f1209g.g("AdExoPlayerView.onException", iOException);
        Q1.N.f1668k.post(new RunnableC0608fd(this, E4, 0));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0342Tc
    public final void h(String str, Exception exc) {
        C0273Fd c0273Fd;
        String E4 = E(str, exc);
        Y9.s("ExoPlayerAdapter error: ".concat(E4));
        this.y = true;
        if (this.f8830s.f7831a && (c0273Fd = this.f8833v) != null) {
            c0273Fd.q(false);
        }
        Q1.N.f1668k.post(new RunnableC0608fd(this, E4, 1));
        N1.n.f1204A.f1209g.g("AdExoPlayerView.onError", exc);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0322Pc
    public final void i(String str, String[] strArr, Integer num) {
        if (str == null) {
            return;
        }
        if (strArr == null) {
            this.f8835x = new String[]{str};
        } else {
            this.f8835x = (String[]) Arrays.copyOf(strArr, strArr.length);
        }
        String str2 = this.f8834w;
        boolean z4 = false;
        if (this.f8830s.f7839k && str2 != null && !str.equals(str2) && this.f8836z == 4) {
            z4 = true;
        }
        this.f8834w = str;
        G(z4, num);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0322Pc
    public final int j() {
        if (J()) {
            return (int) this.f8833v.f5034u.h1();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0322Pc
    public final int k() {
        C0273Fd c0273Fd = this.f8833v;
        if (c0273Fd != null) {
            return c0273Fd.f5038z;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0322Pc
    public final int l() {
        if (J()) {
            return (int) this.f8833v.f5034u.s1();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0395ad
    public final void m() {
        Q1.N.f1668k.post(new RunnableC0523dd(this, 2));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0322Pc
    public final int n() {
        return this.f8826F;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0322Pc
    public final int o() {
        return this.f8825E;
    }

    @Override // android.view.View
    public final void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f4 = this.f8827G;
        if (f4 != 0.0f && this.f8821A == null) {
            float f5 = measuredWidth;
            float f6 = f5 / measuredHeight;
            if (f4 > f6) {
                measuredHeight = (int) (f5 / f4);
            }
            if (f4 < f6) {
                measuredWidth = (int) (measuredHeight * f4);
            }
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
        C0362Xc c0362Xc = this.f8821A;
        if (c0362Xc != null) {
            c0362Xc.b(measuredWidth, measuredHeight);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i4, int i5) {
        C0273Fd c0273Fd;
        float f4;
        int i6;
        SurfaceTexture surfaceTexture2;
        if (this.f8822B) {
            C0362Xc c0362Xc = new C0362Xc(getContext());
            this.f8821A = c0362Xc;
            c0362Xc.f7628A = i4;
            c0362Xc.f7652z = i5;
            c0362Xc.f7630C = surfaceTexture;
            c0362Xc.start();
            C0362Xc c0362Xc2 = this.f8821A;
            if (c0362Xc2.f7630C == null) {
                surfaceTexture2 = null;
            } else {
                try {
                    c0362Xc2.f7635H.await();
                } catch (InterruptedException unused) {
                }
                surfaceTexture2 = c0362Xc2.f7629B;
            }
            if (surfaceTexture2 != null) {
                surfaceTexture = surfaceTexture2;
            } else {
                this.f8821A.c();
                this.f8821A = null;
            }
        }
        Surface surface = new Surface(surfaceTexture);
        this.f8832u = surface;
        if (this.f8833v == null) {
            G(false, null);
        } else {
            I(surface);
            if (!this.f8830s.f7831a && (c0273Fd = this.f8833v) != null) {
                c0273Fd.q(true);
            }
        }
        int i7 = this.f8825E;
        if (i7 == 0 || (i6 = this.f8826F) == 0) {
            f4 = i5 > 0 ? i4 / i5 : 1.0f;
            if (this.f8827G != f4) {
                this.f8827G = f4;
                requestLayout();
            }
        } else {
            f4 = i6 > 0 ? i7 / i6 : 1.0f;
            if (this.f8827G != f4) {
                this.f8827G = f4;
                requestLayout();
            }
        }
        Q1.N.f1668k.post(new RunnableC0523dd(this, 5));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        t();
        C0362Xc c0362Xc = this.f8821A;
        if (c0362Xc != null) {
            c0362Xc.c();
            this.f8821A = null;
        }
        C0273Fd c0273Fd = this.f8833v;
        if (c0273Fd != null) {
            if (c0273Fd != null) {
                c0273Fd.q(false);
            }
            Surface surface = this.f8832u;
            if (surface != null) {
                surface.release();
            }
            this.f8832u = null;
            I(null);
        }
        Q1.N.f1668k.post(new RunnableC0523dd(this, 3));
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i4, int i5) {
        C0362Xc c0362Xc = this.f8821A;
        if (c0362Xc != null) {
            c0362Xc.b(i4, i5);
        }
        Q1.N.f1668k.post(new RunnableC0307Mc(this, i4, i5, 1));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.f8829r.b(this);
        this.f6584o.a(surfaceTexture, this.f8831t);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i4) {
        Q1.I.w("AdExoPlayerView3 window visibility changed to " + i4);
        Q1.N.f1668k.post(new C0.C(i4, 9, this));
        super.onWindowVisibilityChanged(i4);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0322Pc
    public final long p() {
        C0273Fd c0273Fd = this.f8833v;
        if (c0273Fd != null) {
            return c0273Fd.s();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0322Pc
    public final long q() {
        C0273Fd c0273Fd = this.f8833v;
        if (c0273Fd == null) {
            return -1L;
        }
        if (c0273Fd.f5026G == null || !c0273Fd.f5026G.f4448C) {
            return c0273Fd.y;
        }
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0322Pc
    public final long r() {
        C0273Fd c0273Fd = this.f8833v;
        if (c0273Fd != null) {
            return c0273Fd.o();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0322Pc
    public final String s() {
        return "ExoPlayer/2".concat(true != this.f8822B ? "" : " spherical");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0322Pc
    public final void t() {
        C0273Fd c0273Fd;
        if (J()) {
            if (this.f8830s.f7831a && (c0273Fd = this.f8833v) != null) {
                c0273Fd.q(false);
            }
            MC mc = this.f8833v.f5034u;
            mc.f6223r.a();
            mc.f6222q.G1(false);
            this.f8829r.f8012m = false;
            C0480cd c0480cd = this.f6585p;
            c0480cd.d = false;
            c0480cd.a();
            Q1.N.f1668k.post(new RunnableC0523dd(this, 4));
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0322Pc
    public final void u() {
        C0273Fd c0273Fd;
        if (!J()) {
            this.f8824D = true;
            return;
        }
        if (this.f8830s.f7831a && (c0273Fd = this.f8833v) != null) {
            c0273Fd.q(true);
        }
        MC mc = this.f8833v.f5034u;
        mc.f6223r.a();
        mc.f6222q.G1(true);
        C0372Zc c0372Zc = this.f8829r;
        c0372Zc.f8012m = true;
        if (c0372Zc.f8009j && !c0372Zc.f8010k) {
            AbstractC1230u.l(c0372Zc.f8004e, c0372Zc.d, "vfp2");
            c0372Zc.f8010k = true;
        }
        C0480cd c0480cd = this.f6585p;
        c0480cd.d = true;
        c0480cd.a();
        this.f6584o.c = true;
        Q1.N.f1668k.post(new RunnableC0523dd(this, 1));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0322Pc
    public final void v(int i4) {
        if (J()) {
            long j4 = i4;
            MC mc = this.f8833v.f5034u;
            mc.T0(mc.Y0(), j4);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0322Pc
    public final void w(C0337Sc c0337Sc) {
        this.f8831t = c0337Sc;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0322Pc
    public final void x(String str) {
        if (str != null) {
            i(str, null, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0322Pc
    public final void y() {
        if (K()) {
            MC mc = this.f8833v.f5034u;
            mc.f6223r.a();
            mc.f6222q.s();
            H();
        }
        C0372Zc c0372Zc = this.f8829r;
        c0372Zc.f8012m = false;
        C0480cd c0480cd = this.f6585p;
        c0480cd.d = false;
        c0480cd.a();
        c0372Zc.a();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0322Pc
    public final void z(float f4, float f5) {
        C0362Xc c0362Xc = this.f8821A;
        if (c0362Xc != null) {
            c0362Xc.d(f4, f5);
        }
    }
}
