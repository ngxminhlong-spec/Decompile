package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.Bundle;
import n2.BinderC1813b;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class S extends AbstractRunnableC1489a0 {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f11817s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f11818t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f11819u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C1509e0 f11820v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f11821w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(C1509e0 c1509e0, Activity activity, String str, String str2) {
        super(c1509e0, true);
        this.f11817s = 2;
        this.f11820v = c1509e0;
        this.f11821w = activity;
        this.f11818t = str;
        this.f11819u = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ S(C1509e0 c1509e0, String str, String str2, Object obj, int i4) {
        super(c1509e0, true);
        this.f11817s = i4;
        this.f11820v = c1509e0;
        this.f11818t = str;
        this.f11819u = str2;
        this.f11821w = obj;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC1489a0
    public final void a() {
        switch (this.f11817s) {
            case 0:
                H h4 = this.f11820v.f11911f;
                h2.y.i(h4);
                h4.clearConditionalUserProperty(this.f11818t, this.f11819u, (Bundle) this.f11821w);
                return;
            case 1:
                H h5 = this.f11820v.f11911f;
                h2.y.i(h5);
                h5.getConditionalUserProperties(this.f11818t, this.f11819u, (D) this.f11821w);
                return;
            default:
                H h6 = this.f11820v.f11911f;
                h2.y.i(h6);
                h6.setCurrentScreen(new BinderC1813b((Activity) this.f11821w), this.f11818t, this.f11819u, this.f11871o);
                return;
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC1489a0
    public void b() {
        switch (this.f11817s) {
            case 1:
                ((D) this.f11821w).d3(null);
                return;
            default:
                return;
        }
    }
}
