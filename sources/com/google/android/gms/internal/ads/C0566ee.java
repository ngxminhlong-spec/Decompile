package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.ee, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0566ee extends MutableContextWrapper {

    /* renamed from: a, reason: collision with root package name */
    public Activity f8621a;

    /* renamed from: b, reason: collision with root package name */
    public Context f8622b;
    public Context c;

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        return this.c.getSystemService(str);
    }

    @Override // android.content.MutableContextWrapper
    public final void setBaseContext(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f8622b = applicationContext;
        this.f8621a = context instanceof Activity ? (Activity) context : null;
        this.c = context;
        super.setBaseContext(applicationContext);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent) {
        Activity activity = this.f8621a;
        if (activity != null) {
            activity.startActivity(intent);
        } else {
            intent.setFlags(268435456);
            this.f8622b.startActivity(intent);
        }
    }
}
