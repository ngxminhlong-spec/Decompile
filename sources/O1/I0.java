package O1;

import com.google.android.gms.internal.ads.C1335wc;
import com.google.android.gms.internal.ads.Y9;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class I0 extends B {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ J0 f1278o;

    public /* synthetic */ I0(J0 j02) {
        this.f1278o = j02;
    }

    @Override // O1.C
    public final void B0(U0 u02) {
        i1(u02, 1);
    }

    @Override // O1.C
    public final String a() {
        return null;
    }

    @Override // O1.C
    public final String d() {
        return null;
    }

    @Override // O1.C
    public final boolean g() {
        return false;
    }

    @Override // O1.C
    public final void i1(U0 u02, int i4) {
        Y9.p("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        C1335wc.f11173b.post(new D0.o(5, this));
    }
}
