package com.google.android.gms.internal.ads;

import c3.InterfaceFutureC0239a;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.oo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1004oo implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f9852o = 1;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f9853p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f9854q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f9855r;

    public /* synthetic */ RunnableC1004oo(AbstractC1439yu abstractC1439yu, InterfaceFutureC0239a interfaceFutureC0239a, int i4) {
        this.f9854q = abstractC1439yu;
        this.f9855r = interfaceFutureC0239a;
        this.f9853p = i4;
    }

    public /* synthetic */ RunnableC1004oo(CopyOnWriteArraySet copyOnWriteArraySet, int i4, InterfaceC1132ro interfaceC1132ro) {
        this.f9854q = copyOnWriteArraySet;
        this.f9853p = i4;
        this.f9855r = interfaceC1132ro;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9852o) {
            case 0:
                Iterator it = ((CopyOnWriteArraySet) this.f9854q).iterator();
                while (it.hasNext()) {
                    InterfaceC1132ro interfaceC1132ro = (InterfaceC1132ro) this.f9855r;
                    Ho ho = (Ho) it.next();
                    if (!ho.d) {
                        int i4 = this.f9853p;
                        if (i4 != -1) {
                            ho.f5510b.e(i4);
                        }
                        ho.c = true;
                        interfaceC1132ro.mo6l(ho.f5509a);
                    }
                }
                return;
            default:
                AbstractC1439yu abstractC1439yu = (AbstractC1439yu) this.f9854q;
                InterfaceFutureC0239a interfaceFutureC0239a = (InterfaceFutureC0239a) this.f9855r;
                int i5 = this.f9853p;
                abstractC1439yu.getClass();
                try {
                    if (interfaceFutureC0239a.isCancelled()) {
                        abstractC1439yu.f11549z = null;
                        abstractC1439yu.cancel(false);
                    } else {
                        abstractC1439yu.q(i5, interfaceFutureC0239a);
                    }
                    abstractC1439yu.r(null);
                    return;
                } catch (Throwable th) {
                    abstractC1439yu.r(null);
                    throw th;
                }
        }
    }
}
