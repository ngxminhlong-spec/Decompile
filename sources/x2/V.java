package x2;

import com.google.android.gms.internal.ads.C0831kn;
import com.google.android.gms.internal.measurement.C1588w2;
import com.google.android.gms.internal.measurement.G1;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final /* synthetic */ class V implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15460a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ X f15461b;
    public final /* synthetic */ String c;

    public /* synthetic */ V(X x4, String str, int i4) {
        this.f15460a = i4;
        this.f15461b = x4;
        this.c = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f15460a) {
            case 0:
                X x4 = this.f15461b;
                C2083l c2083l = x4.f15438b.c;
                X0.I(c2083l);
                String str = this.c;
                C2082k0 B4 = c2083l.B(str);
                HashMap hashMap = new HashMap();
                hashMap.put("platform", "android");
                hashMap.put("package_name", str);
                ((C2066c0) x4.f1719a).f15566g.l();
                hashMap.put("gmp_version", 73000L);
                if (B4 != null) {
                    String H3 = B4.H();
                    if (H3 != null) {
                        hashMap.put("app_version", H3);
                    }
                    hashMap.put("app_version_int", Long.valueOf(B4.B()));
                    hashMap.put("dynamite_version", Long.valueOf(B4.C()));
                }
                return hashMap;
            case 1:
                C0831kn c0831kn = new C0831kn(this.f15461b, this.c, 22, false);
                C1588w2 c1588w2 = new C1588w2("internal.remoteConfig", 0);
                c1588w2.f11939p.put("getValue", new G1(c0831kn));
                return c1588w2;
            default:
                return new G1(new V(this.f15461b, this.c, 0));
        }
    }
}
