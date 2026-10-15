package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.me, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0908me implements InterfaceC1457zB {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9627a;

    /* renamed from: b, reason: collision with root package name */
    public final C0779je f9628b;

    public /* synthetic */ C0908me(C0779je c0779je, int i4) {
        this.f9627a = i4;
        this.f9628b = c0779je;
    }

    @Override // com.google.android.gms.internal.ads.FB
    public final Object c() {
        switch (this.f9627a) {
            case 0:
                WeakReference weakReference = this.f9628b.c;
                AbstractC0587ez.n(weakReference);
                return weakReference;
            case 1:
                return new C0894m6(this.f9628b.f9164b, 1);
            case 2:
                C0779je c0779je = this.f9628b;
                return new I3(new N1.g(c0779je.f9164b, c0779je.f9163a));
            default:
                Q1.N n4 = N1.n.f1204A.c;
                C0779je c0779je2 = this.f9628b;
                String u2 = n4.u(c0779je2.f9164b, c0779je2.f9163a.f4084o);
                AbstractC0587ez.n(u2);
                return u2;
        }
    }
}
