package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class C implements InterfaceC1602a0 {

    /* renamed from: b, reason: collision with root package name */
    public static final C f12133b = new C(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12134a;

    public /* synthetic */ C(int i4) {
        this.f12134a = i4;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1602a0
    public final C1620j0 a(Class cls) {
        switch (this.f12134a) {
            case 0:
                if (!E.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (C1620j0) E.d(cls.asSubclass(E.class)).k(3);
                } catch (Exception e4) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e4);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1602a0
    public final boolean b(Class cls) {
        switch (this.f12134a) {
            case 0:
                return E.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
