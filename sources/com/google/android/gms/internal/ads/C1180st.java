package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.st, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1180st {

    /* renamed from: a, reason: collision with root package name */
    public final Object f10651a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f10652b;
    public final Object c;

    public C1180st(Object obj, Object obj2, Object obj3) {
        this.f10651a = obj;
        this.f10652b = obj2;
        this.c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.f10651a;
        String valueOf = String.valueOf(obj);
        String valueOf2 = String.valueOf(this.f10652b);
        String valueOf3 = String.valueOf(obj);
        String valueOf4 = String.valueOf(this.c);
        StringBuilder n4 = U.a.n("Multiple entries with same key: ", valueOf, "=", valueOf2, " and ");
        n4.append(valueOf3);
        n4.append("=");
        n4.append(valueOf4);
        return new IllegalArgumentException(n4.toString());
    }
}
