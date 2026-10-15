package com.google.android.gms.internal.ads;

import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.eE, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0560eE {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f8593a = new ArrayList(1);

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f8594b = new HashSet(1);
    public final C0831kn c;
    public final Qw d;

    /* renamed from: e, reason: collision with root package name */
    public Looper f8595e;

    /* renamed from: f, reason: collision with root package name */
    public AbstractC0484ch f8596f;

    /* renamed from: g, reason: collision with root package name */
    public C0474cD f8597g;

    public AbstractC0560eE() {
        Object obj = null;
        this.c = new C0831kn(new CopyOnWriteArrayList(), obj, 8, false);
        this.d = new Qw(4, new CopyOnWriteArrayList(), obj);
    }

    public abstract void a(InterfaceC1159sE interfaceC1159sE);

    public abstract InterfaceC1159sE b(C1202tE c1202tE, C1058pz c1058pz, long j4);

    public abstract Z9 c();

    public void d() {
    }

    public final void e(InterfaceC1245uE interfaceC1245uE) {
        HashSet hashSet = this.f8594b;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.remove(interfaceC1245uE);
        if (isEmpty || !hashSet.isEmpty()) {
            return;
        }
        f();
    }

    public void f() {
    }

    public final void g(InterfaceC1245uE interfaceC1245uE) {
        this.f8595e.getClass();
        HashSet hashSet = this.f8594b;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.add(interfaceC1245uE);
        if (isEmpty) {
            h();
        }
    }

    public void h() {
    }

    public final void i(InterfaceC1245uE interfaceC1245uE, NB nb, C0474cD c0474cD) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.f8595e;
        boolean z4 = true;
        if (looper != null && looper != myLooper) {
            z4 = false;
        }
        Zf.O(z4);
        this.f8597g = c0474cD;
        AbstractC0484ch abstractC0484ch = this.f8596f;
        this.f8593a.add(interfaceC1245uE);
        if (this.f8595e == null) {
            this.f8595e = myLooper;
            this.f8594b.add(interfaceC1245uE);
            j(nb);
        } else if (abstractC0484ch != null) {
            g(interfaceC1245uE);
            interfaceC1245uE.a(this, abstractC0484ch);
        }
    }

    public abstract void j(NB nb);

    public final void k(AbstractC0484ch abstractC0484ch) {
        this.f8596f = abstractC0484ch;
        ArrayList arrayList = this.f8593a;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((InterfaceC1245uE) arrayList.get(i4)).a(this, abstractC0484ch);
        }
    }

    public final void l(InterfaceC1245uE interfaceC1245uE) {
        ArrayList arrayList = this.f8593a;
        arrayList.remove(interfaceC1245uE);
        if (!arrayList.isEmpty()) {
            e(interfaceC1245uE);
            return;
        }
        this.f8595e = null;
        this.f8596f = null;
        this.f8597g = null;
        this.f8594b.clear();
        m();
    }

    public abstract void m();

    public final void n(ED ed) {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.d.f6711q;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            DD dd = (DD) it.next();
            if (dd.f4598a == ed) {
                copyOnWriteArrayList.remove(dd);
            }
        }
    }

    public final void o(InterfaceC1374xE interfaceC1374xE) {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.c.f9320q;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            C1331wE c1331wE = (C1331wE) it.next();
            if (c1331wE.f11171b == interfaceC1374xE) {
                copyOnWriteArrayList.remove(c1331wE);
            }
        }
    }

    public abstract void p(Z9 z9);

    public void q() {
    }

    public abstract void r();
}
