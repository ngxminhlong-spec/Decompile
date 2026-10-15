package W1;

import O1.r;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.ads.AbstractC0266Ec;
import com.google.android.gms.internal.ads.AbstractC1066q6;
import com.google.android.gms.internal.ads.C0572ek;
import com.google.android.gms.internal.ads.C0828kk;
import com.google.android.gms.internal.ads.C0937n6;
import com.google.android.gms.internal.ads.SharedPreferencesOnSharedPreferenceChangeListenerC1023p6;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import o2.AbstractC1895f;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final int f1996a;

    /* renamed from: b, reason: collision with root package name */
    public final long f1997b;
    public final boolean c;
    public final boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final Map f1998e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayDeque f1999f = new ArrayDeque();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayDeque f2000g = new ArrayDeque();

    /* renamed from: h, reason: collision with root package name */
    public final C0828kk f2001h;

    /* renamed from: i, reason: collision with root package name */
    public ConcurrentHashMap f2002i;

    public h(C0828kk c0828kk) {
        this.f2001h = c0828kk;
        C0937n6 c0937n6 = AbstractC1066q6.g6;
        r rVar = r.d;
        this.f1996a = ((Integer) rVar.c.a(c0937n6)).intValue();
        C0937n6 c0937n62 = AbstractC1066q6.h6;
        SharedPreferencesOnSharedPreferenceChangeListenerC1023p6 sharedPreferencesOnSharedPreferenceChangeListenerC1023p6 = rVar.c;
        this.f1997b = ((Long) sharedPreferencesOnSharedPreferenceChangeListenerC1023p6.a(c0937n62)).longValue();
        this.c = ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC1023p6.a(AbstractC1066q6.m6)).booleanValue();
        this.d = ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC1023p6.a(AbstractC1066q6.k6)).booleanValue();
        this.f1998e = Collections.synchronizedMap(new g(this));
    }

    public final synchronized void a(String str, String str2, C0572ek c0572ek) {
        N1.n.f1204A.f1212j.getClass();
        this.f1998e.put(str, new Pair(Long.valueOf(System.currentTimeMillis()), str2));
        e();
        c(c0572ek);
    }

    public final synchronized void b(String str) {
        this.f1998e.remove(str);
    }

    public final synchronized void c(C0572ek c0572ek) {
        try {
            try {
                if (this.c) {
                    ArrayDeque arrayDeque = this.f2000g;
                    ArrayDeque clone = arrayDeque.clone();
                    arrayDeque.clear();
                    ArrayDeque arrayDeque2 = this.f1999f;
                    ArrayDeque clone2 = arrayDeque2.clone();
                    arrayDeque2.clear();
                    AbstractC0266Ec.f4897a.execute(new J1.a(this, c0572ek, clone, clone2, 2));
                }
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public final void d(C0572ek c0572ek, ArrayDeque arrayDeque, String str) {
        Pair pair;
        while (!arrayDeque.isEmpty()) {
            Pair pair2 = (Pair) arrayDeque.poll();
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(c0572ek.f8633a);
            this.f2002i = concurrentHashMap;
            concurrentHashMap.put("action", "ev");
            this.f2002i.put("e_r", str);
            this.f2002i.put("e_id", (String) pair2.first);
            if (this.d) {
                try {
                    JSONObject jSONObject = new JSONObject((String) pair2.second);
                    pair = new Pair(AbstractC1895f.D(jSONObject.getJSONObject("extras").getString("query_info_type")), jSONObject.getString("request_agent"));
                } catch (JSONException unused) {
                    pair = new Pair("", "");
                }
                ConcurrentHashMap concurrentHashMap2 = this.f2002i;
                String str2 = (String) pair.first;
                if (!TextUtils.isEmpty(str2)) {
                    concurrentHashMap2.put("e_type", str2);
                }
                ConcurrentHashMap concurrentHashMap3 = this.f2002i;
                String str3 = (String) pair.second;
                if (!TextUtils.isEmpty(str3)) {
                    concurrentHashMap3.put("e_agent", str3);
                }
            }
            this.f2001h.a(this.f2002i, false);
        }
    }

    public final synchronized void e() {
        N1.n.f1204A.f1212j.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        try {
            Iterator it = this.f1998e.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (currentTimeMillis - ((Long) ((Pair) entry.getValue()).first).longValue() <= this.f1997b) {
                    break;
                }
                this.f2000g.add(new Pair((String) entry.getKey(), (String) ((Pair) entry.getValue()).second));
                it.remove();
            }
        } catch (ConcurrentModificationException e4) {
            N1.n.f1204A.f1209g.h("QueryJsonMap.removeExpiredEntries", e4);
        }
    }
}
