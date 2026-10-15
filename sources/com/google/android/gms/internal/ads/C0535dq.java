package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.dq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0535dq {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f8513a = new HashMap();

    public final C0493cq a(Wp wp, Context context, Sp sp, C1384xi c1384xi) {
        Xp xp;
        HashMap hashMap = this.f8513a;
        C0493cq c0493cq = (C0493cq) hashMap.get(wp);
        if (c0493cq != null) {
            return c0493cq;
        }
        if (wp == Wp.f7569o) {
            C0937n6 c0937n6 = AbstractC1066q6.B5;
            SharedPreferencesOnSharedPreferenceChangeListenerC1023p6 sharedPreferencesOnSharedPreferenceChangeListenerC1023p6 = O1.r.d.c;
            xp = new Xp(context, wp, ((Integer) sharedPreferencesOnSharedPreferenceChangeListenerC1023p6.a(c0937n6)).intValue(), ((Integer) sharedPreferencesOnSharedPreferenceChangeListenerC1023p6.a(AbstractC1066q6.H5)).intValue(), ((Integer) sharedPreferencesOnSharedPreferenceChangeListenerC1023p6.a(AbstractC1066q6.J5)).intValue(), (String) sharedPreferencesOnSharedPreferenceChangeListenerC1023p6.a(AbstractC1066q6.L5), (String) sharedPreferencesOnSharedPreferenceChangeListenerC1023p6.a(AbstractC1066q6.D5), (String) sharedPreferencesOnSharedPreferenceChangeListenerC1023p6.a(AbstractC1066q6.F5));
        } else if (wp == Wp.f7570p) {
            C0937n6 c0937n62 = AbstractC1066q6.C5;
            SharedPreferencesOnSharedPreferenceChangeListenerC1023p6 sharedPreferencesOnSharedPreferenceChangeListenerC1023p62 = O1.r.d.c;
            xp = new Xp(context, wp, ((Integer) sharedPreferencesOnSharedPreferenceChangeListenerC1023p62.a(c0937n62)).intValue(), ((Integer) sharedPreferencesOnSharedPreferenceChangeListenerC1023p62.a(AbstractC1066q6.I5)).intValue(), ((Integer) sharedPreferencesOnSharedPreferenceChangeListenerC1023p62.a(AbstractC1066q6.K5)).intValue(), (String) sharedPreferencesOnSharedPreferenceChangeListenerC1023p62.a(AbstractC1066q6.M5), (String) sharedPreferencesOnSharedPreferenceChangeListenerC1023p62.a(AbstractC1066q6.E5), (String) sharedPreferencesOnSharedPreferenceChangeListenerC1023p62.a(AbstractC1066q6.G5));
        } else if (wp == Wp.f7571q) {
            C0937n6 c0937n63 = AbstractC1066q6.P5;
            SharedPreferencesOnSharedPreferenceChangeListenerC1023p6 sharedPreferencesOnSharedPreferenceChangeListenerC1023p63 = O1.r.d.c;
            xp = new Xp(context, wp, ((Integer) sharedPreferencesOnSharedPreferenceChangeListenerC1023p63.a(c0937n63)).intValue(), ((Integer) sharedPreferencesOnSharedPreferenceChangeListenerC1023p63.a(AbstractC1066q6.R5)).intValue(), ((Integer) sharedPreferencesOnSharedPreferenceChangeListenerC1023p63.a(AbstractC1066q6.S5)).intValue(), (String) sharedPreferencesOnSharedPreferenceChangeListenerC1023p63.a(AbstractC1066q6.N5), (String) sharedPreferencesOnSharedPreferenceChangeListenerC1023p63.a(AbstractC1066q6.O5), (String) sharedPreferencesOnSharedPreferenceChangeListenerC1023p63.a(AbstractC1066q6.Q5));
        } else {
            xp = null;
        }
        Op op = new Op(xp);
        C0493cq c0493cq2 = new C0493cq(op, new C0817kF(op, sp, c1384xi));
        hashMap.put(wp, c0493cq2);
        return c0493cq2;
    }
}
