package g2;

import com.google.android.gms.internal.ads.Qw;
import h2.y;
import java.util.Arrays;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: g2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1681a {

    /* renamed from: a, reason: collision with root package name */
    public final int f12978a;

    /* renamed from: b, reason: collision with root package name */
    public final Qw f12979b;
    public final f2.b c;
    public final String d;

    public C1681a(Qw qw, f2.b bVar, String str) {
        this.f12979b = qw;
        this.c = bVar;
        this.d = str;
        this.f12978a = Arrays.hashCode(new Object[]{qw, bVar, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1681a)) {
            return false;
        }
        C1681a c1681a = (C1681a) obj;
        return y.m(this.f12979b, c1681a.f12979b) && y.m(this.c, c1681a.c) && y.m(this.d, c1681a.d);
    }

    public final int hashCode() {
        return this.f12978a;
    }
}
