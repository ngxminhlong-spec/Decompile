package v2;

import android.os.Bundle;
import android.os.SystemClock;
import h2.y;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import r.i;
import x2.C0;
import x2.C2064b0;
import x2.C2066c0;
import x2.C2103v0;
import x2.C2104w;
import x2.C2106x;
import x2.C2111z0;
import x2.K;
import x2.Y0;
import x2.b1;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: v2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2027a extends AbstractC2029c {

    /* renamed from: a, reason: collision with root package name */
    public final C2066c0 f15088a;

    /* renamed from: b, reason: collision with root package name */
    public final C2103v0 f15089b;

    public C2027a(C2066c0 c2066c0) {
        y.i(c2066c0);
        this.f15088a = c2066c0;
        C2103v0 c2103v0 = c2066c0.f15575p;
        C2066c0.h(c2103v0);
        this.f15089b = c2103v0;
    }

    @Override // x2.InterfaceC2105w0
    public final void V(String str) {
        C2066c0 c2066c0 = this.f15088a;
        C2104w k3 = c2066c0.k();
        c2066c0.f15573n.getClass();
        k3.i(str, SystemClock.elapsedRealtime());
    }

    @Override // x2.InterfaceC2105w0
    public final void a(String str, String str2, Bundle bundle) {
        C2103v0 c2103v0 = this.f15088a.f15575p;
        C2066c0.h(c2103v0);
        c2103v0.j(str, str2, bundle);
    }

    @Override // x2.InterfaceC2105w0
    public final List b(String str, String str2) {
        C2103v0 c2103v0 = this.f15089b;
        C2066c0 c2066c0 = (C2066c0) c2103v0.f1719a;
        C2064b0 c2064b0 = c2066c0.f15569j;
        K k3 = c2066c0.f15568i;
        C2066c0.i(c2064b0);
        if (c2064b0.q()) {
            C2066c0.i(k3);
            k3.f15394f.a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        if (C2106x.a()) {
            C2066c0.i(k3);
            k3.f15394f.a("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        C2064b0 c2064b02 = c2066c0.f15569j;
        C2066c0.i(c2064b02);
        c2064b02.l(atomicReference, 5000L, "get conditional user properties", new J1.a(c2103v0, atomicReference, str, str2, 12, false));
        List list = (List) atomicReference.get();
        if (list != null) {
            return b1.p(list);
        }
        C2066c0.i(k3);
        k3.f15394f.b(null, "Timed out waiting for get conditional user properties");
        return new ArrayList();
    }

    @Override // x2.InterfaceC2105w0
    public final long c() {
        b1 b1Var = this.f15088a.f15571l;
        C2066c0.g(b1Var);
        return b1Var.i0();
    }

    /* JADX WARN: Type inference failed for: r10v2, types: [java.util.Map, r.i] */
    @Override // x2.InterfaceC2105w0
    public final Map d(String str, String str2, boolean z4) {
        C2103v0 c2103v0 = this.f15089b;
        C2066c0 c2066c0 = (C2066c0) c2103v0.f1719a;
        C2064b0 c2064b0 = c2066c0.f15569j;
        K k3 = c2066c0.f15568i;
        C2066c0.i(c2064b0);
        if (c2064b0.q()) {
            C2066c0.i(k3);
            k3.f15394f.a("Cannot get user properties from analytics worker thread");
            return Collections.EMPTY_MAP;
        }
        if (C2106x.a()) {
            C2066c0.i(k3);
            k3.f15394f.a("Cannot get user properties from main thread");
            return Collections.EMPTY_MAP;
        }
        AtomicReference atomicReference = new AtomicReference();
        C2064b0 c2064b02 = c2066c0.f15569j;
        C2066c0.i(c2064b02);
        c2064b02.l(atomicReference, 5000L, "get user properties", new androidx.fragment.app.y(c2103v0, atomicReference, str, str2, z4, 1));
        List<Y0> list = (List) atomicReference.get();
        if (list == null) {
            C2066c0.i(k3);
            k3.f15394f.b(Boolean.valueOf(z4), "Timed out waiting for handle get user properties, includeInternal");
            return Collections.EMPTY_MAP;
        }
        ?? iVar = new i(list.size());
        for (Y0 y02 : list) {
            Object h4 = y02.h();
            if (h4 != null) {
                iVar.put(y02.f15508p, h4);
            }
        }
        return iVar;
    }

    @Override // x2.InterfaceC2105w0
    public final void e(Bundle bundle) {
        C2103v0 c2103v0 = this.f15089b;
        ((C2066c0) c2103v0.f1719a).f15573n.getClass();
        c2103v0.q(bundle, System.currentTimeMillis());
    }

    @Override // x2.InterfaceC2105w0
    public final String f() {
        return this.f15089b.A();
    }

    @Override // x2.InterfaceC2105w0
    public final String g() {
        C0 c02 = ((C2066c0) this.f15089b.f1719a).f15574o;
        C2066c0.h(c02);
        C2111z0 c2111z0 = c02.c;
        if (c2111z0 != null) {
            return c2111z0.f15862b;
        }
        return null;
    }

    @Override // x2.InterfaceC2105w0
    public final void h(String str, String str2, Bundle bundle) {
        C2103v0 c2103v0 = this.f15089b;
        ((C2066c0) c2103v0.f1719a).f15573n.getClass();
        c2103v0.l(str, str2, bundle, true, true, System.currentTimeMillis());
    }

    @Override // x2.InterfaceC2105w0
    public final void i(String str) {
        C2066c0 c2066c0 = this.f15088a;
        C2104w k3 = c2066c0.k();
        c2066c0.f15573n.getClass();
        k3.h(str, SystemClock.elapsedRealtime());
    }

    @Override // x2.InterfaceC2105w0
    public final String j() {
        C0 c02 = ((C2066c0) this.f15089b.f1719a).f15574o;
        C2066c0.h(c02);
        C2111z0 c2111z0 = c02.c;
        if (c2111z0 != null) {
            return c2111z0.f15861a;
        }
        return null;
    }

    @Override // x2.InterfaceC2105w0
    public final String k() {
        return this.f15089b.A();
    }

    @Override // x2.InterfaceC2105w0
    public final int o(String str) {
        C2103v0 c2103v0 = this.f15089b;
        c2103v0.getClass();
        y.e(str);
        ((C2066c0) c2103v0.f1719a).getClass();
        return 25;
    }
}
