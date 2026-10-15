package com.google.android.gms.internal.ads;

import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.ext.SdkExtensions;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.l6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class CallableC0851l6 implements Callable {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ CallableC0851l6 f9364b = new CallableC0851l6(0);
    public static final /* synthetic */ CallableC0851l6 c = new CallableC0851l6(1);
    public static final /* synthetic */ CallableC0851l6 d = new CallableC0851l6(2);

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ CallableC0851l6 f9365e = new CallableC0851l6(3);

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ CallableC0851l6 f9366f = new CallableC0851l6(4);

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ CallableC0851l6 f9367g = new CallableC0851l6(5);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9368a;

    public /* synthetic */ CallableC0851l6(int i4) {
        this.f9368a = i4;
    }

    private final Object a() {
        String y;
        String z4;
        String str;
        N1.n nVar = N1.n.f1204A;
        Q1.N n4 = nVar.c;
        I4 w2 = nVar.f1209g.c().w();
        Bundle bundle = null;
        if (w2 != null && (!nVar.f1209g.c().n() || !nVar.f1209g.c().o())) {
            if (w2.f5537p) {
                synchronized (w2.f5538q) {
                    w2.f5537p = false;
                    w2.f5538q.notifyAll();
                    Y9.m("ContentFetchThread: wakeup");
                }
            }
            E4 a4 = w2.a();
            if (a4 != null) {
                y = a4.f4847o;
                str = a4.f4848p;
                z4 = a4.f4849q;
                if (y != null) {
                    nVar.f1209g.c().H(y);
                }
                if (z4 != null) {
                    nVar.f1209g.c().I(z4);
                }
            } else {
                y = nVar.f1209g.c().y();
                z4 = nVar.f1209g.c().z();
                str = null;
            }
            Bundle bundle2 = new Bundle(1);
            if (!nVar.f1209g.c().o()) {
                if (z4 == null || TextUtils.isEmpty(z4)) {
                    bundle2.putString("v_fp_vertical", "no_hash");
                } else {
                    bundle2.putString("v_fp_vertical", z4);
                }
            }
            if (y != null && !nVar.f1209g.c().n()) {
                bundle2.putString("fingerprint", y);
                if (!y.equals(str)) {
                    bundle2.putString("v_fp", str);
                }
            }
            if (!bundle2.isEmpty()) {
                bundle = bundle2;
            }
        }
        return new Xn(1, bundle);
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int extensionVersion;
        String str;
        switch (this.f9368a) {
            case 0:
                return Boolean.valueOf("mounted".equals(Environment.getExternalStorageState()));
            case 1:
                if (!((Boolean) O1.r.d.c.a(AbstractC1066q6.G8)).booleanValue()) {
                    return new C0619fo(0, null);
                }
                Q1.N n4 = N1.n.f1204A.c;
                int i4 = 0;
                if (Build.VERSION.SDK_INT >= 30) {
                    extensionVersion = SdkExtensions.getExtensionVersion(30);
                    if (extensionVersion > 3) {
                        i4 = SdkExtensions.getExtensionVersion(1000000);
                    }
                }
                return new C0619fo(0, Integer.valueOf(i4));
            case 2:
                N1.n nVar = N1.n.f1204A;
                O1.D0 d02 = nVar.f1215m;
                synchronized (d02.f1268a) {
                    str = (String) d02.f1270e;
                }
                return new C0961no(str, nVar.f1215m.k());
            case 3:
                Bundle bundle = new Bundle();
                Runtime runtime = Runtime.getRuntime();
                bundle.putLong("runtime_free", runtime.freeMemory());
                bundle.putLong("runtime_max", runtime.maxMemory());
                bundle.putLong("runtime_total", runtime.totalMemory());
                bundle.putInt("web_view_count", N1.n.f1204A.f1209g.f9975j.get());
                return new Xn(2, bundle);
            case 4:
                HashMap hashMap = new HashMap();
                C0937n6 c0937n6 = AbstractC1066q6.f10097E;
                O1.r rVar = O1.r.d;
                String str2 = (String) rVar.c.a(c0937n6);
                if (str2 != null && !str2.isEmpty()) {
                    if (Build.VERSION.SDK_INT >= ((Integer) rVar.c.a(AbstractC1066q6.f10102F)).intValue()) {
                        for (String str3 : str2.split(",", -1)) {
                            hashMap.put(str3, Q1.G.a(str3));
                        }
                    }
                }
                return new C0619fo(6, hashMap);
            case 5:
                return null;
            case 6:
                N1.n nVar2 = N1.n.f1204A;
                nVar2.f1212j.getClass();
                return new C0918mo(System.currentTimeMillis() - nVar2.f1209g.c().x().f9736f);
            case 7:
                return a();
            case 8:
                return new Oo(new JSONObject(), 0);
            default:
                return new Oo(new JSONObject(), 1);
        }
    }
}
