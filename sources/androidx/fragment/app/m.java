package androidx.fragment.app;

import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class m extends C0159h {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f2874b;

    public m(s sVar) {
        this.f2874b = sVar;
    }

    @Override // androidx.fragment.app.C0159h
    public final AbstractComponentCallbacksC0157f a(ClassLoader classLoader, String str) {
        try {
            return (AbstractComponentCallbacksC0157f) C0159h.b(this.f2874b.f2888D.f2861q.getClassLoader(), str).getConstructor(null).newInstance(null);
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
