package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class SB extends BroadcastReceiver implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final Handler f6953o;

    public SB(Handler handler) {
        this.f6953o = handler;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.f6953o.post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
    }
}
