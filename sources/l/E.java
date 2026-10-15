package l;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class E implements PopupWindow.OnDismissListener {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Q2.a f13591o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ F f13592p;

    public E(F f4, Q2.a aVar) {
        this.f13592p = f4;
        this.f13591o = aVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f13592p.f13599U.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f13591o);
        }
    }
}
