package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class XE implements Comparable {

    /* renamed from: o, reason: collision with root package name */
    public final boolean f7623o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f7624p;

    public XE(C0976o2 c0976o2, int i4) {
        this.f7623o = 1 == (c0976o2.d & 1);
        this.f7624p = C0604fF.f(i4, false);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        XE xe = (XE) obj;
        return AbstractC0837kt.f9329a.d(this.f7624p, xe.f7624p).d(this.f7623o, xe.f7623o).a();
    }
}
