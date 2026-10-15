package H2;

import V2.f;
import V2.g;
import V2.k;
import V2.u;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import com.google.android.material.button.MaterialButton;
import o2.AbstractC1895f;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final MaterialButton f887a;

    /* renamed from: b, reason: collision with root package name */
    public k f888b;
    public int c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f889e;

    /* renamed from: f, reason: collision with root package name */
    public int f890f;

    /* renamed from: g, reason: collision with root package name */
    public int f891g;

    /* renamed from: h, reason: collision with root package name */
    public int f892h;

    /* renamed from: i, reason: collision with root package name */
    public PorterDuff.Mode f893i;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f894j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f895k;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f896l;

    /* renamed from: m, reason: collision with root package name */
    public g f897m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f898n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f899o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f900p = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f901q;

    /* renamed from: r, reason: collision with root package name */
    public RippleDrawable f902r;

    public c(MaterialButton materialButton, k kVar) {
        this.f887a = materialButton;
        this.f888b = kVar;
    }

    public final u a() {
        RippleDrawable rippleDrawable = this.f902r;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.f902r.getNumberOfLayers() > 2 ? (u) this.f902r.getDrawable(2) : (u) this.f902r.getDrawable(1);
    }

    public final g b(boolean z4) {
        RippleDrawable rippleDrawable = this.f902r;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (g) ((LayerDrawable) ((InsetDrawable) this.f902r.getDrawable(0)).getDrawable()).getDrawable(!z4 ? 1 : 0);
    }

    public final void c(k kVar) {
        this.f888b = kVar;
        if (b(false) != null) {
            b(false).setShapeAppearanceModel(kVar);
        }
        if (b(true) != null) {
            b(true).setShapeAppearanceModel(kVar);
        }
        if (a() != null) {
            a().setShapeAppearanceModel(kVar);
        }
    }

    public final void d() {
        g b4 = b(false);
        g b5 = b(true);
        if (b4 != null) {
            float f4 = this.f892h;
            ColorStateList colorStateList = this.f895k;
            b4.f1880o.f1861j = f4;
            b4.invalidateSelf();
            f fVar = b4.f1880o;
            if (fVar.d != colorStateList) {
                fVar.d = colorStateList;
                b4.onStateChange(b4.getState());
            }
            if (b5 != null) {
                float f5 = this.f892h;
                int m4 = this.f898n ? AbstractC1895f.m(this.f887a, R.attr.colorSurface) : 0;
                b5.f1880o.f1861j = f5;
                b5.invalidateSelf();
                ColorStateList valueOf = ColorStateList.valueOf(m4);
                f fVar2 = b5.f1880o;
                if (fVar2.d != valueOf) {
                    fVar2.d = valueOf;
                    b5.onStateChange(b5.getState());
                }
            }
        }
    }
}
