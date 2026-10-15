package B0;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.duracodefactory.logiccircuitsimulatorpro.MainActivity;
import com.google.android.gms.internal.ads.C0258Da;
import com.google.android.gms.internal.ads.C0783ji;
import com.google.android.gms.internal.ads.Nu;
import com.google.android.gms.internal.play_billing.AbstractC1609e;
import com.google.android.gms.internal.play_billing.AbstractC1629o;
import com.google.android.gms.internal.play_billing.B0;
import com.google.android.gms.internal.play_billing.C1605c;
import com.google.android.gms.internal.play_billing.C1615h;
import com.google.android.gms.internal.play_billing.D;
import com.google.android.gms.internal.play_billing.E0;
import com.google.android.gms.internal.play_billing.K0;
import com.google.android.gms.internal.play_billing.L0;
import com.google.android.gms.internal.play_billing.V0;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import v3.C2033d;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public volatile int f46a;

    /* renamed from: b, reason: collision with root package name */
    public final String f47b;
    public final Handler c;
    public volatile u d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f48e;

    /* renamed from: f, reason: collision with root package name */
    public final C0783ji f49f;

    /* renamed from: g, reason: collision with root package name */
    public volatile V0 f50g;

    /* renamed from: h, reason: collision with root package name */
    public volatile m f51h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f52i;

    /* renamed from: j, reason: collision with root package name */
    public int f53j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f54k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f55l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f56m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f57n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f58o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f59p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f60q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f61r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f62s;

    /* renamed from: t, reason: collision with root package name */
    public final C2033d f63t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f64u;

    /* renamed from: v, reason: collision with root package name */
    public ExecutorService f65v;

    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, B0.u] */
    public b(C2033d c2033d, MainActivity mainActivity, androidx.activity.result.c cVar) {
        String str;
        try {
            str = (String) Class.forName("com.android.billingclient.ktx.BuildConfig").getField("VERSION_NAME").get(null);
        } catch (Exception unused) {
            str = "7.0.0";
        }
        this.f46a = 0;
        this.c = new Handler(Looper.getMainLooper());
        this.f53j = 0;
        this.f47b = str;
        this.f48e = mainActivity.getApplicationContext();
        K0 o4 = L0.o();
        o4.c();
        L0.l((L0) o4.f12141p, str);
        String packageName = this.f48e.getPackageName();
        o4.c();
        L0.m((L0) o4.f12141p, packageName);
        C0783ji c0783ji = new C0783ji(this.f48e, (L0) o4.a());
        this.f49f = c0783ji;
        Context context = this.f48e;
        ?? obj = new Object();
        obj.f117p = context;
        obj.f118q = cVar;
        obj.f119r = c0783ji;
        obj.f120s = new t(obj, true);
        obj.f121t = new t(obj, false);
        this.d = obj;
        this.f63t = c2033d;
        this.f64u = false;
        this.f48e.getPackageName();
    }

    public final boolean a() {
        return (this.f46a != 2 || this.f50g == null || this.f51h == null) ? false : true;
    }

    public final void b(a aVar, e eVar) {
        String str = aVar.f45b;
        int i4 = 9;
        if (!a()) {
            d dVar = p.f102k;
            h(n.a(2, 9, dVar));
            C1605c c1605c = AbstractC1609e.f12200p;
            eVar.a(dVar, C1615h.f12205s);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            AbstractC1629o.e("BillingClient", "Please provide a valid product type.");
            d dVar2 = p.f97f;
            h(n.a(50, 9, dVar2));
            C1605c c1605c2 = AbstractC1609e.f12200p;
            eVar.a(dVar2, C1615h.f12205s);
            return;
        }
        if (g(new k(this, str, eVar, 0), 30000L, new Nu(i4, this, eVar), d()) == null) {
            d f4 = f();
            h(n.a(25, 9, f4));
            C1605c c1605c3 = AbstractC1609e.f12200p;
            eVar.a(f4, C1615h.f12205s);
        }
    }

    public final void c(C0258Da c0258Da, g gVar) {
        if (!a()) {
            d dVar = p.f102k;
            h(n.a(2, 8, dVar));
            gVar.b(dVar, null);
            return;
        }
        String str = (String) c0258Da.f4618p;
        ArrayList arrayList = (ArrayList) c0258Da.f4619q;
        if (TextUtils.isEmpty(str)) {
            AbstractC1629o.e("BillingClient", "Please fix the input params. SKU type can't be empty.");
            d dVar2 = p.f96e;
            h(n.a(49, 8, dVar2));
            gVar.b(dVar2, null);
            return;
        }
        if (g(new h(this, str, arrayList, gVar, 0), 30000L, new Nu(8, this, gVar), d()) == null) {
            d f4 = f();
            h(n.a(25, 8, f4));
            gVar.b(f4, null);
        }
    }

    public final Handler d() {
        return Looper.myLooper() == null ? this.c : new Handler(Looper.myLooper());
    }

    public final void e(d dVar) {
        if (Thread.interrupted()) {
            return;
        }
        this.c.post(new Nu(10, this, dVar));
    }

    public final d f() {
        return (this.f46a == 0 || this.f46a == 3) ? p.f102k : p.f100i;
    }

    public final Future g(Callable callable, long j4, Runnable runnable, Handler handler) {
        if (this.f65v == null) {
            this.f65v = Executors.newFixedThreadPool(AbstractC1629o.f12237a, new j(0));
        }
        try {
            Future submit = this.f65v.submit(callable);
            handler.postDelayed(new Nu(12, submit, runnable), (long) (j4 * 0.95d));
            return submit;
        } catch (Exception e4) {
            AbstractC1629o.f("BillingClient", "Async task throws exception!", e4);
            return null;
        }
    }

    public final void h(B0 b02) {
        int i4 = this.f53j;
        C0783ji c0783ji = this.f49f;
        c0783ji.getClass();
        try {
            L0 l02 = (L0) c0783ji.f9211p;
            D d = (D) l02.k(5);
            if (!d.f12140o.equals(l02)) {
                if (!d.f12141p.j()) {
                    d.d();
                }
                D.e(d.f12141p, l02);
            }
            K0 k02 = (K0) d;
            k02.c();
            L0.n((L0) k02.f12141p, i4);
            c0783ji.f9211p = (L0) k02.a();
            c0783ji.u(b02);
        } catch (Throwable th) {
            AbstractC1629o.f("BillingLogger", "Unable to log.", th);
        }
    }

    public final void i(E0 e02) {
        int i4 = this.f53j;
        C0783ji c0783ji = this.f49f;
        c0783ji.getClass();
        try {
            L0 l02 = (L0) c0783ji.f9211p;
            D d = (D) l02.k(5);
            if (!d.f12140o.equals(l02)) {
                if (!d.f12141p.j()) {
                    d.d();
                }
                D.e(d.f12141p, l02);
            }
            K0 k02 = (K0) d;
            k02.c();
            L0.n((L0) k02.f12141p, i4);
            c0783ji.f9211p = (L0) k02.a();
            c0783ji.x(e02);
        } catch (Throwable th) {
            AbstractC1629o.f("BillingLogger", "Unable to log.", th);
        }
    }
}
