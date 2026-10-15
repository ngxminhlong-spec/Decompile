package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Wr extends Vr {

    /* renamed from: h, reason: collision with root package name */
    public static Wr f7575h;

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.gms.internal.ads.Wr, com.google.android.gms.internal.ads.Vr] */
    public static final Wr f(Context context) {
        Wr wr;
        synchronized (Wr.class) {
            try {
                if (f7575h == null) {
                    f7575h = new Vr(context, "paidv1_id", "paidv1_creation_time", "PaidV1LifecycleImpl");
                }
                wr = f7575h;
            } catch (Throwable th) {
                throw th;
            }
        }
        return wr;
    }

    public final void g() {
        synchronized (Wr.class) {
            d(false);
        }
    }
}
