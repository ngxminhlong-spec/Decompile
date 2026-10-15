package com.google.android.gms.internal.ads;

import O1.C0067i;
import O1.C0077n;
import O1.C0081p;
import O1.C0097x0;
import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import n2.BinderC1813b;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class H8 extends R1.a {

    /* renamed from: a, reason: collision with root package name */
    public final Context f5413a;

    /* renamed from: b, reason: collision with root package name */
    public final O1.W0 f5414b;
    public final O1.J c;

    public H8(Context context, String str) {
        BinderC0983o9 binderC0983o9 = new BinderC0983o9();
        this.f5413a = context;
        this.f5414b = O1.W0.f1318o;
        C0077n c0077n = C0081p.f1374f.f1376b;
        O1.X0 x02 = new O1.X0();
        c0077n.getClass();
        this.c = (O1.J) new C0067i(c0077n, context, x02, str, binderC0983o9).d(context, false);
    }

    @Override // R1.a
    public final void b(Activity activity) {
        if (activity == null) {
            Y9.s("The activity for show is null, will proceed with show using the context provided when loading the ad.");
        }
        try {
            O1.J j4 = this.c;
            if (j4 != null) {
                j4.W0(new BinderC1813b(activity));
            }
        } catch (RemoteException e4) {
            Y9.u("#007 Could not call remote method.", e4);
        }
    }

    public final void c(C0097x0 c0097x0, H1.r rVar) {
        try {
            O1.J j4 = this.c;
            if (j4 != null) {
                O1.W0 w02 = this.f5414b;
                Context context = this.f5413a;
                w02.getClass();
                j4.t0(O1.W0.a(context, c0097x0), new O1.T0(rVar, this));
            }
        } catch (RemoteException e4) {
            Y9.u("#007 Could not call remote method.", e4);
            rVar.b(new H1.j(0, "Internal Error.", "com.google.android.gms.ads", null, null));
        }
    }
}
