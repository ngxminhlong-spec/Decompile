package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.lk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0871lk {

    /* renamed from: e, reason: collision with root package name */
    public final String f9458e;

    /* renamed from: f, reason: collision with root package name */
    public final C0828kk f9459f;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f9457b = new ArrayList();
    public boolean c = false;
    public boolean d = false;

    /* renamed from: a, reason: collision with root package name */
    public final Q1.K f9456a = N1.n.f1204A.f1209g.c();

    public C0871lk(String str, C0828kk c0828kk) {
        this.f9458e = str;
        this.f9459f = c0828kk;
    }

    public final synchronized void a(String str, String str2) {
        C0937n6 c0937n6 = AbstractC1066q6.f10134M1;
        O1.r rVar = O1.r.d;
        if (((Boolean) rVar.c.a(c0937n6)).booleanValue()) {
            if (!((Boolean) rVar.c.a(AbstractC1066q6.B7)).booleanValue()) {
                HashMap e4 = e();
                e4.put("action", "adapter_init_finished");
                e4.put("ancn", str);
                e4.put("rqe", str2);
                this.f9457b.add(e4);
            }
        }
    }

    public final synchronized void b(String str) {
        C0937n6 c0937n6 = AbstractC1066q6.f10134M1;
        O1.r rVar = O1.r.d;
        if (((Boolean) rVar.c.a(c0937n6)).booleanValue()) {
            if (!((Boolean) rVar.c.a(AbstractC1066q6.B7)).booleanValue()) {
                HashMap e4 = e();
                e4.put("action", "adapter_init_started");
                e4.put("ancn", str);
                this.f9457b.add(e4);
            }
        }
    }

    public final synchronized void c(String str) {
        C0937n6 c0937n6 = AbstractC1066q6.f10134M1;
        O1.r rVar = O1.r.d;
        if (((Boolean) rVar.c.a(c0937n6)).booleanValue()) {
            if (!((Boolean) rVar.c.a(AbstractC1066q6.B7)).booleanValue()) {
                HashMap e4 = e();
                e4.put("action", "adapter_init_finished");
                e4.put("ancn", str);
                this.f9457b.add(e4);
            }
        }
    }

    public final synchronized void d() {
        C0937n6 c0937n6 = AbstractC1066q6.f10134M1;
        O1.r rVar = O1.r.d;
        if (((Boolean) rVar.c.a(c0937n6)).booleanValue()) {
            if (!((Boolean) rVar.c.a(AbstractC1066q6.B7)).booleanValue() && !this.c) {
                HashMap e4 = e();
                e4.put("action", "init_started");
                this.f9457b.add(e4);
                this.c = true;
            }
        }
    }

    public final HashMap e() {
        C0828kk c0828kk = this.f9459f;
        c0828kk.getClass();
        HashMap hashMap = new HashMap(c0828kk.f9308a);
        N1.n.f1204A.f1212j.getClass();
        hashMap.put("tms", Long.toString(SystemClock.elapsedRealtime(), 10));
        hashMap.put("tid", this.f9456a.q() ? "" : this.f9458e);
        return hashMap;
    }
}
