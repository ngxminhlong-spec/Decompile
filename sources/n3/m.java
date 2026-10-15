package n3;

import w3.InterfaceC2053a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class m implements InterfaceC2053a {
    public static final Object c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f14136a = c;

    /* renamed from: b, reason: collision with root package name */
    public volatile InterfaceC2053a f14137b;

    public m(InterfaceC2053a interfaceC2053a) {
        this.f14137b = interfaceC2053a;
    }

    @Override // w3.InterfaceC2053a
    public final Object get() {
        Object obj;
        Object obj2 = this.f14136a;
        Object obj3 = c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f14136a;
                if (obj == obj3) {
                    obj = this.f14137b.get();
                    this.f14136a = obj;
                    this.f14137b = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
