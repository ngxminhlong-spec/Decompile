package com.google.android.gms.internal.measurement;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class I1 extends AbstractC1571s1 {
    private static final Map zza = new ConcurrentHashMap();
    protected C1557o2 zzc;
    protected int zzd;

    public I1() {
        this.zzb = 0;
        this.zzc = C1557o2.f11992f;
        this.zzd = -1;
    }

    public static Y1 d(M1 m12) {
        int size = m12.size();
        int i4 = size == 0 ? 10 : size + size;
        Y1 y12 = (Y1) m12;
        if (i4 >= y12.f11855q) {
            return new Y1(Arrays.copyOf(y12.f11854p, i4), y12.f11855q);
        }
        throw new IllegalArgumentException();
    }

    public static N1 e(N1 n12) {
        int size = n12.size();
        return n12.c(size == 0 ? 10 : size + size);
    }

    public static Object f(Method method, I1 i12, Object... objArr) {
        try {
            return method.invoke(i12, objArr);
        } catch (IllegalAccessException e4) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e4);
        } catch (InvocationTargetException e5) {
            Throwable cause = e5.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static void g(Class cls, I1 i12) {
        zza.put(cls, i12);
    }

    public static I1 j(Class cls) {
        Map map = zza;
        I1 i12 = (I1) map.get(cls);
        if (i12 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                i12 = (I1) map.get(cls);
            } catch (ClassNotFoundException e4) {
                throw new IllegalStateException("Class initialization cannot fail.", e4);
            }
        }
        if (i12 != null) {
            return i12;
        }
        I1 i13 = (I1) ((I1) AbstractC1584v2.e(cls)).k(6);
        if (i13 == null) {
            throw new IllegalStateException();
        }
        map.put(cls, i13);
        return i13;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1571s1
    public final int c() {
        int i4 = this.zzd;
        if (i4 != -1) {
            return i4;
        }
        int l4 = C1536j2.c.a(getClass()).l(this);
        this.zzd = l4;
        return l4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return C1536j2.c.a(getClass()).h(this, (I1) obj);
        }
        return false;
    }

    public final H1 h() {
        return (H1) k(5);
    }

    public final int hashCode() {
        int i4 = this.zzb;
        if (i4 != 0) {
            return i4;
        }
        int f4 = C1536j2.c.a(getClass()).f(this);
        this.zzb = f4;
        return f4;
    }

    public final H1 i() {
        H1 h12 = (H1) k(5);
        h12.b(this);
        return h12;
    }

    public abstract Object k(int i4);

    public final String toString() {
        String obj = super.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        AbstractC1515f1.s(this, sb, 0);
        return sb.toString();
    }
}
