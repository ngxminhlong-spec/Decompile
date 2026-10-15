package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.util.Log;
import android.webkit.WebView;
import c3.InterfaceFutureC0239a;
import java.util.ArrayDeque;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.il, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0744il implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f9055o;

    /* renamed from: p, reason: collision with root package name */
    public Object f9056p;

    public /* synthetic */ RunnableC0744il() {
        this.f9055o = 16;
    }

    public /* synthetic */ RunnableC0744il(int i4, Object obj) {
        this.f9055o = i4;
        this.f9056p = obj;
    }

    public RunnableC0744il(C0708hr c0708hr) {
        this.f9055o = 13;
        this.f9056p = c0708hr.d;
    }

    private final void a() {
        BinderC1217tn binderC1217tn = (BinderC1217tn) this.f9056p;
        synchronized (binderC1217tn) {
            binderC1217tn.M3("Signal collection timeout.", 3);
        }
    }

    private final void b() {
        MD md = (MD) this.f9056p;
        synchronized (md.f6224a) {
            try {
                if (md.f6233l) {
                    return;
                }
                long j4 = md.f6232k - 1;
                md.f6232k = j4;
                if (j4 > 0) {
                    return;
                }
                if (j4 >= 0) {
                    md.a();
                    return;
                }
                IllegalStateException illegalStateException = new IllegalStateException();
                synchronized (md.f6224a) {
                    md.f6234m = illegalStateException;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceFutureC0239a interfaceFutureC0239a;
        switch (this.f9055o) {
            case 0:
                ((C0573el) this.f9056p).a();
                return;
            case 1:
                ((C1258ul) this.f9056p).d();
                return;
            case 2:
                ((C1258ul) this.f9056p).d();
                return;
            case 3:
                ((C0348Ud) this.f9056p).M();
                return;
            case 4:
                Um um = (Um) this.f9056p;
                synchronized (um) {
                    um.f7176a.getClass();
                    um.f7181h = SystemClock.elapsedRealtime() - um.f7182i;
                }
                return;
            case 5:
                a();
                return;
            case 6:
                ((Uo) this.f9056p).d.J(Zf.L(6, null, null));
                return;
            case 7:
                ((Zo) this.f9056p).d.J(Zf.L(6, null, null));
                return;
            case 8:
                ((Bn) this.f9056p).M();
                return;
            case 9:
                ((C1091qp) this.f9056p).d.J(Zf.L(6, null, null));
                return;
            case 10:
                ((C1219tp) this.f9056p).d.J(Zf.L(6, null, null));
                return;
            case 11:
                ((C1133rp) this.f9056p).M();
                return;
            case 12:
                C1306vq c1306vq = (C1306vq) this.f9056p;
                LinkedBlockingQueue linkedBlockingQueue = c1306vq.f11076b;
                while (!linkedBlockingQueue.isEmpty()) {
                    c1306vq.f11075a.b((C1220tq) linkedBlockingQueue.remove());
                }
                return;
            case 13:
                ((WebView) this.f9056p).destroy();
                return;
            case 14:
                C0831kn c0831kn = ((C0878lr) this.f9056p).f9501e;
                c0831kn.getClass();
                AbstractAsyncTaskC0921mr abstractAsyncTaskC0921mr = new AbstractAsyncTaskC0921mr(c0831kn);
                Op op = (Op) c0831kn.f9320q;
                abstractAsyncTaskC0921mr.f9659a = op;
                ArrayDeque arrayDeque = (ArrayDeque) op.f6526q;
                arrayDeque.add(abstractAsyncTaskC0921mr);
                if (((AbstractAsyncTaskC0921mr) op.f6527r) == null) {
                    AbstractAsyncTaskC0921mr abstractAsyncTaskC0921mr2 = (AbstractAsyncTaskC0921mr) arrayDeque.poll();
                    op.f6527r = abstractAsyncTaskC0921mr2;
                    if (abstractAsyncTaskC0921mr2 != null) {
                        abstractAsyncTaskC0921mr2.executeOnExecutor((ThreadPoolExecutor) op.f6525p, new Object[0]);
                        return;
                    }
                    return;
                }
                return;
            case 15:
                A2.i iVar = (A2.i) this.f9056p;
                Rr rr = new Rr();
                Log.d("GASS", "Clearcut logging disabled");
                iVar.b(new Or(rr));
                return;
            case 16:
                Zu zu = (Zu) this.f9056p;
                if (zu == null || (interfaceFutureC0239a = zu.f8061v) == null) {
                    return;
                }
                this.f9056p = null;
                if (interfaceFutureC0239a.isDone()) {
                    zu.k(interfaceFutureC0239a);
                    return;
                }
                try {
                    ScheduledFuture scheduledFuture = zu.f8062w;
                    zu.f8062w = null;
                    String str = "Timed out";
                    if (scheduledFuture != null) {
                        try {
                            long abs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                            if (abs > 10) {
                                str = "Timed out (timeout delayed by " + abs + " ms after scheduled time)";
                            }
                        } catch (Throwable th) {
                            zu.g(new TimeoutException(str));
                            throw th;
                        }
                    }
                    zu.g(new TimeoutException(str + ": " + interfaceFutureC0239a.toString()));
                    return;
                } finally {
                    interfaceFutureC0239a.cancel(true);
                }
            case 17:
                try {
                    C1029pC.F((HC) this.f9056p);
                    return;
                } catch (ZB e4) {
                    Wj.i("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e4);
                    throw new RuntimeException(e4);
                }
            case 18:
                VC vc = (VC) this.f9056p;
                vc.e(vc.b(), 1028, new C0558eC(3));
                vc.f7253t.g();
                return;
            case 19:
                b();
                return;
            default:
                GE ge = (GE) ((InterfaceC1160sF) this.f9056p);
                for (KE ke : ge.f5148D) {
                    ke.p(true);
                    if (ke.f5999A != null) {
                        ke.f5999A = null;
                        ke.f6003f = null;
                    }
                }
                C0882lv c0882lv = ge.f5175v;
                if (((B) c0882lv.f9508r) != null) {
                    c0882lv.f9508r = null;
                }
                c0882lv.f9506p = null;
                return;
        }
    }
}
