package l;

import android.widget.AbsListView;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: l.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1762d0 implements AbsListView.OnScrollListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1764e0 f13723a;

    public C1762d0(C1764e0 c1764e0) {
        this.f13723a = c1764e0;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i4, int i5, int i6) {
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i4) {
        C1764e0 c1764e0 = this.f13723a;
        RunnableC1760c0 runnableC1760c0 = c1764e0.f13732E;
        C1788v c1788v = c1764e0.f13740M;
        if (i4 != 1 || c1788v.getInputMethodMode() == 2 || c1788v.getContentView() == null) {
            return;
        }
        c1764e0.f13736I.removeCallbacks(runnableC1760c0);
        runnableC1760c0.run();
    }
}
