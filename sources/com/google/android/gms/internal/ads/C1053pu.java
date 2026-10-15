package com.google.android.gms.internal.ads;

import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.pu, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1053pu extends Bs {

    /* renamed from: p, reason: collision with root package name */
    public static final Unsafe f10052p;

    /* renamed from: q, reason: collision with root package name */
    public static final long f10053q;

    /* renamed from: r, reason: collision with root package name */
    public static final long f10054r;

    /* renamed from: s, reason: collision with root package name */
    public static final long f10055s;

    /* renamed from: t, reason: collision with root package name */
    public static final long f10056t;

    /* renamed from: u, reason: collision with root package name */
    public static final long f10057u;

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.security.PrivilegedExceptionAction] */
    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (PrivilegedActionException e4) {
                throw new RuntimeException("Could not initialize intrinsics", e4.getCause());
            }
        } catch (SecurityException unused) {
            unsafe = (Unsafe) AccessController.doPrivileged((PrivilegedExceptionAction) new Object());
        }
        try {
            f10054r = unsafe.objectFieldOffset(AbstractC1138ru.class.getDeclaredField("q"));
            f10053q = unsafe.objectFieldOffset(AbstractC1138ru.class.getDeclaredField("p"));
            f10055s = unsafe.objectFieldOffset(AbstractC1138ru.class.getDeclaredField("o"));
            f10056t = unsafe.objectFieldOffset(C1096qu.class.getDeclaredField("a"));
            f10057u = unsafe.objectFieldOffset(C1096qu.class.getDeclaredField("b"));
            f10052p = unsafe;
        } catch (NoSuchFieldException e5) {
            throw new RuntimeException(e5);
        } catch (RuntimeException e6) {
            throw e6;
        }
    }

    @Override // com.google.android.gms.internal.ads.Bs
    public final void Q(C1096qu c1096qu, C1096qu c1096qu2) {
        f10052p.putObject(c1096qu, f10057u, c1096qu2);
    }

    @Override // com.google.android.gms.internal.ads.Bs
    public final void V(C1096qu c1096qu, Thread thread) {
        f10052p.putObject(c1096qu, f10056t, thread);
    }

    @Override // com.google.android.gms.internal.ads.Bs
    public final boolean b0(AbstractC1138ru abstractC1138ru, C0752iu c0752iu, C0752iu c0752iu2) {
        return AbstractC1224tu.a(f10052p, abstractC1138ru, f10053q, c0752iu, c0752iu2);
    }

    @Override // com.google.android.gms.internal.ads.Bs
    public final boolean e0(AbstractC1138ru abstractC1138ru, Object obj, Object obj2) {
        return AbstractC1224tu.a(f10052p, abstractC1138ru, f10055s, obj, obj2);
    }

    @Override // com.google.android.gms.internal.ads.Bs
    public final C0752iu f(AbstractC1138ru abstractC1138ru) {
        C0752iu c0752iu;
        C0752iu c0752iu2 = C0752iu.d;
        do {
            c0752iu = abstractC1138ru.f10549p;
            if (c0752iu2 == c0752iu) {
                break;
            }
        } while (!b0(abstractC1138ru, c0752iu, c0752iu2));
        return c0752iu;
    }

    @Override // com.google.android.gms.internal.ads.Bs
    public final boolean g0(AbstractC1138ru abstractC1138ru, C1096qu c1096qu, C1096qu c1096qu2) {
        return AbstractC1224tu.a(f10052p, abstractC1138ru, f10054r, c1096qu, c1096qu2);
    }

    @Override // com.google.android.gms.internal.ads.Bs
    public final C1096qu z(AbstractC1138ru abstractC1138ru) {
        C1096qu c1096qu;
        C1096qu c1096qu2 = C1096qu.c;
        do {
            c1096qu = abstractC1138ru.f10550q;
            if (c1096qu2 == c1096qu) {
                break;
            }
        } while (!g0(abstractC1138ru, c1096qu, c1096qu2));
        return c1096qu;
    }
}
