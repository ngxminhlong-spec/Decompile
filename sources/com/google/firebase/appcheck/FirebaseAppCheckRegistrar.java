package com.google.firebase.appcheck;

import com.google.android.gms.internal.ads.C0326Qb;
import com.google.android.gms.internal.ads.C0574em;
import com.google.firebase.components.ComponentRegistrar;
import d3.AbstractC1654b;
import d3.g;
import h3.a;
import h3.b;
import h3.c;
import h3.d;
import j3.C1735b;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import l3.InterfaceC1800a;
import n3.C1814a;
import n3.InterfaceC1817d;
import n3.i;
import n3.q;
import v3.C2033d;
import v3.InterfaceC2034e;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class FirebaseAppCheckRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        final q qVar = new q(d.class, Executor.class);
        final q qVar2 = new q(c.class, Executor.class);
        final q qVar3 = new q(a.class, Executor.class);
        final q qVar4 = new q(b.class, ScheduledExecutorService.class);
        C0574em c0574em = new C0574em(C1735b.class, new Class[]{InterfaceC1800a.class});
        c0574em.f8636a = "fire-app-check";
        c0574em.a(i.a(g.class));
        c0574em.a(new i(qVar, 1, 0));
        c0574em.a(new i(qVar2, 1, 0));
        c0574em.a(new i(qVar3, 1, 0));
        c0574em.a(new i(qVar4, 1, 0));
        c0574em.a(new i(InterfaceC2034e.class, 0, 1));
        c0574em.f8639f = new InterfaceC1817d() { // from class: i3.a
            @Override // n3.InterfaceC1817d
            public final Object c(C0326Qb c0326Qb) {
                return new C1735b((g) c0326Qb.a(g.class), c0326Qb.e(InterfaceC2034e.class), (Executor) c0326Qb.d(q.this), (Executor) c0326Qb.d(qVar2), (Executor) c0326Qb.d(qVar3), (ScheduledExecutorService) c0326Qb.d(qVar4));
            }
        };
        if (!(c0574em.f8637b == 0)) {
            throw new IllegalStateException("Instantiation type has already been set.");
        }
        c0574em.f8637b = 1;
        C1814a b4 = c0574em.b();
        C2033d c2033d = new C2033d(0);
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(q.a(C2033d.class));
        return Arrays.asList(b4, new C1814a(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 1, new C1.g(7, c2033d), hashSet3), AbstractC1654b.n("fire-app-check", "17.1.0"));
    }
}
