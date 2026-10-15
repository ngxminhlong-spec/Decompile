package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class AB implements InterfaceC1457zB, InterfaceC1328wB {

    /* renamed from: b, reason: collision with root package name */
    public static final AB f3929b = new AB(null);

    /* renamed from: a, reason: collision with root package name */
    public final Object f3930a;

    public AB(Object obj) {
        this.f3930a = obj;
    }

    public static AB a(Object obj) {
        AbstractC0587ez.f(obj, "instance cannot be null");
        return new AB(obj);
    }

    public static AB b(Object obj) {
        return obj == null ? f3929b : new AB(obj);
    }

    @Override // com.google.android.gms.internal.ads.FB
    public final Object c() {
        return this.f3930a;
    }
}
