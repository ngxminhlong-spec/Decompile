package x2;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.List;
import java.util.Map;
import k.C1748e;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: x2.x0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC2107x0 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f15856o = 0;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f15857p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f15858q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f15859r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Cloneable f15860s;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ RunnableC2107x0(E.n nVar, int i4, Exception exc, byte[] bArr, Map map) {
        this.f15858q = nVar;
        this.f15857p = i4;
        this.f15859r = exc;
        this.f15860s = bArr;
    }

    public /* synthetic */ RunnableC2107x0(k.o oVar, int i4, K k3, Intent intent) {
        this.f15858q = oVar;
        this.f15857p = i4;
        this.f15859r = k3;
        this.f15860s = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15856o) {
            case 0:
                E.n nVar = (E.n) this.f15858q;
                Exception exc = (Exception) this.f15859r;
                byte[] bArr = (byte[]) this.f15860s;
                C2066c0 c2066c0 = (C2066c0) ((C1748e) nVar.f706r).f13386p;
                b1 b1Var = c2066c0.f15571l;
                K k3 = c2066c0.f15568i;
                int i4 = this.f15857p;
                if (i4 != 200 && i4 != 204) {
                    if (i4 == 304) {
                        i4 = 304;
                    }
                    C2066c0.i(k3);
                    k3.f15397i.c(Integer.valueOf(i4), exc, "Network Request for Deferred Deep Link failed. response, exception");
                    return;
                }
                if (exc == null) {
                    T t4 = c2066c0.f15567h;
                    C2066c0.g(t4);
                    t4.f15452q.a(true);
                    if (bArr == null || bArr.length == 0) {
                        C2066c0.i(k3);
                        k3.f15401m.a("Deferred Deep Link response empty.");
                        return;
                    }
                    try {
                        JSONObject jSONObject = new JSONObject(new String(bArr));
                        String optString = jSONObject.optString("deeplink", "");
                        String optString2 = jSONObject.optString("gclid", "");
                        double optDouble = jSONObject.optDouble("timestamp", 0.0d);
                        if (TextUtils.isEmpty(optString)) {
                            C2066c0.i(k3);
                            k3.f15401m.a("Deferred Deep Link is empty.");
                        } else {
                            C2066c0.g(b1Var);
                            C2066c0 c2066c02 = (C2066c0) b1Var.f1719a;
                            if (!TextUtils.isEmpty(optString)) {
                                Context context = c2066c02.f15562a;
                                Context context2 = c2066c02.f15562a;
                                List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(optString)), 0);
                                if (queryIntentActivities != null && !queryIntentActivities.isEmpty()) {
                                    Bundle bundle = new Bundle();
                                    bundle.putString("gclid", optString2);
                                    bundle.putString("_cis", "ddp");
                                    c2066c0.f15575p.m("auto", "_cmp", bundle);
                                    if (!TextUtils.isEmpty(optString)) {
                                        try {
                                            SharedPreferences.Editor edit = context2.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
                                            edit.putString("deeplink", optString);
                                            edit.putLong("timestamp", Double.doubleToRawLongBits(optDouble));
                                            if (edit.commit()) {
                                                context2.sendBroadcast(new Intent("android.google.analytics.action.DEEPLINK_ACTION"));
                                            }
                                        } catch (RuntimeException e4) {
                                            K k4 = ((C2066c0) b1Var.f1719a).f15568i;
                                            C2066c0.i(k4);
                                            k4.f15394f.b(e4, "Failed to persist Deferred Deep Link. exception");
                                        }
                                    }
                                }
                            }
                            C2066c0.i(k3);
                            k3.f15397i.c(optString2, optString, "Deferred Deep Link validation failed. gclid, deep link");
                        }
                        return;
                    } catch (JSONException e5) {
                        C2066c0.i(k3);
                        k3.f15394f.b(e5, "Failed to parse the Deferred Deep Link response. exception");
                        return;
                    }
                }
                C2066c0.i(k3);
                k3.f15397i.c(Integer.valueOf(i4), exc, "Network Request for Deferred Deep Link failed. response, exception");
                return;
            default:
                k.o oVar = (k.o) this.f15858q;
                K k5 = (K) this.f15859r;
                Intent intent = (Intent) this.f15860s;
                M0 m02 = (M0) ((Service) oVar.f13452p);
                int i5 = this.f15857p;
                if (m02.b(i5)) {
                    k5.f15402n.b(Integer.valueOf(i5), "Local AppMeasurementService processed last upload request. StartId");
                    oVar.j().f15402n.a("Completed wakeful intent.");
                    m02.a(intent);
                    return;
                }
                return;
        }
    }
}
