package com.google.android.gms.internal.ads;

import O1.InterfaceC0089t0;
import android.content.Context;
import android.os.RemoteException;
import n2.BinderC1813b;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.ym, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1431ym implements Xf, InterfaceC0570ei {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C0873lm f11460o;

    public /* synthetic */ C1431ym(C0873lm c0873lm) {
        this.f11460o = c0873lm;
    }

    @Override // com.google.android.gms.internal.ads.Xf, com.google.android.gms.internal.ads.Ls
    public InterfaceC0089t0 b() {
        try {
            return ((V9) this.f11460o.f9463b).a();
        } catch (RemoteException e4) {
            throw new Exception(e4);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0570ei
    public void j(boolean z4, Context context, Og og) {
        Object obj = this.f11460o.f9463b;
        try {
            ((Pp) obj).b(z4);
            try {
                ((Pp) obj).f6603a.n0(new BinderC1813b(context));
            } catch (Throwable th) {
                throw new Exception(th);
            }
        } catch (Kp e4) {
            throw new Exception(e4.getCause());
        }
    }
}
