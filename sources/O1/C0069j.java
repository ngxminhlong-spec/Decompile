package O1;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.AbstractC1066q6;
import com.google.android.gms.internal.ads.AbstractC1192t4;
import com.google.android.gms.internal.ads.AbstractC1230u;
import com.google.android.gms.internal.ads.BinderC0983o9;
import com.google.android.gms.internal.ads.C0275Ga;
import com.google.android.gms.internal.ads.C1464zc;
import com.google.android.gms.internal.ads.InterfaceC0280Ha;
import com.google.android.gms.internal.ads.Y9;
import n2.BinderC1813b;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: O1.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0069j extends AbstractC0079o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f1362b;
    public final /* synthetic */ String c;
    public final /* synthetic */ BinderC0983o9 d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0077n f1363e;

    public C0069j(C0077n c0077n, Context context, String str, BinderC0983o9 binderC0983o9) {
        this.f1363e = c0077n;
        this.f1362b = context;
        this.c = str;
        this.d = binderC0983o9;
    }

    @Override // O1.AbstractC0079o
    public final Object a() {
        C0077n.d(this.f1362b, "native_ad");
        return new E();
    }

    @Override // O1.AbstractC0079o
    public final Object b(Q q4) {
        return q4.A1(new BinderC1813b(this.f1362b), this.c, this.d, 234310000);
    }

    @Override // O1.AbstractC0079o
    public final Object c() {
        G g4;
        Context context = this.f1362b;
        AbstractC1066q6.a(context);
        boolean booleanValue = ((Boolean) r.d.c.a(AbstractC1066q6.b9)).booleanValue();
        BinderC0983o9 binderC0983o9 = this.d;
        String str = this.c;
        C0077n c0077n = this.f1363e;
        if (!booleanValue) {
            H0 h02 = (H0) c0077n.f1369p;
            try {
                BinderC1813b binderC1813b = new BinderC1813b(context);
                G g5 = (G) h02.h(context);
                Parcel Q3 = g5.Q();
                AbstractC1192t4.e(Q3, binderC1813b);
                Q3.writeString(str);
                AbstractC1192t4.e(Q3, binderC0983o9);
                Q3.writeInt(234310000);
                Parcel q12 = g5.q1(Q3, 1);
                IBinder readStrongBinder = q12.readStrongBinder();
                q12.recycle();
                if (readStrongBinder == null) {
                    return null;
                }
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                return queryLocalInterface instanceof F ? (F) queryLocalInterface : new D(readStrongBinder);
            } catch (RemoteException e4) {
                e = e4;
                Y9.t("Could not create remote builder for AdLoader.", e);
                return null;
            } catch (n2.c e5) {
                e = e5;
                Y9.t("Could not create remote builder for AdLoader.", e);
                return null;
            }
        }
        try {
            BinderC1813b binderC1813b2 = new BinderC1813b(context);
            try {
                IBinder b4 = AbstractC1230u.J(context).b("com.google.android.gms.ads.ChimeraAdLoaderBuilderCreatorImpl");
                if (b4 == null) {
                    g4 = null;
                } else {
                    IInterface queryLocalInterface2 = b4.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
                    g4 = queryLocalInterface2 instanceof G ? (G) queryLocalInterface2 : new G(b4);
                }
                Parcel Q4 = g4.Q();
                AbstractC1192t4.e(Q4, binderC1813b2);
                Q4.writeString(str);
                AbstractC1192t4.e(Q4, binderC0983o9);
                Q4.writeInt(234310000);
                Parcel q13 = g4.q1(Q4, 1);
                IBinder readStrongBinder2 = q13.readStrongBinder();
                q13.recycle();
                if (readStrongBinder2 == null) {
                    return null;
                }
                IInterface queryLocalInterface3 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                return queryLocalInterface3 instanceof F ? (F) queryLocalInterface3 : new D(readStrongBinder2);
            } catch (Exception e6) {
                throw new Exception(e6);
            }
        } catch (RemoteException e7) {
            e = e7;
            InterfaceC0280Ha b5 = C0275Ga.b(context);
            c0077n.getClass();
            b5.g("ClientApiBroker.createAdLoaderBuilder", e);
            return null;
        } catch (C1464zc e8) {
            e = e8;
            InterfaceC0280Ha b52 = C0275Ga.b(context);
            c0077n.getClass();
            b52.g("ClientApiBroker.createAdLoaderBuilder", e);
            return null;
        } catch (NullPointerException e9) {
            e = e9;
            InterfaceC0280Ha b522 = C0275Ga.b(context);
            c0077n.getClass();
            b522.g("ClientApiBroker.createAdLoaderBuilder", e);
            return null;
        }
    }
}
