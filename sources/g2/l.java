package g2;

import com.google.android.gms.internal.ads.Ur;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class l implements InterfaceC1682b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1684d f13004a;

    public l(C1684d c1684d) {
        this.f13004a = c1684d;
    }

    @Override // g2.InterfaceC1682b
    public final void a(boolean z4) {
        Ur ur = this.f13004a.f12989A;
        ur.sendMessage(ur.obtainMessage(1, Boolean.valueOf(z4)));
    }
}
