package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import l2.C1798a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.Ef, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0269Ef implements InterfaceC1457zB {

    /* renamed from: a, reason: collision with root package name */
    public final C1414yB f4908a;

    /* renamed from: b, reason: collision with root package name */
    public final C1414yB f4909b;

    public C0269Ef(C1414yB c1414yB, C1414yB c1414yB2) {
        this.f4908a = c1414yB;
        this.f4909b = c1414yB2;
    }

    @Override // com.google.android.gms.internal.ads.FB
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0825kh c() {
        return new C0825kh((ScheduledExecutorService) this.f4908a.c(), (C1798a) this.f4909b.c());
    }
}
