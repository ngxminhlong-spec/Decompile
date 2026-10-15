package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Oq {

    /* renamed from: a, reason: collision with root package name */
    public final Context f6528a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f6529b;
    public final C0242Ac c;
    public final Fq d;

    public Oq(Context context, C0260Dc c0260Dc, C0242Ac c0242Ac, Fq fq) {
        this.f6528a = context;
        this.f6529b = c0260Dc;
        this.c = c0242Ac;
        this.d = fq;
    }

    public final void a(String str, Eq eq) {
        boolean a4 = Fq.a();
        Executor executor = this.f6529b;
        if (a4 && ((Boolean) G6.d.r()).booleanValue()) {
            executor.execute(new RunnableC0801k(this, str, eq, 7));
        } else {
            executor.execute(new RunnableC0525df(this, str, 1));
        }
    }

    public final void b(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a((String) it.next(), null);
        }
    }
}
