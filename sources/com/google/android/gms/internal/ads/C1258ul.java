package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Looper;
import android.os.RemoteException;
import e2.C1664b;
import h2.InterfaceC1703b;
import h2.InterfaceC1704c;
import i2.AbstractC1717a;
import java.util.Locale;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.ul, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1258ul implements InterfaceC1703b, InterfaceC1704c {

    /* renamed from: o, reason: collision with root package name */
    public final C0272Fc f10928o = new C0272Fc();

    /* renamed from: p, reason: collision with root package name */
    public boolean f10929p = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f10930q = false;

    /* renamed from: r, reason: collision with root package name */
    public C0300La f10931r;

    /* renamed from: s, reason: collision with root package name */
    public Context f10932s;

    /* renamed from: t, reason: collision with root package name */
    public Looper f10933t;

    /* renamed from: u, reason: collision with root package name */
    public ScheduledExecutorService f10934u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f10935v;

    /* renamed from: w, reason: collision with root package name */
    public AbstractC1717a f10936w;

    public C1258ul(int i4) {
        this.f10935v = i4;
    }

    private final synchronized void a() {
        if (this.f10930q) {
            return;
        }
        this.f10930q = true;
        try {
            ((InterfaceC0340Ta) this.f10931r.t()).E2((C0315Oa) this.f10936w, new BinderC1301vl(this));
        } catch (RemoteException unused) {
            this.f10928o.c(new Xk(1));
        } catch (Throwable th) {
            N1.n.f1204A.f1209g.h("RemoteAdsServiceProxyClientTask.onConnected", th);
            this.f10928o.c(th);
        }
    }

    private final synchronized void b() {
        if (this.f10930q) {
            return;
        }
        this.f10930q = true;
        try {
            ((InterfaceC0340Ta) this.f10931r.t()).z1((C0305Ma) this.f10936w, new BinderC1301vl(this));
        } catch (RemoteException unused) {
            this.f10928o.c(new Xk(1));
        } catch (Throwable th) {
            N1.n.f1204A.f1209g.h("RemoteAdsServiceSignalClientTask.onConnected", th);
            this.f10928o.c(th);
        }
    }

    @Override // h2.InterfaceC1703b
    public void O(int i4) {
        switch (this.f10935v) {
            case 1:
                Locale locale = Locale.US;
                String str = "Remote ad service connection suspended, cause: " + i4 + ".";
                Y9.m(str);
                this.f10928o.c(new Xk(str, 1));
                return;
            default:
                Locale locale2 = Locale.US;
                String str2 = "Remote ad service connection suspended, cause: " + i4 + ".";
                Y9.m(str2);
                this.f10928o.c(new Xk(str2, 1));
                return;
        }
    }

    @Override // h2.InterfaceC1703b
    public final synchronized void Q() {
        switch (this.f10935v) {
            case 0:
                a();
                return;
            default:
                b();
                return;
        }
    }

    @Override // h2.InterfaceC1704c
    public final void a0(C1664b c1664b) {
        Locale locale = Locale.US;
        String str = "Remote ad service connection failed, cause: " + c1664b.f12743p + ".";
        Y9.m(str);
        this.f10928o.c(new Xk(str, 1));
    }

    public final synchronized void c() {
        C1258ul c1258ul;
        try {
            try {
                if (this.f10931r == null) {
                    Context context = this.f10932s;
                    Looper looper = this.f10933t;
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext == null) {
                        applicationContext = context;
                    }
                    c1258ul = this;
                    c1258ul.f10931r = new C0300La(applicationContext, looper, 8, c1258ul, this, 0);
                } else {
                    c1258ul = this;
                }
                c1258ul.f10931r.n();
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final synchronized void d() {
        try {
            this.f10930q = true;
            C0300La c0300La = this.f10931r;
            if (c0300La == null) {
                return;
            }
            if (!c0300La.a()) {
                if (this.f10931r.g()) {
                }
                Binder.flushPendingCommands();
            }
            this.f10931r.k();
            Binder.flushPendingCommands();
        } catch (Throwable th) {
            throw th;
        }
    }
}
