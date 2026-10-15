package k0;

import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class j implements n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f13519a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f13520b;

    public j(View view, ArrayList arrayList) {
        this.f13519a = view;
        this.f13520b = arrayList;
    }

    @Override // k0.n
    public final void a() {
    }

    @Override // k0.n
    public final void b() {
    }

    @Override // k0.n
    public final void c() {
    }

    @Override // k0.n
    public final void d() {
    }

    @Override // k0.n
    public final void e(o oVar) {
        oVar.v(this);
        this.f13519a.setVisibility(8);
        ArrayList arrayList = this.f13520b;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((View) arrayList.get(i4)).setVisibility(0);
        }
    }
}
