package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.k7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0809k7 extends AbstractC1106r4 implements InterfaceC0895m7 {
    public C0809k7(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IAttributionInfo", 0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0895m7
    public final ArrayList f() {
        Parcel q12 = q1(Q(), 3);
        ArrayList readArrayList = q12.readArrayList(AbstractC1192t4.f10673a);
        q12.recycle();
        return readArrayList;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0895m7
    public final String h() {
        Parcel q12 = q1(Q(), 2);
        String readString = q12.readString();
        q12.recycle();
        return readString;
    }
}
