package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.rw, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1140rw {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f10552a = Logger.getLogger(AbstractC1140rw.class.getName());

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicBoolean f10553b = new AtomicBoolean(false);

    public static boolean a() {
        return f10553b.get();
    }
}
