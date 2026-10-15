package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.ads.C0544dz;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.play_billing.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1608d0 implements InterfaceC1622k0 {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC1627n f12198a;

    /* renamed from: b, reason: collision with root package name */
    public final C1630o0 f12199b;
    public final C1646x c;

    public C1608d0(C1630o0 c1630o0, C1646x c1646x, AbstractC1627n abstractC1627n) {
        this.f12199b = c1630o0;
        this.c = c1646x;
        this.f12198a = abstractC1627n;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1622k0
    public final E a() {
        AbstractC1627n abstractC1627n = this.f12198a;
        return abstractC1627n instanceof E ? (E) ((E) abstractC1627n).k(4) : ((D) ((E) abstractC1627n).k(5)).b();
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1622k0
    public final void b(Object obj) {
        this.f12199b.getClass();
        C1628n0 c1628n0 = ((E) obj).zzc;
        if (c1628n0.f12236e) {
            c1628n0.f12236e = false;
        }
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1622k0
    public final boolean c(Object obj) {
        this.c.getClass();
        U.a.t(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1622k0
    public final void d(Object obj, Object obj2) {
        AbstractC1624l0.r(this.f12199b, obj, obj2);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1622k0
    public final boolean e(E e4, E e5) {
        this.f12199b.getClass();
        return e4.zzc.equals(e5.zzc);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1622k0
    public final void f(Object obj, W w2) {
        this.c.getClass();
        U.a.t(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1622k0
    public final void g(Object obj, byte[] bArr, int i4, int i5, C0544dz c0544dz) {
        E e4 = (E) obj;
        if (e4.zzc == C1628n0.f12233f) {
            e4.zzc = C1628n0.b();
        }
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1622k0
    public final int h(AbstractC1627n abstractC1627n) {
        this.f12199b.getClass();
        C1628n0 c1628n0 = ((E) abstractC1627n).zzc;
        int i4 = c1628n0.d;
        if (i4 != -1) {
            return i4;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < c1628n0.f12234a; i6++) {
            int i7 = c1628n0.f12235b[i6] >>> 3;
            C1638t c1638t = (C1638t) c1628n0.c[i6];
            int l02 = C1640u.l0(8);
            int l03 = C1640u.l0(i7) + C1640u.l0(16);
            int l04 = C1640u.l0(24);
            int j4 = c1638t.j();
            i5 += l02 + l02 + l03 + U.a.v(j4, j4, l04);
        }
        c1628n0.d = i5;
        return i5;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1622k0
    public final int i(E e4) {
        this.f12199b.getClass();
        return e4.zzc.hashCode();
    }
}
