package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class AE extends AbstractC0773jE {

    /* renamed from: q, reason: collision with root package name */
    public static final Z9 f3939q;

    /* renamed from: k, reason: collision with root package name */
    public final AbstractC0560eE[] f3940k;

    /* renamed from: l, reason: collision with root package name */
    public final AbstractC0484ch[] f3941l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f3942m;

    /* renamed from: n, reason: collision with root package name */
    public int f3943n = -1;

    /* renamed from: o, reason: collision with root package name */
    public long[][] f3944o = new long[0];

    /* renamed from: p, reason: collision with root package name */
    public C1143rz f3945p;

    /* JADX WARN: Type inference failed for: r3v0, types: [com.google.android.gms.internal.ads.D5, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.google.android.gms.internal.ads.Q7, java.lang.Object] */
    static {
        C1052pt c1052pt = AbstractC1137rt.f10543p;
        Gt gt = Gt.f5344s;
        List list = Collections.EMPTY_LIST;
        W8 w8 = W8.f7349a;
        f3939q = new Z9("MergingMediaSource", new Object(), null, new Object(), C0265Eb.y);
    }

    public AE(AbstractC0560eE... abstractC0560eEArr) {
        this.f3940k = abstractC0560eEArr;
        this.f3942m = new ArrayList(Arrays.asList(abstractC0560eEArr));
        this.f3941l = new AbstractC0484ch[abstractC0560eEArr.length];
        new HashMap();
        if (!new C0624ft().isEmpty()) {
            throw new IllegalArgumentException();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0560eE
    public final void a(InterfaceC1159sE interfaceC1159sE) {
        C1460zE c1460zE = (C1460zE) interfaceC1159sE;
        int i4 = 0;
        while (true) {
            AbstractC0560eE[] abstractC0560eEArr = this.f3940k;
            if (i4 >= abstractC0560eEArr.length) {
                return;
            }
            AbstractC0560eE abstractC0560eE = abstractC0560eEArr[i4];
            InterfaceC1159sE interfaceC1159sE2 = c1460zE.f11585o[i4];
            if (interfaceC1159sE2 instanceof QE) {
                interfaceC1159sE2 = ((QE) interfaceC1159sE2).f6654o;
            }
            abstractC0560eE.a(interfaceC1159sE2);
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0560eE
    public final InterfaceC1159sE b(C1202tE c1202tE, C1058pz c1058pz, long j4) {
        AbstractC0560eE[] abstractC0560eEArr = this.f3940k;
        int length = abstractC0560eEArr.length;
        InterfaceC1159sE[] interfaceC1159sEArr = new InterfaceC1159sE[length];
        AbstractC0484ch[] abstractC0484chArr = this.f3941l;
        int a4 = abstractC0484chArr[0].a(c1202tE.f10688a);
        for (int i4 = 0; i4 < length; i4++) {
            interfaceC1159sEArr[i4] = abstractC0560eEArr[i4].b(c1202tE.a(abstractC0484chArr[i4].f(a4)), c1058pz, j4 - this.f3944o[a4][i4]);
        }
        return new C1460zE(this.f3944o[a4], interfaceC1159sEArr);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0560eE
    public final Z9 c() {
        AbstractC0560eE[] abstractC0560eEArr = this.f3940k;
        return abstractC0560eEArr.length > 0 ? abstractC0560eEArr[0].c() : f3939q;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0560eE
    public final void j(NB nb) {
        this.f9146j = nb;
        this.f9145i = AbstractC0751is.y();
        int i4 = 0;
        while (true) {
            AbstractC0560eE[] abstractC0560eEArr = this.f3940k;
            if (i4 >= abstractC0560eEArr.length) {
                return;
            }
            t(Integer.valueOf(i4), abstractC0560eEArr[i4]);
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0773jE, com.google.android.gms.internal.ads.AbstractC0560eE
    public final void m() {
        super.m();
        Arrays.fill(this.f3941l, (Object) null);
        this.f3943n = -1;
        this.f3945p = null;
        ArrayList arrayList = this.f3942m;
        arrayList.clear();
        Collections.addAll(arrayList, this.f3940k);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0560eE
    public final void p(Z9 z9) {
        this.f3940k[0].p(z9);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0560eE
    public final void r() {
        C1143rz c1143rz = this.f3945p;
        if (c1143rz != null) {
            throw c1143rz;
        }
        Iterator it = this.f9144h.values().iterator();
        while (it.hasNext()) {
            ((C0732iE) it.next()).f9038a.r();
        }
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [com.google.android.gms.internal.ads.rz, java.io.IOException] */
    @Override // com.google.android.gms.internal.ads.AbstractC0773jE
    public final void s(Object obj, AbstractC0560eE abstractC0560eE, AbstractC0484ch abstractC0484ch) {
        int i4;
        if (this.f3945p != null) {
            return;
        }
        if (this.f3943n == -1) {
            i4 = abstractC0484ch.b();
            this.f3943n = i4;
        } else {
            int b4 = abstractC0484ch.b();
            int i5 = this.f3943n;
            if (b4 != i5) {
                this.f3945p = new IOException();
                return;
            }
            i4 = i5;
        }
        int length = this.f3944o.length;
        AbstractC0484ch[] abstractC0484chArr = this.f3941l;
        if (length == 0) {
            this.f3944o = (long[][]) Array.newInstance((Class<?>) Long.TYPE, i4, abstractC0484chArr.length);
        }
        ArrayList arrayList = this.f3942m;
        arrayList.remove(abstractC0560eE);
        abstractC0484chArr[((Integer) obj).intValue()] = abstractC0484ch;
        if (arrayList.isEmpty()) {
            k(abstractC0484chArr[0]);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0773jE
    public final /* bridge */ /* synthetic */ C1202tE w(Object obj, C1202tE c1202tE) {
        if (((Integer) obj).intValue() == 0) {
            return c1202tE;
        }
        return null;
    }
}
