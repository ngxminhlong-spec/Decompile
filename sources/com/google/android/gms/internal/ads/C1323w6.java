package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.w6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1323w6 {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedList f11111a = new LinkedList();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f11112b;
    public final Object c;

    public C1323w6(String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f11112b = linkedHashMap;
        this.c = new Object();
        linkedHashMap.put("action", "make_wv");
        linkedHashMap.put("ad_format", str);
    }

    public static final C1237u6 d() {
        N1.n.f1204A.f1212j.getClass();
        return new C1237u6(SystemClock.elapsedRealtime(), null, null);
    }

    public final C1280v6 a() {
        C1280v6 c1280v6;
        boolean booleanValue = ((Boolean) O1.r.d.c.a(AbstractC1066q6.f10094D1)).booleanValue();
        StringBuilder sb = new StringBuilder();
        HashMap hashMap = new HashMap();
        synchronized (this.c) {
            try {
                for (C1237u6 c1237u6 : this.f11111a) {
                    long j4 = c1237u6.f10778a;
                    String str = c1237u6.f10779b;
                    C1237u6 c1237u62 = c1237u6.c;
                    if (c1237u62 != null && j4 > 0) {
                        long j5 = j4 - c1237u62.f10778a;
                        sb.append(str);
                        sb.append('.');
                        sb.append(j5);
                        sb.append(',');
                        if (booleanValue) {
                            if (hashMap.containsKey(Long.valueOf(c1237u62.f10778a))) {
                                StringBuilder sb2 = (StringBuilder) hashMap.get(Long.valueOf(c1237u62.f10778a));
                                sb2.append('+');
                                sb2.append(str);
                            } else {
                                hashMap.put(Long.valueOf(c1237u62.f10778a), new StringBuilder(str));
                            }
                        }
                    }
                }
                this.f11111a.clear();
                String str2 = null;
                if (!TextUtils.isEmpty(null)) {
                    sb.append((String) null);
                } else if (sb.length() > 0) {
                    sb.setLength(sb.length() - 1);
                }
                StringBuilder sb3 = new StringBuilder();
                if (booleanValue) {
                    for (Map.Entry entry : hashMap.entrySet()) {
                        sb3.append((CharSequence) entry.getValue());
                        sb3.append('.');
                        long longValue = ((Long) entry.getKey()).longValue();
                        N1.n nVar = N1.n.f1204A;
                        nVar.f1212j.getClass();
                        long currentTimeMillis = System.currentTimeMillis();
                        nVar.f1212j.getClass();
                        sb3.append((longValue - SystemClock.elapsedRealtime()) + currentTimeMillis);
                        sb3.append(',');
                    }
                    if (sb3.length() > 0) {
                        sb3.setLength(sb3.length() - 1);
                    }
                    str2 = sb3.toString();
                }
                c1280v6 = new C1280v6(sb.toString(), str2);
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1280v6;
    }

    public final void b(String str, String str2) {
        C1151s6 b4;
        if (TextUtils.isEmpty(str2) || (b4 = N1.n.f1204A.f1209g.b()) == null) {
            return;
        }
        synchronized (this.c) {
            C1194t6 c1194t6 = (C1194t6) ((HashMap) b4.c).get(str);
            if (c1194t6 == null) {
                c1194t6 = C1194t6.f10674b;
            }
            LinkedHashMap linkedHashMap = this.f11112b;
            linkedHashMap.put(str, c1194t6.a((String) linkedHashMap.get(str), str2));
        }
    }

    public final void c(C1237u6 c1237u6, long j4, String... strArr) {
        synchronized (this.c) {
            for (int i4 = 0; i4 <= 0; i4++) {
                try {
                    this.f11111a.add(new C1237u6(j4, strArr[i4], c1237u6));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
