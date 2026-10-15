package k;

import android.widget.PopupWindow;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class w implements PopupWindow.OnDismissListener {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ x f13487o;

    public w(x xVar) {
        this.f13487o = xVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f13487o.c();
    }
}
