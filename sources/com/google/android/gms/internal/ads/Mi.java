package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import l2.C1798a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Mi implements View.OnClickListener {

    /* renamed from: o, reason: collision with root package name */
    public final Aj f6258o;

    /* renamed from: p, reason: collision with root package name */
    public final C1798a f6259p;

    /* renamed from: q, reason: collision with root package name */
    public R7 f6260q;

    /* renamed from: r, reason: collision with root package name */
    public C0469c8 f6261r;

    /* renamed from: s, reason: collision with root package name */
    public String f6262s;

    /* renamed from: t, reason: collision with root package name */
    public Long f6263t;

    /* renamed from: u, reason: collision with root package name */
    public WeakReference f6264u;

    public Mi(Aj aj, C1798a c1798a) {
        this.f6258o = aj;
        this.f6259p = c1798a;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        View view2;
        WeakReference weakReference = this.f6264u;
        if (weakReference == null || weakReference.get() != view) {
            return;
        }
        if (this.f6262s != null && this.f6263t != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("id", this.f6262s);
            this.f6259p.getClass();
            hashMap.put("time_interval", String.valueOf(System.currentTimeMillis() - this.f6263t.longValue()));
            hashMap.put("messageType", "onePointFiveClick");
            this.f6258o.b(hashMap);
        }
        this.f6262s = null;
        this.f6263t = null;
        WeakReference weakReference2 = this.f6264u;
        if (weakReference2 == null || (view2 = (View) weakReference2.get()) == null) {
            return;
        }
        view2.setClickable(false);
        view2.setOnClickListener(null);
        this.f6264u = null;
    }
}
