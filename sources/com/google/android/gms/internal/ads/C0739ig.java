package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.ig, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0739ig implements InterfaceC0749iq, Mu {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C0781jg f9045o;

    public /* synthetic */ C0739ig(C0781jg c0781jg) {
        this.f9045o = c0781jg;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4, types: [int] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r6v6, types: [com.google.android.gms.internal.ads.Ob] */
    @Override // com.google.android.gms.internal.ads.InterfaceC0749iq
    public Object l(Object obj) {
        Ep ep = (Ep) obj;
        C0339Se c0339Se = this.f9045o.d;
        Map map = c0339Se.f6987b;
        Map map2 = c0339Se.f6986a;
        ArrayList arrayList = (ArrayList) ep.f4943b.f6527r;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj2 = arrayList.get(i4);
            i4++;
            Dp dp = (Dp) obj2;
            String str = dp.f4788a;
            JSONObject jSONObject = dp.f4789b;
            if (map2.containsKey(str)) {
                C0374Ze c0374Ze = (C0374Ze) map2.get(str);
                switch (c0374Ze.f8019a) {
                    case 0:
                        if (jSONObject != null) {
                            if (((Boolean) O1.r.d.c.a(AbstractC1066q6.f8)).booleanValue()) {
                                Ok ok = (Ok) c0374Ze.f8020b;
                                synchronized (ok) {
                                    ok.f6504m = jSONObject;
                                }
                                break;
                            } else {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    default:
                        ((C0316Ob) ((C0258Da) c0374Ze.f8020b).f4619q).b(jSONObject.optBoolean("npa_reset") ? -1 : jSONObject.optBoolean("npa"), jSONObject.optLong("timestamp"));
                        break;
                }
            } else if (map.containsKey(str)) {
                InterfaceC0349Ue interfaceC0349Ue = (InterfaceC0349Ue) map.get(str);
                HashMap hashMap = new HashMap();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    String optString = jSONObject.optString(next);
                    if (optString != null) {
                        hashMap.put(next, optString);
                    }
                }
                interfaceC0349Ue.a(hashMap);
            }
        }
        return ep;
    }

    @Override // com.google.android.gms.internal.ads.Mu
    /* renamed from: r */
    public /* bridge */ /* synthetic */ void mo4r(Object obj) {
        this.f9045o.f9172f.B(true);
    }

    @Override // com.google.android.gms.internal.ads.Mu
    public void y(Throwable th) {
        this.f9045o.f9172f.B(false);
    }
}
