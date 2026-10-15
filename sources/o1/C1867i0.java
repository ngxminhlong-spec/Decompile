package o1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import b0.AbstractC0171E;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import java.util.ArrayList;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: o1.i0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1867i0 extends AbstractC0171E {
    public ArrayList c;

    @Override // b0.AbstractC0171E
    public final int a() {
        return this.c.size();
    }

    @Override // b0.AbstractC0171E
    public final void f(b0.c0 c0Var, int i4) {
        C1869j0 c1869j0 = (C1869j0) c0Var;
        C1841Q c1841q = (C1841Q) this.c.get(i4);
        int i5 = i4 + 1;
        boolean z4 = i4 == this.c.size() - 1;
        c1869j0.f14267t.setText("" + i5);
        c1869j0.f14268u.setText(c1841q.c);
        c1869j0.f14269v.setImageResource(c1841q.f14225a);
        c1869j0.f14270w.setVisibility(z4 ? 8 : 0);
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [o1.j0, b0.c0] */
    @Override // b0.AbstractC0171E
    public final b0.c0 g(ViewGroup viewGroup, int i4) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.new_tutorial_entry_item, viewGroup, false);
        ?? c0Var = new b0.c0(inflate);
        c0Var.f14267t = (TextView) inflate.findViewById(R.id.new_tut_digit);
        c0Var.f14268u = (TextView) inflate.findViewById(R.id.new_tut_text);
        c0Var.f14269v = (ImageView) inflate.findViewById(R.id.new_tut_image);
        c0Var.f14270w = inflate.findViewById(R.id.new_tut_bottom_line);
        return c0Var;
    }
}
