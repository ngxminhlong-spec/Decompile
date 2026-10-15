package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Ag implements InterfaceC1457zB {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3970a;

    /* renamed from: b, reason: collision with root package name */
    public final C1468zg f3971b;
    public final FB c;

    public /* synthetic */ Ag(C1468zg c1468zg, FB fb, int i4) {
        this.f3970a = i4;
        this.f3971b = c1468zg;
        this.c = fb;
    }

    @Override // com.google.android.gms.internal.ads.FB
    public final Object c() {
        switch (this.f3970a) {
            case 0:
                String str = (String) this.c.c();
                C0959nm c0959nm = this.f3971b.f11623f;
                return c0959nm != null ? c0959nm : new C0959nm(str);
            default:
                ((C0865le) this.c).a();
                Context context = this.f3971b.f11620a;
                AbstractC0587ez.n(context);
                return context;
        }
    }
}
