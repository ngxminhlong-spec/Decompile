package b0;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class g0 extends C0212y {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C0213z f3278q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(C0213z c0213z, Context context) {
        super(context);
        this.f3278q = c0213z;
    }

    @Override // b0.C0212y
    public final float b(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    @Override // b0.C0212y
    public final void f(View view, X x4) {
        C0213z c0213z = this.f3278q;
        RecyclerView recyclerView = c0213z.f3448a;
        if (recyclerView == null) {
            return;
        }
        int[] a4 = c0213z.a(recyclerView.getLayoutManager(), view);
        int i4 = a4[0];
        int i5 = a4[1];
        int ceil = (int) Math.ceil(c(Math.max(Math.abs(i4), Math.abs(i5))) / 0.3356d);
        if (ceil > 0) {
            x4.f3211a = i4;
            x4.f3212b = i5;
            x4.c = ceil;
            x4.f3213e = this.f3441j;
            x4.f3214f = true;
        }
    }
}
