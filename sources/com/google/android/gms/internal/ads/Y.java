package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Y implements Bh {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f7723o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f7724p;

    public /* synthetic */ Y(int i4, boolean z4) {
        this.f7723o = i4;
        this.f7724p = z4;
    }

    public synchronized void a() {
        boolean z4 = false;
        while (!this.f7724p) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z4 = true;
            }
        }
        if (z4) {
            Thread.currentThread().interrupt();
        }
    }

    public synchronized void b() {
        this.f7724p = false;
    }

    public synchronized boolean c() {
        if (this.f7724p) {
            return false;
        }
        this.f7724p = true;
        notifyAll();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.Bh
    /* renamed from: l */
    public void mo3l(Object obj) {
        InterfaceC1426yh interfaceC1426yh = (InterfaceC1426yh) obj;
        switch (this.f7723o) {
            case 1:
                interfaceC1426yh.B(this.f7724p);
                return;
            default:
                interfaceC1426yh.n0(this.f7724p);
                return;
        }
    }
}
