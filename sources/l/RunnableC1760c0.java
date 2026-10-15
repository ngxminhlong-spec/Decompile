package l;

import java.util.WeakHashMap;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: l.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1760c0 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f13721o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C1764e0 f13722p;

    public /* synthetic */ RunnableC1760c0(C1764e0 c1764e0, int i4) {
        this.f13721o = i4;
        this.f13722p = c1764e0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i4 = this.f13721o;
        C1764e0 c1764e0 = this.f13722p;
        switch (i4) {
            case 0:
                V v4 = c1764e0.f13743q;
                if (v4 != null) {
                    v4.setListSelectionHidden(true);
                    v4.requestLayout();
                    return;
                }
                return;
            default:
                V v5 = c1764e0.f13743q;
                if (v5 != null) {
                    WeakHashMap weakHashMap = H.A.f779a;
                    if (!v5.isAttachedToWindow() || c1764e0.f13743q.getCount() <= c1764e0.f13743q.getChildCount() || c1764e0.f13743q.getChildCount() > c1764e0.f13728A) {
                        return;
                    }
                    c1764e0.f13740M.setInputMethodMode(2);
                    c1764e0.e();
                    return;
                }
                return;
        }
    }
}
