package l;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class u0 extends TouchDelegate {

    /* renamed from: a, reason: collision with root package name */
    public final View f13831a;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f13832b;
    public final Rect c;
    public final Rect d;

    /* renamed from: e, reason: collision with root package name */
    public final int f13833e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f13834f;

    public u0(Rect rect, Rect rect2, View view) {
        super(rect, view);
        int scaledTouchSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.f13833e = scaledTouchSlop;
        Rect rect3 = new Rect();
        this.f13832b = rect3;
        Rect rect4 = new Rect();
        this.d = rect4;
        Rect rect5 = new Rect();
        this.c = rect5;
        rect3.set(rect);
        rect4.set(rect);
        int i4 = -scaledTouchSlop;
        rect4.inset(i4, i4);
        rect5.set(rect2);
        this.f13831a = view;
    }

    @Override // android.view.TouchDelegate
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z4;
        boolean z5;
        int x4 = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        boolean z6 = true;
        if (action != 0) {
            if (action == 1 || action == 2) {
                z5 = this.f13834f;
                if (z5 && !this.d.contains(x4, y)) {
                    z6 = z5;
                    z4 = false;
                }
            } else {
                if (action == 3) {
                    z5 = this.f13834f;
                    this.f13834f = false;
                }
                z4 = true;
                z6 = false;
            }
            z6 = z5;
            z4 = true;
        } else {
            if (this.f13832b.contains(x4, y)) {
                this.f13834f = true;
                z4 = true;
            }
            z4 = true;
            z6 = false;
        }
        if (!z6) {
            return false;
        }
        Rect rect = this.c;
        View view = this.f13831a;
        if (!z4 || rect.contains(x4, y)) {
            motionEvent.setLocation(x4 - rect.left, y - rect.top);
        } else {
            motionEvent.setLocation(view.getWidth() / 2, view.getHeight() / 2);
        }
        return view.dispatchTouchEvent(motionEvent);
    }
}
