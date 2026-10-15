package C0;

import android.widget.ScrollView;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: C0.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0021v implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f414o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ ScrollView f415p;

    public /* synthetic */ RunnableC0021v(ScrollView scrollView, int i4) {
        this.f414o = i4;
        this.f415p = scrollView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f414o) {
            case 0:
                this.f415p.scrollTo(0, 0);
                return;
            default:
                this.f415p.scrollTo(0, 0);
                return;
        }
    }
}
