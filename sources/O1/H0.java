package O1;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.AbstractC0287Ic;
import com.google.android.gms.internal.ads.AbstractC1066q6;
import com.google.android.gms.internal.ads.AbstractC1230u;
import com.google.android.gms.internal.ads.C0275Ga;
import com.google.android.gms.internal.ads.C1247ua;
import com.google.android.gms.internal.ads.C1324w7;
import com.google.android.gms.internal.ads.C1464zc;
import com.google.android.gms.internal.ads.InterfaceC1069q9;
import com.google.android.gms.internal.ads.InterfaceC1333wa;
import com.google.android.gms.internal.ads.InterfaceC1410y7;
import com.google.android.gms.internal.ads.Y9;
import n2.BinderC1813b;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class H0 extends AbstractC0287Ic {
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ H0(String str, int i4) {
        super(str);
        this.c = i4;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0287Ic
    public final /* synthetic */ Object g(IBinder iBinder) {
        switch (this.c) {
            case 0:
                if (iBinder == null) {
                    return null;
                }
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
                return queryLocalInterface instanceof C0054b0 ? (C0054b0) queryLocalInterface : new C0054b0(iBinder);
            case 1:
                if (iBinder == null) {
                    return null;
                }
                IInterface queryLocalInterface2 = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
                return queryLocalInterface2 instanceof G ? (G) queryLocalInterface2 : new G(iBinder);
            case 2:
                if (iBinder == null) {
                    return null;
                }
                IInterface queryLocalInterface3 = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
                return queryLocalInterface3 instanceof K ? (K) queryLocalInterface3 : new K(iBinder);
            case 3:
                if (iBinder == null) {
                    return null;
                }
                IInterface queryLocalInterface4 = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
                return queryLocalInterface4 instanceof InterfaceC1410y7 ? (InterfaceC1410y7) queryLocalInterface4 : new C1324w7(iBinder);
            default:
                if (iBinder == null) {
                    return null;
                }
                IInterface queryLocalInterface5 = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
                return queryLocalInterface5 instanceof InterfaceC1333wa ? (InterfaceC1333wa) queryLocalInterface5 : new C1247ua(iBinder);
        }
    }

    public J n(Context context, X0 x02, String str, InterfaceC1069q9 interfaceC1069q9, int i4) {
        K k3;
        X0 x03;
        String str2;
        InterfaceC1069q9 interfaceC1069q92;
        int i5;
        AbstractC1066q6.a(context);
        if (((Boolean) r.d.c.a(AbstractC1066q6.b9)).booleanValue()) {
            try {
                BinderC1813b binderC1813b = new BinderC1813b(context);
                try {
                    IBinder b4 = AbstractC1230u.J(context).b("com.google.android.gms.ads.ChimeraAdManagerCreatorImpl");
                    if (b4 == null) {
                        x03 = x02;
                        str2 = str;
                        interfaceC1069q92 = interfaceC1069q9;
                        i5 = i4;
                        k3 = null;
                    } else {
                        IInterface queryLocalInterface = b4.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
                        k3 = queryLocalInterface instanceof K ? (K) queryLocalInterface : new K(b4);
                        x03 = x02;
                        str2 = str;
                        interfaceC1069q92 = interfaceC1069q9;
                        i5 = i4;
                    }
                    IBinder W22 = k3.W2(binderC1813b, x03, str2, interfaceC1069q92, i5);
                    if (W22 != null) {
                        IInterface queryLocalInterface2 = W22.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
                        return queryLocalInterface2 instanceof J ? (J) queryLocalInterface2 : new H(W22);
                    }
                } catch (Exception e4) {
                    throw new Exception(e4);
                }
            } catch (RemoteException e5) {
                e = e5;
                Exception exc = e;
                C0275Ga.b(context).g("AdManagerCreator.newAdManagerByDynamiteLoader", exc);
                Y9.u("#007 Could not call remote method.", exc);
                return null;
            } catch (C1464zc e6) {
                e = e6;
                Exception exc2 = e;
                C0275Ga.b(context).g("AdManagerCreator.newAdManagerByDynamiteLoader", exc2);
                Y9.u("#007 Could not call remote method.", exc2);
                return null;
            } catch (NullPointerException e7) {
                e = e7;
                Exception exc22 = e;
                C0275Ga.b(context).g("AdManagerCreator.newAdManagerByDynamiteLoader", exc22);
                Y9.u("#007 Could not call remote method.", exc22);
                return null;
            }
        } else {
            try {
                IBinder W23 = ((K) h(context)).W2(new BinderC1813b(context), x02, str, interfaceC1069q9, i4);
                if (W23 != null) {
                    IInterface queryLocalInterface3 = W23.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
                    return queryLocalInterface3 instanceof J ? (J) queryLocalInterface3 : new H(W23);
                }
            } catch (RemoteException e8) {
                e = e8;
                Y9.o("Could not create remote AdManager.", e);
                return null;
            } catch (n2.c e9) {
                e = e9;
                Y9.o("Could not create remote AdManager.", e);
                return null;
            }
        }
        return null;
    }
}
