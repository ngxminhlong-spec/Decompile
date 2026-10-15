package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import java.util.List;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.z6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1452z6 {

    /* renamed from: a, reason: collision with root package name */
    public Qw f11573a;

    /* renamed from: b, reason: collision with root package name */
    public C0831kn f11574b;
    public GB c;
    public q2.e d;

    public static boolean a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
            ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
            List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
            if (queryIntentActivities != null && resolveActivity != null) {
                for (int i4 = 0; i4 < queryIntentActivities.size(); i4++) {
                    if (resolveActivity.activityInfo.name.equals(queryIntentActivities.get(i4).activityInfo.name)) {
                        return resolveActivity.activityInfo.packageName.equals(AbstractC0587ez.b(context));
                    }
                }
            }
        }
        return false;
    }
}
