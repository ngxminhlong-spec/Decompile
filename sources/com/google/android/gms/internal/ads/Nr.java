package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import t2.C1995b;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Nr {

    /* renamed from: f, reason: collision with root package name */
    public static final HashMap f6402f = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final Context f6403a;

    /* renamed from: b, reason: collision with root package name */
    public final C1995b f6404b;
    public final B0.c c;
    public C0326Qb d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f6405e = new Object();

    public Nr(Context context, C1995b c1995b, B0.c cVar, C1475zn c1475zn) {
        this.f6403a = context;
        this.f6404b = c1995b;
        this.c = cVar;
    }

    public final C0326Qb a() {
        C0326Qb c0326Qb;
        synchronized (this.f6405e) {
            c0326Qb = this.d;
        }
        return c0326Qb;
    }

    public final C0275Ga b() {
        synchronized (this.f6405e) {
            try {
                C0326Qb c0326Qb = this.d;
                if (c0326Qb == null) {
                    return null;
                }
                return (C0275Ga) c0326Qb.f6660p;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean c(C0275Ga c0275Ga) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            try {
                C0326Qb c0326Qb = new C0326Qb(d(c0275Ga).getDeclaredConstructor(Context.class, String.class, byte[].class, Object.class, Bundle.class, Integer.TYPE).newInstance(this.f6403a, "msa-r", c0275Ga.v(), null, new Bundle(), 2), c0275Ga, this.f6404b, this.c, false);
                if (!c0326Qb.V()) {
                    throw new Mr("init failed", 4000);
                }
                int Q3 = c0326Qb.Q();
                if (Q3 != 0) {
                    throw new Mr("ci: " + Q3, 4001);
                }
                synchronized (this.f6405e) {
                    C0326Qb c0326Qb2 = this.d;
                    if (c0326Qb2 != null) {
                        try {
                            c0326Qb2.T();
                        } catch (Mr e4) {
                            this.c.d(e4.f6274o, -1L, e4);
                        }
                    }
                    this.d = c0326Qb;
                }
                this.c.e(3000, System.currentTimeMillis() - currentTimeMillis);
                return true;
            } catch (Exception e5) {
                throw new Mr(2004, e5);
            }
        } catch (Mr e6) {
            this.c.d(e6.f6274o, System.currentTimeMillis() - currentTimeMillis, e6);
            return false;
        } catch (Exception e7) {
            this.c.d(4010, System.currentTimeMillis() - currentTimeMillis, e7);
            return false;
        }
    }

    public final synchronized Class d(C0275Ga c0275Ga) {
        try {
            String D4 = ((C1064q4) c0275Ga.f5183p).D();
            HashMap hashMap = f6402f;
            Class cls = (Class) hashMap.get(D4);
            if (cls != null) {
                return cls;
            }
            try {
                if (!C1475zn.a((File) c0275Ga.f5184q)) {
                    throw new Mr("VM did not pass signature verification", 2026);
                }
                try {
                    File file = (File) c0275Ga.f5185r;
                    if (!file.exists()) {
                        file.mkdirs();
                    }
                    Class<?> loadClass = new DexClassLoader(((File) c0275Ga.f5184q).getAbsolutePath(), file.getAbsolutePath(), null, this.f6403a.getClassLoader()).loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
                    hashMap.put(D4, loadClass);
                    return loadClass;
                } catch (ClassNotFoundException e4) {
                    e = e4;
                    throw new Mr(2008, e);
                } catch (IllegalArgumentException e5) {
                    e = e5;
                    throw new Mr(2008, e);
                } catch (SecurityException e6) {
                    e = e6;
                    throw new Mr(2008, e);
                }
            } catch (GeneralSecurityException e7) {
                throw new Mr(2026, e7);
            }
        } finally {
        }
    }
}
