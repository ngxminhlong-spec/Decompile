package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Kl implements Ih {

    /* renamed from: q, reason: collision with root package name */
    public final String f6052q;

    /* renamed from: r, reason: collision with root package name */
    public final InterfaceC1263uq f6053r;

    /* renamed from: o, reason: collision with root package name */
    public boolean f6050o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f6051p = false;

    /* renamed from: s, reason: collision with root package name */
    public final Q1.K f6054s = N1.n.f1204A.f1209g.c();

    public Kl(String str, InterfaceC1263uq interfaceC1263uq) {
        this.f6052q = str;
        this.f6053r = interfaceC1263uq;
    }

    @Override // com.google.android.gms.internal.ads.Ih
    public final void F(String str) {
        C1220tq b4 = b("adapter_init_finished");
        b4.a("ancn", str);
        this.f6053r.b(b4);
    }

    @Override // com.google.android.gms.internal.ads.Ih
    public final synchronized void a() {
        if (this.f6051p) {
            return;
        }
        this.f6053r.b(b("init_finished"));
        this.f6051p = true;
    }

    public final C1220tq b(String str) {
        String str2 = this.f6054s.q() ? "" : this.f6052q;
        C1220tq b4 = C1220tq.b(str);
        N1.n.f1204A.f1212j.getClass();
        b4.a("tms", Long.toString(SystemClock.elapsedRealtime(), 10));
        b4.a("tid", str2);
        return b4;
    }

    @Override // com.google.android.gms.internal.ads.Ih
    public final synchronized void d() {
        if (this.f6050o) {
            return;
        }
        this.f6053r.b(b("init_started"));
        this.f6050o = true;
    }

    @Override // com.google.android.gms.internal.ads.Ih
    public final void o(String str) {
        C1220tq b4 = b("aaia");
        b4.a("aair", "MalformedJson");
        this.f6053r.b(b4);
    }

    @Override // com.google.android.gms.internal.ads.Ih
    public final void v(String str, String str2) {
        C1220tq b4 = b("adapter_init_finished");
        b4.a("ancn", str);
        b4.a("rqe", str2);
        this.f6053r.b(b4);
    }

    @Override // com.google.android.gms.internal.ads.Ih
    public final void y(String str) {
        C1220tq b4 = b("adapter_init_started");
        b4.a("ancn", str);
        this.f6053r.b(b4);
    }
}
