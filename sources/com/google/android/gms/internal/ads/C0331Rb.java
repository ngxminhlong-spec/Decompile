package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.Rb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0331Rb implements InterfaceC1450z4 {

    /* renamed from: o, reason: collision with root package name */
    public final Context f6799o;

    /* renamed from: p, reason: collision with root package name */
    public final Object f6800p;

    /* renamed from: q, reason: collision with root package name */
    public final String f6801q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f6802r;

    public C0331Rb(Context context, String str) {
        this.f6799o = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f6801q = str;
        this.f6802r = false;
        this.f6800p = new Object();
    }

    public final void a(boolean z4) {
        N1.n nVar = N1.n.f1204A;
        if (nVar.f1225w.j(this.f6799o)) {
            synchronized (this.f6800p) {
                try {
                    if (this.f6802r == z4) {
                        return;
                    }
                    this.f6802r = z4;
                    if (TextUtils.isEmpty(this.f6801q)) {
                        return;
                    }
                    if (this.f6802r) {
                        C0356Wb c0356Wb = nVar.f1225w;
                        Context context = this.f6799o;
                        String str = this.f6801q;
                        if (c0356Wb.j(context)) {
                            if (C0356Wb.k(context)) {
                                c0356Wb.d("beginAdUnitExposure", new Iv(str, 6));
                            } else {
                                c0356Wb.a(context, str, "beginAdUnitExposure");
                            }
                        }
                    } else {
                        C0356Wb c0356Wb2 = nVar.f1225w;
                        Context context2 = this.f6799o;
                        String str2 = this.f6801q;
                        if (c0356Wb2.j(context2)) {
                            if (C0356Wb.k(context2)) {
                                c0356Wb2.d("endAdUnitExposure", new C0753iv(str2, 5));
                            } else {
                                c0356Wb2.a(context2, str2, "endAdUnitExposure");
                            }
                        }
                    }
                } finally {
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1450z4
    public final void j0(C1407y4 c1407y4) {
        a(c1407y4.f11338j);
    }
}
