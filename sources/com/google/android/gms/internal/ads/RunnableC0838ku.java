package com.google.android.gms.internal.ads;

import c3.InterfaceFutureC0239a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.ku, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0838ku implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final AbstractC1138ru f9331o;

    /* renamed from: p, reason: collision with root package name */
    public final InterfaceFutureC0239a f9332p;

    public RunnableC0838ku(AbstractC1138ru abstractC1138ru, InterfaceFutureC0239a interfaceFutureC0239a) {
        this.f9331o = abstractC1138ru;
        this.f9332p = interfaceFutureC0239a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f9331o.f10548o != this) {
            return;
        }
        InterfaceFutureC0239a interfaceFutureC0239a = this.f9332p;
        if (AbstractC1138ru.f10546t.e0(this.f9331o, this, AbstractC1138ru.h(interfaceFutureC0239a))) {
            AbstractC1138ru.n(this.f9331o, false);
        }
    }
}
