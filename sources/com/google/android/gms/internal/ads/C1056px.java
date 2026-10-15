package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentMap;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.px, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1056px implements InterfaceC1182sv {

    /* renamed from: a, reason: collision with root package name */
    public static final C1056px f10058a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final Ow f10059b = new Ow(Aw.class, InterfaceC1011ov.class, Yv.f7910G);

    @Override // com.google.android.gms.internal.ads.InterfaceC1182sv
    public final Object a(C0882lv c0882lv) {
        Iterator it = ((ConcurrentMap) c0882lv.f9507q).values().iterator();
        while (it.hasNext()) {
            for (C1097qv c1097qv : (List) it.next()) {
                Bs bs = c1097qv.f10430g;
                if (bs instanceof AbstractC0927mx) {
                    AbstractC0927mx abstractC0927mx = (AbstractC0927mx) bs;
                    byte[] bArr = c1097qv.c;
                    Zy a4 = Zy.a(bArr == null ? null : Arrays.copyOf(bArr, bArr.length));
                    if (!a4.equals(abstractC0927mx.s0())) {
                        throw new GeneralSecurityException(n0.a.j(U.a.n("Mac Key with parameters ", String.valueOf(abstractC0927mx.r0()), " has wrong output prefix (", abstractC0927mx.s0().toString(), ") instead of ("), a4.toString(), ")"));
                    }
                }
            }
        }
        return new C1013ox(c0882lv);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1182sv
    public final Class b() {
        return InterfaceC1011ov.class;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1182sv
    public final Class c() {
        return InterfaceC1011ov.class;
    }
}
