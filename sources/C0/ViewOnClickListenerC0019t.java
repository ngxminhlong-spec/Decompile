package C0;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import b0.AbstractC0171E;
import d1.C1650a;
import d3.AbstractC1654b;
import h1.AbstractC1698a;
import java.util.HashSet;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: C0.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC0019t implements View.OnClickListener {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f394o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f395p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f396q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f397r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f398s;

    public /* synthetic */ ViewOnClickListenerC0019t(H h4, AbstractC1698a abstractC1698a, int i4, int[] iArr, int i5) {
        this.f394o = i5;
        this.f398s = h4;
        this.f396q = abstractC1698a;
        this.f395p = i4;
        this.f397r = iArr;
    }

    public /* synthetic */ ViewOnClickListenerC0019t(AbstractC0171E abstractC0171E, b0.c0 c0Var, C1650a c1650a, int i4, int i5) {
        this.f394o = i5;
        this.f398s = abstractC0171E;
        this.f396q = c0Var;
        this.f397r = c1650a;
        this.f395p = i4;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f394o) {
            case 0:
                long j4 = ((AbstractC1698a) this.f396q).f13117A;
                G0.a aVar = new G0.a(this.f395p, ((int[]) this.f397r)[0], 0, j4);
                D d = (D) this.f398s;
                d.f202i0.d(aVar);
                d.a0();
                d.p0();
                String.valueOf(n0.a.e(5));
                return;
            case 1:
                C1650a c1650a = (C1650a) this.f397r;
                Z z4 = (Z) this.f396q;
                Y y = (Y) this.f398s;
                HashSet hashSet = y.f261e;
                C0001a0 c0001a0 = (C0001a0) y.f263g;
                if (c0001a0.f274p) {
                    y.f262f = z4.b();
                    ((ViewGroup) c0001a0.f276r).removeAllViews();
                    ((ViewGroup) c0001a0.f276r).addView(AbstractC1654b.B((ViewGroup) c0001a0.f276r, c1650a));
                    ((ScrollView) c0001a0.f275q).post(new A0.a(15, this));
                    y.d();
                    return;
                }
                int i4 = this.f395p;
                if (hashSet.contains(Integer.valueOf(i4))) {
                    z4.r(c1650a, false);
                    hashSet.remove(Integer.valueOf(i4));
                    return;
                } else {
                    z4.r(c1650a, true);
                    hashSet.add(Integer.valueOf(i4));
                    return;
                }
            case 2:
                long j5 = ((AbstractC1698a) this.f396q).f13117A;
                G0.a aVar2 = new G0.a(this.f395p, ((int[]) this.f397r)[0], 0, j5);
                D0.g gVar = (D0.g) this.f398s;
                gVar.f566h0.d(aVar2);
                gVar.Z();
                return;
            default:
                C1650a c1650a2 = (C1650a) this.f397r;
                D0.l lVar = (D0.l) this.f396q;
                Y y4 = (Y) this.f398s;
                HashSet hashSet2 = y4.f261e;
                C0001a0 c0001a02 = (C0001a0) y4.f263g;
                if (c0001a02.f274p) {
                    y4.f262f = lVar.b();
                    ((ViewGroup) c0001a02.f276r).removeAllViews();
                    ((ViewGroup) c0001a02.f276r).addView(AbstractC1654b.B((ViewGroup) c0001a02.f276r, c1650a2));
                    ((ScrollView) c0001a02.f275q).post(new A0.a(26, this));
                    y4.d();
                    return;
                }
                int i5 = this.f395p;
                if (hashSet2.contains(Integer.valueOf(i5))) {
                    lVar.r(c1650a2, false);
                    hashSet2.remove(Integer.valueOf(i5));
                    return;
                } else {
                    lVar.r(c1650a2, true);
                    hashSet2.add(Integer.valueOf(i5));
                    return;
                }
        }
    }
}
