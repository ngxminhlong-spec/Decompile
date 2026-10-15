package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import b0.RunnableC0203p;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import o2.AbstractC1895f;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.kk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0828kk {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f9308a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f9309b;
    public final Executor c;
    public final C0242Ac d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f9310e;

    /* renamed from: f, reason: collision with root package name */
    public final Iv f9311f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f9312g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f9313h;

    /* renamed from: i, reason: collision with root package name */
    public final AtomicBoolean f9314i;

    /* renamed from: j, reason: collision with root package name */
    public final AtomicReference f9315j;

    public C0828kk(C0260Dc c0260Dc, C0242Ac c0242Ac, Op op, Iv iv, Context context) {
        HashMap hashMap = new HashMap();
        this.f9308a = hashMap;
        this.f9314i = new AtomicBoolean();
        this.f9315j = new AtomicReference(new Bundle());
        this.c = c0260Dc;
        this.d = c0242Ac;
        C0937n6 c0937n6 = AbstractC1066q6.f10125K1;
        O1.r rVar = O1.r.d;
        this.f9310e = ((Boolean) rVar.c.a(c0937n6)).booleanValue();
        this.f9311f = iv;
        C0937n6 c0937n62 = AbstractC1066q6.f10137N1;
        SharedPreferencesOnSharedPreferenceChangeListenerC1023p6 sharedPreferencesOnSharedPreferenceChangeListenerC1023p6 = rVar.c;
        this.f9312g = ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC1023p6.a(c0937n62)).booleanValue();
        this.f9313h = ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC1023p6.a(AbstractC1066q6.j6)).booleanValue();
        this.f9309b = context;
        op.n(hashMap);
    }

    public final void a(Map map, boolean z4) {
        Bundle F2;
        if (map.isEmpty()) {
            Y9.m("Empty paramMap.");
            return;
        }
        if (map.isEmpty()) {
            Y9.m("Empty or null paramMap.");
        } else {
            boolean andSet = this.f9314i.getAndSet(true);
            AtomicReference atomicReference = this.f9315j;
            if (!andSet) {
                String str = (String) O1.r.d.c.a(AbstractC1066q6.T8);
                Q1.B b4 = new Q1.B(2, this, str);
                if (TextUtils.isEmpty(str)) {
                    F2 = Bundle.EMPTY;
                } else {
                    Context context = this.f9309b;
                    PreferenceManager.getDefaultSharedPreferences(context).registerOnSharedPreferenceChangeListener(b4);
                    F2 = AbstractC1895f.F(context, str);
                }
                atomicReference.set(F2);
            }
            Bundle bundle = (Bundle) atomicReference.get();
            for (String str2 : bundle.keySet()) {
                map.put(str2, String.valueOf(bundle.get(str2)));
            }
        }
        String c = this.f9311f.c(map);
        Q1.I.w(c);
        boolean parseBoolean = Boolean.parseBoolean((String) map.get("scar"));
        if (this.f9310e) {
            if (!z4 || this.f9312g) {
                if (!parseBoolean || this.f9313h) {
                    this.c.execute(new RunnableC0203p(24, this, c));
                }
            }
        }
    }
}
