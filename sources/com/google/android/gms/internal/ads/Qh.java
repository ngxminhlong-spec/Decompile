package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Qh extends AA implements InterfaceC1450z4 {

    /* renamed from: q, reason: collision with root package name */
    public final WeakHashMap f6672q;

    /* renamed from: r, reason: collision with root package name */
    public final Context f6673r;

    /* renamed from: s, reason: collision with root package name */
    public final C1434yp f6674s;

    public Qh(Context context, Set set, C1434yp c1434yp) {
        super(set);
        this.f6672q = new WeakHashMap(1);
        this.f6673r = context;
        this.f6674s = c1434yp;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1450z4
    public final synchronized void j0(C1407y4 c1407y4) {
        n1(new M3(29, c1407y4));
    }

    public final synchronized void r1(View view) {
        try {
            A4 a4 = (A4) this.f6672q.get(view);
            if (a4 == null) {
                A4 a42 = new A4(this.f6673r, view);
                a42.f3924z.add(this);
                a42.c(3);
                this.f6672q.put(view, a42);
                a4 = a42;
            }
            if (this.f6674s.f11497X) {
                C0937n6 c0937n6 = AbstractC1066q6.f10208c1;
                O1.r rVar = O1.r.d;
                if (((Boolean) rVar.c.a(c0937n6)).booleanValue()) {
                    a4.f3922w.d(((Long) rVar.c.a(AbstractC1066q6.f10204b1)).longValue());
                    return;
                }
            }
            a4.f3922w.d(A4.f3911C);
        } catch (Throwable th) {
            throw th;
        }
    }
}
