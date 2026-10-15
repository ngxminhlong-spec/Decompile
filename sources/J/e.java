package J;

import D0.o;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import l.V;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class e implements View.OnTouchListener {

    /* renamed from: F, reason: collision with root package name */
    public static final int f932F = ViewConfiguration.getTapTimeout();

    /* renamed from: A, reason: collision with root package name */
    public boolean f933A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f934B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f935C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f936D;

    /* renamed from: E, reason: collision with root package name */
    public final V f937E;

    /* renamed from: o, reason: collision with root package name */
    public final a f938o;

    /* renamed from: p, reason: collision with root package name */
    public final AccelerateInterpolator f939p;

    /* renamed from: q, reason: collision with root package name */
    public final V f940q;

    /* renamed from: r, reason: collision with root package name */
    public o f941r;

    /* renamed from: s, reason: collision with root package name */
    public final float[] f942s;

    /* renamed from: t, reason: collision with root package name */
    public final float[] f943t;

    /* renamed from: u, reason: collision with root package name */
    public final int f944u;

    /* renamed from: v, reason: collision with root package name */
    public final int f945v;

    /* renamed from: w, reason: collision with root package name */
    public final float[] f946w;

    /* renamed from: x, reason: collision with root package name */
    public final float[] f947x;
    public final float[] y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f948z;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, J.a] */
    public e(V v4) {
        ?? obj = new Object();
        obj.f926e = Long.MIN_VALUE;
        obj.f928g = -1L;
        obj.f927f = 0L;
        this.f938o = obj;
        this.f939p = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f942s = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f943t = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f946w = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f947x = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.y = fArr5;
        this.f940q = v4;
        float f4 = Resources.getSystem().getDisplayMetrics().density;
        float f5 = ((int) ((1575.0f * f4) + 0.5f)) / 1000.0f;
        fArr5[0] = f5;
        fArr5[1] = f5;
        float f6 = ((int) ((f4 * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f6;
        fArr4[1] = f6;
        this.f944u = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f945v = f932F;
        obj.f924a = 500;
        obj.f925b = 500;
        this.f937E = v4;
    }

    public static float b(float f4, float f5, float f6) {
        return f4 > f6 ? f6 : f4 < f5 ? f5 : f4;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float a(float r4, float r5, float r6, int r7) {
        /*
            r3 = this;
            float[] r0 = r3.f942s
            r0 = r0[r7]
            float[] r1 = r3.f943t
            r1 = r1[r7]
            float r0 = r0 * r5
            r2 = 0
            float r0 = b(r0, r2, r1)
            float r1 = r3.c(r4, r0)
            float r5 = r5 - r4
            float r4 = r3.c(r5, r0)
            float r4 = r4 - r1
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            android.view.animation.AccelerateInterpolator r0 = r3.f939p
            if (r5 >= 0) goto L25
            float r4 = -r4
            float r4 = r0.getInterpolation(r4)
            float r4 = -r4
            goto L2d
        L25:
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r5 <= 0) goto L36
            float r4 = r0.getInterpolation(r4)
        L2d:
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r4 = b(r4, r5, r0)
            goto L37
        L36:
            r4 = r2
        L37:
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r5 != 0) goto L3c
            return r2
        L3c:
            float[] r0 = r3.f946w
            r0 = r0[r7]
            float[] r1 = r3.f947x
            r1 = r1[r7]
            float[] r2 = r3.y
            r7 = r2[r7]
            float r0 = r0 * r6
            if (r5 <= 0) goto L51
            float r4 = r4 * r0
            float r4 = b(r4, r1, r7)
            return r4
        L51:
            float r4 = -r4
            float r4 = r4 * r0
            float r4 = b(r4, r1, r7)
            float r4 = -r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: J.e.a(float, float, float, int):float");
    }

    public final float c(float f4, float f5) {
        if (f5 != 0.0f) {
            int i4 = this.f944u;
            if (i4 == 0 || i4 == 1) {
                if (f4 < f5) {
                    if (f4 >= 0.0f) {
                        return 1.0f - (f4 / f5);
                    }
                    if (this.f935C && i4 == 1) {
                        return 1.0f;
                    }
                }
            } else if (i4 == 2 && f4 < 0.0f) {
                return f4 / (-f5);
            }
        }
        return 0.0f;
    }

    public final void e() {
        int i4 = 0;
        if (this.f933A) {
            this.f935C = false;
            return;
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        a aVar = this.f938o;
        int i5 = (int) (currentAnimationTimeMillis - aVar.f926e);
        int i6 = aVar.f925b;
        if (i5 > i6) {
            i4 = i6;
        } else if (i5 >= 0) {
            i4 = i5;
        }
        aVar.f930i = i4;
        aVar.f929h = aVar.a(currentAnimationTimeMillis);
        aVar.f928g = currentAnimationTimeMillis;
    }

    public final boolean h() {
        V v4;
        int count;
        a aVar = this.f938o;
        float f4 = aVar.d;
        int abs = (int) (f4 / Math.abs(f4));
        Math.abs(aVar.c);
        if (abs != 0 && (count = (v4 = this.f937E).getCount()) != 0) {
            int childCount = v4.getChildCount();
            int firstVisiblePosition = v4.getFirstVisiblePosition();
            int i4 = firstVisiblePosition + childCount;
            if (abs <= 0 ? !(abs >= 0 || (firstVisiblePosition <= 0 && v4.getChildAt(0).getTop() >= 0)) : !(i4 >= count && v4.getChildAt(childCount - 1).getBottom() <= v4.getHeight())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0014, code lost:
    
        if (r0 != 3) goto L29;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r9, android.view.MotionEvent r10) {
        /*
            r8 = this;
            boolean r0 = r8.f936D
            r1 = 0
            if (r0 != 0) goto L7
            goto L7c
        L7:
            int r0 = r10.getActionMasked()
            r2 = 2
            r3 = 1
            if (r0 == 0) goto L1b
            if (r0 == r3) goto L17
            if (r0 == r2) goto L1f
            r9 = 3
            if (r0 == r9) goto L17
            goto L7c
        L17:
            r8.e()
            return r1
        L1b:
            r8.f934B = r3
            r8.f948z = r1
        L1f:
            float r0 = r10.getX()
            int r4 = r9.getWidth()
            float r4 = (float) r4
            l.V r5 = r8.f940q
            int r6 = r5.getWidth()
            float r6 = (float) r6
            float r0 = r8.a(r0, r4, r6, r1)
            float r10 = r10.getY()
            int r9 = r9.getHeight()
            float r9 = (float) r9
            int r4 = r5.getHeight()
            float r4 = (float) r4
            float r9 = r8.a(r10, r9, r4, r3)
            J.a r10 = r8.f938o
            r10.c = r0
            r10.d = r9
            boolean r9 = r8.f935C
            if (r9 != 0) goto L7c
            boolean r9 = r8.h()
            if (r9 == 0) goto L7c
            D0.o r9 = r8.f941r
            if (r9 != 0) goto L60
            D0.o r9 = new D0.o
            r9.<init>(r2, r8)
            r8.f941r = r9
        L60:
            r8.f935C = r3
            r8.f933A = r3
            boolean r9 = r8.f948z
            if (r9 != 0) goto L75
            int r9 = r8.f945v
            if (r9 <= 0) goto L75
            D0.o r10 = r8.f941r
            long r6 = (long) r9
            java.util.WeakHashMap r9 = H.A.f779a
            r5.postOnAnimationDelayed(r10, r6)
            goto L7a
        L75:
            D0.o r9 = r8.f941r
            r9.run()
        L7a:
            r8.f948z = r3
        L7c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: J.e.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
