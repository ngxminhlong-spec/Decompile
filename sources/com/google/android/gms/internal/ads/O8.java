package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final /* synthetic */ class O8 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f6437o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Y8 f6438p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ M8 f6439q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ ArrayList f6440r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f6441s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Z8 f6442t;

    public /* synthetic */ O8(Z8 z8, Y8 y8, M8 m8, ArrayList arrayList, long j4, int i4) {
        this.f6437o = i4;
        this.f6442t = z8;
        this.f6438p = y8;
        this.f6439q = m8;
        this.f6440r = arrayList;
        this.f6441s = j4;
    }

    private final void a() {
        Z8 z8 = this.f6442t;
        Y8 y8 = this.f6438p;
        M8 m8 = this.f6439q;
        ArrayList arrayList = this.f6440r;
        long j4 = this.f6441s;
        Q1.I.w("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Trying to acquire lock");
        synchronized (z8.c) {
            Q1.I.w("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock acquired");
            if (((AtomicInteger) y8.f5575b).get() != -1 && ((AtomicInteger) y8.f5575b).get() != 1) {
                ((C0272Fc) y8.f5574a).c(new Exception());
                AbstractC0266Ec.f4899e.execute(new P8(m8, 0));
                String valueOf = String.valueOf(O1.r.d.c.a(AbstractC1066q6.f10202b));
                int i4 = ((AtomicInteger) y8.f5575b).get();
                int i5 = z8.f7965b;
                String valueOf2 = String.valueOf(arrayList.get(0));
                N1.n.f1204A.f1212j.getClass();
                Q1.I.w("Could not receive /jsLoaded in " + valueOf + " ms. JS engine session reference status(onEngLoadedTimeout) is " + i4 + ". Update status(onEngLoadedTimeout) is " + i5 + ". LoadNewJavascriptEngine(onEngLoadedTimeout) latency is " + valueOf2 + " ms. Total latency(onEngLoadedTimeout) is " + (System.currentTimeMillis() - j4) + " ms. Rejecting.");
                Q1.I.w("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock released");
                return;
            }
            Q1.I.w("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock released, the promise is already settled");
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6437o) {
            case 0:
                a();
                return;
            default:
                Q1.I.w("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Trying to acquire lock");
                synchronized (this.f6442t.c) {
                    try {
                        Q1.I.w("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock acquired");
                        if (((AtomicInteger) this.f6438p.f5575b).get() != -1 && ((AtomicInteger) this.f6438p.f5575b).get() != 1) {
                            ((C0272Fc) this.f6438p.f5574a).c(new Exception());
                            AbstractC0266Ec.f4899e.execute(new P8(this.f6439q, 1));
                            String valueOf = String.valueOf(O1.r.d.c.a(AbstractC1066q6.c));
                            int i4 = ((AtomicInteger) this.f6438p.f5575b).get();
                            int i5 = this.f6442t.f7965b;
                            String concat = this.f6440r.isEmpty() ? ". Still waiting for the engine to be loaded" : ". While waiting for the /jsLoaded gmsg, observed the loadNewJavascriptEngine latency is ".concat(String.valueOf(this.f6440r.get(0)));
                            N1.n.f1204A.f1212j.getClass();
                            Q1.I.w("Could not finish the full JS engine loading in " + valueOf + " ms. JS engine session reference status(fullLoadTimeout) is " + i4 + ". Update status(fullLoadTimeout) is " + i5 + concat + " ms. Total latency(fullLoadTimeout) is " + (System.currentTimeMillis() - this.f6441s) + " ms at timeout. Rejecting.");
                            Q1.I.w("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock released");
                            return;
                        }
                        Q1.I.w("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock released, the promise is already settled");
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
        }
    }
}
