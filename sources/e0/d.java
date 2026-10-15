package e0;

import java.util.List;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f12670a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f12671b;
    public final List c;

    public d(String str, boolean z4, List list) {
        this.f12670a = str;
        this.f12671b = z4;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        String str = dVar.f12670a;
        if (this.f12671b != dVar.f12671b || !this.c.equals(dVar.c)) {
            return false;
        }
        String str2 = this.f12670a;
        return str2.startsWith("index_") ? str.startsWith("index_") : str2.equals(str);
    }

    public final int hashCode() {
        String str = this.f12670a;
        return this.c.hashCode() + ((((str.startsWith("index_") ? -1184239155 : str.hashCode()) * 31) + (this.f12671b ? 1 : 0)) * 31);
    }

    public final String toString() {
        return "Index{name='" + this.f12670a + "', unique=" + this.f12671b + ", columns=" + this.c + '}';
    }
}
