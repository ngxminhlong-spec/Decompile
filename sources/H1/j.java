package H1;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class j extends a {

    /* renamed from: t, reason: collision with root package name */
    public final n f875t;

    public j(int i4, String str, String str2, a aVar, n nVar) {
        super(i4, str, str2, aVar);
        this.f875t = nVar;
    }

    @Override // H1.a
    public final JSONObject c() {
        JSONObject c = super.c();
        n nVar = this.f875t;
        if (nVar == null) {
            c.put("Response Info", "null");
            return c;
        }
        c.put("Response Info", nVar.a());
        return c;
    }

    @Override // H1.a
    public final String toString() {
        try {
            return c().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
