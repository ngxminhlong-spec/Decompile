package com.google.android.gms.internal.ads;

import O1.InterfaceC0051a;
import O1.InterfaceC0090u;
import android.os.RemoteException;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Dn implements InterfaceC0051a, Sh {

    /* renamed from: o, reason: collision with root package name */
    public InterfaceC0090u f4786o;

    @Override // O1.InterfaceC0051a
    public final synchronized void D() {
        InterfaceC0090u interfaceC0090u = this.f4786o;
        if (interfaceC0090u != null) {
            try {
                interfaceC0090u.c();
            } catch (RemoteException e4) {
                Y9.t("Remote Exception at onAdClicked.", e4);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.Sh
    public final synchronized void G0() {
        InterfaceC0090u interfaceC0090u = this.f4786o;
        if (interfaceC0090u != null) {
            try {
                interfaceC0090u.c();
            } catch (RemoteException e4) {
                Y9.t("Remote Exception at onPhysicalClick.", e4);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.Sh
    public final synchronized void u() {
    }
}
