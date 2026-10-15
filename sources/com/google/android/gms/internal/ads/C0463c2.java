package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.c2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0463c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8313a;

    /* renamed from: b, reason: collision with root package name */
    public final List f8314b;
    public final V[] c;

    public C0463c2(int i4, List list) {
        this.f8313a = i4;
        switch (i4) {
            case 1:
                this.f8314b = list;
                this.c = new V[list.size()];
                return;
            default:
                this.f8314b = list;
                this.c = new V[list.size()];
                return;
        }
    }

    public void a(long j4, C1134rq c1134rq) {
        if (c1134rq.g() < 9) {
            return;
        }
        int h4 = c1134rq.h();
        int h5 = c1134rq.h();
        int m4 = c1134rq.m();
        if (h4 == 434 && h5 == 1195456820 && m4 == 3) {
            AbstractC1230u.A(j4, c1134rq, this.c);
        }
    }

    public final void b(D d, C0591f2 c0591f2) {
        switch (this.f8313a) {
            case 0:
                int i4 = 0;
                while (true) {
                    V[] vArr = this.c;
                    if (i4 >= vArr.length) {
                        return;
                    }
                    c0591f2.a();
                    c0591f2.b();
                    V z4 = d.z(c0591f2.d, 3);
                    C0976o2 c0976o2 = (C0976o2) this.f8314b.get(i4);
                    String str = c0976o2.f9813k;
                    boolean z5 = true;
                    if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                        z5 = false;
                    }
                    Zf.S("Invalid closed caption MIME type provided: ".concat(String.valueOf(str)), z5);
                    String str2 = c0976o2.f9805a;
                    if (str2 == null) {
                        c0591f2.b();
                        str2 = c0591f2.f8675e;
                    }
                    L1 l12 = new L1();
                    l12.f6094a = str2;
                    l12.f6101j = str;
                    l12.d = c0976o2.d;
                    l12.c = c0976o2.c;
                    l12.f6090B = c0976o2.f9800C;
                    l12.f6103l = c0976o2.f9815m;
                    z4.a(new C0976o2(l12));
                    vArr[i4] = z4;
                    i4++;
                }
                break;
            default:
                int i5 = 0;
                while (true) {
                    V[] vArr2 = this.c;
                    if (i5 >= vArr2.length) {
                        return;
                    }
                    c0591f2.a();
                    c0591f2.b();
                    V z6 = d.z(c0591f2.d, 3);
                    C0976o2 c0976o22 = (C0976o2) this.f8314b.get(i5);
                    String str3 = c0976o22.f9813k;
                    boolean z7 = true;
                    if (!"application/cea-608".equals(str3) && !"application/cea-708".equals(str3)) {
                        z7 = false;
                    }
                    Zf.S("Invalid closed caption MIME type provided: ".concat(String.valueOf(str3)), z7);
                    L1 l13 = new L1();
                    c0591f2.b();
                    l13.f6094a = c0591f2.f8675e;
                    l13.f6101j = str3;
                    l13.d = c0976o22.d;
                    l13.c = c0976o22.c;
                    l13.f6090B = c0976o22.f9800C;
                    l13.f6103l = c0976o22.f9815m;
                    z6.a(new C0976o2(l13));
                    vArr2[i5] = z6;
                    i5++;
                }
                break;
        }
    }
}
