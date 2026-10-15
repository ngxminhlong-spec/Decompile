package O1;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.A8;
import com.google.android.gms.internal.ads.AbstractC1106r4;
import com.google.android.gms.internal.ads.AbstractC1192t4;
import com.google.android.gms.internal.ads.C1325w8;
import com.google.android.gms.internal.ads.InterfaceC1069q9;
import java.util.ArrayList;
import java.util.List;
import n2.InterfaceC1812a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Y extends AbstractC1106r4 implements InterfaceC0052a0 {
    public Y(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager", 0);
    }

    @Override // O1.InterfaceC0052a0
    public final void K(String str) {
        Parcel Q3 = Q();
        Q3.writeString(str);
        G1(Q3, 18);
    }

    @Override // O1.InterfaceC0052a0
    public final void X2(String str, InterfaceC1812a interfaceC1812a) {
        Parcel Q3 = Q();
        Q3.writeString(null);
        AbstractC1192t4.e(Q3, interfaceC1812a);
        G1(Q3, 6);
    }

    @Override // O1.InterfaceC0052a0
    public final void g1(A8 a8) {
        Parcel Q3 = Q();
        AbstractC1192t4.e(Q3, a8);
        G1(Q3, 12);
    }

    @Override // O1.InterfaceC0052a0
    public final void g3(P0 p02) {
        Parcel Q3 = Q();
        AbstractC1192t4.c(Q3, p02);
        G1(Q3, 14);
    }

    @Override // O1.InterfaceC0052a0
    public final List h() {
        Parcel q12 = q1(Q(), 13);
        ArrayList createTypedArrayList = q12.createTypedArrayList(C1325w8.CREATOR);
        q12.recycle();
        return createTypedArrayList;
    }

    @Override // O1.InterfaceC0052a0
    public final void k() {
        G1(Q(), 1);
    }

    @Override // O1.InterfaceC0052a0
    public final void p0(InterfaceC1069q9 interfaceC1069q9) {
        Parcel Q3 = Q();
        AbstractC1192t4.e(Q3, interfaceC1069q9);
        G1(Q3, 11);
    }

    @Override // O1.InterfaceC0052a0
    public final void s0(float f4) {
        Parcel Q3 = Q();
        Q3.writeFloat(0.1f);
        G1(Q3, 2);
    }
}
