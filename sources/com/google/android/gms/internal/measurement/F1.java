package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class F1 implements InterfaceC1506d2 {

    /* renamed from: b, reason: collision with root package name */
    public static final F1 f11729b = new F1(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11730a;

    public /* synthetic */ F1(int i4) {
        this.f11730a = i4;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1506d2
    public final C1545l2 a(Class cls) {
        switch (this.f11730a) {
            case 0:
                if (!I1.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (C1545l2) I1.j(cls.asSubclass(I1.class)).k(3);
                } catch (Exception e4) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e4);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1506d2
    public final boolean b(Class cls) {
        switch (this.f11730a) {
            case 0:
                return I1.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
