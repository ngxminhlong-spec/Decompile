package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.tw, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1226tw {
    public static final Logger c = Logger.getLogger(C1226tw.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f10758a;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f10759b;

    public C1226tw() {
        this.f10758a = new ConcurrentHashMap();
        this.f10759b = new ConcurrentHashMap();
    }

    public C1226tw(C1226tw c1226tw) {
        this.f10758a = new ConcurrentHashMap(c1226tw.f10758a);
        this.f10759b = new ConcurrentHashMap(c1226tw.f10759b);
    }

    public final synchronized void a(AbstractC1441yw abstractC1441yw) {
        if (!Bs.q(abstractC1441yw.f())) {
            throw new GeneralSecurityException("failed to register key manager " + String.valueOf(abstractC1441yw.getClass()) + " as it is not FIPS compatible.");
        }
        c(new C1183sw(abstractC1441yw));
    }

    public final synchronized C1183sw b(String str) {
        if (!this.f10758a.containsKey(str)) {
            throw new GeneralSecurityException("No key manager found for key type ".concat(String.valueOf(str)));
        }
        return (C1183sw) this.f10758a.get(str);
    }

    public final synchronized void c(C1183sw c1183sw) {
        try {
            AbstractC1441yw abstractC1441yw = c1183sw.f10653a;
            Class cls = abstractC1441yw.c;
            if (!abstractC1441yw.f11551b.keySet().contains(cls) && !Void.class.equals(cls)) {
                throw new IllegalArgumentException("Given internalKeyMananger " + abstractC1441yw.toString() + " does not support primitive class " + cls.getName());
            }
            String d = abstractC1441yw.d();
            if (this.f10759b.containsKey(d) && !((Boolean) this.f10759b.get(d)).booleanValue()) {
                throw new GeneralSecurityException("New keys are already disallowed for key type ".concat(d));
            }
            C1183sw c1183sw2 = (C1183sw) this.f10758a.get(d);
            if (c1183sw2 != null) {
                if (!c1183sw2.f10653a.getClass().equals(c1183sw.f10653a.getClass())) {
                    c.logp(Level.WARNING, "com.google.crypto.tink.internal.KeyManagerRegistry", "registerKeyManagerContainer", "Attempted overwrite of a registered key manager for key type ".concat(d));
                    throw new GeneralSecurityException("typeUrl (" + d + ") is already registered with " + c1183sw2.f10653a.getClass().getName() + ", cannot be re-registered with " + c1183sw.f10653a.getClass().getName());
                }
            }
            this.f10758a.putIfAbsent(d, c1183sw);
            this.f10759b.put(d, Boolean.TRUE);
        } catch (Throwable th) {
            throw th;
        }
    }
}
