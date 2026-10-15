package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.bF, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0434bF extends AbstractC0519dF implements Comparable {

    /* renamed from: s, reason: collision with root package name */
    public final int f8233s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f8234t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f8235u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f8236v;

    /* renamed from: w, reason: collision with root package name */
    public final int f8237w;

    /* renamed from: x, reason: collision with root package name */
    public final int f8238x;
    public final int y;

    /* renamed from: z, reason: collision with root package name */
    public final int f8239z;

    public C0434bF(int i4, C0997oh c0997oh, int i5, ZE ze, int i6, String str) {
        super(i4, c0997oh, i5);
        int i7;
        int i8 = 0;
        this.f8234t = C0604fF.f(i6, false);
        int i9 = this.f8484r.d;
        ze.getClass();
        AbstractC1137rt abstractC1137rt = ze.f9642g;
        this.f8235u = 1 == (i9 & 1);
        this.f8236v = (i9 & 2) != 0;
        AbstractC1137rt t4 = abstractC1137rt.isEmpty() ? AbstractC1137rt.t("") : abstractC1137rt;
        int i10 = 0;
        while (true) {
            if (i10 >= t4.size()) {
                i10 = Integer.MAX_VALUE;
                i7 = 0;
                break;
            } else {
                i7 = C0604fF.c(this.f8484r, (String) t4.get(i10), false);
                if (i7 > 0) {
                    break;
                } else {
                    i10++;
                }
            }
        }
        this.f8237w = i10;
        this.f8238x = i7;
        this.f8484r.getClass();
        int bitCount = Integer.bitCount(0);
        this.y = bitCount;
        this.f8484r.getClass();
        int c = C0604fF.c(this.f8484r, str, C0604fF.d(str) == null);
        this.f8239z = c;
        boolean z4 = i7 > 0 || (abstractC1137rt.isEmpty() && bitCount > 0) || this.f8235u || (this.f8236v && c > 0);
        if (C0604fF.f(i6, ze.f7985p) && z4) {
            i8 = 1;
        }
        this.f8233s = i8;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0519dF
    public final int a() {
        return this.f8233s;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0519dF
    public final /* bridge */ /* synthetic */ boolean b(AbstractC0519dF abstractC0519dF) {
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C0434bF c0434bF) {
        AbstractC0837kt d = AbstractC0837kt.f9329a.d(this.f8234t, c0434bF.f8234t);
        Integer valueOf = Integer.valueOf(this.f8237w);
        Integer valueOf2 = Integer.valueOf(c0434bF.f8237w);
        Et et = Et.f4954p;
        Et et2 = Et.f4955q;
        AbstractC0837kt c = d.c(valueOf, valueOf2, et2);
        int i4 = c0434bF.f8238x;
        int i5 = this.f8238x;
        AbstractC0837kt b4 = c.b(i5, i4);
        int i6 = c0434bF.y;
        int i7 = this.y;
        AbstractC0837kt d4 = b4.b(i7, i6).d(this.f8235u, c0434bF.f8235u);
        Boolean valueOf3 = Boolean.valueOf(this.f8236v);
        Boolean valueOf4 = Boolean.valueOf(c0434bF.f8236v);
        if (i5 != 0) {
            et = et2;
        }
        AbstractC0837kt b5 = d4.c(valueOf3, valueOf4, et).b(this.f8239z, c0434bF.f8239z);
        if (i7 == 0) {
            b5 = b5.e();
        }
        return b5.a();
    }
}
