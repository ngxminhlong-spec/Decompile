package n3;

import com.google.android.gms.internal.play_billing.B;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final q f14132a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14133b;
    public final int c;

    public i(Class cls, int i4, int i5) {
        this(q.a(cls), i4, i5);
    }

    public i(q qVar, int i4, int i5) {
        B.g(qVar, "Null dependency anInterface.");
        this.f14132a = qVar;
        this.f14133b = i4;
        this.c = i5;
    }

    public static i a(Class cls) {
        return new i(cls, 1, 0);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f14132a.equals(iVar.f14132a) && this.f14133b == iVar.f14133b && this.c == iVar.c;
    }

    public final int hashCode() {
        return ((((this.f14132a.hashCode() ^ 1000003) * 1000003) ^ this.f14133b) * 1000003) ^ this.c;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.f14132a);
        sb.append(", type=");
        int i4 = this.f14133b;
        sb.append(i4 == 1 ? "required" : i4 == 0 ? "optional" : "set");
        sb.append(", injection=");
        int i5 = this.c;
        if (i5 == 0) {
            str = "direct";
        } else if (i5 == 1) {
            str = "provider";
        } else {
            if (i5 != 2) {
                throw new AssertionError(U.a.i("Unsupported injection: ", i5));
            }
            str = "deferred";
        }
        return n0.a.j(sb, str, "}");
    }
}
