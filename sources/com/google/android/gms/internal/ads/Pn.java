package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Pn implements Fo {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6600a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f6601b;
    public final Object c;
    public final Object d;

    public /* synthetic */ Pn(Object obj, Object obj2, Object obj3, int i4) {
        this.f6600a = i4;
        this.f6601b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // com.google.android.gms.internal.ads.Fo
    public final void a(Object obj) {
        List<ActivityManager.RunningTaskInfo> runningTasks;
        ActivityManager.RunningTaskInfo runningTaskInfo;
        ComponentName componentName;
        ComponentName componentName2;
        switch (this.f6600a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.d;
                O1.X0 x02 = (O1.X0) this.c;
                Bundle bundle = (Bundle) obj;
                if (((Boolean) R6.f6785a.r()).booleanValue()) {
                    Bundle bundle2 = new Bundle();
                    Q1.N n4 = N1.n.f1204A.c;
                    String str = null;
                    try {
                        ActivityManager activityManager = (ActivityManager) ((Context) this.f6601b).getSystemService("activity");
                        if (activityManager != null && (runningTasks = activityManager.getRunningTasks(1)) != null && !runningTasks.isEmpty() && (runningTaskInfo = runningTasks.get(0)) != null) {
                            componentName = runningTaskInfo.topActivity;
                            if (componentName != null) {
                                componentName2 = runningTaskInfo.topActivity;
                                str = componentName2.getClassName();
                            }
                        }
                    } catch (Exception unused) {
                    }
                    bundle2.putString("activity", str);
                    Bundle bundle3 = new Bundle();
                    bundle3.putInt("width", x02.f1326s);
                    bundle3.putInt("height", x02.f1323p);
                    bundle2.putBundle("size", bundle3);
                    if (!arrayList.isEmpty()) {
                        bundle2.putParcelableArray("parents", (Parcelable[]) arrayList.toArray(new Parcelable[arrayList.size()]));
                    }
                    bundle.putBundle("view_hierarchy", bundle2);
                    return;
                }
                return;
            case 1:
                Bundle bundle4 = (Bundle) obj;
                bundle4.putString("consent_string", (String) this.f6601b);
                bundle4.putString("fc_consent", (String) this.c);
                bundle4.putBundle("iab_consent_info", (Bundle) this.d);
                return;
            default:
                N1.d dVar = (N1.d) this.d;
                long j4 = dVar.f1157p;
                L1.a aVar = (L1.a) this.f6601b;
                try {
                    JSONObject D4 = android.support.v4.media.session.a.D("pii", (JSONObject) obj);
                    if (aVar != null) {
                        String str2 = aVar.f1075a;
                        if (!TextUtils.isEmpty(str2)) {
                            D4.put("rdid", str2);
                            D4.put("is_lat", aVar.f1076b);
                            D4.put("idtype", "adid");
                            String str3 = (String) dVar.f1158q;
                            if (str3 != null && j4 >= 0) {
                                D4.put("paidv1_id_android_3p", str3);
                                D4.put("paidv1_creation_time_android_3p", j4);
                            }
                            return;
                        }
                    }
                    String str4 = (String) this.c;
                    if (str4 != null) {
                        D4.put("pdid", str4);
                        D4.put("pdidtype", "ssaid");
                    }
                    return;
                } catch (JSONException e4) {
                    Q1.I.x("Failed putting Ad ID.", e4);
                    return;
                }
        }
    }
}
