package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.Aa, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC0240Aa extends AbstractBinderC1149s4 implements InterfaceC0246Ba {
    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.gms.internal.ads.r4, com.google.android.gms.internal.ads.Ba] */
    public static InterfaceC0246Ba K3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
        return queryLocalInterface instanceof InterfaceC0246Ba ? (InterfaceC0246Ba) queryLocalInterface : new AbstractC1106r4(iBinder, "com.google.android.gms.ads.internal.query.IUpdateUrlsCallback", 0);
    }
}
