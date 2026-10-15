package com.google.android.gms.internal.ads;

import android.view.Display;
import android.view.Surface;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.g */
/* loaded from: classes.dex */
public final class C0631g {

    /* renamed from: a */
    public final C1418yF f8766a;

    /* renamed from: b */
    public final InterfaceC0503d f8767b;
    public final ChoreographerFrameCallbackC0588f c;
    public boolean d;

    /* renamed from: e */
    public Surface f8768e;

    /* renamed from: f */
    public float f8769f;

    /* renamed from: g */
    public float f8770g;

    /* renamed from: h */
    public float f8771h;

    /* renamed from: i */
    public float f8772i;

    /* renamed from: j */
    public int f8773j;

    /* renamed from: k */
    public long f8774k;

    /* renamed from: l */
    public long f8775l;

    /* renamed from: m */
    public long f8776m;

    /* renamed from: n */
    public long f8777n;

    /* renamed from: o */
    public long f8778o;

    /* renamed from: p */
    public long f8779p;

    /* renamed from: q */
    public long f8780q;

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, com.google.android.gms.internal.ads.yF] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0631g(android.content.Context r6) {
        /*
            r5 = this;
            r5.<init>()
            com.google.android.gms.internal.ads.yF r0 = new com.google.android.gms.internal.ads.yF
            r0.<init>()
            com.google.android.gms.internal.ads.xF r1 = new com.google.android.gms.internal.ads.xF
            r1.<init>()
            r0.f11354a = r1
            com.google.android.gms.internal.ads.xF r1 = new com.google.android.gms.internal.ads.xF
            r1.<init>()
            r0.f11355b = r1
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.d = r1
            r5.f8766a = r0
            r0 = 0
            if (r6 == 0) goto L4d
            android.content.Context r6 = r6.getApplicationContext()
            int r3 = com.google.android.gms.internal.ads.AbstractC0751is.f9071a
            java.lang.String r3 = "display"
            java.lang.Object r3 = r6.getSystemService(r3)
            android.hardware.display.DisplayManager r3 = (android.hardware.display.DisplayManager) r3
            if (r3 == 0) goto L38
            com.google.android.gms.internal.ads.e r4 = new com.google.android.gms.internal.ads.e
            r4.<init>(r3)
            goto L39
        L38:
            r4 = r0
        L39:
            if (r4 != 0) goto L4e
            java.lang.String r3 = "window"
            java.lang.Object r6 = r6.getSystemService(r3)
            android.view.WindowManager r6 = (android.view.WindowManager) r6
            if (r6 == 0) goto L4d
            com.google.android.gms.internal.ads.ln r3 = new com.google.android.gms.internal.ads.ln
            r4 = 2
            r3.<init>(r4, r6)
            r4 = r3
            goto L4e
        L4d:
            r4 = r0
        L4e:
            r5.f8767b = r4
            if (r4 == 0) goto L54
            com.google.android.gms.internal.ads.f r0 = com.google.android.gms.internal.ads.ChoreographerFrameCallbackC0588f.f8662s
        L54:
            r5.c = r0
            r5.f8774k = r1
            r5.f8775l = r1
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r5.f8769f = r6
            r6 = 1065353216(0x3f800000, float:1.0)
            r5.f8772i = r6
            r6 = 0
            r5.f8773j = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C0631g.<init>(android.content.Context):void");
    }

    public static /* synthetic */ void a(C0631g c0631g, Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            c0631g.f8774k = refreshRate;
            c0631g.f8775l = (refreshRate * 80) / 100;
        } else {
            Wj.l("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            c0631g.f8774k = -9223372036854775807L;
            c0631g.f8775l = -9223372036854775807L;
        }
    }

    public final void b() {
        Surface surface;
        if (AbstractC0751is.f9071a < 30 || (surface = this.f8768e) == null || this.f8773j == Integer.MIN_VALUE || this.f8771h == 0.0f) {
            return;
        }
        this.f8771h = 0.0f;
        AbstractC0460c.a(surface, 0.0f);
    }

    public final void c() {
        float f4;
        if (AbstractC0751is.f9071a < 30 || this.f8768e == null) {
            return;
        }
        C1418yF c1418yF = this.f8766a;
        if (!c1418yF.f11354a.c()) {
            f4 = this.f8769f;
        } else if (c1418yF.f11354a.c()) {
            f4 = (float) (1.0E9d / (c1418yF.f11354a.f11257e != 0 ? r2.f11258f / r4 : 0L));
        } else {
            f4 = -1.0f;
        }
        float f5 = this.f8770g;
        if (f4 != f5) {
            if (f4 != -1.0f && f5 != -1.0f) {
                float f6 = 1.0f;
                if (c1418yF.f11354a.c()) {
                    if ((c1418yF.f11354a.c() ? c1418yF.f11354a.f11258f : -9223372036854775807L) >= 5000000000L) {
                        f6 = 0.02f;
                    }
                }
                if (Math.abs(f4 - this.f8770g) < f6) {
                    return;
                }
            } else if (f4 == -1.0f && c1418yF.f11356e < 30) {
                return;
            }
            this.f8770g = f4;
            d(false);
        }
    }

    public final void d(boolean z4) {
        Surface surface;
        if (AbstractC0751is.f9071a < 30 || (surface = this.f8768e) == null || this.f8773j == Integer.MIN_VALUE) {
            return;
        }
        float f4 = 0.0f;
        if (this.d) {
            float f5 = this.f8770g;
            if (f5 != -1.0f) {
                f4 = this.f8772i * f5;
            }
        }
        if (z4 || this.f8771h != f4) {
            this.f8771h = f4;
            AbstractC0460c.a(surface, f4);
        }
    }
}
