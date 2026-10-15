package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.b2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0421b2 implements InterfaceC0634g2 {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0378a2 f8194a;

    /* renamed from: b, reason: collision with root package name */
    public final C1134rq f8195b = new C1134rq(32);
    public int c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f8196e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f8197f;

    public C0421b2(InterfaceC0378a2 interfaceC0378a2) {
        this.f8194a = interfaceC0378a2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0634g2
    public final void a(int i4, C1134rq c1134rq) {
        int i5 = i4 & 1;
        int m4 = i5 != 0 ? c1134rq.f10537b + c1134rq.m() : -1;
        if (this.f8197f) {
            if (i5 == 0) {
                return;
            }
            this.f8197f = false;
            c1134rq.e(m4);
            this.d = 0;
        }
        while (c1134rq.g() > 0) {
            int i6 = this.d;
            C1134rq c1134rq2 = this.f8195b;
            if (i6 < 3) {
                if (i6 == 0) {
                    int m5 = c1134rq.m();
                    c1134rq.e(c1134rq.f10537b - 1);
                    if (m5 == 255) {
                        this.f8197f = true;
                        return;
                    }
                }
                int min = Math.min(c1134rq.g(), 3 - this.d);
                c1134rq.a(c1134rq2.f10536a, this.d, min);
                int i7 = this.d + min;
                this.d = i7;
                if (i7 == 3) {
                    c1134rq2.e(0);
                    c1134rq2.d(3);
                    c1134rq2.f(1);
                    int m6 = c1134rq2.m();
                    boolean z4 = (m6 & 128) != 0;
                    int m7 = c1134rq2.m();
                    this.f8196e = z4;
                    int i8 = (((m6 & 15) << 8) | m7) + 3;
                    this.c = i8;
                    byte[] bArr = c1134rq2.f10536a;
                    if (bArr.length < i8) {
                        int length = bArr.length;
                        int min2 = Math.min(4098, Math.max(i8, length + length));
                        byte[] bArr2 = c1134rq2.f10536a;
                        if (min2 > bArr2.length) {
                            c1134rq2.f10536a = Arrays.copyOf(bArr2, min2);
                        }
                    }
                }
            } else {
                int min3 = Math.min(c1134rq.g(), this.c - i6);
                c1134rq.a(c1134rq2.f10536a, this.d, min3);
                int i9 = this.d + min3;
                this.d = i9;
                int i10 = this.c;
                if (i9 != i10) {
                    continue;
                } else {
                    if (!this.f8196e) {
                        c1134rq2.d(i10);
                    } else {
                        if (AbstractC0751is.l(0, i10, -1, c1134rq2.f10536a) != 0) {
                            this.f8197f = true;
                            return;
                        }
                        c1134rq2.d(this.c - 4);
                    }
                    c1134rq2.e(0);
                    this.f8194a.f(c1134rq2);
                    this.d = 0;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0634g2
    public final void d(Sr sr, D d, C0591f2 c0591f2) {
        this.f8194a.d(sr, d, c0591f2);
        this.f8197f = true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0634g2
    public final void e() {
        this.f8197f = true;
    }
}
