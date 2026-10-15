package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.bl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0446bl implements InterfaceC1457zB {

    /* renamed from: a, reason: collision with root package name */
    public final FB f8279a;

    public C0446bl(C0865le c0865le) {
        this.f8279a = c0865le;
    }

    @Override // com.google.android.gms.internal.ads.FB
    public final Object c() {
        String packageName = ((C0865le) this.f8279a).a().getPackageName();
        AbstractC0587ez.n(packageName);
        return packageName;
    }
}
