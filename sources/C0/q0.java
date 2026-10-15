package C0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import b0.AbstractC0171E;
import com.android.billingclient.api.SkuDetails;
import com.duracodefactory.logiccircuitsimulatorpro.MainActivity;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import com.duracodefactory.logiccircuitsimulatorpro.ui.GoPremiumLayout;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import l1.C1797d;
import m2.AbstractC1806a;
import n1.C1808a;
import n1.C1809b;
import o1.C1872l;
import q1.AbstractC1959n;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class q0 extends AbstractC0171E {

    /* renamed from: f, reason: collision with root package name */
    public Object f370f;
    public final /* synthetic */ int c = 1;

    /* renamed from: e, reason: collision with root package name */
    public List f369e = new ArrayList();
    public int d = 0;

    public q0() {
    }

    public q0(s0 s0Var) {
        this.f370f = s0Var;
    }

    public q0(GoPremiumLayout goPremiumLayout) {
        this.f370f = goPremiumLayout;
    }

    @Override // b0.AbstractC0171E
    public final int a() {
        switch (this.c) {
            case 0:
                return this.f369e.size();
            case 1:
                return ((ArrayList) this.f369e).size();
            default:
                return ((ArrayList) this.f369e).size();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // b0.AbstractC0171E
    public final void f(b0.c0 c0Var, int i4) {
        int i5;
        SkuDetails skuDetails;
        switch (this.c) {
            case 0:
                r0 r0Var = (r0) c0Var;
                C1797d c1797d = (C1797d) this.f369e.get(i4);
                boolean contains = l1.f.f13951e.f13956b.contains(Integer.valueOf(c1797d.f13943b));
                s0 s0Var = (s0) this.f370f;
                boolean contains2 = l1.f.b(((v0) s0Var.f393i).h()).contains(Integer.valueOf(c1797d.f13943b));
                boolean z4 = s0Var.f388b && this.d == i4;
                View view = r0Var.f381w;
                View view2 = r0Var.f382x;
                View view3 = r0Var.f383z;
                View view4 = r0Var.y;
                View view5 = r0Var.f377E;
                View view6 = r0Var.f376D;
                r0Var.f378t.setText(c1797d.d);
                TextView textView = r0Var.f379u;
                StringBuilder sb = new StringBuilder("");
                boolean z5 = z4;
                sb.append(c1797d.f13945f + (contains ? 1L : 0L));
                textView.setText(sb.toString());
                r0Var.f380v.setText("" + (c1797d.f13944e + (contains2 ? 1L : 0L)));
                TextView textView2 = r0Var.f373A;
                textView2.setText(textView2.getContext().getResources().getString(R.string.elements_count) + ": " + c1797d.f13947h);
                r0Var.f374B.setText(textView2.getContext().getResources().getString(R.string.connections_count) + ": " + c1797d.f13946g);
                if (contains2) {
                    i5 = 0;
                    view6.setVisibility(0);
                    view5.setVisibility(8);
                } else {
                    i5 = 0;
                    view5.setVisibility(0);
                    view6.setVisibility(8);
                }
                if (contains) {
                    view4.setVisibility(i5);
                    view3.setVisibility(8);
                } else {
                    view3.setVisibility(i5);
                    view4.setVisibility(8);
                }
                if (z5) {
                    view2.setVisibility(i5);
                    view.setVisibility(8);
                } else {
                    view.setVisibility(i5);
                    view2.setVisibility(8);
                }
                r0Var.f375C.setOnClickListener(new o0(i4, 0, this, c1797d));
                r0Var.f3244a.setOnClickListener(new p0(this, r0Var, c1797d, contains, i4));
                return;
            case 1:
                C1809b c1809b = (C1809b) c0Var;
                C1808a c1808a = (C1808a) ((ArrayList) this.f369e).get(i4);
                View view7 = c1809b.f3244a;
                boolean z6 = AbstractC1806a.H(view7.getContext()) && this.d == i4;
                c1809b.f14107t.setImageResource(c1808a.c);
                c1809b.f14108u.setText(view7.getContext().getString(c1808a.f14106b));
                c1809b.f14109v.setText(view7.getContext().getString(c1808a.d));
                view7.setSelected(z6);
                view7.setOnClickListener(new g0(this, c1809b, c1808a, 2));
                return;
            default:
                C1872l c1872l = (C1872l) c0Var;
                SkuDetails skuDetails2 = (SkuDetails) ((ArrayList) this.f369e).get(i4);
                Object[] objArr = this.d == i4;
                View view8 = c1872l.f14278u;
                View view9 = c1872l.f14273A;
                View view10 = c1872l.f14282z;
                TextView textView3 = c1872l.f14280w;
                GoPremiumLayout goPremiumLayout = c1872l.f14276D;
                int r4 = AbstractC1806a.r(skuDetails2.a());
                textView3.setText(r4 != 0 ? r4 != 1 ? goPremiumLayout.getContext().getString(R.string.lifetime) : goPremiumLayout.getContext().getString(R.string.six_month) : goPremiumLayout.getContext().getString(R.string.month));
                c1872l.f14277t.setText(skuDetails2.f3568b.optString("price"));
                view8.setPadding(view8.getPaddingLeft(), objArr != false ? goPremiumLayout.f3616t : goPremiumLayout.f3617u, view8.getPaddingRight(), objArr != false ? goPremiumLayout.f3616t : goPremiumLayout.f3617u);
                TextView textView4 = c1872l.f14279v;
                int r5 = AbstractC1806a.r(skuDetails2.a());
                textView4.setText(r5 != 0 ? r5 != 1 ? goPremiumLayout.getContext().getString(R.string.one_off) : goPremiumLayout.getContext().getString(R.string.six_month_subs) : goPremiumLayout.getContext().getString(R.string.month_sub));
                c1872l.f14281x.setVisibility(objArr != false ? 0 : 4);
                c1872l.y.setVisibility(AbstractC1806a.r(skuDetails2.a()) == 2 ? 0 : 8);
                view10.setVisibility(AbstractC1806a.r(skuDetails2.a()) == 2 ? 0 : 8);
                view9.setVisibility(AbstractC1806a.r(skuDetails2.a()) == 2 ? 0 : 8);
                HashMap hashMap = AbstractC1806a.f14005O;
                String optString = (hashMap == null || (skuDetails = (SkuDetails) hashMap.get("lcs_10.99_oneoff_new")) == null) ? null : skuDetails.f3568b.optString("price");
                if (optString == null) {
                    view10.setVisibility(8);
                    view9.setVisibility(8);
                } else {
                    try {
                        c1872l.f14274B.setText(optString);
                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MMMM");
                        x0.f fVar = (x0.f) goPremiumLayout.f3613q;
                        fVar.getClass();
                        Calendar calendar = Calendar.getInstance();
                        calendar.setTime(AbstractC1959n.a((MainActivity) fVar.f15212p));
                        calendar.add(5, 0);
                        c1872l.f14275C.setText(goPremiumLayout.getContext().getString(R.string.offer_ends) + " " + simpleDateFormat.format(calendar.getTime()));
                    } catch (Throwable unused) {
                        view10.setVisibility(8);
                        view9.setVisibility(8);
                    }
                }
                c1872l.f3244a.setOnClickListener(new ViewOnClickListenerC0014n(8, this, c1872l));
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [b0.c0, C0.r0] */
    /* JADX WARN: Type inference failed for: r4v7, types: [n1.b, b0.c0] */
    @Override // b0.AbstractC0171E
    public final b0.c0 g(ViewGroup viewGroup, int i4) {
        switch (this.c) {
            case 0:
                View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.shared_info_standard_holder, viewGroup, false);
                ?? c0Var = new b0.c0(inflate);
                c0Var.f378t = (TextView) inflate.findViewById(R.id.share_item_standard_title);
                c0Var.f379u = (TextView) inflate.findViewById(R.id.share_item_standard_downloads);
                c0Var.f380v = (TextView) inflate.findViewById(R.id.share_item_standard_likes);
                c0Var.f381w = inflate.findViewById(R.id.shared_item_explore);
                c0Var.f382x = inflate.findViewById(R.id.shared_item_explore_selected);
                c0Var.f373A = (TextView) inflate.findViewById(R.id.elem_num);
                c0Var.f374B = (TextView) inflate.findViewById(R.id.conn_num);
                c0Var.f375C = inflate.findViewById(R.id.like_button);
                c0Var.f376D = inflate.findViewById(R.id.shared_like_image);
                c0Var.f377E = inflate.findViewById(R.id.shared_non_like_image);
                c0Var.y = inflate.findViewById(R.id.download_ok);
                c0Var.f383z = inflate.findViewById(R.id.download_non);
                return c0Var;
            case 1:
                View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.tutorial_item_layout, viewGroup, false);
                ?? c0Var2 = new b0.c0(inflate2);
                c0Var2.f14107t = (ImageView) inflate2.findViewById(R.id.tut_drawable);
                c0Var2.f14108u = (TextView) inflate2.findViewById(R.id.tut_title);
                c0Var2.f14109v = (TextView) inflate2.findViewById(R.id.tut_descr);
                return c0Var2;
            default:
                return new C1872l((GoPremiumLayout) this.f370f, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.price_item_layout, viewGroup, false));
        }
    }

    @Override // b0.AbstractC0171E
    public final void h(b0.c0 c0Var) {
        switch (this.c) {
            case 0:
                r0 r0Var = (r0) c0Var;
                r0Var.f375C.setOnClickListener(null);
                r0Var.f3244a.setOnClickListener(null);
                return;
            case 1:
                ((C1809b) c0Var).f3244a.setOnClickListener(null);
                return;
            default:
                ((C1872l) c0Var).f3244a.setOnClickListener(null);
                return;
        }
    }
}
