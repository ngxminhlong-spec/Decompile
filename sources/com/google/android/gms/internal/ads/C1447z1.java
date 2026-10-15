package com.google.android.gms.internal.ads;

import java.io.EOFException;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.z1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1447z1 {

    /* renamed from: a, reason: collision with root package name */
    public int f11563a;

    /* renamed from: b, reason: collision with root package name */
    public long f11564b;
    public int c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f11565e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f11566f = new int[255];

    /* renamed from: g, reason: collision with root package name */
    public final C1134rq f11567g = new C1134rq(255);

    public final boolean a(C c, boolean z4) {
        boolean z5;
        boolean z6;
        this.f11563a = 0;
        this.f11564b = 0L;
        this.c = 0;
        this.d = 0;
        this.f11565e = 0;
        C1134rq c1134rq = this.f11567g;
        c1134rq.b(27);
        try {
            z5 = c.E(c1134rq.f10536a, 0, 27, z4);
        } catch (EOFException e4) {
            if (!z4) {
                throw e4;
            }
            z5 = false;
        }
        if (z5 && c1134rq.u() == 1332176723) {
            if (c1134rq.m() == 0) {
                this.f11563a = c1134rq.m();
                this.f11564b = c1134rq.r();
                c1134rq.s();
                c1134rq.s();
                c1134rq.s();
                int m4 = c1134rq.m();
                this.c = m4;
                this.d = m4 + 27;
                c1134rq.b(m4);
                try {
                    z6 = c.E(c1134rq.f10536a, 0, this.c, z4);
                } catch (EOFException e5) {
                    if (!z4) {
                        throw e5;
                    }
                    z6 = false;
                }
                if (z6) {
                    for (int i4 = 0; i4 < this.c; i4++) {
                        int m5 = c1134rq.m();
                        this.f11566f[i4] = m5;
                        this.f11565e += m5;
                    }
                    return true;
                }
            } else if (!z4) {
                throw C0907md.b("unsupported bit stream revision");
            }
        }
        return false;
    }

    public final boolean b(C c, long j4) {
        boolean z4;
        Zf.O(c.d() == c.a());
        C1134rq c1134rq = this.f11567g;
        c1134rq.b(4);
        while (true) {
            if (j4 != -1 && c.d() + 4 >= j4) {
                break;
            }
            try {
                z4 = c.E(c1134rq.f10536a, 0, 4, true);
            } catch (EOFException unused) {
                z4 = false;
            }
            if (!z4) {
                break;
            }
            c1134rq.e(0);
            if (c1134rq.u() == 1332176723) {
                c.j();
                return true;
            }
            ((C1316w) c).f(1);
        }
        do {
            if (j4 != -1 && c.d() >= j4) {
                break;
            }
        } while (c.e() != -1);
        return false;
    }
}
