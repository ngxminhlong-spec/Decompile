package p0;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.Jn;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import k.C1748e;
import n0.d;
import n0.n;
import o0.InterfaceC1822a;
import o0.InterfaceC1824c;
import o0.l;
import s0.c;
import t3.g;
import w0.i;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class b implements InterfaceC1824c, s0.b, InterfaceC1822a {

    /* renamed from: w, reason: collision with root package name */
    public static final String f14376w = n.h("GreedyScheduler");

    /* renamed from: o, reason: collision with root package name */
    public final Context f14377o;

    /* renamed from: p, reason: collision with root package name */
    public final l f14378p;

    /* renamed from: q, reason: collision with root package name */
    public final c f14379q;

    /* renamed from: s, reason: collision with root package name */
    public final C1902a f14381s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f14382t;

    /* renamed from: v, reason: collision with root package name */
    public Boolean f14384v;

    /* renamed from: r, reason: collision with root package name */
    public final HashSet f14380r = new HashSet();

    /* renamed from: u, reason: collision with root package name */
    public final Object f14383u = new Object();

    public b(Context context, n0.c cVar, g gVar, l lVar) {
        this.f14377o = context;
        this.f14378p = lVar;
        this.f14379q = new c(context, gVar, this);
        this.f14381s = new C1902a(this, cVar.f14075e);
    }

    @Override // o0.InterfaceC1822a
    public final void a(String str, boolean z4) {
        synchronized (this.f14383u) {
            try {
                Iterator it = this.f14380r.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    i iVar = (i) it.next();
                    if (iVar.f15115a.equals(str)) {
                        n.d().a(f14376w, "Stopping tracking for " + str, new Throwable[0]);
                        this.f14380r.remove(iVar);
                        this.f14379q.c(this.f14380r);
                        break;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // o0.InterfaceC1824c
    public final void b(String str) {
        Runnable runnable;
        Boolean bool = this.f14384v;
        l lVar = this.f14378p;
        if (bool == null) {
            this.f14384v = Boolean.valueOf(x0.i.a(this.f14377o, lVar.f14174m));
        }
        boolean booleanValue = this.f14384v.booleanValue();
        String str2 = f14376w;
        if (!booleanValue) {
            n.d().e(str2, "Ignoring schedule request in non-main process", new Throwable[0]);
            return;
        }
        if (!this.f14382t) {
            lVar.f14178q.b(this);
            this.f14382t = true;
        }
        n.d().a(str2, n0.a.k("Cancelling work ID ", str), new Throwable[0]);
        C1902a c1902a = this.f14381s;
        if (c1902a != null && (runnable = (Runnable) c1902a.c.remove(str)) != null) {
            ((Handler) c1902a.f14375b.f13386p).removeCallbacks(runnable);
        }
        lVar.S(str);
    }

    @Override // s0.b
    public final void c(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            n.d().a(f14376w, n0.a.k("Constraints not met: Cancelling work ID ", str), new Throwable[0]);
            this.f14378p.S(str);
        }
    }

    @Override // o0.InterfaceC1824c
    public final void d(i... iVarArr) {
        if (this.f14384v == null) {
            this.f14384v = Boolean.valueOf(x0.i.a(this.f14377o, this.f14378p.f14174m));
        }
        if (!this.f14384v.booleanValue()) {
            n.d().e(f14376w, "Ignoring schedule request in a secondary process", new Throwable[0]);
            return;
        }
        if (!this.f14382t) {
            this.f14378p.f14178q.b(this);
            this.f14382t = true;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (i iVar : iVarArr) {
            long a4 = iVar.a();
            long currentTimeMillis = System.currentTimeMillis();
            if (iVar.f15116b == 1) {
                if (currentTimeMillis < a4) {
                    C1902a c1902a = this.f14381s;
                    if (c1902a != null) {
                        C1748e c1748e = c1902a.f14375b;
                        HashMap hashMap = c1902a.c;
                        Runnable runnable = (Runnable) hashMap.remove(iVar.f15115a);
                        if (runnable != null) {
                            ((Handler) c1748e.f13386p).removeCallbacks(runnable);
                        }
                        Jn jn = new Jn(c1902a, iVar, 22, false);
                        hashMap.put(iVar.f15115a, jn);
                        ((Handler) c1748e.f13386p).postDelayed(jn, iVar.a() - System.currentTimeMillis());
                    }
                } else if (iVar.b()) {
                    int i4 = Build.VERSION.SDK_INT;
                    d dVar = iVar.f15122j;
                    if (dVar.c) {
                        n.d().a(f14376w, "Ignoring WorkSpec " + iVar + ", Requires device idle.", new Throwable[0]);
                    } else if (i4 < 24 || dVar.f14085h.f14088a.size() <= 0) {
                        hashSet.add(iVar);
                        hashSet2.add(iVar.f15115a);
                    } else {
                        n.d().a(f14376w, "Ignoring WorkSpec " + iVar + ", Requires ContentUri triggers.", new Throwable[0]);
                    }
                } else {
                    n.d().a(f14376w, n0.a.k("Starting work for ", iVar.f15115a), new Throwable[0]);
                    this.f14378p.R(iVar.f15115a, null);
                }
            }
        }
        synchronized (this.f14383u) {
            try {
                if (!hashSet.isEmpty()) {
                    n.d().a(f14376w, "Starting tracking for [" + TextUtils.join(",", hashSet2) + "]", new Throwable[0]);
                    this.f14380r.addAll(hashSet);
                    this.f14379q.c(this.f14380r);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // s0.b
    public final void e(List list) {
        ArrayList arrayList = (ArrayList) list;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            String str = (String) obj;
            n.d().a(f14376w, n0.a.k("Constraints met: Scheduling work ID ", str), new Throwable[0]);
            this.f14378p.R(str, null);
        }
    }

    @Override // o0.InterfaceC1824c
    public final boolean f() {
        return false;
    }
}
