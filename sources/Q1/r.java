package Q1;

import com.google.android.gms.internal.ads.Qw;
import java.util.Arrays;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final String f1723a;

    /* renamed from: b, reason: collision with root package name */
    public final double f1724b;
    public final double c;
    public final double d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1725e;

    public r(String str, double d, double d4, double d5, int i4) {
        this.f1723a = str;
        this.c = d;
        this.f1724b = d4;
        this.d = d5;
        this.f1725e = i4;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return h2.y.m(this.f1723a, rVar.f1723a) && this.f1724b == rVar.f1724b && this.c == rVar.c && this.f1725e == rVar.f1725e && Double.compare(this.d, rVar.d) == 0;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1723a, Double.valueOf(this.f1724b), Double.valueOf(this.c), Double.valueOf(this.d), Integer.valueOf(this.f1725e)});
    }

    public final String toString() {
        Qw qw = new Qw(this);
        qw.s(this.f1723a, "name");
        qw.s(Double.valueOf(this.c), "minBound");
        qw.s(Double.valueOf(this.f1724b), "maxBound");
        qw.s(Double.valueOf(this.d), "percent");
        qw.s(Integer.valueOf(this.f1725e), "count");
        return qw.toString();
    }
}
