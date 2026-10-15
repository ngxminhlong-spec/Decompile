package n;

import java.util.HashMap;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class a extends f {

    /* renamed from: s, reason: collision with root package name */
    public final HashMap f14056s = new HashMap();

    @Override // n.f
    public final c g(Object obj) {
        return (c) this.f14056s.get(obj);
    }

    @Override // n.f
    public final Object h(Object obj) {
        Object h4 = super.h(obj);
        this.f14056s.remove(obj);
        return h4;
    }
}
