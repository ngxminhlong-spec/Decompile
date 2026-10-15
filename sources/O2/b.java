package O2;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class b extends Drawable {

    /* renamed from: b, reason: collision with root package name */
    public final Paint f1413b;

    /* renamed from: h, reason: collision with root package name */
    public float f1417h;

    /* renamed from: i, reason: collision with root package name */
    public int f1418i;

    /* renamed from: j, reason: collision with root package name */
    public int f1419j;

    /* renamed from: k, reason: collision with root package name */
    public int f1420k;

    /* renamed from: l, reason: collision with root package name */
    public int f1421l;

    /* renamed from: m, reason: collision with root package name */
    public int f1422m;

    /* renamed from: o, reason: collision with root package name */
    public V2.k f1424o;

    /* renamed from: p, reason: collision with root package name */
    public ColorStateList f1425p;

    /* renamed from: a, reason: collision with root package name */
    public final V2.l f1412a = new V2.l();
    public final Path c = new Path();
    public final Rect d = new Rect();

    /* renamed from: e, reason: collision with root package name */
    public final RectF f1414e = new RectF();

    /* renamed from: f, reason: collision with root package name */
    public final RectF f1415f = new RectF();

    /* renamed from: g, reason: collision with root package name */
    public final a f1416g = new a(this);

    /* renamed from: n, reason: collision with root package name */
    public boolean f1423n = true;

    public b(V2.k kVar) {
        this.f1424o = kVar;
        Paint paint = new Paint(1);
        this.f1413b = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z4 = this.f1423n;
        Rect rect = this.d;
        Paint paint = this.f1413b;
        if (z4) {
            copyBounds(rect);
            float height = this.f1417h / rect.height();
            paint.setShader(new LinearGradient(0.0f, rect.top, 0.0f, rect.bottom, new int[]{A.a.b(this.f1418i, this.f1422m), A.a.b(this.f1419j, this.f1422m), A.a.b(A.a.d(this.f1419j, 0), this.f1422m), A.a.b(A.a.d(this.f1421l, 0), this.f1422m), A.a.b(this.f1421l, this.f1422m), A.a.b(this.f1420k, this.f1422m)}, new float[]{0.0f, height, 0.5f, 0.5f, 1.0f - height, 1.0f}, Shader.TileMode.CLAMP));
            this.f1423n = false;
        }
        float strokeWidth = paint.getStrokeWidth() / 2.0f;
        copyBounds(rect);
        RectF rectF = this.f1414e;
        rectF.set(rect);
        V2.c cVar = this.f1424o.f1905e;
        Rect bounds = getBounds();
        RectF rectF2 = this.f1415f;
        rectF2.set(bounds);
        float min = Math.min(cVar.a(rectF2), rectF.width() / 2.0f);
        V2.k kVar = this.f1424o;
        rectF2.set(getBounds());
        if (kVar.c(rectF2)) {
            rectF.inset(strokeWidth, strokeWidth);
            canvas.drawRoundRect(rectF, min, min, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f1416g;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.f1417h > 0.0f ? -3 : -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        V2.k kVar = this.f1424o;
        Rect bounds = getBounds();
        RectF rectF = this.f1415f;
        rectF.set(bounds);
        if (kVar.c(rectF)) {
            V2.c cVar = this.f1424o.f1905e;
            rectF.set(getBounds());
            outline.setRoundRect(getBounds(), cVar.a(rectF));
            return;
        }
        Rect rect = this.d;
        copyBounds(rect);
        RectF rectF2 = this.f1414e;
        rectF2.set(rect);
        V2.k kVar2 = this.f1424o;
        V2.l lVar = this.f1412a;
        Path path = this.c;
        lVar.a(kVar2, 1.0f, rectF2, null, path);
        if (path.isConvex()) {
            outline.setConvexPath(path);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        V2.k kVar = this.f1424o;
        Rect bounds = getBounds();
        RectF rectF = this.f1415f;
        rectF.set(bounds);
        if (!kVar.c(rectF)) {
            return true;
        }
        int round = Math.round(this.f1417h);
        rect.set(round, round, round, round);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList = this.f1425p;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f1423n = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.f1425p;
        if (colorStateList != null && (colorForState = colorStateList.getColorForState(iArr, this.f1422m)) != this.f1422m) {
            this.f1423n = true;
            this.f1422m = colorForState;
        }
        if (this.f1423n) {
            invalidateSelf();
        }
        return this.f1423n;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i4) {
        this.f1413b.setAlpha(i4);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f1413b.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
