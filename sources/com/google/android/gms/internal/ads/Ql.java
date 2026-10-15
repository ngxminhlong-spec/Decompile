package com.google.android.gms.internal.ads;

import O1.C0101z0;
import android.os.Bundle;
import java.util.Collections;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Ql implements Yg, Lg {

    /* renamed from: q, reason: collision with root package name */
    public static final Object f6689q = new Object();

    /* renamed from: r, reason: collision with root package name */
    public static int f6690r;

    /* renamed from: o, reason: collision with root package name */
    public final Q1.K f6691o;

    /* renamed from: p, reason: collision with root package name */
    public final Tl f6692p;

    public Ql(Tl tl, Q1.K k3) {
        this.f6692p = tl;
        this.f6691o = k3;
    }

    @Override // com.google.android.gms.internal.ads.Lg
    public final void J(C0101z0 c0101z0) {
        a(false);
    }

    @Override // com.google.android.gms.internal.ads.Yg
    public final void M() {
        a(true);
    }

    public final void a(boolean z4) {
        int i4;
        int intValue;
        C0937n6 c0937n6 = AbstractC1066q6.r5;
        O1.r rVar = O1.r.d;
        if (((Boolean) rVar.c.a(c0937n6)).booleanValue() && !this.f6691o.q()) {
            Object obj = f6689q;
            synchronized (obj) {
                i4 = f6690r;
                intValue = ((Integer) rVar.c.a(AbstractC1066q6.s5)).intValue();
            }
            if (i4 < intValue) {
                Tl tl = this.f6692p;
                V2.j jVar = tl.d;
                ((C1469zh) jVar.f1901l).b();
                C0834kq d = new C0381a5((C1006oq) jVar.f1892a, EnumC0877lq.f9483p, null, C1006oq.d, Collections.EMPTY_LIST, ((Io) jVar.f1898i).a(new Bundle())).d();
                d.a(new Nu(0, d, new B0.q(tl, z4)), AbstractC0266Ec.f4900f);
                synchronized (obj) {
                    f6690r++;
                }
            }
        }
    }
}
