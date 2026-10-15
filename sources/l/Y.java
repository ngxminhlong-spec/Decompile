package l;

import android.view.View;
import android.view.ViewConfiguration;
import k.InterfaceC1743D;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class Y implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: o, reason: collision with root package name */
    public final float f13691o;

    /* renamed from: p, reason: collision with root package name */
    public final int f13692p;

    /* renamed from: q, reason: collision with root package name */
    public final int f13693q;

    /* renamed from: r, reason: collision with root package name */
    public final View f13694r;

    /* renamed from: s, reason: collision with root package name */
    public X f13695s;

    /* renamed from: t, reason: collision with root package name */
    public X f13696t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f13697u;

    /* renamed from: v, reason: collision with root package name */
    public int f13698v;

    /* renamed from: w, reason: collision with root package name */
    public final int[] f13699w = new int[2];

    public Y(View view) {
        this.f13694r = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f13691o = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f13692p = tapTimeout;
        this.f13693q = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        X x4 = this.f13696t;
        View view = this.f13694r;
        if (x4 != null) {
            view.removeCallbacks(x4);
        }
        X x5 = this.f13695s;
        if (x5 != null) {
            view.removeCallbacks(x5);
        }
    }

    public abstract InterfaceC1743D b();

    public abstract boolean c();

    public boolean e() {
        InterfaceC1743D b4 = b();
        if (b4 == null || !b4.b()) {
            return true;
        }
        b4.dismiss();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
    
        if (r14 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007b, code lost:
    
        if (r4 != 3) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0100  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r13, android.view.MotionEvent r14) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.Y.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f13697u = false;
        this.f13698v = -1;
        X x4 = this.f13695s;
        if (x4 != null) {
            this.f13694r.removeCallbacks(x4);
        }
    }
}
