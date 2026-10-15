package b0;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;
import o1.C1884u;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: b0.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0205r extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3382a = true;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0206s f3383b;

    public C0205r(C0206s c0206s) {
        this.f3383b = c0206s;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        View j4;
        c0 I4;
        C0206s c0206s = this.f3383b;
        C1884u c1884u = c0206s.f3395m;
        if (!this.f3382a || (j4 = c0206s.j(motionEvent)) == null || (I4 = c0206s.f3399q.I(j4)) == null) {
            return;
        }
        RecyclerView recyclerView = c0206s.f3399q;
        c1884u.getClass();
        WeakHashMap weakHashMap = H.A.f779a;
        if ((AbstractC0204q.a(196611, recyclerView.getLayoutDirection()) & 16711680) != 0) {
            int pointerId = motionEvent.getPointerId(0);
            int i4 = c0206s.f3394l;
            if (pointerId == i4) {
                int findPointerIndex = motionEvent.findPointerIndex(i4);
                float x4 = motionEvent.getX(findPointerIndex);
                float y = motionEvent.getY(findPointerIndex);
                c0206s.d = x4;
                c0206s.f3387e = y;
                c0206s.f3391i = 0.0f;
                c0206s.f3390h = 0.0f;
                c1884u.getClass();
                c0206s.o(I4, 2);
            }
        }
    }
}
