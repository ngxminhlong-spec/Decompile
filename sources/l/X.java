package l;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class X implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f13689o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Y f13690p;

    public /* synthetic */ X(Y y, int i4) {
        this.f13689o = i4;
        this.f13690p = y;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f13689o) {
            case 0:
                ViewParent parent = this.f13690p.f13694r.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    return;
                }
                return;
            default:
                Y y = this.f13690p;
                y.a();
                View view = y.f13694r;
                if (view.isEnabled() && !view.isLongClickable() && y.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(obtain);
                    obtain.recycle();
                    y.f13697u = true;
                    return;
                }
                return;
        }
    }
}
