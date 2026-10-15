package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Xz implements InterfaceC0429bA {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0429bA[] f7722a;

    public Xz(InterfaceC0429bA... interfaceC0429bAArr) {
        this.f7722a = interfaceC0429bAArr;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0429bA
    public final C0812kA a(Class cls) {
        for (int i4 = 0; i4 < 2; i4++) {
            InterfaceC0429bA interfaceC0429bA = this.f7722a[i4];
            if (interfaceC0429bA.b(cls)) {
                return interfaceC0429bA.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0429bA
    public final boolean b(Class cls) {
        for (int i4 = 0; i4 < 2; i4++) {
            if (this.f7722a[i4].b(cls)) {
                return true;
            }
        }
        return false;
    }
}
