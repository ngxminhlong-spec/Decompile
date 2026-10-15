package q1;

import com.android.billingclient.api.SkuDetails;
import com.duracodefactory.logiccircuitsimulatorpro.MainActivity;
import com.google.android.gms.internal.play_billing.B;
import java.util.List;
import m2.AbstractC1806a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: q1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1953h implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f14665o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f14666p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ B0.d f14667q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ MainActivity f14668r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ List f14669s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ B1.a f14670t;

    public /* synthetic */ RunnableC1953h(int i4, B0.d dVar, MainActivity mainActivity, List list, B1.a aVar, int i5) {
        this.f14665o = i5;
        this.f14666p = i4;
        this.f14667q = dVar;
        this.f14668r = mainActivity;
        this.f14669s = list;
        this.f14670t = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14665o) {
            case 0:
                if (this.f14666p != AbstractC1806a.f14004M || AbstractC1806a.f14010T) {
                    return;
                }
                AbstractC1806a.f14010T = true;
                int i4 = this.f14667q.f72b;
                MainActivity mainActivity = this.f14668r;
                if (i4 != 0) {
                    B.B(mainActivity);
                    AbstractC1806a.f14006P = true;
                    return;
                }
                List<SkuDetails> list = this.f14669s;
                if (list == null) {
                    AbstractC1806a.f14006P = true;
                    return;
                }
                String str = null;
                for (SkuDetails skuDetails : list) {
                    AbstractC1806a.f14005O.put(skuDetails.a(), skuDetails);
                    str = skuDetails.f3568b.optString("price_currency_code");
                }
                AbstractC1959n.f(mainActivity, str);
                this.f14670t.run();
                return;
            default:
                if (this.f14666p != AbstractC1806a.f14004M || AbstractC1806a.f14008R) {
                    return;
                }
                AbstractC1806a.f14008R = true;
                int i5 = this.f14667q.f72b;
                MainActivity mainActivity2 = this.f14668r;
                if (i5 != 0) {
                    B.B(mainActivity2);
                    AbstractC1806a.f14006P = true;
                    return;
                }
                List<SkuDetails> list2 = this.f14669s;
                if (list2 == null) {
                    AbstractC1806a.f14006P = true;
                    return;
                }
                String str2 = null;
                for (SkuDetails skuDetails2 : list2) {
                    AbstractC1806a.f14005O.put(skuDetails2.a(), skuDetails2);
                    str2 = skuDetails2.f3568b.optString("price_currency_code");
                }
                AbstractC1959n.f(mainActivity2, str2);
                this.f14670t.run();
                return;
        }
    }
}
