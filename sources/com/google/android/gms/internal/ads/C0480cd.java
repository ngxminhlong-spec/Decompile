package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.cd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0480cd implements AudioManager.OnAudioFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final AudioManager f8367a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0322Pc f8368b;
    public boolean c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f8369e;

    /* renamed from: f, reason: collision with root package name */
    public float f8370f = 1.0f;

    public C0480cd(Context context, AbstractC0322Pc abstractC0322Pc) {
        this.f8367a = (AudioManager) context.getSystemService("audio");
        this.f8368b = abstractC0322Pc;
    }

    public final void a() {
        boolean z4 = this.d;
        AbstractC0322Pc abstractC0322Pc = this.f8368b;
        AudioManager audioManager = this.f8367a;
        if (!z4 || this.f8369e || this.f8370f <= 0.0f) {
            if (this.c) {
                if (audioManager != null) {
                    this.c = audioManager.abandonAudioFocus(this) == 0;
                }
                abstractC0322Pc.m();
                return;
            }
            return;
        }
        if (this.c) {
            return;
        }
        if (audioManager != null) {
            this.c = audioManager.requestAudioFocus(this, 3, 2) == 1;
        }
        abstractC0322Pc.m();
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i4) {
        this.c = i4 > 0;
        this.f8368b.m();
    }
}
