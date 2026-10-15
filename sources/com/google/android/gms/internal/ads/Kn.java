package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import c3.InterfaceFutureC0239a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import o2.AbstractC1895f;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Kn implements Go {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6058a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f6059b;

    public /* synthetic */ Kn(int i4, Object obj) {
        this.f6058a = i4;
        this.f6059b = obj;
    }

    @Override // com.google.android.gms.internal.ads.Go
    public final int b() {
        switch (this.f6058a) {
            case 0:
                return 2;
            case 1:
                return 8;
            case 2:
                return 15;
            case 3:
                return 25;
            case 4:
                return 30;
            default:
                return 49;
        }
    }

    @Override // com.google.android.gms.internal.ads.Go
    public final InterfaceFutureC0239a c() {
        String str;
        switch (this.f6058a) {
            case 0:
                if (((Boolean) O1.r.d.c.a(AbstractC1066q6.f10288t2)).booleanValue()) {
                    return Bs.h0(new Ln(0, AbstractC1895f.g((Context) this.f6059b, "com.google.android.gms.permission.AD_ID") == 0));
                }
                return Pu.f6608p;
            case 1:
                ArrayList arrayList = new ArrayList();
                Iterator it = ((Set) this.f6059b).iterator();
                while (it.hasNext()) {
                    arrayList.add((String) it.next());
                }
                return Bs.h0(new Wn(0, arrayList));
            case 2:
                C0492cp c0492cp = (C0492cp) this.f6059b;
                C0619fo c0619fo = null;
                if (c0492cp != null && (str = c0492cp.f8416a) != null && !str.isEmpty()) {
                    c0619fo = new C0619fo(1, this);
                }
                return Bs.h0(c0619fo);
            case 3:
                return Bs.h0(new C0619fo(3, (C1391xp) this.f6059b));
            case 4:
                return Bs.h0(new Xn(3, (Bundle) this.f6059b));
            default:
                return Bs.m0(Bs.o0(Bs.h0(new Bundle()), ((Long) O1.r.d.c.a(AbstractC1066q6.f10086B3)).longValue(), TimeUnit.MILLISECONDS, (ScheduledExecutorService) this.f6059b), C0932n1.f9707q, AbstractC0266Ec.f4897a);
        }
    }
}
