package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.xe, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1380xe implements FB {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11271a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1423ye f11272b;

    public /* synthetic */ C1380xe(C1423ye c1423ye, int i4) {
        this.f11271a = i4;
        this.f11272b = c1423ye;
    }

    @Override // com.google.android.gms.internal.ads.FB
    public final /* bridge */ /* synthetic */ Object c() {
        switch (this.f11271a) {
            case 0:
                return new C1337we(this.f11272b.f11395b);
            default:
                return new C1294ve(this.f11272b.f11395b);
        }
    }
}
