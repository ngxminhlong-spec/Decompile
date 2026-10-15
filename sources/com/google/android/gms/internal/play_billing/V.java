package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class V implements InterfaceC1602a0 {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1602a0[] f12169a;

    public V(InterfaceC1602a0... interfaceC1602a0Arr) {
        this.f12169a = interfaceC1602a0Arr;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1602a0
    public final C1620j0 a(Class cls) {
        for (int i4 = 0; i4 < 2; i4++) {
            InterfaceC1602a0 interfaceC1602a0 = this.f12169a[i4];
            if (interfaceC1602a0.b(cls)) {
                return interfaceC1602a0.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1602a0
    public final boolean b(Class cls) {
        for (int i4 = 0; i4 < 2; i4++) {
            if (this.f12169a[i4].b(cls)) {
                return true;
            }
        }
        return false;
    }
}
