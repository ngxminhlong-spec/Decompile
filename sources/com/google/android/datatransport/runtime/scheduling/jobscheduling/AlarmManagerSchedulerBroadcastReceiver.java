package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import C1.f;
import C1.l;
import G1.a;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import java.util.concurrent.Executor;
import t3.g;
import w1.C2046i;
import w1.C2052o;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f3849a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int intValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i4 = intent.getExtras().getInt("attemptNumber");
        C2052o.b(context);
        g a4 = C2046i.a();
        a4.h(queryParameter);
        a4.f14963q = a.b(intValue);
        if (queryParameter2 != null) {
            a4.f14962p = Base64.decode(queryParameter2, 0);
        }
        l lVar = C2052o.a().d;
        ((Executor) lVar.f502e).execute(new f(lVar, a4.a(), i4, new C1.a(0)));
    }
}
