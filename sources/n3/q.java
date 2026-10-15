package n3;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final Class f14142a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f14143b;

    public q(Class cls, Class cls2) {
        this.f14142a = cls;
        this.f14143b = cls2;
    }

    public static q a(Class cls) {
        return new q(p.class, cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        if (this.f14143b.equals(qVar.f14143b)) {
            return this.f14142a.equals(qVar.f14142a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f14142a.hashCode() + (this.f14143b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.f14143b;
        Class cls2 = this.f14142a;
        if (cls2 == p.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
