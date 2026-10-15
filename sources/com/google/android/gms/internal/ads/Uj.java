package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final /* synthetic */ class Uj implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f7172o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Vj f7173p;

    public /* synthetic */ Uj(Vj vj, int i4) {
        this.f7172o = i4;
        this.f7173p = vj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7172o) {
            case 0:
                Vj vj = this.f7173p;
                vj.getClass();
                vj.c.execute(new Uj(vj, 2));
                return;
            case 1:
                this.f7173p.a();
                return;
            default:
                this.f7173p.a();
                return;
        }
    }
}
