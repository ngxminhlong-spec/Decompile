package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.ArrayList;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.ts, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1222ts extends AbstractRunnableC1008os {

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ IBinder f10755p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ ServiceConnectionC1265us f10756q;

    public C1222ts(ServiceConnectionC1265us serviceConnectionC1265us, IBinder iBinder) {
        this.f10756q = serviceConnectionC1265us;
        this.f10755p = iBinder;
    }

    @Override // com.google.android.gms.internal.ads.AbstractRunnableC1008os
    public final void a() {
        IInterface abstractC1106r4;
        C1308vs c1308vs = this.f10756q.f10951o;
        int i4 = AbstractBinderC0922ms.f9661o;
        int i5 = 0;
        IBinder iBinder = this.f10755p;
        if (iBinder == null) {
            abstractC1106r4 = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.lmd.protocol.ILmdOverlayService");
            abstractC1106r4 = queryLocalInterface instanceof InterfaceC0965ns ? (InterfaceC0965ns) queryLocalInterface : new AbstractC1106r4(iBinder, "com.google.android.play.core.lmd.protocol.ILmdOverlayService", 0);
        }
        c1308vs.f11089m = (InterfaceC0965ns) abstractC1106r4;
        Iv iv = c1308vs.f11080b;
        iv.g("linkToDeath", new Object[0]);
        try {
            c1308vs.f11089m.asBinder().linkToDeath(c1308vs.f11086j, 0);
        } catch (RemoteException e4) {
            iv.f(e4, "linkToDeath failed", new Object[0]);
        }
        c1308vs.f11083g = false;
        ArrayList arrayList = c1308vs.d;
        int size = arrayList.size();
        while (i5 < size) {
            Object obj = arrayList.get(i5);
            i5++;
            ((Runnable) obj).run();
        }
        c1308vs.d.clear();
    }
}
