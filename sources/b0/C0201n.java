package b0;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import java.util.ArrayList;
import o1.C1884u;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: b0.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0201n implements InterfaceC0181O {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0206s f3360a;

    public C0201n(C0206s c0206s) {
        this.f3360a = c0206s;
    }

    @Override // b0.InterfaceC0181O
    public final void a(MotionEvent motionEvent) {
        C0206s c0206s = this.f3360a;
        D0.o oVar = c0206s.f3400r;
        ((GestureDetector) c0206s.f3405w.f677p).onTouchEvent(motionEvent);
        VelocityTracker velocityTracker = c0206s.f3401s;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        if (c0206s.f3394l == -1) {
            return;
        }
        int actionMasked = motionEvent.getActionMasked();
        int findPointerIndex = motionEvent.findPointerIndex(c0206s.f3394l);
        if (findPointerIndex >= 0 && c0206s.c == null && actionMasked == 2 && c0206s.f3396n != 2) {
            c0206s.f3395m.getClass();
        }
        c0 c0Var = c0206s.c;
        if (c0Var == null) {
            return;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                if (findPointerIndex >= 0) {
                    c0206s.p(c0206s.f3397o, findPointerIndex, motionEvent);
                    c0206s.m(c0Var);
                    c0206s.f3399q.removeCallbacks(oVar);
                    oVar.run();
                    c0206s.f3399q.invalidate();
                    return;
                }
                return;
            }
            if (actionMasked != 3) {
                if (actionMasked != 6) {
                    return;
                }
                int actionIndex = motionEvent.getActionIndex();
                if (motionEvent.getPointerId(actionIndex) == c0206s.f3394l) {
                    c0206s.f3394l = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                    c0206s.p(c0206s.f3397o, actionIndex, motionEvent);
                    return;
                }
                return;
            }
            VelocityTracker velocityTracker2 = c0206s.f3401s;
            if (velocityTracker2 != null) {
                velocityTracker2.clear();
            }
        }
        c0206s.o(null, 0);
        c0206s.f3394l = -1;
    }

    @Override // b0.InterfaceC0181O
    public final boolean b(MotionEvent motionEvent) {
        C0206s c0206s = this.f3360a;
        C1884u c1884u = c0206s.f3395m;
        ((GestureDetector) c0206s.f3405w.f677p).onTouchEvent(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        C0202o c0202o = null;
        if (actionMasked == 0) {
            c0206s.f3394l = motionEvent.getPointerId(0);
            c0206s.d = motionEvent.getX();
            c0206s.f3387e = motionEvent.getY();
            VelocityTracker velocityTracker = c0206s.f3401s;
            if (velocityTracker != null) {
                velocityTracker.recycle();
            }
            c0206s.f3401s = VelocityTracker.obtain();
            if (c0206s.c == null) {
                ArrayList arrayList = c0206s.f3398p;
                if (!arrayList.isEmpty()) {
                    View j4 = c0206s.j(motionEvent);
                    int size = arrayList.size() - 1;
                    while (true) {
                        if (size < 0) {
                            break;
                        }
                        C0202o c0202o2 = (C0202o) arrayList.get(size);
                        if (c0202o2.f3363e.f3244a == j4) {
                            c0202o = c0202o2;
                            break;
                        }
                        size--;
                    }
                }
                if (c0202o != null) {
                    c0 c0Var = c0202o.f3363e;
                    c0206s.d -= c0202o.f3367i;
                    c0206s.f3387e -= c0202o.f3368j;
                    c0206s.i(c0Var, true);
                    if (c0206s.f3385a.remove(c0Var.f3244a)) {
                        c1884u.e(c0Var);
                    }
                    c0206s.o(c0Var, c0202o.f3364f);
                    c0206s.p(c0206s.f3397o, 0, motionEvent);
                }
            }
        } else if (actionMasked == 3 || actionMasked == 1) {
            c0206s.f3394l = -1;
            c0206s.o(null, 0);
        } else {
            int i4 = c0206s.f3394l;
            if (i4 != -1 && motionEvent.findPointerIndex(i4) >= 0 && c0206s.c == null && actionMasked == 2 && c0206s.f3396n != 2) {
                c1884u.getClass();
            }
        }
        VelocityTracker velocityTracker2 = c0206s.f3401s;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        return c0206s.c != null;
    }

    @Override // b0.InterfaceC0181O
    public final void c(boolean z4) {
        if (z4) {
            this.f3360a.o(null, 0);
        }
    }
}
