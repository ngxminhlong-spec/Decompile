package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Nm {
    public final Xu c;

    /* renamed from: f, reason: collision with root package name */
    public Vm f6380f;

    /* renamed from: h, reason: collision with root package name */
    public final String f6382h;

    /* renamed from: i, reason: collision with root package name */
    public final int f6383i;

    /* renamed from: j, reason: collision with root package name */
    public final Um f6384j;

    /* renamed from: k, reason: collision with root package name */
    public C1434yp f6385k;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f6377a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f6378b = new ArrayList();
    public final ArrayList d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f6379e = new HashSet();

    /* renamed from: g, reason: collision with root package name */
    public int f6381g = Integer.MAX_VALUE;

    public Nm(Ep ep, Um um, Xu xu) {
        this.f6383i = ((Ap) ep.f4943b.f6526q).f4010p;
        this.f6384j = um;
        this.c = xu;
        this.f6382h = Ym.a(ep);
        List list = (List) ep.f4943b.f6525p;
        for (int i4 = 0; i4 < list.size(); i4++) {
            this.f6377a.put((C1434yp) list.get(i4), Integer.valueOf(i4));
        }
        this.f6378b.addAll(list);
    }

    public final synchronized C1434yp a() {
        for (int i4 = 0; i4 < this.f6378b.size(); i4++) {
            try {
                C1434yp c1434yp = (C1434yp) this.f6378b.get(i4);
                String str = c1434yp.f11535s0;
                if (!this.f6379e.contains(str)) {
                    if (!TextUtils.isEmpty(str)) {
                        this.f6379e.add(str);
                    }
                    this.d.add(c1434yp);
                    return (C1434yp) this.f6378b.remove(i4);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return null;
    }

    public final synchronized void b(C1434yp c1434yp) {
        this.d.remove(c1434yp);
        this.f6379e.remove(c1434yp.f11535s0);
        if (d() || i()) {
            return;
        }
        f();
    }

    public final synchronized void c(Vm vm, C1434yp c1434yp) {
        this.d.remove(c1434yp);
        if (d()) {
            vm.p();
            return;
        }
        Integer num = (Integer) this.f6377a.get(c1434yp);
        int intValue = num != null ? num.intValue() : Integer.MAX_VALUE;
        if (intValue > this.f6381g) {
            this.f6384j.g(c1434yp);
            return;
        }
        if (this.f6380f != null) {
            this.f6384j.g(this.f6385k);
        }
        this.f6381g = intValue;
        this.f6380f = vm;
        this.f6385k = c1434yp;
        if (i()) {
            return;
        }
        f();
    }

    public final synchronized boolean d() {
        return this.c.isDone();
    }

    public final synchronized boolean e() {
        if (!d()) {
            ArrayList arrayList = this.d;
            if (arrayList.size() < this.f6383i) {
                if (g(false)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final synchronized void f() {
        this.f6384j.d(this.f6385k);
        Vm vm = this.f6380f;
        if (vm != null) {
            this.c.f(vm);
        } else {
            this.c.g(new Xk(this.f6382h, 3));
        }
    }

    public final synchronized boolean g(boolean z4) {
        try {
            ArrayList arrayList = this.f6378b;
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                C1434yp c1434yp = (C1434yp) obj;
                Integer num = (Integer) this.f6377a.get(c1434yp);
                int intValue = num != null ? num.intValue() : Integer.MAX_VALUE;
                if (z4 || !this.f6379e.contains(c1434yp.f11535s0)) {
                    int i5 = this.f6381g;
                    if (intValue < i5) {
                        return true;
                    }
                    if (intValue > i5) {
                        break;
                    }
                }
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean h() {
        try {
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                Integer num = (Integer) this.f6377a.get((C1434yp) obj);
                if ((num != null ? num.intValue() : Integer.MAX_VALUE) < this.f6381g) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean i() {
        if (!g(true)) {
            if (!h()) {
                return false;
            }
        }
        return true;
    }
}
