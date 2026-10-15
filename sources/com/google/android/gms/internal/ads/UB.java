package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class UB {

    /* renamed from: a, reason: collision with root package name */
    public final AudioManager f7147a;

    /* renamed from: b, reason: collision with root package name */
    public final TB f7148b;
    public SurfaceHolderCallbackC0730iC c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public float f7149e = 1.0f;

    public UB(Context context, Handler handler, SurfaceHolderCallbackC0730iC surfaceHolderCallbackC0730iC) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        audioManager.getClass();
        this.f7147a = audioManager;
        this.c = surfaceHolderCallbackC0730iC;
        this.f7148b = new TB(this, handler);
        this.d = 0;
    }

    public final void a() {
        if (this.d == 0) {
            return;
        }
        if (AbstractC0751is.f9071a < 26) {
            this.f7147a.abandonAudioFocus(this.f7148b);
        }
        b(0);
    }

    public final void b(int i4) {
        if (this.d == i4) {
            return;
        }
        this.d = i4;
        float f4 = i4 == 3 ? 0.2f : 1.0f;
        if (this.f7149e != f4) {
            this.f7149e = f4;
            SurfaceHolderCallbackC0730iC surfaceHolderCallbackC0730iC = this.c;
            if (surfaceHolderCallbackC0730iC != null) {
                C0857lC c0857lC = surfaceHolderCallbackC0730iC.f9035o;
                c0857lC.z1(1, 2, Float.valueOf(c0857lC.f9407a0 * c0857lC.f9392K.f7149e));
            }
        }
    }
}
