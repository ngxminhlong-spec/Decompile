package com.google.android.gms.internal.ads;

import android.content.Context;
import n2.BinderC1813b;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.cf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0482cf implements Tg {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f8371o;

    /* renamed from: p, reason: collision with root package name */
    public final Object f8372p;

    public /* synthetic */ C0482cf(int i4, Object obj) {
        this.f8371o = i4;
        this.f8372p = obj;
    }

    @Override // com.google.android.gms.internal.ads.Tg
    public final void F(Context context) {
        switch (this.f8371o) {
            case 0:
                try {
                    try {
                        ((Pp) this.f8372p).f6603a.n();
                        return;
                    } catch (Throwable th) {
                        throw new Exception(th);
                    }
                } catch (Kp e4) {
                    Y9.t("Cannot invoke onDestroy for the mediation adapter.", e4);
                    return;
                }
            default:
                InterfaceC0308Md interfaceC0308Md = (InterfaceC0308Md) this.f8372p;
                if (interfaceC0308Md != null) {
                    interfaceC0308Md.destroy();
                    return;
                }
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.Tg
    public final void l(Context context) {
        switch (this.f8371o) {
            case 0:
                InterfaceC1154s9 interfaceC1154s9 = ((Pp) this.f8372p).f6603a;
                try {
                    try {
                        interfaceC1154s9.L();
                        if (context != null) {
                            try {
                                interfaceC1154s9.u2(new BinderC1813b(context));
                                return;
                            } catch (Throwable th) {
                                throw new Exception(th);
                            }
                        }
                        return;
                    } finally {
                        Exception exc = new Exception(th);
                    }
                } catch (Kp e4) {
                    Y9.t("Cannot invoke onResume for the mediation adapter.", e4);
                    return;
                }
            default:
                InterfaceC0308Md interfaceC0308Md = (InterfaceC0308Md) this.f8372p;
                if (interfaceC0308Md != null) {
                    interfaceC0308Md.onResume();
                    return;
                }
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.Tg
    public final void o(Context context) {
        switch (this.f8371o) {
            case 0:
                try {
                    try {
                        ((Pp) this.f8372p).f6603a.p1();
                        return;
                    } catch (Throwable th) {
                        throw new Exception(th);
                    }
                } catch (Kp e4) {
                    Y9.t("Cannot invoke onPause for the mediation adapter.", e4);
                    return;
                }
            default:
                InterfaceC0308Md interfaceC0308Md = (InterfaceC0308Md) this.f8372p;
                if (interfaceC0308Md != null) {
                    interfaceC0308Md.onPause();
                    return;
                }
                return;
        }
    }
}
