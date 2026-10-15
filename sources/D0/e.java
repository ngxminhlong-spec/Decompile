package D0;

import f.AbstractActivityC1671f;
import o2.AbstractC1895f;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class e implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f537o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ g f538p;

    public /* synthetic */ e(g gVar, int i4) {
        this.f537o = i4;
        this.f538p = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f537o) {
            case 0:
                AbstractActivityC1671f h4 = this.f538p.h();
                if (h4 == null) {
                    return;
                }
                AbstractC1895f.y(h4, 8, null);
                return;
            case 1:
                this.f538p.f576r0.setPressed(false);
                return;
            default:
                this.f538p.f542B0.setVisibility(8);
                return;
        }
    }
}
