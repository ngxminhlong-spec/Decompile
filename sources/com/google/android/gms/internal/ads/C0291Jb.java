package com.google.android.gms.internal.ads;

import android.content.Context;
import c3.InterfaceFutureC0239a;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.Jb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0291Jb implements InterfaceC0301Lb {

    /* renamed from: l, reason: collision with root package name */
    public static final List f5856l = Collections.synchronizedList(new ArrayList());

    /* renamed from: a, reason: collision with root package name */
    public final KA f5857a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f5858b;

    /* renamed from: e, reason: collision with root package name */
    public final Context f5859e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f5860f;

    /* renamed from: g, reason: collision with root package name */
    public final C0296Kb f5861g;
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final Object f5862h = new Object();

    /* renamed from: i, reason: collision with root package name */
    public final HashSet f5863i = new HashSet();

    /* renamed from: j, reason: collision with root package name */
    public boolean f5864j = false;

    /* renamed from: k, reason: collision with root package name */
    public boolean f5865k = false;

    public C0291Jb(Context context, C0248Bc c0248Bc, C0296Kb c0296Kb, String str) {
        this.f5859e = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f5858b = new LinkedHashMap();
        this.f5861g = c0296Kb;
        Iterator it = c0296Kb.f6028s.iterator();
        while (it.hasNext()) {
            this.f5863i.add(((String) it.next()).toLowerCase(Locale.ENGLISH));
        }
        this.f5863i.remove("cookie".toLowerCase(Locale.ENGLISH));
        KA v4 = C0813kB.v();
        v4.d();
        C0813kB.J((C0813kB) v4.f4561p, 9);
        v4.d();
        C0813kB.z((C0813kB) v4.f4561p, str);
        v4.d();
        C0813kB.A((C0813kB) v4.f4561p, str);
        LA v5 = MA.v();
        String str2 = this.f5861g.f6024o;
        if (str2 != null) {
            v5.d();
            MA.w((MA) v5.f4561p, str2);
        }
        MA ma = (MA) v5.b();
        v4.d();
        C0813kB.B((C0813kB) v4.f4561p, ma);
        C0686hB v6 = C0729iB.v();
        boolean c = m2.c.a(this.f5859e).c();
        v6.d();
        C0729iB.y((C0729iB) v6.f4561p, c);
        String str3 = c0248Bc.f4084o;
        if (str3 != null) {
            v6.d();
            C0729iB.w((C0729iB) v6.f4561p, str3);
        }
        e2.f fVar = e2.f.f12753b;
        Context context2 = this.f5859e;
        fVar.getClass();
        long a4 = e2.f.a(context2);
        if (a4 > 0) {
            v6.d();
            C0729iB.x((C0729iB) v6.f4561p, a4);
        }
        C0729iB c0729iB = (C0729iB) v6.b();
        v4.d();
        C0813kB.G((C0813kB) v4.f4561p, c0729iB);
        this.f5857a = v4;
    }

    public final void a(String str, Map map, int i4) {
        synchronized (this.f5862h) {
            if (i4 == 3) {
                try {
                    this.f5865k = true;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.f5858b.containsKey(str)) {
                if (i4 == 3) {
                    C0600fB c0600fB = (C0600fB) this.f5858b.get(str);
                    c0600fB.d();
                    C0643gB.C((C0643gB) c0600fB.f4561p, 4);
                }
                return;
            }
            C0600fB w2 = C0643gB.w();
            int i5 = i4 != 0 ? i4 != 1 ? i4 != 2 ? i4 != 3 ? 0 : 4 : 3 : 2 : 1;
            if (i5 != 0) {
                w2.d();
                C0643gB.C((C0643gB) w2.f4561p, i5);
            }
            int size = this.f5858b.size();
            w2.d();
            C0643gB.y((C0643gB) w2.f4561p, size);
            w2.d();
            C0643gB.z((C0643gB) w2.f4561p, str);
            TA v4 = VA.v();
            if (!this.f5863i.isEmpty() && map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str2 = entry.getKey() != null ? (String) entry.getKey() : "";
                    String str3 = entry.getValue() != null ? (String) entry.getValue() : "";
                    if (this.f5863i.contains(str2.toLowerCase(Locale.ENGLISH))) {
                        RA v5 = SA.v();
                        Charset charset = Mz.f6292a;
                        C0800jz c0800jz = new C0800jz(str2.getBytes(charset));
                        v5.d();
                        SA.w((SA) v5.f4561p, c0800jz);
                        C0800jz c0800jz2 = new C0800jz(str3.getBytes(charset));
                        v5.d();
                        SA.x((SA) v5.f4561p, c0800jz2);
                        SA sa = (SA) v5.b();
                        v4.d();
                        VA.w((VA) v4.f4561p, sa);
                    }
                }
            }
            VA va = (VA) v4.b();
            w2.d();
            C0643gB.A((C0643gB) w2.f4561p, va);
            this.f5858b.put(str, w2);
        }
    }

    public final void b() {
        synchronized (this.f5862h) {
            this.f5858b.keySet();
            Pu h02 = Bs.h0(Collections.EMPTY_MAP);
            C0512d8 c0512d8 = new C0512d8(3, this);
            C0260Dc c0260Dc = AbstractC0266Ec.f4900f;
            C1267uu n02 = Bs.n0(h02, c0512d8, c0260Dc);
            InterfaceFutureC0239a o02 = Bs.o0(n02, 10L, TimeUnit.SECONDS, AbstractC0266Ec.d);
            n02.a(new Nu(0, n02, new C0874ln(17, o02)), c0260Dc);
            f5856l.add(o02);
        }
    }

    public final void c(String str) {
        synchronized (this.f5862h) {
            try {
                if (str == null) {
                    KA ka = this.f5857a;
                    ka.d();
                    C0813kB.E((C0813kB) ka.f4561p);
                } else {
                    KA ka2 = this.f5857a;
                    ka2.d();
                    C0813kB.D((C0813kB) ka2.f4561p, str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
