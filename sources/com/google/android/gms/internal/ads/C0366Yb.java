package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.Yb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0366Yb {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f7829a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f7830b = new ArrayList();
    public final Context c;
    public final C0258Da d;

    public C0366Yb(Context context, C0258Da c0258Da) {
        this.c = context;
        this.d = c0258Da;
    }

    public final synchronized void a(String str) {
        SharedPreferences defaultSharedPreferences;
        try {
            if (this.f7829a.containsKey(str)) {
                return;
            }
            if (str != "__default__" && (str == null || !str.equals("__default__"))) {
                defaultSharedPreferences = this.c.getSharedPreferences(str, 0);
                Q1.B b4 = new Q1.B(1, this, str);
                this.f7829a.put(str, b4);
                defaultSharedPreferences.registerOnSharedPreferenceChangeListener(b4);
            }
            defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.c);
            Q1.B b42 = new Q1.B(1, this, str);
            this.f7829a.put(str, b42);
            defaultSharedPreferences.registerOnSharedPreferenceChangeListener(b42);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(C0361Xb c0361Xb) {
        this.f7830b.add(c0361Xb);
    }
}
