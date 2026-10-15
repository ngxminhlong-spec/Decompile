package b0;

import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class b0 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public int f3233o;

    /* renamed from: p, reason: collision with root package name */
    public int f3234p;

    /* renamed from: q, reason: collision with root package name */
    public OverScroller f3235q;

    /* renamed from: r, reason: collision with root package name */
    public Interpolator f3236r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f3237s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f3238t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f3239u;

    public b0(RecyclerView recyclerView) {
        this.f3239u = recyclerView;
        M.d dVar = RecyclerView.f3024L0;
        this.f3236r = dVar;
        this.f3237s = false;
        this.f3238t = false;
        this.f3235q = new OverScroller(recyclerView.getContext(), dVar);
    }

    public final void a() {
        if (this.f3237s) {
            this.f3238t = true;
            return;
        }
        RecyclerView recyclerView = this.f3239u;
        recyclerView.removeCallbacks(this);
        WeakHashMap weakHashMap = H.A.f779a;
        recyclerView.postOnAnimation(this);
    }

    public final void b(int i4, int i5, int i6, Interpolator interpolator) {
        int i7;
        RecyclerView recyclerView = this.f3239u;
        if (i6 == Integer.MIN_VALUE) {
            int abs = Math.abs(i4);
            int abs2 = Math.abs(i5);
            boolean z4 = abs > abs2;
            int sqrt = (int) Math.sqrt(0);
            int sqrt2 = (int) Math.sqrt((i5 * i5) + (i4 * i4));
            int width = z4 ? recyclerView.getWidth() : recyclerView.getHeight();
            int i8 = width / 2;
            float f4 = width;
            float f5 = i8;
            float sin = (((float) Math.sin((Math.min(1.0f, (sqrt2 * 1.0f) / f4) - 0.5f) * 0.47123894f)) * f5) + f5;
            if (sqrt > 0) {
                i7 = Math.round(Math.abs(sin / sqrt) * 1000.0f) * 4;
            } else {
                if (!z4) {
                    abs = abs2;
                }
                i7 = (int) (((abs / f4) + 1.0f) * 300.0f);
            }
            i6 = Math.min(i7, 2000);
        }
        int i9 = i6;
        if (interpolator == null) {
            interpolator = RecyclerView.f3024L0;
        }
        if (this.f3236r != interpolator) {
            this.f3236r = interpolator;
            this.f3235q = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.f3234p = 0;
        this.f3233o = 0;
        recyclerView.setScrollState(2);
        this.f3235q.startScroll(0, 0, i4, i5, i9);
        a();
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i4;
        int i5;
        int i6;
        int i7;
        boolean awakenScrollBars;
        RecyclerView recyclerView = this.f3239u;
        int[] iArr = recyclerView.f3036F0;
        if (recyclerView.f3025A == null) {
            recyclerView.removeCallbacks(this);
            this.f3235q.abortAnimation();
            return;
        }
        this.f3238t = false;
        this.f3237s = true;
        recyclerView.m();
        OverScroller overScroller = this.f3235q;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i8 = currX - this.f3233o;
            int i9 = currY - this.f3234p;
            this.f3233o = currX;
            this.f3234p = currY;
            int[] iArr2 = recyclerView.f3036F0;
            iArr2[0] = 0;
            iArr2[1] = 0;
            if (recyclerView.s(i8, i9, 1, iArr2, null)) {
                i4 = i8 - iArr[0];
                i5 = i9 - iArr[1];
            } else {
                i4 = i8;
                i5 = i9;
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.l(i4, i5);
            }
            if (recyclerView.f3091z != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                recyclerView.b0(i4, i5, iArr);
                i6 = iArr[0];
                i7 = iArr[1];
                i4 -= i6;
                i5 -= i7;
                C0212y c0212y = recyclerView.f3025A.f3186e;
                if (c0212y != null && !c0212y.d && c0212y.f3436e) {
                    int b4 = recyclerView.f3081t0.b();
                    if (b4 == 0) {
                        c0212y.g();
                    } else if (c0212y.f3434a >= b4) {
                        c0212y.f3434a = b4 - 1;
                        c0212y.e(i6, i7);
                    } else {
                        c0212y.e(i6, i7);
                    }
                }
            } else {
                i6 = 0;
                i7 = 0;
            }
            if (!recyclerView.f3027B.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr3 = recyclerView.f3036F0;
            iArr3[0] = 0;
            iArr3[1] = 0;
            recyclerView.t(i6, i7, i4, i5, null, 1, iArr3);
            int i10 = i4 - iArr[0];
            int i11 = i5 - iArr[1];
            if (i6 != 0 || i7 != 0) {
                recyclerView.u(i6, i7);
            }
            awakenScrollBars = recyclerView.awakenScrollBars();
            if (!awakenScrollBars) {
                recyclerView.invalidate();
            }
            boolean z4 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i10 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i11 != 0));
            C0212y c0212y2 = recyclerView.f3025A.f3186e;
            if ((c0212y2 == null || !c0212y2.d) && z4) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    int i12 = i10 < 0 ? -currVelocity : i10 > 0 ? currVelocity : 0;
                    if (i11 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i11 <= 0) {
                        currVelocity = 0;
                    }
                    if (i12 < 0) {
                        recyclerView.w();
                        if (recyclerView.f3053U.isFinished()) {
                            recyclerView.f3053U.onAbsorb(-i12);
                        }
                    } else if (i12 > 0) {
                        recyclerView.x();
                        if (recyclerView.f3055W.isFinished()) {
                            recyclerView.f3055W.onAbsorb(i12);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView.y();
                        if (recyclerView.f3054V.isFinished()) {
                            recyclerView.f3054V.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView.v();
                        if (recyclerView.f3056a0.isFinished()) {
                            recyclerView.f3056a0.onAbsorb(currVelocity);
                        }
                    }
                    if (i12 != 0 || currVelocity != 0) {
                        WeakHashMap weakHashMap = H.A.f779a;
                        recyclerView.postInvalidateOnAnimation();
                    }
                }
                C0197j c0197j = recyclerView.f3079s0;
                int[] iArr4 = c0197j.f3325a;
                if (iArr4 != null) {
                    Arrays.fill(iArr4, -1);
                }
                c0197j.d = 0;
            } else {
                a();
                RunnableC0199l runnableC0199l = recyclerView.f3077r0;
                if (runnableC0199l != null) {
                    runnableC0199l.a(recyclerView, i6, i7);
                }
            }
        }
        C0212y c0212y3 = recyclerView.f3025A.f3186e;
        if (c0212y3 != null && c0212y3.d) {
            c0212y3.e(0, 0);
        }
        this.f3237s = false;
        if (!this.f3238t) {
            recyclerView.setScrollState(0);
            recyclerView.g0(1);
        } else {
            recyclerView.removeCallbacks(this);
            WeakHashMap weakHashMap2 = H.A.f779a;
            recyclerView.postOnAnimation(this);
        }
    }
}
