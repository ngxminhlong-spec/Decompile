package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final /* synthetic */ class BE implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f4050o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ GE f4051p;

    public /* synthetic */ BE(GE ge, int i4) {
        this.f4050o = i4;
        this.f4051p = ge;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4050o) {
            case 0:
                this.f4051p.f5160Q = true;
                return;
            case 1:
                this.f4051p.t();
                return;
            default:
                GE ge = this.f4051p;
                if (ge.f5166W) {
                    return;
                }
                InterfaceC1116rE interfaceC1116rE = ge.f5146B;
                interfaceC1116rE.getClass();
                interfaceC1116rE.a(ge);
                return;
        }
    }
}
