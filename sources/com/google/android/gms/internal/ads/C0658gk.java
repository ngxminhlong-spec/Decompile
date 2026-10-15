package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.measurement.C1510e1;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.gk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0658gk {

    /* renamed from: a, reason: collision with root package name */
    public final C0828kk f8857a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f8858b;
    public final HashMap c;

    public C0658gk(C0828kk c0828kk, C0260Dc c0260Dc) {
        this.f8857a = c0828kk;
        c0828kk.getClass();
        this.c = new HashMap(c0828kk.f9308a);
        this.f8858b = c0260Dc;
    }

    public final C1510e1 a() {
        C1510e1 c1510e1 = new C1510e1(this);
        ((ConcurrentHashMap) c1510e1.f11914p).putAll(this.c);
        return c1510e1;
    }

    public final void b() {
        if (((Boolean) O1.r.d.c.a(AbstractC1066q6.Q9)).booleanValue()) {
            C1510e1 a4 = a();
            a4.A("action", "pecr");
            a4.E();
        }
    }
}
