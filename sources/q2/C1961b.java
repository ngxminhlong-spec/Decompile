package q2;

import android.os.IBinder;
import android.os.IInterface;
import h2.AbstractC1709h;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: q2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1961b extends AbstractC1709h {
    @Override // h2.AbstractC1706e
    public final int f() {
        return 212800000;
    }

    @Override // h2.AbstractC1706e
    public final /* synthetic */ IInterface o(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.appset.internal.IAppSetService");
        return queryLocalInterface instanceof C1962c ? (C1962c) queryLocalInterface : new C1962c(iBinder);
    }

    @Override // h2.AbstractC1706e
    public final e2.d[] q() {
        return b2.d.f3496b;
    }

    @Override // h2.AbstractC1706e
    public final String u() {
        return "com.google.android.gms.appset.internal.IAppSetService";
    }

    @Override // h2.AbstractC1706e
    public final String v() {
        return "com.google.android.gms.appset.service.START";
    }

    @Override // h2.AbstractC1706e
    public final boolean w() {
        return true;
    }
}
