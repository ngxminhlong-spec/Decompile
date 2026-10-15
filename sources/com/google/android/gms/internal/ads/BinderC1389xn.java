package com.google.android.gms.internal.ads;

import O1.InterfaceC0096x;
import android.content.Context;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.xn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC1389xn extends O1.B {

    /* renamed from: o, reason: collision with root package name */
    public final Op f11301o;

    /* JADX WARN: Type inference failed for: r6v4, types: [com.google.android.gms.internal.ads.a5, java.lang.Object] */
    public BinderC1389xn(Context context, C1423ye c1423ye, Ip ip, Gi gi, InterfaceC0096x interfaceC0096x) {
        Op op = new Op(gi, (InterfaceC1263uq) c1423ye.f11401f.c());
        ((Bn) op.f6526q).f4174o.set(interfaceC0096x);
        ?? obj = new Object();
        obj.f8078q = c1423ye;
        obj.f8076o = context;
        obj.f8079r = op;
        obj.f8077p = ip;
        obj.f8080s = c1423ye.d();
        ip.f5741q = (Bn) op.f6526q;
        this.f11301o = new Op(20, (Object) obj, ip.c);
    }

    @Override // O1.C
    public final void B0(O1.U0 u02) {
        this.f11301o.v(u02, 1);
    }

    @Override // O1.C
    public final synchronized String a() {
        return this.f11301o.k();
    }

    @Override // O1.C
    public final synchronized String d() {
        return this.f11301o.q();
    }

    @Override // O1.C
    public final synchronized boolean g() {
        return this.f11301o.z();
    }

    @Override // O1.C
    public final synchronized void i1(O1.U0 u02, int i4) {
        this.f11301o.v(u02, i4);
    }
}
