package com.google.android.gms.internal.ads;

import O1.InterfaceC0089t0;
import android.view.View;
import android.widget.FrameLayout;
import b0.RunnableC0203p;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Of extends Ff {

    /* renamed from: j, reason: collision with root package name */
    public final P7 f6480j;

    /* renamed from: k, reason: collision with root package name */
    public final RunnableC0801k f6481k;

    /* renamed from: l, reason: collision with root package name */
    public final Executor f6482l;

    public Of(C1151s6 c1151s6, P7 p7, RunnableC0801k runnableC0801k, Executor executor) {
        super(c1151s6);
        this.f6480j = p7;
        this.f6481k = runnableC0801k;
        this.f6482l = executor;
    }

    @Override // com.google.android.gms.internal.ads.Yf
    public final void a() {
        this.f6482l.execute(new RunnableC0203p(20, this, new D3(20, new AtomicReference(this.f6481k))));
    }

    @Override // com.google.android.gms.internal.ads.Ff
    public final int b() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.Ff
    public final View c() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.Ff
    public final InterfaceC0089t0 d() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.Ff
    public final C1477zp e() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.Ff
    public final C1477zp f() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.Ff
    public final void g() {
    }

    @Override // com.google.android.gms.internal.ads.Ff
    public final void h(FrameLayout frameLayout, O1.X0 x02) {
    }
}
