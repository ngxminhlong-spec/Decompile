package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import l2.C1798a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.rf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1123rf implements InterfaceC1457zB {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10485a;

    /* renamed from: b, reason: collision with root package name */
    public final FB f10486b;
    public final C1414yB c;

    public /* synthetic */ C1123rf(FB fb, C1414yB c1414yB, int i4) {
        this.f10485a = i4;
        this.f10486b = fb;
        this.c = c1414yB;
    }

    public /* synthetic */ C1123rf(C1414yB c1414yB, C1414yB c1414yB2, int i4) {
        this.f10485a = i4;
        this.c = c1414yB;
        this.f10486b = c1414yB2;
    }

    @Override // com.google.android.gms.internal.ads.FB
    public final Object c() {
        switch (this.f10485a) {
            case 0:
                return new C1081qf(((C0865le) this.f10486b).a(), (C1364x4) this.c.c());
            case 1:
                return new C0910mg((C1798a) this.f10486b.c(), (C0906mc) this.c.c());
            case 2:
                return new N1.a((Context) this.f10486b.c(), (InterfaceC0301Lb) this.c.c());
            case 3:
                return new Ph((C1040ph) this.c.c(), (Executor) this.f10486b.c());
            case 4:
                return new Ph((C1040ph) this.c.c(), (Executor) this.f10486b.c());
            case 5:
                return new Ph((C1040ph) this.c.c(), (Executor) this.f10486b.c());
            case 6:
                return new Ph((C1040ph) this.c.c(), (Executor) this.f10486b.c());
            case 7:
                return new Ph((C1040ph) this.c.c(), (Executor) this.f10486b.c());
            case 8:
                return new Ph((C1040ph) this.c.c(), (Executor) this.f10486b.c());
            case 9:
                return new Ph((C1040ph) this.c.c(), (Executor) this.f10486b.c());
            case 10:
                return new Ph((C1040ph) this.c.c(), (Executor) this.f10486b.c());
            case 11:
                Object obj = (C0530dk) this.f10486b.c();
                C0260Dc c0260Dc = AbstractC0266Ec.f4897a;
                AbstractC0587ez.n(c0260Dc);
                Object obj2 = (Jl) this.c.c();
                if (true == ((Boolean) O1.r.d.c.a(AbstractC1066q6.B7)).booleanValue()) {
                    obj = obj2;
                }
                return new Ph(obj, c0260Dc);
            default:
                InterfaceC1049pq interfaceC1049pq = (C0743ik) this.f10486b.c();
                C0260Dc c0260Dc2 = AbstractC0266Ec.f4897a;
                AbstractC0587ez.n(c0260Dc2);
                InterfaceC1049pq interfaceC1049pq2 = (Ml) this.c.c();
                if (true == ((Boolean) O1.r.d.c.a(AbstractC1066q6.B7)).booleanValue()) {
                    interfaceC1049pq = interfaceC1049pq2;
                }
                return new Ph(interfaceC1049pq, c0260Dc2);
        }
    }
}
