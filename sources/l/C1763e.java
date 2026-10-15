package l;

import android.content.Context;
import android.view.View;
import com.duracodefactory.logiccircuitsimulatorpro.R;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: l.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1763e extends k.x {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f13724l = 0;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C1773j f13725m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1763e(C1773j c1773j, Context context, k.F f4, View view) {
        super(context, f4, view, false, R.attr.actionOverflowMenuStyle, 0);
        this.f13725m = c1773j;
        if ((f4.f13366A.f13477x & 32) != 32) {
            View view2 = c1773j.f13787x;
            this.f13490e = view2 == null ? (View) c1773j.f13785v : view2;
        }
        k.o oVar = c1773j.f13776L;
        this.f13493h = oVar;
        k.v vVar = this.f13494i;
        if (vVar != null) {
            vVar.j(oVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1763e(C1773j c1773j, Context context, k.m mVar, View view) {
        super(context, mVar, view, true, R.attr.actionOverflowMenuStyle, 0);
        this.f13725m = c1773j;
        this.f13491f = 8388613;
        k.o oVar = c1773j.f13776L;
        this.f13493h = oVar;
        k.v vVar = this.f13494i;
        if (vVar != null) {
            vVar.j(oVar);
        }
    }

    @Override // k.x
    public final void c() {
        switch (this.f13724l) {
            case 0:
                C1773j c1773j = this.f13725m;
                c1773j.f13773I = null;
                c1773j.f13777M = 0;
                super.c();
                return;
            default:
                C1773j c1773j2 = this.f13725m;
                k.m mVar = c1773j2.f13780q;
                if (mVar != null) {
                    mVar.c(true);
                }
                c1773j2.f13772H = null;
                super.c();
                return;
        }
    }
}
