package com.google.android.gms.internal.ads;

import O1.C0101z0;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.nm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0959nm {
    public final String c;
    public Ap d = null;

    /* renamed from: e, reason: collision with root package name */
    public C1434yp f9775e = null;

    /* renamed from: f, reason: collision with root package name */
    public O1.Z0 f9776f = null;

    /* renamed from: b, reason: collision with root package name */
    public final Map f9774b = Collections.synchronizedMap(new HashMap());

    /* renamed from: a, reason: collision with root package name */
    public final List f9773a = Collections.synchronizedList(new ArrayList());

    public C0959nm(String str) {
        this.c = str;
    }

    public static String b(C1434yp c1434yp) {
        return ((Boolean) O1.r.d.c.a(AbstractC1066q6.f10191Y2)).booleanValue() ? c1434yp.f11529p0 : c1434yp.f11540w;
    }

    public final void a(C1434yp c1434yp) {
        String b4 = b(c1434yp);
        Map map = this.f9774b;
        Object obj = map.get(b4);
        List list = this.f9773a;
        int indexOf = list.indexOf(obj);
        if (indexOf < 0 || indexOf >= map.size()) {
            indexOf = list.indexOf(this.f9776f);
        }
        if (indexOf < 0 || indexOf >= map.size()) {
            return;
        }
        this.f9776f = (O1.Z0) list.get(indexOf);
        while (true) {
            indexOf++;
            if (indexOf >= list.size()) {
                return;
            }
            O1.Z0 z02 = (O1.Z0) list.get(indexOf);
            z02.f1338p = 0L;
            z02.f1339q = null;
        }
    }

    public final synchronized void c(C1434yp c1434yp, int i4) {
        String str;
        String str2;
        String str3;
        String str4;
        Map map = this.f9774b;
        String b4 = b(c1434yp);
        if (map.containsKey(b4)) {
            return;
        }
        Bundle bundle = new Bundle();
        Iterator<String> keys = c1434yp.f11539v.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                bundle.putString(next, c1434yp.f11539v.getString(next));
            } catch (JSONException unused) {
            }
        }
        if (((Boolean) O1.r.d.c.a(AbstractC1066q6.W5)).booleanValue()) {
            str = c1434yp.f11480F;
            str2 = c1434yp.f11481G;
            str3 = c1434yp.f11482H;
            str4 = c1434yp.f11483I;
        } else {
            str = "";
            str2 = "";
            str3 = "";
            str4 = "";
        }
        O1.Z0 z02 = new O1.Z0(c1434yp.f11479E, 0L, null, bundle, str, str2, str3, str4);
        try {
            this.f9773a.add(i4, z02);
        } catch (IndexOutOfBoundsException e4) {
            N1.n.f1204A.f1209g.h("AdapterResponseInfoCollector.addAdapterResponseInfoEntryAtLocation", e4);
        }
        this.f9774b.put(b4, z02);
    }

    public final void d(C1434yp c1434yp, long j4, C0101z0 c0101z0, boolean z4) {
        String b4 = b(c1434yp);
        Map map = this.f9774b;
        if (map.containsKey(b4)) {
            if (this.f9775e == null) {
                this.f9775e = c1434yp;
            }
            O1.Z0 z02 = (O1.Z0) map.get(b4);
            z02.f1338p = j4;
            z02.f1339q = c0101z0;
            if (((Boolean) O1.r.d.c.a(AbstractC1066q6.X5)).booleanValue() && z4) {
                this.f9776f = z02;
            }
        }
    }
}
