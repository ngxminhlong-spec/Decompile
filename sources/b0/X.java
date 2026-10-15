package b0;

import android.util.Log;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class X {

    /* renamed from: a, reason: collision with root package name */
    public int f3211a;

    /* renamed from: b, reason: collision with root package name */
    public int f3212b;
    public int c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public Interpolator f3213e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3214f;

    /* renamed from: g, reason: collision with root package name */
    public int f3215g;

    public final void a(RecyclerView recyclerView) {
        int i4 = this.d;
        if (i4 >= 0) {
            this.d = -1;
            recyclerView.N(i4);
            this.f3214f = false;
            return;
        }
        if (!this.f3214f) {
            this.f3215g = 0;
            return;
        }
        Interpolator interpolator = this.f3213e;
        if (interpolator != null && this.c < 1) {
            throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
        }
        int i5 = this.c;
        if (i5 < 1) {
            throw new IllegalStateException("Scroll duration must be a positive number");
        }
        recyclerView.f3075q0.b(this.f3211a, this.f3212b, i5, interpolator);
        int i6 = this.f3215g + 1;
        this.f3215g = i6;
        if (i6 > 10) {
            Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
        }
        this.f3214f = false;
    }
}
