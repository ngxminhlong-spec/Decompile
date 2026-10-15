package P2;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import l.AbstractC1756a0;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class e extends AbstractC1756a0 {

    /* renamed from: D, reason: collision with root package name */
    public Drawable f1567D;

    /* renamed from: E, reason: collision with root package name */
    public final Rect f1568E;

    /* renamed from: F, reason: collision with root package name */
    public final Rect f1569F;

    /* renamed from: G, reason: collision with root package name */
    public int f1570G;

    /* renamed from: H, reason: collision with root package name */
    public final boolean f1571H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f1572I;

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f1568E = new Rect();
        this.f1569F = new Rect();
        this.f1570G = 119;
        this.f1571H = true;
        this.f1572I = false;
        w.a(context, attributeSet, 0, 0);
        int[] iArr = B2.a.f142h;
        w.b(context, attributeSet, iArr, 0, 0, new int[0]);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        this.f1570G = obtainStyledAttributes.getInt(1, this.f1570G);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f1571H = obtainStyledAttributes.getBoolean(2, true);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f1567D;
        if (drawable != null) {
            if (this.f1572I) {
                this.f1572I = false;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                boolean z4 = this.f1571H;
                Rect rect = this.f1568E;
                if (z4) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                int i4 = this.f1570G;
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                Rect rect2 = this.f1569F;
                Gravity.apply(i4, intrinsicWidth, intrinsicHeight, rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void drawableHotspotChanged(float f4, float f5) {
        super.drawableHotspotChanged(f4, f5);
        Drawable drawable = this.f1567D;
        if (drawable != null) {
            drawable.setHotspot(f4, f5);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f1567D;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f1567D.setState(getDrawableState());
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f1567D;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f1570G;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1567D;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // l.AbstractC1756a0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        super.onLayout(z4, i4, i5, i6, i7);
        this.f1572I = z4 | this.f1572I;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i4, int i5, int i6, int i7) {
        super.onSizeChanged(i4, i5, i6, i7);
        this.f1572I = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f1567D;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f1567D);
            }
            this.f1567D = drawable;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f1570G == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i4) {
        if (this.f1570G != i4) {
            if ((8388615 & i4) == 0) {
                i4 |= 8388611;
            }
            if ((i4 & 112) == 0) {
                i4 |= 48;
            }
            this.f1570G = i4;
            if (i4 == 119 && this.f1567D != null) {
                this.f1567D.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f1567D;
    }
}
