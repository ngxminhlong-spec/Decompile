package R2;

import android.R;
import android.content.res.ColorStateList;
import l.C1790x;
import o2.AbstractC1895f;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class a extends C1790x {

    /* renamed from: t, reason: collision with root package name */
    public static final int[][] f1754t = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: r, reason: collision with root package name */
    public ColorStateList f1755r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1756s;

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f1755r == null) {
            int m4 = AbstractC1895f.m(this, com.duracodefactory.logiccircuitsimulatorpro.R.attr.colorControlActivated);
            int m5 = AbstractC1895f.m(this, com.duracodefactory.logiccircuitsimulatorpro.R.attr.colorOnSurface);
            int m6 = AbstractC1895f.m(this, com.duracodefactory.logiccircuitsimulatorpro.R.attr.colorSurface);
            this.f1755r = new ColorStateList(f1754t, new int[]{AbstractC1895f.r(m6, m4, 1.0f), AbstractC1895f.r(m6, m5, 0.54f), AbstractC1895f.r(m6, m5, 0.38f), AbstractC1895f.r(m6, m5, 0.38f)});
        }
        return this.f1755r;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f1756s && getButtonTintList() == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z4) {
        this.f1756s = z4;
        if (z4) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }
}
