package Y2;

import com.google.android.material.textfield.TextInputLayout;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class t implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f2216o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ TextInputLayout f2217p;

    public /* synthetic */ t(TextInputLayout textInputLayout, int i4) {
        this.f2216o = i4;
        this.f2217p = textInputLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2216o) {
            case 0:
                TextInputLayout textInputLayout = this.f2217p;
                textInputLayout.f12522s0.performClick();
                textInputLayout.f12522s0.jumpDrawablesToCurrentState();
                return;
            default:
                this.f2217p.f12521s.requestLayout();
                return;
        }
    }
}
