package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.CookieManager;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.Ye, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0369Ye implements InterfaceC0349Ue {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7856a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f7857b;

    public /* synthetic */ C0369Ye(int i4, Object obj) {
        this.f7856a = i4;
        this.f7857b = obj;
    }

    public C0369Ye(Context context) {
        this.f7856a = 2;
        this.f7857b = N1.n.f1204A.f1207e.a();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0349Ue
    public final void a(HashMap hashMap) {
        switch (this.f7856a) {
            case 0:
                if (((Boolean) O1.r.d.c.a(AbstractC1066q6.O8)).booleanValue()) {
                    Bs.c0(Ku.q(((C0536dr) this.f7857b).a(true)), Throwable.class, C0364Xe.f7658b, AbstractC0266Ec.f4897a);
                    return;
                }
                return;
            case 1:
                String str = (String) hashMap.get("render_in_browser");
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                try {
                    C1391xp c1391xp = (C1391xp) this.f7857b;
                    if (Boolean.parseBoolean(str)) {
                        c1391xp.c(1, 2);
                    } else {
                        c1391xp.c(2, 1);
                    }
                    return;
                } catch (Exception e4) {
                    throw new IllegalStateException("Invalid render_in_browser state", e4);
                }
            default:
                CookieManager cookieManager = (CookieManager) this.f7857b;
                if (cookieManager == null) {
                    return;
                }
                if (((String) hashMap.get("clear")) == null) {
                    String str2 = (String) hashMap.get("cookie");
                    if (TextUtils.isEmpty(str2)) {
                        return;
                    }
                    cookieManager.setCookie((String) O1.r.d.c.a(AbstractC1066q6.f10093D0), str2);
                    return;
                }
                String str3 = (String) O1.r.d.c.a(AbstractC1066q6.f10093D0);
                String cookie = cookieManager.getCookie(str3);
                if (cookie != null) {
                    List K02 = C1384xi.G0(new C1437ys(';')).K0(cookie);
                    for (int i4 = 0; i4 < K02.size(); i4++) {
                        String str4 = (String) K02.get(i4);
                        C1384xi G02 = C1384xi.G0(new C1437ys('='));
                        str4.getClass();
                        Js js = (Js) ((Ks) G02.f11290p).d(G02, str4);
                        if (!js.hasNext()) {
                            throw new IndexOutOfBoundsException("position (0) must be less than the number of elements that remained (0)");
                        }
                        cookieManager.setCookie(str3, String.valueOf((String) js.next()).concat(String.valueOf((String) O1.r.d.c.a(AbstractC1066q6.f10268p0))));
                    }
                    return;
                }
                return;
        }
    }
}
