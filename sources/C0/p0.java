package C0;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import com.duracodefactory.logiccircuitsimulatorpro.ui.CircuitExploreDialog;
import l1.C1797d;
import m2.AbstractC1806a;
import s1.C1977g;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class p0 implements View.OnClickListener {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ r0 f361o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C1797d f362p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ boolean f363q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f364r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ q0 f365s;

    public p0(q0 q0Var, r0 r0Var, C1797d c1797d, boolean z4, int i4) {
        this.f365s = q0Var;
        this.f361o = r0Var;
        this.f362p = c1797d;
        this.f363q = z4;
        this.f364r = i4;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i4 = this.f364r;
        q0 q0Var = this.f365s;
        s0 s0Var = (s0) q0Var.f370f;
        try {
            l1.f fVar = l1.f.f13951e;
            Context context = this.f361o.f3244a.getContext();
            C1797d c1797d = this.f362p;
            fVar.getClass();
            i1.d c = i1.c.c(context.getResources().openRawResource(c1797d.f13942a), c1797d.d);
            CircuitExploreDialog circuitExploreDialog = (CircuitExploreDialog) LayoutInflater.from(((v0) s0Var.f393i).l()).inflate(R.layout.explore_circuit_layout, (ViewGroup) null);
            circuitExploreDialog.setListener(new D3.d(4, this));
            ViewOnClickListenerC0022w viewOnClickListenerC0022w = new ViewOnClickListenerC0022w(4, this);
            View findViewById = circuitExploreDialog.findViewById(R.id.download_btn);
            findViewById.setVisibility(0);
            findViewById.setOnClickListener(viewOnClickListenerC0022w);
            int dimensionPixelSize = ((v0) s0Var.f393i).m().getDimensionPixelSize(R.dimen.grid_text_size);
            int dimensionPixelSize2 = ((v0) s0Var.f393i).m().getDimensionPixelSize(R.dimen.grid_lines_width);
            circuitExploreDialog.a(c.f13263g, new C1977g(dimensionPixelSize, ((v0) s0Var.f393i).l().getColor(R.color.grid_text_color), ((v0) s0Var.f393i).m().getDimensionPixelSize(R.dimen.grid_text_padding), ((v0) s0Var.f393i).l().getColor(R.color.grid_lines_color), dimensionPixelSize2, AbstractC1806a.v(((v0) s0Var.f393i).h())));
            circuitExploreDialog.findViewById(R.id.peek_label).setVisibility(8);
            if (s0Var.f388b) {
                int i5 = q0Var.d;
                q0Var.d = i4;
                if (i5 >= 0) {
                    q0Var.e(i5);
                }
                q0Var.e(i4);
                if (((ViewGroup) s0Var.c).getChildCount() > 0) {
                    ((CircuitExploreDialog) ((ViewGroup) s0Var.c).getChildAt(0)).d();
                }
                ((ViewGroup) s0Var.c).removeAllViews();
                ((ViewGroup) s0Var.c).addView(circuitExploreDialog, new ViewGroup.LayoutParams(-1, -1));
                circuitExploreDialog.f3590t = true;
                circuitExploreDialog.f3587q.setVisibility(8);
                circuitExploreDialog.findViewById(R.id.title_container).setElevation(0.0f);
                circuitExploreDialog.f3586p.setTextAlignment(4);
                ((ViewGroup) s0Var.c).setVisibility(0);
            } else {
                ((ViewGroup) s0Var.d).removeAllViews();
                ((ViewGroup) s0Var.d).addView(circuitExploreDialog, new ViewGroup.LayoutParams(-1, -1));
                ((ViewGroup) s0Var.d).setVisibility(0);
                circuitExploreDialog.findViewById(R.id.title_container).setBackgroundColor(circuitExploreDialog.getContext().getColor(R.color.board_background));
                circuitExploreDialog.setBackgroundColor(circuitExploreDialog.getContext().getColor(R.color.board_background));
            }
            ((InputMethodManager) ((ViewGroup) s0Var.c).getContext().getSystemService("input_method")).hideSoftInputFromWindow(((ViewGroup) s0Var.c).getWindowToken(), 0);
        } catch (Throwable th) {
            String message = th.getMessage();
            if (message != null) {
                W2.n.e((View) s0Var.f391g, message).f();
            }
        }
    }
}
