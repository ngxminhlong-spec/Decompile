package C0;

import android.view.View;
import f.AbstractActivityC1671f;
import o2.AbstractC1895f;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: C0.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0016p implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f358o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ View f359p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ D f360q;

    public /* synthetic */ RunnableC0016p(D d, View view, int i4) {
        this.f358o = i4;
        this.f360q = d;
        this.f359p = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f358o) {
            case 0:
                AbstractActivityC1671f h4 = this.f360q.h();
                if (h4 == null) {
                    return;
                }
                AbstractC1895f.y(h4, 8, new DialogInterfaceOnDismissListenerC0015o(this));
                return;
            default:
                D.Q(this.f360q, this.f359p);
                return;
        }
    }
}
