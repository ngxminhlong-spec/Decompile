package o1;

import android.view.View;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: o1.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC1831G implements View.OnClickListener {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f14208o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ DialogC1832H f14209p;

    public /* synthetic */ ViewOnClickListenerC1831G(DialogC1832H dialogC1832H, int i4) {
        this.f14208o = i4;
        this.f14209p = dialogC1832H;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f14208o) {
            case 0:
                DialogC1832H dialogC1832H = this.f14209p;
                dialogC1832H.f14210o = true;
                dialogC1832H.dismiss();
                return;
            default:
                this.f14209p.dismiss();
                return;
        }
    }
}
