package com.google.android.gms.internal.ads;

import O1.InterfaceC0074l0;
import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Cn implements InterfaceC0740ih {

    /* renamed from: o, reason: collision with root package name */
    public final AtomicReference f4544o = new AtomicReference();

    @Override // com.google.android.gms.internal.ads.InterfaceC0740ih
    public final void o(O1.Y0 y02) {
        Object obj = this.f4544o.get();
        if (obj == null) {
            return;
        }
        try {
            ((InterfaceC0074l0) obj).D3(y02);
        } catch (RemoteException e4) {
            Y9.u("#007 Could not call remote method.", e4);
        } catch (NullPointerException e5) {
            Y9.t("NullPointerException occurs when invoking a method from a delegating listener.", e5);
        }
    }
}
