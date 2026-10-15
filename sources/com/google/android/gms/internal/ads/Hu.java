package com.google.android.gms.internal.ads;

import java.util.concurrent.RejectedExecutionException;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Hu extends AbstractC1439yu {

    /* renamed from: D, reason: collision with root package name */
    public Gu f5517D;

    @Override // com.google.android.gms.internal.ads.AbstractC1138ru
    public final void i() {
        Gu gu = this.f5517D;
        if (gu != null) {
            gu.h();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1439yu
    public final void t(int i4, Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1439yu
    public final void u() {
        Gu gu = this.f5517D;
        if (gu != null) {
            try {
                gu.f5347q.execute(gu);
            } catch (RejectedExecutionException e4) {
                gu.f5348r.g(e4);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1439yu
    public final void w(int i4) {
        this.f11549z = null;
        if (i4 == 1) {
            this.f5517D = null;
        }
    }
}
