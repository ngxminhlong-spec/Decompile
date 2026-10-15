package H;

import android.view.View;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class F {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f787a;

    public F(View view) {
        this.f787a = new WeakReference(view);
    }

    public final void a(float f4) {
        View view = (View) this.f787a.get();
        if (view != null) {
            view.animate().alpha(f4);
        }
    }

    public final void b() {
        View view = (View) this.f787a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void c(long j4) {
        View view = (View) this.f787a.get();
        if (view != null) {
            view.animate().setDuration(j4);
        }
    }

    public final void d(G g4) {
        View view = (View) this.f787a.get();
        if (view != null) {
            if (g4 != null) {
                view.animate().setListener(new E(g4, view));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    public final void e(float f4) {
        View view = (View) this.f787a.get();
        if (view != null) {
            view.animate().translationY(f4);
        }
    }
}
