package q1;

import com.android.billingclient.api.Purchase;
import java.util.List;
import m2.AbstractC1806a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: q1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1950e implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f14656o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f14657p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ B0.d f14658q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ List f14659r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ B0.b f14660s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean[] f14661t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ B1.a f14662u;

    public /* synthetic */ RunnableC1950e(int i4, B0.d dVar, List list, B0.b bVar, boolean[] zArr, B1.a aVar, int i5) {
        this.f14656o = i5;
        this.f14657p = i4;
        this.f14658q = dVar;
        this.f14659r = list;
        this.f14660s = bVar;
        this.f14661t = zArr;
        this.f14662u = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z4;
        boolean z5;
        switch (this.f14656o) {
            case 0:
                if (this.f14657p != AbstractC1806a.f14004M || AbstractC1806a.f14009S) {
                    return;
                }
                AbstractC1806a.f14009S = true;
                if (this.f14658q.f72b == 0) {
                    z4 = false;
                    for (Purchase purchase : this.f14659r) {
                        if (purchase.a() == 1) {
                            if (!purchase.c.optBoolean("acknowledged", true)) {
                                AbstractC1806a.d(this.f14660s, purchase);
                            }
                            z4 = true;
                        } else if (purchase.a() == 2) {
                            AbstractC1806a.f14007Q = true;
                            AbstractC1959n.e();
                        }
                    }
                } else {
                    z4 = false;
                }
                boolean[] zArr = this.f14661t;
                zArr[0] = zArr[0] | z4;
                this.f14662u.run();
                return;
            default:
                if (this.f14657p != AbstractC1806a.f14004M || AbstractC1806a.f14011U) {
                    return;
                }
                AbstractC1806a.f14011U = true;
                if (this.f14658q.f72b == 0) {
                    z5 = false;
                    for (Purchase purchase2 : this.f14659r) {
                        if (purchase2.a() == 1) {
                            if (!purchase2.c.optBoolean("acknowledged", true)) {
                                AbstractC1806a.d(this.f14660s, purchase2);
                            }
                            z5 = true;
                        } else if (purchase2.a() == 2) {
                            AbstractC1806a.f14007Q = true;
                            AbstractC1959n.e();
                        }
                    }
                } else {
                    z5 = false;
                }
                boolean[] zArr2 = this.f14661t;
                zArr2[0] = zArr2[0] | z5;
                this.f14662u.run();
                return;
        }
    }
}
