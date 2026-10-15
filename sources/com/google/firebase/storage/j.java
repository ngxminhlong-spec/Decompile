package com.google.firebase.storage;

import C0.x0;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final /* synthetic */ class j implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f12572o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ x0 f12573p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f12574q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ l f12575r;

    public /* synthetic */ j(x0 x0Var, Object obj, l lVar, int i4) {
        this.f12572o = i4;
        this.f12573p = x0Var;
        this.f12574q = obj;
        this.f12575r = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12572o) {
            case 0:
                ((k) this.f12573p.f454s).a(this.f12574q, this.f12575r);
                return;
            default:
                ((k) this.f12573p.f454s).a(this.f12574q, this.f12575r);
                return;
        }
    }
}
