package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import h2.AbstractC1706e;
import h2.InterfaceC1703b;
import h2.InterfaceC1704c;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.La, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0300La extends AbstractC1706e {

    /* renamed from: M, reason: collision with root package name */
    public final /* synthetic */ int f6142M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0300La(Context context, Looper looper, int i4, InterfaceC1703b interfaceC1703b, InterfaceC1704c interfaceC1704c, int i5) {
        super(i4, context, looper, interfaceC1703b, interfaceC1704c);
        this.f6142M = i5;
    }

    @Override // h2.AbstractC1706e
    public int f() {
        switch (this.f6142M) {
            case 1:
                return 12451000;
            default:
                return super.f();
        }
    }

    @Override // h2.AbstractC1706e
    public final IInterface o(IBinder iBinder) {
        switch (this.f6142M) {
            case 0:
                if (iBinder == null) {
                    return null;
                }
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdsService");
                return queryLocalInterface instanceof InterfaceC0340Ta ? (InterfaceC0340Ta) queryLocalInterface : new AbstractC1106r4(iBinder, "com.google.android.gms.ads.internal.request.IAdsService", 0);
            default:
                if (iBinder == null) {
                    return null;
                }
                IInterface queryLocalInterface2 = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                return queryLocalInterface2 instanceof x2.D ? (x2.D) queryLocalInterface2 : new x2.C(iBinder);
        }
    }

    @Override // h2.AbstractC1706e
    public final String u() {
        switch (this.f6142M) {
            case 0:
                return "com.google.android.gms.ads.internal.request.IAdsService";
            default:
                return "com.google.android.gms.measurement.internal.IMeasurementService";
        }
    }

    @Override // h2.AbstractC1706e
    public final String v() {
        switch (this.f6142M) {
            case 0:
                return "com.google.android.gms.ads.service.ADS";
            default:
                return "com.google.android.gms.measurement.START";
        }
    }
}
