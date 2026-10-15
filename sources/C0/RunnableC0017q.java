package C0;

import android.widget.HorizontalScrollView;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: C0.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0017q implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f366o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ HorizontalScrollView f367p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f368q;

    public /* synthetic */ RunnableC0017q(HorizontalScrollView horizontalScrollView, int i4, int i5) {
        this.f366o = i5;
        this.f367p = horizontalScrollView;
        this.f368q = i4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f366o) {
            case 0:
                this.f367p.smoothScrollBy(-this.f368q, 0);
                return;
            default:
                this.f367p.smoothScrollBy(-this.f368q, 0);
                return;
        }
    }
}
