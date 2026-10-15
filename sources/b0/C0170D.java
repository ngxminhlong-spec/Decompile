package b0;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: b0.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0170D {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f3175a;

    public void a(int i4) {
        RecyclerView recyclerView = this.f3175a;
        View childAt = recyclerView.getChildAt(i4);
        if (childAt != null) {
            recyclerView.o(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i4);
    }
}
