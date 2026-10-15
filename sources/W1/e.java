package W1;

import O1.r;
import Q1.D;
import com.google.android.gms.internal.ads.AbstractC0266Ec;
import com.google.android.gms.internal.ads.AbstractC0587ez;
import com.google.android.gms.internal.ads.AbstractC1066q6;
import com.google.android.gms.internal.ads.C0260Dc;
import com.google.android.gms.internal.ads.C0381a5;
import com.google.android.gms.internal.ads.C1006oq;
import com.google.android.gms.internal.ads.C1338wf;
import com.google.android.gms.internal.ads.C1382xg;
import com.google.android.gms.internal.ads.C1414yB;
import com.google.android.gms.internal.ads.EnumC0877lq;
import com.google.android.gms.internal.ads.InterfaceC1457zB;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class e implements InterfaceC1457zB {

    /* renamed from: a, reason: collision with root package name */
    public final C1414yB f1991a;

    /* renamed from: b, reason: collision with root package name */
    public final D f1992b;
    public final C1382xg c;

    public e(C1414yB c1414yB, D d, C1382xg c1382xg) {
        this.f1991a = c1414yB;
        this.f1992b = d;
        this.c = c1382xg;
    }

    @Override // com.google.android.gms.internal.ads.FB
    public final Object c() {
        C1006oq c1006oq = (C1006oq) this.f1991a.c();
        C0260Dc c0260Dc = AbstractC0266Ec.f4897a;
        AbstractC0587ez.n(c0260Dc);
        C0381a5 r4 = c1006oq.b(this.c.c().b(), EnumC0877lq.f9478J).r(new N1.c(1, c0260Dc, ((C1338wf) this.f1992b.f1623b).a()));
        long intValue = ((Integer) r.d.c.a(AbstractC1066q6.J4)).intValue();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return r4.w(intValue).d();
    }
}
