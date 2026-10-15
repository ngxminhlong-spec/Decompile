package com.google.android.gms.internal.play_billing;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.play_billing.h0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1616h0 {
    public static final C1616h0 c = new C1616h0();

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f12209b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final W f12208a = new W();

    public final InterfaceC1622k0 a(Class cls) {
        InterfaceC1622k0 u2;
        Class cls2;
        Charset charset = K.f12151a;
        if (cls == null) {
            throw new NullPointerException("messageType");
        }
        ConcurrentHashMap concurrentHashMap = this.f12209b;
        InterfaceC1622k0 interfaceC1622k0 = (InterfaceC1622k0) concurrentHashMap.get(cls);
        if (interfaceC1622k0 != null) {
            return interfaceC1622k0;
        }
        W w2 = this.f12208a;
        w2.getClass();
        Class cls3 = AbstractC1624l0.f12224a;
        if (!E.class.isAssignableFrom(cls) && (cls2 = AbstractC1624l0.f12224a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        C1620j0 a4 = ((V) w2.f12171a).a(cls);
        int i4 = a4.d;
        AbstractC1627n abstractC1627n = a4.f12217a;
        if ((i4 & 2) == 2) {
            if (E.class.isAssignableFrom(cls)) {
                u2 = new C1608d0(AbstractC1624l0.c, AbstractC1647y.f12260a, abstractC1627n);
            } else {
                C1630o0 c1630o0 = AbstractC1624l0.f12225b;
                C1646x c1646x = AbstractC1647y.f12261b;
                if (c1646x == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                u2 = new C1608d0(c1630o0, c1646x, abstractC1627n);
            }
        } else if (E.class.isAssignableFrom(cls)) {
            if (a4.a() - 1 != 1) {
                int i5 = AbstractC1612f0.f12203a;
                S s4 = T.f12166b;
                C1630o0 c1630o02 = AbstractC1624l0.c;
                C1646x c1646x2 = AbstractC1647y.f12260a;
                int i6 = Z.f12175a;
                u2 = C1606c0.u(a4, s4, c1630o02, c1646x2);
            } else {
                int i7 = AbstractC1612f0.f12203a;
                S s5 = T.f12166b;
                C1630o0 c1630o03 = AbstractC1624l0.c;
                int i8 = Z.f12175a;
                u2 = C1606c0.u(a4, s5, c1630o03, null);
            }
        } else if (a4.a() - 1 != 1) {
            int i9 = AbstractC1612f0.f12203a;
            Q q4 = T.f12165a;
            C1630o0 c1630o04 = AbstractC1624l0.f12225b;
            C1646x c1646x3 = AbstractC1647y.f12261b;
            if (c1646x3 == null) {
                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
            }
            int i10 = Z.f12175a;
            u2 = C1606c0.u(a4, q4, c1630o04, c1646x3);
        } else {
            int i11 = AbstractC1612f0.f12203a;
            Q q5 = T.f12165a;
            C1630o0 c1630o05 = AbstractC1624l0.f12225b;
            int i12 = Z.f12175a;
            u2 = C1606c0.u(a4, q5, c1630o05, null);
        }
        InterfaceC1622k0 interfaceC1622k02 = (InterfaceC1622k0) concurrentHashMap.putIfAbsent(cls, u2);
        return interfaceC1622k02 == null ? u2 : interfaceC1622k02;
    }
}
