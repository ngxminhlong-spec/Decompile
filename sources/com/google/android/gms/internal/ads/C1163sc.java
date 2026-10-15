package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import java.math.BigInteger;
import java.util.HashSet;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.sc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1163sc implements G4 {

    /* renamed from: b, reason: collision with root package name */
    public final Q1.K f10604b;
    public final C0258Da c;
    public final C1078qc d;

    /* renamed from: a, reason: collision with root package name */
    public final Object f10603a = new Object();

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f10605e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    public final HashSet f10606f = new HashSet();

    /* renamed from: g, reason: collision with root package name */
    public boolean f10607g = false;

    public C1163sc(String str, Q1.K k3) {
        this.d = new C1078qc(str, k3);
        this.f10604b = k3;
        C0258Da c0258Da = new C0258Da(16, false);
        c0258Da.f4618p = BigInteger.ONE;
        c0258Da.f4619q = "0";
        this.c = c0258Da;
    }

    public final void a(C0906mc c0906mc) {
        synchronized (this.f10603a) {
            this.f10605e.add(c0906mc);
        }
    }

    public final void b() {
        synchronized (this.f10603a) {
            this.d.c();
        }
    }

    public final void c() {
        synchronized (this.f10603a) {
            this.d.d();
        }
    }

    public final void d() {
        synchronized (this.f10603a) {
            this.d.g();
        }
    }

    public final void e() {
        synchronized (this.f10603a) {
            this.d.g();
        }
    }

    public final void f(O1.U0 u02, long j4) {
        synchronized (this.f10603a) {
            this.d.e(u02, j4);
        }
    }

    public final void g(HashSet hashSet) {
        synchronized (this.f10603a) {
            this.f10605e.addAll(hashSet);
        }
    }

    @Override // com.google.android.gms.internal.ads.G4
    public final void v(boolean z4) {
        N1.n.f1204A.f1212j.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        if (z4) {
            if (currentTimeMillis - this.f10604b.u() > ((Long) O1.r.d.c.a(AbstractC1066q6.f10115I0)).longValue()) {
                this.d.d = -1;
            } else {
                this.d.d = this.f10604b.t();
            }
            this.f10607g = true;
            return;
        }
        Q1.K k3 = this.f10604b;
        k3.r();
        synchronized (k3.f1642a) {
            try {
                if (k3.f1656q != currentTimeMillis) {
                    k3.f1656q = currentTimeMillis;
                    SharedPreferences.Editor editor = k3.f1646g;
                    if (editor != null) {
                        editor.putLong("app_last_background_time_ms", currentTimeMillis);
                        k3.f1646g.apply();
                    }
                    k3.s();
                }
            } finally {
            }
        }
        this.f10604b.k(this.d.d);
    }
}
