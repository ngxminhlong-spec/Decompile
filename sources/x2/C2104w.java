package x2;

import android.os.Bundle;
import java.util.Iterator;
import r.C1965b;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: x2.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2104w extends AbstractC2110z {

    /* renamed from: b, reason: collision with root package name */
    public final r.e f15839b;
    public final r.e c;
    public long d;

    /* JADX WARN: Type inference failed for: r2v1, types: [r.e, r.i] */
    /* JADX WARN: Type inference failed for: r2v2, types: [r.e, r.i] */
    public C2104w(C2066c0 c2066c0) {
        super(c2066c0);
        this.c = new r.i(0);
        this.f15839b = new r.i(0);
    }

    public final void h(String str, long j4) {
        C2066c0 c2066c0 = (C2066c0) this.f1719a;
        if (str == null || str.length() == 0) {
            K k3 = c2066c0.f15568i;
            C2066c0.i(k3);
            k3.f15394f.a("Ad unit id must be a non-empty string");
        } else {
            C2064b0 c2064b0 = c2066c0.f15569j;
            C2066c0.i(c2064b0);
            c2064b0.o(new RunnableC2061a(this, str, j4, 0));
        }
    }

    public final void i(String str, long j4) {
        C2066c0 c2066c0 = (C2066c0) this.f1719a;
        if (str == null || str.length() == 0) {
            K k3 = c2066c0.f15568i;
            C2066c0.i(k3);
            k3.f15394f.a("Ad unit id must be a non-empty string");
        } else {
            C2064b0 c2064b0 = c2066c0.f15569j;
            C2066c0.i(c2064b0);
            c2064b0.o(new RunnableC2061a(this, str, j4, 1));
        }
    }

    public final void j(long j4) {
        C0 c02 = ((C2066c0) this.f1719a).f15574o;
        C2066c0.h(c02);
        C2111z0 l4 = c02.l(false);
        r.e eVar = this.f15839b;
        Iterator it = ((C1965b) eVar.keySet()).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            l(str, j4 - ((Long) eVar.get(str)).longValue(), l4);
        }
        if (!eVar.isEmpty()) {
            k(j4 - this.d, l4);
        }
        m(j4);
    }

    public final void k(long j4, C2111z0 c2111z0) {
        C2066c0 c2066c0 = (C2066c0) this.f1719a;
        if (c2111z0 == null) {
            K k3 = c2066c0.f15568i;
            C2066c0.i(k3);
            k3.f15402n.a("Not logging ad exposure. No active activity");
        } else if (j4 < 1000) {
            K k4 = c2066c0.f15568i;
            C2066c0.i(k4);
            k4.f15402n.b(Long.valueOf(j4), "Not logging ad exposure. Less than 1000 ms. exposure");
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j4);
            b1.s(c2111z0, bundle, true);
            C2103v0 c2103v0 = c2066c0.f15575p;
            C2066c0.h(c2103v0);
            c2103v0.m("am", "_xa", bundle);
        }
    }

    public final void l(String str, long j4, C2111z0 c2111z0) {
        C2066c0 c2066c0 = (C2066c0) this.f1719a;
        if (c2111z0 == null) {
            K k3 = c2066c0.f15568i;
            C2066c0.i(k3);
            k3.f15402n.a("Not logging ad unit exposure. No active activity");
        } else {
            if (j4 < 1000) {
                K k4 = c2066c0.f15568i;
                C2066c0.i(k4);
                k4.f15402n.b(Long.valueOf(j4), "Not logging ad unit exposure. Less than 1000 ms. exposure");
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j4);
            b1.s(c2111z0, bundle, true);
            C2103v0 c2103v0 = c2066c0.f15575p;
            C2066c0.h(c2103v0);
            c2103v0.m("am", "_xu", bundle);
        }
    }

    public final void m(long j4) {
        r.e eVar = this.f15839b;
        Iterator it = ((C1965b) eVar.keySet()).iterator();
        while (it.hasNext()) {
            eVar.put((String) it.next(), Long.valueOf(j4));
        }
        if (eVar.isEmpty()) {
            return;
        }
        this.d = j4;
    }
}
