package com.google.ads.mediation;

import H1.j;
import O1.InterfaceC0051a;
import S1.h;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.InterfaceC1283v9;
import com.google.android.gms.internal.ads.Op;
import com.google.android.gms.internal.ads.Y9;
import h2.y;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class b extends H1.b implements I1.b, InterfaceC0051a {

    /* renamed from: o, reason: collision with root package name */
    public final h f3845o;

    public b(AbstractAdViewAdapter abstractAdViewAdapter, h hVar) {
        this.f3845o = hVar;
    }

    @Override // I1.b
    public final void B(String str, String str2) {
        Op op = (Op) this.f3845o;
        op.getClass();
        y.d("#008 Must be called on the main UI thread.");
        Y9.m("Adapter called onAppEvent.");
        try {
            ((InterfaceC1283v9) op.f6525p).S1(str, str2);
        } catch (RemoteException e4) {
            Y9.u("#007 Could not call remote method.", e4);
        }
    }

    @Override // H1.b
    public final void D() {
        Op op = (Op) this.f3845o;
        op.getClass();
        y.d("#008 Must be called on the main UI thread.");
        Y9.m("Adapter called onAdClicked.");
        try {
            ((InterfaceC1283v9) op.f6525p).a();
        } catch (RemoteException e4) {
            Y9.u("#007 Could not call remote method.", e4);
        }
    }

    @Override // H1.b
    public final void a() {
        Op op = (Op) this.f3845o;
        op.getClass();
        y.d("#008 Must be called on the main UI thread.");
        Y9.m("Adapter called onAdClosed.");
        try {
            ((InterfaceC1283v9) op.f6525p).d();
        } catch (RemoteException e4) {
            Y9.u("#007 Could not call remote method.", e4);
        }
    }

    @Override // H1.b
    public final void b(j jVar) {
        ((Op) this.f3845o).c(jVar);
    }

    @Override // H1.b
    public final void e() {
        Op op = (Op) this.f3845o;
        op.getClass();
        y.d("#008 Must be called on the main UI thread.");
        Y9.m("Adapter called onAdLoaded.");
        try {
            ((InterfaceC1283v9) op.f6525p).n();
        } catch (RemoteException e4) {
            Y9.u("#007 Could not call remote method.", e4);
        }
    }

    @Override // H1.b
    public final void l() {
        Op op = (Op) this.f3845o;
        op.getClass();
        y.d("#008 Must be called on the main UI thread.");
        Y9.m("Adapter called onAdOpened.");
        try {
            ((InterfaceC1283v9) op.f6525p).o();
        } catch (RemoteException e4) {
            Y9.u("#007 Could not call remote method.", e4);
        }
    }
}
