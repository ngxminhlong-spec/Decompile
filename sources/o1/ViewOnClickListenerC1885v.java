package o1;

import android.view.View;
import com.duracodefactory.logiccircuitsimulatorpro.ui.InsertProjectLayout;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: o1.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC1885v implements View.OnClickListener {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f14306o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InsertProjectLayout f14307p;

    public /* synthetic */ ViewOnClickListenerC1885v(InsertProjectLayout insertProjectLayout, int i4) {
        this.f14306o = i4;
        this.f14307p = insertProjectLayout;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f14306o) {
            case 0:
                InterfaceC1886w interfaceC1886w = this.f14307p.f3637r;
                if (interfaceC1886w != null) {
                    interfaceC1886w.a();
                    return;
                }
                return;
            default:
                this.f14307p.f3640u.setVisibility(4);
                return;
        }
    }
}
