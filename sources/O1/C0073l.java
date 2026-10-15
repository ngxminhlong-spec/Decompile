package O1;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.google.android.gms.internal.ads.AbstractBinderC1238u7;
import com.google.android.gms.internal.ads.AbstractBinderC1367x7;
import com.google.android.gms.internal.ads.AbstractC1066q6;
import com.google.android.gms.internal.ads.AbstractC1192t4;
import com.google.android.gms.internal.ads.AbstractC1230u;
import com.google.android.gms.internal.ads.C0275Ga;
import com.google.android.gms.internal.ads.C1195t7;
import com.google.android.gms.internal.ads.C1324w7;
import com.google.android.gms.internal.ads.C1464zc;
import com.google.android.gms.internal.ads.InterfaceC0280Ha;
import com.google.android.gms.internal.ads.InterfaceC1281v7;
import com.google.android.gms.internal.ads.InterfaceC1410y7;
import com.google.android.gms.internal.ads.Y9;
import n2.BinderC1813b;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: O1.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0073l extends AbstractC0079o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ V1.e f1365b;
    public final /* synthetic */ FrameLayout c;
    public final /* synthetic */ Context d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0077n f1366e;

    public C0073l(C0077n c0077n, V1.e eVar, FrameLayout frameLayout, Context context) {
        this.f1366e = c0077n;
        this.f1365b = eVar;
        this.c = frameLayout;
        this.d = context;
    }

    @Override // O1.AbstractC0079o
    public final Object a() {
        C0077n.d(this.d, "native_ad_view_delegate");
        return new AbstractBinderC1238u7();
    }

    @Override // O1.AbstractC0079o
    public final Object b(Q q4) {
        return q4.w1(new BinderC1813b(this.f1365b), new BinderC1813b(this.c));
    }

    @Override // O1.AbstractC0079o
    public final Object c() {
        IInterface c1324w7;
        Context context = this.d;
        AbstractC1066q6.a(context);
        boolean booleanValue = ((Boolean) r.d.c.a(AbstractC1066q6.b9)).booleanValue();
        FrameLayout frameLayout = this.c;
        V1.e eVar = this.f1365b;
        C0077n c0077n = this.f1366e;
        if (!booleanValue) {
            H0 h02 = (H0) c0077n.f1371r;
            try {
                BinderC1813b binderC1813b = new BinderC1813b(context);
                BinderC1813b binderC1813b2 = new BinderC1813b(eVar);
                BinderC1813b binderC1813b3 = new BinderC1813b(frameLayout);
                C1324w7 c1324w72 = (C1324w7) ((InterfaceC1410y7) h02.h(context));
                Parcel Q3 = c1324w72.Q();
                AbstractC1192t4.e(Q3, binderC1813b);
                AbstractC1192t4.e(Q3, binderC1813b2);
                AbstractC1192t4.e(Q3, binderC1813b3);
                Q3.writeInt(234310000);
                Parcel q12 = c1324w72.q1(Q3, 1);
                IBinder readStrongBinder = q12.readStrongBinder();
                q12.recycle();
                if (readStrongBinder == null) {
                    return null;
                }
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
                return queryLocalInterface instanceof InterfaceC1281v7 ? (InterfaceC1281v7) queryLocalInterface : new C1195t7(readStrongBinder);
            } catch (RemoteException e4) {
                e = e4;
                Y9.t("Could not create remote NativeAdViewDelegate.", e);
                return null;
            } catch (n2.c e5) {
                e = e5;
                Y9.t("Could not create remote NativeAdViewDelegate.", e);
                return null;
            }
        }
        try {
            BinderC1813b binderC1813b4 = new BinderC1813b(context);
            BinderC1813b binderC1813b5 = new BinderC1813b(eVar);
            BinderC1813b binderC1813b6 = new BinderC1813b(frameLayout);
            try {
                IBinder b4 = AbstractC1230u.J(context).b("com.google.android.gms.ads.ChimeraNativeAdViewDelegateCreatorImpl");
                int i4 = AbstractBinderC1367x7.f11242o;
                if (b4 == null) {
                    c1324w7 = null;
                } else {
                    IInterface queryLocalInterface2 = b4.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
                    c1324w7 = queryLocalInterface2 instanceof InterfaceC1410y7 ? (InterfaceC1410y7) queryLocalInterface2 : new C1324w7(b4);
                }
                C1324w7 c1324w73 = (C1324w7) c1324w7;
                Parcel Q4 = c1324w73.Q();
                AbstractC1192t4.e(Q4, binderC1813b4);
                AbstractC1192t4.e(Q4, binderC1813b5);
                AbstractC1192t4.e(Q4, binderC1813b6);
                Q4.writeInt(234310000);
                Parcel q13 = c1324w73.q1(Q4, 1);
                IBinder readStrongBinder2 = q13.readStrongBinder();
                q13.recycle();
                int i5 = AbstractBinderC1238u7.f10780o;
                if (readStrongBinder2 == null) {
                    return null;
                }
                IInterface queryLocalInterface3 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
                return queryLocalInterface3 instanceof InterfaceC1281v7 ? (InterfaceC1281v7) queryLocalInterface3 : new C1195t7(readStrongBinder2);
            } catch (Exception e6) {
                throw new Exception(e6);
            }
        } catch (RemoteException | C1464zc | NullPointerException e7) {
            InterfaceC0280Ha b5 = C0275Ga.b(context);
            c0077n.getClass();
            b5.g("ClientApiBroker.createNativeAdViewDelegate", e7);
            return null;
        }
    }
}
