package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l2.C1798a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Nq {

    /* renamed from: a, reason: collision with root package name */
    public final Um f6395a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6396b;
    public final String c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f6397e;

    /* renamed from: f, reason: collision with root package name */
    public final Fp f6398f;

    /* renamed from: g, reason: collision with root package name */
    public final Gp f6399g;

    /* renamed from: h, reason: collision with root package name */
    public final C1798a f6400h;

    /* renamed from: i, reason: collision with root package name */
    public final I3 f6401i;

    public Nq(Um um, C0248Bc c0248Bc, String str, String str2, Context context, Fp fp, Gp gp, C1798a c1798a, I3 i32) {
        this.f6395a = um;
        this.f6396b = c0248Bc.f4084o;
        this.c = str;
        this.d = str2;
        this.f6397e = context;
        this.f6398f = fp;
        this.f6399g = gp;
        this.f6400h = c1798a;
        this.f6401i = i32;
    }

    public static String c(String str, String str2, String str3) {
        if (true == TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        return str.replaceAll(str2, str3);
    }

    public final ArrayList a(Ep ep, C1434yp c1434yp, List list) {
        return b(ep, c1434yp, false, "", "", list);
    }

    public final ArrayList b(Ep ep, C1434yp c1434yp, boolean z4, String str, String str2, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            boolean z5 = true;
            String c = c(c(c((String) it.next(), "@gw_adlocid@", ((Jp) ep.f4942a.f11290p).f5911f), "@gw_adnetrefresh@", true != z4 ? "0" : "1"), "@gw_sdkver@", this.f6396b);
            if (c1434yp != null) {
                c = AbstractC1230u.I(this.f6397e, c(c(c(c, "@gw_qdata@", c1434yp.y), "@gw_adnetid@", c1434yp.f11541x), "@gw_allocid@", c1434yp.f11540w), c1434yp.f11496W);
            }
            Um um = this.f6395a;
            String c2 = c(c(c(c(c, "@gw_adnetstatus@", um.c()), "@gw_ttr@", Long.toString(um.a(), 10)), "@gw_seqnum@", this.c), "@gw_sessid@", this.d);
            boolean z6 = false;
            if (((Boolean) O1.r.d.c.a(AbstractC1066q6.f10177V2)).booleanValue() && !TextUtils.isEmpty(str)) {
                z6 = true;
            }
            boolean isEmpty = TextUtils.isEmpty(str2);
            boolean z7 = !isEmpty;
            if (z6) {
                z5 = z7;
            } else if (isEmpty) {
                arrayList.add(c2);
            }
            if (this.f6401i.b(Uri.parse(c2))) {
                Uri.Builder buildUpon = Uri.parse(c2).buildUpon();
                if (z6) {
                    buildUpon = buildUpon.appendQueryParameter("ms", str);
                }
                if (z5) {
                    buildUpon = buildUpon.appendQueryParameter("attok", str2);
                }
                c2 = buildUpon.build().toString();
            }
            arrayList.add(c2);
        }
        return arrayList;
    }
}
