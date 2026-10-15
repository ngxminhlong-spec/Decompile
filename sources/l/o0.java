package l;

import androidx.appcompat.widget.SearchView;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class o0 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f13812o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ SearchView f13813p;

    public /* synthetic */ o0(SearchView searchView, int i4) {
        this.f13812o = i4;
        this.f13813p = searchView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f13812o) {
            case 0:
                this.f13813p.s();
                return;
            default:
                K.c cVar = this.f13813p.f2580f0;
                if (cVar instanceof w0) {
                    cVar.b(null);
                    return;
                }
                return;
        }
    }
}
