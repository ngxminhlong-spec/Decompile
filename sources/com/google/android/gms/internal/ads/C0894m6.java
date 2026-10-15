package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.app.Application;
import android.app.UiModeManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.view.WindowManager;
import b1.C0215b;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.m6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0894m6 implements Bh, Ls {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f9565o;

    /* renamed from: p, reason: collision with root package name */
    public final Context f9566p;

    public C0894m6(Context context) {
        this.f9565o = 0;
        h2.y.j(context, "Context can not be null");
        this.f9566p = context;
    }

    public /* synthetic */ C0894m6(Context context, int i4) {
        this.f9565o = i4;
        this.f9566p = context;
    }

    public boolean a(Intent intent) {
        h2.y.j(intent, "Intent can not be null");
        return !this.f9566p.getPackageManager().queryIntentActivities(intent, 0).isEmpty();
    }

    @Override // com.google.android.gms.internal.ads.Ls
    public Object b() {
        int i4 = this.f9565o;
        Context context = this.f9566p;
        switch (i4) {
            case 4:
                Y y = Wj.f7528E;
                if (y.f7724p) {
                    return Boolean.TRUE;
                }
                Context applicationContext = context.getApplicationContext();
                if (applicationContext == null) {
                    throw new IllegalArgumentException("Application Context cannot be null");
                }
                if (!y.f7724p) {
                    int i5 = 1;
                    y.f7724p = true;
                    C0215b a4 = C0215b.a();
                    a4.getClass();
                    a4.f3458p = new Wq(new Handler(), applicationContext, a4);
                    boolean z4 = applicationContext instanceof Application;
                    if (z4) {
                        ((Application) applicationContext).registerActivityLifecycleCallbacks(Yq.f7900r);
                    }
                    Zf.f8021a = (UiModeManager) applicationContext.getSystemService("uimode");
                    WindowManager windowManager = AbstractC0750ir.f9069a;
                    AbstractC0750ir.c = applicationContext.getResources().getDisplayMetrics().density;
                    AbstractC0750ir.f9069a = (WindowManager) applicationContext.getSystemService("window");
                    applicationContext.registerReceiver(new Q1.M(i5), new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
                    C0536dr.f8514q.f8516p = applicationContext.getApplicationContext();
                    Xq xq = Xq.f7703s;
                    C0452br c0452br = (C0452br) xq.f7707r;
                    if (!xq.f7704o) {
                        if (z4) {
                            ((Application) applicationContext).registerActivityLifecycleCallbacks(c0452br);
                        }
                        c0452br.f8294q = xq;
                        c0452br.f8292o = true;
                        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                        ActivityManager.getMyMemoryState(runningAppProcessInfo);
                        c0452br.f8293p = runningAppProcessInfo.importance == 100;
                        xq.f7705p = c0452br.f8293p;
                        xq.f7704o = true;
                    }
                }
                return Boolean.valueOf(y.f7724p);
            default:
                return new C0604fF(context);
        }
    }

    @Override // com.google.android.gms.internal.ads.Bh
    /* renamed from: l */
    public void mo3l(Object obj) {
        Tg tg = (Tg) obj;
        switch (this.f9565o) {
            case 2:
                tg.o(this.f9566p);
                return;
            default:
                tg.F(this.f9566p);
                return;
        }
    }
}
