package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.vE, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1288vE implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f11023o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C0831kn f11024p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f11025q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C0859lE f11026r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C1074qE f11027s;

    public /* synthetic */ RunnableC1288vE(C0831kn c0831kn, InterfaceC1374xE interfaceC1374xE, C0859lE c0859lE, C1074qE c1074qE, int i4) {
        this.f11023o = i4;
        this.f11024p = c0831kn;
        this.f11025q = interfaceC1374xE;
        this.f11026r = c0859lE;
        this.f11027s = c1074qE;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, com.google.android.gms.internal.ads.xE] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, com.google.android.gms.internal.ads.xE] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, com.google.android.gms.internal.ads.xE] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11023o) {
            case 0:
                this.f11025q.c(0, (C1202tE) this.f11024p.f9319p, this.f11026r, this.f11027s);
                return;
            case 1:
                this.f11025q.n(0, (C1202tE) this.f11024p.f9319p, this.f11026r, this.f11027s);
                return;
            default:
                this.f11025q.h(0, (C1202tE) this.f11024p.f9319p, this.f11026r, this.f11027s);
                return;
        }
    }
}
