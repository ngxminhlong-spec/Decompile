package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.aq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0408aq implements Zp {

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f8170a;

    public C0408aq(O1.U0 u02, String str, int i4, String str2, O1.a1 a1Var) {
        HashSet hashSet = new HashSet(Arrays.asList(str2.split(",")));
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        arrayList.add(str);
        if (hashSet.contains("networkType")) {
            arrayList.add(Integer.valueOf(i4));
        }
        if (hashSet.contains("birthday")) {
            arrayList.add(Long.valueOf(u02.f1307p));
        }
        if (hashSet.contains("extras")) {
            arrayList.add(a(u02.f1308q));
        } else if (hashSet.contains("npa")) {
            arrayList.add(u02.f1308q.getString("npa"));
        }
        if (hashSet.contains("gender")) {
            arrayList.add(Integer.valueOf(u02.f1309r));
        }
        if (hashSet.contains("keywords")) {
            List list = u02.f1310s;
            if (list != null) {
                arrayList.add(list.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("isTestDevice")) {
            arrayList.add(Boolean.valueOf(u02.f1311t));
        }
        if (hashSet.contains("tagForChildDirectedTreatment")) {
            arrayList.add(Integer.valueOf(u02.f1312u));
        }
        if (hashSet.contains("manualImpressionsEnabled")) {
            arrayList.add(Boolean.valueOf(u02.f1313v));
        }
        if (hashSet.contains("publisherProvidedId")) {
            arrayList.add(u02.f1314w);
        }
        if (hashSet.contains("location")) {
            Location location = u02.y;
            if (location != null) {
                arrayList.add(location.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("contentUrl")) {
            arrayList.add(u02.f1316z);
        }
        if (hashSet.contains("networkExtras")) {
            arrayList.add(a(u02.f1293A));
        }
        if (hashSet.contains("customTargeting")) {
            arrayList.add(a(u02.f1294B));
        }
        if (hashSet.contains("categoryExclusions")) {
            List list2 = u02.f1295C;
            if (list2 != null) {
                arrayList.add(list2.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("requestAgent")) {
            arrayList.add(u02.f1296D);
        }
        if (hashSet.contains("requestPackage")) {
            arrayList.add(u02.f1297E);
        }
        if (hashSet.contains("isDesignedForFamilies")) {
            arrayList.add(Boolean.valueOf(u02.f1298F));
        }
        if (hashSet.contains("tagForUnderAgeOfConsent")) {
            arrayList.add(Integer.valueOf(u02.f1300H));
        }
        if (hashSet.contains("maxAdContentRating")) {
            arrayList.add(u02.f1301I);
        }
        if (hashSet.contains("orientation")) {
            if (a1Var != null) {
                arrayList.add(Integer.valueOf(a1Var.f1345o));
            } else {
                arrayList.add(null);
            }
        }
        this.f8170a = arrayList.toArray();
    }

    public static String a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        while (it.hasNext()) {
            Object obj = bundle.get((String) it.next());
            sb.append(obj == null ? "null" : obj instanceof Bundle ? a((Bundle) obj) : obj.toString());
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0408aq) {
            return Arrays.equals(this.f8170a, ((C0408aq) obj).f8170a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f8170a);
    }

    public final String toString() {
        Object[] objArr = this.f8170a;
        return "[PoolKey#" + Arrays.hashCode(objArr) + " " + Arrays.toString(objArr) + "]";
    }
}
