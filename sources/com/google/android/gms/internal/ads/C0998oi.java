package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.oi, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0998oi implements InterfaceC0597f8 {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f9848o;

    /* renamed from: p, reason: collision with root package name */
    public final WeakReference f9849p;

    public /* synthetic */ C0998oi(C1041pi c1041pi, int i4) {
        this.f9848o = i4;
        switch (i4) {
            case 1:
                this.f9849p = new WeakReference(c1041pi);
                return;
            case 2:
                this.f9849p = new WeakReference(c1041pi);
                return;
            default:
                this.f9849p = new WeakReference(c1041pi);
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0597f8
    public final void h(Object obj, Map map) {
        switch (this.f9848o) {
            case 0:
                C1041pi c1041pi = (C1041pi) this.f9849p.get();
                if (c1041pi == null) {
                    return;
                }
                Rh rh = c1041pi.f10012i;
                if ("_ac".equals((String) map.get("eventName"))) {
                    c1041pi.f10011h.D();
                    if (((Boolean) O1.r.d.c.a(AbstractC1066q6.f9)).booleanValue()) {
                        rh.G0();
                        if (TextUtils.isEmpty((CharSequence) map.get("sccg"))) {
                            return;
                        }
                        rh.u();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                C1041pi c1041pi2 = (C1041pi) this.f9849p.get();
                if (c1041pi2 == null) {
                    return;
                }
                Rh rh2 = c1041pi2.f10012i;
                c1041pi2.f10011h.D();
                if (((Boolean) O1.r.d.c.a(AbstractC1066q6.f9)).booleanValue()) {
                    rh2.G0();
                    if (TextUtils.isEmpty((CharSequence) map.get("sccg"))) {
                        return;
                    }
                    rh2.u();
                    return;
                }
                return;
            default:
                C1041pi c1041pi3 = (C1041pi) this.f9849p.get();
                if (c1041pi3 == null) {
                    return;
                }
                c1041pi3.f10010g.b();
                return;
        }
    }
}
