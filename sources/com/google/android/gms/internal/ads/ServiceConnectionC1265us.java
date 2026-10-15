package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.us, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ServiceConnectionC1265us implements ServiceConnection {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C1308vs f10951o;

    public /* synthetic */ ServiceConnectionC1265us(C1308vs c1308vs) {
        this.f10951o = c1308vs;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C1308vs c1308vs = this.f10951o;
        c1308vs.f11080b.g("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        c1308vs.a().post(new C1222ts(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        C1308vs c1308vs = this.f10951o;
        c1308vs.f11080b.g("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        c1308vs.a().post(new C1179ss(1, this));
    }
}
