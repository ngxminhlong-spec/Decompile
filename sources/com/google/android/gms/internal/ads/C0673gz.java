package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.gz, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0673gz extends Tt {

    /* renamed from: p, reason: collision with root package name */
    public int f8896p;

    /* renamed from: q, reason: collision with root package name */
    public final int f8897q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ AbstractC0886lz f8898r;

    public C0673gz(AbstractC0886lz abstractC0886lz) {
        super(1);
        this.f8898r = abstractC0886lz;
        this.f8896p = 0;
        this.f8897q = abstractC0886lz.l();
    }

    @Override // com.google.android.gms.internal.ads.Tt
    public final byte a() {
        int i4 = this.f8896p;
        if (i4 >= this.f8897q) {
            throw new NoSuchElementException();
        }
        this.f8896p = i4 + 1;
        return this.f8898r.j(i4);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f8896p < this.f8897q;
    }
}
