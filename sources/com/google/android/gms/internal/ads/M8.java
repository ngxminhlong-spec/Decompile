package com.google.android.gms.internal.ads;

import O1.C0081p;
import android.content.Context;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class M8 implements J8, InterfaceC0385a9 {

    /* renamed from: o, reason: collision with root package name */
    public final C0348Ud f6219o;

    public M8(Context context, C0248Bc c0248Bc) {
        C0347Uc c0347Uc = N1.n.f1204A.d;
        C0348Ud c = C0347Uc.c(context, new C0887m(0, 0, 0), "", false, false, null, null, c0248Bc, null, null, new C0764j5(), null, null, null);
        this.f6219o = c;
        c.setWillNotDraw(true);
    }

    public static final void a(Runnable runnable) {
        C1335wc c1335wc = C0081p.f1374f.f1375a;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            Q1.N.f1668k.post(runnable);
        }
    }

    @Override // com.google.android.gms.internal.ads.I8
    public final void b(String str, Map map) {
        try {
            c(str, C0081p.f1374f.f1375a.g((HashMap) map));
        } catch (JSONException unused) {
            Y9.s("Could not convert parameters to JSON.");
        }
    }

    @Override // com.google.android.gms.internal.ads.I8
    public final /* synthetic */ void c(String str, JSONObject jSONObject) {
        AbstractC1230u.B(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0385a9
    public final void e(String str, InterfaceC0597f8 interfaceC0597f8) {
        M3 m32 = new M3(11, interfaceC0597f8);
        C0396ae c0396ae = this.f6219o.f7165o.f7464A;
        if (c0396ae != null) {
            synchronized (c0396ae.f8144r) {
                try {
                    List<InterfaceC0597f8> list = (List) c0396ae.f8143q.get(str);
                    if (list == null) {
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (InterfaceC0597f8 interfaceC0597f82 : list) {
                        InterfaceC0597f8 interfaceC0597f83 = interfaceC0597f82;
                        if (interfaceC0597f83 instanceof L8) {
                            if (((L8) interfaceC0597f83).f6132o.equals((InterfaceC0597f8) m32.f6208p)) {
                                arrayList.add(interfaceC0597f82);
                            }
                        }
                    }
                    list.removeAll(arrayList);
                } finally {
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.N8
    public final void l(String str, JSONObject jSONObject) {
        o(str + "(" + jSONObject.toString() + ");");
    }

    @Override // com.google.android.gms.internal.ads.J8, com.google.android.gms.internal.ads.N8
    public final void o(String str) {
        a(new K8(this, str, 1));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0385a9
    public final void r(String str, InterfaceC0597f8 interfaceC0597f8) {
        this.f6219o.A0(str, new L8(this, interfaceC0597f8));
    }
}
