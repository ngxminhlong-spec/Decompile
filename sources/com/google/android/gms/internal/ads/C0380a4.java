package com.google.android.gms.internal.ads;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.a4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0380a4 {

    /* renamed from: e, reason: collision with root package name */
    public static final String[] f8073e = {"android:establish_vpn_service", "android:establish_vpn_manager"};

    /* renamed from: a, reason: collision with root package name */
    public long f8074a;

    /* renamed from: b, reason: collision with root package name */
    public long f8075b;
    public long c;
    public boolean d;

    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.gms.internal.ads.a4, java.lang.Object] */
    public static C0380a4 a(Context context, Executor executor) {
        String[] strArr = f8073e;
        ?? obj = new Object();
        obj.f8074a = 0L;
        obj.f8075b = 0L;
        obj.c = -1L;
        obj.d = false;
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                ((AppOpsManager) context.getSystemService("appops")).startWatchingActive(strArr, executor, new Z3(obj));
            } catch (IllegalArgumentException | NoSuchMethodError unused) {
            }
        }
        return obj;
    }
}
