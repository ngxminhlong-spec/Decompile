package k0;

import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f13553a;

    /* renamed from: b, reason: collision with root package name */
    public static final ArrayList f13554b;

    static {
        t tVar = new t();
        tVar.f13556K = false;
        tVar.G(new h(2));
        tVar.G(new o());
        tVar.G(new h(1));
        f13553a = new ThreadLocal();
        f13554b = new ArrayList();
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [r.e, java.lang.Object, r.i] */
    public static r.e a() {
        r.e eVar;
        ThreadLocal threadLocal = f13553a;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (eVar = (r.e) weakReference.get()) != null) {
            return eVar;
        }
        ?? iVar = new r.i(0);
        threadLocal.set(new WeakReference(iVar));
        return iVar;
    }
}
