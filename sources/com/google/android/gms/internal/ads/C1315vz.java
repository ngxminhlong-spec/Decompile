package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.vz, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1315vz {

    /* renamed from: a, reason: collision with root package name */
    public static volatile C1315vz f11095a;

    /* renamed from: b, reason: collision with root package name */
    public static final C1315vz f11096b;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.vz, java.lang.Object] */
    static {
        ?? obj = new Object();
        Map map = Collections.EMPTY_MAP;
        f11096b = obj;
    }

    public static C1315vz a() {
        C1315vz c1315vz = f11095a;
        if (c1315vz != null) {
            return c1315vz;
        }
        synchronized (C1315vz.class) {
            try {
                C1315vz c1315vz2 = f11095a;
                if (c1315vz2 != null) {
                    return c1315vz2;
                }
                C1315vz a4 = Az.a();
                f11095a = a4;
                return a4;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
