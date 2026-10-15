package f;

import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.widget.ContentFrameLayout;
import g.AbstractC1678a;
import j.C1721c;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class o extends ContentFrameLayout {

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ q f12853w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(q qVar, C1721c c1721c) {
        super(c1721c, null);
        this.f12853w = qVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f12853w.o(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x4 = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (x4 < -5 || y < -5 || x4 > getWidth() + 5 || y > getHeight() + 5) {
                q qVar = this.f12853w;
                qVar.n(qVar.t(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i4) {
        setBackgroundDrawable(AbstractC1678a.a(getContext(), i4));
    }
}
