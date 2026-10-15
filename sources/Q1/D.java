package Q1;

import com.google.android.gms.internal.ads.AbstractC0266Ec;
import com.google.android.gms.internal.ads.AbstractC0587ez;
import com.google.android.gms.internal.ads.C0260Dc;
import com.google.android.gms.internal.ads.C0828kk;
import com.google.android.gms.internal.ads.C0865le;
import com.google.android.gms.internal.ads.C1338wf;
import com.google.android.gms.internal.ads.C1414yB;
import com.google.android.gms.internal.ads.FB;
import com.google.android.gms.internal.ads.InterfaceC1457zB;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class D implements InterfaceC1457zB {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1622a;

    /* renamed from: b, reason: collision with root package name */
    public final FB f1623b;

    public /* synthetic */ D(FB fb, int i4) {
        this.f1622a = i4;
        this.f1623b = fb;
    }

    @Override // com.google.android.gms.internal.ads.FB
    public final Object c() {
        switch (this.f1622a) {
            case 0:
                return new C(((C0865le) this.f1623b).a());
            case 1:
                C0260Dc c0260Dc = AbstractC0266Ec.f4897a;
                AbstractC0587ez.n(c0260Dc);
                return new N1.c(1, c0260Dc, ((C1338wf) this.f1623b).a());
            default:
                return new W1.h((C0828kk) ((C1414yB) this.f1623b).c());
        }
    }
}
