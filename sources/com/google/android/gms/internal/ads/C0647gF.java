package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.gF, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0647gF {

    /* renamed from: a, reason: collision with root package name */
    public final C0997oh f8801a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f8802b;

    public C0647gF(C0997oh c0997oh, int[] iArr) {
        if (iArr.length == 0) {
            Wj.i("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.f8801a = c0997oh;
        this.f8802b = iArr;
    }
}
