package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import n2.BinderC1813b;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.yk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1429yk implements InterfaceC1086qk {

    /* renamed from: a, reason: collision with root package name */
    public final long f11458a;

    /* renamed from: b, reason: collision with root package name */
    public final C1384xi f11459b;
    public final BinderC1305vp c;

    public C1429yk(long j4, Context context, C1384xi c1384xi, C1423ye c1423ye, String str) {
        this.f11458a = j4;
        this.f11459b = c1384xi;
        this.c = (BinderC1305vp) ((C1414yB) new C0783ji(c1423ye.f11395b, context, str).f9212q).c();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1086qk
    public final void a(O1.U0 u02) {
        try {
            this.c.O0(u02, new BinderC1343wk(this));
        } catch (RemoteException e4) {
            Y9.u("#007 Could not call remote method.", e4);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1086qk
    public final void b() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1086qk
    public final void e() {
        BinderC1305vp binderC1305vp = this.c;
        try {
            binderC1305vp.Y0(new BinderC1386xk(this));
            binderC1305vp.I(new BinderC1813b(null));
        } catch (RemoteException e4) {
            Y9.u("#007 Could not call remote method.", e4);
        }
    }
}
