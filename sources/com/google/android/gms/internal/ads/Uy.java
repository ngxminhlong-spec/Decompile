package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Uy {

    /* renamed from: b, reason: collision with root package name */
    public static final Uy f7211b;
    public static final Uy c;

    /* renamed from: a, reason: collision with root package name */
    public final Ty f7212a;

    static {
        byte b4 = 0;
        f7211b = new Uy(new C0347Uc(16, b4));
        c = new Uy(new C0347Uc(20, b4));
        new Uy(new C0347Uc(22, b4));
        new Uy(new C0347Uc(21, b4));
        new Uy(new C0347Uc(17, b4));
        new Uy(new C0347Uc(19, b4));
        new Uy(new C0347Uc(18, b4));
    }

    public Uy(C0347Uc c0347Uc) {
        if (AbstractC1140rw.a()) {
            this.f7212a = new Sy(c0347Uc, 1);
        } else if ("The Android Project".equals(System.getProperty("java.vendor"))) {
            this.f7212a = new Sy(c0347Uc, 0);
        } else {
            this.f7212a = new Xj(22, c0347Uc);
        }
    }
}
