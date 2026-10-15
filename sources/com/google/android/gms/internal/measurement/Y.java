package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import n2.BinderC1813b;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Y extends AbstractRunnableC1489a0 {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f11846s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f11847t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f11848u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ boolean f11849v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ C1509e0 f11850w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f11851x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Y(C1509e0 c1509e0, String str, String str2, Object obj, boolean z4, int i4) {
        super(c1509e0, true);
        this.f11846s = i4;
        this.f11850w = c1509e0;
        this.f11847t = str;
        this.f11848u = str2;
        this.f11851x = obj;
        this.f11849v = z4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(C1509e0 c1509e0, String str, String str2, boolean z4, D d) {
        super(c1509e0, true);
        this.f11846s = 0;
        this.f11850w = c1509e0;
        this.f11847t = str;
        this.f11848u = str2;
        this.f11849v = z4;
        this.f11851x = d;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC1489a0
    public final void a() {
        switch (this.f11846s) {
            case 0:
                H h4 = this.f11850w.f11911f;
                h2.y.i(h4);
                h4.getUserProperties(this.f11847t, this.f11848u, this.f11849v, (D) this.f11851x);
                return;
            case 1:
                long j4 = this.f11871o;
                H h5 = this.f11850w.f11911f;
                h2.y.i(h5);
                h5.logEvent(this.f11847t, this.f11848u, (Bundle) this.f11851x, this.f11849v, true, j4);
                return;
            default:
                H h6 = this.f11850w.f11911f;
                h2.y.i(h6);
                h6.setUserProperty(this.f11847t, this.f11848u, new BinderC1813b(this.f11851x), this.f11849v, this.f11871o);
                return;
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC1489a0
    public void b() {
        switch (this.f11846s) {
            case 0:
                ((D) this.f11851x).d3(null);
                return;
            default:
                return;
        }
    }
}
