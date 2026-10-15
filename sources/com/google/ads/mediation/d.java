package com.google.ads.mediation;

import B0.q;
import H1.r;
import S1.j;
import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.InterfaceC1283v9;
import com.google.android.gms.internal.ads.Op;
import com.google.android.gms.internal.ads.Y9;
import d3.AbstractC1654b;
import h2.y;
import java.util.Date;
import q1.AbstractC1949d;
import q1.C1957l;
import x0.f;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class d extends r {
    public final /* synthetic */ int c = 0;
    public final Object d;

    public d(AbstractAdViewAdapter abstractAdViewAdapter, j jVar) {
        this.d = jVar;
    }

    public d(C1957l c1957l) {
        this.d = c1957l;
    }

    @Override // H1.r
    public final void a() {
        int i4 = this.c;
        Object obj = this.d;
        switch (i4) {
            case 0:
                Op op = (Op) ((j) obj);
                op.getClass();
                y.d("#008 Must be called on the main UI thread.");
                Y9.m("Adapter called onAdClosed.");
                try {
                    ((InterfaceC1283v9) op.f6525p).d();
                    return;
                } catch (RemoteException e4) {
                    Y9.u("#007 Could not call remote method.", e4);
                    return;
                }
            default:
                C1957l c1957l = (C1957l) obj;
                q qVar = c1957l.f14699e;
                qVar.f111p = null;
                if (c1957l.c && AbstractC1949d.f14652e == 0) {
                    AbstractC1654b.E("FIRST_FS_DISMISS");
                }
                Boolean bool = AbstractC1949d.f14650a;
                AbstractC1949d.f14651b = new Date();
                AbstractC1654b.E((AbstractC1949d.f14652e == 0 ? "INTER_first" : "INTER") + "_" + AbstractC1949d.d);
                AbstractC1949d.d = AbstractC1949d.d + 1;
                Activity activity = c1957l.d;
                R1.a.a(activity, "ca-app-pub-7062490913339915/1159910875", new H1.e(new f(13)), new C1957l(qVar, false, activity));
                return;
        }
    }

    @Override // H1.r
    public void c() {
        switch (this.c) {
            case 1:
                C1957l c1957l = (C1957l) this.d;
                c1957l.f14699e.f111p = null;
                if (c1957l.c && AbstractC1949d.f14652e == 0) {
                    AbstractC1654b.E("FIRST_FS_SHOW_FAIL");
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // H1.r
    public void d() {
        switch (this.c) {
            case 1:
                if (((C1957l) this.d).c && AbstractC1949d.f14652e == 0) {
                    AbstractC1654b.E("FIRST_AD_IMPR");
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // H1.r
    public final void f() {
        switch (this.c) {
            case 0:
                Op op = (Op) ((j) this.d);
                op.getClass();
                y.d("#008 Must be called on the main UI thread.");
                Y9.m("Adapter called onAdOpened.");
                try {
                    ((InterfaceC1283v9) op.f6525p).o();
                    return;
                } catch (RemoteException e4) {
                    Y9.u("#007 Could not call remote method.", e4);
                    return;
                }
            default:
                if (((C1957l) this.d).c && AbstractC1949d.f14652e == 0) {
                    AbstractC1654b.E("FIRST_FS_SHOW_OK");
                    return;
                }
                return;
        }
    }
}
