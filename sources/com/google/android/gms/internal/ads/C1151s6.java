package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import c3.InterfaceFutureC0239a;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.s6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1151s6 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f10577a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f10578b;
    public final Object c;
    public Object d;

    /* renamed from: e, reason: collision with root package name */
    public Object f10579e;

    /* renamed from: f, reason: collision with root package name */
    public Object f10580f;

    /* renamed from: g, reason: collision with root package name */
    public Object f10581g;

    /* renamed from: h, reason: collision with root package name */
    public Object f10582h;

    /* renamed from: i, reason: collision with root package name */
    public Object f10583i;

    public C1151s6() {
        this.f10577a = new ArrayBlockingQueue(100);
        this.f10578b = new LinkedHashMap();
        this.c = new HashMap();
        this.f10581g = new HashSet(Arrays.asList("noop", "activeViewPingSent", "viewabilityChanged", "visibilityChanged"));
    }

    public C1151s6(C0260Dc c0260Dc, ScheduledExecutorService scheduledExecutorService, InterfaceC0441bg interfaceC0441bg, Um um, Nq nq) {
        this.f10580f = new Object();
        this.f10582h = new AtomicBoolean();
        this.f10577a = c0260Dc;
        this.f10578b = scheduledExecutorService;
        this.c = interfaceC0441bg;
        this.d = um;
        this.f10579e = nq;
    }

    public C1151s6(Ep ep, C1434yp c1434yp, Ug ug, Xg xg, To to, Fg fg, C1040ph c1040ph, Zg zg, Nh nh) {
        this.f10577a = ep;
        this.f10578b = c1434yp;
        this.c = ug;
        this.d = xg;
        this.f10579e = to;
        this.f10580f = fg;
        this.f10581g = c1040ph;
        this.f10582h = zg;
        this.f10583i = nh;
    }

    public C1151s6(C0911mh c0911mh, C0326Qb c0326Qb, C1006oq c1006oq, Jp jp, C0248Bc c0248Bc, Fq fq, Eq eq, Context context, Su su) {
        this.f10577a = c0911mh;
        this.f10578b = c0326Qb;
        this.c = c1006oq;
        this.d = jp;
        this.f10579e = c0248Bc;
        this.f10581g = fq;
        this.f10582h = eq;
        this.f10580f = context;
        this.f10583i = su;
    }

    public synchronized Xu a(Ep ep) {
        try {
            if (!((AtomicBoolean) this.f10582h).getAndSet(true)) {
                if (((List) ep.f4943b.f6525p).isEmpty()) {
                    ((Xu) this.f10580f).g(new Xk(Ym.a(ep), 3));
                } else {
                    this.f10583i = ep;
                    this.f10581g = new Nm(ep, (Um) this.d, (Xu) this.f10580f);
                    ((Um) this.d).e((List) ep.f4943b.f6525p);
                    while (((Nm) this.f10581g).e()) {
                        c(((Nm) this.f10581g).a());
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return (Xu) this.f10580f;
    }

    public LinkedHashMap b(LinkedHashMap linkedHashMap, Map map) {
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            String str3 = (String) linkedHashMap2.get(str);
            C1194t6 c1194t6 = (C1194t6) ((HashMap) this.c).get(str);
            if (c1194t6 == null) {
                c1194t6 = C1194t6.f10674b;
            }
            linkedHashMap2.put(str, c1194t6.a(str3, str2));
        }
        return linkedHashMap2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void c(C1434yp c1434yp) {
        InterfaceFutureC0239a f02;
        if (c1434yp == null) {
            return;
        }
        synchronized (this) {
            Iterator it = c1434yp.f11500a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    f02 = Bs.f0(new Xk(3));
                    break;
                }
                InterfaceC0745im a4 = ((InterfaceC0441bg) this.c).a((String) it.next(), c1434yp.f11502b);
                if (a4 != null && a4.b((Ep) this.f10583i, c1434yp)) {
                    f02 = Bs.o0(a4.a((Ep) this.f10583i, c1434yp), c1434yp.f11491R, TimeUnit.MILLISECONDS, (ScheduledExecutorService) this.f10578b);
                    break;
                }
            }
        }
        ((Um) this.d).b((Ep) this.f10583i, c1434yp, f02, (Nq) this.f10579e);
        f02.a(new Nu(0 == true ? 1 : 0, f02, new C0258Da(this, c1434yp, 26, false)), (Executor) this.f10577a);
    }

    public void d(LinkedHashMap linkedHashMap, C1280v6 c1280v6) {
        FileOutputStream fileOutputStream;
        Uri.Builder buildUpon = Uri.parse((String) this.d).buildUpon();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        String uri = buildUpon.build().toString();
        if (c1280v6 != null) {
            String str = c1280v6.f10995p;
            String str2 = c1280v6.f10994o;
            StringBuilder sb = new StringBuilder(uri);
            if (!TextUtils.isEmpty(str2)) {
                sb.append("&it=");
                sb.append(str2);
            }
            if (!TextUtils.isEmpty(str)) {
                sb.append("&blat=");
                sb.append(str);
            }
            uri = sb.toString();
        }
        if (!((AtomicBoolean) this.f10582h).get()) {
            Q1.N n4 = N1.n.f1204A.c;
            Q1.N.i((Context) this.f10580f, (String) this.f10579e, uri);
            return;
        }
        File file = (File) this.f10583i;
        if (file == null) {
            Y9.s("CsiReporter: File doesn't exist. Cannot write CSI data to file.");
            return;
        }
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file, true);
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e4) {
            e = e4;
        }
        try {
            fileOutputStream.write(uri.getBytes());
            fileOutputStream.write(10);
            try {
                fileOutputStream.close();
            } catch (IOException e5) {
                Y9.t("CsiReporter: Cannot close file: sdk_csi_data.txt.", e5);
            }
        } catch (IOException e6) {
            e = e6;
            fileOutputStream2 = fileOutputStream;
            Y9.t("CsiReporter: Cannot write to file: sdk_csi_data.txt.", e);
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException e7) {
                    Y9.t("CsiReporter: Cannot close file: sdk_csi_data.txt.", e7);
                }
            }
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException e8) {
                    Y9.t("CsiReporter: Cannot close file: sdk_csi_data.txt.", e8);
                }
            }
            throw th;
        }
    }
}
