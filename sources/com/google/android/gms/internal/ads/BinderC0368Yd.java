package com.google.android.gms.internal.ads;

import O1.AbstractBinderC0087s0;
import O1.C0091u0;
import android.os.RemoteException;
import b0.RunnableC0203p;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.Yd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC0368Yd extends AbstractBinderC0087s0 {

    /* renamed from: A, reason: collision with root package name */
    public boolean f7843A;

    /* renamed from: B, reason: collision with root package name */
    public J7 f7844B;

    /* renamed from: o, reason: collision with root package name */
    public final InterfaceC0308Md f7845o;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f7847q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f7848r;

    /* renamed from: s, reason: collision with root package name */
    public int f7849s;

    /* renamed from: t, reason: collision with root package name */
    public C0091u0 f7850t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f7851u;

    /* renamed from: w, reason: collision with root package name */
    public float f7853w;

    /* renamed from: x, reason: collision with root package name */
    public float f7854x;
    public float y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f7855z;

    /* renamed from: p, reason: collision with root package name */
    public final Object f7846p = new Object();

    /* renamed from: v, reason: collision with root package name */
    public boolean f7852v = true;

    public BinderC0368Yd(InterfaceC0308Md interfaceC0308Md, float f4, boolean z4, boolean z5) {
        this.f7845o = interfaceC0308Md;
        this.f7853w = f4;
        this.f7847q = z4;
        this.f7848r = z5;
    }

    @Override // O1.InterfaceC0089t0
    public final void D1(C0091u0 c0091u0) {
        synchronized (this.f7846p) {
            this.f7850t = c0091u0;
        }
    }

    public final void L3(float f4, float f5, int i4, boolean z4, float f6) {
        boolean z5;
        boolean z6;
        int i5;
        synchronized (this.f7846p) {
            try {
                z5 = true;
                if (f5 == this.f7853w && f6 == this.y) {
                    z5 = false;
                }
                this.f7853w = f5;
                this.f7854x = f4;
                z6 = this.f7852v;
                this.f7852v = z4;
                i5 = this.f7849s;
                this.f7849s = i4;
                float f7 = this.y;
                this.y = f6;
                if (Math.abs(f6 - f7) > 1.0E-4f) {
                    this.f7845o.L().invalidate();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z5) {
            try {
                J7 j7 = this.f7844B;
                if (j7 != null) {
                    j7.G1(j7.Q(), 2);
                }
            } catch (RemoteException e4) {
                Y9.u("#007 Could not call remote method.", e4);
            }
        }
        AbstractC0266Ec.f4899e.execute(new RunnableC0363Xd(this, i5, i4, z6, z4));
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.Map, r.i] */
    public final void M3(O1.R0 r02) {
        Object obj = this.f7846p;
        boolean z4 = r02.f1287o;
        boolean z5 = r02.f1288p;
        boolean z6 = r02.f1289q;
        synchronized (obj) {
            this.f7855z = z5;
            this.f7843A = z6;
        }
        String str = true != z4 ? "0" : "1";
        String str2 = true != z5 ? "0" : "1";
        String str3 = true != z6 ? "0" : "1";
        ?? iVar = new r.i(3);
        iVar.put("muteStart", str);
        iVar.put("customControlsRequested", str2);
        iVar.put("clickToExpandRequested", str3);
        N3("initialState", Collections.unmodifiableMap(iVar));
    }

    public final void N3(String str, Map map) {
        HashMap hashMap = map == null ? new HashMap() : new HashMap(map);
        hashMap.put("action", str);
        AbstractC0266Ec.f4899e.execute(new RunnableC0203p(15, this, hashMap));
    }

    @Override // O1.InterfaceC0089t0
    public final void U(boolean z4) {
        N3(true != z4 ? "unmute" : "mute", null);
    }

    @Override // O1.InterfaceC0089t0
    public final float a() {
        float f4;
        synchronized (this.f7846p) {
            f4 = this.y;
        }
        return f4;
    }

    @Override // O1.InterfaceC0089t0
    public final float d() {
        float f4;
        synchronized (this.f7846p) {
            f4 = this.f7854x;
        }
        return f4;
    }

    @Override // O1.InterfaceC0089t0
    public final int f() {
        int i4;
        synchronized (this.f7846p) {
            i4 = this.f7849s;
        }
        return i4;
    }

    @Override // O1.InterfaceC0089t0
    public final C0091u0 g() {
        C0091u0 c0091u0;
        synchronized (this.f7846p) {
            c0091u0 = this.f7850t;
        }
        return c0091u0;
    }

    @Override // O1.InterfaceC0089t0
    public final float h() {
        float f4;
        synchronized (this.f7846p) {
            f4 = this.f7853w;
        }
        return f4;
    }

    @Override // O1.InterfaceC0089t0
    public final void k() {
        N3("pause", null);
    }

    @Override // O1.InterfaceC0089t0
    public final void l() {
        N3("play", null);
    }

    @Override // O1.InterfaceC0089t0
    public final void m() {
        N3("stop", null);
    }

    @Override // O1.InterfaceC0089t0
    public final boolean n() {
        boolean z4;
        Object obj = this.f7846p;
        boolean o4 = o();
        synchronized (obj) {
            z4 = false;
            if (!o4) {
                try {
                    if (this.f7843A && this.f7848r) {
                        z4 = true;
                    }
                } finally {
                }
            }
        }
        return z4;
    }

    @Override // O1.InterfaceC0089t0
    public final boolean o() {
        boolean z4;
        synchronized (this.f7846p) {
            try {
                z4 = false;
                if (this.f7847q && this.f7855z) {
                    z4 = true;
                }
            } finally {
            }
        }
        return z4;
    }

    @Override // O1.InterfaceC0089t0
    public final boolean p() {
        boolean z4;
        synchronized (this.f7846p) {
            z4 = this.f7852v;
        }
        return z4;
    }

    public final void s() {
        boolean z4;
        int i4;
        int i5;
        synchronized (this.f7846p) {
            z4 = this.f7852v;
            i4 = this.f7849s;
            i5 = 3;
            this.f7849s = 3;
        }
        AbstractC0266Ec.f4899e.execute(new RunnableC0363Xd(this, i4, i5, z4, z4));
    }
}
