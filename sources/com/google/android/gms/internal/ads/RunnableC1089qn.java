package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.qn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1089qn implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f10402o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C1131rn f10403p;

    public /* synthetic */ RunnableC1089qn(C1131rn c1131rn, int i4) {
        this.f10402o = i4;
        this.f10403p = c1131rn;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10402o) {
            case 0:
                C1131rn c1131rn = this.f10403p;
                synchronized (c1131rn) {
                    c1131rn.f10524b.clear();
                    c1131rn.f10523a.clear();
                    c1131rn.f10525e.clear();
                    c1131rn.d.clear();
                    c1131rn.i();
                    c1131rn.j();
                    c1131rn.g();
                }
                return;
            default:
                C1131rn c1131rn2 = this.f10403p;
                c1131rn2.getClass();
                c1131rn2.f10526f.execute(new RunnableC1089qn(c1131rn2, 0));
                return;
        }
    }
}
