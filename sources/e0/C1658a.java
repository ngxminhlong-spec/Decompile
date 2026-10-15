package e0;

import java.util.Locale;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: e0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1658a {

    /* renamed from: a, reason: collision with root package name */
    public final String f12658a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12659b;
    public final int c;
    public final boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final int f12660e;

    /* renamed from: f, reason: collision with root package name */
    public final String f12661f;

    /* renamed from: g, reason: collision with root package name */
    public final int f12662g;

    public C1658a(int i4, int i5, String str, String str2, String str3, boolean z4) {
        this.f12658a = str;
        this.f12659b = str2;
        this.d = z4;
        this.f12660e = i4;
        int i6 = 5;
        if (str2 != null) {
            String upperCase = str2.toUpperCase(Locale.US);
            if (upperCase.contains("INT")) {
                i6 = 3;
            } else if (upperCase.contains("CHAR") || upperCase.contains("CLOB") || upperCase.contains("TEXT")) {
                i6 = 2;
            } else if (!upperCase.contains("BLOB")) {
                i6 = (upperCase.contains("REAL") || upperCase.contains("FLOA") || upperCase.contains("DOUB")) ? 4 : 1;
            }
        }
        this.c = i6;
        this.f12661f = str3;
        this.f12662g = i5;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || C1658a.class != obj.getClass()) {
                return false;
            }
            C1658a c1658a = (C1658a) obj;
            int i4 = c1658a.f12662g;
            String str = c1658a.f12661f;
            if (this.f12660e != c1658a.f12660e || !this.f12658a.equals(c1658a.f12658a) || this.d != c1658a.d) {
                return false;
            }
            String str2 = this.f12661f;
            int i5 = this.f12662g;
            if (i5 == 1 && i4 == 2 && str2 != null && !str2.equals(str)) {
                return false;
            }
            if (i5 == 2 && i4 == 1 && str != null && !str.equals(str2)) {
                return false;
            }
            if (i5 != 0 && i5 == i4) {
                if (str2 != null) {
                    if (!str2.equals(str)) {
                        return false;
                    }
                } else if (str != null) {
                    return false;
                }
            }
            if (this.c != c1658a.c) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return (((((this.f12658a.hashCode() * 31) + this.c) * 31) + (this.d ? 1231 : 1237)) * 31) + this.f12660e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Column{name='");
        sb.append(this.f12658a);
        sb.append("', type='");
        sb.append(this.f12659b);
        sb.append("', affinity='");
        sb.append(this.c);
        sb.append("', notNull=");
        sb.append(this.d);
        sb.append(", primaryKeyPosition=");
        sb.append(this.f12660e);
        sb.append(", defaultValue='");
        return n0.a.j(sb, this.f12661f, "'}");
    }
}
