package b0;

import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: b0.V, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0187V {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f3209a;

    public C0187V(RecyclerView recyclerView) {
        this.f3209a = recyclerView;
    }

    public final void a() {
        int[] iArr = RecyclerView.J0;
        RecyclerView recyclerView = this.f3209a;
        if (!recyclerView.f3035F || !recyclerView.f3033E) {
            recyclerView.f3046M = true;
            recyclerView.requestLayout();
        } else {
            RunnableC0168B runnableC0168B = recyclerView.f3084v;
            WeakHashMap weakHashMap = H.A.f779a;
            recyclerView.postOnAnimation(runnableC0168B);
        }
    }
}
