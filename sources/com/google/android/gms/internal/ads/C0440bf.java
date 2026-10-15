package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.bf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0440bf implements InterfaceC0349Ue {

    /* renamed from: a, reason: collision with root package name */
    public final Context f8262a;

    /* renamed from: b, reason: collision with root package name */
    public final Q1.K f8263b = N1.n.f1204A.f1209g.c();

    public C0440bf(Context context) {
        this.f8262a = context;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0349Ue
    public final void a(HashMap hashMap) {
        if (hashMap.isEmpty()) {
            return;
        }
        String str = (String) hashMap.get("gad_idless");
        if (str != null) {
            Q1.K k3 = this.f8263b;
            boolean parseBoolean = Boolean.parseBoolean(str);
            k3.h(parseBoolean);
            if (parseBoolean) {
                Context context = this.f8262a;
                C0937n6 c0937n6 = AbstractC1066q6.r5;
                O1.r rVar = O1.r.d;
                if (((Boolean) rVar.c.a(c0937n6)).booleanValue()) {
                    context.deleteDatabase("OfflineUpload.db");
                }
                try {
                    Wr f4 = Wr.f(context);
                    Xr g4 = Xr.g(context);
                    f4.g();
                    synchronized (Wr.class) {
                        f4.d(true);
                    }
                    g4.h();
                    if (((Boolean) rVar.c.a(AbstractC1066q6.f10315z2)).booleanValue()) {
                        g4.f7305f.t("paidv2_publisher_option");
                    }
                    if (((Boolean) rVar.c.a(AbstractC1066q6.f10081A2)).booleanValue()) {
                        g4.f7305f.t("paidv2_user_option");
                    }
                } catch (IOException e4) {
                    N1.n.f1204A.f1209g.h("clearStorageOnIdlessMode", e4);
                }
            }
        }
        hashMap.remove("gad_idless");
        Bundle bundle = new Bundle();
        for (Map.Entry entry : hashMap.entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
        C0356Wb c0356Wb = N1.n.f1204A.f1225w;
        c0356Wb.getClass();
        c0356Wb.d("setConsent", new M3(18, bundle));
    }
}
