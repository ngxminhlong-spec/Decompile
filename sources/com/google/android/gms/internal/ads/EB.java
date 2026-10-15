package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class EB implements FB {
    public static final Object c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile InterfaceC1457zB f4854a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f4855b;

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, com.google.android.gms.internal.ads.EB, com.google.android.gms.internal.ads.FB] */
    public static FB a(InterfaceC1457zB interfaceC1457zB) {
        if ((interfaceC1457zB instanceof EB) || (interfaceC1457zB instanceof C1414yB)) {
            return interfaceC1457zB;
        }
        ?? obj = new Object();
        obj.f4855b = c;
        obj.f4854a = interfaceC1457zB;
        return obj;
    }

    @Override // com.google.android.gms.internal.ads.FB
    public final Object c() {
        Object obj = this.f4855b;
        if (obj != c) {
            return obj;
        }
        InterfaceC1457zB interfaceC1457zB = this.f4854a;
        if (interfaceC1457zB == null) {
            return this.f4855b;
        }
        Object c2 = interfaceC1457zB.c();
        this.f4855b = c2;
        this.f4854a = null;
        return c2;
    }
}
