package J2;

import P2.u;
import P2.v;
import V2.k;
import V2.l;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.material.chip.Chip;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class e extends V2.g implements Drawable.Callback, u {

    /* renamed from: T0, reason: collision with root package name */
    public static final int[] f964T0 = {R.attr.state_enabled};

    /* renamed from: U0, reason: collision with root package name */
    public static final ShapeDrawable f965U0 = new ShapeDrawable(new OvalShape());

    /* renamed from: A0, reason: collision with root package name */
    public int f966A0;

    /* renamed from: B0, reason: collision with root package name */
    public int f967B0;

    /* renamed from: C0, reason: collision with root package name */
    public int f968C0;

    /* renamed from: D0, reason: collision with root package name */
    public int f969D0;

    /* renamed from: E0, reason: collision with root package name */
    public int f970E0;

    /* renamed from: F0, reason: collision with root package name */
    public boolean f971F0;

    /* renamed from: G0, reason: collision with root package name */
    public int f972G0;

    /* renamed from: H0, reason: collision with root package name */
    public int f973H0;

    /* renamed from: I0, reason: collision with root package name */
    public ColorFilter f974I0;
    public PorterDuffColorFilter J0;

    /* renamed from: K0, reason: collision with root package name */
    public ColorStateList f975K0;

    /* renamed from: L, reason: collision with root package name */
    public ColorStateList f976L;

    /* renamed from: L0, reason: collision with root package name */
    public PorterDuff.Mode f977L0;

    /* renamed from: M, reason: collision with root package name */
    public ColorStateList f978M;

    /* renamed from: M0, reason: collision with root package name */
    public int[] f979M0;
    public float N;
    public ColorStateList N0;

    /* renamed from: O, reason: collision with root package name */
    public float f980O;

    /* renamed from: O0, reason: collision with root package name */
    public WeakReference f981O0;

    /* renamed from: P, reason: collision with root package name */
    public ColorStateList f982P;

    /* renamed from: P0, reason: collision with root package name */
    public TextUtils.TruncateAt f983P0;

    /* renamed from: Q, reason: collision with root package name */
    public float f984Q;

    /* renamed from: Q0, reason: collision with root package name */
    public boolean f985Q0;

    /* renamed from: R, reason: collision with root package name */
    public ColorStateList f986R;

    /* renamed from: R0, reason: collision with root package name */
    public int f987R0;

    /* renamed from: S, reason: collision with root package name */
    public CharSequence f988S;

    /* renamed from: S0, reason: collision with root package name */
    public boolean f989S0;

    /* renamed from: T, reason: collision with root package name */
    public boolean f990T;

    /* renamed from: U, reason: collision with root package name */
    public Drawable f991U;

    /* renamed from: V, reason: collision with root package name */
    public ColorStateList f992V;

    /* renamed from: W, reason: collision with root package name */
    public float f993W;

    /* renamed from: X, reason: collision with root package name */
    public boolean f994X;

    /* renamed from: Y, reason: collision with root package name */
    public boolean f995Y;

    /* renamed from: Z, reason: collision with root package name */
    public Drawable f996Z;

    /* renamed from: a0, reason: collision with root package name */
    public RippleDrawable f997a0;

    /* renamed from: b0, reason: collision with root package name */
    public ColorStateList f998b0;

    /* renamed from: c0, reason: collision with root package name */
    public float f999c0;

    /* renamed from: d0, reason: collision with root package name */
    public SpannableStringBuilder f1000d0;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f1001e0;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f1002f0;

    /* renamed from: g0, reason: collision with root package name */
    public Drawable f1003g0;

    /* renamed from: h0, reason: collision with root package name */
    public ColorStateList f1004h0;

    /* renamed from: i0, reason: collision with root package name */
    public C2.d f1005i0;

    /* renamed from: j0, reason: collision with root package name */
    public C2.d f1006j0;

    /* renamed from: k0, reason: collision with root package name */
    public float f1007k0;

    /* renamed from: l0, reason: collision with root package name */
    public float f1008l0;

    /* renamed from: m0, reason: collision with root package name */
    public float f1009m0;

    /* renamed from: n0, reason: collision with root package name */
    public float f1010n0;

    /* renamed from: o0, reason: collision with root package name */
    public float f1011o0;

    /* renamed from: p0, reason: collision with root package name */
    public float f1012p0;

    /* renamed from: q0, reason: collision with root package name */
    public float f1013q0;

    /* renamed from: r0, reason: collision with root package name */
    public float f1014r0;

    /* renamed from: s0, reason: collision with root package name */
    public final Context f1015s0;

    /* renamed from: t0, reason: collision with root package name */
    public final Paint f1016t0;

    /* renamed from: u0, reason: collision with root package name */
    public final Paint.FontMetrics f1017u0;

    /* renamed from: v0, reason: collision with root package name */
    public final RectF f1018v0;

    /* renamed from: w0, reason: collision with root package name */
    public final PointF f1019w0;

    /* renamed from: x0, reason: collision with root package name */
    public final Path f1020x0;

    /* renamed from: y0, reason: collision with root package name */
    public final v f1021y0;

    /* renamed from: z0, reason: collision with root package name */
    public int f1022z0;

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.duracodefactory.logiccircuitsimulatorpro.R.attr.chipStyle, com.duracodefactory.logiccircuitsimulatorpro.R.style.Widget_MaterialComponents_Chip_Action);
        this.f980O = -1.0f;
        this.f1016t0 = new Paint(1);
        this.f1017u0 = new Paint.FontMetrics();
        this.f1018v0 = new RectF();
        this.f1019w0 = new PointF();
        this.f1020x0 = new Path();
        this.f973H0 = 255;
        this.f977L0 = PorterDuff.Mode.SRC_IN;
        this.f981O0 = new WeakReference(null);
        g(context);
        this.f1015s0 = context;
        v vVar = new v(this);
        this.f1021y0 = vVar;
        this.f988S = "";
        vVar.f1605a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = f964T0;
        setState(iArr);
        if (!Arrays.equals(this.f979M0, iArr)) {
            this.f979M0 = iArr;
            if (S()) {
                u(getState(), iArr);
            }
        }
        this.f985Q0 = true;
        int[] iArr2 = T2.a.f1803a;
        f965U0.setTint(-1);
    }

    public static void T(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public static boolean r(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public static boolean s(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f991U;
        if (drawable3 != 0) {
            boolean z4 = drawable3 instanceof B.d;
            drawable2 = drawable3;
            if (z4) {
                drawable2 = null;
            }
        } else {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float o4 = o();
            this.f991U = drawable != null ? drawable.mutate() : null;
            float o5 = o();
            T(drawable2);
            if (R()) {
                m(this.f991U);
            }
            invalidateSelf();
            if (o4 != o5) {
                t();
            }
        }
    }

    public final void B(float f4) {
        if (this.f993W != f4) {
            float o4 = o();
            this.f993W = f4;
            float o5 = o();
            invalidateSelf();
            if (o4 != o5) {
                t();
            }
        }
    }

    public final void C(ColorStateList colorStateList) {
        this.f994X = true;
        if (this.f992V != colorStateList) {
            this.f992V = colorStateList;
            if (R()) {
                this.f991U.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void D(boolean z4) {
        if (this.f990T != z4) {
            boolean R4 = R();
            this.f990T = z4;
            boolean R5 = R();
            if (R4 != R5) {
                if (R5) {
                    m(this.f991U);
                } else {
                    T(this.f991U);
                }
                invalidateSelf();
                t();
            }
        }
    }

    public final void E(ColorStateList colorStateList) {
        if (this.f982P != colorStateList) {
            this.f982P = colorStateList;
            if (this.f989S0) {
                V2.f fVar = this.f1880o;
                if (fVar.d != colorStateList) {
                    fVar.d = colorStateList;
                    onStateChange(getState());
                }
            }
            onStateChange(getState());
        }
    }

    public final void F(float f4) {
        if (this.f984Q != f4) {
            this.f984Q = f4;
            this.f1016t0.setStrokeWidth(f4);
            if (this.f989S0) {
                this.f1880o.f1861j = f4;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void G(android.graphics.drawable.Drawable r6) {
        /*
            r5 = this;
            android.graphics.drawable.Drawable r0 = r5.f996Z
            r1 = 0
            if (r0 == 0) goto Lb
            boolean r2 = r0 instanceof B.d
            if (r2 == 0) goto Lc
            B.d r0 = (B.d) r0
        Lb:
            r0 = r1
        Lc:
            if (r0 == r6) goto L49
            float r2 = r5.p()
            if (r6 == 0) goto L18
            android.graphics.drawable.Drawable r1 = r6.mutate()
        L18:
            r5.f996Z = r1
            int[] r6 = T2.a.f1803a
            android.graphics.drawable.RippleDrawable r6 = new android.graphics.drawable.RippleDrawable
            android.content.res.ColorStateList r1 = r5.f986R
            android.content.res.ColorStateList r1 = T2.a.a(r1)
            android.graphics.drawable.Drawable r3 = r5.f996Z
            android.graphics.drawable.ShapeDrawable r4 = J2.e.f965U0
            r6.<init>(r1, r3, r4)
            r5.f997a0 = r6
            float r6 = r5.p()
            T(r0)
            boolean r0 = r5.S()
            if (r0 == 0) goto L3f
            android.graphics.drawable.Drawable r0 = r5.f996Z
            r5.m(r0)
        L3f:
            r5.invalidateSelf()
            int r6 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r6 == 0) goto L49
            r5.t()
        L49:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: J2.e.G(android.graphics.drawable.Drawable):void");
    }

    public final void H(float f4) {
        if (this.f1013q0 != f4) {
            this.f1013q0 = f4;
            invalidateSelf();
            if (S()) {
                t();
            }
        }
    }

    public final void I(float f4) {
        if (this.f999c0 != f4) {
            this.f999c0 = f4;
            invalidateSelf();
            if (S()) {
                t();
            }
        }
    }

    public final void J(float f4) {
        if (this.f1012p0 != f4) {
            this.f1012p0 = f4;
            invalidateSelf();
            if (S()) {
                t();
            }
        }
    }

    public final void K(ColorStateList colorStateList) {
        if (this.f998b0 != colorStateList) {
            this.f998b0 = colorStateList;
            if (S()) {
                this.f996Z.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void L(boolean z4) {
        if (this.f995Y != z4) {
            boolean S4 = S();
            this.f995Y = z4;
            boolean S5 = S();
            if (S4 != S5) {
                if (S5) {
                    m(this.f996Z);
                } else {
                    T(this.f996Z);
                }
                invalidateSelf();
                t();
            }
        }
    }

    public final void M(float f4) {
        if (this.f1009m0 != f4) {
            float o4 = o();
            this.f1009m0 = f4;
            float o5 = o();
            invalidateSelf();
            if (o4 != o5) {
                t();
            }
        }
    }

    public final void N(float f4) {
        if (this.f1008l0 != f4) {
            float o4 = o();
            this.f1008l0 = f4;
            float o5 = o();
            invalidateSelf();
            if (o4 != o5) {
                t();
            }
        }
    }

    public final void O(ColorStateList colorStateList) {
        if (this.f986R != colorStateList) {
            this.f986R = colorStateList;
            this.N0 = null;
            onStateChange(getState());
        }
    }

    public final void P(S2.d dVar) {
        v vVar = this.f1021y0;
        a aVar = vVar.f1606b;
        TextPaint textPaint = vVar.f1605a;
        if (vVar.f1608f != dVar) {
            vVar.f1608f = dVar;
            if (dVar != null) {
                dVar.a();
                dVar.d(textPaint, dVar.f1778l);
                S2.c cVar = new S2.c(dVar, textPaint, aVar);
                Context context = this.f1015s0;
                dVar.b(context, cVar);
                u uVar = (u) vVar.f1607e.get();
                if (uVar != null) {
                    textPaint.drawableState = uVar.getState();
                }
                dVar.c(context, textPaint, aVar);
                vVar.d = true;
            }
            u uVar2 = (u) vVar.f1607e.get();
            if (uVar2 != null) {
                e eVar = (e) uVar2;
                eVar.t();
                eVar.invalidateSelf();
                eVar.onStateChange(uVar2.getState());
            }
        }
    }

    public final boolean Q() {
        return this.f1002f0 && this.f1003g0 != null && this.f971F0;
    }

    public final boolean R() {
        return this.f990T && this.f991U != null;
    }

    public final boolean S() {
        return this.f995Y && this.f996Z != null;
    }

    @Override // V2.g, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i4;
        Canvas canvas2;
        int i5;
        float measureText;
        int i6;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || (i4 = this.f973H0) == 0) {
            return;
        }
        if (i4 < 255) {
            canvas2 = canvas;
            i5 = canvas2.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i4);
        } else {
            canvas2 = canvas;
            i5 = 0;
        }
        boolean z4 = this.f989S0;
        Paint paint = this.f1016t0;
        RectF rectF = this.f1018v0;
        if (!z4) {
            paint.setColor(this.f1022z0);
            paint.setStyle(Paint.Style.FILL);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, q(), q(), paint);
        }
        if (!this.f989S0) {
            paint.setColor(this.f966A0);
            paint.setStyle(Paint.Style.FILL);
            ColorFilter colorFilter = this.f974I0;
            if (colorFilter == null) {
                colorFilter = this.J0;
            }
            paint.setColorFilter(colorFilter);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, q(), q(), paint);
        }
        if (this.f989S0) {
            super.draw(canvas);
        }
        if (this.f984Q > 0.0f && !this.f989S0) {
            paint.setColor(this.f968C0);
            paint.setStyle(Paint.Style.STROKE);
            if (!this.f989S0) {
                ColorFilter colorFilter2 = this.f974I0;
                if (colorFilter2 == null) {
                    colorFilter2 = this.J0;
                }
                paint.setColorFilter(colorFilter2);
            }
            float f4 = bounds.left;
            float f5 = this.f984Q / 2.0f;
            rectF.set(f4 + f5, bounds.top + f5, bounds.right - f5, bounds.bottom - f5);
            float f6 = this.f980O - (this.f984Q / 2.0f);
            canvas2.drawRoundRect(rectF, f6, f6, paint);
        }
        paint.setColor(this.f969D0);
        paint.setStyle(Paint.Style.FILL);
        rectF.set(bounds);
        if (this.f989S0) {
            RectF rectF2 = new RectF(bounds);
            V2.f fVar = this.f1880o;
            k kVar = fVar.f1854a;
            float f7 = fVar.f1860i;
            x0.f fVar2 = this.f1874E;
            l lVar = this.f1875F;
            Path path = this.f1020x0;
            lVar.a(kVar, f7, rectF2, fVar2, path);
            d(canvas2, paint, path, this.f1880o.f1854a, e());
        } else {
            canvas2.drawRoundRect(rectF, q(), q(), paint);
        }
        if (R()) {
            n(bounds, rectF);
            float f8 = rectF.left;
            float f9 = rectF.top;
            canvas2.translate(f8, f9);
            this.f991U.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.f991U.draw(canvas2);
            canvas2.translate(-f8, -f9);
        }
        if (Q()) {
            n(bounds, rectF);
            float f10 = rectF.left;
            float f11 = rectF.top;
            canvas2.translate(f10, f11);
            this.f1003g0.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.f1003g0.draw(canvas2);
            canvas2.translate(-f10, -f11);
        }
        if (this.f985Q0 && this.f988S != null) {
            PointF pointF = this.f1019w0;
            pointF.set(0.0f, 0.0f);
            Paint.Align align = Paint.Align.LEFT;
            CharSequence charSequence = this.f988S;
            v vVar = this.f1021y0;
            if (charSequence != null) {
                float o4 = o() + this.f1007k0 + this.f1010n0;
                if (getLayoutDirection() == 0) {
                    pointF.x = bounds.left + o4;
                } else {
                    pointF.x = bounds.right - o4;
                    align = Paint.Align.RIGHT;
                }
                float centerY = bounds.centerY();
                TextPaint textPaint = vVar.f1605a;
                Paint.FontMetrics fontMetrics = this.f1017u0;
                textPaint.getFontMetrics(fontMetrics);
                pointF.y = centerY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
            }
            rectF.setEmpty();
            if (this.f988S != null) {
                float o5 = o() + this.f1007k0 + this.f1010n0;
                float p3 = p() + this.f1014r0 + this.f1011o0;
                if (getLayoutDirection() == 0) {
                    rectF.left = bounds.left + o5;
                    rectF.right = bounds.right - p3;
                } else {
                    rectF.left = bounds.left + p3;
                    rectF.right = bounds.right - o5;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
            S2.d dVar = vVar.f1608f;
            TextPaint textPaint2 = vVar.f1605a;
            if (dVar != null) {
                textPaint2.drawableState = getState();
                vVar.f1608f.c(this.f1015s0, textPaint2, vVar.f1606b);
            }
            textPaint2.setTextAlign(align);
            String charSequence2 = this.f988S.toString();
            if (vVar.d) {
                measureText = charSequence2 == null ? 0.0f : textPaint2.measureText((CharSequence) charSequence2, 0, charSequence2.length());
                vVar.c = measureText;
                vVar.d = false;
            } else {
                measureText = vVar.c;
            }
            boolean z5 = Math.round(measureText) > Math.round(rectF.width());
            if (z5) {
                int save = canvas2.save();
                canvas2.clipRect(rectF);
                i6 = save;
            } else {
                i6 = 0;
            }
            CharSequence charSequence3 = this.f988S;
            if (z5 && this.f983P0 != null) {
                charSequence3 = TextUtils.ellipsize(charSequence3, textPaint2, rectF.width(), this.f983P0);
            }
            canvas.drawText(charSequence3, 0, charSequence3.length(), pointF.x, pointF.y, textPaint2);
            canvas2 = canvas;
            if (z5) {
                canvas2.restoreToCount(i6);
            }
        }
        if (S()) {
            rectF.setEmpty();
            if (S()) {
                float f12 = this.f1014r0 + this.f1013q0;
                if (getLayoutDirection() == 0) {
                    float f13 = bounds.right - f12;
                    rectF.right = f13;
                    rectF.left = f13 - this.f999c0;
                } else {
                    float f14 = bounds.left + f12;
                    rectF.left = f14;
                    rectF.right = f14 + this.f999c0;
                }
                float exactCenterY = bounds.exactCenterY();
                float f15 = this.f999c0;
                float f16 = exactCenterY - (f15 / 2.0f);
                rectF.top = f16;
                rectF.bottom = f16 + f15;
            }
            float f17 = rectF.left;
            float f18 = rectF.top;
            canvas2.translate(f17, f18);
            this.f996Z.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            int[] iArr = T2.a.f1803a;
            this.f997a0.setBounds(this.f996Z.getBounds());
            this.f997a0.jumpToCurrentState();
            this.f997a0.draw(canvas2);
            canvas2.translate(-f17, -f18);
        }
        if (this.f973H0 < 255) {
            canvas2.restoreToCount(i5);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f973H0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f974I0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.N;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        float measureText;
        float o4 = o() + this.f1007k0 + this.f1010n0;
        String charSequence = this.f988S.toString();
        v vVar = this.f1021y0;
        if (vVar.d) {
            measureText = charSequence == null ? 0.0f : vVar.f1605a.measureText((CharSequence) charSequence, 0, charSequence.length());
            vVar.c = measureText;
            vVar.d = false;
        } else {
            measureText = vVar.c;
        }
        return Math.min(Math.round(p() + measureText + o4 + this.f1011o0 + this.f1014r0), this.f987R0);
    }

    @Override // V2.g, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // V2.g, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Outline outline2;
        if (this.f989S0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline2 = outline;
            outline2.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.N, this.f980O);
        } else {
            outline.setRoundRect(bounds, this.f980O);
            outline2 = outline;
        }
        outline2.setAlpha(this.f973H0 / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // V2.g, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        if (r(this.f976L) || r(this.f978M) || r(this.f982P)) {
            return true;
        }
        S2.d dVar = this.f1021y0.f1608f;
        if (dVar == null || (colorStateList = dVar.f1770b) == null || !colorStateList.isStateful()) {
            return (this.f1002f0 && this.f1003g0 != null && this.f1001e0) || s(this.f991U) || s(this.f1003g0) || r(this.f975K0);
        }
        return true;
    }

    public final void m(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        drawable.setLayoutDirection(getLayoutDirection());
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.f996Z) {
            if (drawable.isStateful()) {
                drawable.setState(this.f979M0);
            }
            drawable.setTintList(this.f998b0);
            return;
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
        Drawable drawable2 = this.f991U;
        if (drawable == drawable2 && this.f994X) {
            drawable2.setTintList(this.f992V);
        }
    }

    public final void n(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (R() || Q()) {
            float f4 = this.f1007k0 + this.f1008l0;
            if (getLayoutDirection() == 0) {
                float f5 = rect.left + f4;
                rectF.left = f5;
                rectF.right = f5 + this.f993W;
            } else {
                float f6 = rect.right - f4;
                rectF.right = f6;
                rectF.left = f6 - this.f993W;
            }
            float exactCenterY = rect.exactCenterY();
            float f7 = this.f993W;
            float f8 = exactCenterY - (f7 / 2.0f);
            rectF.top = f8;
            rectF.bottom = f8 + f7;
        }
    }

    public final float o() {
        if (R() || Q()) {
            return this.f1008l0 + this.f993W + this.f1009m0;
        }
        return 0.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i4) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i4);
        if (R()) {
            onLayoutDirectionChanged |= this.f991U.setLayoutDirection(i4);
        }
        if (Q()) {
            onLayoutDirectionChanged |= this.f1003g0.setLayoutDirection(i4);
        }
        if (S()) {
            onLayoutDirectionChanged |= this.f996Z.setLayoutDirection(i4);
        }
        if (!onLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i4) {
        boolean onLevelChange = super.onLevelChange(i4);
        if (R()) {
            onLevelChange |= this.f991U.setLevel(i4);
        }
        if (Q()) {
            onLevelChange |= this.f1003g0.setLevel(i4);
        }
        if (S()) {
            onLevelChange |= this.f996Z.setLevel(i4);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // V2.g, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        if (this.f989S0) {
            super.onStateChange(iArr);
        }
        return u(iArr, this.f979M0);
    }

    public final float p() {
        if (S()) {
            return this.f1012p0 + this.f999c0 + this.f1013q0;
        }
        return 0.0f;
    }

    public final float q() {
        return this.f989S0 ? this.f1880o.f1854a.f1905e.a(e()) : this.f980O;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j4) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j4);
        }
    }

    @Override // V2.g, android.graphics.drawable.Drawable
    public final void setAlpha(int i4) {
        if (this.f973H0 != i4) {
            this.f973H0 = i4;
            invalidateSelf();
        }
    }

    @Override // V2.g, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f974I0 != colorFilter) {
            this.f974I0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // V2.g, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.f975K0 != colorStateList) {
            this.f975K0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // V2.g, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.f977L0 != mode) {
            this.f977L0 = mode;
            ColorStateList colorStateList = this.f975K0;
            this.J0 = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z4, boolean z5) {
        boolean visible = super.setVisible(z4, z5);
        if (R()) {
            visible |= this.f991U.setVisible(z4, z5);
        }
        if (Q()) {
            visible |= this.f1003g0.setVisible(z4, z5);
        }
        if (S()) {
            visible |= this.f996Z.setVisible(z4, z5);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public final void t() {
        d dVar = (d) this.f981O0.get();
        if (dVar != null) {
            Chip chip = (Chip) dVar;
            chip.b(chip.f12338C);
            chip.requestLayout();
            chip.invalidateOutline();
        }
    }

    public final boolean u(int[] iArr, int[] iArr2) {
        boolean z4;
        boolean z5;
        ColorStateList colorStateList;
        boolean onStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList2 = this.f976L;
        int colorForState = colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.f1022z0) : 0;
        boolean z6 = true;
        if (this.f1022z0 != colorForState) {
            this.f1022z0 = colorForState;
            onStateChange = true;
        }
        ColorStateList colorStateList3 = this.f978M;
        int colorForState2 = colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.f966A0) : 0;
        if (this.f966A0 != colorForState2) {
            this.f966A0 = colorForState2;
            onStateChange = true;
        }
        int b4 = A.a.b(colorForState2, colorForState);
        if ((this.f967B0 != b4) | (this.f1880o.c == null)) {
            this.f967B0 = b4;
            i(ColorStateList.valueOf(b4));
            onStateChange = true;
        }
        ColorStateList colorStateList4 = this.f982P;
        int colorForState3 = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.f968C0) : 0;
        if (this.f968C0 != colorForState3) {
            this.f968C0 = colorForState3;
            onStateChange = true;
        }
        int colorForState4 = (this.N0 == null || !T2.a.b(iArr)) ? 0 : this.N0.getColorForState(iArr, this.f969D0);
        if (this.f969D0 != colorForState4) {
            this.f969D0 = colorForState4;
        }
        S2.d dVar = this.f1021y0.f1608f;
        int colorForState5 = (dVar == null || (colorStateList = dVar.f1770b) == null) ? 0 : colorStateList.getColorForState(iArr, this.f970E0);
        if (this.f970E0 != colorForState5) {
            this.f970E0 = colorForState5;
            onStateChange = true;
        }
        int[] state = getState();
        if (state != null) {
            int length = state.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length) {
                    break;
                }
                if (state[i4] != 16842912) {
                    i4++;
                } else if (this.f1001e0) {
                    z4 = true;
                }
            }
        }
        z4 = false;
        if (this.f971F0 == z4 || this.f1003g0 == null) {
            z5 = false;
        } else {
            float o4 = o();
            this.f971F0 = z4;
            if (o4 != o()) {
                onStateChange = true;
                z5 = true;
            } else {
                z5 = false;
                onStateChange = true;
            }
        }
        ColorStateList colorStateList5 = this.f975K0;
        int colorForState6 = colorStateList5 != null ? colorStateList5.getColorForState(iArr, this.f972G0) : 0;
        if (this.f972G0 != colorForState6) {
            this.f972G0 = colorForState6;
            ColorStateList colorStateList6 = this.f975K0;
            PorterDuff.Mode mode = this.f977L0;
            this.J0 = (colorStateList6 == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList6.getColorForState(getState(), 0), mode);
        } else {
            z6 = onStateChange;
        }
        if (s(this.f991U)) {
            z6 |= this.f991U.setState(iArr);
        }
        if (s(this.f1003g0)) {
            z6 |= this.f1003g0.setState(iArr);
        }
        if (s(this.f996Z)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            z6 |= this.f996Z.setState(iArr3);
        }
        int[] iArr4 = T2.a.f1803a;
        if (s(this.f997a0)) {
            z6 |= this.f997a0.setState(iArr2);
        }
        if (z6) {
            invalidateSelf();
        }
        if (z5) {
            t();
        }
        return z6;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final void v(boolean z4) {
        if (this.f1001e0 != z4) {
            this.f1001e0 = z4;
            float o4 = o();
            if (!z4 && this.f971F0) {
                this.f971F0 = false;
            }
            float o5 = o();
            invalidateSelf();
            if (o4 != o5) {
                t();
            }
        }
    }

    public final void w(Drawable drawable) {
        if (this.f1003g0 != drawable) {
            float o4 = o();
            this.f1003g0 = drawable;
            float o5 = o();
            T(this.f1003g0);
            m(this.f1003g0);
            invalidateSelf();
            if (o4 != o5) {
                t();
            }
        }
    }

    public final void x(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.f1004h0 != colorStateList) {
            this.f1004h0 = colorStateList;
            if (this.f1002f0 && (drawable = this.f1003g0) != null && this.f1001e0) {
                drawable.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void y(boolean z4) {
        if (this.f1002f0 != z4) {
            boolean Q3 = Q();
            this.f1002f0 = z4;
            boolean Q4 = Q();
            if (Q3 != Q4) {
                if (Q4) {
                    m(this.f1003g0);
                } else {
                    T(this.f1003g0);
                }
                invalidateSelf();
                t();
            }
        }
    }

    public final void z(float f4) {
        if (this.f980O != f4) {
            this.f980O = f4;
            setShapeAppearanceModel(this.f1880o.f1854a.e(f4));
        }
    }
}
