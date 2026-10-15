package com.google.android.gms.internal.ads;

import O1.C0101z0;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final /* synthetic */ class Jg implements Bh {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f5873o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C0101z0 f5874p;

    public /* synthetic */ Jg(int i4, C0101z0 c0101z0) {
        this.f5873o = i4;
        this.f5874p = c0101z0;
    }

    @Override // com.google.android.gms.internal.ads.Bh
    /* renamed from: l */
    public final void mo3l(Object obj) {
        switch (this.f5873o) {
            case 0:
                ((Lg) obj).J(this.f5874p);
                return;
            default:
                ((Pg) obj).r(this.f5874p);
                return;
        }
    }
}
