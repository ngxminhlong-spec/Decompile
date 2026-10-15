package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.measurement.v2 */
/* loaded from: classes.dex */
public abstract class AbstractC1584v2 {

    /* renamed from: a */
    public static final Unsafe f12101a;

    /* renamed from: b */
    public static final Class f12102b;
    public static final AbstractC1580u2 c;
    public static final boolean d;

    /* renamed from: e */
    public static final boolean f12103e;

    /* renamed from: f */
    public static final long f12104f;

    /* renamed from: g */
    public static final boolean f12105g;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008c  */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    static {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.AbstractC1584v2.<clinit>():void");
    }

    public static void a(Class cls) {
        if (f12103e) {
            c.i(cls);
        }
    }

    public static Field b() {
        Field field;
        Field field2;
        int i4 = AbstractC1579u1.f12032a;
        try {
            field = Buffer.class.getDeclaredField("effectiveDirectAddress");
        } catch (Throwable unused) {
            field = null;
        }
        if (field != null) {
            return field;
        }
        try {
            field2 = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            field2 = null;
        }
        if (field2 == null || field2.getType() != Long.TYPE) {
            return null;
        }
        return field2;
    }

    public static void c(Object obj, long j4, byte b4) {
        long j5 = (-4) & j4;
        AbstractC1580u2 abstractC1580u2 = c;
        int j6 = abstractC1580u2.j(j5, obj);
        int i4 = ((~((int) j4)) & 3) << 3;
        abstractC1580u2.n(j5, obj, ((255 & b4) << i4) | (j6 & (~(255 << i4))));
    }

    public static void d(Object obj, long j4, byte b4) {
        long j5 = (-4) & j4;
        AbstractC1580u2 abstractC1580u2 = c;
        int i4 = (((int) j4) & 3) << 3;
        abstractC1580u2.n(j5, obj, ((255 & b4) << i4) | (abstractC1580u2.j(j5, obj) & (~(255 << i4))));
    }

    public static Object e(Class cls) {
        try {
            return f12101a.allocateInstance(cls);
        } catch (InstantiationException e4) {
            throw new IllegalStateException(e4);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.security.PrivilegedExceptionAction] */
    public static Unsafe f() {
        try {
            return (Unsafe) AccessController.doPrivileged((PrivilegedExceptionAction) new Object());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void g(long j4, Object obj, int i4) {
        c.n(j4, obj, i4);
    }

    public static void h(long j4, Object obj, Object obj2) {
        c.p(j4, obj, obj2);
    }

    public static /* bridge */ /* synthetic */ boolean i(long j4, Object obj) {
        return ((byte) ((c.j((-4) & j4, obj) >>> ((int) (((~j4) & 3) << 3))) & 255)) != 0;
    }

    public static /* bridge */ /* synthetic */ boolean j(long j4, Object obj) {
        return ((byte) ((c.j((-4) & j4, obj) >>> ((int) ((j4 & 3) << 3))) & 255)) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean k(Class cls) {
        int i4 = AbstractC1579u1.f12032a;
        try {
            Class cls2 = f12102b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static int l(Class cls) {
        if (f12103e) {
            return c.h(cls);
        }
        return -1;
    }
}
