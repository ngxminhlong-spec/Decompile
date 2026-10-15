package B0;

import Q1.I;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.AbstractC0266Ec;
import com.google.android.gms.internal.ads.AbstractC1066q6;
import com.google.android.gms.internal.ads.AbstractC1351ws;
import com.google.android.gms.internal.ads.C0537ds;
import com.google.android.gms.internal.ads.C0580es;
import com.google.android.gms.internal.ads.C0623fs;
import com.google.android.gms.internal.ads.C0666gs;
import com.google.android.gms.internal.ads.C0836ks;
import com.google.android.gms.internal.ads.C1136rs;
import com.google.android.gms.internal.ads.C1308vs;
import com.google.android.gms.internal.ads.InterfaceC0308Md;
import com.google.android.gms.internal.ads.Iv;
import com.google.android.gms.internal.ads.Jn;
import com.google.android.gms.internal.ads.Xj;
import e2.C1664b;
import g2.C1681a;
import g2.C1684d;
import h2.InterfaceC1705d;
import java.util.HashMap;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class u implements InterfaceC1705d {

    /* renamed from: o, reason: collision with root package name */
    public boolean f116o;

    /* renamed from: p, reason: collision with root package name */
    public Object f117p;

    /* renamed from: q, reason: collision with root package name */
    public Object f118q;

    /* renamed from: r, reason: collision with root package name */
    public Object f119r;

    /* renamed from: s, reason: collision with root package name */
    public Object f120s;

    /* renamed from: t, reason: collision with root package name */
    public Object f121t;

    @Override // h2.InterfaceC1705d
    public void a(C1664b c1664b) {
        ((C1684d) this.f121t).f12989A.post(new Jn(this, c1664b, 17, false));
    }

    public void b(C1664b c1664b) {
        g2.m mVar = (g2.m) ((C1684d) this.f121t).f13000x.get((C1681a) this.f118q);
        if (mVar != null) {
            mVar.m(c1664b);
        }
    }

    public void c(String str, HashMap hashMap) {
        AbstractC0266Ec.f4899e.execute(new E.n(this, str, hashMap, 1));
    }

    public void d(String str, String str2) {
        I.w(str);
        if (((InterfaceC0308Md) this.f119r) != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("message", str);
            hashMap.put("action", str2);
            c("onError", hashMap);
        }
    }

    public void e(boolean z4) {
        IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
        IntentFilter intentFilter2 = new IntentFilter("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        intentFilter2.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
        this.f116o = z4;
        ((t) this.f121t).a((Context) this.f117p, intentFilter2);
        if (!this.f116o) {
            ((t) this.f120s).a((Context) this.f117p, intentFilter);
            return;
        }
        t tVar = (t) this.f120s;
        Context context = (Context) this.f117p;
        synchronized (tVar) {
            try {
                if (tVar.f115b) {
                    return;
                }
                if (Build.VERSION.SDK_INT >= 33) {
                    context.registerReceiver(tVar, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null, true != tVar.c ? 4 : 2);
                } else {
                    context.registerReceiver(tVar, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null);
                }
                tVar.f115b = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void f(InterfaceC0308Md interfaceC0308Md, C0537ds c0537ds) {
        String str = c0537ds.f8518b;
        if (interfaceC0308Md == null) {
            d("adWebview missing", "onLMDShow");
            return;
        }
        this.f119r = interfaceC0308Md;
        if (!this.f116o && !g(interfaceC0308Md.getContext())) {
            d("LMDOverlay not bound", "on_play_store_bind");
            return;
        }
        if (((Boolean) O1.r.d.c.a(AbstractC1066q6.H9)).booleanValue()) {
            this.f118q = str;
        }
        if (((x0.f) this.f121t) == null) {
            this.f121t = new x0.f(17, this);
        }
        Xj xj = (Xj) this.f120s;
        if (xj != null) {
            x0.f fVar = (x0.f) this.f121t;
            C0836ks c0836ks = (C0836ks) xj.f7687p;
            Iv iv = C0836ks.c;
            C1308vs c1308vs = c0836ks.f9327a;
            if (c1308vs == null) {
                iv.e("error: %s", "Play Store not found.");
            } else if (str == null) {
                iv.e("Failed to convert OverlayDisplayShowRequest when to create a new session: appId cannot be null.", new Object[0]);
                fVar.A(new C0580es(null, 8160));
            } else {
                A2.i iVar = new A2.i();
                c1308vs.a().post(new C1136rs(c1308vs, iVar, iVar, new C0666gs(c0836ks, iVar, c0537ds, fVar, iVar, 0)));
            }
        }
    }

    public synchronized boolean g(Context context) {
        if (!AbstractC1351ws.a(context)) {
            return false;
        }
        try {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            this.f120s = new Xj(19, new C0836ks(context));
        } catch (NullPointerException e4) {
            I.w("Error connecting LMD Overlay service");
            N1.n.f1204A.f1209g.h("LastMileDeliveryOverlay.bindLastMileDeliveryService", e4);
        }
        if (((Xj) this.f120s) == null) {
            this.f116o = false;
            return false;
        }
        if (((x0.f) this.f121t) == null) {
            this.f121t = new x0.f(17, this);
        }
        this.f116o = true;
        return true;
    }

    public C0623fs h() {
        String str;
        String str2 = null;
        if (!((Boolean) O1.r.d.c.a(AbstractC1066q6.H9)).booleanValue() || TextUtils.isEmpty((String) this.f118q)) {
            String str3 = (String) this.f117p;
            if (str3 != null) {
                str2 = str3;
                str = null;
            } else {
                d("Missing session token and/or appId", "onLMDupdate");
                str = null;
            }
        } else {
            str = (String) this.f118q;
        }
        return new C0623fs(str2, str);
    }
}
