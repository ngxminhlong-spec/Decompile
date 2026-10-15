package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Xr extends Vr {

    /* renamed from: h, reason: collision with root package name */
    public static Xr f7708h;

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.gms.internal.ads.Vr, com.google.android.gms.internal.ads.Xr] */
    public static final Xr g(Context context) {
        Xr xr;
        synchronized (Xr.class) {
            try {
                if (f7708h == null) {
                    f7708h = new Vr(context, "paidv2_id", "paidv2_creation_time", "PaidV2LifecycleImpl");
                }
                xr = f7708h;
            } catch (Throwable th) {
                throw th;
            }
        }
        return xr;
    }

    public final N1.d f(boolean z4, long j4) {
        synchronized (Xr.class) {
            try {
                if (((SharedPreferences) this.f7305f.f4619q).getBoolean("paidv2_publisher_option", true)) {
                    return a(j4, null, null, z4);
                }
                return new N1.d(7);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h() {
        synchronized (Xr.class) {
            try {
                C0258Da c0258Da = this.f7305f;
                if (((SharedPreferences) c0258Da.f4619q).contains(this.f7302a)) {
                    d(false);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
