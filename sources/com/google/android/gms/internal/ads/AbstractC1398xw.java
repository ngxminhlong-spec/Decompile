package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.xw, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1398xw implements Px {

    /* renamed from: o, reason: collision with root package name */
    public final boolean f11311o;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f11312p = new ArrayList(1);

    /* renamed from: q, reason: collision with root package name */
    public int f11313q;

    /* renamed from: r, reason: collision with root package name */
    public C0757iz f11314r;

    public AbstractC1398xw(boolean z4) {
        this.f11311o = z4;
    }

    @Override // com.google.android.gms.internal.ads.Px
    public /* synthetic */ Map a() {
        return Collections.EMPTY_MAP;
    }

    @Override // com.google.android.gms.internal.ads.Px
    public final void b(NB nb) {
        nb.getClass();
        ArrayList arrayList = this.f11312p;
        if (arrayList.contains(nb)) {
            return;
        }
        arrayList.add(nb);
        this.f11313q++;
    }

    public final void c() {
        C0757iz c0757iz = this.f11314r;
        int i4 = AbstractC0751is.f9071a;
        for (int i5 = 0; i5 < this.f11313q; i5++) {
            ((NB) this.f11312p.get(i5)).f(c0757iz, this.f11311o);
        }
        this.f11314r = null;
    }

    public final void f(C0757iz c0757iz) {
        for (int i4 = 0; i4 < this.f11313q; i4++) {
            ((NB) this.f11312p.get(i4)).getClass();
        }
    }

    public final void g(C0757iz c0757iz) {
        this.f11314r = c0757iz;
        for (int i4 = 0; i4 < this.f11313q; i4++) {
            ((NB) this.f11312p.get(i4)).k(this, c0757iz, this.f11311o);
        }
    }

    public final void v(int i4) {
        C0757iz c0757iz = this.f11314r;
        int i5 = AbstractC0751is.f9071a;
        for (int i6 = 0; i6 < this.f11313q; i6++) {
            ((NB) this.f11312p.get(i6)).c(c0757iz, this.f11311o, i4);
        }
    }
}
