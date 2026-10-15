package a3;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.transformation.ExpandableBehavior;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class a implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ View f2352o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f2353p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ N2.a f2354q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ ExpandableBehavior f2355r;

    public a(ExpandableBehavior expandableBehavior, View view, int i4, N2.a aVar) {
        this.f2355r = expandableBehavior;
        this.f2352o = view;
        this.f2353p = i4;
        this.f2354q = aVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        View view = this.f2352o;
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        ExpandableBehavior expandableBehavior = this.f2355r;
        if (expandableBehavior.f12536a == this.f2353p) {
            Object obj = this.f2354q;
            expandableBehavior.r((View) obj, view, ((FloatingActionButton) obj).f12422C.f1228a, false);
        }
        return false;
    }
}
