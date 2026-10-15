package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.of, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0995of implements InterfaceC0597f8 {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f9840o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C1038pf f9841p;

    public /* synthetic */ C0995of(C1038pf c1038pf, int i4) {
        this.f9840o = i4;
        this.f9841p = c1038pf;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0597f8
    public final void h(Object obj, Map map) {
        switch (this.f9840o) {
            case 0:
                if (map == null) {
                    return;
                }
                String str = (String) map.get("hashCode");
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                C1038pf c1038pf = this.f9841p;
                if (str.equals(c1038pf.f9993a)) {
                    c1038pf.c.execute(new D3(17, this));
                    return;
                }
                return;
            default:
                if (map == null) {
                    return;
                }
                String str2 = (String) map.get("hashCode");
                if (TextUtils.isEmpty(str2)) {
                    return;
                }
                C1038pf c1038pf2 = this.f9841p;
                if (str2.equals(c1038pf2.f9993a)) {
                    c1038pf2.c.execute(new D3(18, this));
                    return;
                }
                return;
        }
    }
}
