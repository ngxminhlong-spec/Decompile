package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.df, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0525df implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f8491o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Oq f8492p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ String f8493q;

    public /* synthetic */ RunnableC0525df(Oq oq, String str, int i4) {
        this.f8491o = i4;
        this.f8492p = oq;
        this.f8493q = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8491o) {
            case 0:
                this.f8492p.a(this.f8493q, null);
                return;
            default:
                this.f8492p.c.o(this.f8493q);
                return;
        }
    }
}
