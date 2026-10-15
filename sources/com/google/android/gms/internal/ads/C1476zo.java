package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.zo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1476zo implements InterfaceC1457zB {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11683a;

    /* renamed from: b, reason: collision with root package name */
    public final FB f11684b;
    public final FB c;
    public final FB d;

    /* renamed from: e, reason: collision with root package name */
    public final FB f11685e;

    /* renamed from: f, reason: collision with root package name */
    public final FB f11686f;

    public /* synthetic */ C1476zo(int i4, C1414yB c1414yB, InterfaceC1457zB interfaceC1457zB, InterfaceC1457zB interfaceC1457zB2, FB fb, FB fb2) {
        this.f11683a = i4;
        this.f11684b = fb;
        this.c = fb2;
        this.d = c1414yB;
        this.f11685e = interfaceC1457zB;
        this.f11686f = interfaceC1457zB2;
    }

    @Override // com.google.android.gms.internal.ads.FB
    public final Object c() {
        switch (this.f11683a) {
            case 0:
                C0260Dc c0260Dc = AbstractC0266Ec.f4897a;
                AbstractC0587ez.n(c0260Dc);
                return new C1433yo(c0260Dc, (ScheduledExecutorService) this.f11684b.c(), (String) this.c.c(), (Context) this.d.c(), ((Eg) this.f11685e).a(), (C1423ye) this.f11686f.c());
            default:
                Q1.K c = ((C0822ke) this.f11684b).c();
                Context a4 = ((C0865le) this.c).a();
                C0260Dc c0260Dc2 = AbstractC0266Ec.f4897a;
                AbstractC0587ez.n(c0260Dc2);
                return new C1433yo(c, a4, c0260Dc2, (ScheduledExecutorService) this.d.c(), new C0536dr(((C0865le) ((C0703hm) this.f11685e).f8985a).a(), 3), ((Eg) this.f11686f).a());
        }
    }
}
