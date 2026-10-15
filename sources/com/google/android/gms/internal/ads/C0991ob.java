package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.ob, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0991ob extends AbstractC1106r4 implements InterfaceC1034pb {
    public C0991ob(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardItem", 0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1034pb
    public final int a() {
        Parcel q12 = q1(Q(), 2);
        int readInt = q12.readInt();
        q12.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1034pb
    public final String d() {
        Parcel q12 = q1(Q(), 1);
        String readString = q12.readString();
        q12.recycle();
        return readString;
    }
}
