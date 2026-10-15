package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.yB, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1414yB implements FB, InterfaceC1328wB {
    public static final Object c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile FB f11340a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f11341b = c;

    public C1414yB(FB fb) {
        this.f11340a = fb;
    }

    public static InterfaceC1328wB a(FB fb) {
        if (fb instanceof InterfaceC1328wB) {
            return (InterfaceC1328wB) fb;
        }
        fb.getClass();
        return new C1414yB(fb);
    }

    public static C1414yB b(FB fb) {
        return fb instanceof C1414yB ? (C1414yB) fb : new C1414yB(fb);
    }

    @Override // com.google.android.gms.internal.ads.FB
    public final Object c() {
        Object obj;
        Object obj2 = this.f11341b;
        Object obj3 = c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f11341b;
                if (obj == obj3) {
                    obj = this.f11340a.c();
                    Object obj4 = this.f11341b;
                    if (obj4 != obj3 && obj4 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.f11341b = obj;
                    this.f11340a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
