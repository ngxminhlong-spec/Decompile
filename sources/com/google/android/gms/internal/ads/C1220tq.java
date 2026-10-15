package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l2.C1798a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.tq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1220tq {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f10751a;

    /* renamed from: b, reason: collision with root package name */
    public final Op f10752b;

    public C1220tq() {
        HashMap hashMap = new HashMap();
        this.f10751a = hashMap;
        this.f10752b = new Op(N1.n.f1204A.f1212j);
        hashMap.put("new_csi", "1");
    }

    public static C1220tq b(String str) {
        C1220tq c1220tq = new C1220tq();
        c1220tq.f10751a.put("action", str);
        return c1220tq;
    }

    public final void a(String str, String str2) {
        this.f10751a.put(str, str2);
    }

    public final void c(String str) {
        Op op = this.f10752b;
        C1798a c1798a = (C1798a) op.f6525p;
        HashMap hashMap = (HashMap) op.f6527r;
        if (!hashMap.containsKey(str)) {
            c1798a.getClass();
            hashMap.put(str, Long.valueOf(SystemClock.elapsedRealtime()));
            return;
        }
        c1798a.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime() - ((Long) hashMap.remove(str)).longValue();
        StringBuilder sb = new StringBuilder();
        sb.append(elapsedRealtime);
        op.x(str, sb.toString());
    }

    public final void d(String str, String str2) {
        Op op = this.f10752b;
        C1798a c1798a = (C1798a) op.f6525p;
        HashMap hashMap = (HashMap) op.f6527r;
        if (!hashMap.containsKey(str)) {
            c1798a.getClass();
            hashMap.put(str, Long.valueOf(SystemClock.elapsedRealtime()));
            return;
        }
        c1798a.getClass();
        op.x(str, str2 + (SystemClock.elapsedRealtime() - ((Long) hashMap.remove(str)).longValue()));
    }

    public final void e(Ap ap) {
        if (TextUtils.isEmpty(ap.f3998b)) {
            return;
        }
        this.f10751a.put("gqi", ap.f3998b);
    }

    public final void f(Ep ep, C1163sc c1163sc) {
        Op op = ep.f4943b;
        e((Ap) op.f6526q);
        List list = (List) op.f6525p;
        if (list.isEmpty()) {
            return;
        }
        int i4 = ((C1434yp) list.get(0)).f11502b;
        HashMap hashMap = this.f10751a;
        switch (i4) {
            case 1:
                hashMap.put("ad_format", "banner");
                return;
            case 2:
                hashMap.put("ad_format", "interstitial");
                return;
            case 3:
                hashMap.put("ad_format", "native_express");
                return;
            case 4:
                hashMap.put("ad_format", "native_advanced");
                return;
            case 5:
                hashMap.put("ad_format", "rewarded");
                return;
            case 6:
                hashMap.put("ad_format", "app_open_ad");
                if (c1163sc != null) {
                    hashMap.put("as", true != c1163sc.f10607g ? "0" : "1");
                    return;
                }
                return;
            default:
                hashMap.put("ad_format", "unknown");
                return;
        }
    }

    public final HashMap g() {
        int i4;
        HashMap hashMap = new HashMap(this.f10751a);
        Op op = this.f10752b;
        op.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = ((HashMap) op.f6526q).entrySet().iterator();
        while (true) {
            i4 = 0;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            if (((List) entry.getValue()).size() > 1) {
                Iterator it2 = ((List) entry.getValue()).iterator();
                while (it2.hasNext()) {
                    i4++;
                    arrayList.add(new C1349wq(((String) entry.getKey()) + "." + i4, (String) it2.next()));
                }
            } else {
                arrayList.add(new C1349wq((String) entry.getKey(), (String) ((List) entry.getValue()).get(0)));
            }
        }
        int size = arrayList.size();
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            C1349wq c1349wq = (C1349wq) obj;
            hashMap.put(c1349wq.f11213a, c1349wq.f11214b);
        }
        return hashMap;
    }
}
