package com.google.android.gms.internal.ads;

import O1.AbstractBinderC0087s0;
import O1.C0091u0;
import android.os.RemoteException;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class C9 extends AbstractBinderC0087s0 {

    /* renamed from: o, reason: collision with root package name */
    public final Object f4407o = new Object();

    /* renamed from: p, reason: collision with root package name */
    public volatile C0091u0 f4408p;

    @Override // O1.InterfaceC0089t0
    public final void D1(C0091u0 c0091u0) {
        synchronized (this.f4407o) {
            this.f4408p = c0091u0;
        }
    }

    @Override // O1.InterfaceC0089t0
    public final void U(boolean z4) {
        throw new RemoteException();
    }

    @Override // O1.InterfaceC0089t0
    public final float a() {
        throw new RemoteException();
    }

    @Override // O1.InterfaceC0089t0
    public final float d() {
        throw new RemoteException();
    }

    @Override // O1.InterfaceC0089t0
    public final int f() {
        throw new RemoteException();
    }

    @Override // O1.InterfaceC0089t0
    public final C0091u0 g() {
        C0091u0 c0091u0;
        synchronized (this.f4407o) {
            c0091u0 = this.f4408p;
        }
        return c0091u0;
    }

    @Override // O1.InterfaceC0089t0
    public final float h() {
        throw new RemoteException();
    }

    @Override // O1.InterfaceC0089t0
    public final void k() {
        throw new RemoteException();
    }

    @Override // O1.InterfaceC0089t0
    public final void l() {
        throw new RemoteException();
    }

    @Override // O1.InterfaceC0089t0
    public final void m() {
        throw new RemoteException();
    }

    @Override // O1.InterfaceC0089t0
    public final boolean n() {
        throw new RemoteException();
    }

    @Override // O1.InterfaceC0089t0
    public final boolean o() {
        throw new RemoteException();
    }

    @Override // O1.InterfaceC0089t0
    public final boolean p() {
        throw new RemoteException();
    }
}
