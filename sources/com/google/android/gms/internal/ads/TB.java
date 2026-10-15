package com.google.android.gms.internal.ads;

import android.media.AudioManager;
import android.os.Handler;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class TB implements AudioManager.OnAudioFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f7051a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ UB f7052b;

    public TB(UB ub, Handler handler) {
        this.f7052b = ub;
        this.f7051a = handler;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i4) {
        this.f7051a.post(new C0.C(i4, 10, this));
    }
}
