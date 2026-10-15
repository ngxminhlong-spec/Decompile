package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class R8 implements InterfaceC0597f8 {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f6787o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Y8 f6788p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ M8 f6789q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Z8 f6790r;

    public R8(Z8 z8, long j4, Y8 y8, M8 m8) {
        this.f6790r = z8;
        this.f6787o = j4;
        this.f6788p = y8;
        this.f6789q = m8;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0597f8
    public final void h(Object obj, Map map) {
        N1.n.f1204A.f1212j.getClass();
        Q1.I.w("onGmsg /jsLoaded. JsLoaded latency is " + (System.currentTimeMillis() - this.f6787o) + " ms.");
        Q1.I.w("loadJavascriptEngine > /jsLoaded handler: Trying to acquire lock");
        synchronized (this.f6790r.c) {
            Q1.I.w("loadJavascriptEngine > /jsLoaded handler: Lock acquired");
            if (((AtomicInteger) this.f6788p.f5575b).get() != -1 && ((AtomicInteger) this.f6788p.f5575b).get() != 1) {
                this.f6790r.f7965b = 0;
                M8 m8 = this.f6789q;
                m8.r("/log", AbstractC0554e8.c);
                m8.r("/result", AbstractC0554e8.f8568j);
                ((C0272Fc) this.f6788p.f5574a).b(this.f6789q);
                this.f6790r.f7968g = this.f6788p;
                Q1.I.w("Successfully loaded JS Engine.");
                Q1.I.w("loadJavascriptEngine > /jsLoaded handler: Lock released");
            }
        }
    }
}
