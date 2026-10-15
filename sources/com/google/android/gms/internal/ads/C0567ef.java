package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import c3.InterfaceFutureC0239a;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.ef, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0567ef {

    /* renamed from: a, reason: collision with root package name */
    public final Context f8623a;

    /* renamed from: b, reason: collision with root package name */
    public final Q1.K f8624b;
    public final C0660gm c;
    public final Qj d;

    /* renamed from: e, reason: collision with root package name */
    public final Su f8625e;

    /* renamed from: f, reason: collision with root package name */
    public final Su f8626f;

    /* renamed from: g, reason: collision with root package name */
    public final ScheduledExecutorService f8627g;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC0280Ha f8628h;

    public C0567ef(Context context, Q1.K k3, C0660gm c0660gm, Qj qj, Su su, Su su2, ScheduledExecutorService scheduledExecutorService) {
        this.f8623a = context;
        this.f8624b = k3;
        this.c = c0660gm;
        this.d = qj;
        this.f8625e = su;
        this.f8626f = su2;
        this.f8627g = scheduledExecutorService;
    }

    public final InterfaceFutureC0239a a(String str, Random random) {
        return TextUtils.isEmpty(str) ? Bs.h0(str) : Bs.c0(b(str, this.d.f6679a, random), Throwable.class, new C0512d8(4, str), this.f8625e);
    }

    public final InterfaceFutureC0239a b(String str, MotionEvent motionEvent, Random random) {
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        C0937n6 c0937n6 = AbstractC1066q6.H8;
        O1.r rVar = O1.r.d;
        SharedPreferencesOnSharedPreferenceChangeListenerC1023p6 sharedPreferencesOnSharedPreferenceChangeListenerC1023p6 = rVar.c;
        SharedPreferencesOnSharedPreferenceChangeListenerC1023p6 sharedPreferencesOnSharedPreferenceChangeListenerC1023p62 = rVar.c;
        if (!str.contains((CharSequence) sharedPreferencesOnSharedPreferenceChangeListenerC1023p6.a(c0937n6)) || this.f8624b.q()) {
            return Bs.h0(str);
        }
        buildUpon.appendQueryParameter((String) sharedPreferencesOnSharedPreferenceChangeListenerC1023p62.a(AbstractC1066q6.I8), String.valueOf(random.nextInt(Integer.MAX_VALUE)));
        if (motionEvent == null) {
            buildUpon.appendQueryParameter((String) sharedPreferencesOnSharedPreferenceChangeListenerC1023p62.a(AbstractC1066q6.J8), "11");
            return Bs.h0(buildUpon.toString());
        }
        C0660gm c0660gm = this.c;
        Context context = c0660gm.f8865b;
        StringBuilder sb = new StringBuilder("AdServicesInfo.version=");
        int i4 = Build.VERSION.SDK_INT;
        T.a aVar = T.a.f1792a;
        sb.append(i4 >= 30 ? aVar.a() : 0);
        Log.d("MeasurementManager", sb.toString());
        X.c cVar = (i4 >= 30 ? aVar.a() : 0) >= 5 ? new X.c(context) : null;
        V.d dVar = cVar != null ? new V.d(cVar) : null;
        c0660gm.f8864a = dVar;
        return Bs.c0(Bs.n0(Ku.q(dVar == null ? Bs.f0(new IllegalStateException("MeasurementManagerFutures is null")) : dVar.b()), new C0727i9(this, buildUpon, str, motionEvent), this.f8626f), Throwable.class, new N1.c(3, this, buildUpon), this.f8625e);
    }
}
