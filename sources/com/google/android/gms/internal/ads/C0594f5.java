package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.f5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0594f5 extends C0272Fc {

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f8677p = 0;

    /* renamed from: q, reason: collision with root package name */
    public final Object f8678q;

    public C0594f5(A2.o oVar) {
        this.f8678q = oVar;
    }

    public C0594f5(Object obj) {
        this.f8678q = obj;
    }

    @Override // com.google.android.gms.internal.ads.C0272Fc, java.util.concurrent.Future
    public boolean cancel(boolean z4) {
        switch (this.f8677p) {
            case 0:
                A2.o.n((A2.o) this.f8678q);
                return this.f5017o.cancel(z4);
            default:
                return super.cancel(z4);
        }
    }

    public void d() {
        b(this.f8678q);
    }
}
