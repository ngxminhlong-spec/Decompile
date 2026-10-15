package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashSet;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.hf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0696hf implements InterfaceC1457zB {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8951a;

    /* renamed from: b, reason: collision with root package name */
    public final FB f8952b;
    public final C0654gg c;

    public /* synthetic */ C0696hf(C0654gg c0654gg, FB fb, int i4) {
        this.f8951a = i4;
        this.c = c0654gg;
        this.f8952b = fb;
    }

    public /* synthetic */ C0696hf(C1414yB c1414yB, C0654gg c0654gg, int i4) {
        this.f8951a = i4;
        this.f8952b = c1414yB;
        this.c = c0654gg;
    }

    @Override // com.google.android.gms.internal.ads.FB
    public final Object c() {
        switch (this.f8951a) {
            case 0:
                return new C0653gf(this.c.a(), ((C1165se) this.f8952b).c());
            case 1:
                return new C1339wg(this.c.a());
            case 2:
                return new Uh(this.c.a(), (Oq) this.f8952b.c());
            default:
                return new Qh((Context) this.f8952b.c(), new HashSet(), this.c.a());
        }
    }
}
