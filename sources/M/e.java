package M;

import D0.o;
import H.A;
import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.OverScroller;
import d3.AbstractC1654b;
import java.util.Arrays;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: w, reason: collision with root package name */
    public static final d f1120w = new d(0);

    /* renamed from: a, reason: collision with root package name */
    public int f1121a;

    /* renamed from: b, reason: collision with root package name */
    public int f1122b;
    public float[] d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f1123e;

    /* renamed from: f, reason: collision with root package name */
    public float[] f1124f;

    /* renamed from: g, reason: collision with root package name */
    public float[] f1125g;

    /* renamed from: h, reason: collision with root package name */
    public int[] f1126h;

    /* renamed from: i, reason: collision with root package name */
    public int[] f1127i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f1128j;

    /* renamed from: k, reason: collision with root package name */
    public int f1129k;

    /* renamed from: l, reason: collision with root package name */
    public VelocityTracker f1130l;

    /* renamed from: m, reason: collision with root package name */
    public final float f1131m;

    /* renamed from: n, reason: collision with root package name */
    public float f1132n;

    /* renamed from: o, reason: collision with root package name */
    public final int f1133o;

    /* renamed from: p, reason: collision with root package name */
    public int f1134p;

    /* renamed from: q, reason: collision with root package name */
    public final OverScroller f1135q;

    /* renamed from: r, reason: collision with root package name */
    public final AbstractC1654b f1136r;

    /* renamed from: s, reason: collision with root package name */
    public View f1137s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f1138t;

    /* renamed from: u, reason: collision with root package name */
    public final ViewGroup f1139u;
    public int c = -1;

    /* renamed from: v, reason: collision with root package name */
    public final o f1140v = new o(3, this);

    public e(Context context, ViewGroup viewGroup, AbstractC1654b abstractC1654b) {
        if (abstractC1654b == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f1139u = viewGroup;
        this.f1136r = abstractC1654b;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f1133o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f1122b = viewConfiguration.getScaledTouchSlop();
        this.f1131m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f1132n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f1135q = new OverScroller(context, f1120w);
    }

    public final void a() {
        this.c = -1;
        float[] fArr = this.d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f1123e, 0.0f);
            Arrays.fill(this.f1124f, 0.0f);
            Arrays.fill(this.f1125g, 0.0f);
            Arrays.fill(this.f1126h, 0);
            Arrays.fill(this.f1127i, 0);
            Arrays.fill(this.f1128j, 0);
            this.f1129k = 0;
        }
        VelocityTracker velocityTracker = this.f1130l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f1130l = null;
        }
    }

    public final void b(View view, int i4) {
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = this.f1139u;
        if (parent != viewGroup) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + viewGroup + ")");
        }
        this.f1137s = view;
        this.c = i4;
        this.f1136r.J(view, i4);
        p(1);
    }

    public final boolean c(float f4, float f5, int i4, int i5) {
        float abs = Math.abs(f4);
        float abs2 = Math.abs(f5);
        if ((this.f1126h[i4] & i5) != i5 || (this.f1134p & i5) == 0 || (this.f1128j[i4] & i5) == i5 || (this.f1127i[i4] & i5) == i5) {
            return false;
        }
        float f6 = this.f1122b;
        if (abs <= f6 && abs2 <= f6) {
            return false;
        }
        if (abs < abs2 * 0.5f) {
            this.f1136r.getClass();
        }
        return (this.f1127i[i4] & i5) == 0 && abs > ((float) this.f1122b);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0044 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(android.view.View r4, float r5, float r6) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            goto L45
        L4:
            d3.b r1 = r3.f1136r
            int r4 = r1.z(r4)
            r2 = 1
            if (r4 <= 0) goto Lf
            r4 = r2
            goto L10
        Lf:
            r4 = r0
        L10:
            int r1 = r1.A()
            if (r1 <= 0) goto L18
            r1 = r2
            goto L19
        L18:
            r1 = r0
        L19:
            if (r4 == 0) goto L29
            if (r1 == 0) goto L29
            float r5 = r5 * r5
            float r6 = r6 * r6
            float r6 = r6 + r5
            int r4 = r3.f1122b
            int r4 = r4 * r4
            float r4 = (float) r4
            int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r4 <= 0) goto L45
            goto L44
        L29:
            if (r4 == 0) goto L37
            float r4 = java.lang.Math.abs(r5)
            int r5 = r3.f1122b
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L45
            goto L44
        L37:
            if (r1 == 0) goto L45
            float r4 = java.lang.Math.abs(r6)
            int r5 = r3.f1122b
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L45
        L44:
            return r2
        L45:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: M.e.d(android.view.View, float, float):boolean");
    }

    public final void e(int i4) {
        float[] fArr = this.d;
        if (fArr != null) {
            int i5 = this.f1129k;
            int i6 = 1 << i4;
            if ((i5 & i6) != 0) {
                fArr[i4] = 0.0f;
                this.f1123e[i4] = 0.0f;
                this.f1124f[i4] = 0.0f;
                this.f1125g[i4] = 0.0f;
                this.f1126h[i4] = 0;
                this.f1127i[i4] = 0;
                this.f1128j[i4] = 0;
                this.f1129k = (~i6) & i5;
            }
        }
    }

    public final int f(int i4, int i5, int i6) {
        if (i4 == 0) {
            return 0;
        }
        float width = this.f1139u.getWidth() / 2;
        float sin = (((float) Math.sin((Math.min(1.0f, Math.abs(i4) / r0) - 0.5f) * 0.47123894f)) * width) + width;
        int abs = Math.abs(i5);
        return Math.min(abs > 0 ? Math.round(Math.abs(sin / abs) * 1000.0f) * 4 : (int) (((Math.abs(i4) / i6) + 1.0f) * 256.0f), 600);
    }

    public final boolean g() {
        if (this.f1121a == 2) {
            OverScroller overScroller = this.f1135q;
            boolean computeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.f1137s.getLeft();
            int top = currY - this.f1137s.getTop();
            if (left != 0) {
                View view = this.f1137s;
                WeakHashMap weakHashMap = A.f779a;
                view.offsetLeftAndRight(left);
            }
            if (top != 0) {
                View view2 = this.f1137s;
                WeakHashMap weakHashMap2 = A.f779a;
                view2.offsetTopAndBottom(top);
            }
            if (left != 0 || top != 0) {
                this.f1136r.L(this.f1137s, currX, currY);
            }
            if (computeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                this.f1139u.post(this.f1140v);
            }
        }
        return this.f1121a == 2;
    }

    public final View h(int i4, int i5) {
        ViewGroup viewGroup = this.f1139u;
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            this.f1136r.getClass();
            View childAt = viewGroup.getChildAt(childCount);
            if (i4 >= childAt.getLeft() && i4 < childAt.getRight() && i5 >= childAt.getTop() && i5 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final boolean i(int i4, int i5, int i6, int i7) {
        float f4;
        float f5;
        float f6;
        float f7;
        int left = this.f1137s.getLeft();
        int top = this.f1137s.getTop();
        int i8 = i4 - left;
        int i9 = i5 - top;
        OverScroller overScroller = this.f1135q;
        if (i8 == 0 && i9 == 0) {
            overScroller.abortAnimation();
            p(0);
            return false;
        }
        View view = this.f1137s;
        int i10 = (int) this.f1132n;
        int i11 = (int) this.f1131m;
        int abs = Math.abs(i6);
        if (abs < i10) {
            i6 = 0;
        } else if (abs > i11) {
            i6 = i6 > 0 ? i11 : -i11;
        }
        int i12 = (int) this.f1132n;
        int abs2 = Math.abs(i7);
        if (abs2 < i12) {
            i7 = 0;
        } else if (abs2 > i11) {
            i7 = i7 > 0 ? i11 : -i11;
        }
        int abs3 = Math.abs(i8);
        int abs4 = Math.abs(i9);
        int abs5 = Math.abs(i6);
        int abs6 = Math.abs(i7);
        int i13 = abs5 + abs6;
        int i14 = abs3 + abs4;
        if (i6 != 0) {
            f4 = abs5;
            f5 = i13;
        } else {
            f4 = abs3;
            f5 = i14;
        }
        float f8 = f4 / f5;
        if (i7 != 0) {
            f6 = abs6;
            f7 = i13;
        } else {
            f6 = abs4;
            f7 = i14;
        }
        float f9 = f6 / f7;
        AbstractC1654b abstractC1654b = this.f1136r;
        overScroller.startScroll(left, top, i8, i9, (int) ((f(i9, i7, abstractC1654b.A()) * f9) + (f(i8, i6, abstractC1654b.z(view)) * f8)));
        p(2);
        return true;
    }

    public final boolean j(int i4) {
        if ((this.f1129k & (1 << i4)) != 0) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i4 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    public final void k(MotionEvent motionEvent) {
        int i4;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f1130l == null) {
            this.f1130l = VelocityTracker.obtain();
        }
        this.f1130l.addMovement(motionEvent);
        AbstractC1654b abstractC1654b = this.f1136r;
        int i5 = 0;
        if (actionMasked == 0) {
            float x4 = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View h4 = h((int) x4, (int) y);
            n(x4, y, pointerId);
            t(h4, pointerId);
            if ((this.f1126h[pointerId] & this.f1134p) != 0) {
                abstractC1654b.I();
                return;
            }
            return;
        }
        if (actionMasked == 1) {
            if (this.f1121a == 1) {
                l();
            }
            a();
            return;
        }
        if (actionMasked == 2) {
            if (this.f1121a != 1) {
                int pointerCount = motionEvent.getPointerCount();
                while (i5 < pointerCount) {
                    int pointerId2 = motionEvent.getPointerId(i5);
                    if (j(pointerId2)) {
                        float x5 = motionEvent.getX(i5);
                        float y4 = motionEvent.getY(i5);
                        float f4 = x5 - this.d[pointerId2];
                        float f5 = y4 - this.f1123e[pointerId2];
                        m(f4, f5, pointerId2);
                        if (this.f1121a != 1) {
                            View h5 = h((int) x5, (int) y4);
                            if (d(h5, f4, f5) && t(h5, pointerId2)) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    i5++;
                }
                o(motionEvent);
                return;
            }
            if (j(this.c)) {
                int findPointerIndex = motionEvent.findPointerIndex(this.c);
                float x6 = motionEvent.getX(findPointerIndex);
                float y5 = motionEvent.getY(findPointerIndex);
                float[] fArr = this.f1124f;
                int i6 = this.c;
                int i7 = (int) (x6 - fArr[i6]);
                int i8 = (int) (y5 - this.f1125g[i6]);
                int left = this.f1137s.getLeft() + i7;
                int top = this.f1137s.getTop() + i8;
                int left2 = this.f1137s.getLeft();
                int top2 = this.f1137s.getTop();
                if (i7 != 0) {
                    left = abstractC1654b.f(this.f1137s, left);
                    WeakHashMap weakHashMap = A.f779a;
                    this.f1137s.offsetLeftAndRight(left - left2);
                }
                if (i8 != 0) {
                    top = abstractC1654b.g(this.f1137s, top);
                    WeakHashMap weakHashMap2 = A.f779a;
                    this.f1137s.offsetTopAndBottom(top - top2);
                }
                if (i7 != 0 || i8 != 0) {
                    abstractC1654b.L(this.f1137s, left, top);
                }
                o(motionEvent);
                return;
            }
            return;
        }
        if (actionMasked == 3) {
            if (this.f1121a == 1) {
                this.f1138t = true;
                abstractC1654b.M(this.f1137s, 0.0f, 0.0f);
                this.f1138t = false;
                if (this.f1121a == 1) {
                    p(0);
                }
            }
            a();
            return;
        }
        if (actionMasked != 5) {
            if (actionMasked != 6) {
                return;
            }
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            if (this.f1121a == 1 && pointerId3 == this.c) {
                int pointerCount2 = motionEvent.getPointerCount();
                while (true) {
                    if (i5 >= pointerCount2) {
                        i4 = -1;
                        break;
                    }
                    int pointerId4 = motionEvent.getPointerId(i5);
                    if (pointerId4 != this.c) {
                        View h6 = h((int) motionEvent.getX(i5), (int) motionEvent.getY(i5));
                        View view = this.f1137s;
                        if (h6 == view && t(view, pointerId4)) {
                            i4 = this.c;
                            break;
                        }
                    }
                    i5++;
                }
                if (i4 == -1) {
                    l();
                }
            }
            e(pointerId3);
            return;
        }
        int pointerId5 = motionEvent.getPointerId(actionIndex);
        float x7 = motionEvent.getX(actionIndex);
        float y6 = motionEvent.getY(actionIndex);
        n(x7, y6, pointerId5);
        if (this.f1121a == 0) {
            t(h((int) x7, (int) y6), pointerId5);
            if ((this.f1126h[pointerId5] & this.f1134p) != 0) {
                abstractC1654b.I();
                return;
            }
            return;
        }
        int i9 = (int) x7;
        int i10 = (int) y6;
        View view2 = this.f1137s;
        if (view2 != null && i9 >= view2.getLeft() && i9 < view2.getRight() && i10 >= view2.getTop() && i10 < view2.getBottom()) {
            i5 = 1;
        }
        if (i5 != 0) {
            t(this.f1137s, pointerId5);
        }
    }

    public final void l() {
        VelocityTracker velocityTracker = this.f1130l;
        float f4 = this.f1131m;
        velocityTracker.computeCurrentVelocity(1000, f4);
        float xVelocity = this.f1130l.getXVelocity(this.c);
        float f5 = this.f1132n;
        float abs = Math.abs(xVelocity);
        if (abs < f5) {
            xVelocity = 0.0f;
        } else if (abs > f4) {
            xVelocity = xVelocity > 0.0f ? f4 : -f4;
        }
        float yVelocity = this.f1130l.getYVelocity(this.c);
        float f6 = this.f1132n;
        float abs2 = Math.abs(yVelocity);
        if (abs2 < f6) {
            f4 = 0.0f;
        } else if (abs2 <= f4) {
            f4 = yVelocity;
        } else if (yVelocity <= 0.0f) {
            f4 = -f4;
        }
        this.f1138t = true;
        this.f1136r.M(this.f1137s, xVelocity, f4);
        this.f1138t = false;
        if (this.f1121a == 1) {
            p(0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r3v3, types: [d3.b] */
    public final void m(float f4, float f5, int i4) {
        boolean c = c(f4, f5, i4, 1);
        boolean z4 = c;
        if (c(f5, f4, i4, 4)) {
            z4 = (c ? 1 : 0) | 4;
        }
        boolean z5 = z4;
        if (c(f4, f5, i4, 2)) {
            z5 = (z4 ? 1 : 0) | 2;
        }
        ?? r02 = z5;
        if (c(f5, f4, i4, 8)) {
            r02 = (z5 ? 1 : 0) | 8;
        }
        if (r02 != 0) {
            int[] iArr = this.f1127i;
            iArr[i4] = iArr[i4] | r02;
            this.f1136r.H(r02, i4);
        }
    }

    public final void n(float f4, float f5, int i4) {
        float[] fArr = this.d;
        if (fArr == null || fArr.length <= i4) {
            int i5 = i4 + 1;
            float[] fArr2 = new float[i5];
            float[] fArr3 = new float[i5];
            float[] fArr4 = new float[i5];
            float[] fArr5 = new float[i5];
            int[] iArr = new int[i5];
            int[] iArr2 = new int[i5];
            int[] iArr3 = new int[i5];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f1123e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f1124f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f1125g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f1126h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f1127i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f1128j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.d = fArr2;
            this.f1123e = fArr3;
            this.f1124f = fArr4;
            this.f1125g = fArr5;
            this.f1126h = iArr;
            this.f1127i = iArr2;
            this.f1128j = iArr3;
        }
        float[] fArr9 = this.d;
        this.f1124f[i4] = f4;
        fArr9[i4] = f4;
        float[] fArr10 = this.f1123e;
        this.f1125g[i4] = f5;
        fArr10[i4] = f5;
        int[] iArr7 = this.f1126h;
        int i6 = (int) f4;
        int i7 = (int) f5;
        ViewGroup viewGroup = this.f1139u;
        int left = viewGroup.getLeft();
        int i8 = this.f1133o;
        int i9 = i6 < left + i8 ? 1 : 0;
        if (i7 < viewGroup.getTop() + i8) {
            i9 |= 4;
        }
        if (i6 > viewGroup.getRight() - i8) {
            i9 |= 2;
        }
        if (i7 > viewGroup.getBottom() - i8) {
            i9 |= 8;
        }
        iArr7[i4] = i9;
        this.f1129k |= 1 << i4;
    }

    public final void o(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i4 = 0; i4 < pointerCount; i4++) {
            int pointerId = motionEvent.getPointerId(i4);
            if (j(pointerId)) {
                float x4 = motionEvent.getX(i4);
                float y = motionEvent.getY(i4);
                this.f1124f[pointerId] = x4;
                this.f1125g[pointerId] = y;
            }
        }
    }

    public final void p(int i4) {
        this.f1139u.removeCallbacks(this.f1140v);
        if (this.f1121a != i4) {
            this.f1121a = i4;
            this.f1136r.K(i4);
            if (this.f1121a == 0) {
                this.f1137s = null;
            }
        }
    }

    public final boolean q(int i4, int i5) {
        if (this.f1138t) {
            return i(i4, i5, (int) this.f1130l.getXVelocity(this.c), (int) this.f1130l.getYVelocity(this.c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d4, code lost:
    
        if (r13 != r12) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean r(android.view.MotionEvent r19) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: M.e.r(android.view.MotionEvent):boolean");
    }

    public final boolean s(View view, int i4, int i5) {
        this.f1137s = view;
        this.c = -1;
        boolean i6 = i(i4, i5, 0, 0);
        if (!i6 && this.f1121a == 0 && this.f1137s != null) {
            this.f1137s = null;
        }
        return i6;
    }

    public final boolean t(View view, int i4) {
        if (view == this.f1137s && this.c == i4) {
            return true;
        }
        if (view == null || !this.f1136r.Q(view, i4)) {
            return false;
        }
        this.c = i4;
        b(view, i4);
        return true;
    }
}
