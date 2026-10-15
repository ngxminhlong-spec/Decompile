package O1;

import Q1.BinderC0112k;
import Q1.C0120t;
import Q1.RunnableC0113l;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import b0.RunnableC0203p;
import com.duracodefactory.logiccircuitsimulatorpro.MainActivity;
import com.google.android.gms.internal.ads.AbstractC1066q6;
import com.google.android.gms.internal.ads.C0874ln;
import com.google.android.gms.internal.ads.C0937n6;
import com.google.android.gms.internal.ads.C1016p;
import com.google.android.gms.internal.ads.C1325w8;
import com.google.android.gms.internal.ads.Nk;
import com.google.android.gms.internal.ads.Ok;
import com.google.android.gms.internal.ads.Y9;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import l2.AbstractC1799b;
import n2.BinderC1813b;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class D0 {

    /* renamed from: h, reason: collision with root package name */
    public static D0 f1267h;

    /* renamed from: a, reason: collision with root package name */
    public final Object f1268a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1269b;
    public boolean c;
    public Object d;

    /* renamed from: e, reason: collision with root package name */
    public Serializable f1270e;

    /* renamed from: f, reason: collision with root package name */
    public Object f1271f;

    /* renamed from: g, reason: collision with root package name */
    public Object f1272g;

    public D0(int i4) {
        switch (i4) {
            case 1:
                this.f1268a = new Object();
                this.d = "";
                this.f1270e = "";
                this.f1269b = false;
                this.c = false;
                this.f1271f = "";
                return;
            default:
                this.f1268a = new Object();
                this.f1269b = false;
                this.c = false;
                this.d = new Object();
                this.f1272g = new H1.m(new ArrayList());
                this.f1270e = new ArrayList();
                return;
        }
    }

    public static D0 f() {
        D0 d02;
        synchronized (D0.class) {
            try {
                if (f1267h == null) {
                    f1267h = new D0(0);
                }
                d02 = f1267h;
            } catch (Throwable th) {
                throw th;
            }
        }
        return d02;
    }

    public static void h(Context context, String str, boolean z4, boolean z5) {
        if (context instanceof Activity) {
            Q1.N.f1668k.post(new RunnableC0113l(context, str, z4, z5));
        } else {
            Y9.r("Can not create dialog without Activity Context");
        }
    }

    public static final String m(Context context, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("User-Agent", N1.n.f1204A.c.u(context, str2));
        new Q1.v(context);
        C0120t a4 = Q1.v.a(0, str, hashMap, null);
        try {
            return (String) a4.f5017o.get(((Integer) r.d.c.a(AbstractC1066q6.d4)).intValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e4) {
            Y9.q("Interrupted while retrieving a response from: ".concat(String.valueOf(str)), e4);
            a4.cancel(true);
            return null;
        } catch (TimeoutException e5) {
            Y9.q("Timeout while retrieving a response from: ".concat(String.valueOf(str)), e5);
            a4.cancel(true);
            return null;
        } catch (Exception e6) {
            Y9.q("Error retrieving a response from: ".concat(String.valueOf(str)), e6);
            return null;
        }
    }

    public static C1016p o(List list) {
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            hashMap.put(((C1325w8) it.next()).f11113o, new C1016p(10));
        }
        return new C1016p(11);
    }

    public void a(MainActivity mainActivity) {
        if (((InterfaceC0052a0) this.f1271f) == null) {
            this.f1271f = (InterfaceC0052a0) new C0071k(C0081p.f1374f.f1376b, mainActivity).d(mainActivity, false);
        }
    }

    public void b(Context context) {
        Ok ok;
        if (!((Boolean) r.d.c.a(AbstractC1066q6.e8)).booleanValue() || (ok = (Ok) this.f1272g) == null) {
            return;
        }
        ok.d(new BinderC0112k(this, context), Nk.f6375r);
    }

    public void c(Context context, String str, String str2) {
        Q1.N n4 = N1.n.f1204A.c;
        Q1.N.p(context, n(context, (String) r.d.c.a(AbstractC1066q6.f10196Z3), str, str2));
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [M1.a, java.lang.Object] */
    public M1.a d() {
        C1016p o4;
        synchronized (this.d) {
            try {
                h2.y.k("MobileAds.initialize() must be called prior to getting initialization status.", ((InterfaceC0052a0) this.f1271f) != null);
                try {
                    o4 = o(((InterfaceC0052a0) this.f1271f).h());
                } catch (RemoteException unused) {
                    Y9.p("Unable to get Initialization status.");
                    return new Object();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return o4;
    }

    public void e(Context context, String str, String str2, String str3) {
        Uri.Builder buildUpon = n(context, (String) r.d.c.a(AbstractC1066q6.c4), str3, str).buildUpon();
        buildUpon.appendQueryParameter("debugData", str2);
        Q1.N n4 = N1.n.f1204A.c;
        Q1.N.i(context, str, buildUpon.build().toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0032, code lost:
    
        if (r4 != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void g(boolean r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f1268a
            monitor-enter(r0)
            r3.c = r4     // Catch: java.lang.Throwable -> L47
            com.google.android.gms.internal.ads.n6 r1 = com.google.android.gms.internal.ads.AbstractC1066q6.e8     // Catch: java.lang.Throwable -> L47
            O1.r r2 = O1.r.d     // Catch: java.lang.Throwable -> L47
            com.google.android.gms.internal.ads.p6 r2 = r2.c     // Catch: java.lang.Throwable -> L47
            java.lang.Object r1 = r2.a(r1)     // Catch: java.lang.Throwable -> L47
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L47
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L47
            if (r1 == 0) goto L49
            N1.n r1 = N1.n.f1204A     // Catch: java.lang.Throwable -> L47
            com.google.android.gms.internal.ads.pc r1 = r1.f1209g     // Catch: java.lang.Throwable -> L47
            Q1.K r1 = r1.c()     // Catch: java.lang.Throwable -> L47
            r1.b(r4)     // Catch: java.lang.Throwable -> L47
            java.lang.Object r1 = r3.f1272g     // Catch: java.lang.Throwable -> L47
            com.google.android.gms.internal.ads.Ok r1 = (com.google.android.gms.internal.ads.Ok) r1     // Catch: java.lang.Throwable -> L47
            if (r1 == 0) goto L49
            boolean r2 = r1.f6509r     // Catch: java.lang.Throwable -> L47
            if (r2 != 0) goto L32
            if (r4 == 0) goto L3d
            r1.i()     // Catch: java.lang.Throwable -> L47
            goto L34
        L32:
            if (r4 == 0) goto L3d
        L34:
            boolean r4 = r1.f6507p     // Catch: java.lang.Throwable -> L47
            if (r4 == 0) goto L39
            goto L3d
        L39:
            r1.n()     // Catch: java.lang.Throwable -> L47
            goto L49
        L3d:
            boolean r4 = r1.f()     // Catch: java.lang.Throwable -> L47
            if (r4 != 0) goto L49
            r1.m()     // Catch: java.lang.Throwable -> L47
            goto L49
        L47:
            r4 = move-exception
            goto L4b
        L49:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L47
            return
        L4b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L47
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: O1.D0.g(boolean):void");
    }

    public boolean i(Context context, String str, String str2) {
        C0937n6 c0937n6 = AbstractC1066q6.b4;
        r rVar = r.d;
        String m4 = m(context, n(context, (String) rVar.c.a(c0937n6), str, str2).toString(), str2);
        if (TextUtils.isEmpty(m4)) {
            Y9.m("Not linked for debug signals.");
            return false;
        }
        try {
            boolean equals = "1".equals(new JSONObject(m4.trim()).optString("debug_mode"));
            g(equals);
            if (((Boolean) rVar.c.a(AbstractC1066q6.e8)).booleanValue()) {
                Q1.K c = N1.n.f1204A.f1209g.c();
                if (true != equals) {
                    str = "";
                }
                c.a(str);
            }
            return equals;
        } catch (JSONException e4) {
            Y9.t("Fail to get debug mode response json.", e4);
            return false;
        }
    }

    public boolean j() {
        boolean z4;
        synchronized (this.f1268a) {
            z4 = this.c;
        }
        return z4;
    }

    public boolean k() {
        boolean z4;
        synchronized (this.f1268a) {
            z4 = this.f1269b;
        }
        return z4;
    }

    public boolean l(Context context, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) || !k()) {
            return false;
        }
        Y9.m("Sending troubleshooting signals to the server.");
        e(context, str, str2, str3);
        return true;
    }

    public Uri n(Context context, String str, String str2, String str3) {
        String str4;
        String str5;
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        synchronized (this.f1268a) {
            if (TextUtils.isEmpty((String) this.d)) {
                Q1.N n4 = N1.n.f1204A.c;
                try {
                    FileInputStream openFileInput = context.openFileInput("debug_signals_id.txt");
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    AbstractC1799b.d(openFileInput, byteArrayOutputStream, true);
                    str5 = new String(byteArrayOutputStream.toByteArray(), "UTF-8");
                } catch (IOException unused) {
                    Y9.m("Error reading from internal storage.");
                    str5 = "";
                }
                this.d = str5;
                if (TextUtils.isEmpty(str5)) {
                    Q1.N n5 = N1.n.f1204A.c;
                    String uuid = UUID.randomUUID().toString();
                    this.d = uuid;
                    try {
                        FileOutputStream openFileOutput = context.openFileOutput("debug_signals_id.txt", 0);
                        openFileOutput.write(uuid.getBytes("UTF-8"));
                        openFileOutput.close();
                    } catch (Exception e4) {
                        Y9.q("Error writing to file in internal storage.", e4);
                    }
                }
            }
            str4 = (String) this.d;
        }
        buildUpon.appendQueryParameter("linkedDeviceId", str4);
        buildUpon.appendQueryParameter("adSlotPath", str2);
        buildUpon.appendQueryParameter("afmaVersion", str3);
        return buildUpon.build();
    }

    public void p(MainActivity mainActivity) {
        try {
            if (C0874ln.f9465r == null) {
                C0874ln.f9465r = new C0874ln(12);
            }
            Object obj = null;
            if (((AtomicBoolean) C0874ln.f9465r.f9467p).compareAndSet(false, true)) {
                new Thread(new RunnableC0203p(8, mainActivity, obj)).start();
            }
            ((InterfaceC0052a0) this.f1271f).k();
            ((InterfaceC0052a0) this.f1271f).X2(null, new BinderC1813b(null));
        } catch (RemoteException e4) {
            Y9.t("MobileAdsSettingManager initialization failed", e4);
        }
    }
}
