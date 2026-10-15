package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.SystemClock;
import c3.InterfaceFutureC0239a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Io {

    /* renamed from: a, reason: collision with root package name */
    public final Context f5722a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f5723b;
    public final Executor c;
    public final Eq d;

    /* renamed from: e, reason: collision with root package name */
    public final C0658gk f5724e;

    /* renamed from: f, reason: collision with root package name */
    public long f5725f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f5726g = 0;

    public Io(Context context, C0260Dc c0260Dc, Set set, Eq eq, C0658gk c0658gk) {
        this.f5722a = context;
        this.c = c0260Dc;
        this.f5723b = set;
        this.d = eq;
        this.f5724e = c0658gk;
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [com.google.android.gms.internal.ads.Hu, com.google.android.gms.internal.ads.yu, c3.a] */
    public final Hu a(Object obj) {
        Aq f4 = Zf.f(this.f5722a, 8);
        f4.f();
        Set<Go> set = this.f5723b;
        ArrayList arrayList = new ArrayList(set.size());
        List arrayList2 = new ArrayList();
        C0937n6 c0937n6 = AbstractC1066q6.W9;
        O1.r rVar = O1.r.d;
        if (!((String) rVar.c.a(c0937n6)).isEmpty()) {
            arrayList2 = Arrays.asList(((String) rVar.c.a(c0937n6)).split(","));
        }
        N1.n.f1204A.f1212j.getClass();
        this.f5725f = SystemClock.elapsedRealtime();
        for (Go go : set) {
            if (!arrayList2.contains(String.valueOf(go.b()))) {
                N1.n.f1204A.f1212j.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                InterfaceFutureC0239a c = go.c();
                c.a(new RunnableC0758j(this, elapsedRealtime, go), AbstractC0266Ec.f4900f);
                arrayList.add(c);
            }
        }
        AbstractC1137rt r4 = AbstractC1137rt.r(arrayList);
        B0.v vVar = new B0.v(16, arrayList, obj);
        ?? abstractC1439yu = new AbstractC1439yu(r4, true, false);
        abstractC1439yu.f5517D = new Gu(abstractC1439yu, vVar, this.c);
        abstractC1439yu.v();
        if (Fq.a()) {
            Zf.Z(abstractC1439yu, this.d, f4, false);
        }
        return abstractC1439yu;
    }
}
