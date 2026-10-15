package com.google.android.gms.internal.ads;

import O1.C0101z0;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final /* synthetic */ class Fn implements Lg {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Bn f5084o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ G8 f5085p;

    public /* synthetic */ Fn(Bn bn, G8 g8) {
        this.f5084o = bn;
        this.f5085p = g8;
    }

    @Override // com.google.android.gms.internal.ads.Lg
    public final void J(C0101z0 c0101z0) {
        this.f5084o.J(c0101z0);
        G8 g8 = this.f5085p;
        if (g8 != null) {
            try {
                Parcel Q3 = g8.Q();
                AbstractC1192t4.c(Q3, c0101z0);
                g8.G1(Q3, 3);
            } catch (RemoteException e4) {
                Y9.u("#007 Could not call remote method.", e4);
            }
        }
        if (g8 != null) {
            try {
                int i4 = c0101z0.f1405o;
                Parcel Q4 = g8.Q();
                Q4.writeInt(i4);
                g8.G1(Q4, 2);
            } catch (RemoteException e5) {
                Y9.u("#007 Could not call remote method.", e5);
            }
        }
    }
}
