package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import h2.InterfaceC1703b;
import h2.InterfaceC1704c;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Fr extends N1.b {

    /* renamed from: M, reason: collision with root package name */
    public final int f5099M;

    public Fr(int i4, Context context, Looper looper, InterfaceC1703b interfaceC1703b, InterfaceC1704c interfaceC1704c) {
        super(116, context, looper, interfaceC1703b, interfaceC1704c);
        this.f5099M = i4;
    }

    @Override // h2.AbstractC1706e
    public final int f() {
        return this.f5099M;
    }

    @Override // h2.AbstractC1706e
    public final IInterface o(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.gass.internal.IGassService");
        return queryLocalInterface instanceof Ir ? (Ir) queryLocalInterface : new AbstractC1106r4(iBinder, "com.google.android.gms.gass.internal.IGassService", 0);
    }

    @Override // h2.AbstractC1706e
    public final String u() {
        return "com.google.android.gms.gass.internal.IGassService";
    }

    @Override // h2.AbstractC1706e
    public final String v() {
        return "com.google.android.gms.gass.START";
    }
}
