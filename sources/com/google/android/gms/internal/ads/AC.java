package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Pair;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import x2.C2066c0;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final /* synthetic */ class AC implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f3931o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f3932p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f3933q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f3934r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f3935s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f3936t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f3937u;

    public /* synthetic */ AC(Object obj, Object obj2, C0859lE c0859lE, C1074qE c1074qE, IOException iOException, boolean z4, int i4) {
        this.f3931o = i4;
        this.f3936t = obj;
        this.f3937u = obj2;
        this.f3932p = c0859lE;
        this.f3933q = c1074qE;
        this.f3934r = iOException;
        this.f3935s = z4;
    }

    public AC(x2.J0 j02, String str, String str2, x2.d1 d1Var, boolean z4, com.google.android.gms.internal.measurement.J j4) {
        this.f3931o = 2;
        this.f3934r = j02;
        this.f3936t = str;
        this.f3937u = str2;
        this.f3932p = d1Var;
        this.f3935s = z4;
        this.f3933q = j4;
    }

    public AC(x2.J0 j02, AtomicReference atomicReference, String str, String str2, x2.d1 d1Var, boolean z4) {
        this.f3931o = 3;
        this.f3934r = j02;
        this.f3936t = atomicReference;
        this.f3937u = str;
        this.f3932p = str2;
        this.f3933q = d1Var;
        this.f3935s = z4;
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, com.google.android.gms.internal.ads.xE] */
    @Override // java.lang.Runnable
    public final void run() {
        x2.D d;
        AtomicReference atomicReference;
        x2.J0 j02;
        x2.D d4;
        switch (this.f3931o) {
            case 0:
                Pair pair = (Pair) this.f3937u;
                ((EC) ((Qw) this.f3936t).f6711q).f4861h.m(((Integer) pair.first).intValue(), (C1202tE) pair.second, (C0859lE) this.f3932p, (C1074qE) this.f3933q, (IOException) this.f3934r, this.f3935s);
                return;
            case 1:
                this.f3937u.m(0, (C1202tE) ((C0831kn) this.f3936t).f9319p, (C0859lE) this.f3932p, (C1074qE) this.f3933q, (IOException) this.f3934r, this.f3935s);
                return;
            case 2:
                x2.d1 d1Var = (x2.d1) this.f3932p;
                String str = (String) this.f3937u;
                String str2 = (String) this.f3936t;
                com.google.android.gms.internal.measurement.J j4 = (com.google.android.gms.internal.measurement.J) this.f3933q;
                x2.J0 j03 = (x2.J0) this.f3934r;
                C2066c0 c2066c0 = (C2066c0) j03.f1719a;
                Bundle bundle = new Bundle();
                try {
                    try {
                        d = j03.d;
                    } catch (Throwable th) {
                        th = th;
                    }
                } catch (RemoteException e4) {
                    e = e4;
                }
                if (d == null) {
                    x2.K k3 = c2066c0.f15568i;
                    C2066c0.i(k3);
                    k3.f15394f.c(str2, str, "Failed to get user properties; not connected to service");
                    x2.b1 b1Var = c2066c0.f15571l;
                    C2066c0.g(b1Var);
                    b1Var.B(j4, bundle);
                    return;
                }
                List<x2.Y0> P12 = d.P1(str2, str, this.f3935s, d1Var);
                Bundle bundle2 = new Bundle();
                if (P12 != null) {
                    for (x2.Y0 y02 : P12) {
                        String str3 = y02.f15511s;
                        String str4 = y02.f15508p;
                        if (str3 != null) {
                            bundle2.putString(str4, str3);
                        } else {
                            Long l4 = y02.f15510r;
                            if (l4 != null) {
                                bundle2.putLong(str4, l4.longValue());
                            } else {
                                Double d5 = y02.f15513u;
                                if (d5 != null) {
                                    bundle2.putDouble(str4, d5.doubleValue());
                                }
                            }
                        }
                    }
                }
                try {
                    j03.q();
                    x2.b1 b1Var2 = c2066c0.f15571l;
                    C2066c0.g(b1Var2);
                    b1Var2.B(j4, bundle2);
                    return;
                } catch (RemoteException e5) {
                    e = e5;
                    bundle = bundle2;
                    x2.K k4 = c2066c0.f15568i;
                    C2066c0.i(k4);
                    k4.f15394f.c(str2, e, "Failed to get user properties; remote exception");
                    x2.b1 b1Var3 = c2066c0.f15571l;
                    C2066c0.g(b1Var3);
                    b1Var3.B(j4, bundle);
                    return;
                } catch (Throwable th2) {
                    th = th2;
                    bundle = bundle2;
                    x2.b1 b1Var4 = c2066c0.f15571l;
                    C2066c0.g(b1Var4);
                    b1Var4.B(j4, bundle);
                    throw th;
                }
            default:
                synchronized (((AtomicReference) this.f3936t)) {
                    try {
                        try {
                            j02 = (x2.J0) this.f3934r;
                            d4 = j02.d;
                        } finally {
                            ((AtomicReference) this.f3936t).notify();
                        }
                    } catch (RemoteException e6) {
                        x2.K k5 = ((C2066c0) ((x2.J0) this.f3934r).f1719a).f15568i;
                        C2066c0.i(k5);
                        k5.f15394f.d("(legacy) Failed to get user properties; remote exception", null, (String) this.f3937u, e6);
                        ((AtomicReference) this.f3936t).set(Collections.EMPTY_LIST);
                        atomicReference = (AtomicReference) this.f3936t;
                    }
                    if (d4 == null) {
                        x2.K k6 = ((C2066c0) j02.f1719a).f15568i;
                        C2066c0.i(k6);
                        k6.f15394f.d("(legacy) Failed to get user properties; not connected to service", null, (String) this.f3937u, (String) this.f3932p);
                        ((AtomicReference) this.f3936t).set(Collections.EMPTY_LIST);
                        return;
                    }
                    if (TextUtils.isEmpty(null)) {
                        ((AtomicReference) this.f3936t).set(d4.P1((String) this.f3937u, (String) this.f3932p, this.f3935s, (x2.d1) this.f3933q));
                    } else {
                        ((AtomicReference) this.f3936t).set(d4.V0(null, (String) this.f3937u, (String) this.f3932p, this.f3935s));
                    }
                    ((x2.J0) this.f3934r).q();
                    atomicReference = (AtomicReference) this.f3936t;
                    atomicReference.notify();
                    return;
                }
        }
    }
}
