package P2;

import H.A;
import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.animation.LinearInterpolator;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: A, reason: collision with root package name */
    public float f1525A;

    /* renamed from: B, reason: collision with root package name */
    public float f1526B;

    /* renamed from: C, reason: collision with root package name */
    public int[] f1527C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f1528D;

    /* renamed from: E, reason: collision with root package name */
    public final TextPaint f1529E;

    /* renamed from: F, reason: collision with root package name */
    public final TextPaint f1530F;

    /* renamed from: G, reason: collision with root package name */
    public TimeInterpolator f1531G;

    /* renamed from: H, reason: collision with root package name */
    public TimeInterpolator f1532H;

    /* renamed from: I, reason: collision with root package name */
    public float f1533I;

    /* renamed from: J, reason: collision with root package name */
    public float f1534J;

    /* renamed from: K, reason: collision with root package name */
    public float f1535K;

    /* renamed from: L, reason: collision with root package name */
    public ColorStateList f1536L;

    /* renamed from: M, reason: collision with root package name */
    public StaticLayout f1537M;
    public CharSequence N;

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f1538a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1539b;
    public float c;
    public final Rect d;

    /* renamed from: e, reason: collision with root package name */
    public final Rect f1540e;

    /* renamed from: f, reason: collision with root package name */
    public final RectF f1541f;

    /* renamed from: g, reason: collision with root package name */
    public int f1542g = 16;

    /* renamed from: h, reason: collision with root package name */
    public int f1543h = 16;

    /* renamed from: i, reason: collision with root package name */
    public float f1544i = 15.0f;

    /* renamed from: j, reason: collision with root package name */
    public float f1545j = 15.0f;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f1546k;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f1547l;

    /* renamed from: m, reason: collision with root package name */
    public float f1548m;

    /* renamed from: n, reason: collision with root package name */
    public float f1549n;

    /* renamed from: o, reason: collision with root package name */
    public float f1550o;

    /* renamed from: p, reason: collision with root package name */
    public float f1551p;

    /* renamed from: q, reason: collision with root package name */
    public float f1552q;

    /* renamed from: r, reason: collision with root package name */
    public float f1553r;

    /* renamed from: s, reason: collision with root package name */
    public Typeface f1554s;

    /* renamed from: t, reason: collision with root package name */
    public Typeface f1555t;

    /* renamed from: u, reason: collision with root package name */
    public Typeface f1556u;

    /* renamed from: v, reason: collision with root package name */
    public S2.a f1557v;

    /* renamed from: w, reason: collision with root package name */
    public CharSequence f1558w;

    /* renamed from: x, reason: collision with root package name */
    public CharSequence f1559x;
    public boolean y;

    /* renamed from: z, reason: collision with root package name */
    public Bitmap f1560z;

    public b(TextInputLayout textInputLayout) {
        this.f1538a = textInputLayout;
        TextPaint textPaint = new TextPaint(129);
        this.f1529E = textPaint;
        this.f1530F = new TextPaint(textPaint);
        this.f1540e = new Rect();
        this.d = new Rect();
        this.f1541f = new RectF();
    }

    public static int a(int i4, int i5, float f4) {
        float f5 = 1.0f - f4;
        return Color.argb((int) ((Color.alpha(i5) * f4) + (Color.alpha(i4) * f5)), (int) ((Color.red(i5) * f4) + (Color.red(i4) * f5)), (int) ((Color.green(i5) * f4) + (Color.green(i4) * f5)), (int) ((Color.blue(i5) * f4) + (Color.blue(i4) * f5)));
    }

    public static float e(float f4, float f5, float f6, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f6 = timeInterpolator.getInterpolation(f6);
        }
        LinearInterpolator linearInterpolator = C2.a.f507a;
        return n0.a.g(f5, f4, f6, f4);
    }

    public final float b() {
        if (this.f1558w == null) {
            return 0.0f;
        }
        float f4 = this.f1545j;
        TextPaint textPaint = this.f1530F;
        textPaint.setTextSize(f4);
        textPaint.setTypeface(this.f1554s);
        CharSequence charSequence = this.f1558w;
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    public final void c(float f4) {
        boolean z4;
        float f5;
        boolean z5;
        if (this.f1558w == null) {
            return;
        }
        float width = this.f1540e.width();
        float width2 = this.d.width();
        if (Math.abs(f4 - this.f1545j) < 0.001f) {
            f5 = this.f1545j;
            this.f1525A = 1.0f;
            Typeface typeface = this.f1556u;
            Typeface typeface2 = this.f1554s;
            if (typeface != typeface2) {
                this.f1556u = typeface2;
                z5 = true;
            } else {
                z5 = false;
            }
        } else {
            float f6 = this.f1544i;
            Typeface typeface3 = this.f1556u;
            Typeface typeface4 = this.f1555t;
            if (typeface3 != typeface4) {
                this.f1556u = typeface4;
                z4 = true;
            } else {
                z4 = false;
            }
            if (Math.abs(f4 - f6) < 0.001f) {
                this.f1525A = 1.0f;
            } else {
                this.f1525A = f4 / this.f1544i;
            }
            float f7 = this.f1545j / this.f1544i;
            width = width2 * f7 > width ? Math.min(width / f7, width2) : width2;
            f5 = f6;
            z5 = z4;
        }
        if (width > 0.0f) {
            z5 = this.f1526B != f5 || this.f1528D || z5;
            this.f1526B = f5;
            this.f1528D = false;
        }
        if (this.f1559x == null || z5) {
            float f8 = this.f1526B;
            TextPaint textPaint = this.f1529E;
            textPaint.setTextSize(f8);
            textPaint.setTypeface(this.f1556u);
            textPaint.setLinearText(this.f1525A != 1.0f);
            CharSequence charSequence = this.f1558w;
            WeakHashMap weakHashMap = A.f779a;
            boolean b4 = (this.f1538a.getLayoutDirection() == 1 ? F.g.d : F.g.c).b(charSequence, charSequence.length());
            this.y = b4;
            CharSequence charSequence2 = this.f1558w;
            int length = charSequence2.length();
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            int max = Math.max(0, (int) width);
            CharSequence ellipsize = TextUtils.ellipsize(charSequence2, textPaint, max, truncateAt);
            int min = Math.min(ellipsize.length(), length);
            if (b4) {
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            }
            StaticLayout.Builder obtain = StaticLayout.Builder.obtain(ellipsize, 0, min, textPaint, max);
            obtain.setAlignment(alignment);
            obtain.setIncludePad(false);
            obtain.setTextDirection(b4 ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
            if (truncateAt != null) {
                obtain.setEllipsize(truncateAt);
            }
            obtain.setMaxLines(1);
            StaticLayout build = obtain.build();
            build.getClass();
            this.f1537M = build;
            this.f1559x = build.getText();
        }
    }

    public final int d(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f1527C;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    public final void f() {
        boolean z4;
        Rect rect = this.f1540e;
        if (rect.width() > 0 && rect.height() > 0) {
            Rect rect2 = this.d;
            if (rect2.width() > 0 && rect2.height() > 0) {
                z4 = true;
                this.f1539b = z4;
            }
        }
        z4 = false;
        this.f1539b = z4;
    }

    public final void g() {
        StaticLayout staticLayout;
        TextInputLayout textInputLayout = this.f1538a;
        if (textInputLayout.getHeight() <= 0 || textInputLayout.getWidth() <= 0) {
            return;
        }
        float f4 = this.f1526B;
        c(this.f1545j);
        CharSequence charSequence = this.f1559x;
        TextPaint textPaint = this.f1529E;
        if (charSequence != null && (staticLayout = this.f1537M) != null) {
            this.N = TextUtils.ellipsize(charSequence, textPaint, staticLayout.getWidth(), TextUtils.TruncateAt.END);
        }
        CharSequence charSequence2 = this.N;
        float measureText = charSequence2 != null ? textPaint.measureText(charSequence2, 0, charSequence2.length()) : 0.0f;
        int absoluteGravity = Gravity.getAbsoluteGravity(this.f1543h, this.y ? 1 : 0);
        int i4 = absoluteGravity & 112;
        Rect rect = this.f1540e;
        if (i4 == 48) {
            this.f1549n = rect.top;
        } else if (i4 != 80) {
            this.f1549n = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
        } else {
            this.f1549n = textPaint.ascent() + rect.bottom;
        }
        int i5 = absoluteGravity & 8388615;
        if (i5 == 1) {
            this.f1551p = rect.centerX() - (measureText / 2.0f);
        } else if (i5 != 5) {
            this.f1551p = rect.left;
        } else {
            this.f1551p = rect.right - measureText;
        }
        c(this.f1544i);
        float height = this.f1537M != null ? r3.getHeight() : 0.0f;
        CharSequence charSequence3 = this.f1559x;
        float measureText2 = charSequence3 != null ? textPaint.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
        StaticLayout staticLayout2 = this.f1537M;
        if (staticLayout2 != null) {
            staticLayout2.getLineLeft(0);
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f1542g, this.y ? 1 : 0);
        int i6 = absoluteGravity2 & 112;
        Rect rect2 = this.d;
        if (i6 == 48) {
            this.f1548m = rect2.top;
        } else if (i6 != 80) {
            this.f1548m = rect2.centerY() - (height / 2.0f);
        } else {
            this.f1548m = textPaint.descent() + (rect2.bottom - height);
        }
        int i7 = absoluteGravity2 & 8388615;
        if (i7 == 1) {
            this.f1550o = rect2.centerX() - (measureText2 / 2.0f);
        } else if (i7 != 5) {
            this.f1550o = rect2.left;
        } else {
            this.f1550o = rect2.right - measureText2;
        }
        Bitmap bitmap = this.f1560z;
        if (bitmap != null) {
            bitmap.recycle();
            this.f1560z = null;
        }
        j(f4);
        float f5 = this.c;
        float e4 = e(rect2.left, rect.left, f5, this.f1531G);
        RectF rectF = this.f1541f;
        rectF.left = e4;
        rectF.top = e(this.f1548m, this.f1549n, f5, this.f1531G);
        rectF.right = e(rect2.right, rect.right, f5, this.f1531G);
        rectF.bottom = e(rect2.bottom, rect.bottom, f5, this.f1531G);
        this.f1552q = e(this.f1550o, this.f1551p, f5, this.f1531G);
        this.f1553r = e(this.f1548m, this.f1549n, f5, this.f1531G);
        j(e(this.f1544i, this.f1545j, f5, this.f1532H));
        P.a aVar = C2.a.f508b;
        e(0.0f, 1.0f, 1.0f - f5, aVar);
        WeakHashMap weakHashMap = A.f779a;
        textInputLayout.postInvalidateOnAnimation();
        e(1.0f, 0.0f, f5, aVar);
        textInputLayout.postInvalidateOnAnimation();
        ColorStateList colorStateList = this.f1547l;
        ColorStateList colorStateList2 = this.f1546k;
        if (colorStateList != colorStateList2) {
            textPaint.setColor(a(d(colorStateList2), d(this.f1547l), f5));
        } else {
            textPaint.setColor(d(colorStateList));
        }
        textPaint.setShadowLayer(n0.a.g(this.f1533I, 0.0f, f5, 0.0f), n0.a.g(this.f1534J, 0.0f, f5, 0.0f), n0.a.g(this.f1535K, 0.0f, f5, 0.0f), a(0, d(this.f1536L), f5));
        textInputLayout.postInvalidateOnAnimation();
    }

    public final void h(ColorStateList colorStateList) {
        if (this.f1547l != colorStateList) {
            this.f1547l = colorStateList;
            g();
        }
    }

    public final void i(float f4) {
        if (f4 < 0.0f) {
            f4 = 0.0f;
        } else if (f4 > 1.0f) {
            f4 = 1.0f;
        }
        if (f4 != this.c) {
            this.c = f4;
            float f5 = this.d.left;
            Rect rect = this.f1540e;
            float e4 = e(f5, rect.left, f4, this.f1531G);
            RectF rectF = this.f1541f;
            rectF.left = e4;
            rectF.top = e(this.f1548m, this.f1549n, f4, this.f1531G);
            rectF.right = e(r1.right, rect.right, f4, this.f1531G);
            rectF.bottom = e(r1.bottom, rect.bottom, f4, this.f1531G);
            this.f1552q = e(this.f1550o, this.f1551p, f4, this.f1531G);
            this.f1553r = e(this.f1548m, this.f1549n, f4, this.f1531G);
            j(e(this.f1544i, this.f1545j, f4, this.f1532H));
            P.a aVar = C2.a.f508b;
            e(0.0f, 1.0f, 1.0f - f4, aVar);
            WeakHashMap weakHashMap = A.f779a;
            TextInputLayout textInputLayout = this.f1538a;
            textInputLayout.postInvalidateOnAnimation();
            e(1.0f, 0.0f, f4, aVar);
            textInputLayout.postInvalidateOnAnimation();
            ColorStateList colorStateList = this.f1547l;
            ColorStateList colorStateList2 = this.f1546k;
            TextPaint textPaint = this.f1529E;
            if (colorStateList != colorStateList2) {
                textPaint.setColor(a(d(colorStateList2), d(this.f1547l), f4));
            } else {
                textPaint.setColor(d(colorStateList));
            }
            textPaint.setShadowLayer(n0.a.g(this.f1533I, 0.0f, f4, 0.0f), n0.a.g(this.f1534J, 0.0f, f4, 0.0f), n0.a.g(this.f1535K, 0.0f, f4, 0.0f), a(0, d(this.f1536L), f4));
            textInputLayout.postInvalidateOnAnimation();
        }
    }

    public final void j(float f4) {
        c(f4);
        WeakHashMap weakHashMap = A.f779a;
        this.f1538a.postInvalidateOnAnimation();
    }
}
