package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.ui, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1255ui implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f10919o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C1427yi f10920p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ AbstractBinderC1149s4 f10921q;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ RunnableC1255ui(C1427yi c1427yi, Ui ui, int i4) {
        this.f10919o = i4;
        switch (i4) {
            case 1:
                this.f10920p = c1427yi;
                this.f10921q = (AbstractBinderC1149s4) ui;
                return;
            default:
                this.f10920p = c1427yi;
                this.f10921q = (AbstractBinderC1149s4) ui;
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.gms.internal.ads.Ui, com.google.android.gms.internal.ads.s4] */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.gms.internal.ads.Ui, com.google.android.gms.internal.ads.s4] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10919o) {
            case 0:
                this.f10920p.v(this.f10921q);
                return;
            default:
                this.f10920p.w(this.f10921q);
                return;
        }
    }
}
