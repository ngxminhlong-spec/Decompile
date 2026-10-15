package k0;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import java.util.ArrayList;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class z extends p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f13569a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f13570b;
    public final /* synthetic */ View c;
    public final /* synthetic */ h d;

    public z(h hVar, ViewGroup viewGroup, View view, View view2) {
        this.d = hVar;
        this.f13569a = viewGroup;
        this.f13570b = view;
        this.c = view2;
    }

    @Override // k0.p, k0.n
    public final void b() {
        this.f13569a.getOverlay().remove(this.f13570b);
    }

    @Override // k0.p, k0.n
    public final void c() {
        View view = this.f13570b;
        if (view.getParent() == null) {
            this.f13569a.getOverlay().add(view);
            return;
        }
        h hVar = this.d;
        ArrayList arrayList = hVar.y;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((Animator) arrayList.get(size)).cancel();
        }
        ArrayList arrayList2 = hVar.f13534C;
        if (arrayList2 == null || arrayList2.size() <= 0) {
            return;
        }
        ArrayList arrayList3 = (ArrayList) hVar.f13534C.clone();
        int size2 = arrayList3.size();
        for (int i4 = 0; i4 < size2; i4++) {
            ((n) arrayList3.get(i4)).d();
        }
    }

    @Override // k0.n
    public final void e(o oVar) {
        this.c.setTag(R.id.save_overlay_view, null);
        this.f13569a.getOverlay().remove(this.f13570b);
        oVar.v(this);
    }
}
