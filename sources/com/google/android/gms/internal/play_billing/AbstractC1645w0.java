package com.google.android.gms.internal.play_billing;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.play_billing.w0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1645w0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Unsafe f12255a;

    /* renamed from: b, reason: collision with root package name */
    public static final Class f12256b;
    public static final AbstractC1643v0 c;
    public static final boolean d;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f12257e;

    /* renamed from: f, reason: collision with root package name */
    public static final long f12258f;

    /* renamed from: g, reason: collision with root package name */
    public static final boolean f12259g;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008c  */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    static {
        /*
            Method dump skipped, instructions count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.AbstractC1645w0.<clinit>():void");
    }

    public static void a(Class cls) {
        if (f12257e) {
            c.f12253a.arrayIndexScale(cls);
        }
    }

    public static Field b() {
        Field field;
        Field field2;
        int i4 = AbstractC1633q.f12240a;
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
        AbstractC1643v0 abstractC1643v0 = c;
        long j5 = (-4) & j4;
        int i4 = abstractC1643v0.f12253a.getInt(obj, j5);
        int i5 = ((~((int) j4)) & 3) << 3;
        abstractC1643v0.f12253a.putInt(obj, j5, ((255 & b4) << i5) | (i4 & (~(255 << i5))));
    }

    public static void d(Object obj, long j4, byte b4) {
        AbstractC1643v0 abstractC1643v0 = c;
        long j5 = (-4) & j4;
        int i4 = (((int) j4) & 3) << 3;
        abstractC1643v0.f12253a.putInt(obj, j5, ((255 & b4) << i4) | (abstractC1643v0.f12253a.getInt(obj, j5) & (~(255 << i4))));
    }

    public static int e(long j4, Object obj) {
        return c.f12253a.getInt(obj, j4);
    }

    public static long f(long j4, Object obj) {
        return c.f12253a.getLong(obj, j4);
    }

    public static Object g(Class cls) {
        try {
            return f12255a.allocateInstance(cls);
        } catch (InstantiationException e4) {
            throw new IllegalStateException(e4);
        }
    }

    public static Object h(long j4, Object obj) {
        return c.f12253a.getObject(obj, j4);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.security.PrivilegedExceptionAction] */
    public static Unsafe i() {
        try {
            return (Unsafe) AccessController.doPrivileged((PrivilegedExceptionAction) new Object());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void j(long j4, Object obj, int i4) {
        c.f12253a.putInt(obj, j4, i4);
    }

    public static void k(Object obj, long j4, long j5) {
        c.f12253a.putLong(obj, j4, j5);
    }

    public static void l(long j4, Object obj, Object obj2) {
        c.f12253a.putObject(obj, j4, obj2);
    }

    public static /* bridge */ /* synthetic */ boolean m(long j4, Object obj) {
        return ((byte) ((c.f12253a.getInt(obj, (-4) & j4) >>> ((int) (((~j4) & 3) << 3))) & 255)) != 0;
    }

    public static /* bridge */ /* synthetic */ boolean n(long j4, Object obj) {
        return ((byte) ((c.f12253a.getInt(obj, (-4) & j4) >>> ((int) ((j4 & 3) << 3))) & 255)) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean o(Class cls) {
        int i4 = AbstractC1633q.f12240a;
        try {
            Class cls2 = f12256b;
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

    public static int p(Class cls) {
        if (f12257e) {
            return c.f12253a.arrayBaseOffset(cls);
        }
        return -1;
    }
}
