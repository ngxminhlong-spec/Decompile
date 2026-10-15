package k;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;
import j.InterfaceC1720b;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class r extends FrameLayout implements InterfaceC1720b {

    /* renamed from: o, reason: collision with root package name */
    public final CollapsibleActionView f13481o;

    /* JADX WARN: Multi-variable type inference failed */
    public r(View view) {
        super(view.getContext());
        this.f13481o = (CollapsibleActionView) view;
        addView(view);
    }

    @Override // j.InterfaceC1720b
    public final void onActionViewCollapsed() {
        this.f13481o.onActionViewCollapsed();
    }

    @Override // j.InterfaceC1720b
    public final void onActionViewExpanded() {
        this.f13481o.onActionViewExpanded();
    }
}
