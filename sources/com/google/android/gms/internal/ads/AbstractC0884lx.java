package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.lx, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0884lx {
    static {
        new C0714hx();
        int i4 = Ky.f6081a;
        try {
            a();
        } catch (GeneralSecurityException e4) {
            throw new ExceptionInInitializerError(e4);
        }
    }

    public static void a() {
        AbstractC1311vv.c(C1056px.f10058a);
        Hw hw = Hw.f5518b;
        hw.c(C1056px.f10059b);
        AbstractC1311vv.c(Cv.c);
        AbstractC1311vv.b(new C0714hx());
        C0339Se c0339Se = AbstractC1141rx.f10554a;
        Iw iw = Iw.f5771b;
        iw.f(AbstractC1141rx.c);
        iw.e(AbstractC1141rx.d);
        iw.d(AbstractC1141rx.f10556e);
        iw.c(AbstractC1141rx.f10557f);
        hw.c(C0714hx.d);
        hw.c(C0714hx.f9013e);
        Gw gw = Gw.f5352b;
        HashMap hashMap = new HashMap();
        hashMap.put("HMAC_SHA256_128BITTAG", AbstractC1099qx.f10434a);
        u0.g gVar = new u0.g(17);
        gVar.u(32);
        gVar.z(16);
        C0798jx c0798jx = C0798jx.f9234e;
        gVar.f14986s = c0798jx;
        C0755ix c0755ix = C0755ix.d;
        gVar.f14985r = c0755ix;
        hashMap.put("HMAC_SHA256_128BITTAG_RAW", gVar.G());
        u0.g gVar2 = new u0.g(17);
        gVar2.u(32);
        gVar2.z(32);
        C0798jx c0798jx2 = C0798jx.f9233b;
        gVar2.f14986s = c0798jx2;
        gVar2.f14985r = c0755ix;
        hashMap.put("HMAC_SHA256_256BITTAG", gVar2.G());
        u0.g gVar3 = new u0.g(17);
        gVar3.u(32);
        gVar3.z(32);
        gVar3.f14986s = c0798jx;
        gVar3.f14985r = c0755ix;
        hashMap.put("HMAC_SHA256_256BITTAG_RAW", gVar3.G());
        u0.g gVar4 = new u0.g(17);
        gVar4.u(64);
        gVar4.z(16);
        gVar4.f14986s = c0798jx2;
        C0755ix c0755ix2 = C0755ix.f9101f;
        gVar4.f14985r = c0755ix2;
        hashMap.put("HMAC_SHA512_128BITTAG", gVar4.G());
        u0.g gVar5 = new u0.g(17);
        gVar5.u(64);
        gVar5.z(16);
        gVar5.f14986s = c0798jx;
        gVar5.f14985r = c0755ix2;
        hashMap.put("HMAC_SHA512_128BITTAG_RAW", gVar5.G());
        u0.g gVar6 = new u0.g(17);
        gVar6.u(64);
        gVar6.z(32);
        gVar6.f14986s = c0798jx2;
        gVar6.f14985r = c0755ix2;
        hashMap.put("HMAC_SHA512_256BITTAG", gVar6.G());
        u0.g gVar7 = new u0.g(17);
        gVar7.u(64);
        gVar7.z(32);
        gVar7.f14986s = c0798jx;
        gVar7.f14985r = c0755ix2;
        hashMap.put("HMAC_SHA512_256BITTAG_RAW", gVar7.G());
        hashMap.put("HMAC_SHA512_512BITTAG", AbstractC1099qx.f10435b);
        u0.g gVar8 = new u0.g(17);
        gVar8.u(64);
        gVar8.z(64);
        gVar8.f14986s = c0798jx;
        gVar8.f14985r = c0755ix2;
        hashMap.put("HMAC_SHA512_512BITTAG_RAW", gVar8.G());
        gw.c(Collections.unmodifiableMap(hashMap));
        Dw.f4803b.a(Ev.f4960e, C0841kx.class);
        if (AbstractC1140rw.a()) {
            return;
        }
        AbstractC1311vv.b(new AbstractC1441yw(C1442yx.class, new Fv(InterfaceC1011ov.class, 9)));
        iw.f(AbstractC0585ex.f8659a);
        iw.e(AbstractC0585ex.f8660b);
        iw.d(AbstractC0585ex.c);
        iw.c(AbstractC0585ex.d);
        hw.c(C0500cx.d);
        hw.c(C0500cx.f8430e);
        HashMap hashMap2 = new HashMap();
        C0542dx c0542dx = AbstractC1099qx.c;
        hashMap2.put("AES_CMAC", c0542dx);
        hashMap2.put("AES256_CMAC", c0542dx);
        C0882lv c0882lv = new C0882lv();
        c0882lv.o(32);
        c0882lv.p(16);
        c0882lv.f9506p = Iv.f5759K;
        hashMap2.put("AES256_CMAC_RAW", c0882lv.w());
        gw.c(Collections.unmodifiableMap(hashMap2));
    }
}
