package x2;

import android.content.ComponentName;
import android.content.Context;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class H0 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f15380o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ I0 f15381p;

    public /* synthetic */ H0(I0 i02, int i4) {
        this.f15380o = i4;
        this.f15381p = i02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15380o) {
            case 0:
                I0 i02 = this.f15381p;
                J0 j02 = i02.f15386q;
                Context context = ((C2066c0) j02.f1719a).f15562a;
                ((C2066c0) i02.f15386q.f1719a).getClass();
                J0.u(j02, new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementService"));
                return;
            default:
                J0 j03 = this.f15381p.f15386q;
                j03.d = null;
                j03.p();
                return;
        }
    }
}
