package g2;

import com.google.android.gms.internal.ads.Qw;
import h2.y;
import java.util.Arrays;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final C1681a f13017a;

    /* renamed from: b, reason: collision with root package name */
    public final e2.d f13018b;

    public /* synthetic */ n(C1681a c1681a, e2.d dVar) {
        this.f13017a = c1681a;
        this.f13018b = dVar;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof n)) {
            n nVar = (n) obj;
            if (y.m(this.f13017a, nVar.f13017a) && y.m(this.f13018b, nVar.f13018b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f13017a, this.f13018b});
    }

    public final String toString() {
        Qw qw = new Qw(this);
        qw.s(this.f13017a, "key");
        qw.s(this.f13018b, "feature");
        return qw.toString();
    }
}
