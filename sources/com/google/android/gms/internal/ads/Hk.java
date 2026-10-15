package com.google.android.gms.internal.ads;

import O1.C0081p;
import O1.C0101z0;
import android.os.IBinder;
import android.text.TextUtils;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Hk implements Lg, InterfaceC0954nh, InterfaceC0399ah {

    /* renamed from: A, reason: collision with root package name */
    public boolean f5491A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f5492B;

    /* renamed from: o, reason: collision with root package name */
    public final Ok f5493o;

    /* renamed from: p, reason: collision with root package name */
    public final String f5494p;

    /* renamed from: q, reason: collision with root package name */
    public final String f5495q;

    /* renamed from: t, reason: collision with root package name */
    public Fg f5498t;

    /* renamed from: u, reason: collision with root package name */
    public C0101z0 f5499u;
    public JSONObject y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f5503z;

    /* renamed from: v, reason: collision with root package name */
    public String f5500v = "";

    /* renamed from: w, reason: collision with root package name */
    public String f5501w = "";

    /* renamed from: x, reason: collision with root package name */
    public String f5502x = "";

    /* renamed from: r, reason: collision with root package name */
    public int f5496r = 0;

    /* renamed from: s, reason: collision with root package name */
    public Gk f5497s = Gk.f5325o;

    public Hk(Ok ok, Jp jp, String str) {
        this.f5493o = ok;
        this.f5495q = str;
        this.f5494p = jp.f5911f;
    }

    public static JSONObject b(C0101z0 c0101z0) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorDomain", c0101z0.f1407q);
        jSONObject.put("errorCode", c0101z0.f1405o);
        jSONObject.put("errorDescription", c0101z0.f1406p);
        C0101z0 c0101z02 = c0101z0.f1408r;
        jSONObject.put("underlyingError", c0101z02 == null ? null : b(c0101z02));
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.Lg
    public final void J(C0101z0 c0101z0) {
        Ok ok = this.f5493o;
        if (ok.f()) {
            this.f5497s = Gk.f5327q;
            this.f5499u = c0101z0;
            if (((Boolean) O1.r.d.c.a(AbstractC1066q6.n8)).booleanValue()) {
                ok.b(this.f5494p, this);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0399ah
    public final void J0(Yf yf) {
        Ok ok = this.f5493o;
        if (ok.f()) {
            this.f5498t = yf.f7861f;
            this.f5497s = Gk.f5326p;
            if (((Boolean) O1.r.d.c.a(AbstractC1066q6.n8)).booleanValue()) {
                ok.b(this.f5494p, this);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0954nh
    public final void K0(Ep ep) {
        if (this.f5493o.f()) {
            if (!((List) ep.f4943b.f6525p).isEmpty()) {
                this.f5496r = ((C1434yp) ((List) ep.f4943b.f6525p).get(0)).f11502b;
            }
            if (!TextUtils.isEmpty(((Ap) ep.f4943b.f6526q).f4005k)) {
                this.f5500v = ((Ap) ep.f4943b.f6526q).f4005k;
            }
            if (!TextUtils.isEmpty(((Ap) ep.f4943b.f6526q).f4006l)) {
                this.f5501w = ((Ap) ep.f4943b.f6526q).f4006l;
            }
            C0937n6 c0937n6 = AbstractC1066q6.j8;
            O1.r rVar = O1.r.d;
            if (((Boolean) rVar.c.a(c0937n6)).booleanValue()) {
                if (this.f5493o.f6511t >= ((Long) rVar.c.a(AbstractC1066q6.k8)).longValue()) {
                    this.f5492B = true;
                    return;
                }
                if (!TextUtils.isEmpty(((Ap) ep.f4943b.f6526q).f4007m)) {
                    this.f5502x = ((Ap) ep.f4943b.f6526q).f4007m;
                }
                if (((Ap) ep.f4943b.f6526q).f4008n.length() > 0) {
                    this.y = ((Ap) ep.f4943b.f6526q).f4008n;
                }
                Ok ok = this.f5493o;
                JSONObject jSONObject = this.y;
                int length = jSONObject != null ? jSONObject.toString().length() : 0;
                if (!TextUtils.isEmpty(this.f5502x)) {
                    length += this.f5502x.length();
                }
                long j4 = length;
                synchronized (ok) {
                    ok.f6511t += j4;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0954nh
    public final void N(C0370Za c0370Za) {
        if (((Boolean) O1.r.d.c.a(AbstractC1066q6.n8)).booleanValue()) {
            return;
        }
        Ok ok = this.f5493o;
        if (ok.f()) {
            ok.b(this.f5494p, this);
        }
    }

    public final JSONObject a() {
        String str;
        JSONObject jSONObject;
        IBinder iBinder;
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("state", this.f5497s);
        switch (this.f5496r) {
            case 1:
                str = "BANNER";
                break;
            case 2:
                str = "INTERSTITIAL";
                break;
            case 3:
                str = "NATIVE_EXPRESS";
                break;
            case 4:
                str = "NATIVE";
                break;
            case 5:
                str = "REWARDED";
                break;
            case 6:
                str = "APP_OPEN_AD";
                break;
            case 7:
                str = "REWARDED_INTERSTITIAL";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        jSONObject2.put("format", str);
        if (((Boolean) O1.r.d.c.a(AbstractC1066q6.n8)).booleanValue()) {
            jSONObject2.put("isOutOfContext", this.f5503z);
            if (this.f5503z) {
                jSONObject2.put("shown", this.f5491A);
            }
        }
        Fg fg = this.f5498t;
        if (fg != null) {
            jSONObject = c(fg);
        } else {
            C0101z0 c0101z0 = this.f5499u;
            JSONObject jSONObject3 = null;
            if (c0101z0 != null && (iBinder = c0101z0.f1409s) != null) {
                Fg fg2 = (Fg) iBinder;
                jSONObject3 = c(fg2);
                if (fg2.f5063s.isEmpty()) {
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(b(this.f5499u));
                    jSONObject3.put("errors", jSONArray);
                }
            }
            jSONObject = jSONObject3;
        }
        jSONObject2.put("responseInfo", jSONObject);
        return jSONObject2;
    }

    public final JSONObject c(Fg fg) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("winningAdapterClassName", fg.f5059o);
        jSONObject.put("responseSecsSinceEpoch", fg.f5064t);
        jSONObject.put("responseId", fg.f5060p);
        C0937n6 c0937n6 = AbstractC1066q6.g8;
        O1.r rVar = O1.r.d;
        if (((Boolean) rVar.c.a(c0937n6)).booleanValue()) {
            String str = fg.f5065u;
            if (!TextUtils.isEmpty(str)) {
                Y9.m("Bidding data: ".concat(String.valueOf(str)));
                jSONObject.put("biddingData", new JSONObject(str));
            }
        }
        if (!TextUtils.isEmpty(this.f5500v)) {
            jSONObject.put("adRequestUrl", this.f5500v);
        }
        if (!TextUtils.isEmpty(this.f5501w)) {
            jSONObject.put("postBody", this.f5501w);
        }
        if (!TextUtils.isEmpty(this.f5502x)) {
            jSONObject.put("adResponseBody", this.f5502x);
        }
        Object obj = this.y;
        if (obj != null) {
            jSONObject.put("adResponseHeaders", obj);
        }
        if (((Boolean) rVar.c.a(AbstractC1066q6.j8)).booleanValue()) {
            jSONObject.put("hasExceededMemoryLimit", this.f5492B);
        }
        JSONArray jSONArray = new JSONArray();
        for (O1.Z0 z02 : fg.f5063s) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("adapterClassName", z02.f1337o);
            jSONObject2.put("latencyMillis", z02.f1338p);
            if (((Boolean) O1.r.d.c.a(AbstractC1066q6.h8)).booleanValue()) {
                jSONObject2.put("credentials", C0081p.f1374f.f1375a.f(z02.f1340r));
            }
            C0101z0 c0101z0 = z02.f1339q;
            jSONObject2.put("error", c0101z0 == null ? null : b(c0101z0));
            jSONArray.put(jSONObject2);
        }
        jSONObject.put("adNetworks", jSONArray);
        return jSONObject;
    }
}
