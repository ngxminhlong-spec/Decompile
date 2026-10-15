package com.google.android.gms.internal.ads;

import O1.C0075m;
import O1.C0077n;
import O1.C0081p;
import O1.C0097x0;
import android.content.Context;
import android.os.RemoteException;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.Hb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0281Hb {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1162sb f5428a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f5429b;
    public final BinderC0276Gb c;

    /* JADX WARN: Type inference failed for: r3v3, types: [com.google.android.gms.internal.ads.ub, com.google.android.gms.internal.ads.Gb] */
    public C0281Hb(Context context, String str) {
        this.f5429b = context.getApplicationContext();
        C0077n c0077n = C0081p.f1374f.f1376b;
        BinderC0983o9 binderC0983o9 = new BinderC0983o9();
        c0077n.getClass();
        this.f5428a = (InterfaceC1162sb) new C0075m(context, str, binderC0983o9).d(context, false);
        this.c = new AbstractBinderC1248ub();
    }

    public static void a(Context context, String str, H1.e eVar, Rk rk) {
        h2.y.j(context, "Context cannot be null.");
        h2.y.j(str, "AdUnitId cannot be null.");
        h2.y.d("#008 Must be called on the main UI thread.");
        AbstractC1066q6.a(context);
        if (((Boolean) L6.f6131k.r()).booleanValue()) {
            if (((Boolean) O1.r.d.c.a(AbstractC1066q6.x9)).booleanValue()) {
                AbstractC1249uc.f10789b.execute(new J1.a(context, str, eVar, rk, 6));
                return;
            }
        }
        new C0281Hb(context, str).b(eVar.f863a, rk);
    }

    public final void b(C0097x0 c0097x0, Rk rk) {
        try {
            InterfaceC1162sb interfaceC1162sb = this.f5428a;
            if (interfaceC1162sb != null) {
                interfaceC1162sb.O1(O1.W0.a(this.f5429b, c0097x0), new BinderC0253Cb(rk, this, 1));
            }
        } catch (RemoteException e4) {
            Y9.u("#007 Could not call remote method.", e4);
        }
    }
}
