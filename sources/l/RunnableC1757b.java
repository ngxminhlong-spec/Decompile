package l;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: l.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1757b implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f13717o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ ActionBarOverlayLayout f13718p;

    public /* synthetic */ RunnableC1757b(ActionBarOverlayLayout actionBarOverlayLayout, int i4) {
        this.f13717o = i4;
        this.f13718p = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f13717o) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f13718p;
                actionBarOverlayLayout.h();
                actionBarOverlayLayout.f2517K = actionBarOverlayLayout.f2524r.animate().translationY(0.0f).setListener(actionBarOverlayLayout.f2518L);
                return;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f13718p;
                actionBarOverlayLayout2.h();
                actionBarOverlayLayout2.f2517K = actionBarOverlayLayout2.f2524r.animate().translationY(-actionBarOverlayLayout2.f2524r.getHeight()).setListener(actionBarOverlayLayout2.f2518L);
                return;
        }
    }
}
