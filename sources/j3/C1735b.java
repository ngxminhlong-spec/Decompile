package j3;

import A2.h;
import A2.i;
import A2.r;
import Q1.z;
import android.content.Context;
import d3.g;
import h2.y;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import l3.InterfaceC1800a;
import n3.m;
import w3.InterfaceC2053a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: j3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1735b implements InterfaceC1800a {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f13334a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f13335b;
    public final C1737d c;
    public final C1739f d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f13336e;

    /* renamed from: f, reason: collision with root package name */
    public final Executor f13337f;

    /* renamed from: g, reason: collision with root package name */
    public final Executor f13338g;

    /* renamed from: h, reason: collision with root package name */
    public final r f13339h;

    /* renamed from: i, reason: collision with root package name */
    public final V2.e f13340i;

    /* renamed from: j, reason: collision with root package name */
    public z f13341j;

    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, j3.d] */
    public C1735b(g gVar, InterfaceC2053a interfaceC2053a, Executor executor, Executor executor2, Executor executor3, ScheduledExecutorService scheduledExecutorService) {
        y.i(gVar);
        y.i(interfaceC2053a);
        this.f13334a = new ArrayList();
        this.f13335b = new ArrayList();
        gVar.a();
        Context context = gVar.f12617a;
        String c = gVar.c();
        ?? obj = new Object();
        y.i(context);
        y.e(c);
        obj.f13345a = new m(new C1736c(0, context, "com.google.firebase.appcheck.store." + c));
        this.c = obj;
        gVar.a();
        this.d = new C1739f(context, this, executor2, scheduledExecutorService);
        this.f13336e = executor;
        this.f13337f = executor2;
        this.f13338g = executor3;
        i iVar = new i();
        executor3.execute(new C1.d(1, this, iVar));
        this.f13339h = iVar.f26a;
        this.f13340i = new V2.e(21);
    }

    public final h a() {
        C1.g gVar = new C1.g(6, this);
        r rVar = this.f13339h;
        rVar.getClass();
        r rVar2 = new r();
        rVar.f41b.e(new A2.m(this.f13337f, gVar, rVar2));
        rVar.p();
        return rVar2;
    }
}
