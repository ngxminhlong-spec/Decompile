package m0;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import r.e;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: m0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1804a {

    /* renamed from: a, reason: collision with root package name */
    public final e f13975a;

    /* renamed from: b, reason: collision with root package name */
    public final e f13976b;
    public final e c;

    public AbstractC1804a(e eVar, e eVar2, e eVar3) {
        this.f13975a = eVar;
        this.f13976b = eVar2;
        this.c = eVar3;
    }

    public abstract b a();

    public final Class b(Class cls) {
        String name = cls.getName();
        e eVar = this.c;
        Class cls2 = (Class) eVar.get(name);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
        eVar.put(cls.getName(), cls3);
        return cls3;
    }

    public final Method c(String str) {
        e eVar = this.f13975a;
        Method method = (Method) eVar.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, AbstractC1804a.class.getClassLoader()).getDeclaredMethod("read", AbstractC1804a.class);
        eVar.put(str, declaredMethod);
        return declaredMethod;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Method d(Class cls) {
        String name = cls.getName();
        e eVar = this.f13976b;
        Method method = (Method) eVar.get(name);
        if (method != null) {
            return method;
        }
        Class b4 = b(cls);
        System.currentTimeMillis();
        Method declaredMethod = b4.getDeclaredMethod("write", cls, AbstractC1804a.class);
        eVar.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public abstract boolean e(int i4);

    public final int f(int i4, int i5) {
        return !e(i5) ? i4 : ((b) this).f13977e.readInt();
    }

    public final Parcelable g(Parcelable parcelable, int i4) {
        if (!e(i4)) {
            return parcelable;
        }
        return ((b) this).f13977e.readParcelable(b.class.getClassLoader());
    }

    public final c h() {
        String readString = ((b) this).f13977e.readString();
        if (readString == null) {
            return null;
        }
        try {
            return (c) c(readString).invoke(null, a());
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
        } catch (IllegalAccessException e5) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e5);
        } catch (NoSuchMethodException e6) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e6);
        } catch (InvocationTargetException e7) {
            if (e7.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e7.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e7);
        }
    }

    public abstract void i(int i4);

    public final void j(int i4, int i5) {
        i(i5);
        ((b) this).f13977e.writeInt(i4);
    }

    public final void k(c cVar) {
        if (cVar == null) {
            ((b) this).f13977e.writeString(null);
            return;
        }
        try {
            ((b) this).f13977e.writeString(b(cVar.getClass()).getName());
            b a4 = a();
            try {
                d(cVar.getClass()).invoke(null, cVar, a4);
                Parcel parcel = a4.f13977e;
                int i4 = a4.f13981i;
                if (i4 >= 0) {
                    int i5 = a4.d.get(i4);
                    int dataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i5);
                    parcel.writeInt(dataPosition - i5);
                    parcel.setDataPosition(dataPosition);
                }
            } catch (ClassNotFoundException e4) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
            } catch (IllegalAccessException e5) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e5);
            } catch (NoSuchMethodException e6) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e6);
            } catch (InvocationTargetException e7) {
                if (!(e7.getCause() instanceof RuntimeException)) {
                    throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e7);
                }
                throw ((RuntimeException) e7.getCause());
            }
        } catch (ClassNotFoundException e8) {
            throw new RuntimeException(cVar.getClass().getSimpleName().concat(" does not have a Parcelizer"), e8);
        }
    }
}
