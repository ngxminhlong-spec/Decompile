package H1;

import O1.C0101z0;
import O1.Z0;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final Z0 f872a;

    /* renamed from: b, reason: collision with root package name */
    public final a f873b;

    public h(Z0 z02) {
        this.f872a = z02;
        C0101z0 c0101z0 = z02.f1339q;
        this.f873b = c0101z0 == null ? null : c0101z0.h();
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        Z0 z02 = this.f872a;
        jSONObject.put("Adapter", z02.f1337o);
        jSONObject.put("Latency", z02.f1338p);
        String str = z02.f1341s;
        if (str == null) {
            jSONObject.put("Ad Source Name", "null");
        } else {
            jSONObject.put("Ad Source Name", str);
        }
        String str2 = z02.f1342t;
        if (str2 == null) {
            jSONObject.put("Ad Source ID", "null");
        } else {
            jSONObject.put("Ad Source ID", str2);
        }
        String str3 = z02.f1343u;
        if (str3 == null) {
            jSONObject.put("Ad Source Instance Name", "null");
        } else {
            jSONObject.put("Ad Source Instance Name", str3);
        }
        String str4 = z02.f1344v;
        if (str4 == null) {
            jSONObject.put("Ad Source Instance ID", "null");
        } else {
            jSONObject.put("Ad Source Instance ID", str4);
        }
        JSONObject jSONObject2 = new JSONObject();
        for (String str5 : z02.f1340r.keySet()) {
            jSONObject2.put(str5, z02.f1340r.get(str5));
        }
        jSONObject.put("Credentials", jSONObject2);
        a aVar = this.f873b;
        if (aVar == null) {
            jSONObject.put("Ad Error", "null");
            return jSONObject;
        }
        jSONObject.put("Ad Error", aVar.c());
        return jSONObject;
    }

    public final String toString() {
        try {
            return a().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
