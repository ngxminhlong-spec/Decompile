package com.google.android.gms.internal.ads;

import android.os.Binder;
import e2.C1664b;
import h2.InterfaceC1703b;
import h2.InterfaceC1704c;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.hl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0702hl implements InterfaceC1703b, InterfaceC1704c {

    /* renamed from: o, reason: collision with root package name */
    public final C0272Fc f8979o = new C0272Fc();

    /* renamed from: p, reason: collision with root package name */
    public final Object f8980p = new Object();

    /* renamed from: q, reason: collision with root package name */
    public boolean f8981q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f8982r = false;

    /* renamed from: s, reason: collision with root package name */
    public C0370Za f8983s;

    /* renamed from: t, reason: collision with root package name */
    public C0466c5 f8984t;

    @Override // h2.InterfaceC1703b
    public final void O(int i4) {
        Y9.m("Cannot connect to remote service, fallback to local instance.");
    }

    public final void a() {
        synchronized (this.f8980p) {
            try {
                this.f8982r = true;
                if (!this.f8984t.a()) {
                    if (this.f8984t.g()) {
                    }
                    Binder.flushPendingCommands();
                }
                this.f8984t.k();
                Binder.flushPendingCommands();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a0(C1664b c1664b) {
        Y9.m("Disconnected from remote ad request service.");
        this.f8979o.c(new Xk(1));
    }
}
