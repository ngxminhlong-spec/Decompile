package com.google.android.gms.internal.ads;

import O1.AbstractBinderC0087s0;
import O1.C0091u0;
import O1.InterfaceC0089t0;
import android.os.RemoteException;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Bi extends AbstractBinderC0087s0 {

    /* renamed from: o, reason: collision with root package name */
    public final Object f4150o = new Object();

    /* renamed from: p, reason: collision with root package name */
    public final InterfaceC0089t0 f4151p;

    /* renamed from: q, reason: collision with root package name */
    public final B9 f4152q;

    public Bi(InterfaceC0089t0 interfaceC0089t0, B9 b9) {
        this.f4151p = interfaceC0089t0;
        this.f4152q = b9;
    }

    @Override // O1.InterfaceC0089t0
    public final void D1(C0091u0 c0091u0) {
        synchronized (this.f4150o) {
            try {
                InterfaceC0089t0 interfaceC0089t0 = this.f4151p;
                if (interfaceC0089t0 != null) {
                    interfaceC0089t0.D1(c0091u0);
                }
            } catch (Throwable th) {
                throw th;
            }
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
        B9 b9 = this.f4152q;
        if (b9 != null) {
            return b9.h();
        }
        return 0.0f;
    }

    @Override // O1.InterfaceC0089t0
    public final int f() {
        throw new RemoteException();
    }

    @Override // O1.InterfaceC0089t0
    public final C0091u0 g() {
        synchronized (this.f4150o) {
            try {
                InterfaceC0089t0 interfaceC0089t0 = this.f4151p;
                if (interfaceC0089t0 == null) {
                    return null;
                }
                return interfaceC0089t0.g();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // O1.InterfaceC0089t0
    public final float h() {
        B9 b9 = this.f4152q;
        if (b9 != null) {
            return b9.f();
        }
        return 0.0f;
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
