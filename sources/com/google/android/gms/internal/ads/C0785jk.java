package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import l2.C1798a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.jk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0785jk implements InterfaceC1457zB {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9213a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final FB f9214b;
    public final FB c;
    public final DB d;

    public C0785jk(C0263Df c0263Df, C1414yB c1414yB, DB db) {
        this.f9214b = c0263Df;
        this.c = c1414yB;
        this.d = db;
    }

    public C0785jk(C1414yB c1414yB, DB db, C1414yB c1414yB2) {
        this.f9214b = c1414yB;
        this.d = db;
        this.c = c1414yB2;
    }

    @Override // com.google.android.gms.internal.ads.FB
    public final Object c() {
        switch (this.f9213a) {
            case 0:
                return new C0743ik((C0572ek) this.f9214b.c(), this.d.c(), (C1798a) this.c.c());
            default:
                C0260Dc c0260Dc = AbstractC0266Ec.f4897a;
                AbstractC0587ez.n(c0260Dc);
                return new Un(c0260Dc, (ViewGroup) ((C0263Df) this.f9214b).f4753a.f9467p, (Context) this.c.c(), this.d.c(), 4);
        }
    }
}
