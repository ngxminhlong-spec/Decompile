package A;

import android.graphics.Insets;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: e, reason: collision with root package name */
    public static final d f0e = new d(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f1a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2b;
    public final int c;
    public final int d;

    public d(int i4, int i5, int i6, int i7) {
        this.f1a = i4;
        this.f2b = i5;
        this.c = i6;
        this.d = i7;
    }

    public static d a(int i4, int i5, int i6, int i7) {
        return (i4 == 0 && i5 == 0 && i6 == 0 && i7 == 0) ? f0e : new d(i4, i5, i6, i7);
    }

    public static d b(Insets insets) {
        int i4;
        int i5;
        int i6;
        int i7;
        i4 = insets.left;
        i5 = insets.top;
        i6 = insets.right;
        i7 = insets.bottom;
        return a(i4, i5, i6, i7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        return this.d == dVar.d && this.f1a == dVar.f1a && this.c == dVar.c && this.f2b == dVar.f2b;
    }

    public final int hashCode() {
        return (((((this.f1a * 31) + this.f2b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        return "Insets{left=" + this.f1a + ", top=" + this.f2b + ", right=" + this.c + ", bottom=" + this.d + '}';
    }
}
