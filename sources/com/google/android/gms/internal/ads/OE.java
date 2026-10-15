package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class OE extends AbstractC0484ch {

    /* renamed from: g, reason: collision with root package name */
    public static final Object f6453g = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final long f6454b;
    public final long c;
    public final boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final Z9 f6455e;

    /* renamed from: f, reason: collision with root package name */
    public final Q7 f6456f;

    static {
        C1052pt c1052pt = AbstractC1137rt.f10543p;
        Gt gt = Gt.f5344s;
        List list = Collections.EMPTY_LIST;
        Gt gt2 = Gt.f5344s;
        W8 w8 = W8.f7349a;
        Uri uri = Uri.EMPTY;
        if (uri != null) {
            new C1068q8(uri, gt2);
        }
        C0265Eb c0265Eb = C0265Eb.y;
    }

    public OE(long j4, long j5, boolean z4, Z9 z9, Q7 q7) {
        this.f6454b = j4;
        this.c = j5;
        this.d = z4;
        z9.getClass();
        this.f6455e = z9;
        this.f6456f = q7;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0484ch
    public final int a(Object obj) {
        return f6453g.equals(obj) ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0484ch
    public final int b() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0484ch
    public final int c() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0484ch
    public final C1210tg d(int i4, C1210tg c1210tg, boolean z4) {
        Zf.m(i4, 1);
        Object obj = z4 ? f6453g : null;
        C0442bh c0442bh = C0442bh.f8264b;
        c1210tg.b(0, this.f6454b, null, obj, false);
        return c1210tg;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0484ch
    public final Rg e(int i4, Rg rg, long j4) {
        Zf.m(i4, 1);
        Object obj = Rg.f6814n;
        rg.a(this.f6455e, this.d, false, this.f6456f, this.c);
        return rg;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0484ch
    public final Object f(int i4) {
        Zf.m(i4, 1);
        return f6453g;
    }
}
