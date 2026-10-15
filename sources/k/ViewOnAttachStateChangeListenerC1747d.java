package k;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: k.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC1747d implements View.OnAttachStateChangeListener {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f13383o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ v f13384p;

    public /* synthetic */ ViewOnAttachStateChangeListenerC1747d(v vVar, int i4) {
        this.f13383o = i4;
        this.f13384p = vVar;
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i4 = this.f13383o;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f13383o) {
            case 0:
                g gVar = (g) this.f13384p;
                ViewTreeObserver viewTreeObserver = gVar.f13400L;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        gVar.f13400L = view.getViewTreeObserver();
                    }
                    gVar.f13400L.removeGlobalOnLayoutListener(gVar.f13409w);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            default:
                E e4 = (E) this.f13384p;
                ViewTreeObserver viewTreeObserver2 = e4.f13350C;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        e4.f13350C = view.getViewTreeObserver();
                    }
                    e4.f13350C.removeGlobalOnLayoutListener(e4.f13363w);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
        }
    }
}
