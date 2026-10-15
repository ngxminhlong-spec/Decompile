package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Rn implements Fo {

    /* renamed from: a, reason: collision with root package name */
    public final Jp f6849a;

    /* renamed from: b, reason: collision with root package name */
    public final long f6850b;

    public Rn(Jp jp, long j4) {
        this.f6849a = jp;
        this.f6850b = j4;
    }

    @Override // com.google.android.gms.internal.ads.Fo
    public final void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        Jp jp = this.f6849a;
        O1.U0 u02 = jp.d;
        int i4 = u02.f1303K;
        long j4 = u02.f1307p;
        int i5 = u02.f1306o;
        bundle.putInt("http_timeout_millis", i4);
        bundle.putString("slotname", jp.f5911f);
        int i6 = jp.f5920o.f14098p;
        if (i6 == 0) {
            throw null;
        }
        int i7 = i6 - 1;
        if (i7 == 1) {
            bundle.putBoolean("is_new_rewarded", true);
        } else if (i7 == 2) {
            bundle.putBoolean("is_rewarded_interstitial", true);
        }
        bundle.putLong("start_signals_timestamp", this.f6850b);
        Zf.V(bundle, "cust_age", new SimpleDateFormat("yyyyMMdd", Locale.US).format(new Date(j4)), j4 != -1);
        Bundle bundle2 = u02.f1308q;
        if (bundle2 != null) {
            bundle.putBundle("extras", bundle2);
        }
        int i8 = u02.f1309r;
        if (i8 != -1) {
            bundle.putInt("cust_gender", i8);
        }
        List list = u02.f1310s;
        if (list != null) {
            bundle.putStringArrayList("kw", new ArrayList<>(list));
        }
        int i9 = u02.f1312u;
        if (i9 != -1) {
            bundle.putInt("tag_for_child_directed_treatment", i9);
        }
        if (u02.f1311t) {
            bundle.putBoolean("test_request", true);
        }
        bundle.putInt("ppt_p13n", u02.f1305M);
        if (i5 >= 2 && u02.f1313v) {
            bundle.putInt("d_imp_hdr", 1);
        }
        String str = u02.f1314w;
        Zf.V(bundle, "ppid", str, i5 >= 2 && !TextUtils.isEmpty(str));
        Location location = u02.y;
        if (location != null) {
            float accuracy = location.getAccuracy() * 1000.0f;
            long time = location.getTime() * 1000;
            double latitude = location.getLatitude() * 1.0E7d;
            double longitude = 1.0E7d * location.getLongitude();
            Bundle bundle3 = new Bundle();
            bundle3.putFloat("radius", accuracy);
            bundle3.putLong("lat", (long) latitude);
            bundle3.putLong("long", (long) longitude);
            bundle3.putLong("time", time);
            bundle.putBundle("uule", bundle3);
        }
        Zf.I("url", u02.f1316z, bundle);
        List list2 = u02.f1302J;
        if (list2 != null) {
            bundle.putStringArrayList("neighboring_content_urls", new ArrayList<>(list2));
        }
        Bundle bundle4 = u02.f1294B;
        if (bundle4 != null) {
            bundle.putBundle("custom_targeting", bundle4);
        }
        List list3 = u02.f1295C;
        if (list3 != null) {
            bundle.putStringArrayList("category_exclusions", new ArrayList<>(list3));
        }
        Zf.I("request_agent", u02.f1296D, bundle);
        Zf.I("request_pkg", u02.f1297E, bundle);
        Zf.Y(bundle, "is_designed_for_families", u02.f1298F, i5 >= 7);
        if (i5 >= 8) {
            int i10 = u02.f1300H;
            if (i10 != -1) {
                bundle.putInt("tag_for_under_age_of_consent", i10);
            }
            Zf.I("max_ad_content_rating", u02.f1301I, bundle);
        }
    }
}
