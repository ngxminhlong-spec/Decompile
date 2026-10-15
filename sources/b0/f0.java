package b0;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class f0 extends AbstractC0182P {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3273a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0213z f3274b;

    public f0(C0213z c0213z) {
        this.f3274b = c0213z;
    }

    @Override // b0.AbstractC0182P
    public final void a(RecyclerView recyclerView, int i4) {
        if (i4 == 0 && this.f3273a) {
            this.f3273a = false;
            this.f3274b.f();
        }
    }

    @Override // b0.AbstractC0182P
    public final void b(RecyclerView recyclerView, int i4, int i5) {
        if (i4 == 0 && i5 == 0) {
            return;
        }
        this.f3273a = true;
    }
}
