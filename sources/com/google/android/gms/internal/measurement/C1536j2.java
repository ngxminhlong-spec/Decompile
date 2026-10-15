package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.measurement.j2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1536j2 {
    public static final C1536j2 c = new C1536j2();

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f11955b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final C1599z1 f11954a = new C1599z1(1);

    public final InterfaceC1549m2 a(Class cls) {
        InterfaceC1549m2 A3;
        Class cls2;
        Charset charset = O1.f11796a;
        if (cls == null) {
            throw new NullPointerException("messageType");
        }
        ConcurrentHashMap concurrentHashMap = this.f11955b;
        InterfaceC1549m2 interfaceC1549m2 = (InterfaceC1549m2) concurrentHashMap.get(cls);
        if (interfaceC1549m2 != null) {
            return interfaceC1549m2;
        }
        C1599z1 c1599z1 = this.f11954a;
        c1599z1.getClass();
        Class cls3 = AbstractC1553n2.f11986a;
        if (!I1.class.isAssignableFrom(cls) && (cls2 = AbstractC1553n2.f11986a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        C1545l2 a4 = ((Z1) c1599z1.f12124p).a(cls);
        int i4 = a4.d;
        AbstractC1571s1 abstractC1571s1 = a4.f11965a;
        if ((i4 & 2) == 2) {
            if (I1.class.isAssignableFrom(cls)) {
                A3 = new C1516f2(AbstractC1553n2.d, C1.f11710a, abstractC1571s1);
            } else {
                C1561p2 c1561p2 = AbstractC1553n2.f11987b;
                B1 b12 = C1.f11711b;
                if (b12 == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                A3 = new C1516f2(c1561p2, b12, abstractC1571s1);
            }
        } else if (I1.class.isAssignableFrom(cls)) {
            if ((a4.d & 1) == 1) {
                int i5 = AbstractC1526h2.f11941a;
                A3 = C1511e2.A(a4, W1.f11840b, AbstractC1553n2.d, C1.f11710a, AbstractC1501c2.f11900b);
            } else {
                int i6 = AbstractC1526h2.f11941a;
                A3 = C1511e2.A(a4, W1.f11840b, AbstractC1553n2.d, null, AbstractC1501c2.f11900b);
            }
        } else if ((a4.d & 1) == 1) {
            int i7 = AbstractC1526h2.f11941a;
            U1 u12 = W1.f11839a;
            C1561p2 c1561p22 = AbstractC1553n2.f11987b;
            B1 b13 = C1.f11711b;
            if (b13 == null) {
                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
            }
            A3 = C1511e2.A(a4, u12, c1561p22, b13, AbstractC1501c2.f11899a);
        } else {
            int i8 = AbstractC1526h2.f11941a;
            A3 = C1511e2.A(a4, W1.f11839a, AbstractC1553n2.c, null, AbstractC1501c2.f11899a);
        }
        InterfaceC1549m2 interfaceC1549m22 = (InterfaceC1549m2) concurrentHashMap.putIfAbsent(cls, A3);
        return interfaceC1549m22 == null ? A3 : interfaceC1549m22;
    }
}
