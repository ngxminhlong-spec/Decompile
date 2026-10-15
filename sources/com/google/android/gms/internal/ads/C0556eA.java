package com.google.android.gms.internal.ads;

import java.util.logging.Logger;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.eA, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0556eA implements InterfaceC0984oA {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0417az f8583a;

    /* renamed from: b, reason: collision with root package name */
    public final C1198tA f8584b;
    public final C1358wz c;

    public C0556eA(C1198tA c1198tA, C1358wz c1358wz, AbstractC0417az abstractC0417az) {
        this.f8584b = c1198tA;
        this.c = c1358wz;
        this.f8583a = abstractC0417az;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0984oA
    public final Dz a() {
        AbstractC0417az abstractC0417az = this.f8583a;
        return abstractC0417az instanceof Dz ? ((Dz) abstractC0417az).j() : ((Cz) ((Dz) abstractC0417az).s(5, null)).c();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0984oA
    public final void b(Object obj) {
        this.f8584b.getClass();
        C1155sA c1155sA = ((Dz) obj).zzc;
        if (c1155sA.f10599e) {
            c1155sA.f10599e = false;
        }
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0984oA
    public final boolean c(Object obj) {
        this.c.getClass();
        U.a.t(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0984oA
    public final void d(Object obj, Object obj2) {
        AbstractC1027pA.r(this.f8584b, obj, obj2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0984oA
    public final int e(Dz dz) {
        this.f8584b.getClass();
        return dz.zzc.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0984oA
    public final void f(Object obj, C1384xi c1384xi) {
        this.c.getClass();
        U.a.t(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0984oA
    public final int g(AbstractC0417az abstractC0417az) {
        this.f8584b.getClass();
        C1155sA c1155sA = ((Dz) abstractC0417az).zzc;
        int i4 = c1155sA.d;
        if (i4 != -1) {
            return i4;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < c1155sA.f10597a; i6++) {
            int i7 = c1155sA.f10598b[i6] >>> 3;
            AbstractC0886lz abstractC0886lz = (AbstractC0886lz) c1155sA.c[i6];
            Logger logger = AbstractC1229tz.c;
            int l4 = abstractC0886lz.l();
            int z4 = AbstractC1229tz.z(l4) + l4;
            int z5 = AbstractC1229tz.z(16);
            int z6 = AbstractC1229tz.z(i7);
            int z7 = AbstractC1229tz.z(8);
            i5 += AbstractC1229tz.z(24) + z4 + z5 + z6 + z7 + z7;
        }
        c1155sA.d = i5;
        return i5;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0984oA
    public final void h(Object obj, C1058pz c1058pz, C1315vz c1315vz) {
        this.f8584b.getClass();
        C1198tA.a(obj);
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0984oA
    public final boolean i(Dz dz, Dz dz2) {
        this.f8584b.getClass();
        return dz.zzc.equals(dz2.zzc);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0984oA
    public final void j(Object obj, byte[] bArr, int i4, int i5, C0544dz c0544dz) {
        Dz dz = (Dz) obj;
        if (dz.zzc == C1155sA.f10596f) {
            dz.zzc = C1155sA.b();
        }
        obj.getClass();
        throw new ClassCastException();
    }
}
