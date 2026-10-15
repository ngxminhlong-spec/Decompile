package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Z1 implements InterfaceC1506d2 {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1506d2[] f11868a;

    public Z1(InterfaceC1506d2... interfaceC1506d2Arr) {
        this.f11868a = interfaceC1506d2Arr;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1506d2
    public final C1545l2 a(Class cls) {
        for (int i4 = 0; i4 < 2; i4++) {
            InterfaceC1506d2 interfaceC1506d2 = this.f11868a[i4];
            if (interfaceC1506d2.b(cls)) {
                return interfaceC1506d2.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1506d2
    public final boolean b(Class cls) {
        for (int i4 = 0; i4 < 2; i4++) {
            if (this.f11868a[i4].b(cls)) {
                return true;
            }
        }
        return false;
    }
}
