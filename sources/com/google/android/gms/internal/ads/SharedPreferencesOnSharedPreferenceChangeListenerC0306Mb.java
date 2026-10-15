package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.Mb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class SharedPreferencesOnSharedPreferenceChangeListenerC0306Mb implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final Context f6244a;

    /* renamed from: b, reason: collision with root package name */
    public final SharedPreferences f6245b;
    public final Q1.K c;
    public final C0356Wb d;

    /* renamed from: e, reason: collision with root package name */
    public String f6246e = "-1";

    /* renamed from: f, reason: collision with root package name */
    public int f6247f = -1;

    public SharedPreferencesOnSharedPreferenceChangeListenerC0306Mb(Context context, Q1.K k3, C0356Wb c0356Wb) {
        this.f6245b = PreferenceManager.getDefaultSharedPreferences(context);
        this.c = k3;
        this.f6244a = context;
        this.d = c0356Wb;
    }

    public final void a() {
        SharedPreferences sharedPreferences = this.f6245b;
        sharedPreferences.registerOnSharedPreferenceChangeListener(this);
        onSharedPreferenceChanged(sharedPreferences, "gad_has_consent_for_cookies");
        if (!((Boolean) O1.r.d.c.a(AbstractC1066q6.f10272q0)).booleanValue()) {
            onSharedPreferenceChanged(sharedPreferences, "IABTCF_PurposeConsents");
        } else {
            onSharedPreferenceChanged(sharedPreferences, "IABTCF_gdprApplies");
            onSharedPreferenceChanged(sharedPreferences, "IABTCF_TCString");
        }
    }

    public final void b(String str, int i4) {
        Context context;
        C0937n6 c0937n6 = AbstractC1066q6.f10263o0;
        O1.r rVar = O1.r.d;
        boolean z4 = true;
        if (!((Boolean) rVar.c.a(c0937n6)).booleanValue() ? !(str.isEmpty() || str.charAt(0) != '1') : !(i4 == 0 || str.isEmpty() || (str.charAt(0) != '1' && !str.equals("-1")))) {
            z4 = false;
        }
        this.c.h(z4);
        if (((Boolean) rVar.c.a(AbstractC1066q6.r5)).booleanValue() && z4 && (context = this.f6244a) != null) {
            context.deleteDatabase("OfflineUpload.db");
        }
        synchronized (this.d.f7456l) {
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        int i4;
        C0937n6 c0937n6 = AbstractC1066q6.f10272q0;
        O1.r rVar = O1.r.d;
        if (!((Boolean) rVar.c.a(c0937n6)).booleanValue()) {
            String string = sharedPreferences.getString("IABTCF_PurposeConsents", "-1");
            int i5 = sharedPreferences.getInt("gad_has_consent_for_cookies", -1);
            String valueOf = String.valueOf(str);
            int hashCode = valueOf.hashCode();
            if (hashCode == -2004976699) {
                if (!valueOf.equals("IABTCF_PurposeConsents") || string.equals("-1") || this.f6246e.equals(string)) {
                    return;
                }
                this.f6246e = string;
                b(string, i5);
                return;
            }
            if (hashCode == -527267622 && valueOf.equals("gad_has_consent_for_cookies")) {
                if (!((Boolean) rVar.c.a(AbstractC1066q6.f10263o0)).booleanValue() || i5 == -1 || this.f6247f == i5) {
                    return;
                }
                this.f6247f = i5;
                b(string, i5);
                return;
            }
            return;
        }
        if (AbstractC1230u.o(str, "gad_has_consent_for_cookies")) {
            int i6 = sharedPreferences.getInt("gad_has_consent_for_cookies", -1);
            Q1.K k3 = this.c;
            k3.r();
            synchronized (k3.f1642a) {
                i4 = k3.f1654o;
            }
            if (i6 == i4) {
                this.c.e(i6);
                return;
            } else {
                this.c.h(true);
                new Bundle();
                throw null;
            }
        }
        if (AbstractC1230u.o(str, "IABTCF_gdprApplies") || AbstractC1230u.o(str, "IABTCF_TCString") || AbstractC1230u.o(str, "IABTCF_PurposeConsents")) {
            String string2 = sharedPreferences.getString(str, "-1");
            if (string2 == null || string2.equals(this.c.B(str))) {
                this.c.f(str, string2);
            } else {
                this.c.h(true);
                new Bundle();
                throw null;
            }
        }
    }
}
