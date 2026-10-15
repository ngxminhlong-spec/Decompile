package b0;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: b0.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0212y {

    /* renamed from: a, reason: collision with root package name */
    public int f3434a = -1;

    /* renamed from: b, reason: collision with root package name */
    public RecyclerView f3435b;
    public AbstractC0178L c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3436e;

    /* renamed from: f, reason: collision with root package name */
    public View f3437f;

    /* renamed from: g, reason: collision with root package name */
    public final X f3438g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f3439h;

    /* renamed from: i, reason: collision with root package name */
    public final LinearInterpolator f3440i;

    /* renamed from: j, reason: collision with root package name */
    public final DecelerateInterpolator f3441j;

    /* renamed from: k, reason: collision with root package name */
    public PointF f3442k;

    /* renamed from: l, reason: collision with root package name */
    public final DisplayMetrics f3443l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f3444m;

    /* renamed from: n, reason: collision with root package name */
    public float f3445n;

    /* renamed from: o, reason: collision with root package name */
    public int f3446o;

    /* renamed from: p, reason: collision with root package name */
    public int f3447p;

    /* JADX WARN: Type inference failed for: r1v0, types: [b0.X, java.lang.Object] */
    public C0212y(Context context) {
        ?? obj = new Object();
        obj.d = -1;
        obj.f3214f = false;
        obj.f3215g = 0;
        obj.f3211a = 0;
        obj.f3212b = 0;
        obj.c = Integer.MIN_VALUE;
        obj.f3213e = null;
        this.f3438g = obj;
        this.f3440i = new LinearInterpolator();
        this.f3441j = new DecelerateInterpolator();
        this.f3444m = false;
        this.f3446o = 0;
        this.f3447p = 0;
        this.f3443l = context.getResources().getDisplayMetrics();
    }

    public static int a(int i4, int i5, int i6, int i7, int i8) {
        if (i8 == -1) {
            return i6 - i4;
        }
        if (i8 != 0) {
            if (i8 == 1) {
                return i7 - i5;
            }
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
        int i9 = i6 - i4;
        if (i9 > 0) {
            return i9;
        }
        int i10 = i7 - i5;
        if (i10 < 0) {
            return i10;
        }
        return 0;
    }

    public float b(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public final int c(int i4) {
        float abs = Math.abs(i4);
        if (!this.f3444m) {
            this.f3445n = b(this.f3443l);
            this.f3444m = true;
        }
        return (int) Math.ceil(abs * this.f3445n);
    }

    public final PointF d(int i4) {
        Object obj = this.c;
        if (obj instanceof Y) {
            return ((Y) obj).a(i4);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + Y.class.getCanonicalName());
        return null;
    }

    public final void e(int i4, int i5) {
        PointF d;
        RecyclerView recyclerView = this.f3435b;
        if (this.f3434a == -1 || recyclerView == null) {
            g();
        }
        if (this.d && this.f3437f == null && this.c != null && (d = d(this.f3434a)) != null) {
            float f4 = d.x;
            if (f4 != 0.0f || d.y != 0.0f) {
                recyclerView.b0((int) Math.signum(f4), (int) Math.signum(d.y), null);
            }
        }
        this.d = false;
        View view = this.f3437f;
        X x4 = this.f3438g;
        if (view != null) {
            this.f3435b.getClass();
            c0 J4 = RecyclerView.J(view);
            if ((J4 != null ? J4.c() : -1) == this.f3434a) {
                View view2 = this.f3437f;
                Z z4 = recyclerView.f3081t0;
                f(view2, x4);
                x4.a(recyclerView);
                g();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f3437f = null;
            }
        }
        if (this.f3436e) {
            Z z5 = recyclerView.f3081t0;
            if (this.f3435b.f3025A.v() == 0) {
                g();
            } else {
                int i6 = this.f3446o;
                int i7 = i6 - i4;
                if (i6 * i7 <= 0) {
                    i7 = 0;
                }
                this.f3446o = i7;
                int i8 = this.f3447p;
                int i9 = i8 - i5;
                if (i8 * i9 <= 0) {
                    i9 = 0;
                }
                this.f3447p = i9;
                if (i7 == 0 && i9 == 0) {
                    PointF d4 = d(this.f3434a);
                    if (d4 != null) {
                        if (d4.x != 0.0f || d4.y != 0.0f) {
                            float f5 = d4.y;
                            float sqrt = (float) Math.sqrt((f5 * f5) + (r10 * r10));
                            float f6 = d4.x / sqrt;
                            d4.x = f6;
                            float f7 = d4.y / sqrt;
                            d4.y = f7;
                            this.f3442k = d4;
                            this.f3446o = (int) (f6 * 10000.0f);
                            this.f3447p = (int) (f7 * 10000.0f);
                            int c = c(10000);
                            x4.f3211a = (int) (this.f3446o * 1.2f);
                            x4.f3212b = (int) (this.f3447p * 1.2f);
                            x4.c = (int) (c * 1.2f);
                            x4.f3213e = this.f3440i;
                            x4.f3214f = true;
                        }
                    }
                    x4.d = this.f3434a;
                    g();
                }
            }
            boolean z6 = x4.d >= 0;
            x4.a(recyclerView);
            if (z6 && this.f3436e) {
                this.d = true;
                recyclerView.f3075q0.a();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void f(android.view.View r11, b0.X r12) {
        /*
            r10 = this;
            android.graphics.PointF r0 = r10.f3442k
            r1 = -1
            r2 = 1
            r3 = 0
            r4 = 0
            if (r0 == 0) goto L15
            float r0 = r0.x
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 != 0) goto Lf
            goto L15
        Lf:
            if (r0 <= 0) goto L13
            r0 = r2
            goto L16
        L13:
            r0 = r1
            goto L16
        L15:
            r0 = r3
        L16:
            b0.L r5 = r10.c
            if (r5 == 0) goto L45
            boolean r6 = r5.d()
            if (r6 != 0) goto L21
            goto L45
        L21:
            android.view.ViewGroup$LayoutParams r6 = r11.getLayoutParams()
            b0.M r6 = (b0.C0179M) r6
            int r7 = b0.AbstractC0178L.A(r11)
            int r8 = r6.leftMargin
            int r7 = r7 - r8
            int r8 = b0.AbstractC0178L.B(r11)
            int r6 = r6.rightMargin
            int r8 = r8 + r6
            int r6 = r5.E()
            int r9 = r5.f3195n
            int r5 = r5.F()
            int r9 = r9 - r5
            int r0 = a(r7, r8, r6, r9, r0)
            goto L46
        L45:
            r0 = r3
        L46:
            android.graphics.PointF r5 = r10.f3442k
            if (r5 == 0) goto L55
            float r5 = r5.y
            int r4 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r4 != 0) goto L51
            goto L55
        L51:
            if (r4 <= 0) goto L56
            r1 = r2
            goto L56
        L55:
            r1 = r3
        L56:
            b0.L r4 = r10.c
            if (r4 == 0) goto L84
            boolean r5 = r4.e()
            if (r5 != 0) goto L61
            goto L84
        L61:
            android.view.ViewGroup$LayoutParams r3 = r11.getLayoutParams()
            b0.M r3 = (b0.C0179M) r3
            int r5 = b0.AbstractC0178L.C(r11)
            int r6 = r3.topMargin
            int r5 = r5 - r6
            int r11 = b0.AbstractC0178L.y(r11)
            int r3 = r3.bottomMargin
            int r11 = r11 + r3
            int r3 = r4.G()
            int r6 = r4.f3196o
            int r4 = r4.D()
            int r6 = r6 - r4
            int r3 = a(r5, r11, r3, r6, r1)
        L84:
            int r11 = r0 * r0
            int r1 = r3 * r3
            int r1 = r1 + r11
            double r4 = (double) r1
            double r4 = java.lang.Math.sqrt(r4)
            int r11 = (int) r4
            int r11 = r10.c(r11)
            double r4 = (double) r11
            r6 = 4599717252057688074(0x3fd57a786c22680a, double:0.3356)
            double r4 = r4 / r6
            double r4 = java.lang.Math.ceil(r4)
            int r11 = (int) r4
            if (r11 <= 0) goto Laf
            int r0 = -r0
            int r1 = -r3
            r12.f3211a = r0
            r12.f3212b = r1
            r12.c = r11
            android.view.animation.DecelerateInterpolator r11 = r10.f3441j
            r12.f3213e = r11
            r12.f3214f = r2
        Laf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.C0212y.f(android.view.View, b0.X):void");
    }

    public final void g() {
        if (this.f3436e) {
            this.f3436e = false;
            this.f3447p = 0;
            this.f3446o = 0;
            this.f3442k = null;
            this.f3435b.f3081t0.f3216a = -1;
            this.f3437f = null;
            this.f3434a = -1;
            this.d = false;
            AbstractC0178L abstractC0178L = this.c;
            if (abstractC0178L.f3186e == this) {
                abstractC0178L.f3186e = null;
            }
            this.c = null;
            this.f3435b = null;
        }
    }
}
