package j2;

import N1.l;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.internal.ads.AbstractC1106r4;
import g2.m;
import h2.AbstractC1709h;
import h2.n;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: j2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1733d extends AbstractC1709h {
    public final n N;

    public C1733d(Context context, Looper looper, l lVar, n nVar, m mVar, m mVar2) {
        super(context, looper, 270, lVar, mVar, mVar2);
        this.N = nVar;
    }

    @Override // h2.AbstractC1706e
    public final int f() {
        return 203400000;
    }

    @Override // h2.AbstractC1706e
    public final IInterface o(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return queryLocalInterface instanceof C1730a ? (C1730a) queryLocalInterface : new AbstractC1106r4(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService", 2);
    }

    @Override // h2.AbstractC1706e
    public final e2.d[] q() {
        return r2.b.f14755b;
    }

    @Override // h2.AbstractC1706e
    public final Bundle r() {
        this.N.getClass();
        return new Bundle();
    }

    @Override // h2.AbstractC1706e
    public final String u() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // h2.AbstractC1706e
    public final String v() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // h2.AbstractC1706e
    public final boolean w() {
        return true;
    }
}
