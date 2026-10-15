package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.ls, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0879ls extends AbstractC1106r4 implements InterfaceC0965ns {
    @Override // com.google.android.gms.internal.ads.InterfaceC0965ns
    public final void M1(Bundle bundle, BinderC0793js binderC0793js) {
        Parcel Q3 = Q();
        AbstractC1192t4.c(Q3, bundle);
        AbstractC1192t4.e(Q3, binderC0793js);
        C2(Q3, 3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0965ns
    public final void o1(String str, Bundle bundle, BinderC0793js binderC0793js) {
        Parcel Q3 = Q();
        Q3.writeString(str);
        AbstractC1192t4.c(Q3, bundle);
        AbstractC1192t4.e(Q3, binderC0793js);
        C2(Q3, 1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0965ns
    public final void v3(Bundle bundle, BinderC0793js binderC0793js) {
        Parcel Q3 = Q();
        AbstractC1192t4.c(Q3, bundle);
        AbstractC1192t4.e(Q3, binderC0793js);
        C2(Q3, 2);
    }
}
