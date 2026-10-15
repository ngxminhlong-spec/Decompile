package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import n2.InterfaceC1812a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.q7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1067q7 extends AbstractC1106r4 implements InterfaceC1109r7 {
    public C1067q7(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdImage", 0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1109r7
    public final Uri a() {
        Parcel q12 = q1(Q(), 2);
        Uri uri = (Uri) AbstractC1192t4.a(q12, Uri.CREATOR);
        q12.recycle();
        return uri;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1109r7
    public final double c() {
        Parcel q12 = q1(Q(), 3);
        double readDouble = q12.readDouble();
        q12.recycle();
        return readDouble;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1109r7
    public final InterfaceC1812a d() {
        return U.a.o(q1(Q(), 1));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1109r7
    public final int e() {
        Parcel q12 = q1(Q(), 5);
        int readInt = q12.readInt();
        q12.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1109r7
    public final int i() {
        Parcel q12 = q1(Q(), 4);
        int readInt = q12.readInt();
        q12.recycle();
        return readInt;
    }
}
