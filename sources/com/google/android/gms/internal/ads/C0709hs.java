package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.hs, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0709hs extends AbstractRunnableC1008os {

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C0623fs f9002p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f9003q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ x0.f f9004r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ A2.i f9005s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C0836ks f9006t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0709hs(C0836ks c0836ks, A2.i iVar, C0623fs c0623fs, int i4, x0.f fVar, A2.i iVar2) {
        super(iVar);
        this.f9006t = c0836ks;
        this.f9002p = c0623fs;
        this.f9003q = i4;
        this.f9004r = fVar;
        this.f9005s = iVar2;
    }

    @Override // com.google.android.gms.internal.ads.AbstractRunnableC1008os
    public final void a() {
        int i4 = this.f9003q;
        C0836ks c0836ks = this.f9006t;
        String str = c0836ks.f9328b;
        try {
            InterfaceC0965ns interfaceC0965ns = c0836ks.f9327a.f11089m;
            C0623fs c0623fs = this.f9002p;
            Bundle bundle = new Bundle();
            bundle.putString("sessionToken", c0623fs.f8750a);
            bundle.putInt("displayMode", i4);
            bundle.putString("callerPackage", str);
            bundle.putString("appId", c0623fs.f8751b);
            interfaceC0965ns.M1(bundle, new BinderC0793js(c0836ks, this.f9004r));
        } catch (RemoteException e4) {
            C0836ks.c.f(e4, "switchDisplayMode overlay display to %d from: %s", Integer.valueOf(i4), str);
            this.f9005s.c(new RuntimeException(e4));
        }
    }
}
