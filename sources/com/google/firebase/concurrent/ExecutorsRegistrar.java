package com.google.firebase.concurrent;

import D3.b;
import android.annotation.SuppressLint;
import com.google.android.gms.internal.ads.C0574em;
import com.google.android.gms.internal.play_billing.B;
import com.google.firebase.components.ComponentRegistrar;
import h3.a;
import h3.c;
import h3.d;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import n3.C1814a;
import n3.C1818e;
import n3.m;
import n3.q;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
@SuppressLint({"ThreadPoolCreation"})
/* loaded from: classes.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {

    /* renamed from: a, reason: collision with root package name */
    public static final m f12545a = new m(new C1818e(2));

    /* renamed from: b, reason: collision with root package name */
    public static final m f12546b = new m(new C1818e(3));
    public static final m c = new m(new C1818e(4));
    public static final m d = new m(new C1818e(5));

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        q qVar = new q(a.class, ScheduledExecutorService.class);
        q[] qVarArr = {new q(a.class, ExecutorService.class), new q(a.class, Executor.class)};
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(qVar);
        for (q qVar2 : qVarArr) {
            B.g(qVar2, "Null interface");
        }
        Collections.addAll(hashSet, qVarArr);
        C1814a c1814a = new C1814a(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new b(10), hashSet3);
        q qVar3 = new q(h3.b.class, ScheduledExecutorService.class);
        q[] qVarArr2 = {new q(h3.b.class, ExecutorService.class), new q(h3.b.class, Executor.class)};
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        HashSet hashSet6 = new HashSet();
        hashSet4.add(qVar3);
        for (q qVar4 : qVarArr2) {
            B.g(qVar4, "Null interface");
        }
        Collections.addAll(hashSet4, qVarArr2);
        C1814a c1814a2 = new C1814a(null, new HashSet(hashSet4), new HashSet(hashSet5), 0, 0, new b(11), hashSet6);
        q qVar5 = new q(c.class, ScheduledExecutorService.class);
        q[] qVarArr3 = {new q(c.class, ExecutorService.class), new q(c.class, Executor.class)};
        HashSet hashSet7 = new HashSet();
        HashSet hashSet8 = new HashSet();
        HashSet hashSet9 = new HashSet();
        hashSet7.add(qVar5);
        for (q qVar6 : qVarArr3) {
            B.g(qVar6, "Null interface");
        }
        Collections.addAll(hashSet7, qVarArr3);
        C1814a c1814a3 = new C1814a(null, new HashSet(hashSet7), new HashSet(hashSet8), 0, 0, new b(12), hashSet9);
        C0574em a4 = C1814a.a(new q(d.class, Executor.class));
        a4.f8639f = new b(13);
        return Arrays.asList(c1814a, c1814a2, c1814a3, a4.b());
    }
}
