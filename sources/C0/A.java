package C0;

import h1.AbstractC1698a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class A extends G2.c {

    /* renamed from: a, reason: collision with root package name */
    public int f161a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ D f162b;

    public A(D d) {
        this.f162b = d;
    }

    @Override // G2.c
    public final void a(float f4) {
        if (Float.isNaN(f4) || this.f161a == 4) {
            return;
        }
        D d = this.f162b;
        d.f207l0.setVisibility(0);
        d.f207l0.setAlpha(f4);
        d.f213o0.setRotation(f4 * 180.0f);
        d.f213o0.requestLayout();
    }

    @Override // G2.c
    public final void b(int i4) {
        D d = this.f162b;
        d.f227z0 = i4;
        if (i4 == 4) {
            d.f207l0.setVisibility(8);
            for (int i5 = 0; i5 < d.f215p0.getChildCount(); i5++) {
                d.f215p0.getChildAt(i5).setVisibility(8);
            }
            String str = d.f226y0;
            if (d.f227z0 == 3) {
                d.f226y0 = str;
            } else {
                d.f221t0.setText(str);
            }
            if (d.f176I0) {
                d.f176I0 = false;
                d.m0();
            }
            if (d.J0) {
                d.J0 = false;
                AbstractC1698a selectedElement = d.f202i0.getSelectedElement();
                if (selectedElement != null) {
                    d.l0(selectedElement.r());
                }
            }
            if (d.f205j1) {
                d.f205j1 = false;
            }
            d.f202i0.invalidate();
        }
        this.f161a = i4;
    }
}
