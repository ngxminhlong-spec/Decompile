package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Tj {

    /* renamed from: a, reason: collision with root package name */
    public final Op f7065a;

    /* renamed from: b, reason: collision with root package name */
    public final Sj f7066b;

    public Tj(Op op, Sj sj) {
        this.f7065a = op;
        this.f7066b = sj;
    }

    public final V9 a(String str) {
        InterfaceC1069q9 interfaceC1069q9 = (InterfaceC1069q9) ((AtomicReference) this.f7065a.f6527r).get();
        if (interfaceC1069q9 == null) {
            Y9.s("Unexpected call to adapter creator.");
            throw new RemoteException();
        }
        V9 y = interfaceC1069q9.y(str);
        Sj sj = this.f7066b;
        synchronized (sj) {
            if (sj.f6999a.containsKey(str)) {
                return y;
            }
            try {
                sj.f6999a.put(str, new Rj(str, y.d(), y.h(), true));
                return y;
            } catch (Throwable unused) {
                return y;
            }
        }
    }

    public final Pp b(String str, JSONObject jSONObject) {
        InterfaceC1154s9 B4;
        Sj sj = this.f7066b;
        try {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                B4 = new G9(new AdMobAdapter());
            } else if ("com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(str)) {
                B4 = new G9(new zzbsh());
            } else {
                InterfaceC1069q9 interfaceC1069q9 = (InterfaceC1069q9) ((AtomicReference) this.f7065a.f6527r).get();
                if (interfaceC1069q9 == null) {
                    Y9.s("Unexpected call to adapter creator.");
                    throw new RemoteException();
                }
                if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                    try {
                        String string = jSONObject.getString("class_name");
                        B4 = interfaceC1069q9.Y(string) ? interfaceC1069q9.B("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter") : interfaceC1069q9.F(string) ? interfaceC1069q9.B(string) : interfaceC1069q9.B("com.google.ads.mediation.customevent.CustomEventAdapter");
                    } catch (JSONException e4) {
                        Y9.q("Invalid custom event.", e4);
                    }
                }
                B4 = interfaceC1069q9.B(str);
            }
            Pp pp = new Pp(B4);
            sj.b(str, pp);
            return pp;
        } catch (Throwable th) {
            if (((Boolean) O1.r.d.c.a(AbstractC1066q6.m8)).booleanValue()) {
                sj.b(str, null);
            }
            throw new Exception(th);
        }
    }
}
