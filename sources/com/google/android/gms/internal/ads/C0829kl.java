package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import e2.C1664b;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.kl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0829kl extends AbstractC0702hl {

    /* renamed from: u, reason: collision with root package name */
    public String f9316u;

    /* renamed from: v, reason: collision with root package name */
    public int f9317v;

    @Override // h2.InterfaceC1703b
    public final void Q() {
        synchronized (this.f8980p) {
            try {
                if (!this.f8982r) {
                    this.f8982r = true;
                    try {
                        int i4 = this.f9317v;
                        if (i4 == 2) {
                            ((InterfaceC0325Qa) this.f8984t.t()).B2(this.f8983s, new BinderC0616fl(this));
                        } else if (i4 == 3) {
                            ((InterfaceC0325Qa) this.f8984t.t()).v1(this.f9316u, new BinderC0616fl(this));
                        } else {
                            this.f8979o.c(new Xk(1));
                        }
                    } catch (RemoteException | IllegalArgumentException unused) {
                        this.f8979o.c(new Xk(1));
                    } catch (Throwable th) {
                        N1.n.f1204A.f1209g.h("RemoteUrlAndCacheKeyClientTask.onConnected", th);
                        this.f8979o.c(new Xk(1));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0702hl, h2.InterfaceC1704c
    public final void a0(C1664b c1664b) {
        Y9.m("Cannot connect to remote service, fallback to local instance.");
        this.f8979o.c(new Xk(1));
    }
}
