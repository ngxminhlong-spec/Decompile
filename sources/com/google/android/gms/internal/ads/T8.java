package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class T8 implements InterfaceC0282Hc, InterfaceC0277Gc {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y8 f7048o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Aq f7049p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Z8 f7050q;

    public /* synthetic */ T8(Z8 z8, Y8 y8, Aq aq) {
        this.f7050q = z8;
        this.f7048o = y8;
        this.f7049p = aq;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0277Gc
    /* renamed from: b */
    public void mo1b() {
        Fq fq;
        Q1.I.w("loadNewJavascriptEngine (failure): Trying to acquire lock");
        synchronized (this.f7050q.c) {
            try {
                Q1.I.w("loadNewJavascriptEngine (failure): Lock acquired");
                this.f7050q.f7965b = 1;
                Q1.I.w("Failed loading new engine. Marking new engine destroyable.");
                this.f7048o.o();
                if (((Boolean) G6.d.r()).booleanValue() && (fq = (Fq) this.f7050q.f7967f) != null) {
                    Aq aq = this.f7049p;
                    aq.y("Failed loading new engine");
                    aq.b(false);
                    fq.b(aq.l());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Q1.I.w("loadNewJavascriptEngine (failure): Lock released");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0282Hc, com.google.android.gms.internal.ads.Bh
    /* renamed from: l */
    public /* bridge */ /* synthetic */ void mo3l(Object obj) {
        Fq fq;
        Q1.I.w("loadNewJavascriptEngine (success): Trying to acquire lock");
        synchronized (this.f7050q.c) {
            try {
                Q1.I.w("loadNewJavascriptEngine (success): Lock acquired");
                Z8 z8 = this.f7050q;
                z8.f7965b = 0;
                Y8 y8 = (Y8) z8.f7968g;
                if (y8 != null && this.f7048o != y8) {
                    Q1.I.w("New JS engine is loaded, marking previous one as destroyable.");
                    ((Y8) this.f7050q.f7968g).o();
                }
                this.f7050q.f7968g = this.f7048o;
                if (((Boolean) G6.d.r()).booleanValue() && (fq = (Fq) this.f7050q.f7967f) != null) {
                    Aq aq = this.f7049p;
                    aq.b(true);
                    fq.b(aq.l());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Q1.I.w("loadNewJavascriptEngine (success): Lock released");
    }
}
