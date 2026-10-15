package com.google.android.gms.measurement.internal;

import J1.a;
import N1.f;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.internal.ads.RunnableC0758j;
import com.google.android.gms.internal.ads.Wl;
import com.google.android.gms.internal.measurement.G;
import com.google.android.gms.internal.measurement.J;
import com.google.android.gms.internal.measurement.L;
import com.google.android.gms.internal.measurement.N;
import com.google.android.gms.internal.measurement.O;
import h2.y;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import n2.BinderC1813b;
import n2.InterfaceC1812a;
import r.e;
import r.i;
import x0.j;
import x2.AbstractC2080j0;
import x2.C0;
import x2.C2064b0;
import x2.C2066c0;
import x2.C2096s;
import x2.C2101u0;
import x2.C2103v0;
import x2.C2111z0;
import x2.K;
import x2.RunnableC2086m0;
import x2.RunnableC2090o0;
import x2.RunnableC2094q0;
import x2.RunnableC2099t0;
import x2.b1;
import x2.c1;
import x2.r;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
@DynamiteApi
/* loaded from: classes.dex */
public class AppMeasurementDynamiteService extends G {

    /* renamed from: o, reason: collision with root package name */
    public C2066c0 f12272o;

    /* renamed from: p, reason: collision with root package name */
    public final e f12273p;

    /* JADX WARN: Type inference failed for: r0v2, types: [r.e, r.i] */
    public AppMeasurementDynamiteService() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        this.f12272o = null;
        this.f12273p = new i(0);
    }

    public final void Q(String str, J j4) {
        c();
        b1 b1Var = this.f12272o.f15571l;
        C2066c0.g(b1Var);
        b1Var.F(str, j4);
    }

    @Override // com.google.android.gms.internal.measurement.H
    public void beginAdUnitExposure(String str, long j4) {
        c();
        this.f12272o.k().h(str, j4);
    }

    public final void c() {
        if (this.f12272o == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    @Override // com.google.android.gms.internal.measurement.H
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        c();
        C2103v0 c2103v0 = this.f12272o.f15575p;
        C2066c0.h(c2103v0);
        c2103v0.j(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.measurement.H
    public void clearMeasurementEnabled(long j4) {
        c();
        C2103v0 c2103v0 = this.f12272o.f15575p;
        C2066c0.h(c2103v0);
        c2103v0.e();
        C2064b0 c2064b0 = ((C2066c0) c2103v0.f1719a).f15569j;
        C2066c0.i(c2064b0);
        c2064b0.o(new j(c2103v0, null, 6, false));
    }

    @Override // com.google.android.gms.internal.measurement.H
    public void endAdUnitExposure(String str, long j4) {
        c();
        this.f12272o.k().i(str, j4);
    }

    @Override // com.google.android.gms.internal.measurement.H
    public void generateEventId(J j4) {
        c();
        b1 b1Var = this.f12272o.f15571l;
        C2066c0.g(b1Var);
        long i02 = b1Var.i0();
        c();
        b1 b1Var2 = this.f12272o.f15571l;
        C2066c0.g(b1Var2);
        b1Var2.E(j4, i02);
    }

    @Override // com.google.android.gms.internal.measurement.H
    public void getAppInstanceId(J j4) {
        c();
        C2064b0 c2064b0 = this.f12272o.f15569j;
        C2066c0.i(c2064b0);
        c2064b0.o(new RunnableC2099t0(this, j4, 0));
    }

    @Override // com.google.android.gms.internal.measurement.H
    public void getCachedAppInstanceId(J j4) {
        c();
        C2103v0 c2103v0 = this.f12272o.f15575p;
        C2066c0.h(c2103v0);
        Q(c2103v0.A(), j4);
    }

    @Override // com.google.android.gms.internal.measurement.H
    public void getConditionalUserProperties(String str, String str2, J j4) {
        c();
        C2064b0 c2064b0 = this.f12272o.f15569j;
        C2066c0.i(c2064b0);
        c2064b0.o(new a(this, j4, str, str2, 15, false));
    }

    @Override // com.google.android.gms.internal.measurement.H
    public void getCurrentScreenClass(J j4) {
        c();
        C2103v0 c2103v0 = this.f12272o.f15575p;
        C2066c0.h(c2103v0);
        C0 c02 = ((C2066c0) c2103v0.f1719a).f15574o;
        C2066c0.h(c02);
        C2111z0 c2111z0 = c02.c;
        Q(c2111z0 != null ? c2111z0.f15862b : null, j4);
    }

    @Override // com.google.android.gms.internal.measurement.H
    public void getCurrentScreenName(J j4) {
        c();
        C2103v0 c2103v0 = this.f12272o.f15575p;
        C2066c0.h(c2103v0);
        C0 c02 = ((C2066c0) c2103v0.f1719a).f15574o;
        C2066c0.h(c02);
        C2111z0 c2111z0 = c02.c;
        Q(c2111z0 != null ? c2111z0.f15861a : null, j4);
    }

    @Override // com.google.android.gms.internal.measurement.H
    public void getGmpAppId(J j4) {
        c();
        C2103v0 c2103v0 = this.f12272o.f15575p;
        C2066c0.h(c2103v0);
        C2066c0 c2066c0 = (C2066c0) c2103v0.f1719a;
        String str = c2066c0.f15563b;
        if (str == null) {
            try {
                str = AbstractC2080j0.i(c2066c0.f15562a, c2066c0.f15578s);
            } catch (IllegalStateException e4) {
                K k3 = c2066c0.f15568i;
                C2066c0.i(k3);
                k3.f15394f.b(e4, "getGoogleAppId failed with exception");
                str = null;
            }
        }
        Q(str, j4);
    }

    @Override // com.google.android.gms.internal.measurement.H
    public void getMaxUserProperties(String str, J j4) {
        c();
        C2103v0 c2103v0 = this.f12272o.f15575p;
        C2066c0.h(c2103v0);
        y.e(str);
        ((C2066c0) c2103v0.f1719a).getClass();
        c();
        b1 b1Var = this.f12272o.f15571l;
        C2066c0.g(b1Var);
        b1Var.D(j4, 25);
    }

    @Override // com.google.android.gms.internal.measurement.H
    public void getTestFlag(J j4, int i4) {
        c();
        if (i4 == 0) {
            b1 b1Var = this.f12272o.f15571l;
            C2066c0.g(b1Var);
            C2103v0 c2103v0 = this.f12272o.f15575p;
            C2066c0.h(c2103v0);
            AtomicReference atomicReference = new AtomicReference();
            C2064b0 c2064b0 = ((C2066c0) c2103v0.f1719a).f15569j;
            C2066c0.i(c2064b0);
            b1Var.F((String) c2064b0.l(atomicReference, 15000L, "String test flag value", new RunnableC2094q0(c2103v0, atomicReference, 1)), j4);
            return;
        }
        if (i4 == 1) {
            b1 b1Var2 = this.f12272o.f15571l;
            C2066c0.g(b1Var2);
            C2103v0 c2103v02 = this.f12272o.f15575p;
            C2066c0.h(c2103v02);
            AtomicReference atomicReference2 = new AtomicReference();
            C2064b0 c2064b02 = ((C2066c0) c2103v02.f1719a).f15569j;
            C2066c0.i(c2064b02);
            b1Var2.E(j4, ((Long) c2064b02.l(atomicReference2, 15000L, "long test flag value", new RunnableC2094q0(c2103v02, atomicReference2, 2))).longValue());
            return;
        }
        if (i4 == 2) {
            b1 b1Var3 = this.f12272o.f15571l;
            C2066c0.g(b1Var3);
            C2103v0 c2103v03 = this.f12272o.f15575p;
            C2066c0.h(c2103v03);
            AtomicReference atomicReference3 = new AtomicReference();
            C2064b0 c2064b03 = ((C2066c0) c2103v03.f1719a).f15569j;
            C2066c0.i(c2064b03);
            double doubleValue = ((Double) c2064b03.l(atomicReference3, 15000L, "double test flag value", new RunnableC2094q0(c2103v03, atomicReference3, 4))).doubleValue();
            Bundle bundle = new Bundle();
            bundle.putDouble("r", doubleValue);
            try {
                j4.d3(bundle);
                return;
            } catch (RemoteException e4) {
                K k3 = ((C2066c0) b1Var3.f1719a).f15568i;
                C2066c0.i(k3);
                k3.f15397i.b(e4, "Error returning double value to wrapper");
                return;
            }
        }
        if (i4 == 3) {
            b1 b1Var4 = this.f12272o.f15571l;
            C2066c0.g(b1Var4);
            C2103v0 c2103v04 = this.f12272o.f15575p;
            C2066c0.h(c2103v04);
            AtomicReference atomicReference4 = new AtomicReference();
            C2064b0 c2064b04 = ((C2066c0) c2103v04.f1719a).f15569j;
            C2066c0.i(c2064b04);
            b1Var4.D(j4, ((Integer) c2064b04.l(atomicReference4, 15000L, "int test flag value", new RunnableC2094q0(c2103v04, atomicReference4, 3))).intValue());
            return;
        }
        if (i4 != 4) {
            return;
        }
        b1 b1Var5 = this.f12272o.f15571l;
        C2066c0.g(b1Var5);
        C2103v0 c2103v05 = this.f12272o.f15575p;
        C2066c0.h(c2103v05);
        AtomicReference atomicReference5 = new AtomicReference();
        C2064b0 c2064b05 = ((C2066c0) c2103v05.f1719a).f15569j;
        C2066c0.i(c2064b05);
        b1Var5.z(j4, ((Boolean) c2064b05.l(atomicReference5, 15000L, "boolean test flag value", new RunnableC2094q0(c2103v05, atomicReference5, 0))).booleanValue());
    }

    @Override // com.google.android.gms.internal.measurement.H
    public void getUserProperties(String str, String str2, boolean z4, J j4) {
        c();
        C2064b0 c2064b0 = this.f12272o.f15569j;
        C2066c0.i(c2064b0);
        c2064b0.o(new androidx.fragment.app.y(this, j4, str, str2, z4, 3));
    }

    @Override // com.google.android.gms.internal.measurement.H
    public void initForTests(Map map) {
        c();
    }

    @Override // com.google.android.gms.internal.measurement.H
    public void initialize(InterfaceC1812a interfaceC1812a, O o4, long j4) {
        C2066c0 c2066c0 = this.f12272o;
        if (c2066c0 == null) {
            Context context = (Context) BinderC1813b.C2(interfaceC1812a);
            y.i(context);
            this.f12272o = C2066c0.p(context, o4, Long.valueOf(j4));
        } else {
            K k3 = c2066c0.f15568i;
            C2066c0.i(k3);
            k3.f15397i.a("Attempting to initialize multiple times");
        }
    }

    @Override // com.google.android.gms.internal.measurement.H
    public void isDataCollectionEnabled(J j4) {
        c();
        C2064b0 c2064b0 = this.f12272o.f15569j;
        C2066c0.i(c2064b0);
        c2064b0.o(new RunnableC2099t0(this, j4, 1));
    }

    @Override // com.google.android.gms.internal.measurement.H
    public void logEvent(String str, String str2, Bundle bundle, boolean z4, boolean z5, long j4) {
        c();
        C2103v0 c2103v0 = this.f12272o.f15575p;
        C2066c0.h(c2103v0);
        c2103v0.l(str, str2, bundle, z4, z5, j4);
    }

    @Override // com.google.android.gms.internal.measurement.H
    public void logEventAndBundle(String str, String str2, Bundle bundle, J j4, long j5) {
        c();
        y.e(str2);
        (bundle != null ? new Bundle(bundle) : new Bundle()).putString("_o", "app");
        C2096s c2096s = new C2096s(str2, new r(bundle), "app", j5);
        C2064b0 c2064b0 = this.f12272o.f15569j;
        C2066c0.i(c2064b0);
        c2064b0.o(new a(this, j4, c2096s, str));
    }

    @Override // com.google.android.gms.internal.measurement.H
    public void logHealthData(int i4, String str, InterfaceC1812a interfaceC1812a, InterfaceC1812a interfaceC1812a2, InterfaceC1812a interfaceC1812a3) {
        c();
        Object C22 = interfaceC1812a == null ? null : BinderC1813b.C2(interfaceC1812a);
        Object C23 = interfaceC1812a2 == null ? null : BinderC1813b.C2(interfaceC1812a2);
        Object C24 = interfaceC1812a3 != null ? BinderC1813b.C2(interfaceC1812a3) : null;
        K k3 = this.f12272o.f15568i;
        C2066c0.i(k3);
        k3.r(i4, true, false, str, C22, C23, C24);
    }

    @Override // com.google.android.gms.internal.measurement.H
    public void onActivityCreated(InterfaceC1812a interfaceC1812a, Bundle bundle, long j4) {
        c();
        C2103v0 c2103v0 = this.f12272o.f15575p;
        C2066c0.h(c2103v0);
        C2101u0 c2101u0 = c2103v0.c;
        if (c2101u0 != null) {
            C2103v0 c2103v02 = this.f12272o.f15575p;
            C2066c0.h(c2103v02);
            c2103v02.k();
            c2101u0.onActivityCreated((Activity) BinderC1813b.C2(interfaceC1812a), bundle);
        }
    }

    @Override // com.google.android.gms.internal.measurement.H
    public void onActivityDestroyed(InterfaceC1812a interfaceC1812a, long j4) {
        c();
        C2103v0 c2103v0 = this.f12272o.f15575p;
        C2066c0.h(c2103v0);
        C2101u0 c2101u0 = c2103v0.c;
        if (c2101u0 != null) {
            C2103v0 c2103v02 = this.f12272o.f15575p;
            C2066c0.h(c2103v02);
            c2103v02.k();
            c2101u0.onActivityDestroyed((Activity) BinderC1813b.C2(interfaceC1812a));
        }
    }

    @Override // com.google.android.gms.internal.measurement.H
    public void onActivityPaused(InterfaceC1812a interfaceC1812a, long j4) {
        c();
        C2103v0 c2103v0 = this.f12272o.f15575p;
        C2066c0.h(c2103v0);
        C2101u0 c2101u0 = c2103v0.c;
        if (c2101u0 != null) {
            C2103v0 c2103v02 = this.f12272o.f15575p;
            C2066c0.h(c2103v02);
            c2103v02.k();
            c2101u0.onActivityPaused((Activity) BinderC1813b.C2(interfaceC1812a));
        }
    }

    @Override // com.google.android.gms.internal.measurement.H
    public void onActivityResumed(InterfaceC1812a interfaceC1812a, long j4) {
        c();
        C2103v0 c2103v0 = this.f12272o.f15575p;
        C2066c0.h(c2103v0);
        C2101u0 c2101u0 = c2103v0.c;
        if (c2101u0 != null) {
            C2103v0 c2103v02 = this.f12272o.f15575p;
            C2066c0.h(c2103v02);
            c2103v02.k();
            c2101u0.onActivityResumed((Activity) BinderC1813b.C2(interfaceC1812a));
        }
    }

    @Override // com.google.android.gms.internal.measurement.H
    public void onActivitySaveInstanceState(InterfaceC1812a interfaceC1812a, J j4, long j5) {
        c();
        C2103v0 c2103v0 = this.f12272o.f15575p;
        C2066c0.h(c2103v0);
        C2101u0 c2101u0 = c2103v0.c;
        Bundle bundle = new Bundle();
        if (c2101u0 != null) {
            C2103v0 c2103v02 = this.f12272o.f15575p;
            C2066c0.h(c2103v02);
            c2103v02.k();
            c2101u0.onActivitySaveInstanceState((Activity) BinderC1813b.C2(interfaceC1812a), bundle);
        }
        try {
            j4.d3(bundle);
        } catch (RemoteException e4) {
            K k3 = this.f12272o.f15568i;
            C2066c0.i(k3);
            k3.f15397i.b(e4, "Error returning bundle value to wrapper");
        }
    }

    @Override // com.google.android.gms.internal.measurement.H
    public void onActivityStarted(InterfaceC1812a interfaceC1812a, long j4) {
        c();
        C2103v0 c2103v0 = this.f12272o.f15575p;
        C2066c0.h(c2103v0);
        if (c2103v0.c != null) {
            C2103v0 c2103v02 = this.f12272o.f15575p;
            C2066c0.h(c2103v02);
            c2103v02.k();
        }
    }

    @Override // com.google.android.gms.internal.measurement.H
    public void onActivityStopped(InterfaceC1812a interfaceC1812a, long j4) {
        c();
        C2103v0 c2103v0 = this.f12272o.f15575p;
        C2066c0.h(c2103v0);
        if (c2103v0.c != null) {
            C2103v0 c2103v02 = this.f12272o.f15575p;
            C2066c0.h(c2103v02);
            c2103v02.k();
        }
    }

    @Override // com.google.android.gms.internal.measurement.H
    public void performAction(Bundle bundle, J j4, long j5) {
        c();
        j4.d3(null);
    }

    @Override // com.google.android.gms.internal.measurement.H
    public void registerOnMeasurementEventListener(L l4) {
        c1 c1Var;
        c();
        synchronized (this.f12273p) {
            try {
                e eVar = this.f12273p;
                com.google.android.gms.internal.measurement.K k3 = (com.google.android.gms.internal.measurement.K) l4;
                Parcel a02 = k3.a0(k3.Q(), 2);
                int readInt = a02.readInt();
                a02.recycle();
                c1Var = (c1) eVar.get(Integer.valueOf(readInt));
                if (c1Var == null) {
                    c1Var = new c1(this, k3);
                    e eVar2 = this.f12273p;
                    Parcel a03 = k3.a0(k3.Q(), 2);
                    int readInt2 = a03.readInt();
                    a03.recycle();
                    eVar2.put(Integer.valueOf(readInt2), c1Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C2103v0 c2103v0 = this.f12272o.f15575p;
        C2066c0.h(c2103v0);
        c2103v0.e();
        if (c2103v0.f15827e.add(c1Var)) {
            return;
        }
        K k4 = ((C2066c0) c2103v0.f1719a).f15568i;
        C2066c0.i(k4);
        k4.f15397i.a("OnEventListener already registered");
    }

    @Override // com.google.android.gms.internal.measurement.H
    public void resetAnalyticsData(long j4) {
        c();
        C2103v0 c2103v0 = this.f12272o.f15575p;
        C2066c0.h(c2103v0);
        c2103v0.f15829g.set(null);
        C2064b0 c2064b0 = ((C2066c0) c2103v0.f1719a).f15569j;
        C2066c0.i(c2064b0);
        c2064b0.o(new RunnableC2090o0(c2103v0, j4, 1));
    }

    @Override // com.google.android.gms.internal.measurement.H
    public void setConditionalUserProperty(Bundle bundle, long j4) {
        c();
        if (bundle == null) {
            K k3 = this.f12272o.f15568i;
            C2066c0.i(k3);
            k3.f15394f.a("Conditional user property must not be null");
        } else {
            C2103v0 c2103v0 = this.f12272o.f15575p;
            C2066c0.h(c2103v0);
            c2103v0.q(bundle, j4);
        }
    }

    @Override // com.google.android.gms.internal.measurement.H
    public void setConsent(Bundle bundle, long j4) {
        c();
        C2103v0 c2103v0 = this.f12272o.f15575p;
        C2066c0.h(c2103v0);
        C2064b0 c2064b0 = ((C2066c0) c2103v0.f1719a).f15569j;
        C2066c0.i(c2064b0);
        c2064b0.p(new RunnableC0758j(c2103v0, bundle, j4, 3));
    }

    @Override // com.google.android.gms.internal.measurement.H
    public void setConsentThirdParty(Bundle bundle, long j4) {
        c();
        C2103v0 c2103v0 = this.f12272o.f15575p;
        C2066c0.h(c2103v0);
        c2103v0.r(bundle, -20, j4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x009c, code lost:
    
        if (r4.length() <= 100) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00cb, code lost:
    
        if (r5.length() <= 100) goto L39;
     */
    @Override // com.google.android.gms.internal.measurement.H
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setCurrentScreen(n2.InterfaceC1812a r3, java.lang.String r4, java.lang.String r5, long r6) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.AppMeasurementDynamiteService.setCurrentScreen(n2.a, java.lang.String, java.lang.String, long):void");
    }

    @Override // com.google.android.gms.internal.measurement.H
    public void setDataCollectionEnabled(boolean z4) {
        c();
        C2103v0 c2103v0 = this.f12272o.f15575p;
        C2066c0.h(c2103v0);
        c2103v0.e();
        C2064b0 c2064b0 = ((C2066c0) c2103v0.f1719a).f15569j;
        C2066c0.i(c2064b0);
        c2064b0.o(new f(c2103v0, z4, 3));
    }

    @Override // com.google.android.gms.internal.measurement.H
    public void setDefaultEventParameters(Bundle bundle) {
        c();
        C2103v0 c2103v0 = this.f12272o.f15575p;
        C2066c0.h(c2103v0);
        Bundle bundle2 = bundle == null ? null : new Bundle(bundle);
        C2064b0 c2064b0 = ((C2066c0) c2103v0.f1719a).f15569j;
        C2066c0.i(c2064b0);
        c2064b0.o(new RunnableC2086m0(c2103v0, bundle2, 0));
    }

    @Override // com.google.android.gms.internal.measurement.H
    public void setEventInterceptor(L l4) {
        c();
        Wl wl = new Wl(this, l4, 25, false);
        C2064b0 c2064b0 = this.f12272o.f15569j;
        C2066c0.i(c2064b0);
        if (!c2064b0.q()) {
            C2064b0 c2064b02 = this.f12272o.f15569j;
            C2066c0.i(c2064b02);
            c2064b02.o(new j(this, wl, 10, false));
            return;
        }
        C2103v0 c2103v0 = this.f12272o.f15575p;
        C2066c0.h(c2103v0);
        c2103v0.g();
        c2103v0.e();
        Wl wl2 = c2103v0.d;
        if (wl != wl2) {
            y.k("EventInterceptor already set.", wl2 == null);
        }
        c2103v0.d = wl;
    }

    @Override // com.google.android.gms.internal.measurement.H
    public void setInstanceIdProvider(N n4) {
        c();
    }

    @Override // com.google.android.gms.internal.measurement.H
    public void setMeasurementEnabled(boolean z4, long j4) {
        c();
        C2103v0 c2103v0 = this.f12272o.f15575p;
        C2066c0.h(c2103v0);
        Boolean valueOf = Boolean.valueOf(z4);
        c2103v0.e();
        C2064b0 c2064b0 = ((C2066c0) c2103v0.f1719a).f15569j;
        C2066c0.i(c2064b0);
        c2064b0.o(new j(c2103v0, valueOf, 6, false));
    }

    @Override // com.google.android.gms.internal.measurement.H
    public void setMinimumSessionDuration(long j4) {
        c();
    }

    @Override // com.google.android.gms.internal.measurement.H
    public void setSessionTimeoutDuration(long j4) {
        c();
        C2103v0 c2103v0 = this.f12272o.f15575p;
        C2066c0.h(c2103v0);
        C2064b0 c2064b0 = ((C2066c0) c2103v0.f1719a).f15569j;
        C2066c0.i(c2064b0);
        c2064b0.o(new RunnableC2090o0(c2103v0, j4, 0));
    }

    @Override // com.google.android.gms.internal.measurement.H
    public void setUserId(String str, long j4) {
        c();
        C2103v0 c2103v0 = this.f12272o.f15575p;
        C2066c0.h(c2103v0);
        C2066c0 c2066c0 = (C2066c0) c2103v0.f1719a;
        if (str != null && TextUtils.isEmpty(str)) {
            K k3 = c2066c0.f15568i;
            C2066c0.i(k3);
            k3.f15397i.a("User ID must be non-empty or null");
        } else {
            C2064b0 c2064b0 = c2066c0.f15569j;
            C2066c0.i(c2064b0);
            c2064b0.o(new j(5, c2103v0, str));
            c2103v0.v(null, "_id", str, true, j4);
        }
    }

    @Override // com.google.android.gms.internal.measurement.H
    public void setUserProperty(String str, String str2, InterfaceC1812a interfaceC1812a, boolean z4, long j4) {
        c();
        Object C22 = BinderC1813b.C2(interfaceC1812a);
        C2103v0 c2103v0 = this.f12272o.f15575p;
        C2066c0.h(c2103v0);
        c2103v0.v(str, str2, C22, z4, j4);
    }

    @Override // com.google.android.gms.internal.measurement.H
    public void unregisterOnMeasurementEventListener(L l4) {
        com.google.android.gms.internal.measurement.K k3;
        c1 c1Var;
        c();
        synchronized (this.f12273p) {
            e eVar = this.f12273p;
            k3 = (com.google.android.gms.internal.measurement.K) l4;
            Parcel a02 = k3.a0(k3.Q(), 2);
            int readInt = a02.readInt();
            a02.recycle();
            c1Var = (c1) eVar.remove(Integer.valueOf(readInt));
        }
        if (c1Var == null) {
            c1Var = new c1(this, k3);
        }
        C2103v0 c2103v0 = this.f12272o.f15575p;
        C2066c0.h(c2103v0);
        c2103v0.e();
        if (c2103v0.f15827e.remove(c1Var)) {
            return;
        }
        K k4 = ((C2066c0) c2103v0.f1719a).f15568i;
        C2066c0.i(k4);
        k4.f15397i.a("OnEventListener had not been registered");
    }
}
