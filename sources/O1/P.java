package O1;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractBinderC0607fc;
import com.google.android.gms.internal.ads.AbstractBinderC1119rb;
import com.google.android.gms.internal.ads.AbstractBinderC1161sa;
import com.google.android.gms.internal.ads.AbstractBinderC1238u7;
import com.google.android.gms.internal.ads.AbstractC1106r4;
import com.google.android.gms.internal.ads.AbstractC1192t4;
import com.google.android.gms.internal.ads.BinderC0489cm;
import com.google.android.gms.internal.ads.C0564ec;
import com.google.android.gms.internal.ads.C0904ma;
import com.google.android.gms.internal.ads.C1077qb;
import com.google.android.gms.internal.ads.C1118ra;
import com.google.android.gms.internal.ads.C1195t7;
import com.google.android.gms.internal.ads.InterfaceC0650gc;
import com.google.android.gms.internal.ads.InterfaceC0947na;
import com.google.android.gms.internal.ads.InterfaceC1069q9;
import com.google.android.gms.internal.ads.InterfaceC1162sb;
import com.google.android.gms.internal.ads.InterfaceC1204ta;
import com.google.android.gms.internal.ads.InterfaceC1281v7;
import n2.InterfaceC1812a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class P extends AbstractC1106r4 implements Q {
    @Override // O1.Q
    public final F A1(InterfaceC1812a interfaceC1812a, String str, InterfaceC1069q9 interfaceC1069q9, int i4) {
        F d;
        Parcel Q3 = Q();
        AbstractC1192t4.e(Q3, interfaceC1812a);
        Q3.writeString(str);
        AbstractC1192t4.e(Q3, interfaceC1069q9);
        Q3.writeInt(234310000);
        Parcel q12 = q1(Q3, 3);
        IBinder readStrongBinder = q12.readStrongBinder();
        if (readStrongBinder == null) {
            d = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            d = queryLocalInterface instanceof F ? (F) queryLocalInterface : new D(readStrongBinder);
        }
        q12.recycle();
        return d;
    }

    @Override // O1.Q
    public final InterfaceC1162sb E1(InterfaceC1812a interfaceC1812a, String str, InterfaceC1069q9 interfaceC1069q9, int i4) {
        InterfaceC1162sb c1077qb;
        Parcel Q3 = Q();
        AbstractC1192t4.e(Q3, interfaceC1812a);
        Q3.writeString(str);
        AbstractC1192t4.e(Q3, interfaceC1069q9);
        Q3.writeInt(234310000);
        Parcel q12 = q1(Q3, 12);
        IBinder readStrongBinder = q12.readStrongBinder();
        int i5 = AbstractBinderC1119rb.f10476o;
        if (readStrongBinder == null) {
            c1077qb = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
            c1077qb = queryLocalInterface instanceof InterfaceC1162sb ? (InterfaceC1162sb) queryLocalInterface : new C1077qb(readStrongBinder);
        }
        q12.recycle();
        return c1077qb;
    }

    @Override // O1.Q
    public final InterfaceC1204ta I(InterfaceC1812a interfaceC1812a) {
        InterfaceC1204ta c1118ra;
        Parcel Q3 = Q();
        AbstractC1192t4.e(Q3, interfaceC1812a);
        Parcel q12 = q1(Q3, 8);
        IBinder readStrongBinder = q12.readStrongBinder();
        int i4 = AbstractBinderC1161sa.f10602o;
        if (readStrongBinder == null) {
            c1118ra = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            c1118ra = queryLocalInterface instanceof InterfaceC1204ta ? (InterfaceC1204ta) queryLocalInterface : new C1118ra(readStrongBinder);
        }
        q12.recycle();
        return c1118ra;
    }

    @Override // O1.Q
    public final InterfaceC0947na N2(InterfaceC1812a interfaceC1812a, InterfaceC1069q9 interfaceC1069q9, int i4) {
        InterfaceC0947na c0904ma;
        Parcel Q3 = Q();
        AbstractC1192t4.e(Q3, interfaceC1812a);
        AbstractC1192t4.e(Q3, interfaceC1069q9);
        Q3.writeInt(234310000);
        Parcel q12 = q1(Q3, 15);
        IBinder readStrongBinder = q12.readStrongBinder();
        int i5 = BinderC0489cm.f8399v;
        if (readStrongBinder == null) {
            c0904ma = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
            c0904ma = queryLocalInterface instanceof InterfaceC0947na ? (InterfaceC0947na) queryLocalInterface : new C0904ma(readStrongBinder);
        }
        q12.recycle();
        return c0904ma;
    }

    @Override // O1.Q
    public final J P0(InterfaceC1812a interfaceC1812a, X0 x02, String str, InterfaceC1069q9 interfaceC1069q9, int i4) {
        J h4;
        Parcel Q3 = Q();
        AbstractC1192t4.e(Q3, interfaceC1812a);
        AbstractC1192t4.c(Q3, x02);
        Q3.writeString(str);
        AbstractC1192t4.e(Q3, interfaceC1069q9);
        Q3.writeInt(234310000);
        Parcel q12 = q1(Q3, 2);
        IBinder readStrongBinder = q12.readStrongBinder();
        if (readStrongBinder == null) {
            h4 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            h4 = queryLocalInterface instanceof J ? (J) queryLocalInterface : new H(readStrongBinder);
        }
        q12.recycle();
        return h4;
    }

    @Override // O1.Q
    public final InterfaceC0078n0 a1(InterfaceC1812a interfaceC1812a, InterfaceC1069q9 interfaceC1069q9, int i4) {
        InterfaceC0078n0 c0076m0;
        Parcel Q3 = Q();
        AbstractC1192t4.e(Q3, interfaceC1812a);
        AbstractC1192t4.e(Q3, interfaceC1069q9);
        Q3.writeInt(234310000);
        Parcel q12 = q1(Q3, 17);
        IBinder readStrongBinder = q12.readStrongBinder();
        if (readStrongBinder == null) {
            c0076m0 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTester");
            c0076m0 = queryLocalInterface instanceof InterfaceC0078n0 ? (InterfaceC0078n0) queryLocalInterface : new C0076m0(readStrongBinder);
        }
        q12.recycle();
        return c0076m0;
    }

    @Override // O1.Q
    public final InterfaceC0052a0 e0(InterfaceC1812a interfaceC1812a, int i4) {
        InterfaceC0052a0 y;
        Parcel Q3 = Q();
        AbstractC1192t4.e(Q3, interfaceC1812a);
        Q3.writeInt(234310000);
        Parcel q12 = q1(Q3, 9);
        IBinder readStrongBinder = q12.readStrongBinder();
        if (readStrongBinder == null) {
            y = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            y = queryLocalInterface instanceof InterfaceC0052a0 ? (InterfaceC0052a0) queryLocalInterface : new Y(readStrongBinder);
        }
        q12.recycle();
        return y;
    }

    @Override // O1.Q
    public final J k1(InterfaceC1812a interfaceC1812a, X0 x02, String str, int i4) {
        J h4;
        Parcel Q3 = Q();
        AbstractC1192t4.e(Q3, interfaceC1812a);
        AbstractC1192t4.c(Q3, x02);
        Q3.writeString(str);
        Q3.writeInt(234310000);
        Parcel q12 = q1(Q3, 10);
        IBinder readStrongBinder = q12.readStrongBinder();
        if (readStrongBinder == null) {
            h4 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            h4 = queryLocalInterface instanceof J ? (J) queryLocalInterface : new H(readStrongBinder);
        }
        q12.recycle();
        return h4;
    }

    @Override // O1.Q
    public final J o2(InterfaceC1812a interfaceC1812a, X0 x02, String str, InterfaceC1069q9 interfaceC1069q9, int i4) {
        J h4;
        Parcel Q3 = Q();
        AbstractC1192t4.e(Q3, interfaceC1812a);
        AbstractC1192t4.c(Q3, x02);
        Q3.writeString(str);
        AbstractC1192t4.e(Q3, interfaceC1069q9);
        Q3.writeInt(234310000);
        Parcel q12 = q1(Q3, 13);
        IBinder readStrongBinder = q12.readStrongBinder();
        if (readStrongBinder == null) {
            h4 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            h4 = queryLocalInterface instanceof J ? (J) queryLocalInterface : new H(readStrongBinder);
        }
        q12.recycle();
        return h4;
    }

    @Override // O1.Q
    public final InterfaceC0650gc t2(InterfaceC1812a interfaceC1812a, InterfaceC1069q9 interfaceC1069q9, int i4) {
        InterfaceC0650gc c0564ec;
        Parcel Q3 = Q();
        AbstractC1192t4.e(Q3, interfaceC1812a);
        AbstractC1192t4.e(Q3, interfaceC1069q9);
        Q3.writeInt(234310000);
        Parcel q12 = q1(Q3, 14);
        IBinder readStrongBinder = q12.readStrongBinder();
        int i5 = AbstractBinderC0607fc.f8706o;
        if (readStrongBinder == null) {
            c0564ec = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
            c0564ec = queryLocalInterface instanceof InterfaceC0650gc ? (InterfaceC0650gc) queryLocalInterface : new C0564ec(readStrongBinder);
        }
        q12.recycle();
        return c0564ec;
    }

    @Override // O1.Q
    public final InterfaceC1281v7 w1(InterfaceC1812a interfaceC1812a, InterfaceC1812a interfaceC1812a2) {
        InterfaceC1281v7 c1195t7;
        Parcel Q3 = Q();
        AbstractC1192t4.e(Q3, interfaceC1812a);
        AbstractC1192t4.e(Q3, interfaceC1812a2);
        Parcel q12 = q1(Q3, 5);
        IBinder readStrongBinder = q12.readStrongBinder();
        int i4 = AbstractBinderC1238u7.f10780o;
        if (readStrongBinder == null) {
            c1195t7 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
            c1195t7 = queryLocalInterface instanceof InterfaceC1281v7 ? (InterfaceC1281v7) queryLocalInterface : new C1195t7(readStrongBinder);
        }
        q12.recycle();
        return c1195t7;
    }

    @Override // O1.Q
    public final J x3(InterfaceC1812a interfaceC1812a, X0 x02, String str, InterfaceC1069q9 interfaceC1069q9, int i4) {
        J h4;
        Parcel Q3 = Q();
        AbstractC1192t4.e(Q3, interfaceC1812a);
        AbstractC1192t4.c(Q3, x02);
        Q3.writeString(str);
        AbstractC1192t4.e(Q3, interfaceC1069q9);
        Q3.writeInt(234310000);
        Parcel q12 = q1(Q3, 1);
        IBinder readStrongBinder = q12.readStrongBinder();
        if (readStrongBinder == null) {
            h4 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            h4 = queryLocalInterface instanceof J ? (J) queryLocalInterface : new H(readStrongBinder);
        }
        q12.recycle();
        return h4;
    }
}
