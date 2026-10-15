package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import c3.InterfaceFutureC0239a;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.yo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1433yo implements Go {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11470a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final Context f11471b;
    public final Su c;
    public final ScheduledExecutorService d;

    /* renamed from: e, reason: collision with root package name */
    public final Jp f11472e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f11473f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f11474g;

    public C1433yo(Q1.K k3, Context context, Su su, ScheduledExecutorService scheduledExecutorService, C0536dr c0536dr, Jp jp) {
        this.f11473f = k3;
        this.f11471b = context;
        this.c = su;
        this.d = scheduledExecutorService;
        this.f11474g = c0536dr;
        this.f11472e = jp;
    }

    public C1433yo(Su su, ScheduledExecutorService scheduledExecutorService, String str, Context context, Jp jp, C1423ye c1423ye) {
        this.c = su;
        this.d = scheduledExecutorService;
        this.f11473f = str;
        this.f11471b = context;
        this.f11472e = jp;
        this.f11474g = c1423ye;
    }

    @Override // com.google.android.gms.internal.ads.Go
    public final int b() {
        switch (this.f11470a) {
            case 0:
                return 33;
            default:
                return 56;
        }
    }

    @Override // com.google.android.gms.internal.ads.Go
    public final InterfaceFutureC0239a c() {
        boolean z4;
        switch (this.f11470a) {
            case 0:
                return (!((Boolean) O1.r.d.c.a(AbstractC1066q6.n6)).booleanValue() || this.f11472e.f5922q) ? Bs.h0(new Tn(null, 3)) : Bs.k0(new Xj(12, this), this.c);
            default:
                C0937n6 c0937n6 = AbstractC1066q6.O8;
                O1.r rVar = O1.r.d;
                if (((Boolean) rVar.c.a(c0937n6)).booleanValue()) {
                    Q1.K k3 = (Q1.K) this.f11473f;
                    k3.r();
                    synchronized (k3.f1642a) {
                        try {
                            SharedPreferences sharedPreferences = k3.f1645f;
                            if (sharedPreferences != null) {
                                if (sharedPreferences.getLong("topics_consent_expiry_time_ms", 0L) >= System.currentTimeMillis()) {
                                    z4 = k3.f1645f.getBoolean("is_topics_ad_personalization_allowed", false) && !k3.f1650k;
                                }
                            }
                            z4 = false;
                        } finally {
                        }
                    }
                    if (z4) {
                        if (!((Boolean) rVar.c.a(AbstractC1066q6.R8)).booleanValue() || this.f11472e.d.f1305M != 2) {
                            return Bs.c0(Bs.n0(Ku.q(Bs.o0(((C0536dr) this.f11474g).a(false), ((Integer) rVar.c.a(AbstractC1066q6.P8)).intValue(), TimeUnit.MILLISECONDS, this.d)), C0364Xe.f7671q, this.c), Throwable.class, new C0512d8(22, this), this.c);
                        }
                    }
                }
                return Bs.h0(new C0406ao(-1, 1, ""));
        }
    }
}
