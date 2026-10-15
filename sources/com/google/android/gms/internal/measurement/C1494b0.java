package com.google.android.gms.internal.measurement;

import android.app.Activity;
import n2.BinderC1813b;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.measurement.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1494b0 extends AbstractRunnableC1489a0 {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f11882s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Activity f11883t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C1504d0 f11884u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1494b0(C1504d0 c1504d0, Activity activity, int i4) {
        super(c1504d0.f11903o, true);
        this.f11882s = i4;
        switch (i4) {
            case 1:
                this.f11884u = c1504d0;
                this.f11883t = activity;
                super(c1504d0.f11903o, true);
                return;
            case 2:
                this.f11884u = c1504d0;
                this.f11883t = activity;
                super(c1504d0.f11903o, true);
                return;
            case 3:
                this.f11884u = c1504d0;
                this.f11883t = activity;
                super(c1504d0.f11903o, true);
                return;
            case 4:
                this.f11884u = c1504d0;
                this.f11883t = activity;
                super(c1504d0.f11903o, true);
                return;
            default:
                this.f11884u = c1504d0;
                this.f11883t = activity;
                return;
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC1489a0
    public final void a() {
        switch (this.f11882s) {
            case 0:
                H h4 = this.f11884u.f11903o.f11911f;
                h2.y.i(h4);
                h4.onActivityStarted(new BinderC1813b(this.f11883t), this.f11872p);
                return;
            case 1:
                H h5 = this.f11884u.f11903o.f11911f;
                h2.y.i(h5);
                h5.onActivityResumed(new BinderC1813b(this.f11883t), this.f11872p);
                return;
            case 2:
                H h6 = this.f11884u.f11903o.f11911f;
                h2.y.i(h6);
                h6.onActivityPaused(new BinderC1813b(this.f11883t), this.f11872p);
                return;
            case 3:
                H h7 = this.f11884u.f11903o.f11911f;
                h2.y.i(h7);
                h7.onActivityStopped(new BinderC1813b(this.f11883t), this.f11872p);
                return;
            default:
                H h8 = this.f11884u.f11903o.f11911f;
                h2.y.i(h8);
                h8.onActivityDestroyed(new BinderC1813b(this.f11883t), this.f11872p);
                return;
        }
    }
}
