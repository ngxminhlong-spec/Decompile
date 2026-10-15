package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final /* synthetic */ class P8 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f6569o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ M8 f6570p;

    public /* synthetic */ P8(M8 m8, int i4) {
        this.f6569o = i4;
        this.f6570p = m8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6569o) {
            case 0:
                this.f6570p.f6219o.destroy();
                return;
            case 1:
                this.f6570p.f6219o.destroy();
                return;
            default:
                C0469c8 c0469c8 = AbstractC0554e8.f8568j;
                M8 m8 = this.f6570p;
                m8.e("/result", c0469c8);
                m8.f6219o.destroy();
                return;
        }
    }
}
