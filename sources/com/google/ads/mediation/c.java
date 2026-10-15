package com.google.ads.mediation;

import O1.BinderC0086s;
import O1.J;
import S1.j;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.H8;
import com.google.android.gms.internal.ads.InterfaceC1283v9;
import com.google.android.gms.internal.ads.Op;
import com.google.android.gms.internal.ads.Y9;
import h2.y;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class c extends R1.b {
    public final AbstractAdViewAdapter c;
    public final j d;

    public c(AbstractAdViewAdapter abstractAdViewAdapter, j jVar) {
        this.c = abstractAdViewAdapter;
        this.d = jVar;
    }

    @Override // H1.r
    public final void b(H1.j jVar) {
        ((Op) this.d).e(jVar);
    }

    @Override // H1.r
    public final void e(Object obj) {
        R1.a aVar = (R1.a) obj;
        AbstractAdViewAdapter abstractAdViewAdapter = this.c;
        abstractAdViewAdapter.mInterstitialAd = aVar;
        j jVar = this.d;
        d dVar = new d(abstractAdViewAdapter, jVar);
        H8 h8 = (H8) aVar;
        h8.getClass();
        try {
            J j4 = h8.c;
            if (j4 != null) {
                j4.H3(new BinderC0086s(dVar));
            }
        } catch (RemoteException e4) {
            Y9.u("#007 Could not call remote method.", e4);
        }
        Op op = (Op) jVar;
        op.getClass();
        y.d("#008 Must be called on the main UI thread.");
        Y9.m("Adapter called onAdLoaded.");
        try {
            ((InterfaceC1283v9) op.f6525p).n();
        } catch (RemoteException e5) {
            Y9.u("#007 Could not call remote method.", e5);
        }
    }
}
