package h2;

import e2.C1664b;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class k implements InterfaceC1705d, InterfaceC1703b, InterfaceC1704c {

    /* renamed from: p, reason: collision with root package name */
    public static k f13216p;

    /* renamed from: q, reason: collision with root package name */
    public static final l f13217q = new l(0, false, false, 0, 0);

    /* renamed from: o, reason: collision with root package name */
    public Object f13218o;

    public /* synthetic */ k(Object obj) {
        this.f13218o = obj;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [h2.k, java.lang.Object] */
    public static synchronized k b() {
        k kVar;
        synchronized (k.class) {
            try {
                if (f13216p == null) {
                    f13216p = new Object();
                }
                kVar = f13216p;
            } catch (Throwable th) {
                throw th;
            }
        }
        return kVar;
    }

    @Override // h2.InterfaceC1703b
    public void O(int i4) {
        ((f2.g) this.f13218o).O(i4);
    }

    @Override // h2.InterfaceC1703b
    public void Q() {
        ((f2.g) this.f13218o).Q();
    }

    @Override // h2.InterfaceC1705d
    public void a(C1664b c1664b) {
        AbstractC1706e abstractC1706e = (AbstractC1706e) this.f13218o;
        if (c1664b.f12743p == 0) {
            abstractC1706e.b(null, abstractC1706e.s());
            return;
        }
        InterfaceC1704c interfaceC1704c = abstractC1706e.f13166D;
        if (interfaceC1704c != null) {
            interfaceC1704c.a0(c1664b);
        }
    }

    @Override // h2.InterfaceC1704c
    public void a0(C1664b c1664b) {
        ((f2.h) this.f13218o).a0(c1664b);
    }
}
