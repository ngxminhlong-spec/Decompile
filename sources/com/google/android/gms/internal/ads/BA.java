package com.google.android.gms.internal.ads;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class BA {

    /* renamed from: a, reason: collision with root package name */
    public static final Unsafe f4031a;

    /* renamed from: b, reason: collision with root package name */
    public static final Class f4032b;
    public static final AA c;
    public static final boolean d;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f4033e;

    /* renamed from: f, reason: collision with root package name */
    public static final long f4034f;

    /* renamed from: g, reason: collision with root package name */
    public static final long f4035g;

    /* renamed from: h, reason: collision with root package name */
    public static final boolean f4036h;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008e  */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    static {
        /*
            Method dump skipped, instructions count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.BA.<clinit>():void");
    }

    public static int a(Class cls) {
        if (f4033e) {
            return ((Unsafe) c.f3928o).arrayBaseOffset(cls);
        }
        return -1;
    }

    public static void b(Class cls) {
        if (f4033e) {
            ((Unsafe) c.f3928o).arrayIndexScale(cls);
        }
    }

    public static Field c() {
        Field field;
        Field field2;
        int i4 = AbstractC0502cz.f8431a;
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

    public static void d(Object obj, long j4, byte b4) {
        AA aa = c;
        long j5 = (-4) & j4;
        int i4 = ((Unsafe) aa.f3928o).getInt(obj, j5);
        int i5 = ((~((int) j4)) & 3) << 3;
        ((Unsafe) aa.f3928o).putInt(obj, j5, ((255 & b4) << i5) | (i4 & (~(255 << i5))));
    }

    public static void e(Object obj, long j4, byte b4) {
        AA aa = c;
        long j5 = (-4) & j4;
        int i4 = (((int) j4) & 3) << 3;
        ((Unsafe) aa.f3928o).putInt(obj, j5, ((255 & b4) << i4) | (((Unsafe) aa.f3928o).getInt(obj, j5) & (~(255 << i4))));
    }

    public static int f(long j4, Object obj) {
        return ((Unsafe) c.f3928o).getInt(obj, j4);
    }

    public static long g(ByteBuffer byteBuffer) {
        return ((Unsafe) c.f3928o).getLong(byteBuffer, f4035g);
    }

    public static long h(long j4, Object obj) {
        return ((Unsafe) c.f3928o).getLong(obj, j4);
    }

    public static Object i(Class cls) {
        try {
            return f4031a.allocateInstance(cls);
        } catch (InstantiationException e4) {
            throw new IllegalStateException(e4);
        }
    }

    public static Object j(long j4, Object obj) {
        return ((Unsafe) c.f3928o).getObject(obj, j4);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.security.PrivilegedExceptionAction] */
    public static Unsafe k() {
        try {
            return (Unsafe) AccessController.doPrivileged((PrivilegedExceptionAction) new Object());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void l(byte[] bArr, long j4, byte b4) {
        c.c1(bArr, f4034f + j4, b4);
    }

    public static void m(long j4, Object obj, int i4) {
        ((Unsafe) c.f3928o).putInt(obj, j4, i4);
    }

    public static void n(Object obj, long j4, long j5) {
        ((Unsafe) c.f3928o).putLong(obj, j4, j5);
    }

    public static void o(long j4, Object obj, Object obj2) {
        ((Unsafe) c.f3928o).putObject(obj, j4, obj2);
    }

    public static /* bridge */ /* synthetic */ boolean p(long j4, Object obj) {
        return ((byte) ((((Unsafe) c.f3928o).getInt(obj, (-4) & j4) >>> ((int) (((~j4) & 3) << 3))) & 255)) != 0;
    }

    public static /* bridge */ /* synthetic */ boolean q(long j4, Object obj) {
        return ((byte) ((((Unsafe) c.f3928o).getInt(obj, (-4) & j4) >>> ((int) ((j4 & 3) << 3))) & 255)) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean r(Class cls) {
        int i4 = AbstractC0502cz.f8431a;
        try {
            Class cls2 = f4032b;
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
}
