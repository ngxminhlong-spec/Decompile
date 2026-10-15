package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.ac, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0394ac extends AbstractC1106r4 implements InterfaceC0522dc {
    @Override // com.google.android.gms.internal.ads.InterfaceC0522dc
    public final void B(String str) {
        Parcel Q3 = Q();
        Q3.writeString(str);
        G1(Q3, 2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0522dc
    public final void L1(String str, String str2, Bundle bundle) {
        Parcel Q3 = Q();
        Q3.writeString(str);
        Q3.writeString(str2);
        AbstractC1192t4.c(Q3, bundle);
        G1(Q3, 3);
    }
}
