package x2;

import android.os.Bundle;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: x2.f0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC2072f0 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f15651o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f15652p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f15653q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ long f15654r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f15655s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f15656t;

    public /* synthetic */ RunnableC2072f0(Object obj, Object obj2, Object obj3, Object obj4, long j4, int i4) {
        this.f15651o = i4;
        this.f15656t = obj;
        this.f15652p = obj2;
        this.f15653q = obj3;
        this.f15655s = obj4;
        this.f15654r = j4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15651o) {
            case 0:
                String str = (String) this.f15653q;
                X0 x02 = ((BinderC2074g0) this.f15656t).f15665o;
                String str2 = (String) this.f15652p;
                if (str2 == null) {
                    x02.t().g();
                    String str3 = x02.f15480D;
                    if (str3 == null || str3.equals(str)) {
                        x02.f15480D = str;
                        x02.f15479C = null;
                        return;
                    }
                    return;
                }
                C2111z0 c2111z0 = new C2111z0((String) this.f15655s, str2, this.f15654r);
                x02.t().g();
                String str4 = x02.f15480D;
                if (str4 != null) {
                    str4.equals(str);
                }
                x02.f15480D = str;
                x02.f15479C = c2111z0;
                return;
            case 1:
                C2103v0 c2103v0 = (C2103v0) this.f15656t;
                String str5 = (String) this.f15652p;
                String str6 = (String) this.f15653q;
                c2103v0.x(this.f15654r, this.f15655s, str5, str6);
                return;
            default:
                C0 c02 = (C0) this.f15656t;
                Bundle bundle = (Bundle) this.f15652p;
                C2111z0 c2111z02 = (C2111z0) this.f15653q;
                C2111z0 c2111z03 = (C2111z0) this.f15655s;
                bundle.remove("screen_name");
                bundle.remove("screen_class");
                b1 b1Var = ((C2066c0) c02.f1719a).f15571l;
                C2066c0.g(b1Var);
                c02.j(c2111z02, c2111z03, this.f15654r, true, b1Var.l0("screen_view", bundle, null, false));
                return;
        }
    }
}
