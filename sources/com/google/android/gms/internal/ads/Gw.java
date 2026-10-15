package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Gw {

    /* renamed from: b, reason: collision with root package name */
    public static final Gw f5352b = new Gw();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f5353a = new HashMap();

    public final synchronized AbstractC1054pv a() {
        if (!this.f5353a.containsKey("AES128_GCM")) {
            throw new GeneralSecurityException("Name AES128_GCM does not exist");
        }
        return (AbstractC1054pv) this.f5353a.get("AES128_GCM");
    }

    public final synchronized void b(String str, AbstractC1054pv abstractC1054pv) {
        try {
            if (!this.f5353a.containsKey(str)) {
                this.f5353a.put(str, abstractC1054pv);
                return;
            }
            if (((AbstractC1054pv) this.f5353a.get(str)).equals(abstractC1054pv)) {
                return;
            }
            throw new GeneralSecurityException("Parameters object with name " + str + " already exists (" + String.valueOf(this.f5353a.get(str)) + "), cannot insert " + String.valueOf(abstractC1054pv));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            b((String) entry.getKey(), (AbstractC1054pv) entry.getValue());
        }
    }
}
