package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.p9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1026p9 extends AbstractC1106r4 implements InterfaceC1069q9 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v5, types: [com.google.android.gms.internal.ads.s9] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    @Override // com.google.android.gms.internal.ads.InterfaceC1069q9
    public final InterfaceC1154s9 B(String str) {
        ?? r02;
        Parcel Q3 = Q();
        Q3.writeString(str);
        Parcel q12 = q1(Q3, 1);
        IBinder readStrongBinder = q12.readStrongBinder();
        if (readStrongBinder == null) {
            r02 = 0;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            r02 = queryLocalInterface instanceof InterfaceC1154s9 ? (InterfaceC1154s9) queryLocalInterface : new AbstractC1106r4(readStrongBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter", 0);
        }
        q12.recycle();
        return r02;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1069q9
    public final boolean F(String str) {
        Parcel Q3 = Q();
        Q3.writeString(str);
        Parcel q12 = q1(Q3, 4);
        ClassLoader classLoader = AbstractC1192t4.f10673a;
        boolean z4 = q12.readInt() != 0;
        q12.recycle();
        return z4;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1069q9
    public final boolean Y(String str) {
        Parcel Q3 = Q();
        Q3.writeString(str);
        Parcel q12 = q1(Q3, 2);
        ClassLoader classLoader = AbstractC1192t4.f10673a;
        boolean z4 = q12.readInt() != 0;
        q12.recycle();
        return z4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v5, types: [com.google.android.gms.internal.ads.V9] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    @Override // com.google.android.gms.internal.ads.InterfaceC1069q9
    public final V9 y(String str) {
        ?? r02;
        Parcel Q3 = Q();
        Q3.writeString(str);
        Parcel q12 = q1(Q3, 3);
        IBinder readStrongBinder = q12.readStrongBinder();
        int i4 = BinderC0392aa.f8113p;
        if (readStrongBinder == null) {
            r02 = 0;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
            r02 = queryLocalInterface instanceof V9 ? (V9) queryLocalInterface : new AbstractC1106r4(readStrongBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter", 0);
        }
        q12.recycle();
        return r02;
    }
}
