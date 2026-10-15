package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import c3.InterfaceFutureC0239a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.to, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1218to implements Go, Fo {

    /* renamed from: a, reason: collision with root package name */
    public final ApplicationInfo f10742a;

    /* renamed from: b, reason: collision with root package name */
    public final PackageInfo f10743b;
    public final Context c;

    public C1218to(ApplicationInfo applicationInfo, PackageInfo packageInfo, Context context) {
        this.f10742a = applicationInfo;
        this.f10743b = packageInfo;
        this.c = context;
    }

    @Override // com.google.android.gms.internal.ads.Fo
    public final void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        ApplicationInfo applicationInfo = this.f10742a;
        String str = applicationInfo.packageName;
        PackageInfo packageInfo = this.f10743b;
        Integer valueOf = packageInfo == null ? null : Integer.valueOf(packageInfo.versionCode);
        bundle.putString("pn", str);
        if (valueOf != null) {
            bundle.putInt("vc", valueOf.intValue());
        }
        String str2 = packageInfo != null ? packageInfo.versionName : null;
        if (str2 != null) {
            bundle.putString("vnm", str2);
        }
        try {
            Context context = this.c;
            String str3 = applicationInfo.packageName;
            Q1.J j4 = Q1.N.f1668k;
            Context context2 = m2.c.a(context).f14053a;
            bundle.putString("dl", String.valueOf(context2.getPackageManager().getApplicationLabel(context2.getPackageManager().getApplicationInfo(str3, 0))));
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.Go
    public final int b() {
        return 29;
    }

    @Override // com.google.android.gms.internal.ads.Go
    public final InterfaceFutureC0239a c() {
        return Bs.h0(this);
    }
}
