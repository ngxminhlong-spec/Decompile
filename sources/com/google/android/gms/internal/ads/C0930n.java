package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0930n {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f9682a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9683b;
    public final int c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final int f9684e;

    /* renamed from: f, reason: collision with root package name */
    public final int f9685f;

    /* renamed from: g, reason: collision with root package name */
    public final int f9686g;

    /* renamed from: h, reason: collision with root package name */
    public final int f9687h;

    /* renamed from: i, reason: collision with root package name */
    public final int f9688i;

    /* renamed from: j, reason: collision with root package name */
    public final float f9689j;

    /* renamed from: k, reason: collision with root package name */
    public final String f9690k;

    public C0930n(ArrayList arrayList, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, float f4, String str) {
        this.f9682a = arrayList;
        this.f9683b = i4;
        this.c = i5;
        this.d = i6;
        this.f9684e = i7;
        this.f9685f = i8;
        this.f9686g = i9;
        this.f9687h = i10;
        this.f9688i = i11;
        this.f9689j = f4;
        this.f9690k = str;
    }

    public static C0930n a(C1134rq c1134rq) {
        String str;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        float f4;
        int i10;
        byte[] bArr = Wj.f7544m;
        try {
            c1134rq.f(4);
            int m4 = c1134rq.m() & 3;
            int i11 = m4 + 1;
            if (i11 == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int m5 = c1134rq.m() & 31;
            for (int i12 = 0; i12 < m5; i12++) {
                int q4 = c1134rq.q();
                int i13 = c1134rq.f10537b;
                c1134rq.f(q4);
                byte[] bArr2 = c1134rq.f10536a;
                byte[] bArr3 = new byte[q4 + 4];
                System.arraycopy(bArr, 0, bArr3, 0, 4);
                System.arraycopy(bArr2, i13, bArr3, 4, q4);
                arrayList.add(bArr3);
            }
            int m6 = c1134rq.m();
            for (int i14 = 0; i14 < m6; i14++) {
                int q5 = c1134rq.q();
                int i15 = c1134rq.f10537b;
                c1134rq.f(q5);
                byte[] bArr4 = c1134rq.f10536a;
                byte[] bArr5 = new byte[q5 + 4];
                System.arraycopy(bArr, 0, bArr5, 0, 4);
                System.arraycopy(bArr4, i15, bArr5, 4, q5);
                arrayList.add(bArr5);
            }
            if (m5 > 0) {
                Nv j4 = Wj.j((byte[]) arrayList.get(0), m4 + 2, ((byte[]) arrayList.get(0)).length);
                int i16 = j4.f6413e;
                int i17 = j4.f6414f;
                int i18 = j4.f6416h + 8;
                int i19 = j4.f6417i + 8;
                int i20 = j4.f6418j;
                int i21 = j4.f6419k;
                int i22 = j4.f6420l;
                float f5 = j4.f6415g;
                str = String.format("avc1.%02X%02X%02X", Integer.valueOf(j4.f6411a), Integer.valueOf(j4.f6412b), Integer.valueOf(j4.c));
                i4 = i16;
                i9 = i22;
                f4 = f5;
                i8 = i20;
                i10 = i21;
                i6 = i18;
                i7 = i19;
                i5 = i17;
            } else {
                str = null;
                i4 = -1;
                i5 = -1;
                i6 = -1;
                i7 = -1;
                i8 = -1;
                i9 = -1;
                f4 = 1.0f;
                i10 = -1;
            }
            return new C0930n(arrayList, i11, i4, i5, i6, i7, i8, i10, i9, f4, str);
        } catch (ArrayIndexOutOfBoundsException e4) {
            throw C0907md.a("Error parsing AVC config", e4);
        }
    }
}
