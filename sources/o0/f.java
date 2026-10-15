package o0;

import O1.C0077n;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.C0258Da;
import com.google.android.gms.internal.ads.C0326Qb;
import com.google.android.gms.internal.ads.Wl;
import com.google.android.gms.internal.measurement.C1510e1;
import g0.InterfaceC1679a;
import h0.C1697e;
import k.C1748e;
import l.J0;
import t2.G;
import v3.C2033d;
import w1.AbstractC2050m;
import w1.C2047j;
import y1.C2117a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class f implements InterfaceC1679a {

    /* renamed from: o, reason: collision with root package name */
    public Context f14162o;

    @Override // g0.InterfaceC1679a
    public g0.b a(B0.c cVar) {
        Context context = this.f14162o;
        String str = (String) cVar.f69q;
        C1510e1 c1510e1 = (C1510e1) cVar.f70r;
        if (c1510e1 == null) {
            throw new IllegalArgumentException("Must set a callback to create the configuration.");
        }
        if (context == null) {
            throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
        }
        B0.c cVar2 = new B0.c(context, str, c1510e1, true);
        return new C1697e((Context) cVar2.f68p, (String) cVar2.f69q, (C1510e1) cVar2.f70r, cVar2.f67o);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [w1.j, java.lang.Object] */
    public C2047j b() {
        Context context = this.f14162o;
        if (context == null) {
            throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
        }
        ?? obj = new Object();
        obj.f15153o = C2117a.a(AbstractC2050m.f15161a);
        G g4 = new G(context);
        obj.f15154p = g4;
        obj.f15155q = C2117a.a(new Wl(24, g4, new C1748e(19, g4)));
        G g5 = obj.f15154p;
        int i4 = 10;
        obj.f15156r = new x0.f(i4, g5);
        I3.a a4 = C2117a.a(new C0258Da(5, obj.f15156r, C2117a.a(new D3.d(i4, g5))));
        obj.f15157s = a4;
        C2033d c2033d = new C2033d(3);
        G g6 = obj.f15154p;
        q2.e eVar = new q2.e(g6, a4, c2033d, 1);
        I3.a aVar = obj.f15153o;
        I3.a aVar2 = obj.f15155q;
        obj.f15158t = C2117a.a(new t3.g(new C0077n(aVar, aVar2, eVar, a4, a4), new J0(g6, aVar2, a4, eVar, aVar, a4, a4), new C0326Qb(aVar, a4, eVar, a4, false)));
        return obj;
    }
}
