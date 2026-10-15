package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.StrictMode;
import c3.InterfaceFutureC0239a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.dr, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0536dr implements Ls, Bh {

    /* renamed from: q, reason: collision with root package name */
    public static final C0536dr f8514q = new C0536dr();

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f8515o;

    /* renamed from: p, reason: collision with root package name */
    public Context f8516p;

    public /* synthetic */ C0536dr() {
        this.f8515o = 0;
    }

    public /* synthetic */ C0536dr(Context context, int i4) {
        this.f8515o = i4;
        this.f8516p = context;
    }

    public InterfaceFutureC0239a a(boolean z4) {
        Y.d dVar;
        Y.a aVar = new Y.a(z4);
        Context context = this.f8516p;
        int i4 = Build.VERSION.SDK_INT;
        T.a aVar2 = T.a.f1792a;
        if ((i4 >= 30 ? aVar2.a() : 0) >= 5) {
            Object systemService = context.getSystemService((Class<Object>) H.Y.t());
            S3.e.d(systemService, "context.getSystemService…opicsManager::class.java)");
            dVar = new Y.d(H.Y.k(systemService), 1);
        } else {
            if ((i4 >= 30 ? aVar2.a() : 0) == 4) {
                Object systemService2 = context.getSystemService((Class<Object>) H.Y.t());
                S3.e.d(systemService2, "context.getSystemService…opicsManager::class.java)");
                dVar = new Y.d(H.Y.k(systemService2), 0);
            } else {
                dVar = null;
            }
        }
        W.a aVar3 = dVar != null ? new W.a(dVar) : null;
        return aVar3 != null ? aVar3.a(aVar) : Bs.f0(new IllegalStateException());
    }

    @Override // com.google.android.gms.internal.ads.Ls
    public Object b() {
        Context context;
        switch (this.f8515o) {
            case 1:
                C0937n6 c0937n6 = AbstractC1066q6.f10197a;
                SharedPreferencesOnSharedPreferenceChangeListenerC1023p6 sharedPreferencesOnSharedPreferenceChangeListenerC1023p6 = O1.r.d.c;
                Context context2 = this.f8516p;
                if (!sharedPreferencesOnSharedPreferenceChangeListenerC1023p6.c) {
                    synchronized (sharedPreferencesOnSharedPreferenceChangeListenerC1023p6.f9903a) {
                        try {
                            if (!sharedPreferencesOnSharedPreferenceChangeListenerC1023p6.c) {
                                if (!sharedPreferencesOnSharedPreferenceChangeListenerC1023p6.d) {
                                    sharedPreferencesOnSharedPreferenceChangeListenerC1023p6.d = true;
                                }
                                if (context2.getApplicationContext() != null) {
                                    context2 = context2.getApplicationContext();
                                }
                                sharedPreferencesOnSharedPreferenceChangeListenerC1023p6.f9907g = context2;
                                try {
                                    sharedPreferencesOnSharedPreferenceChangeListenerC1023p6.f9906f = m2.c.a(context2).a(sharedPreferencesOnSharedPreferenceChangeListenerC1023p6.f9907g.getPackageName(), 128).metaData;
                                } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
                                }
                                try {
                                    Context context3 = sharedPreferencesOnSharedPreferenceChangeListenerC1023p6.f9907g;
                                    AtomicBoolean atomicBoolean = e2.h.f12754a;
                                    try {
                                        context = context3.createPackageContext("com.google.android.gms", 3);
                                    } catch (PackageManager.NameNotFoundException unused2) {
                                        context = null;
                                    }
                                    if (context != null || context3 == null || (context = context3.getApplicationContext()) != null) {
                                        context3 = context;
                                    }
                                    if (context3 != null) {
                                        C1016p c1016p = O1.r.d.f1380b;
                                        SharedPreferences sharedPreferences = context3.getSharedPreferences("google_ads_flags", 0);
                                        sharedPreferencesOnSharedPreferenceChangeListenerC1023p6.f9905e = sharedPreferences;
                                        if (sharedPreferences != null) {
                                            sharedPreferences.registerOnSharedPreferenceChangeListener(sharedPreferencesOnSharedPreferenceChangeListenerC1023p6);
                                        }
                                        AbstractC0511d7.f8461a.set(new C0980o6(sharedPreferencesOnSharedPreferenceChangeListenerC1023p6.f9905e));
                                        SharedPreferences sharedPreferences2 = sharedPreferencesOnSharedPreferenceChangeListenerC1023p6.f9905e;
                                        if (sharedPreferences2 != null) {
                                            try {
                                                StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
                                                try {
                                                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                                                    String string = sharedPreferences2.getString("flag_configuration", "{}");
                                                    StrictMode.setThreadPolicy(threadPolicy);
                                                    sharedPreferencesOnSharedPreferenceChangeListenerC1023p6.f9908h = new JSONObject(string);
                                                } catch (Throwable th) {
                                                    StrictMode.setThreadPolicy(threadPolicy);
                                                    throw th;
                                                }
                                            } catch (JSONException unused3) {
                                            }
                                        }
                                        sharedPreferencesOnSharedPreferenceChangeListenerC1023p6.c = true;
                                    }
                                } finally {
                                    sharedPreferencesOnSharedPreferenceChangeListenerC1023p6.d = false;
                                    sharedPreferencesOnSharedPreferenceChangeListenerC1023p6.f9904b.open();
                                }
                            }
                        } finally {
                        }
                    }
                }
                return null;
            case 4:
                Context context4 = this.f8516p;
                new C0831kn(4);
                context4.getApplicationContext();
                UC uc = new UC(10);
                HashMap hashMap = new HashMap();
                new HashSet();
                HashMap hashMap2 = new HashMap();
                hashMap.clear();
                hashMap2.clear();
                return uc;
            default:
                return C1075qF.a(this.f8516p);
        }
    }

    @Override // com.google.android.gms.internal.ads.Bh
    /* renamed from: l */
    public void mo3l(Object obj) {
        ((Tg) obj).l(this.f8516p);
    }
}
