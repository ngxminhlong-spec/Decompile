package com.google.android.gms.internal.measurement;

import android.os.Build;
import android.os.UserManager;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.measurement.a1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1490a1 {

    /* renamed from: a, reason: collision with root package name */
    public static UserManager f11875a;

    /* renamed from: b, reason: collision with root package name */
    public static volatile boolean f11876b;

    static {
        f11876b = !(Build.VERSION.SDK_INT >= 24);
    }
}
