package x2;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractC1106r4;
import com.google.android.gms.internal.measurement.AbstractC1589x;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class C extends AbstractC1106r4 implements D {
    public C(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService", 1);
    }

    @Override // x2.D
    public final void A2(Y0 y02, d1 d1Var) {
        Parcel Q3 = Q();
        AbstractC1589x.c(Q3, y02);
        AbstractC1589x.c(Q3, d1Var);
        L2(Q3, 2);
    }

    @Override // x2.D
    public final void A3(d1 d1Var) {
        Parcel Q3 = Q();
        AbstractC1589x.c(Q3, d1Var);
        L2(Q3, 6);
    }

    @Override // x2.D
    public final List P1(String str, String str2, boolean z4, d1 d1Var) {
        Parcel Q3 = Q();
        Q3.writeString(str);
        Q3.writeString(str2);
        ClassLoader classLoader = AbstractC1589x.f12112a;
        Q3.writeInt(z4 ? 1 : 0);
        AbstractC1589x.c(Q3, d1Var);
        Parcel a02 = a0(Q3, 14);
        ArrayList createTypedArrayList = a02.createTypedArrayList(Y0.CREATOR);
        a02.recycle();
        return createTypedArrayList;
    }

    @Override // x2.D
    public final String U1(d1 d1Var) {
        Parcel Q3 = Q();
        AbstractC1589x.c(Q3, d1Var);
        Parcel a02 = a0(Q3, 11);
        String readString = a02.readString();
        a02.recycle();
        return readString;
    }

    @Override // x2.D
    public final List V0(String str, String str2, String str3, boolean z4) {
        Parcel Q3 = Q();
        Q3.writeString(null);
        Q3.writeString(str2);
        Q3.writeString(str3);
        ClassLoader classLoader = AbstractC1589x.f12112a;
        Q3.writeInt(z4 ? 1 : 0);
        Parcel a02 = a0(Q3, 15);
        ArrayList createTypedArrayList = a02.createTypedArrayList(Y0.CREATOR);
        a02.recycle();
        return createTypedArrayList;
    }

    @Override // x2.D
    public final List Y1(String str, String str2, String str3) {
        Parcel Q3 = Q();
        Q3.writeString(null);
        Q3.writeString(str2);
        Q3.writeString(str3);
        Parcel a02 = a0(Q3, 17);
        ArrayList createTypedArrayList = a02.createTypedArrayList(C2065c.CREATOR);
        a02.recycle();
        return createTypedArrayList;
    }

    @Override // x2.D
    public final void a3(Bundle bundle, d1 d1Var) {
        Parcel Q3 = Q();
        AbstractC1589x.c(Q3, bundle);
        AbstractC1589x.c(Q3, d1Var);
        L2(Q3, 19);
    }

    @Override // x2.D
    public final void b2(d1 d1Var) {
        Parcel Q3 = Q();
        AbstractC1589x.c(Q3, d1Var);
        L2(Q3, 20);
    }

    @Override // x2.D
    public final byte[] e1(C2096s c2096s, String str) {
        Parcel Q3 = Q();
        AbstractC1589x.c(Q3, c2096s);
        Q3.writeString(str);
        Parcel a02 = a0(Q3, 9);
        byte[] createByteArray = a02.createByteArray();
        a02.recycle();
        return createByteArray;
    }

    @Override // x2.D
    public final void s3(C2096s c2096s, d1 d1Var) {
        Parcel Q3 = Q();
        AbstractC1589x.c(Q3, c2096s);
        AbstractC1589x.c(Q3, d1Var);
        L2(Q3, 1);
    }

    @Override // x2.D
    public final void u0(long j4, String str, String str2, String str3) {
        Parcel Q3 = Q();
        Q3.writeLong(j4);
        Q3.writeString(str);
        Q3.writeString(str2);
        Q3.writeString(str3);
        L2(Q3, 10);
    }

    @Override // x2.D
    public final List w0(String str, String str2, d1 d1Var) {
        Parcel Q3 = Q();
        Q3.writeString(str);
        Q3.writeString(str2);
        AbstractC1589x.c(Q3, d1Var);
        Parcel a02 = a0(Q3, 16);
        ArrayList createTypedArrayList = a02.createTypedArrayList(C2065c.CREATOR);
        a02.recycle();
        return createTypedArrayList;
    }

    @Override // x2.D
    public final void y0(C2065c c2065c, d1 d1Var) {
        Parcel Q3 = Q();
        AbstractC1589x.c(Q3, c2065c);
        AbstractC1589x.c(Q3, d1Var);
        L2(Q3, 12);
    }

    @Override // x2.D
    public final void y1(d1 d1Var) {
        Parcel Q3 = Q();
        AbstractC1589x.c(Q3, d1Var);
        L2(Q3, 18);
    }

    @Override // x2.D
    public final void z3(d1 d1Var) {
        Parcel Q3 = Q();
        AbstractC1589x.c(Q3, d1Var);
        L2(Q3, 4);
    }
}
