package androidx.cardview.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.gms.internal.ads.C0831kn;
import p.AbstractC1901a;
import q.C1944a;
import v3.C2033d;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class CardView extends FrameLayout {

    /* renamed from: t */
    public static final int[] f2644t = {R.attr.colorBackground};

    /* renamed from: u */
    public static final C2033d f2645u = new C2033d(25);

    /* renamed from: o */
    public boolean f2646o;

    /* renamed from: p */
    public boolean f2647p;

    /* renamed from: q */
    public final Rect f2648q;

    /* renamed from: r */
    public final Rect f2649r;

    /* renamed from: s */
    public final C0831kn f2650s;

    public CardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.duracodefactory.logiccircuitsimulatorpro.R.attr.cardViewStyle);
        ColorStateList valueOf;
        Rect rect = new Rect();
        this.f2648q = rect;
        this.f2649r = new Rect();
        C0831kn c0831kn = new C0831kn(18, this);
        this.f2650s = c0831kn;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1901a.f14373a, com.duracodefactory.logiccircuitsimulatorpro.R.attr.cardViewStyle, com.duracodefactory.logiccircuitsimulatorpro.R.style.CardView);
        if (obtainStyledAttributes.hasValue(2)) {
            valueOf = obtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(f2644t);
            int color = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            valueOf = ColorStateList.valueOf(fArr[2] > 0.5f ? getResources().getColor(com.duracodefactory.logiccircuitsimulatorpro.R.color.cardview_light_background) : getResources().getColor(com.duracodefactory.logiccircuitsimulatorpro.R.color.cardview_dark_background));
        }
        float dimension = obtainStyledAttributes.getDimension(3, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(4, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(5, 0.0f);
        this.f2646o = obtainStyledAttributes.getBoolean(7, false);
        this.f2647p = obtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        C1944a c1944a = new C1944a(valueOf, dimension);
        c0831kn.f9319p = c1944a;
        setBackgroundDrawable(c1944a);
        setClipToOutline(true);
        setElevation(dimension2);
        f2645u.k(c0831kn, dimension3);
    }

    public static /* synthetic */ void a(CardView cardView, int i4, int i5, int i6, int i7) {
        super.setPadding(i4, i5, i6, i7);
    }

    public ColorStateList getCardBackgroundColor() {
        return ((C1944a) ((Drawable) this.f2650s.f9319p)).f14612h;
    }

    public float getCardElevation() {
        return ((CardView) this.f2650s.f9320q).getElevation();
    }

    public int getContentPaddingBottom() {
        return this.f2648q.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f2648q.left;
    }

    public int getContentPaddingRight() {
        return this.f2648q.right;
    }

    public int getContentPaddingTop() {
        return this.f2648q.top;
    }

    public float getMaxCardElevation() {
        return ((C1944a) ((Drawable) this.f2650s.f9319p)).f14609e;
    }

    public boolean getPreventCornerOverlap() {
        return this.f2647p;
    }

    public float getRadius() {
        return ((C1944a) ((Drawable) this.f2650s.f9319p)).f14607a;
    }

    public boolean getUseCompatPadding() {
        return this.f2646o;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
    }

    public void setCardBackgroundColor(int i4) {
        ColorStateList valueOf = ColorStateList.valueOf(i4);
        C1944a c1944a = (C1944a) ((Drawable) this.f2650s.f9319p);
        if (valueOf == null) {
            c1944a.getClass();
            valueOf = ColorStateList.valueOf(0);
        }
        c1944a.f14612h = valueOf;
        c1944a.f14608b.setColor(valueOf.getColorForState(c1944a.getState(), c1944a.f14612h.getDefaultColor()));
        c1944a.invalidateSelf();
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        C1944a c1944a = (C1944a) ((Drawable) this.f2650s.f9319p);
        if (colorStateList == null) {
            c1944a.getClass();
            colorStateList = ColorStateList.valueOf(0);
        }
        c1944a.f14612h = colorStateList;
        c1944a.f14608b.setColor(colorStateList.getColorForState(c1944a.getState(), c1944a.f14612h.getDefaultColor()));
        c1944a.invalidateSelf();
    }

    public void setCardElevation(float f4) {
        ((CardView) this.f2650s.f9320q).setElevation(f4);
    }

    public void setMaxCardElevation(float f4) {
        f2645u.k(this.f2650s, f4);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i4) {
        super.setMinimumHeight(i4);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i4) {
        super.setMinimumWidth(i4);
    }

    @Override // android.view.View
    public final void setPadding(int i4, int i5, int i6, int i7) {
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i4, int i5, int i6, int i7) {
    }

    public void setPreventCornerOverlap(boolean z4) {
        if (z4 != this.f2647p) {
            this.f2647p = z4;
            C0831kn c0831kn = this.f2650s;
            f2645u.k(c0831kn, ((C1944a) ((Drawable) c0831kn.f9319p)).f14609e);
        }
    }

    public void setRadius(float f4) {
        C1944a c1944a = (C1944a) ((Drawable) this.f2650s.f9319p);
        if (f4 == c1944a.f14607a) {
            return;
        }
        c1944a.f14607a = f4;
        c1944a.b(null);
        c1944a.invalidateSelf();
    }

    public void setUseCompatPadding(boolean z4) {
        if (this.f2646o != z4) {
            this.f2646o = z4;
            C0831kn c0831kn = this.f2650s;
            f2645u.k(c0831kn, ((C1944a) ((Drawable) c0831kn.f9319p)).f14609e);
        }
    }
}
