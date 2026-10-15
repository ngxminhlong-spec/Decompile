package com.google.android.gms.internal.ads;

import android.app.AppOpsManager$OnOpActiveChangedListener;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Z3 implements AppOpsManager$OnOpActiveChangedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0380a4 f7961a;

    public Z3(C0380a4 c0380a4) {
        this.f7961a = c0380a4;
    }

    public final void onOpActiveChanged(String str, int i4, String str2, boolean z4) {
        if (z4) {
            this.f7961a.f8074a = System.currentTimeMillis();
            this.f7961a.d = true;
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (this.f7961a.f8075b > 0) {
            C0380a4 c0380a4 = this.f7961a;
            long j4 = c0380a4.f8075b;
            if (currentTimeMillis >= j4) {
                c0380a4.c = currentTimeMillis - j4;
            }
        }
        this.f7961a.d = false;
    }
}
