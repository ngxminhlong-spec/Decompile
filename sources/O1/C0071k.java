package O1;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.duracodefactory.logiccircuitsimulatorpro.MainActivity;
import com.google.android.gms.internal.ads.AbstractC1066q6;
import com.google.android.gms.internal.ads.AbstractC1192t4;
import com.google.android.gms.internal.ads.AbstractC1230u;
import com.google.android.gms.internal.ads.C0275Ga;
import com.google.android.gms.internal.ads.C1464zc;
import com.google.android.gms.internal.ads.InterfaceC0280Ha;
import com.google.android.gms.internal.ads.Y9;
import n2.BinderC1813b;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: O1.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0071k extends AbstractC0079o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MainActivity f1364b;
    public final /* synthetic */ C0077n c;

    public C0071k(C0077n c0077n, MainActivity mainActivity) {
        this.c = c0077n;
        this.f1364b = mainActivity;
    }

    @Override // O1.AbstractC0079o
    public final Object a() {
        C0077n.d(this.f1364b, "mobile_ads_settings");
        return new Z();
    }

    @Override // O1.AbstractC0079o
    public final Object b(Q q4) {
        return q4.e0(new BinderC1813b(this.f1364b), 234310000);
    }

    @Override // O1.AbstractC0079o
    public final Object c() {
        C0054b0 c0054b0;
        MainActivity mainActivity = this.f1364b;
        AbstractC1066q6.a(mainActivity);
        boolean booleanValue = ((Boolean) r.d.c.a(AbstractC1066q6.b9)).booleanValue();
        C0077n c0077n = this.c;
        if (!booleanValue) {
            H0 h02 = (H0) c0077n.f1370q;
            try {
                BinderC1813b binderC1813b = new BinderC1813b(mainActivity);
                C0054b0 c0054b02 = (C0054b0) h02.h(mainActivity);
                Parcel Q3 = c0054b02.Q();
                AbstractC1192t4.e(Q3, binderC1813b);
                Q3.writeInt(234310000);
                Parcel q12 = c0054b02.q1(Q3, 1);
                IBinder readStrongBinder = q12.readStrongBinder();
                q12.recycle();
                if (readStrongBinder == null) {
                    return null;
                }
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
                return queryLocalInterface instanceof InterfaceC0052a0 ? (InterfaceC0052a0) queryLocalInterface : new Y(readStrongBinder);
            } catch (RemoteException e4) {
                e = e4;
                Y9.t("Could not get remote MobileAdsSettingManager.", e);
                return null;
            } catch (n2.c e5) {
                e = e5;
                Y9.t("Could not get remote MobileAdsSettingManager.", e);
                return null;
            }
        }
        try {
            BinderC1813b binderC1813b2 = new BinderC1813b(mainActivity);
            try {
                IBinder b4 = AbstractC1230u.J(mainActivity).b("com.google.android.gms.ads.ChimeraMobileAdsSettingManagerCreatorImpl");
                if (b4 == null) {
                    c0054b0 = null;
                } else {
                    IInterface queryLocalInterface2 = b4.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
                    c0054b0 = queryLocalInterface2 instanceof C0054b0 ? (C0054b0) queryLocalInterface2 : new C0054b0(b4);
                }
                Parcel Q4 = c0054b0.Q();
                AbstractC1192t4.e(Q4, binderC1813b2);
                Q4.writeInt(234310000);
                Parcel q13 = c0054b0.q1(Q4, 1);
                IBinder readStrongBinder2 = q13.readStrongBinder();
                q13.recycle();
                if (readStrongBinder2 == null) {
                    return null;
                }
                IInterface queryLocalInterface3 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
                return queryLocalInterface3 instanceof InterfaceC0052a0 ? (InterfaceC0052a0) queryLocalInterface3 : new Y(readStrongBinder2);
            } catch (Exception e6) {
                throw new Exception(e6);
            }
        } catch (RemoteException e7) {
            e = e7;
            InterfaceC0280Ha b5 = C0275Ga.b(mainActivity);
            c0077n.getClass();
            b5.g("ClientApiBroker.getMobileAdsSettingsManager", e);
            return null;
        } catch (C1464zc e8) {
            e = e8;
            InterfaceC0280Ha b52 = C0275Ga.b(mainActivity);
            c0077n.getClass();
            b52.g("ClientApiBroker.getMobileAdsSettingsManager", e);
            return null;
        } catch (NullPointerException e9) {
            e = e9;
            InterfaceC0280Ha b522 = C0275Ga.b(mainActivity);
            c0077n.getClass();
            b522.g("ClientApiBroker.getMobileAdsSettingsManager", e);
            return null;
        }
    }
}
