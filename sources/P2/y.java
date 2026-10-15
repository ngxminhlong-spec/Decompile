package P2;

import android.widget.ImageButton;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class y extends ImageButton {

    /* renamed from: o, reason: collision with root package name */
    public int f1611o;

    public final void a(int i4, boolean z4) {
        super.setVisibility(i4);
        if (z4) {
            this.f1611o = i4;
        }
    }

    public final int getUserSetVisibility() {
        return this.f1611o;
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i4) {
        a(i4, true);
    }
}
