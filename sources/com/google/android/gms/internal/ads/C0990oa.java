package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import n2.BinderC1813b;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.oa, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0990oa extends AbstractC1106r4 implements InterfaceC1076qa {
    public final InterfaceC0947na W2(BinderC1813b binderC1813b, BinderC0983o9 binderC0983o9) {
        InterfaceC0947na c0904ma;
        Parcel Q3 = Q();
        AbstractC1192t4.e(Q3, binderC1813b);
        AbstractC1192t4.e(Q3, binderC0983o9);
        Q3.writeInt(234310000);
        Parcel q12 = q1(Q3, 1);
        IBinder readStrongBinder = q12.readStrongBinder();
        if (readStrongBinder == null) {
            c0904ma = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
            c0904ma = queryLocalInterface instanceof InterfaceC0947na ? (InterfaceC0947na) queryLocalInterface : new C0904ma(readStrongBinder);
        }
        q12.recycle();
        return c0904ma;
    }
}
