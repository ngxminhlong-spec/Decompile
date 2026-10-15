package com.google.android.gms.internal.ads;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Ko implements Fo {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f6060a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f6061b;
    public final String c;
    public final boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f6062e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f6063f;

    /* renamed from: g, reason: collision with root package name */
    public final String f6064g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f6065h;

    /* renamed from: i, reason: collision with root package name */
    public final String f6066i;

    /* renamed from: j, reason: collision with root package name */
    public final String f6067j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f6068k;

    /* renamed from: l, reason: collision with root package name */
    public final long f6069l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f6070m;

    /* renamed from: n, reason: collision with root package name */
    public final String f6071n;

    /* renamed from: o, reason: collision with root package name */
    public final int f6072o;

    public Ko(boolean z4, boolean z5, String str, boolean z6, boolean z7, boolean z8, String str2, ArrayList arrayList, String str3, String str4, boolean z9, long j4, boolean z10, String str5, int i4) {
        String str6 = Build.FINGERPRINT;
        String str7 = Build.MODEL;
        this.f6060a = z4;
        this.f6061b = z5;
        this.c = str;
        this.d = z6;
        this.f6062e = z7;
        this.f6063f = z8;
        this.f6064g = str2;
        this.f6065h = arrayList;
        this.f6066i = str3;
        this.f6067j = str4;
        this.f6068k = z9;
        this.f6069l = j4;
        this.f6070m = z10;
        this.f6071n = str5;
        this.f6072o = i4;
    }

    @Override // com.google.android.gms.internal.ads.Fo
    public final void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putBoolean("cog", this.f6060a);
        bundle.putBoolean("coh", this.f6061b);
        bundle.putString("gl", this.c);
        bundle.putBoolean("simulator", this.d);
        bundle.putBoolean("is_latchsky", this.f6062e);
        bundle.putInt("build_api_level", this.f6072o);
        C0937n6 c0937n6 = AbstractC1066q6.p9;
        O1.r rVar = O1.r.d;
        SharedPreferencesOnSharedPreferenceChangeListenerC1023p6 sharedPreferencesOnSharedPreferenceChangeListenerC1023p6 = rVar.c;
        SharedPreferencesOnSharedPreferenceChangeListenerC1023p6 sharedPreferencesOnSharedPreferenceChangeListenerC1023p62 = rVar.c;
        if (!((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC1023p6.a(c0937n6)).booleanValue()) {
            bundle.putBoolean("is_sidewinder", this.f6063f);
        }
        bundle.putString("hl", this.f6064g);
        ArrayList<String> arrayList = this.f6065h;
        if (!arrayList.isEmpty()) {
            bundle.putStringArrayList("hl_list", arrayList);
        }
        bundle.putString("mv", this.f6066i);
        bundle.putString("submodel", Build.MODEL);
        Bundle d = Zf.d(bundle, "device");
        bundle.putBundle("device", d);
        d.putString("build", Build.FINGERPRINT);
        d.putLong("remaining_data_partition_space", this.f6069l);
        Bundle d4 = Zf.d(d, "browser");
        d.putBundle("browser", d4);
        d4.putBoolean("is_browser_custom_tabs_capable", this.f6068k);
        String str = this.f6067j;
        if (!TextUtils.isEmpty(str)) {
            Bundle d5 = Zf.d(d, "play_store");
            d.putBundle("play_store", d5);
            d5.putString("package_version", str);
        }
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC1023p62.a(AbstractC1066q6.C9)).booleanValue()) {
            bundle.putBoolean("is_bstar", this.f6070m);
        }
        String str2 = this.f6071n;
        if (!TextUtils.isEmpty(str2)) {
            bundle.putString("v_unity", str2);
        }
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC1023p62.a(AbstractC1066q6.A9)).booleanValue()) {
            Zf.Y(bundle, "gotmt_l", true, ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC1023p62.a(AbstractC1066q6.x9)).booleanValue());
            Zf.Y(bundle, "gotmt_i", true, ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC1023p62.a(AbstractC1066q6.w9)).booleanValue());
        }
    }
}
