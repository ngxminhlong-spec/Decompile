package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.gs, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0666gs extends AbstractRunnableC1008os {

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f8875p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ x0.f f8876q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ A2.i f8877r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C0836ks f8878s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f8879t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0666gs(C0836ks c0836ks, A2.i iVar, Object obj, x0.f fVar, A2.i iVar2, int i4) {
        super(iVar);
        this.f8875p = i4;
        this.f8878s = c0836ks;
        this.f8879t = obj;
        this.f8876q = fVar;
        this.f8877r = iVar2;
    }

    @Override // com.google.android.gms.internal.ads.AbstractRunnableC1008os
    public final void a() {
        int i4 = this.f8875p;
        A2.i iVar = this.f8877r;
        x0.f fVar = this.f8876q;
        Object obj = this.f8879t;
        C0836ks c0836ks = this.f8878s;
        switch (i4) {
            case 0:
                String str = c0836ks.f9328b;
                try {
                    InterfaceC0965ns interfaceC0965ns = c0836ks.f9327a.f11089m;
                    C0537ds c0537ds = (C0537ds) obj;
                    Bundle bundle = new Bundle();
                    bundle.putBinder("windowToken", c0537ds.f8517a);
                    bundle.putString("adFieldEnifd", c0537ds.f8520f);
                    bundle.putInt("layoutGravity", c0537ds.c);
                    bundle.putFloat("layoutVerticalMargin", c0537ds.d);
                    bundle.putInt("displayMode", 0);
                    bundle.putInt("windowWidthPx", c0537ds.f8519e);
                    bundle.putString("deeplinkUrl", null);
                    bundle.putBoolean("stableSessionToken", false);
                    bundle.putString("callerPackage", str);
                    String str2 = c0537ds.f8518b;
                    if (str2 != null) {
                        bundle.putString("appId", str2);
                    }
                    interfaceC0965ns.o1(str, bundle, new BinderC0793js(c0836ks, fVar));
                    return;
                } catch (RemoteException e4) {
                    C0836ks.c.f(e4, "show overlay display from: %s", str);
                    iVar.c(new RuntimeException(e4));
                    return;
                }
            default:
                String str3 = c0836ks.f9328b;
                try {
                    InterfaceC0965ns interfaceC0965ns2 = c0836ks.f9327a.f11089m;
                    C0453bs c0453bs = (C0453bs) obj;
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("sessionToken", c0453bs.f8295a);
                    bundle2.putString("callerPackage", str3);
                    bundle2.putString("appId", c0453bs.f8296b);
                    interfaceC0965ns2.v3(bundle2, new BinderC0793js(c0836ks, fVar));
                    return;
                } catch (RemoteException e5) {
                    C0836ks.c.f(e5, "dismiss overlay display from: %s", str3);
                    iVar.c(new RuntimeException(e5));
                    return;
                }
        }
    }
}
