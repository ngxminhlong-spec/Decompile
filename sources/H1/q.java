package H1;

import O1.A0;
import O1.J;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.C0275Ga;
import com.google.android.gms.internal.ads.Y9;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final /* synthetic */ class q implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f882o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ i f883p;

    public /* synthetic */ q(i iVar, int i4) {
        this.f882o = i4;
        this.f883p = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f882o) {
            case 0:
                i iVar = this.f883p;
                try {
                    A0 a02 = iVar.f874o;
                    a02.getClass();
                    try {
                        J j4 = (J) a02.f1259i;
                        if (j4 != null) {
                            j4.z();
                            return;
                        }
                        return;
                    } catch (RemoteException e4) {
                        Y9.u("#007 Could not call remote method.", e4);
                        return;
                    }
                } catch (IllegalStateException e5) {
                    C0275Ga.b(iVar.getContext()).g("BaseAdView.resume", e5);
                    return;
                }
            case 1:
                i iVar2 = this.f883p;
                try {
                    A0 a03 = iVar2.f874o;
                    a03.getClass();
                    try {
                        J j5 = (J) a03.f1259i;
                        if (j5 != null) {
                            j5.w();
                            return;
                        }
                        return;
                    } catch (RemoteException e6) {
                        Y9.u("#007 Could not call remote method.", e6);
                        return;
                    }
                } catch (IllegalStateException e7) {
                    C0275Ga.b(iVar2.getContext()).g("BaseAdView.destroy", e7);
                    return;
                }
            default:
                i iVar3 = this.f883p;
                try {
                    A0 a04 = iVar3.f874o;
                    a04.getClass();
                    try {
                        J j6 = (J) a04.f1259i;
                        if (j6 != null) {
                            j6.n1();
                            return;
                        }
                        return;
                    } catch (RemoteException e8) {
                        Y9.u("#007 Could not call remote method.", e8);
                        return;
                    }
                } catch (IllegalStateException e9) {
                    C0275Ga.b(iVar3.getContext()).g("BaseAdView.pause", e9);
                    return;
                }
        }
    }
}
