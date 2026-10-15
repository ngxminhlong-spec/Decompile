package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashMap;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.We, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0359We implements InterfaceC0349Ue {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7509a;

    /* renamed from: b, reason: collision with root package name */
    public final Ok f7510b;

    public /* synthetic */ C0359We(Ok ok, int i4) {
        this.f7509a = i4;
        this.f7510b = ok;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0349Ue
    public final void a(HashMap hashMap) {
        switch (this.f7509a) {
            case 0:
                String str = (String) hashMap.get("gesture");
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                int hashCode = str.hashCode();
                Ok ok = this.f7510b;
                if (hashCode != 97520651) {
                    if (hashCode == 109399814 && str.equals("shake")) {
                        ok.k(Lk.f6154p, true);
                        return;
                    }
                } else if (str.equals("flick")) {
                    ok.k(Lk.f6155q, true);
                    return;
                }
                ok.k(Lk.f6153o, true);
                return;
            default:
                String str2 = (String) hashMap.get("test_mode_enabled");
                if (TextUtils.isEmpty(str2)) {
                    return;
                }
                this.f7510b.e(str2.equals("true"));
                return;
        }
    }
}
