package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentMap;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Cv implements InterfaceC1182sv {

    /* renamed from: b, reason: collision with root package name */
    public static final Cv f4558b = new Cv(0);
    public static final Cv c = new Cv(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4559a;

    public /* synthetic */ Cv(int i4) {
        this.f4559a = i4;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1182sv
    public final Object a(C0882lv c0882lv) {
        switch (this.f4559a) {
            case 0:
                return new Bv(c0882lv);
            default:
                if (((C1097qv) c0882lv.f9508r) == null) {
                    throw new GeneralSecurityException("no primary in primitive set");
                }
                Iterator it = ((ConcurrentMap) c0882lv.f9507q).values().iterator();
                while (it.hasNext()) {
                    Iterator it2 = ((List) it.next()).iterator();
                    while (it2.hasNext()) {
                    }
                }
                return new Object();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1182sv
    public final Class b() {
        switch (this.f4559a) {
            case 0:
                return InterfaceC0583ev.class;
            default:
                return C0628fx.class;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1182sv
    public final Class c() {
        switch (this.f4559a) {
            case 0:
                return InterfaceC0583ev.class;
            default:
                return C0628fx.class;
        }
    }
}
