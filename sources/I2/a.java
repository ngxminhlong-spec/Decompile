package I2;

import android.R;
import android.content.res.ColorStateList;
import l.C1783p;
import o2.AbstractC1895f;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class a extends C1783p {

    /* renamed from: t, reason: collision with root package name */
    public static final int[][] f921t = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: r, reason: collision with root package name */
    public ColorStateList f922r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f923s;

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f922r == null) {
            int m4 = AbstractC1895f.m(this, com.duracodefactory.logiccircuitsimulatorpro.R.attr.colorControlActivated);
            int m5 = AbstractC1895f.m(this, com.duracodefactory.logiccircuitsimulatorpro.R.attr.colorSurface);
            int m6 = AbstractC1895f.m(this, com.duracodefactory.logiccircuitsimulatorpro.R.attr.colorOnSurface);
            this.f922r = new ColorStateList(f921t, new int[]{AbstractC1895f.r(m5, m4, 1.0f), AbstractC1895f.r(m5, m6, 0.54f), AbstractC1895f.r(m5, m6, 0.38f), AbstractC1895f.r(m5, m6, 0.38f)});
        }
        return this.f922r;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f923s && getButtonTintList() == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z4) {
        this.f923s = z4;
        if (z4) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }
}
