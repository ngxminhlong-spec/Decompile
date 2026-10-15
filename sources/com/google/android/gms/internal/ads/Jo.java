package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Jo implements InterfaceC1457zB {

    /* renamed from: a, reason: collision with root package name */
    public final FB f5906a;

    /* renamed from: b, reason: collision with root package name */
    public final FB f5907b;
    public final FB c;
    public final FB d;

    public Jo(C0865le c0865le, DB db, C1414yB c1414yB, C1414yB c1414yB2) {
        this.f5906a = c0865le;
        this.f5907b = db;
        this.c = c1414yB;
        this.d = c1414yB2;
    }

    @Override // com.google.android.gms.internal.ads.FB
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Io c() {
        Context a4 = ((C0865le) this.f5906a).a();
        C0260Dc c0260Dc = AbstractC0266Ec.f4897a;
        AbstractC0587ez.n(c0260Dc);
        return new Io(a4, c0260Dc, ((DB) this.f5907b).c(), (Eq) this.c.c(), (C0658gk) this.d.c());
    }
}
