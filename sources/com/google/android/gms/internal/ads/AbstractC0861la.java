package com.google.android.gms.internal.ads;

import java.util.HashSet;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.la, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0861la {

    /* renamed from: a, reason: collision with root package name */
    public static final HashSet f9432a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    public static String f9433b = "media3.common";

    public static synchronized void a(String str) {
        synchronized (AbstractC0861la.class) {
            if (f9432a.add(str)) {
                f9433b = f9433b + ", " + str;
            }
        }
    }
}
