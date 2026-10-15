package N1;

import Q1.K;
import android.content.SharedPreferences;
import c3.InterfaceFutureC0239a;
import com.google.android.gms.internal.ads.Aj;
import com.google.android.gms.internal.ads.Aq;
import com.google.android.gms.internal.ads.Bs;
import com.google.android.gms.internal.ads.C0315Oa;
import com.google.android.gms.internal.ads.C0326Qb;
import com.google.android.gms.internal.ads.C0949nc;
import com.google.android.gms.internal.ads.Du;
import com.google.android.gms.internal.ads.Fq;
import com.google.android.gms.internal.ads.Km;
import com.google.android.gms.internal.ads.Pu;
import com.google.android.gms.internal.ads.Qp;
import java.util.ArrayList;
import org.json.JSONObject;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements Du {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1154a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1155b;
    public final Object c;

    public /* synthetic */ c(int i4, Object obj, Object obj2) {
        this.f1154a = i4;
        this.f1155b = obj;
        this.c = obj2;
    }

    public /* synthetic */ c(C0326Qb c0326Qb, C0315Oa c0315Oa, int i4) {
        this.f1154a = 9;
        this.f1155b = c0326Qb;
        this.c = c0315Oa;
    }

    private final InterfaceFutureC0239a a(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        int i4 = 0;
        boolean optBoolean = jSONObject.optBoolean("isSuccessful", false);
        if (optBoolean) {
            String string = jSONObject.getString("appSettingsJson");
            n nVar = n.f1204A;
            K c = nVar.f1209g.c();
            c.r();
            synchronized (c.f1642a) {
                try {
                    nVar.f1212j.getClass();
                    long currentTimeMillis = System.currentTimeMillis();
                    if (string != null && !string.equals(c.f1655p.f9735e)) {
                        c.f1655p = new C0949nc(string, currentTimeMillis);
                        SharedPreferences.Editor editor = c.f1646g;
                        if (editor != null) {
                            editor.putString("app_settings_json", string);
                            c.f1646g.putLong("app_settings_last_update_ms", currentTimeMillis);
                            c.f1646g.apply();
                        }
                        c.s();
                        ArrayList arrayList = c.c;
                        int size = arrayList.size();
                        while (i4 < size) {
                            Object obj2 = arrayList.get(i4);
                            i4++;
                            ((Runnable) obj2).run();
                        }
                    }
                    c.f1655p.f9736f = currentTimeMillis;
                } finally {
                }
            }
        }
        Aq aq = (Aq) this.c;
        Fq fq = (Fq) this.f1155b;
        aq.b(optBoolean);
        fq.b(aq.l());
        return Pu.f6608p;
    }

    private final InterfaceFutureC0239a b(Object obj) {
        Km km = (Km) this.f1155b;
        Aj aj = (Aj) this.c;
        JSONObject jSONObject = (JSONObject) obj;
        Qp qp = km.d;
        Pu h02 = Bs.h0(aj);
        synchronized (qp) {
            qp.f6700a.addFirst(h02);
        }
        if (jSONObject.optBoolean("success")) {
            return Bs.h0(jSONObject.getJSONObject("json").getJSONArray("ads"));
        }
        throw new Exception("process json failed");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0060, code lost:
    
        ((com.google.android.gms.internal.ads.Vp) r4.f6527r).f7294e++;
     */
    @Override // com.google.android.gms.internal.ads.Du
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final c3.InterfaceFutureC0239a l(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 1122
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: N1.c.l(java.lang.Object):c3.a");
    }
}
