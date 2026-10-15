package O1;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.AdActivity;
import com.google.android.gms.internal.ads.AbstractBinderC1161sa;
import com.google.android.gms.internal.ads.AbstractBinderC1290va;
import com.google.android.gms.internal.ads.AbstractC1066q6;
import com.google.android.gms.internal.ads.AbstractC1192t4;
import com.google.android.gms.internal.ads.AbstractC1230u;
import com.google.android.gms.internal.ads.C0275Ga;
import com.google.android.gms.internal.ads.C1118ra;
import com.google.android.gms.internal.ads.C1247ua;
import com.google.android.gms.internal.ads.C1464zc;
import com.google.android.gms.internal.ads.InterfaceC0280Ha;
import com.google.android.gms.internal.ads.InterfaceC1204ta;
import com.google.android.gms.internal.ads.InterfaceC1333wa;
import com.google.android.gms.internal.ads.Y9;
import n2.BinderC1813b;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: O1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0053b extends AbstractC0079o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdActivity f1346b;
    public final /* synthetic */ C0077n c;

    public C0053b(C0077n c0077n, AdActivity adActivity) {
        this.c = c0077n;
        this.f1346b = adActivity;
    }

    @Override // O1.AbstractC0079o
    public final /* bridge */ /* synthetic */ Object a() {
        C0077n.d(this.f1346b, "ad_overlay");
        return null;
    }

    @Override // O1.AbstractC0079o
    public final Object b(Q q4) {
        return q4.I(new BinderC1813b(this.f1346b));
    }

    @Override // O1.AbstractC0079o
    public final Object c() {
        IInterface c1247ua;
        AdActivity adActivity = this.f1346b;
        AbstractC1066q6.a(adActivity);
        boolean booleanValue = ((Boolean) r.d.c.a(AbstractC1066q6.b9)).booleanValue();
        C0077n c0077n = this.c;
        if (!booleanValue) {
            H0 h02 = (H0) c0077n.f1372s;
            try {
                BinderC1813b binderC1813b = new BinderC1813b(adActivity);
                C1247ua c1247ua2 = (C1247ua) ((InterfaceC1333wa) h02.h(adActivity));
                Parcel Q3 = c1247ua2.Q();
                AbstractC1192t4.e(Q3, binderC1813b);
                Parcel q12 = c1247ua2.q1(Q3, 1);
                IBinder readStrongBinder = q12.readStrongBinder();
                q12.recycle();
                if (readStrongBinder == null) {
                    return null;
                }
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
                return queryLocalInterface instanceof InterfaceC1204ta ? (InterfaceC1204ta) queryLocalInterface : new C1118ra(readStrongBinder);
            } catch (RemoteException e4) {
                Y9.t("Could not create remote AdOverlay.", e4);
                return null;
            } catch (n2.c e5) {
                Y9.t("Could not create remote AdOverlay.", e5);
                return null;
            }
        }
        try {
            BinderC1813b binderC1813b2 = new BinderC1813b(adActivity);
            try {
                IBinder b4 = AbstractC1230u.J(adActivity).b("com.google.android.gms.ads.ChimeraAdOverlayCreatorImpl");
                int i4 = AbstractBinderC1290va.f11030o;
                if (b4 == null) {
                    c1247ua = null;
                } else {
                    IInterface queryLocalInterface2 = b4.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
                    c1247ua = queryLocalInterface2 instanceof InterfaceC1333wa ? (InterfaceC1333wa) queryLocalInterface2 : new C1247ua(b4);
                }
                C1247ua c1247ua3 = (C1247ua) c1247ua;
                Parcel Q4 = c1247ua3.Q();
                AbstractC1192t4.e(Q4, binderC1813b2);
                Parcel q13 = c1247ua3.q1(Q4, 1);
                IBinder readStrongBinder2 = q13.readStrongBinder();
                q13.recycle();
                int i5 = AbstractBinderC1161sa.f10602o;
                if (readStrongBinder2 == null) {
                    return null;
                }
                IInterface queryLocalInterface3 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
                return queryLocalInterface3 instanceof InterfaceC1204ta ? (InterfaceC1204ta) queryLocalInterface3 : new C1118ra(readStrongBinder2);
            } catch (Exception e6) {
                throw new Exception(e6);
            }
        } catch (RemoteException | C1464zc | NullPointerException e7) {
            InterfaceC0280Ha b5 = C0275Ga.b(adActivity.getApplicationContext());
            c0077n.getClass();
            b5.g("ClientApiBroker.createAdOverlay", e7);
            return null;
        }
    }
}
