package x2;

import android.os.RemoteException;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class E0 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f15363o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ d1 f15364p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ J0 f15365q;

    public /* synthetic */ E0(J0 j02, d1 d1Var, int i4) {
        this.f15363o = i4;
        this.f15365q = j02;
        this.f15364p = d1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15363o) {
            case 0:
                d1 d1Var = this.f15364p;
                J0 j02 = this.f15365q;
                C2066c0 c2066c0 = (C2066c0) j02.f1719a;
                D d = j02.d;
                if (d == null) {
                    K k3 = c2066c0.f15568i;
                    C2066c0.i(k3);
                    k3.f15394f.a("Failed to reset data on the service: not connected to service");
                    return;
                } else {
                    try {
                        d.y1(d1Var);
                    } catch (RemoteException e4) {
                        K k4 = c2066c0.f15568i;
                        C2066c0.i(k4);
                        k4.f15394f.b(e4, "Failed to reset data on the service: remote exception");
                    }
                    j02.q();
                    return;
                }
            case 1:
                d1 d1Var2 = this.f15364p;
                J0 j03 = this.f15365q;
                C2066c0 c2066c02 = (C2066c0) j03.f1719a;
                D d4 = j03.d;
                if (d4 == null) {
                    K k5 = c2066c02.f15568i;
                    C2066c0.i(k5);
                    k5.f15394f.a("Discarding data. Failed to send app launch");
                    return;
                }
                try {
                    d4.z3(d1Var2);
                    c2066c02.n().l();
                    j03.j(d4, null, d1Var2);
                    j03.q();
                    return;
                } catch (RemoteException e5) {
                    K k6 = c2066c02.f15568i;
                    C2066c0.i(k6);
                    k6.f15394f.b(e5, "Failed to send app launch to the service");
                    return;
                }
            case 2:
                d1 d1Var3 = this.f15364p;
                J0 j04 = this.f15365q;
                C2066c0 c2066c03 = (C2066c0) j04.f1719a;
                D d5 = j04.d;
                if (d5 == null) {
                    K k7 = c2066c03.f15568i;
                    C2066c0.i(k7);
                    k7.f15394f.a("Failed to send measurementEnabled to service");
                    return;
                }
                try {
                    d5.A3(d1Var3);
                    j04.q();
                    return;
                } catch (RemoteException e6) {
                    K k8 = c2066c03.f15568i;
                    C2066c0.i(k8);
                    k8.f15394f.b(e6, "Failed to send measurementEnabled to the service");
                    return;
                }
            default:
                d1 d1Var4 = this.f15364p;
                J0 j05 = this.f15365q;
                C2066c0 c2066c04 = (C2066c0) j05.f1719a;
                D d6 = j05.d;
                if (d6 == null) {
                    K k9 = c2066c04.f15568i;
                    C2066c0.i(k9);
                    k9.f15394f.a("Failed to send consent settings to service");
                    return;
                }
                try {
                    d6.b2(d1Var4);
                    j05.q();
                    return;
                } catch (RemoteException e7) {
                    K k10 = c2066c04.f15568i;
                    C2066c0.i(k10);
                    k10.f15394f.b(e7, "Failed to send consent settings to the service");
                    return;
                }
        }
    }
}
