package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.iA, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0728iA {
    public static final C0728iA c = new C0728iA();

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f9034b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final C0874ln f9033a = new C0874ln(1);

    public final InterfaceC0984oA a(Class cls) {
        InterfaceC0984oA B4;
        Class cls2;
        Charset charset = Mz.f6292a;
        if (cls == null) {
            throw new NullPointerException("messageType");
        }
        ConcurrentHashMap concurrentHashMap = this.f9034b;
        InterfaceC0984oA interfaceC0984oA = (InterfaceC0984oA) concurrentHashMap.get(cls);
        if (interfaceC0984oA != null) {
            return interfaceC0984oA;
        }
        C0874ln c0874ln = this.f9033a;
        c0874ln.getClass();
        Class cls3 = AbstractC1027pA.f9909a;
        if (!Dz.class.isAssignableFrom(cls) && (cls2 = AbstractC1027pA.f9909a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        C0812kA a4 = ((Xz) c0874ln.f9467p).a(cls);
        int i4 = a4.d;
        AbstractC0417az abstractC0417az = a4.f9279a;
        if ((i4 & 2) == 2) {
            if (Dz.class.isAssignableFrom(cls)) {
                B4 = new C0556eA(AbstractC1027pA.c, AbstractC1401xz.f11315a, abstractC0417az);
            } else {
                C1198tA c1198tA = AbstractC1027pA.f9910b;
                C1358wz c1358wz = AbstractC1401xz.f11316b;
                if (c1358wz == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                B4 = new C0556eA(c1198tA, c1358wz, abstractC0417az);
            }
        } else if (Dz.class.isAssignableFrom(cls)) {
            if (a4.a() - 1 != 1) {
                int i5 = AbstractC0642gA.f8791a;
                Uz uz = Vz.f7313b;
                C1198tA c1198tA2 = AbstractC1027pA.c;
                C1358wz c1358wz2 = AbstractC1401xz.f11315a;
                int i6 = AbstractC0386aA.f8085a;
                B4 = C0514dA.B(a4, uz, c1198tA2, c1358wz2);
            } else {
                int i7 = AbstractC0642gA.f8791a;
                Uz uz2 = Vz.f7313b;
                C1198tA c1198tA3 = AbstractC1027pA.c;
                int i8 = AbstractC0386aA.f8085a;
                B4 = C0514dA.B(a4, uz2, c1198tA3, null);
            }
        } else if (a4.a() - 1 != 1) {
            int i9 = AbstractC0642gA.f8791a;
            Tz tz = Vz.f7312a;
            C1198tA c1198tA4 = AbstractC1027pA.f9910b;
            C1358wz c1358wz3 = AbstractC1401xz.f11316b;
            if (c1358wz3 == null) {
                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
            }
            int i10 = AbstractC0386aA.f8085a;
            B4 = C0514dA.B(a4, tz, c1198tA4, c1358wz3);
        } else {
            int i11 = AbstractC0642gA.f8791a;
            Tz tz2 = Vz.f7312a;
            C1198tA c1198tA5 = AbstractC1027pA.f9910b;
            int i12 = AbstractC0386aA.f8085a;
            B4 = C0514dA.B(a4, tz2, c1198tA5, null);
        }
        InterfaceC0984oA interfaceC0984oA2 = (InterfaceC0984oA) concurrentHashMap.putIfAbsent(cls, B4);
        return interfaceC0984oA2 == null ? B4 : interfaceC0984oA2;
    }
}
