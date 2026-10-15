package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import n2.InterfaceC1812a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class B7 extends AbstractC1106r4 implements C7 {
    public B7(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd", 0);
    }

    @Override // com.google.android.gms.internal.ads.C7
    public final boolean X(InterfaceC1812a interfaceC1812a) {
        Parcel Q3 = Q();
        AbstractC1192t4.e(Q3, interfaceC1812a);
        Parcel q12 = q1(Q3, 10);
        boolean z4 = q12.readInt() != 0;
        q12.recycle();
        return z4;
    }

    @Override // com.google.android.gms.internal.ads.C7
    public final InterfaceC1812a f() {
        return U.a.o(q1(Q(), 9));
    }

    @Override // com.google.android.gms.internal.ads.C7
    public final boolean f0(InterfaceC1812a interfaceC1812a) {
        Parcel Q3 = Q();
        AbstractC1192t4.e(Q3, interfaceC1812a);
        Parcel q12 = q1(Q3, 17);
        boolean z4 = q12.readInt() != 0;
        q12.recycle();
        return z4;
    }

    @Override // com.google.android.gms.internal.ads.C7
    public final String g() {
        Parcel q12 = q1(Q(), 4);
        String readString = q12.readString();
        q12.recycle();
        return readString;
    }
}
