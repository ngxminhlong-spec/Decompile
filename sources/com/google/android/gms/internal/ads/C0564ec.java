package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import n2.InterfaceC1812a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.ec, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0564ec extends AbstractC1106r4 implements InterfaceC0650gc {
    public C0564ec(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGenerator", 0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0650gc
    public final void E0(InterfaceC1812a interfaceC1812a, C0820kc c0820kc, InterfaceC0522dc interfaceC0522dc) {
        Parcel Q3 = Q();
        AbstractC1192t4.e(Q3, interfaceC1812a);
        AbstractC1192t4.c(Q3, c0820kc);
        AbstractC1192t4.e(Q3, interfaceC0522dc);
        G1(Q3, 1);
    }
}
