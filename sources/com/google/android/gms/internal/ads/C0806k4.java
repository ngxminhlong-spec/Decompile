package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.k4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0806k4 extends AbstractCallableC0892m4 {

    /* renamed from: h, reason: collision with root package name */
    public final Y3 f9259h;

    /* renamed from: i, reason: collision with root package name */
    public final long f9260i;

    public C0806k4(U3 u32, C0549e3 c0549e3, int i4, Y3 y32) {
        super(u32, "nIX5dAPvXYWFIvHlyxyLt0TnZ91UnAjFxZwf2qcoWSGcs+p5B5p88VCOzepPfMpE", "qUEdP6yfmpdCkPVqoE8EyrX/MPjGh4YKRo5g3kOeMoc=", c0549e3, i4, 53);
        this.f9259h = y32;
        if (y32 != null) {
            if (y32.f7741z <= -2) {
                WeakReference weakReference = y32.f7738v;
                if ((weakReference != null ? (View) weakReference.get() : null) == null) {
                    y32.f7741z = -3L;
                }
            }
            this.f9260i = y32.f7741z;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC0892m4
    public final void a() {
        if (this.f9259h != null) {
            long longValue = ((Long) this.f9562e.invoke(null, Long.valueOf(this.f9260i))).longValue();
            C0549e3 c0549e3 = this.d;
            c0549e3.d();
            C0977o3.K((C0977o3) c0549e3.f4561p, longValue);
        }
    }
}
