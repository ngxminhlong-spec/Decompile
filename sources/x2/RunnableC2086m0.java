package x2;

import android.os.Bundle;
import java.util.Iterator;
import java.util.TreeSet;
import k.C1748e;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: x2.m0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC2086m0 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f15737o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Bundle f15738p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C2103v0 f15739q;

    public /* synthetic */ RunnableC2086m0(C2103v0 c2103v0, Bundle bundle, int i4) {
        this.f15737o = i4;
        this.f15739q = c2103v0;
        this.f15738p = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15737o) {
            case 0:
                C2103v0 c2103v0 = this.f15739q;
                C1748e c1748e = c2103v0.f15838p;
                C2066c0 c2066c0 = (C2066c0) c2103v0.f1719a;
                Bundle bundle = this.f15738p;
                if (bundle == null) {
                    T t4 = c2066c0.f15567h;
                    C2066c0.g(t4);
                    t4.f15457v.I(new Bundle());
                    return;
                }
                T t5 = c2066c0.f15567h;
                b1 b1Var = c2066c0.f15571l;
                K k3 = c2066c0.f15568i;
                C2066c0.g(t5);
                Bundle A3 = t5.f15457v.A();
                for (String str : bundle.keySet()) {
                    Object obj = bundle.get(str);
                    if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                        C2066c0.g(b1Var);
                        if (b1.P(obj)) {
                            b1.x(c1748e, null, 27, null, null, 0);
                        }
                        C2066c0.i(k3);
                        k3.f15399k.c(str, obj, "Invalid default event parameter type. Name, value");
                    } else if (b1.R(str)) {
                        C2066c0.i(k3);
                        k3.f15399k.b(str, "Invalid default event parameter name. Name");
                    } else if (obj == null) {
                        A3.remove(str);
                    } else {
                        C2066c0.g(b1Var);
                        if (b1Var.L("param", str, 100, obj)) {
                            b1Var.y(A3, str, obj);
                        }
                    }
                }
                C2066c0.g(b1Var);
                int j4 = c2066c0.f15566g.j();
                if (A3.size() > j4) {
                    Iterator it = new TreeSet(A3.keySet()).iterator();
                    int i4 = 0;
                    while (it.hasNext()) {
                        String str2 = (String) it.next();
                        i4++;
                        if (i4 > j4) {
                            A3.remove(str2);
                        }
                    }
                    C2066c0.g(b1Var);
                    b1.x(c1748e, null, 26, null, null, 0);
                    C2066c0.i(k3);
                    k3.f15399k.a("Too many default event parameters set. Discarding beyond event parameter limit");
                }
                T t6 = c2066c0.f15567h;
                C2066c0.g(t6);
                t6.f15457v.I(A3);
                J0 q4 = c2066c0.q();
                q4.g();
                q4.e();
                q4.r(new E.n(q4, q4.o(false), A3, 21, false));
                return;
            case 1:
                C2103v0 c2103v02 = this.f15739q;
                c2103v02.g();
                c2103v02.e();
                Bundle bundle2 = this.f15738p;
                String string = bundle2.getString("name");
                String string2 = bundle2.getString("origin");
                h2.y.e(string);
                h2.y.e(string2);
                h2.y.i(bundle2.get("value"));
                C2066c0 c2066c02 = (C2066c0) c2103v02.f1719a;
                boolean e4 = c2066c02.e();
                b1 b1Var2 = c2066c02.f15571l;
                if (!e4) {
                    K k4 = c2066c02.f15568i;
                    C2066c0.i(k4);
                    k4.f15402n.a("Conditional property not set since app measurement is disabled");
                    return;
                }
                Y0 y02 = new Y0(bundle2.getLong("triggered_timestamp"), bundle2.get("value"), string, string2);
                try {
                    C2066c0.g(b1Var2);
                    bundle2.getString("app_id");
                    C2096s m02 = b1Var2.m0(bundle2.getString("triggered_event_name"), bundle2.getBundle("triggered_event_params"), string2, 0L, true);
                    C2066c0.g(b1Var2);
                    bundle2.getString("app_id");
                    C2096s m03 = b1Var2.m0(bundle2.getString("timed_out_event_name"), bundle2.getBundle("timed_out_event_params"), string2, 0L, true);
                    C2066c0.g(b1Var2);
                    bundle2.getString("app_id");
                    c2066c02.q().k(new C2065c(bundle2.getString("app_id"), string2, y02, bundle2.getLong("creation_timestamp"), false, bundle2.getString("trigger_event_name"), m03, bundle2.getLong("trigger_timeout"), m02, bundle2.getLong("time_to_live"), b1Var2.m0(bundle2.getString("expired_event_name"), bundle2.getBundle("expired_event_params"), string2, 0L, true)));
                    return;
                } catch (IllegalArgumentException unused) {
                    return;
                }
            default:
                C2103v0 c2103v03 = this.f15739q;
                c2103v03.g();
                c2103v03.e();
                Bundle bundle3 = this.f15738p;
                String string3 = bundle3.getString("name");
                h2.y.e(string3);
                C2066c0 c2066c03 = (C2066c0) c2103v03.f1719a;
                if (!c2066c03.e()) {
                    K k5 = c2066c03.f15568i;
                    C2066c0.i(k5);
                    k5.f15402n.a("Conditional property not cleared since app measurement is disabled");
                    return;
                }
                Y0 y03 = new Y0(0L, null, string3, "");
                try {
                    b1 b1Var3 = c2066c03.f15571l;
                    C2066c0.g(b1Var3);
                    bundle3.getString("app_id");
                    c2066c03.q().k(new C2065c(bundle3.getString("app_id"), "", y03, bundle3.getLong("creation_timestamp"), bundle3.getBoolean("active"), bundle3.getString("trigger_event_name"), null, bundle3.getLong("trigger_timeout"), null, bundle3.getLong("time_to_live"), b1Var3.m0(bundle3.getString("expired_event_name"), bundle3.getBundle("expired_event_params"), "", bundle3.getLong("creation_timestamp"), true)));
                    return;
                } catch (IllegalArgumentException unused2) {
                    return;
                }
        }
    }
}
