package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import n2.BinderC1813b;
import o2.C1890a;
import o2.C1893d;
import x2.AbstractC2080j0;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class V extends AbstractRunnableC1489a0 {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f11833s = 4;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f11834t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f11835u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f11836v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(C1504d0 c1504d0, Activity activity, D d) {
        super(c1504d0.f11903o, true);
        this.f11835u = c1504d0;
        this.f11836v = activity;
        this.f11834t = d;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(C1504d0 c1504d0, Bundle bundle, Activity activity) {
        super(c1504d0.f11903o, true);
        this.f11835u = c1504d0;
        this.f11834t = bundle;
        this.f11836v = activity;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(C1509e0 c1509e0, Bundle bundle, D d) {
        super(c1509e0, true);
        this.f11835u = c1509e0;
        this.f11834t = bundle;
        this.f11836v = d;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(C1509e0 c1509e0, String str, D d) {
        super(c1509e0, true);
        this.f11835u = c1509e0;
        this.f11836v = str;
        this.f11834t = d;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(C1509e0 c1509e0, String str, String str2, Context context, Bundle bundle) {
        super(c1509e0, true);
        this.f11835u = c1509e0;
        this.f11836v = context;
        this.f11834t = bundle;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC1489a0
    public final void a() {
        H h4;
        Bundle bundle;
        switch (this.f11833s) {
            case 0:
                try {
                    h2.y.i((Context) this.f11836v);
                    C1509e0 c1509e0 = (C1509e0) this.f11835u;
                    try {
                        h4 = G.asInterface(C1893d.c((Context) this.f11836v, C1893d.c, ModuleDescriptor.MODULE_ID).b("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
                    } catch (C1890a e4) {
                        c1509e0.a(e4, true, false);
                        h4 = null;
                    }
                    c1509e0.f11911f = h4;
                    if (((C1509e0) this.f11835u).f11911f == null) {
                        Log.w("FA", "Failed to connect to measurement client.");
                        return;
                    }
                    int a4 = C1893d.a((Context) this.f11836v, ModuleDescriptor.MODULE_ID);
                    O o4 = new O(73000L, Math.max(a4, r2), C1893d.d((Context) this.f11836v, ModuleDescriptor.MODULE_ID, false) < a4, null, null, null, (Bundle) this.f11834t, AbstractC2080j0.b((Context) this.f11836v));
                    H h5 = ((C1509e0) this.f11835u).f11911f;
                    h2.y.i(h5);
                    h5.initialize(new BinderC1813b((Context) this.f11836v), o4, this.f11871o);
                    return;
                } catch (Exception e5) {
                    ((C1509e0) this.f11835u).a(e5, true, false);
                    return;
                }
            case 1:
                H h6 = ((C1509e0) this.f11835u).f11911f;
                h2.y.i(h6);
                h6.performAction((Bundle) this.f11834t, (D) this.f11836v, this.f11871o);
                return;
            case 2:
                H h7 = ((C1509e0) this.f11835u).f11911f;
                h2.y.i(h7);
                h7.getMaxUserProperties((String) this.f11836v, (D) this.f11834t);
                return;
            case 3:
                if (((Bundle) this.f11834t) != null) {
                    bundle = new Bundle();
                    if (((Bundle) this.f11834t).containsKey("com.google.app_measurement.screen_service")) {
                        Object obj = ((Bundle) this.f11834t).get("com.google.app_measurement.screen_service");
                        if (obj instanceof Bundle) {
                            bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                        }
                    }
                } else {
                    bundle = null;
                }
                H h8 = ((C1504d0) this.f11835u).f11903o.f11911f;
                h2.y.i(h8);
                h8.onActivityCreated(new BinderC1813b((Activity) this.f11836v), bundle, this.f11872p);
                return;
            default:
                H h9 = ((C1504d0) this.f11835u).f11903o.f11911f;
                h2.y.i(h9);
                h9.onActivitySaveInstanceState(new BinderC1813b((Activity) this.f11836v), (D) this.f11834t, this.f11872p);
                return;
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC1489a0
    public void b() {
        switch (this.f11833s) {
            case 1:
                ((D) this.f11836v).d3(null);
                return;
            case 2:
                ((D) this.f11834t).d3(null);
                return;
            default:
                return;
        }
    }
}
