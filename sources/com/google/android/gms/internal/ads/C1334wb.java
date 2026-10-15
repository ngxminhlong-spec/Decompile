package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import n2.BinderC1813b;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.wb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1334wb extends AbstractC1106r4 {
    public final IBinder W2(BinderC1813b binderC1813b, String str, BinderC0983o9 binderC0983o9) {
        Parcel Q3 = Q();
        AbstractC1192t4.e(Q3, binderC1813b);
        Q3.writeString(str);
        AbstractC1192t4.e(Q3, binderC0983o9);
        Q3.writeInt(234310000);
        Parcel q12 = q1(Q3, 1);
        IBinder readStrongBinder = q12.readStrongBinder();
        q12.recycle();
        return readStrongBinder;
    }
}
