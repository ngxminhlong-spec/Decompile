package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final /* synthetic */ class K8 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f5991o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ M8 f5992p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ String f5993q;

    public /* synthetic */ K8(M8 m8, String str, int i4) {
        this.f5991o = i4;
        this.f5992p = m8;
        this.f5993q = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5991o) {
            case 0:
                this.f5992p.f6219o.f7165o.loadUrl(this.f5993q);
                return;
            case 1:
                this.f5992p.f6219o.o(this.f5993q);
                return;
            case 2:
                this.f5992p.f6219o.f7165o.loadData(this.f5993q, "text/html", "UTF-8");
                return;
            default:
                this.f5992p.f6219o.f7165o.loadData(this.f5993q, "text/html", "UTF-8");
                return;
        }
    }
}
