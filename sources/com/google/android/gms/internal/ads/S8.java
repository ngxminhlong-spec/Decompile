package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Map;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class S8 implements InterfaceC0597f8 {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f6949o = 1;

    /* renamed from: p, reason: collision with root package name */
    public final Object f6950p;

    /* renamed from: q, reason: collision with root package name */
    public final Object f6951q;

    /* renamed from: r, reason: collision with root package name */
    public final Object f6952r;

    public S8(Gi gi, Ci ci, Aj aj, InterfaceC1328wB interfaceC1328wB) {
        this.f6950p = (G7) gi.f5320g.get(ci.a());
        this.f6951q = aj;
        this.f6952r = interfaceC1328wB;
    }

    public S8(Z8 z8, M8 m8, x0.f fVar) {
        this.f6952r = z8;
        this.f6950p = m8;
        this.f6951q = fVar;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0597f8
    public final void h(Object obj, Map map) {
        switch (this.f6949o) {
            case 0:
                Q1.I.w("loadJavascriptEngine > /requestReload handler: Trying to acquire lock");
                synchronized (((Z8) this.f6952r).c) {
                    try {
                        Q1.I.w("loadJavascriptEngine > /requestReload handler: Lock acquired");
                        Y9.r("JS Engine is requesting an update");
                        if (((Z8) this.f6952r).f7965b == 0) {
                            Y9.r("Starting reload.");
                            Z8 z8 = (Z8) this.f6952r;
                            z8.f7965b = 2;
                            z8.c();
                        }
                        ((M8) this.f6950p).e("/requestReload", (S8) ((x0.f) this.f6951q).f15212p);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                Q1.I.w("loadJavascriptEngine > /requestReload handler: Lock released");
                return;
            default:
                String str = (String) map.get("asset");
                try {
                    ((G7) this.f6950p).G0((C7) ((InterfaceC1328wB) this.f6952r).c(), str);
                    return;
                } catch (RemoteException e4) {
                    Y9.t("Failed to call onCustomClick for asset " + str + ".", e4);
                    return;
                }
        }
    }
}
