package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.util.Arrays;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.y1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1404y1 {

    /* renamed from: a, reason: collision with root package name */
    public final C1447z1 f11325a = new C1447z1();

    /* renamed from: b, reason: collision with root package name */
    public final C1134rq f11326b = new C1134rq(0, new byte[65025]);
    public int c = -1;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f11327e;

    public final boolean a(C c) {
        int i4;
        boolean z4 = this.f11327e;
        C1134rq c1134rq = this.f11326b;
        if (z4) {
            this.f11327e = false;
            c1134rq.b(0);
        }
        while (true) {
            if (this.f11327e) {
                return true;
            }
            int i5 = this.c;
            C1447z1 c1447z1 = this.f11325a;
            if (i5 < 0) {
                if (!c1447z1.b(c, -1L) || !c1447z1.a(c, true)) {
                    break;
                }
                int i6 = c1447z1.d;
                if ((c1447z1.f11563a & 1) == 1 && c1134rq.c == 0) {
                    i6 += b(0);
                    i4 = this.d;
                } else {
                    i4 = 0;
                }
                try {
                    ((C1316w) c).f(i6);
                    this.c = i4;
                    i5 = i4;
                } catch (EOFException unused) {
                }
            }
            int b4 = b(i5);
            int i7 = this.c + this.d;
            if (b4 > 0) {
                int i8 = c1134rq.c + b4;
                byte[] bArr = c1134rq.f10536a;
                if (i8 > bArr.length) {
                    c1134rq.f10536a = Arrays.copyOf(bArr, i8);
                }
                ((C1316w) c).C(c1134rq.f10536a, c1134rq.c, b4, false);
                c1134rq.d(c1134rq.c + b4);
                this.f11327e = c1447z1.f11566f[i7 + (-1)] != 255;
            }
            if (i7 == c1447z1.c) {
                i7 = -1;
            }
            this.c = i7;
        }
        return false;
    }

    public final int b(int i4) {
        int i5;
        int i6 = 0;
        this.d = 0;
        do {
            int i7 = this.d;
            int i8 = i4 + i7;
            C1447z1 c1447z1 = this.f11325a;
            if (i8 >= c1447z1.c) {
                break;
            }
            this.d = i7 + 1;
            i5 = c1447z1.f11566f[i8];
            i6 += i5;
        } while (i5 == 255);
        return i6;
    }
}
