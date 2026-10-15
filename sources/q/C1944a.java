package q;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: q.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1944a extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public float f14607a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f14608b;
    public final RectF c;
    public final Rect d;

    /* renamed from: e, reason: collision with root package name */
    public float f14609e;

    /* renamed from: h, reason: collision with root package name */
    public ColorStateList f14612h;

    /* renamed from: i, reason: collision with root package name */
    public PorterDuffColorFilter f14613i;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f14614j;

    /* renamed from: f, reason: collision with root package name */
    public boolean f14610f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f14611g = true;

    /* renamed from: k, reason: collision with root package name */
    public PorterDuff.Mode f14615k = PorterDuff.Mode.SRC_IN;

    public C1944a(ColorStateList colorStateList, float f4) {
        this.f14607a = f4;
        Paint paint = new Paint(5);
        this.f14608b = paint;
        colorStateList = colorStateList == null ? ColorStateList.valueOf(0) : colorStateList;
        this.f14612h = colorStateList;
        paint.setColor(colorStateList.getColorForState(getState(), this.f14612h.getDefaultColor()));
        this.c = new RectF();
        this.d = new Rect();
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public final void b(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        float f4 = rect.left;
        float f5 = rect.top;
        float f6 = rect.right;
        float f7 = rect.bottom;
        RectF rectF = this.c;
        rectF.set(f4, f5, f6, f7);
        Rect rect2 = this.d;
        rect2.set(rect);
        if (this.f14610f) {
            rect2.inset((int) Math.ceil(b.a(this.f14609e, this.f14607a, this.f14611g)), (int) Math.ceil(b.b(this.f14609e, this.f14607a, this.f14611g)));
            rectF.set(rect2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z4;
        PorterDuffColorFilter porterDuffColorFilter = this.f14613i;
        Paint paint = this.f14608b;
        if (porterDuffColorFilter == null || paint.getColorFilter() != null) {
            z4 = false;
        } else {
            paint.setColorFilter(this.f14613i);
            z4 = true;
        }
        RectF rectF = this.c;
        float f4 = this.f14607a;
        canvas.drawRoundRect(rectF, f4, f4, paint);
        if (z4) {
            paint.setColorFilter(null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        outline.setRoundRect(this.d, this.f14607a);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList = this.f14614j;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.f14612h;
        return (colorStateList2 != null && colorStateList2.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        b(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f14612h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        Paint paint = this.f14608b;
        boolean z4 = colorForState != paint.getColor();
        if (z4) {
            paint.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f14614j;
        if (colorStateList2 == null || (mode = this.f14615k) == null) {
            return z4;
        }
        this.f14613i = a(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i4) {
        this.f14608b.setAlpha(i4);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f14608b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.f14614j = colorStateList;
        this.f14613i = a(colorStateList, this.f14615k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.f14615k = mode;
        this.f14613i = a(this.f14614j, mode);
        invalidateSelf();
    }
}
