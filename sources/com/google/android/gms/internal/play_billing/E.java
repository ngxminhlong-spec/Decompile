package com.google.android.gms.internal.play_billing;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class E extends AbstractC1627n {
    private static final Map zzb = new ConcurrentHashMap();
    protected C1628n0 zzc;
    private int zzd;

    public E() {
        this.zza = 0;
        this.zzd = -1;
        this.zzc = C1628n0.f12233f;
    }

    public static E d(Class cls) {
        Map map = zzb;
        E e4 = (E) map.get(cls);
        if (e4 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                e4 = (E) map.get(cls);
            } catch (ClassNotFoundException e5) {
                throw new IllegalStateException("Class initialization cannot fail.", e5);
            }
        }
        if (e4 != null) {
            return e4;
        }
        E e6 = (E) ((E) AbstractC1645w0.g(cls)).k(6);
        if (e6 == null) {
            throw new IllegalStateException();
        }
        map.put(cls, e6);
        return e6;
    }

    public static Object e(Method method, E e4, Object... objArr) {
        try {
            return method.invoke(e4, objArr);
        } catch (IllegalAccessException e5) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e5);
        } catch (InvocationTargetException e6) {
            Throwable cause = e6.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static void g(Class cls, E e4) {
        e4.f();
        zzb.put(cls, e4);
    }

    public static final boolean i(E e4, boolean z4) {
        byte byteValue = ((Byte) e4.k(1)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean c = C1616h0.c.a(e4.getClass()).c(e4);
        if (z4) {
            e4.k(2);
        }
        return c;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1627n
    public final int a(InterfaceC1622k0 interfaceC1622k0) {
        if (j()) {
            int h4 = interfaceC1622k0.h(this);
            if (h4 >= 0) {
                return h4;
            }
            throw new IllegalStateException(U.a.i("serialized size must be non-negative, was ", h4));
        }
        int i4 = this.zzd & Integer.MAX_VALUE;
        if (i4 != Integer.MAX_VALUE) {
            return i4;
        }
        int h5 = interfaceC1622k0.h(this);
        if (h5 < 0) {
            throw new IllegalStateException(U.a.i("serialized size must be non-negative, was ", h5));
        }
        this.zzd = (this.zzd & Integer.MIN_VALUE) | h5;
        return h5;
    }

    public final int c() {
        if (j()) {
            int h4 = C1616h0.c.a(getClass()).h(this);
            if (h4 >= 0) {
                return h4;
            }
            throw new IllegalStateException(U.a.i("serialized size must be non-negative, was ", h4));
        }
        int i4 = this.zzd & Integer.MAX_VALUE;
        if (i4 != Integer.MAX_VALUE) {
            return i4;
        }
        int h5 = C1616h0.c.a(getClass()).h(this);
        if (h5 < 0) {
            throw new IllegalStateException(U.a.i("serialized size must be non-negative, was ", h5));
        }
        this.zzd = (this.zzd & Integer.MIN_VALUE) | h5;
        return h5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return C1616h0.c.a(getClass()).e(this, (E) obj);
    }

    public final void f() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final void h() {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    public final int hashCode() {
        if (j()) {
            return C1616h0.c.a(getClass()).i(this);
        }
        int i4 = this.zza;
        if (i4 != 0) {
            return i4;
        }
        int i5 = C1616h0.c.a(getClass()).i(this);
        this.zza = i5;
        return i5;
    }

    public final boolean j() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    public abstract Object k(int i4);

    public final String toString() {
        String obj = super.toString();
        char[] cArr = AbstractC1604b0.f12181a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        AbstractC1604b0.c(this, sb, 0);
        return sb.toString();
    }
}
