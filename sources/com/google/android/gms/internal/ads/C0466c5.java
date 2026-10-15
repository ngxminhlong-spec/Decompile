package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import h2.InterfaceC1703b;
import h2.InterfaceC1704c;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.c5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0466c5 extends N1.b {

    /* renamed from: M, reason: collision with root package name */
    public final /* synthetic */ int f8345M = 1;

    public /* synthetic */ C0466c5(int i4, Context context, Looper looper, InterfaceC1703b interfaceC1703b, InterfaceC1704c interfaceC1704c) {
        super(i4, context, looper, interfaceC1703b, interfaceC1704c);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0466c5(android.content.Context r8, android.os.Looper r9, com.google.android.gms.internal.ads.AbstractC0702hl r10, com.google.android.gms.internal.ads.AbstractC0702hl r11) {
        /*
            r7 = this;
            r0 = 2
            r7.f8345M = r0
            int r0 = com.google.android.gms.internal.ads.AbstractC0649gb.f8820a
            android.content.Context r0 = r8.getApplicationContext()
            if (r0 != 0) goto Ld
            r3 = r8
            goto Le
        Ld:
            r3 = r0
        Le:
            r2 = 8
            r1 = r7
            r4 = r9
            r5 = r10
            r6 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C0466c5.<init>(android.content.Context, android.os.Looper, com.google.android.gms.internal.ads.hl, com.google.android.gms.internal.ads.hl):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0466c5(android.content.Context r8, android.os.Looper r9, h2.InterfaceC1703b r10, h2.InterfaceC1704c r11) {
        /*
            r7 = this;
            r0 = 0
            r7.f8345M = r0
            int r0 = com.google.android.gms.internal.ads.AbstractC0649gb.f8820a
            android.content.Context r0 = r8.getApplicationContext()
            if (r0 != 0) goto Ld
            r3 = r8
            goto Le
        Ld:
            r3 = r0
        Le:
            r2 = 123(0x7b, float:1.72E-43)
            r1 = r7
            r4 = r9
            r5 = r10
            r6 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C0466c5.<init>(android.content.Context, android.os.Looper, h2.b, h2.c):void");
    }

    public boolean A() {
        e2.d[] h4 = h();
        if (((Boolean) O1.r.d.c.a(AbstractC1066q6.f10094D1)).booleanValue()) {
            int length = h4 != null ? h4.length : 0;
            int i4 = 0;
            while (true) {
                if (i4 >= length) {
                    break;
                }
                if (!h2.y.m(h4[i4], H1.r.f884a)) {
                    i4++;
                } else if (i4 >= 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // h2.AbstractC1706e
    public final IInterface o(IBinder iBinder) {
        switch (this.f8345M) {
            case 0:
                if (iBinder == null) {
                    return null;
                }
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.cache.ICacheService");
                return queryLocalInterface instanceof C0551e5 ? (C0551e5) queryLocalInterface : new AbstractC1106r4(iBinder, "com.google.android.gms.ads.internal.cache.ICacheService", 0);
            case 1:
                if (iBinder == null) {
                    return null;
                }
                IInterface queryLocalInterface2 = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
                return queryLocalInterface2 instanceof C1196t8 ? (C1196t8) queryLocalInterface2 : new AbstractC1106r4(iBinder, "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService", 0);
            default:
                if (iBinder == null) {
                    return null;
                }
                IInterface queryLocalInterface3 = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
                return queryLocalInterface3 instanceof InterfaceC0325Qa ? (InterfaceC0325Qa) queryLocalInterface3 : new AbstractC1106r4(iBinder, "com.google.android.gms.ads.internal.request.IAdRequestService", 0);
        }
    }

    @Override // h2.AbstractC1706e
    public e2.d[] q() {
        switch (this.f8345M) {
            case 0:
                return H1.r.f885b;
            default:
                return super.q();
        }
    }

    @Override // h2.AbstractC1706e
    public final String u() {
        switch (this.f8345M) {
            case 0:
                return "com.google.android.gms.ads.internal.cache.ICacheService";
            case 1:
                return "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService";
            default:
                return "com.google.android.gms.ads.internal.request.IAdRequestService";
        }
    }

    @Override // h2.AbstractC1706e
    public final String v() {
        switch (this.f8345M) {
            case 0:
                return "com.google.android.gms.ads.service.CACHE";
            case 1:
                return "com.google.android.gms.ads.service.HTTP";
            default:
                return "com.google.android.gms.ads.service.START";
        }
    }
}
