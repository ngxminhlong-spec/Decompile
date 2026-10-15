package W1;

import B0.v;
import O1.r;
import Q1.N;
import android.annotation.TargetApi;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.google.android.gms.internal.ads.AbstractC0266Ec;
import com.google.android.gms.internal.ads.AbstractC1066q6;
import com.google.android.gms.internal.ads.C0260Dc;
import com.google.android.gms.internal.ads.C0828kk;
import com.google.android.gms.internal.ads.C0937n6;
import com.google.android.gms.internal.ads.I3;
import com.google.android.gms.internal.ads.Nu;
import com.google.android.gms.internal.ads.Oq;
import com.google.android.gms.internal.ads.Y9;
import com.google.android.gms.internal.measurement.C1510e1;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import o2.AbstractC1895f;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1943a;

    /* renamed from: b, reason: collision with root package name */
    public final WebView f1944b;
    public final I3 c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final C0828kk f1945e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f1946f;

    /* renamed from: g, reason: collision with root package name */
    public final C0260Dc f1947g = AbstractC0266Ec.f4899e;

    /* renamed from: h, reason: collision with root package name */
    public final Oq f1948h;

    public a(WebView webView, I3 i32, C0828kk c0828kk, Oq oq) {
        this.f1944b = webView;
        Context context = webView.getContext();
        this.f1943a = context;
        this.c = i32;
        this.f1945e = c0828kk;
        AbstractC1066q6.a(context);
        C0937n6 c0937n6 = AbstractC1066q6.s8;
        r rVar = r.d;
        this.d = ((Integer) rVar.c.a(c0937n6)).intValue();
        this.f1946f = ((Boolean) rVar.c.a(AbstractC1066q6.t8)).booleanValue();
        this.f1948h = oq;
    }

    @JavascriptInterface
    @TargetApi(21)
    public String getClickSignals(String str) {
        try {
            N1.n nVar = N1.n.f1204A;
            nVar.f1212j.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            String g4 = this.c.f5531b.g(this.f1943a, str, this.f1944b);
            if (!this.f1946f) {
                return g4;
            }
            nVar.f1212j.getClass();
            AbstractC1895f.I(this.f1945e, null, "csg", new Pair("clat", String.valueOf(System.currentTimeMillis() - currentTimeMillis)));
            return g4;
        } catch (RuntimeException e4) {
            Y9.q("Exception getting click signals. ", e4);
            N1.n.f1204A.f1209g.h("TaggingLibraryJsInterface.getClickSignals", e4);
            return "";
        }
    }

    @JavascriptInterface
    @TargetApi(21)
    public String getClickSignalsWithTimeout(String str, int i4) {
        if (i4 <= 0) {
            Y9.p("Invalid timeout for getting click signals. Timeout=" + i4);
            return "";
        }
        try {
            return (String) AbstractC0266Ec.f4897a.b(new v(3, this, str)).get(Math.min(i4, this.d), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e4) {
            Y9.q("Exception getting click signals with timeout. ", e4);
            N1.n.f1204A.f1209g.h("TaggingLibraryJsInterface.getClickSignalsWithTimeout", e4);
            return e4 instanceof TimeoutException ? "17" : "";
        }
    }

    @JavascriptInterface
    @TargetApi(21)
    public String getQueryInfo() {
        N n4 = N1.n.f1204A.c;
        String uuid = UUID.randomUUID().toString();
        Bundle bundle = new Bundle();
        bundle.putString("query_info_type", "requester_type_6");
        C1510e1 c1510e1 = new C1510e1(9, this, uuid);
        if (((Boolean) r.d.c.a(AbstractC1066q6.v8)).booleanValue()) {
            this.f1947g.execute(new E.n(this, bundle, c1510e1, 2));
            return uuid;
        }
        x0.f fVar = new x0.f(13);
        fVar.b(bundle);
        android.support.v4.media.session.a.h(this.f1943a, new H1.e(fVar), c1510e1);
        return uuid;
    }

    @JavascriptInterface
    @TargetApi(21)
    public String getViewSignals() {
        try {
            N1.n nVar = N1.n.f1204A;
            nVar.f1212j.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            String d = this.c.f5531b.d(this.f1943a, this.f1944b, null);
            if (!this.f1946f) {
                return d;
            }
            nVar.f1212j.getClass();
            AbstractC1895f.I(this.f1945e, null, "vsg", new Pair("vlat", String.valueOf(System.currentTimeMillis() - currentTimeMillis)));
            return d;
        } catch (RuntimeException e4) {
            Y9.q("Exception getting view signals. ", e4);
            N1.n.f1204A.f1209g.h("TaggingLibraryJsInterface.getViewSignals", e4);
            return "";
        }
    }

    @JavascriptInterface
    @TargetApi(21)
    public String getViewSignalsWithTimeout(int i4) {
        if (i4 <= 0) {
            Y9.p("Invalid timeout for getting view signals. Timeout=" + i4);
            return "";
        }
        try {
            return (String) AbstractC0266Ec.f4897a.b(new B0.l(3, this)).get(Math.min(i4, this.d), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e4) {
            Y9.q("Exception getting view signals with timeout. ", e4);
            N1.n.f1204A.f1209g.h("TaggingLibraryJsInterface.getViewSignalsWithTimeout", e4);
            return e4 instanceof TimeoutException ? "17" : "";
        }
    }

    @JavascriptInterface
    @TargetApi(21)
    public void recordClick(String str) {
        if (!((Boolean) r.d.c.a(AbstractC1066q6.x8)).booleanValue() || TextUtils.isEmpty(str)) {
            return;
        }
        AbstractC0266Ec.f4897a.execute(new Nu(26, this, str));
    }

    @JavascriptInterface
    @TargetApi(21)
    public void reportTouchEvent(String str) {
        int i4;
        try {
            JSONObject jSONObject = new JSONObject(str);
            int i5 = jSONObject.getInt("x");
            int i6 = jSONObject.getInt("y");
            int i7 = jSONObject.getInt("duration_ms");
            float f4 = (float) jSONObject.getDouble("force");
            int i8 = jSONObject.getInt("type");
            if (i8 != 0) {
                i4 = 1;
                if (i8 != 1) {
                    i4 = 2;
                    if (i8 != 2) {
                        i4 = 3;
                        if (i8 != 3) {
                            i4 = -1;
                        }
                    }
                }
            } else {
                i4 = 0;
            }
            try {
                this.c.f5531b.a(MotionEvent.obtain(0L, i7, i4, i5, i6, f4, 1.0f, 0, 1.0f, 1.0f, 0, 0));
            } catch (RuntimeException e4) {
                e = e4;
                Y9.q("Failed to parse the touch string. ", e);
                N1.n.f1204A.f1209g.h("TaggingLibraryJsInterface.reportTouchEvent", e);
            } catch (JSONException e5) {
                e = e5;
                Y9.q("Failed to parse the touch string. ", e);
                N1.n.f1204A.f1209g.h("TaggingLibraryJsInterface.reportTouchEvent", e);
            }
        } catch (RuntimeException | JSONException e6) {
            e = e6;
        }
    }
}
