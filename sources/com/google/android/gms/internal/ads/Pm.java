package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import c3.InterfaceFutureC0239a;
import com.google.ads.mediation.AbstractAdViewAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class Pm implements InterfaceC0745im {
    @Override // com.google.android.gms.internal.ads.InterfaceC0745im
    public final InterfaceFutureC0239a a(Ep ep, C1434yp c1434yp) {
        JSONObject jSONObject = c1434yp.f11539v;
        JSONObject jSONObject2 = c1434yp.f11478D;
        C0948nb c0948nb = c1434yp.f11520l;
        String optString = jSONObject.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, "");
        Jp jp = (Jp) ep.f4942a.f11290p;
        Ip ip = new Ip();
        ip.f5739o.f14098p = jp.f5920o.f14098p;
        O1.U0 u02 = jp.d;
        ip.f5727a = u02;
        ip.f5728b = jp.f5910e;
        ip.f5743s = jp.f5923r;
        ip.c = jp.f5911f;
        ip.d = jp.f5908a;
        ip.f5730f = jp.f5912g;
        ip.f5731g = jp.f5913h;
        ip.f5732h = jp.f5914i;
        ip.f5733i = jp.f5915j;
        K1.a aVar = jp.f5917l;
        ip.f5734j = aVar;
        if (aVar != null) {
            ip.f5729e = aVar.f1051o;
        }
        K1.d dVar = jp.f5918m;
        ip.f5735k = dVar;
        if (dVar != null) {
            ip.f5729e = dVar.f1058o;
            ip.f5736l = dVar.f1059p;
        }
        ip.f5740p = jp.f5921p;
        ip.f5741q = jp.c;
        ip.f5742r = jp.f5922q;
        ip.c = optString;
        Bundle bundle = u02.f1293A;
        Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        Bundle bundle3 = bundle2.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        Bundle bundle4 = bundle3 == null ? new Bundle() : new Bundle(bundle3);
        bundle4.putInt("gw", 1);
        JSONObject jSONObject3 = c1434yp.f11539v;
        String optString2 = jSONObject3.optString("mad_hac", null);
        if (optString2 != null) {
            bundle4.putString("mad_hac", optString2);
        }
        String optString3 = jSONObject3.optString("adJson", null);
        if (optString3 != null) {
            bundle4.putString("_ad", optString3);
        }
        bundle4.putBoolean("_noRefresh", true);
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String optString4 = jSONObject2.optString(next, null);
            if (next != null) {
                bundle4.putString(next, optString4);
            }
        }
        bundle2.putBundle("com.google.ads.mediation.admob.AdMobAdapter", bundle4);
        Bundle bundle5 = u02.f1294B;
        List list = u02.f1295C;
        String str = u02.f1296D;
        int i4 = u02.f1309r;
        String str2 = u02.f1297E;
        List list2 = u02.f1310s;
        boolean z4 = u02.f1298F;
        boolean z5 = u02.f1311t;
        O1.N n4 = u02.f1299G;
        Bundle bundle6 = bundle2;
        int i5 = u02.f1312u;
        int i6 = u02.f1300H;
        boolean z6 = u02.f1313v;
        String str3 = u02.f1301I;
        ip.f5727a = new O1.U0(u02.f1306o, u02.f1307p, bundle4, i4, list2, z5, i5, z6, u02.f1314w, u02.f1315x, u02.y, u02.f1316z, bundle6, bundle5, list, str, str2, z4, n4, i6, str3, u02.f1302J, u02.f1303K, u02.f1304L, u02.f1305M);
        Jp a4 = ip.a();
        Bundle bundle7 = new Bundle();
        Ap ap = (Ap) ep.f4943b.f6526q;
        Bundle bundle8 = new Bundle();
        bundle8.putStringArrayList("nofill_urls", new ArrayList<>(ap.f3997a));
        bundle8.putInt("refresh_interval", ap.c);
        bundle8.putString("gws_query_id", ap.f3998b);
        bundle7.putBundle("parent_common_config", bundle8);
        Jp jp2 = (Jp) ep.f4942a.f11290p;
        Bundle bundle9 = new Bundle();
        bundle9.putString("initial_ad_unit_id", jp2.f5911f);
        bundle9.putString("allocation_id", c1434yp.f11540w);
        bundle9.putStringArrayList("click_urls", new ArrayList<>(c1434yp.c));
        bundle9.putStringArrayList("imp_urls", new ArrayList<>(c1434yp.d));
        bundle9.putStringArrayList("manual_tracking_urls", new ArrayList<>(c1434yp.f11528p));
        bundle9.putStringArrayList("fill_urls", new ArrayList<>(c1434yp.f11522m));
        bundle9.putStringArrayList("video_start_urls", new ArrayList<>(c1434yp.f11510g));
        bundle9.putStringArrayList("video_reward_urls", new ArrayList<>(c1434yp.f11512h));
        bundle9.putStringArrayList("video_complete_urls", new ArrayList<>(c1434yp.f11514i));
        bundle9.putString("transaction_id", c1434yp.f11516j);
        bundle9.putString("valid_from_timestamp", c1434yp.f11518k);
        bundle9.putBoolean("is_closable_area_disabled", c1434yp.f11489P);
        bundle9.putString("recursive_server_response_data", c1434yp.f11527o0);
        if (c0948nb != null) {
            Bundle bundle10 = new Bundle();
            bundle10.putInt("rb_amount", c0948nb.f9732p);
            bundle10.putString("rb_type", c0948nb.f9731o);
            bundle9.putParcelableArray("rewards", new Bundle[]{bundle10});
        }
        bundle7.putBundle("parent_ad_config", bundle9);
        return c(a4, bundle7, c1434yp, ep);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0745im
    public final boolean b(Ep ep, C1434yp c1434yp) {
        return !TextUtils.isEmpty(c1434yp.f11539v.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, ""));
    }

    public abstract C0834kq c(Jp jp, Bundle bundle, C1434yp c1434yp, Ep ep);
}
