package Q1;

import O1.D0;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.AbstractC1066q6;
import com.google.android.gms.internal.ads.C0937n6;
import com.google.android.gms.internal.ads.Y9;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: Q1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0103b implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f1680o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C0111j f1681p;

    public /* synthetic */ RunnableC0103b(C0111j c0111j, int i4) {
        this.f1680o = i4;
        this.f1681p = c0111j;
    }

    private final void a() {
        C0111j c0111j = this.f1681p;
        N1.n nVar = N1.n.f1204A;
        D0 d02 = nVar.f1215m;
        Context context = c0111j.f1703a;
        String str = c0111j.d;
        String str2 = c0111j.f1705e;
        d02.getClass();
        C0937n6 c0937n6 = AbstractC1066q6.a4;
        O1.r rVar = O1.r.d;
        String m4 = D0.m(context, d02.n(context, (String) rVar.c.a(c0937n6), str, str2).toString(), str2);
        if (TextUtils.isEmpty(m4)) {
            Y9.m("Not linked for in app preview.");
        } else {
            try {
                JSONObject jSONObject = new JSONObject(m4.trim());
                String optString = jSONObject.optString("gct");
                d02.f1271f = jSONObject.optString("status");
                if (((Boolean) rVar.c.a(AbstractC1066q6.e8)).booleanValue()) {
                    boolean z4 = "0".equals((String) d02.f1271f) || "2".equals((String) d02.f1271f);
                    d02.g(z4);
                    nVar.f1209g.c().a(!z4 ? "" : str);
                }
                synchronized (d02.f1268a) {
                    d02.f1270e = optString;
                }
                if ("2".equals((String) d02.f1271f)) {
                    Y9.m("Creative is not pushed for this device.");
                    D0.h(context, "There was no creative pushed from DFP to the device.", false, false);
                    return;
                } else if ("1".equals((String) d02.f1271f)) {
                    Y9.m("The app is not linked for creative preview.");
                    d02.c(context, str, str2);
                    return;
                } else {
                    if ("0".equals((String) d02.f1271f)) {
                        Y9.m("Device is linked for in app preview.");
                        D0.h(context, "The device is successfully linked for creative preview.", false, true);
                        return;
                    }
                    return;
                }
            } catch (JSONException e4) {
                Y9.t("Fail to get in app preview response json.", e4);
            }
        }
        D0.h(context, "In-app preview failed to load because of a system error. Please try again later.", true, true);
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1680o) {
            case 0:
                C0111j c0111j = this.f1681p;
                c0111j.c(c0111j.f1703a);
                return;
            case 1:
                C0111j c0111j2 = this.f1681p;
                D0 d02 = N1.n.f1204A.f1215m;
                String str = c0111j2.d;
                String str2 = c0111j2.f1705e;
                String str3 = c0111j2.f1706f;
                boolean k3 = d02.k();
                Context context = c0111j2.f1703a;
                boolean i4 = d02.i(context, str, str2);
                synchronized (d02.f1268a) {
                    d02.f1269b = i4;
                }
                if (!d02.k()) {
                    d02.c(context, str, str2);
                    return;
                }
                if (!k3 && !TextUtils.isEmpty(str3)) {
                    d02.e(context, str2, str3, str);
                }
                Y9.m("Device is linked for debug signals.");
                D0.h(context, "The device is successfully linked for troubleshooting.", false, true);
                return;
            case 2:
                C0111j c0111j3 = this.f1681p;
                c0111j3.f1707g = 4;
                c0111j3.b();
                return;
            case 3:
                a();
                return;
            case 4:
                C0111j c0111j4 = this.f1681p;
                c0111j4.getClass();
                N1.n.f1204A.f1215m.b(c0111j4.f1703a);
                return;
            case 5:
                C0111j c0111j5 = this.f1681p;
                c0111j5.c(c0111j5.f1703a);
                return;
            default:
                C0111j c0111j6 = this.f1681p;
                c0111j6.getClass();
                N1.n.f1204A.f1215m.b(c0111j6.f1703a);
                return;
        }
    }
}
