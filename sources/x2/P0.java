package x2;

import android.os.SystemClock;
import com.google.android.gms.internal.ads.C0590f1;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class P0 extends AbstractC2085m {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f15428e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f15429f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ P0(Object obj, InterfaceC2078i0 interfaceC2078i0, int i4) {
        super(interfaceC2078i0);
        this.f15428e = i4;
        this.f15429f = obj;
    }

    @Override // x2.AbstractC2085m
    public final void b() {
        switch (this.f15428e) {
            case 0:
                C0590f1 c0590f1 = (C0590f1) this.f15429f;
                Q0 q02 = (Q0) c0590f1.f8672r;
                q02.g();
                C2066c0 c2066c0 = (C2066c0) q02.f1719a;
                c2066c0.f15573n.getClass();
                c0590f1.b(SystemClock.elapsedRealtime(), false, false);
                C2104w k3 = c2066c0.k();
                c2066c0.f15573n.getClass();
                k3.j(SystemClock.elapsedRealtime());
                return;
            default:
                R0 r02 = (R0) this.f15429f;
                r02.e();
                K k4 = ((C2066c0) r02.f1719a).f15568i;
                C2066c0.i(k4);
                k4.f15402n.a("Starting upload from DelayedRunnable");
                r02.f15438b.s();
                return;
        }
    }
}
