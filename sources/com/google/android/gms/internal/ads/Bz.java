package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Bz implements InterfaceC0429bA {

    /* renamed from: b, reason: collision with root package name */
    public static final Bz f4210b = new Bz(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4211a;

    public /* synthetic */ Bz(int i4) {
        this.f4211a = i4;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0429bA
    public final C0812kA a(Class cls) {
        switch (this.f4211a) {
            case 0:
                if (!Dz.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (C0812kA) Dz.i(cls.asSubclass(Dz.class)).s(3, null);
                } catch (Exception e4) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e4);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0429bA
    public final boolean b(Class cls) {
        switch (this.f4211a) {
            case 0:
                return Dz.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
