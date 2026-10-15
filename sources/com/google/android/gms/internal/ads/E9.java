package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class E9 implements S1.c {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f4851o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1283v9 f4852p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ G9 f4853q;

    public /* synthetic */ E9(G9 g9, InterfaceC1283v9 interfaceC1283v9, int i4) {
        this.f4851o = i4;
        this.f4853q = g9;
        this.f4852p = interfaceC1283v9;
    }

    @Override // S1.c
    public final void f(H1.a aVar) {
        switch (this.f4851o) {
            case 0:
                InterfaceC1283v9 interfaceC1283v9 = this.f4852p;
                try {
                    String canonicalName = this.f4853q.f5136o.getClass().getCanonicalName();
                    int i4 = aVar.f855p;
                    String str = (String) aVar.f856q;
                    Y9.m(canonicalName + "failed to loaded mediation ad: ErrorCode = " + i4 + ". ErrorMessage = " + str + ". ErrorDomain = " + ((String) aVar.f857r));
                    interfaceC1283v9.H1(aVar.a());
                    interfaceC1283v9.Z2(str, i4);
                    interfaceC1283v9.v(i4);
                    return;
                } catch (RemoteException e4) {
                    Y9.q("", e4);
                    return;
                }
            default:
                InterfaceC1283v9 interfaceC1283v92 = this.f4852p;
                try {
                    String canonicalName2 = this.f4853q.f5136o.getClass().getCanonicalName();
                    int i5 = aVar.f855p;
                    String str2 = (String) aVar.f856q;
                    Y9.m(canonicalName2 + "failed to load mediation ad: ErrorCode = " + i5 + ". ErrorMessage = " + str2 + ". ErrorDomain = " + ((String) aVar.f857r));
                    interfaceC1283v92.H1(aVar.a());
                    interfaceC1283v92.Z2(str2, i5);
                    interfaceC1283v92.v(i5);
                    return;
                } catch (RemoteException e5) {
                    Y9.q("", e5);
                    return;
                }
        }
    }
}
