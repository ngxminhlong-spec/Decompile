package androidx.fragment.app;

import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: androidx.fragment.app.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0159h {

    /* renamed from: a, reason: collision with root package name */
    public static final r.i f2865a = new r.i(0);

    public static Class b(ClassLoader classLoader, String str) {
        try {
            r.i iVar = f2865a;
            Class cls = (Class) iVar.get(str);
            if (cls != null) {
                return cls;
            }
            Class<?> cls2 = Class.forName(str, false, classLoader);
            iVar.put(str, cls2);
            return cls2;
        } catch (ClassCastException e4) {
            throw new RuntimeException(U.a.k("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e4);
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException(U.a.k("Unable to instantiate fragment ", str, ": make sure class name exists"), e5);
        }
    }

    public AbstractComponentCallbacksC0157f a(ClassLoader classLoader, String str) {
        try {
            return (AbstractComponentCallbacksC0157f) b(classLoader, str).getConstructor(null).newInstance(null);
        } catch (IllegalAccessException e4) {
            throw new RuntimeException(U.a.k("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e4);
        } catch (InstantiationException e5) {
            throw new RuntimeException(U.a.k("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e5);
        } catch (NoSuchMethodException e6) {
            throw new RuntimeException(U.a.k("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e6);
        } catch (InvocationTargetException e7) {
            throw new RuntimeException(U.a.k("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e7);
        }
    }
}
