package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.Rc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0332Rc implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f6803o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f6804p;

    /* renamed from: q, reason: collision with root package name */
    public final C0337Sc f6805q;

    public RunnableC0332Rc(C0337Sc c0337Sc) {
        this.f6803o = 2;
        this.f6804p = false;
        this.f6805q = c0337Sc;
    }

    public /* synthetic */ RunnableC0332Rc(C0337Sc c0337Sc, boolean z4, int i4) {
        this.f6803o = i4;
        this.f6805q = c0337Sc;
        this.f6804p = z4;
    }

    public void a() {
        this.f6804p = true;
        this.f6805q.j();
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6803o) {
            case 0:
                boolean z4 = this.f6804p;
                C0337Sc c0337Sc = this.f6805q;
                c0337Sc.getClass();
                c0337Sc.c("windowFocusChanged", "hasWindowFocus", String.valueOf(z4));
                return;
            case 1:
                this.f6805q.c("windowVisibilityChanged", "isVisible", String.valueOf(this.f6804p));
                return;
            default:
                if (this.f6804p) {
                    return;
                }
                this.f6805q.j();
                Q1.J j4 = Q1.N.f1668k;
                j4.removeCallbacks(this);
                j4.postDelayed(this, 250L);
                return;
        }
    }
}
