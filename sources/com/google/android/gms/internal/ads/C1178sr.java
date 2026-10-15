package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import android.os.Parcel;
import e2.C1664b;
import h2.InterfaceC1703b;
import h2.InterfaceC1704c;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.sr, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1178sr implements InterfaceC1703b, InterfaceC1704c {

    /* renamed from: o, reason: collision with root package name */
    public final Fr f10641o;

    /* renamed from: p, reason: collision with root package name */
    public final String f10642p;

    /* renamed from: q, reason: collision with root package name */
    public final String f10643q;

    /* renamed from: r, reason: collision with root package name */
    public final LinkedBlockingQueue f10644r;

    /* renamed from: s, reason: collision with root package name */
    public final HandlerThread f10645s;

    /* renamed from: t, reason: collision with root package name */
    public final B0.c f10646t;

    /* renamed from: u, reason: collision with root package name */
    public final long f10647u;

    /* renamed from: v, reason: collision with root package name */
    public final int f10648v;

    public C1178sr(Context context, int i4, String str, String str2, B0.c cVar) {
        this.f10642p = str;
        this.f10648v = i4;
        this.f10643q = str2;
        this.f10646t = cVar;
        HandlerThread handlerThread = new HandlerThread("GassDGClient");
        this.f10645s = handlerThread;
        handlerThread.start();
        this.f10647u = System.currentTimeMillis();
        Fr fr = new Fr(19621000, context, handlerThread.getLooper(), this, this);
        this.f10641o = fr;
        this.f10644r = new LinkedBlockingQueue();
        fr.n();
    }

    @Override // h2.InterfaceC1703b
    public final void O(int i4) {
        try {
            b(4011, this.f10647u, null);
            this.f10644r.put(new Kr(null, 1, 1));
        } catch (InterruptedException unused) {
        }
    }

    @Override // h2.InterfaceC1703b
    public final void Q() {
        Ir ir;
        long j4 = this.f10647u;
        HandlerThread handlerThread = this.f10645s;
        try {
            ir = (Ir) this.f10641o.t();
        } catch (DeadObjectException | IllegalStateException unused) {
            ir = null;
        }
        if (ir != null) {
            try {
                Jr jr = new Jr(1, 1, this.f10648v - 1, this.f10642p, this.f10643q);
                Parcel Q3 = ir.Q();
                AbstractC1192t4.c(Q3, jr);
                Parcel q12 = ir.q1(Q3, 3);
                Kr kr = (Kr) AbstractC1192t4.a(q12, Kr.CREATOR);
                q12.recycle();
                b(5011, j4, null);
                this.f10644r.put(kr);
            } finally {
                try {
                } finally {
                }
            }
        }
    }

    public final void a() {
        Fr fr = this.f10641o;
        if (fr != null) {
            if (fr.a() || fr.g()) {
                fr.k();
            }
        }
    }

    @Override // h2.InterfaceC1704c
    public final void a0(C1664b c1664b) {
        try {
            b(4012, this.f10647u, null);
            this.f10644r.put(new Kr(null, 1, 1));
        } catch (InterruptedException unused) {
        }
    }

    public final void b(int i4, long j4, Exception exc) {
        this.f10646t.d(i4, System.currentTimeMillis() - j4, exc);
    }
}
