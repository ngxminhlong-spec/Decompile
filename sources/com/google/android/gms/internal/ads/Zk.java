package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Zk implements InterfaceC1457zB {

    /* renamed from: a, reason: collision with root package name */
    public final FB f8029a;

    public Zk(C1414yB c1414yB) {
        this.f8029a = c1414yB;
    }

    @Override // com.google.android.gms.internal.ads.FB
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ApplicationInfo c() {
        ApplicationInfo applicationInfo = ((Context) this.f8029a.c()).getApplicationInfo();
        AbstractC0587ez.n(applicationInfo);
        return applicationInfo;
    }
}
