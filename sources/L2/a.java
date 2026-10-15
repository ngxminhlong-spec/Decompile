package L2;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class a implements View.OnTouchListener {

    /* renamed from: o, reason: collision with root package name */
    public final Dialog f1088o;

    /* renamed from: p, reason: collision with root package name */
    public final int f1089p;

    /* renamed from: q, reason: collision with root package name */
    public final int f1090q;

    /* renamed from: r, reason: collision with root package name */
    public final int f1091r;

    public a(Dialog dialog, Rect rect) {
        this.f1088o = dialog;
        this.f1089p = rect.left;
        this.f1090q = rect.top;
        this.f1091r = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View findViewById = view.findViewById(R.id.content);
        int left = findViewById.getLeft() + this.f1089p;
        int width = findViewById.getWidth() + left;
        if (new RectF(left, findViewById.getTop() + this.f1090q, width, findViewById.getHeight() + r4).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            int i4 = this.f1091r;
            obtain.setLocation((-i4) - 1, (-i4) - 1);
        }
        view.performClick();
        return this.f1088o.onTouchEvent(obtain);
    }
}
