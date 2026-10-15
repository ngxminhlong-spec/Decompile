package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.play_billing.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1611f {

    /* renamed from: a, reason: collision with root package name */
    public final Object f12201a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f12202b;
    public final Object c;

    public C1611f(Object obj, Object obj2, Object obj3) {
        this.f12201a = obj;
        this.f12202b = obj2;
        this.c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.f12201a;
        String valueOf = String.valueOf(obj);
        String valueOf2 = String.valueOf(this.f12202b);
        String valueOf3 = String.valueOf(obj);
        String valueOf4 = String.valueOf(this.c);
        StringBuilder n4 = U.a.n("Multiple entries with same key: ", valueOf, "=", valueOf2, " and ");
        n4.append(valueOf3);
        n4.append("=");
        n4.append(valueOf4);
        return new IllegalArgumentException(n4.toString());
    }
}
