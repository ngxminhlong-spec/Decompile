package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.ii, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0741ii implements InterfaceC0441bg {

    /* renamed from: a, reason: collision with root package name */
    public final Map f9046a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f9047b;
    public final Map c;
    public final C1414yB d;

    /* renamed from: e, reason: collision with root package name */
    public final Gi f9048e;

    public C0741ii(Map map, Map map2, Map map3, C1414yB c1414yB, Gi gi) {
        this.f9046a = map;
        this.f9047b = map2;
        this.c = map3;
        this.d = c1414yB;
        this.f9048e = gi;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0441bg
    public final InterfaceC0745im a(String str, int i4) {
        InterfaceC0745im a4;
        InterfaceC0745im interfaceC0745im = (InterfaceC0745im) this.f9046a.get(str);
        if (interfaceC0745im != null) {
            return interfaceC0745im;
        }
        if (i4 != 1) {
            if (i4 != 4) {
                return null;
            }
            Km km = (Km) this.c.get(str);
            if (km != null) {
                return new C0787jm(km, C0932n1.f9696f);
            }
            a4 = (InterfaceC0745im) this.f9047b.get(str);
            if (a4 == null) {
                return null;
            }
        } else if (this.f9048e.d == null || (a4 = ((InterfaceC0441bg) this.d.c()).a(str, i4)) == null) {
            return null;
        }
        return new C0787jm(a4, C0932n1.f9697g);
    }
}
