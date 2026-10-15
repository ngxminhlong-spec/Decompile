package com.google.android.gms.internal.ads;

import android.net.NetworkCapabilities;
import java.util.HashMap;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.i4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0722i4 extends AbstractCallableC0892m4 {

    /* renamed from: h, reason: collision with root package name */
    public final M3 f9023h;

    /* renamed from: i, reason: collision with root package name */
    public final long f9024i;

    /* renamed from: j, reason: collision with root package name */
    public final long f9025j;

    public C0722i4(U3 u32, C0549e3 c0549e3, int i4, M3 m32, long j4, long j5) {
        super(u32, "KHu8Xbxzr2mu9S25CNgKE5zXBf18Zj2waiAPYoFRjyhOXCyg+mYLv2x/JjCH7GjX", "NOrE2caDXO4nkFR2Fjy7NgGPKtPlIg1WAorknI/US68=", c0549e3, i4, 11);
        this.f9023h = m32;
        this.f9024i = j4;
        this.f9025j = j5;
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC0892m4
    public final void a() {
        M3 m32 = this.f9023h;
        if (m32 != null) {
            String str = (String) this.f9562e.invoke(null, (NetworkCapabilities) m32.f6208p, Long.valueOf(this.f9024i), Long.valueOf(this.f9025j));
            K3 k3 = new K3();
            HashMap i4 = AbstractC1230u.i(str);
            if (i4 != null) {
                k3.c = (Long) i4.get(0);
                k3.d = (Long) i4.get(1);
                k3.f5970e = (Long) i4.get(2);
            }
            synchronized (this.d) {
                try {
                    C0549e3 c0549e3 = this.d;
                    long longValue = k3.c.longValue();
                    c0549e3.d();
                    C0977o3.z0((C0977o3) c0549e3.f4561p, longValue);
                    if (((Long) k3.d).longValue() >= 0) {
                        C0549e3 c0549e32 = this.d;
                        long longValue2 = ((Long) k3.d).longValue();
                        c0549e32.d();
                        C0977o3.W((C0977o3) c0549e32.f4561p, longValue2);
                    }
                    if (((Long) k3.f5970e).longValue() >= 0) {
                        C0549e3 c0549e33 = this.d;
                        long longValue3 = ((Long) k3.f5970e).longValue();
                        c0549e33.d();
                        C0977o3.X((C0977o3) c0549e33.f4561p, longValue3);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
