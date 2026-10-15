package b0;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c1.C0234c;
import java.util.ArrayList;
import o1.C1881r;
import o1.C1884u;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: b0.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0206s extends AbstractC0176J {

    /* renamed from: A, reason: collision with root package name */
    public long f3384A;
    public float d;

    /* renamed from: e, reason: collision with root package name */
    public float f3387e;

    /* renamed from: f, reason: collision with root package name */
    public float f3388f;

    /* renamed from: g, reason: collision with root package name */
    public float f3389g;

    /* renamed from: h, reason: collision with root package name */
    public float f3390h;

    /* renamed from: i, reason: collision with root package name */
    public float f3391i;

    /* renamed from: j, reason: collision with root package name */
    public float f3392j;

    /* renamed from: k, reason: collision with root package name */
    public float f3393k;

    /* renamed from: m, reason: collision with root package name */
    public final C1884u f3395m;

    /* renamed from: o, reason: collision with root package name */
    public int f3397o;

    /* renamed from: q, reason: collision with root package name */
    public RecyclerView f3399q;

    /* renamed from: s, reason: collision with root package name */
    public VelocityTracker f3401s;

    /* renamed from: t, reason: collision with root package name */
    public ArrayList f3402t;

    /* renamed from: u, reason: collision with root package name */
    public ArrayList f3403u;

    /* renamed from: w, reason: collision with root package name */
    public D3.d f3405w;

    /* renamed from: x, reason: collision with root package name */
    public C0205r f3406x;

    /* renamed from: z, reason: collision with root package name */
    public Rect f3407z;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f3385a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final float[] f3386b = new float[2];
    public c0 c = null;

    /* renamed from: l, reason: collision with root package name */
    public int f3394l = -1;

    /* renamed from: n, reason: collision with root package name */
    public int f3396n = 0;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f3398p = new ArrayList();

    /* renamed from: r, reason: collision with root package name */
    public final D0.o f3400r = new D0.o(20, this);

    /* renamed from: v, reason: collision with root package name */
    public View f3404v = null;
    public final C0201n y = new C0201n(this);

    public C0206s(C1884u c1884u) {
        this.f3395m = c1884u;
    }

    public static boolean l(View view, float f4, float f5, float f6, float f7) {
        return f4 >= f6 && f4 <= f6 + ((float) view.getWidth()) && f5 >= f7 && f5 <= f7 + ((float) view.getHeight());
    }

    @Override // b0.AbstractC0176J
    public final void d(Rect rect, View view) {
        rect.setEmpty();
    }

    @Override // b0.AbstractC0176J
    public final void e(Canvas canvas, RecyclerView recyclerView) {
        float f4;
        float f5;
        if (this.c != null) {
            float[] fArr = this.f3386b;
            k(fArr);
            f4 = fArr[0];
            f5 = fArr[1];
        } else {
            f4 = 0.0f;
            f5 = 0.0f;
        }
        c0 c0Var = this.c;
        this.f3395m.getClass();
        ArrayList arrayList = this.f3398p;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            C0202o c0202o = (C0202o) arrayList.get(i4);
            c0 c0Var2 = c0202o.f3363e;
            float f6 = c0202o.f3361a;
            float f7 = c0202o.c;
            if (f6 == f7) {
                c0202o.f3367i = c0Var2.f3244a.getTranslationX();
            } else {
                c0202o.f3367i = n0.a.g(f7, f6, c0202o.f3371m, f6);
            }
            float f8 = c0202o.f3362b;
            float f9 = c0202o.d;
            if (f8 == f9) {
                c0202o.f3368j = c0Var2.f3244a.getTranslationY();
            } else {
                c0202o.f3368j = n0.a.g(f9, f8, c0202o.f3371m, f8);
            }
            int save = canvas.save();
            AbstractC0204q.d(recyclerView, c0202o.f3363e, c0202o.f3367i, c0202o.f3368j, false);
            canvas.restoreToCount(save);
        }
        if (c0Var != null) {
            int save2 = canvas.save();
            AbstractC0204q.d(recyclerView, c0Var, f4, f5, true);
            canvas.restoreToCount(save2);
        }
    }

    @Override // b0.AbstractC0176J
    public final void f(Canvas canvas, RecyclerView recyclerView) {
        boolean z4 = false;
        if (this.c != null) {
            float[] fArr = this.f3386b;
            k(fArr);
            float f4 = fArr[0];
            float f5 = fArr[1];
        }
        c0 c0Var = this.c;
        this.f3395m.getClass();
        ArrayList arrayList = this.f3398p;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            C0202o c0202o = (C0202o) arrayList.get(i4);
            int save = canvas.save();
            View view = c0202o.f3363e.f3244a;
            canvas.restoreToCount(save);
        }
        if (c0Var != null) {
            canvas.restoreToCount(canvas.save());
        }
        for (int i5 = size - 1; i5 >= 0; i5--) {
            C0202o c0202o2 = (C0202o) arrayList.get(i5);
            boolean z5 = c0202o2.f3370l;
            if (z5 && !c0202o2.f3366h) {
                arrayList.remove(i5);
            } else if (!z5) {
                z4 = true;
            }
        }
        if (z4) {
            recyclerView.invalidate();
        }
    }

    public final int g(int i4) {
        if ((i4 & 12) == 0) {
            return 0;
        }
        int i5 = this.f3390h > 0.0f ? 8 : 4;
        VelocityTracker velocityTracker = this.f3401s;
        C1884u c1884u = this.f3395m;
        if (velocityTracker != null && this.f3394l > -1) {
            float f4 = this.f3389g;
            c1884u.getClass();
            velocityTracker.computeCurrentVelocity(1000, f4);
            float xVelocity = this.f3401s.getXVelocity(this.f3394l);
            float yVelocity = this.f3401s.getYVelocity(this.f3394l);
            int i6 = xVelocity > 0.0f ? 8 : 4;
            float abs = Math.abs(xVelocity);
            if ((i6 & i4) != 0 && i5 == i6 && abs >= this.f3388f && abs > Math.abs(yVelocity)) {
                return i6;
            }
        }
        float width = this.f3399q.getWidth();
        c1884u.getClass();
        float f5 = width * 0.5f;
        if ((i4 & i5) == 0 || Math.abs(this.f3390h) <= f5) {
            return 0;
        }
        return i5;
    }

    public final int h(int i4) {
        if ((i4 & 3) == 0) {
            return 0;
        }
        int i5 = this.f3391i > 0.0f ? 2 : 1;
        VelocityTracker velocityTracker = this.f3401s;
        C1884u c1884u = this.f3395m;
        if (velocityTracker != null && this.f3394l > -1) {
            float f4 = this.f3389g;
            c1884u.getClass();
            velocityTracker.computeCurrentVelocity(1000, f4);
            float xVelocity = this.f3401s.getXVelocity(this.f3394l);
            float yVelocity = this.f3401s.getYVelocity(this.f3394l);
            int i6 = yVelocity > 0.0f ? 2 : 1;
            float abs = Math.abs(yVelocity);
            if ((i6 & i4) != 0 && i6 == i5 && abs >= this.f3388f && abs > Math.abs(xVelocity)) {
                return i6;
            }
        }
        float height = this.f3399q.getHeight();
        c1884u.getClass();
        float f5 = height * 0.5f;
        if ((i4 & i5) == 0 || Math.abs(this.f3391i) <= f5) {
            return 0;
        }
        return i5;
    }

    public final void i(c0 c0Var, boolean z4) {
        ArrayList arrayList = this.f3398p;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0202o c0202o = (C0202o) arrayList.get(size);
            if (c0202o.f3363e == c0Var) {
                c0202o.f3369k |= z4;
                if (!c0202o.f3370l) {
                    c0202o.f3365g.cancel();
                }
                arrayList.remove(size);
                return;
            }
        }
    }

    public final View j(MotionEvent motionEvent) {
        float x4 = motionEvent.getX();
        float y = motionEvent.getY();
        c0 c0Var = this.c;
        if (c0Var != null) {
            View view = c0Var.f3244a;
            if (l(view, x4, y, this.f3392j + this.f3390h, this.f3393k + this.f3391i)) {
                return view;
            }
        }
        ArrayList arrayList = this.f3398p;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0202o c0202o = (C0202o) arrayList.get(size);
            View view2 = c0202o.f3363e.f3244a;
            if (l(view2, x4, y, c0202o.f3367i, c0202o.f3368j)) {
                return view2;
            }
        }
        RecyclerView recyclerView = this.f3399q;
        for (int n4 = recyclerView.f3078s.n() - 1; n4 >= 0; n4--) {
            View m4 = recyclerView.f3078s.m(n4);
            float translationX = m4.getTranslationX();
            float translationY = m4.getTranslationY();
            if (x4 >= m4.getLeft() + translationX && x4 <= m4.getRight() + translationX && y >= m4.getTop() + translationY && y <= m4.getBottom() + translationY) {
                return m4;
            }
        }
        return null;
    }

    public final void k(float[] fArr) {
        if ((this.f3397o & 12) != 0) {
            fArr[0] = (this.f3392j + this.f3390h) - this.c.f3244a.getLeft();
        } else {
            fArr[0] = this.c.f3244a.getTranslationX();
        }
        if ((this.f3397o & 3) != 0) {
            fArr[1] = (this.f3393k + this.f3391i) - this.c.f3244a.getTop();
        } else {
            fArr[1] = this.c.f3244a.getTranslationY();
        }
    }

    public final void m(c0 c0Var) {
        int bottom;
        int abs;
        int top;
        int abs2;
        int left;
        int abs3;
        int right;
        int abs4;
        int i4;
        int i5;
        int i6;
        if (!this.f3399q.isLayoutRequested() && this.f3396n == 2) {
            C1884u c1884u = this.f3395m;
            c1884u.getClass();
            int i7 = (int) (this.f3392j + this.f3390h);
            int i8 = (int) (this.f3393k + this.f3391i);
            View view = c0Var.f3244a;
            if (Math.abs(i8 - view.getTop()) >= view.getHeight() * 0.5f || Math.abs(i7 - view.getLeft()) >= view.getWidth() * 0.5f) {
                ArrayList arrayList = this.f3402t;
                if (arrayList == null) {
                    this.f3402t = new ArrayList();
                    this.f3403u = new ArrayList();
                } else {
                    arrayList.clear();
                    this.f3403u.clear();
                }
                int round = Math.round(this.f3392j + this.f3390h);
                int round2 = Math.round(this.f3393k + this.f3391i);
                int width = view.getWidth() + round;
                int height = view.getHeight() + round2;
                int i9 = (round + width) / 2;
                int i10 = (round2 + height) / 2;
                AbstractC0178L layoutManager = this.f3399q.getLayoutManager();
                int v4 = layoutManager.v();
                int i11 = 0;
                while (i11 < v4) {
                    View u2 = layoutManager.u(i11);
                    if (u2 == view) {
                        i4 = i11;
                    } else {
                        i4 = i11;
                        if (u2.getBottom() >= round2 && u2.getTop() <= height && u2.getRight() >= round && u2.getLeft() <= width) {
                            c0 I4 = this.f3399q.I(u2);
                            int abs5 = Math.abs(i9 - ((u2.getRight() + u2.getLeft()) / 2));
                            int abs6 = Math.abs(i10 - ((u2.getBottom() + u2.getTop()) / 2));
                            int i12 = (abs6 * abs6) + (abs5 * abs5);
                            i5 = i7;
                            int size = this.f3402t.size();
                            i6 = i8;
                            int i13 = 0;
                            int i14 = 0;
                            while (i13 < size) {
                                int i15 = size;
                                if (i12 <= ((Integer) this.f3403u.get(i13)).intValue()) {
                                    break;
                                }
                                i14++;
                                i13++;
                                size = i15;
                            }
                            this.f3402t.add(i14, I4);
                            this.f3403u.add(i14, Integer.valueOf(i12));
                            i11 = i4 + 1;
                            i7 = i5;
                            i8 = i6;
                        }
                    }
                    i5 = i7;
                    i6 = i8;
                    i11 = i4 + 1;
                    i7 = i5;
                    i8 = i6;
                }
                int i16 = i7;
                int i17 = i8;
                ArrayList arrayList2 = this.f3402t;
                if (arrayList2.size() == 0) {
                    return;
                }
                int width2 = view.getWidth() + i16;
                int height2 = view.getHeight() + i17;
                int left2 = i16 - view.getLeft();
                int top2 = i17 - view.getTop();
                int size2 = arrayList2.size();
                c0 c0Var2 = null;
                int i18 = -1;
                for (int i19 = 0; i19 < size2; i19++) {
                    c0 c0Var3 = (c0) arrayList2.get(i19);
                    if (left2 > 0 && (right = c0Var3.f3244a.getRight() - width2) < 0 && c0Var3.f3244a.getRight() > view.getRight() && (abs4 = Math.abs(right)) > i18) {
                        i18 = abs4;
                        c0Var2 = c0Var3;
                    }
                    if (left2 < 0 && (left = c0Var3.f3244a.getLeft() - i16) > 0 && c0Var3.f3244a.getLeft() < view.getLeft() && (abs3 = Math.abs(left)) > i18) {
                        i18 = abs3;
                        c0Var2 = c0Var3;
                    }
                    if (top2 < 0 && (top = c0Var3.f3244a.getTop() - i17) > 0 && c0Var3.f3244a.getTop() < view.getTop() && (abs2 = Math.abs(top)) > i18) {
                        i18 = abs2;
                        c0Var2 = c0Var3;
                    }
                    if (top2 > 0 && (bottom = c0Var3.f3244a.getBottom() - height2) < 0 && c0Var3.f3244a.getBottom() > view.getBottom() && (abs = Math.abs(bottom)) > i18) {
                        i18 = abs;
                        c0Var2 = c0Var3;
                    }
                }
                if (c0Var2 == null) {
                    this.f3402t.clear();
                    this.f3403u.clear();
                    return;
                }
                View view2 = c0Var2.f3244a;
                int b4 = c0Var2.b();
                c0Var.b();
                C1881r c1881r = c1884u.d;
                int b5 = c0Var.b();
                int b6 = c0Var2.b();
                C0234c c0234c = (C0234c) c1881r.d.get(b5);
                c1881r.d.remove(b5);
                c1881r.d.add(b6, c0234c);
                c1881r.f3176a.c(b5, b6);
                RecyclerView recyclerView = this.f3399q;
                AbstractC0178L layoutManager2 = recyclerView.getLayoutManager();
                if (!(layoutManager2 instanceof LinearLayoutManager)) {
                    if (layoutManager2.d()) {
                        if (AbstractC0178L.A(view2) <= recyclerView.getPaddingLeft()) {
                            recyclerView.c0(b4);
                        }
                        if (AbstractC0178L.B(view2) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                            recyclerView.c0(b4);
                        }
                    }
                    if (layoutManager2.e()) {
                        if (AbstractC0178L.C(view2) <= recyclerView.getPaddingTop()) {
                            recyclerView.c0(b4);
                        }
                        if (AbstractC0178L.y(view2) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                            recyclerView.c0(b4);
                            return;
                        }
                        return;
                    }
                    return;
                }
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager2;
                linearLayoutManager.c("Cannot drop a view during a scroll or layout calculation");
                linearLayoutManager.F0();
                linearLayoutManager.W0();
                int H3 = AbstractC0178L.H(view);
                int H4 = AbstractC0178L.H(view2);
                char c = H3 < H4 ? (char) 1 : (char) 65535;
                if (linearLayoutManager.f3018u) {
                    if (c == 1) {
                        linearLayoutManager.Y0(H4, linearLayoutManager.f3015r.g() - (linearLayoutManager.f3015r.c(view) + linearLayoutManager.f3015r.e(view2)));
                        return;
                    } else {
                        linearLayoutManager.Y0(H4, linearLayoutManager.f3015r.g() - linearLayoutManager.f3015r.b(view2));
                        return;
                    }
                }
                if (c == 65535) {
                    linearLayoutManager.Y0(H4, linearLayoutManager.f3015r.e(view2));
                } else {
                    linearLayoutManager.Y0(H4, linearLayoutManager.f3015r.b(view2) - linearLayoutManager.f3015r.c(view));
                }
            }
        }
    }

    public final void n(View view) {
        if (view == this.f3404v) {
            this.f3404v = null;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r6v10 int, still in use, count: 2, list:
          (r6v10 int) from 0x008d: IF  (r6v10 int) > (0 int)  -> B:19:0x00a8 A[HIDDEN]
          (r6v10 int) from 0x00a8: PHI (r6v14 int) = (r6v8 int), (r6v9 int), (r6v10 int), (r6v13 int), (r6v16 int) binds: [B:83:0x009e, B:80:0x0096, B:77:0x008d, B:75:0x007e, B:18:0x004a] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:125)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f8  */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r18v0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o(b0.c0 r22, int r23) {
        /*
            Method dump skipped, instructions count: 452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.C0206s.o(b0.c0, int):void");
    }

    public final void p(int i4, int i5, MotionEvent motionEvent) {
        float x4 = motionEvent.getX(i5);
        float y = motionEvent.getY(i5);
        float f4 = x4 - this.d;
        this.f3390h = f4;
        this.f3391i = y - this.f3387e;
        if ((i4 & 4) == 0) {
            this.f3390h = Math.max(0.0f, f4);
        }
        if ((i4 & 8) == 0) {
            this.f3390h = Math.min(0.0f, this.f3390h);
        }
        if ((i4 & 1) == 0) {
            this.f3391i = Math.max(0.0f, this.f3391i);
        }
        if ((i4 & 2) == 0) {
            this.f3391i = Math.min(0.0f, this.f3391i);
        }
    }
}
