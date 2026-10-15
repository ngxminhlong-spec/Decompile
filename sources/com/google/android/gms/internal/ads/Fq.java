package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.internal.measurement.C1510e1;
import java.util.AbstractCollection;
import java.util.HashMap;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Fq implements Runnable {

    /* renamed from: w, reason: collision with root package name */
    public static final Object f5088w = new Object();

    /* renamed from: x, reason: collision with root package name */
    public static final Object f5089x = new Object();
    public static final Object y = new Object();

    /* renamed from: z, reason: collision with root package name */
    public static Boolean f5090z;

    /* renamed from: o, reason: collision with root package name */
    public final Context f5091o;

    /* renamed from: p, reason: collision with root package name */
    public final C0248Bc f5092p;

    /* renamed from: s, reason: collision with root package name */
    public int f5095s;

    /* renamed from: t, reason: collision with root package name */
    public final Sj f5096t;

    /* renamed from: u, reason: collision with root package name */
    public final AbstractCollection f5097u;

    /* renamed from: q, reason: collision with root package name */
    public final Iq f5093q = Lq.w();

    /* renamed from: r, reason: collision with root package name */
    public String f5094r = "";

    /* renamed from: v, reason: collision with root package name */
    public boolean f5098v = false;

    public Fq(Context context, C0248Bc c0248Bc, Sj sj, C1016p c1016p) {
        this.f5091o = context;
        this.f5092p = c0248Bc;
        this.f5096t = sj;
        if (((Boolean) O1.r.d.c.a(AbstractC1066q6.L7)).booleanValue()) {
            this.f5097u = Q1.N.v();
        } else {
            C1052pt c1052pt = AbstractC1137rt.f10543p;
            this.f5097u = Gt.f5344s;
        }
    }

    public static boolean a() {
        boolean booleanValue;
        synchronized (f5088w) {
            try {
                if (f5090z == null) {
                    if (((Boolean) G6.f5134b.r()).booleanValue()) {
                        f5090z = Boolean.valueOf(Math.random() < ((Double) G6.f5133a.r()).doubleValue());
                    } else {
                        f5090z = Boolean.FALSE;
                    }
                }
                booleanValue = f5090z.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return booleanValue;
    }

    public final void b(Dq dq) {
        AbstractC0266Ec.f4897a.a(new Jn(8, this, dq));
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte[] e4;
        if (a()) {
            Object obj = f5089x;
            synchronized (obj) {
                try {
                    if (((Lq) this.f5093q.f4561p).v() == 0) {
                        return;
                    }
                    try {
                        synchronized (obj) {
                            e4 = ((Lq) this.f5093q.b()).e();
                            Iq iq = this.f5093q;
                            iq.d();
                            Lq.x((Lq) iq.f4561p);
                        }
                        El el = new El((String) O1.r.d.c.a(AbstractC1066q6.F7), 60000, new HashMap(), e4, "application/x-protobuf", false);
                        Context context = this.f5091o;
                        String str = this.f5092p.f4084o;
                        Binder.getCallingUid();
                        new C1510e1((Object) context, (Object) str, 28, false).l(el);
                    } catch (Exception e5) {
                        if ((e5 instanceof Xk) && ((Xk) e5).f7688o == 3) {
                            return;
                        }
                        N1.n.f1204A.f1209g.g("CuiMonitor.sendCuiPing", e5);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
