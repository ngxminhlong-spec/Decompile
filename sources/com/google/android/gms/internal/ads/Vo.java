package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final /* synthetic */ class Vo implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f7290o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Yo f7291p;

    public /* synthetic */ Vo(Yo yo, int i4) {
        this.f7290o = i4;
        this.f7291p = yo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7290o) {
            case 0:
                this.f7291p.K3(5);
                return;
            default:
                Yo yo = this.f7291p;
                yo.f7888o.a().execute(new Vo(yo, 0));
                return;
        }
    }
}
