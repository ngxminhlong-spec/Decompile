package t2;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import b3.InterfaceC0219a;
import com.google.android.gms.internal.ads.C0574em;
import java.util.ArrayList;
import java.util.Collections;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import o0.C1823b;
import v3.C2033d;
import x2.C2066c0;
import x2.J0;
import x2.b1;
import x2.d1;
import y0.C2116a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final /* synthetic */ class N implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f14873o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f14874p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f14875q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f14876r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f14877s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f14878t;

    public /* synthetic */ N(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i4) {
        this.f14873o = i4;
        this.f14878t = obj;
        this.f14874p = obj2;
        this.f14875q = obj3;
        this.f14876r = obj4;
        this.f14877s = obj5;
    }

    public /* synthetic */ N(C1995b c1995b, Activity activity, C2033d c2033d, b3.b bVar, InterfaceC0219a interfaceC0219a) {
        this.f14873o = 0;
        this.f14874p = c1995b;
        this.f14875q = activity;
        this.f14876r = c2033d;
        this.f14877s = bVar;
        this.f14878t = interfaceC0219a;
    }

    /* JADX WARN: Type inference failed for: r7v5, types: [com.google.android.gms.internal.ads.O2, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        String str;
        AtomicReference atomicReference;
        J0 j02;
        x2.D d;
        switch (this.f14873o) {
            case 0:
                C1995b c1995b = (C1995b) this.f14874p;
                Activity activity = (Activity) this.f14875q;
                C2033d c2033d = (C2033d) this.f14876r;
                b3.b bVar = (b3.b) this.f14877s;
                final InterfaceC0219a interfaceC0219a = (InterfaceC0219a) this.f14878t;
                Handler handler = (Handler) c1995b.f14881p;
                C1997d c1997d = (C1997d) c1995b.f14883r;
                try {
                    c2033d.getClass();
                    Log.i("UserMessagingPlatform", "Use new ConsentDebugSettings.Builder().addTestDeviceHashedId(\"" + r.a((Application) c1995b.f14880o) + "\") to set this as a debug device.");
                    C0574em v4 = c1995b.v(((q2.e) c1995b.f14885t).E(activity, c2033d));
                    q2.e eVar = (q2.e) c1995b.f14886u;
                    ?? obj = new Object();
                    obj.f6431a = 0;
                    obj.f6432b = 1;
                    obj.c = eVar;
                    obj.d = v4;
                    D2.b a4 = obj.a();
                    c1997d.f14891b.edit().putInt("consent_status", a4.f668a).apply();
                    int i4 = a4.f669b;
                    SharedPreferences.Editor edit = c1997d.f14891b.edit();
                    if (i4 == 1) {
                        str = "UNKNOWN";
                    } else if (i4 == 2) {
                        str = "NOT_REQUIRED";
                    } else {
                        if (i4 != 3) {
                            throw null;
                        }
                        str = "REQUIRED";
                    }
                    edit.putString("privacy_options_requirement_status", str).apply();
                    ((C2003j) c1995b.f14884s).c.set((C2004k) a4.c);
                    ((J) c1995b.f14887v).f14863a.execute(new E.n(c1995b, bVar, a4, 10));
                    return;
                } catch (RuntimeException e4) {
                    final int i5 = 1;
                    final K k3 = new K("Caught exception when trying to request consent info update: ".concat(String.valueOf(Log.getStackTraceString(e4))), 1);
                    handler.post(new Runnable() { // from class: t2.M
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i5) {
                                case 0:
                                    k3.a();
                                    interfaceC0219a.b();
                                    return;
                                default:
                                    k3.a();
                                    interfaceC0219a.b();
                                    return;
                            }
                        }
                    });
                    return;
                } catch (K e5) {
                    final int i6 = 0;
                    handler.post(new Runnable() { // from class: t2.M
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i6) {
                                case 0:
                                    e5.a();
                                    interfaceC0219a.b();
                                    return;
                                default:
                                    e5.a();
                                    interfaceC0219a.b();
                                    return;
                            }
                        }
                    });
                    return;
                }
            case 1:
                try {
                    if (!(((y0.j) this.f14874p).f15903o instanceof C2116a)) {
                        String uuid = ((UUID) this.f14875q).toString();
                        int e6 = ((x0.p) this.f14878t).c.e(uuid);
                        if (e6 == 0 || n0.a.a(e6)) {
                            throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                        }
                        ((C1823b) ((x0.p) this.f14878t).f15239b).g(uuid, (n0.h) this.f14876r);
                        ((Context) this.f14877s).startService(v0.b.b((Context) this.f14877s, uuid, (n0.h) this.f14876r));
                    }
                    ((y0.j) this.f14874p).i(null);
                    return;
                } catch (Throwable th) {
                    ((y0.j) this.f14874p).j(th);
                    return;
                }
            case 2:
                synchronized (((AtomicReference) this.f14874p)) {
                    try {
                        try {
                            j02 = (J0) this.f14878t;
                            d = j02.d;
                        } catch (RemoteException e7) {
                            x2.K k4 = ((C2066c0) ((J0) this.f14878t).f1719a).f15568i;
                            C2066c0.i(k4);
                            k4.f15394f.d("(legacy) Failed to get conditional properties; remote exception", null, (String) this.f14875q, e7);
                            ((AtomicReference) this.f14874p).set(Collections.EMPTY_LIST);
                            atomicReference = (AtomicReference) this.f14874p;
                        }
                        if (d == null) {
                            x2.K k5 = ((C2066c0) j02.f1719a).f15568i;
                            C2066c0.i(k5);
                            k5.f15394f.d("(legacy) Failed to get conditional properties; not connected to service", null, (String) this.f14875q, (String) this.f14876r);
                            ((AtomicReference) this.f14874p).set(Collections.EMPTY_LIST);
                            return;
                        }
                        if (TextUtils.isEmpty(null)) {
                            ((AtomicReference) this.f14874p).set(d.w0((String) this.f14875q, (String) this.f14876r, (d1) this.f14877s));
                        } else {
                            ((AtomicReference) this.f14874p).set(d.Y1(null, (String) this.f14875q, (String) this.f14876r));
                        }
                        ((J0) this.f14878t).q();
                        atomicReference = (AtomicReference) this.f14874p;
                        atomicReference.notify();
                        return;
                    } finally {
                        ((AtomicReference) this.f14874p).notify();
                    }
                }
            default:
                d1 d1Var = (d1) this.f14876r;
                String str2 = (String) this.f14875q;
                String str3 = (String) this.f14874p;
                com.google.android.gms.internal.measurement.J j4 = (com.google.android.gms.internal.measurement.J) this.f14877s;
                J0 j03 = (J0) this.f14878t;
                C2066c0 c2066c0 = (C2066c0) j03.f1719a;
                ArrayList arrayList = new ArrayList();
                try {
                    try {
                        x2.D d4 = j03.d;
                        if (d4 == null) {
                            x2.K k6 = c2066c0.f15568i;
                            C2066c0.i(k6);
                            k6.f15394f.c(str3, str2, "Failed to get conditional properties; not connected to service");
                        } else {
                            arrayList = b1.p(d4.w0(str3, str2, d1Var));
                            j03.q();
                        }
                    } catch (RemoteException e8) {
                        x2.K k7 = c2066c0.f15568i;
                        C2066c0.i(k7);
                        k7.f15394f.d("Failed to get conditional properties; remote exception", str3, str2, e8);
                    }
                    return;
                } finally {
                    b1 b1Var = c2066c0.f15571l;
                    C2066c0.g(b1Var);
                    b1Var.A(j4, arrayList);
                }
        }
    }
}
