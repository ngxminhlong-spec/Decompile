package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Bg implements InterfaceC1457zB {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4148a;

    /* renamed from: b, reason: collision with root package name */
    public final C1468zg f4149b;

    public /* synthetic */ Bg(C1468zg c1468zg, int i4) {
        this.f4148a = i4;
        this.f4149b = c1468zg;
    }

    @Override // com.google.android.gms.internal.ads.FB
    public final Object c() {
        switch (this.f4148a) {
            case 0:
                return this.f4149b.c;
            case 1:
                return this.f4149b.d;
            default:
                return this.f4149b.a();
        }
    }
}
