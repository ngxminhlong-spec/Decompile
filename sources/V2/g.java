package V2;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import java.util.BitSet;
import java.util.Objects;
import o2.AbstractC1895f;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class g extends Drawable implements u {

    /* renamed from: K, reason: collision with root package name */
    public static final Paint f1869K = new Paint(1);

    /* renamed from: A, reason: collision with root package name */
    public k f1870A;

    /* renamed from: B, reason: collision with root package name */
    public final Paint f1871B;

    /* renamed from: C, reason: collision with root package name */
    public final Paint f1872C;

    /* renamed from: D, reason: collision with root package name */
    public final U2.a f1873D;

    /* renamed from: E, reason: collision with root package name */
    public final x0.f f1874E;

    /* renamed from: F, reason: collision with root package name */
    public final l f1875F;

    /* renamed from: G, reason: collision with root package name */
    public PorterDuffColorFilter f1876G;

    /* renamed from: H, reason: collision with root package name */
    public PorterDuffColorFilter f1877H;

    /* renamed from: I, reason: collision with root package name */
    public final RectF f1878I;

    /* renamed from: J, reason: collision with root package name */
    public final boolean f1879J;

    /* renamed from: o, reason: collision with root package name */
    public f f1880o;

    /* renamed from: p, reason: collision with root package name */
    public final s[] f1881p;

    /* renamed from: q, reason: collision with root package name */
    public final s[] f1882q;

    /* renamed from: r, reason: collision with root package name */
    public final BitSet f1883r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1884s;

    /* renamed from: t, reason: collision with root package name */
    public final Matrix f1885t;

    /* renamed from: u, reason: collision with root package name */
    public final Path f1886u;

    /* renamed from: v, reason: collision with root package name */
    public final Path f1887v;

    /* renamed from: w, reason: collision with root package name */
    public final RectF f1888w;

    /* renamed from: x, reason: collision with root package name */
    public final RectF f1889x;
    public final Region y;

    /* renamed from: z, reason: collision with root package name */
    public final Region f1890z;

    public g() {
        this(new k());
    }

    public g(f fVar) {
        this.f1881p = new s[4];
        this.f1882q = new s[4];
        this.f1883r = new BitSet(8);
        this.f1885t = new Matrix();
        this.f1886u = new Path();
        this.f1887v = new Path();
        this.f1888w = new RectF();
        this.f1889x = new RectF();
        this.y = new Region();
        this.f1890z = new Region();
        Paint paint = new Paint(1);
        this.f1871B = paint;
        Paint paint2 = new Paint(1);
        this.f1872C = paint2;
        this.f1873D = new U2.a();
        this.f1875F = new l();
        this.f1878I = new RectF();
        this.f1879J = true;
        this.f1880o = fVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        Paint paint3 = f1869K;
        paint3.setColor(-1);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        k();
        j(getState());
        this.f1874E = new x0.f(22, this);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.graphics.drawable.Drawable$ConstantState, V2.f] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public g(V2.k r4) {
        /*
            r3 = this;
            V2.f r0 = new V2.f
            r0.<init>()
            r1 = 0
            r0.c = r1
            r0.d = r1
            r0.f1856e = r1
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_IN
            r0.f1857f = r2
            r0.f1858g = r1
            r2 = 1065353216(0x3f800000, float:1.0)
            r0.f1859h = r2
            r0.f1860i = r2
            r2 = 255(0xff, float:3.57E-43)
            r0.f1862k = r2
            r2 = 0
            r0.f1863l = r2
            r0.f1864m = r2
            r2 = 0
            r0.f1865n = r2
            r0.f1866o = r2
            r0.f1867p = r2
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.FILL_AND_STROKE
            r0.f1868q = r2
            r0.f1854a = r4
            r0.f1855b = r1
            r3.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: V2.g.<init>(V2.k):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public g(android.content.Context r4, android.util.AttributeSet r5, int r6, int r7) {
        /*
            r3 = this;
            V2.a r0 = new V2.a
            r1 = 0
            float r2 = (float) r1
            r0.<init>(r2)
            int[] r2 = B2.a.f150p
            android.content.res.TypedArray r5 = r4.obtainStyledAttributes(r5, r2, r6, r7)
            int r6 = r5.getResourceId(r1, r1)
            r7 = 1
            int r7 = r5.getResourceId(r7, r1)
            r5.recycle()
            V2.j r4 = V2.k.a(r4, r6, r7, r0)
            V2.k r4 = r4.a()
            r3.<init>(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: V2.g.<init>(android.content.Context, android.util.AttributeSet, int, int):void");
    }

    public final void a(RectF rectF, Path path) {
        f fVar = this.f1880o;
        this.f1875F.a(fVar.f1854a, fVar.f1860i, rectF, this.f1874E, path);
        if (this.f1880o.f1859h != 1.0f) {
            Matrix matrix = this.f1885t;
            matrix.reset();
            float f4 = this.f1880o.f1859h;
            matrix.setScale(f4, f4, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.f1878I, true);
    }

    public final int b(int i4) {
        f fVar = this.f1880o;
        float f4 = 0.0f;
        float f5 = fVar.f1864m + 0.0f + fVar.f1863l;
        M2.a aVar = fVar.f1855b;
        if (aVar == null || !aVar.f1148a || A.a.d(i4, 255) != aVar.c) {
            return i4;
        }
        if (aVar.d > 0.0f && f5 > 0.0f) {
            f4 = Math.min(((((float) Math.log1p(f5 / r4)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        }
        return A.a.d(AbstractC1895f.r(A.a.d(i4, 255), aVar.f1149b, f4), Color.alpha(i4));
    }

    public final void c(Canvas canvas) {
        if (this.f1883r.cardinality() > 0) {
            Log.w("g", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i4 = this.f1880o.f1866o;
        Path path = this.f1886u;
        U2.a aVar = this.f1873D;
        if (i4 != 0) {
            canvas.drawPath(path, aVar.f1814a);
        }
        for (int i5 = 0; i5 < 4; i5++) {
            s sVar = this.f1881p[i5];
            int i6 = this.f1880o.f1865n;
            Matrix matrix = s.f1933a;
            sVar.a(matrix, aVar, i6, canvas);
            this.f1882q[i5].a(matrix, aVar, this.f1880o.f1865n, canvas);
        }
        if (this.f1879J) {
            f fVar = this.f1880o;
            int sin = (int) (Math.sin(Math.toRadians(fVar.f1867p)) * fVar.f1866o);
            f fVar2 = this.f1880o;
            int cos = (int) (Math.cos(Math.toRadians(fVar2.f1867p)) * fVar2.f1866o);
            canvas.translate(-sin, -cos);
            canvas.drawPath(path, f1869K);
            canvas.translate(sin, cos);
        }
    }

    public final void d(Canvas canvas, Paint paint, Path path, k kVar, RectF rectF) {
        if (!kVar.c(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float a4 = kVar.f1906f.a(rectF) * this.f1880o.f1860i;
            canvas.drawRoundRect(rectF, a4, a4, paint);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01ed  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void draw(android.graphics.Canvas r18) {
        /*
            Method dump skipped, instructions count: 501
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: V2.g.draw(android.graphics.Canvas):void");
    }

    public final RectF e() {
        Rect bounds = getBounds();
        RectF rectF = this.f1888w;
        rectF.set(bounds);
        return rectF;
    }

    public final boolean f() {
        Paint.Style style = this.f1880o.f1868q;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f1872C.getStrokeWidth() > 0.0f;
    }

    public final void g(Context context) {
        this.f1880o.f1855b = new M2.a(context);
        l();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f1880o;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        this.f1880o.getClass();
        if (this.f1880o.f1854a.c(e())) {
            outline.setRoundRect(getBounds(), this.f1880o.f1854a.f1905e.a(e()) * this.f1880o.f1860i);
            return;
        }
        RectF e4 = e();
        Path path = this.f1886u;
        a(e4, path);
        if (path.isConvex() || Build.VERSION.SDK_INT >= 29) {
            try {
                outline.setConvexPath(path);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.f1880o.f1858g;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.y;
        region.set(bounds);
        RectF e4 = e();
        Path path = this.f1886u;
        a(e4, path);
        Region region2 = this.f1890z;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final void h(float f4) {
        f fVar = this.f1880o;
        if (fVar.f1864m != f4) {
            fVar.f1864m = f4;
            l();
        }
    }

    public final void i(ColorStateList colorStateList) {
        f fVar = this.f1880o;
        if (fVar.c != colorStateList) {
            fVar.c = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.f1884s = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.f1880o.f1856e;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        this.f1880o.getClass();
        ColorStateList colorStateList2 = this.f1880o.d;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList3 = this.f1880o.c;
        return colorStateList3 != null && colorStateList3.isStateful();
    }

    public final boolean j(int[] iArr) {
        boolean z4;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.f1880o.c == null || color2 == (colorForState2 = this.f1880o.c.getColorForState(iArr, (color2 = (paint2 = this.f1871B).getColor())))) {
            z4 = false;
        } else {
            paint2.setColor(colorForState2);
            z4 = true;
        }
        if (this.f1880o.d == null || color == (colorForState = this.f1880o.d.getColorForState(iArr, (color = (paint = this.f1872C).getColor())))) {
            return z4;
        }
        paint.setColor(colorForState);
        return true;
    }

    public final boolean k() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f1876G;
        PorterDuffColorFilter porterDuffColorFilter3 = this.f1877H;
        f fVar = this.f1880o;
        ColorStateList colorStateList = fVar.f1856e;
        PorterDuff.Mode mode = fVar.f1857f;
        if (colorStateList == null || mode == null) {
            int color = this.f1871B.getColor();
            int b4 = b(color);
            porterDuffColorFilter = b4 != color ? new PorterDuffColorFilter(b4, PorterDuff.Mode.SRC_IN) : null;
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(b(colorStateList.getColorForState(getState(), 0)), mode);
        }
        this.f1876G = porterDuffColorFilter;
        this.f1880o.getClass();
        this.f1877H = null;
        this.f1880o.getClass();
        return (Objects.equals(porterDuffColorFilter2, this.f1876G) && Objects.equals(porterDuffColorFilter3, this.f1877H)) ? false : true;
    }

    public final void l() {
        f fVar = this.f1880o;
        float f4 = fVar.f1864m + 0.0f;
        fVar.f1865n = (int) Math.ceil(0.75f * f4);
        this.f1880o.f1866o = (int) Math.ceil(f4 * 0.25f);
        k();
        super.invalidateSelf();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.graphics.drawable.Drawable$ConstantState, V2.f] */
    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        f fVar = this.f1880o;
        ?? constantState = new Drawable.ConstantState();
        constantState.c = null;
        constantState.d = null;
        constantState.f1856e = null;
        constantState.f1857f = PorterDuff.Mode.SRC_IN;
        constantState.f1858g = null;
        constantState.f1859h = 1.0f;
        constantState.f1860i = 1.0f;
        constantState.f1862k = 255;
        constantState.f1863l = 0.0f;
        constantState.f1864m = 0.0f;
        constantState.f1865n = 0;
        constantState.f1866o = 0;
        constantState.f1867p = 0;
        constantState.f1868q = Paint.Style.FILL_AND_STROKE;
        constantState.f1854a = fVar.f1854a;
        constantState.f1855b = fVar.f1855b;
        constantState.f1861j = fVar.f1861j;
        constantState.c = fVar.c;
        constantState.d = fVar.d;
        constantState.f1857f = fVar.f1857f;
        constantState.f1856e = fVar.f1856e;
        constantState.f1862k = fVar.f1862k;
        constantState.f1859h = fVar.f1859h;
        constantState.f1866o = fVar.f1866o;
        constantState.f1860i = fVar.f1860i;
        constantState.f1863l = fVar.f1863l;
        constantState.f1864m = fVar.f1864m;
        constantState.f1865n = fVar.f1865n;
        constantState.f1867p = fVar.f1867p;
        constantState.f1868q = fVar.f1868q;
        if (fVar.f1858g != null) {
            constantState.f1858g = new Rect(fVar.f1858g);
        }
        this.f1880o = constantState;
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f1884s = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean z4 = j(iArr) || k();
        if (z4) {
            invalidateSelf();
        }
        return z4;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i4) {
        f fVar = this.f1880o;
        if (fVar.f1862k != i4) {
            fVar.f1862k = i4;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f1880o.getClass();
        super.invalidateSelf();
    }

    @Override // V2.u
    public final void setShapeAppearanceModel(k kVar) {
        this.f1880o.f1854a = kVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i4) {
        setTintList(ColorStateList.valueOf(i4));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f1880o.f1856e = colorStateList;
        k();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        f fVar = this.f1880o;
        if (fVar.f1857f != mode) {
            fVar.f1857f = mode;
            k();
            super.invalidateSelf();
        }
    }
}
