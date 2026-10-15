package o1;

import android.view.View;
import com.duracodefactory.logiccircuitsimulatorpro.ui.ToolbarContainer;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: o1.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC1857d0 implements View.OnClickListener {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f14259o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ ToolbarContainer f14260p;

    public /* synthetic */ ViewOnClickListenerC1857d0(ToolbarContainer toolbarContainer, int i4) {
        this.f14259o = i4;
        this.f14260p = toolbarContainer;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f14259o) {
            case 0:
                this.f14260p.f3767o.c();
                return;
            case 1:
                this.f14260p.f3767o.i();
                return;
            case 2:
                this.f14260p.f3767o.g();
                return;
            case 3:
                this.f14260p.f3767o.f();
                return;
            default:
                this.f14260p.f3767o.l();
                return;
        }
    }
}
