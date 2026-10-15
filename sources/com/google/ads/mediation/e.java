package com.google.ads.mediation;

import H1.j;
import S1.l;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.C0874ln;
import com.google.android.gms.internal.ads.InterfaceC1283v9;
import com.google.android.gms.internal.ads.Op;
import com.google.android.gms.internal.ads.Vk;
import com.google.android.gms.internal.ads.Y9;
import h2.y;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class e extends H1.b {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f3846o = 0;

    /* renamed from: p, reason: collision with root package name */
    public final Object f3847p;

    /* renamed from: q, reason: collision with root package name */
    public final Object f3848q;

    public e(AbstractAdViewAdapter abstractAdViewAdapter, l lVar) {
        this.f3847p = abstractAdViewAdapter;
        this.f3848q = lVar;
    }

    public e(Vk vk, String str) {
        this.f3848q = vk;
        this.f3847p = str;
    }

    private final void o() {
    }

    @Override // H1.b
    public void D() {
        switch (this.f3846o) {
            case 0:
                Op op = (Op) ((l) this.f3848q);
                op.getClass();
                y.d("#008 Must be called on the main UI thread.");
                a aVar = (a) op.f6526q;
                if (((C0874ln) op.f6527r) == null) {
                    if (aVar == null) {
                        Y9.u("#007 Could not call remote method.", null);
                        return;
                    } else if (!aVar.f3836q) {
                        Y9.m("Could not call onAdClicked since setOverrideClickHandling is not set to true");
                        return;
                    }
                }
                Y9.m("Adapter called onAdClicked.");
                try {
                    ((InterfaceC1283v9) op.f6525p).a();
                    return;
                } catch (RemoteException e4) {
                    Y9.u("#007 Could not call remote method.", e4);
                    return;
                }
            default:
                return;
        }
    }

    @Override // H1.b
    public void a() {
        switch (this.f3846o) {
            case 0:
                Op op = (Op) ((l) this.f3848q);
                op.getClass();
                y.d("#008 Must be called on the main UI thread.");
                Y9.m("Adapter called onAdClosed.");
                try {
                    ((InterfaceC1283v9) op.f6525p).d();
                    return;
                } catch (RemoteException e4) {
                    Y9.u("#007 Could not call remote method.", e4);
                    return;
                }
            default:
                return;
        }
    }

    @Override // H1.b
    public final void b(j jVar) {
        switch (this.f3846o) {
            case 0:
                ((Op) ((l) this.f3848q)).g(jVar);
                return;
            default:
                ((Vk) this.f3848q).P3(Vk.O3(jVar), (String) this.f3847p);
                return;
        }
    }

    @Override // H1.b
    public void c() {
        switch (this.f3846o) {
            case 0:
                Op op = (Op) ((l) this.f3848q);
                op.getClass();
                y.d("#008 Must be called on the main UI thread.");
                a aVar = (a) op.f6526q;
                if (((C0874ln) op.f6527r) == null) {
                    if (aVar == null) {
                        Y9.u("#007 Could not call remote method.", null);
                        return;
                    } else if (!aVar.f3835p) {
                        Y9.m("Could not call onAdImpression since setOverrideImpressionRecording is not set to true");
                        return;
                    }
                }
                Y9.m("Adapter called onAdImpression.");
                try {
                    ((InterfaceC1283v9) op.f6525p).q();
                    return;
                } catch (RemoteException e4) {
                    Y9.u("#007 Could not call remote method.", e4);
                    return;
                }
            default:
                return;
        }
    }

    @Override // H1.b
    public void e() {
        int i4 = this.f3846o;
    }

    @Override // H1.b
    public void l() {
        switch (this.f3846o) {
            case 0:
                Op op = (Op) ((l) this.f3848q);
                op.getClass();
                y.d("#008 Must be called on the main UI thread.");
                Y9.m("Adapter called onAdOpened.");
                try {
                    ((InterfaceC1283v9) op.f6525p).o();
                    return;
                } catch (RemoteException e4) {
                    Y9.u("#007 Could not call remote method.", e4);
                    return;
                }
            default:
                return;
        }
    }
}
