package x2;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Iterator;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: x2.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2089o {

    /* renamed from: a, reason: collision with root package name */
    public final String f15745a;

    /* renamed from: b, reason: collision with root package name */
    public final String f15746b;
    public final String c;
    public final long d;

    /* renamed from: e, reason: collision with root package name */
    public final long f15747e;

    /* renamed from: f, reason: collision with root package name */
    public final r f15748f;

    public C2089o(C2066c0 c2066c0, String str, String str2, String str3, long j4, long j5, r rVar) {
        h2.y.e(str2);
        h2.y.e(str3);
        h2.y.i(rVar);
        this.f15745a = str2;
        this.f15746b = str3;
        this.c = true == TextUtils.isEmpty(str) ? null : str;
        this.d = j4;
        this.f15747e = j5;
        if (j5 != 0 && j5 > j4) {
            K k3 = c2066c0.f15568i;
            C2066c0.i(k3);
            k3.f15397i.c(K.n(str2), K.n(str3), "Event created with reverse previous/current timestamps. appId, name");
        }
        this.f15748f = rVar;
    }

    public C2089o(C2066c0 c2066c0, String str, String str2, String str3, long j4, Bundle bundle) {
        r rVar;
        h2.y.e(str2);
        h2.y.e(str3);
        this.f15745a = str2;
        this.f15746b = str3;
        this.c = true == TextUtils.isEmpty(str) ? null : str;
        this.d = j4;
        this.f15747e = 0L;
        if (bundle.isEmpty()) {
            rVar = new r(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    K k3 = c2066c0.f15568i;
                    C2066c0.i(k3);
                    k3.f15394f.a("Param name can't be null");
                    it.remove();
                } else {
                    b1 b1Var = c2066c0.f15571l;
                    C2066c0.g(b1Var);
                    Object k4 = b1Var.k(bundle2.get(next), next);
                    if (k4 == null) {
                        K k5 = c2066c0.f15568i;
                        C2066c0.i(k5);
                        k5.f15397i.b(c2066c0.f15572m.e(next), "Param value can't be null");
                        it.remove();
                    } else {
                        b1 b1Var2 = c2066c0.f15571l;
                        C2066c0.g(b1Var2);
                        b1Var2.y(bundle2, next, k4);
                    }
                }
            }
            rVar = new r(bundle2);
        }
        this.f15748f = rVar;
    }

    public final C2089o a(C2066c0 c2066c0, long j4) {
        return new C2089o(c2066c0, this.c, this.f15745a, this.f15746b, this.d, j4, this.f15748f);
    }

    public final String toString() {
        return n0.a.j(U.a.n("Event{appId='", this.f15745a, "', name='", this.f15746b, "', params="), this.f15748f.toString(), "}");
    }
}
