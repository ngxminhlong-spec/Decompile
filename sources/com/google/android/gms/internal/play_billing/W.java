package com.google.android.gms.internal.play_billing;

import java.nio.charset.Charset;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class W {

    /* renamed from: b, reason: collision with root package name */
    public static final C f12170b = new C(1);

    /* renamed from: a, reason: collision with root package name */
    public final Object f12171a;

    public W() {
        InterfaceC1602a0 interfaceC1602a0;
        try {
            interfaceC1602a0 = (InterfaceC1602a0) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            interfaceC1602a0 = f12170b;
        }
        V v4 = new V(C.f12133b, interfaceC1602a0);
        Charset charset = K.f12151a;
        this.f12171a = v4;
    }

    public W(C1640u c1640u) {
        Charset charset = K.f12151a;
        this.f12171a = c1640u;
        c1640u.f12249n0 = this;
    }

    public void a(int i4, Object obj, InterfaceC1622k0 interfaceC1622k0) {
        C1640u c1640u = (C1640u) this.f12171a;
        c1640u.f0(i4, 3);
        interfaceC1622k0.f((AbstractC1627n) obj, c1640u.f12249n0);
        c1640u.f0(i4, 4);
    }

    public void b(int i4, Object obj, InterfaceC1622k0 interfaceC1622k0) {
        AbstractC1627n abstractC1627n = (AbstractC1627n) obj;
        C1640u c1640u = (C1640u) this.f12171a;
        c1640u.h0((i4 << 3) | 2);
        c1640u.h0(abstractC1627n.a(interfaceC1622k0));
        interfaceC1622k0.f(abstractC1627n, c1640u.f12249n0);
    }
}
