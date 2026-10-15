package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.Base64;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.c4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0465c4 extends AbstractCallableC0892m4 {

    /* renamed from: i, reason: collision with root package name */
    public static final M3 f8343i = new M3(8);

    /* renamed from: h, reason: collision with root package name */
    public final Context f8344h;

    public C0465c4(U3 u32, C0549e3 c0549e3, int i4, Context context) {
        super(u32, "gL88T2vBvJS+jBemUvhPpVS5IeaU7cU4wFVgyT6PJl7pFldWXOd3mZxVZlQUSll5", "bObXLZFRWAdU6+me08AeNX2ciqxi45ddv3QSqAplzos=", c0549e3, i4, 29);
        this.f8344h = context;
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC0892m4
    public final void a() {
        C0549e3 c0549e3 = this.d;
        c0549e3.d();
        C0977o3.J0((C0977o3) c0549e3.f4561p, "E");
        AtomicReference c = f8343i.c(this.f8344h.getPackageName());
        if (c.get() == null) {
            synchronized (c) {
                try {
                    if (c.get() == null) {
                        c.set((String) this.f9562e.invoke(null, this.f8344h));
                    }
                } finally {
                }
            }
        }
        String str = (String) c.get();
        synchronized (this.d) {
            C0549e3 c0549e32 = this.d;
            String encodeToString = Base64.encodeToString(str.getBytes(), 11);
            c0549e32.d();
            C0977o3.J0((C0977o3) c0549e32.f4561p, encodeToString);
        }
    }
}
