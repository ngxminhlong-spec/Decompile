package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class Dz extends AbstractC0417az {
    private static final Map zzb = new ConcurrentHashMap();
    protected C1155sA zzc;
    private int zzd;

    public Dz() {
        this.zza = 0;
        this.zzd = -1;
        this.zzc = C1155sA.f10596f;
    }

    public static Dz i(Class cls) {
        Map map = zzb;
        Dz dz = (Dz) map.get(cls);
        if (dz == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                dz = (Dz) map.get(cls);
            } catch (ClassNotFoundException e4) {
                throw new IllegalStateException("Class initialization cannot fail.", e4);
            }
        }
        if (dz != null) {
            return dz;
        }
        Dz dz2 = (Dz) ((Dz) BA.i(cls)).s(6, null);
        if (dz2 == null) {
            throw new IllegalStateException();
        }
        map.put(cls, dz2);
        return dz2;
    }

    public static Dz k(Dz dz, AbstractC0886lz abstractC0886lz, C1315vz c1315vz) {
        AbstractC1012ow t4 = abstractC0886lz.t();
        Dz j4 = dz.j();
        try {
            InterfaceC0984oA a4 = C0728iA.c.a(j4.getClass());
            C1058pz c1058pz = (C1058pz) t4.f9865b;
            if (c1058pz == null) {
                c1058pz = new C1058pz(t4);
            }
            a4.h(j4, c1058pz, c1315vz);
            a4.b(j4);
            t4.B(0);
            t(j4);
            return j4;
        } catch (Oz e4) {
            if (e4.f6544o) {
                throw new IOException(e4.getMessage(), e4);
            }
            throw e4;
        } catch (C1112rA e5) {
            throw new IOException(e5.getMessage());
        } catch (IOException e6) {
            if (e6.getCause() instanceof Oz) {
                throw ((Oz) e6.getCause());
            }
            throw new IOException(e6.getMessage(), e6);
        } catch (RuntimeException e7) {
            if (e7.getCause() instanceof Oz) {
                throw ((Oz) e7.getCause());
            }
            throw e7;
        }
    }

    public static Lz l(Lz lz) {
        int size = lz.size();
        return lz.c(size == 0 ? 10 : size + size);
    }

    public static Object m(Method method, Dz dz, Object... objArr) {
        try {
            return method.invoke(dz, objArr);
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

    public static void o(Class cls, Dz dz) {
        dz.n();
        zzb.put(cls, dz);
    }

    public static void t(Dz dz) {
        if (!dz.q()) {
            throw new IOException(new C1112rA().getMessage());
        }
    }

    public static Dz u(Dz dz, byte[] bArr, int i4, C1315vz c1315vz) {
        Dz j4 = dz.j();
        try {
            InterfaceC0984oA a4 = C0728iA.c.a(j4.getClass());
            a4.j(j4, bArr, 0, i4, new C0544dz(c1315vz));
            a4.b(j4);
            return j4;
        } catch (Oz e4) {
            if (e4.f6544o) {
                throw new IOException(e4.getMessage(), e4);
            }
            throw e4;
        } catch (C1112rA e5) {
            throw new IOException(e5.getMessage());
        } catch (IOException e6) {
            if (e6.getCause() instanceof Oz) {
                throw ((Oz) e6.getCause());
            }
            throw new IOException(e6.getMessage(), e6);
        } catch (IndexOutOfBoundsException unused) {
            throw Oz.f();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0417az
    public final void a(AbstractC1229tz abstractC1229tz) {
        InterfaceC0984oA a4 = C0728iA.c.a(getClass());
        C1384xi c1384xi = abstractC1229tz.f10762b;
        if (c1384xi == null) {
            c1384xi = new C1384xi(abstractC1229tz);
        }
        a4.f(this, c1384xi);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0417az
    public final int b(InterfaceC0984oA interfaceC0984oA) {
        if (r()) {
            int g4 = interfaceC0984oA.g(this);
            if (g4 >= 0) {
                return g4;
            }
            throw new IllegalStateException(U.a.i("serialized size must be non-negative, was ", g4));
        }
        int i4 = this.zzd & Integer.MAX_VALUE;
        if (i4 != Integer.MAX_VALUE) {
            return i4;
        }
        int g5 = interfaceC0984oA.g(this);
        if (g5 < 0) {
            throw new IllegalStateException(U.a.i("serialized size must be non-negative, was ", g5));
        }
        this.zzd = (this.zzd & Integer.MIN_VALUE) | g5;
        return g5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return C0728iA.c.a(getClass()).i(this, (Dz) obj);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0417az
    public final int f() {
        if (r()) {
            int g4 = C0728iA.c.a(getClass()).g(this);
            if (g4 >= 0) {
                return g4;
            }
            throw new IllegalStateException(U.a.i("serialized size must be non-negative, was ", g4));
        }
        int i4 = this.zzd & Integer.MAX_VALUE;
        if (i4 != Integer.MAX_VALUE) {
            return i4;
        }
        int g5 = C0728iA.c.a(getClass()).g(this);
        if (g5 < 0) {
            throw new IllegalStateException(U.a.i("serialized size must be non-negative, was ", g5));
        }
        this.zzd = (this.zzd & Integer.MIN_VALUE) | g5;
        return g5;
    }

    public final Cz g() {
        return (Cz) s(5, null);
    }

    public final Cz h() {
        Cz cz = (Cz) s(5, null);
        if (!cz.f4560o.equals(this)) {
            if (!cz.f4561p.r()) {
                Dz j4 = cz.f4560o.j();
                C0728iA.c.a(j4.getClass()).d(j4, cz.f4561p);
                cz.f4561p = j4;
            }
            Dz dz = cz.f4561p;
            C0728iA.c.a(dz.getClass()).d(dz, this);
        }
        return cz;
    }

    public final int hashCode() {
        if (r()) {
            return C0728iA.c.a(getClass()).e(this);
        }
        int i4 = this.zza;
        if (i4 != 0) {
            return i4;
        }
        int e4 = C0728iA.c.a(getClass()).e(this);
        this.zza = e4;
        return e4;
    }

    public final Dz j() {
        return (Dz) s(4, null);
    }

    public final void n() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final void p() {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    public final boolean q() {
        byte byteValue = ((Byte) s(1, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean c = C0728iA.c.a(getClass()).c(this);
        s(2, true == c ? this : null);
        return c;
    }

    public final boolean r() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    public abstract Object s(int i4, Dz dz);

    public final String toString() {
        String obj = super.toString();
        char[] cArr = AbstractC0471cA.f8350a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        AbstractC0471cA.c(this, sb, 0);
        return sb.toString();
    }
}
