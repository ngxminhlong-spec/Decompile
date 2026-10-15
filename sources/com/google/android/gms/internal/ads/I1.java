package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class I1 implements J1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5523a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f5524b;
    public long c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f5525e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f5526f;

    /* renamed from: g, reason: collision with root package name */
    public Object f5527g;

    public I1() {
        this.f5523a = 1;
        this.f5526f = new C1134rq(10);
        this.c = -9223372036854775807L;
    }

    public I1(List list) {
        this.f5523a = 0;
        this.f5526f = list;
        this.f5527g = new V[list.size()];
        this.c = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.J1
    public final void a() {
        switch (this.f5523a) {
            case 0:
                this.f5524b = false;
                this.c = -9223372036854775807L;
                return;
            default:
                this.f5524b = false;
                this.c = -9223372036854775807L;
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.J1
    public final void f(C1134rq c1134rq) {
        boolean z4;
        boolean z5;
        switch (this.f5523a) {
            case 0:
                if (this.f5524b) {
                    if (this.d == 2) {
                        if (c1134rq.g() == 0) {
                            z5 = false;
                        } else {
                            if (c1134rq.m() != 32) {
                                this.f5524b = false;
                            }
                            this.d--;
                            z5 = this.f5524b;
                        }
                        if (!z5) {
                            return;
                        }
                    }
                    if (this.d == 1) {
                        if (c1134rq.g() == 0) {
                            z4 = false;
                        } else {
                            if (c1134rq.m() != 0) {
                                this.f5524b = false;
                            }
                            this.d--;
                            z4 = this.f5524b;
                        }
                        if (!z4) {
                            return;
                        }
                    }
                    int i4 = c1134rq.f10537b;
                    int g4 = c1134rq.g();
                    for (V v4 : (V[]) this.f5527g) {
                        c1134rq.e(i4);
                        v4.f(g4, c1134rq);
                    }
                    this.f5525e += g4;
                    return;
                }
                return;
            default:
                C1134rq c1134rq2 = (C1134rq) this.f5526f;
                Zf.C((V) this.f5527g);
                if (this.f5524b) {
                    int g5 = c1134rq.g();
                    int i5 = this.f5525e;
                    if (i5 < 10) {
                        int min = Math.min(g5, 10 - i5);
                        System.arraycopy(c1134rq.f10536a, c1134rq.f10537b, c1134rq2.f10536a, this.f5525e, min);
                        if (this.f5525e + min == 10) {
                            c1134rq2.e(0);
                            if (c1134rq2.m() != 73 || c1134rq2.m() != 68 || c1134rq2.m() != 51) {
                                Wj.l("Id3Reader", "Discarding invalid ID3 tag");
                                this.f5524b = false;
                                return;
                            } else {
                                c1134rq2.f(3);
                                this.d = c1134rq2.l() + 10;
                            }
                        }
                    }
                    int min2 = Math.min(g5, this.d - this.f5525e);
                    ((V) this.f5527g).f(min2, c1134rq);
                    this.f5525e += min2;
                    return;
                }
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.J1
    public final void g(boolean z4) {
        int i4;
        switch (this.f5523a) {
            case 0:
                if (this.f5524b) {
                    if (this.c != -9223372036854775807L) {
                        for (V v4 : (V[]) this.f5527g) {
                            v4.d(this.c, 1, this.f5525e, 0, null);
                        }
                    }
                    this.f5524b = false;
                    return;
                }
                return;
            default:
                Zf.C((V) this.f5527g);
                if (this.f5524b && (i4 = this.d) != 0 && this.f5525e == i4) {
                    long j4 = this.c;
                    if (j4 != -9223372036854775807L) {
                        ((V) this.f5527g).d(j4, 1, i4, 0, null);
                    }
                    this.f5524b = false;
                    return;
                }
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.J1
    public final void h(D d, C0591f2 c0591f2) {
        switch (this.f5523a) {
            case 0:
                V[] vArr = (V[]) this.f5527g;
                for (int i4 = 0; i4 < vArr.length; i4++) {
                    C0548e2 c0548e2 = (C0548e2) ((List) this.f5526f).get(i4);
                    c0591f2.a();
                    c0591f2.b();
                    V z4 = d.z(c0591f2.d, 3);
                    L1 l12 = new L1();
                    c0591f2.b();
                    l12.f6094a = c0591f2.f8675e;
                    l12.f6101j = "application/dvbsubs";
                    l12.f6103l = Collections.singletonList(c0548e2.f8551b);
                    l12.c = c0548e2.f8550a;
                    z4.a(new C0976o2(l12));
                    vArr[i4] = z4;
                }
                return;
            default:
                c0591f2.a();
                c0591f2.b();
                V z5 = d.z(c0591f2.d, 5);
                this.f5527g = z5;
                L1 l13 = new L1();
                c0591f2.b();
                l13.f6094a = c0591f2.f8675e;
                l13.f6101j = "application/id3";
                z5.a(new C0976o2(l13));
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.J1
    public final void i(int i4, long j4) {
        switch (this.f5523a) {
            case 0:
                if ((i4 & 4) == 0) {
                    return;
                }
                this.f5524b = true;
                if (j4 != -9223372036854775807L) {
                    this.c = j4;
                }
                this.f5525e = 0;
                this.d = 2;
                return;
            default:
                if ((i4 & 4) == 0) {
                    return;
                }
                this.f5524b = true;
                if (j4 != -9223372036854775807L) {
                    this.c = j4;
                }
                this.d = 0;
                this.f5525e = 0;
                return;
        }
    }
}
