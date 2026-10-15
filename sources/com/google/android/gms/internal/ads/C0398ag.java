package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.ag, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0398ag implements InterfaceC0441bg {

    /* renamed from: a, reason: collision with root package name */
    public final Map f8152a;

    public C0398ag(Map map) {
        this.f8152a = map;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0441bg
    public final InterfaceC0745im a(String str, int i4) {
        return (InterfaceC0745im) this.f8152a.get(str);
    }
}
