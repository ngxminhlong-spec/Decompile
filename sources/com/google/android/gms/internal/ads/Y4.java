package com.google.android.gms.internal.ads;

import O1.C0063g;
import O1.C0077n;
import O1.C0081p;
import O1.C0097x0;
import android.content.Context;
import android.os.RemoteException;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Y4 {

    /* renamed from: a, reason: collision with root package name */
    public O1.J f7742a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f7743b;
    public final String c;
    public final C0097x0 d;

    /* renamed from: f, reason: collision with root package name */
    public final Rk f7745f;

    /* renamed from: g, reason: collision with root package name */
    public final BinderC0983o9 f7746g = new BinderC0983o9();

    /* renamed from: e, reason: collision with root package name */
    public final int f7744e = 1;

    /* renamed from: h, reason: collision with root package name */
    public final O1.W0 f7747h = O1.W0.f1318o;

    public Y4(Context context, String str, C0097x0 c0097x0, Rk rk) {
        this.f7743b = context;
        this.c = str;
        this.d = c0097x0;
        this.f7745f = rk;
    }

    public final void a() {
        try {
            O1.X0 h4 = O1.X0.h();
            C0077n c0077n = C0081p.f1374f.f1376b;
            Context context = this.f7743b;
            String str = this.c;
            BinderC0983o9 binderC0983o9 = this.f7746g;
            c0077n.getClass();
            O1.J j4 = (O1.J) new C0063g(c0077n, context, h4, str, binderC0983o9).d(context, false);
            this.f7742a = j4;
            if (j4 != null) {
                int i4 = this.f7744e;
                if (i4 != 3) {
                    j4.n2(new O1.a1(i4));
                }
                this.f7742a.E3(new O4(this.f7745f, this.c));
                O1.J j5 = this.f7742a;
                O1.W0 w02 = this.f7747h;
                Context context2 = this.f7743b;
                C0097x0 c0097x0 = this.d;
                w02.getClass();
                j5.h2(O1.W0.a(context2, c0097x0));
            }
        } catch (RemoteException e4) {
            Y9.u("#007 Could not call remote method.", e4);
        }
    }
}
