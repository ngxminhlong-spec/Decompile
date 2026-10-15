package com.google.android.gms.internal.ads;

import android.graphics.drawable.AnimationDrawable;
import android.widget.RelativeLayout;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.g7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0639g7 extends RelativeLayout {

    /* renamed from: p, reason: collision with root package name */
    public static final float[] f8785p = {5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f};

    /* renamed from: o, reason: collision with root package name */
    public AnimationDrawable f8786o;

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        AnimationDrawable animationDrawable = this.f8786o;
        if (animationDrawable != null) {
            animationDrawable.start();
        }
        super.onAttachedToWindow();
    }
}
