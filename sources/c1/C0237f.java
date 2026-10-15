package c1;

import java.util.ArrayList;
import p1.C1912J;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: c1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0237f extends O0.b implements InterfaceC0233b {

    /* renamed from: q, reason: collision with root package name */
    public final C1912J f3552q;

    /* renamed from: r, reason: collision with root package name */
    public final C0234c f3553r;

    /* renamed from: s, reason: collision with root package name */
    public InterfaceC0235d f3554s;

    public C0237f(C1912J c1912j, C0234c c0234c) {
        this.f3552q = c1912j;
        this.f3553r = c0234c;
    }

    @Override // c1.InterfaceC0233b
    public final C1912J b() {
        return this.f3552q;
    }

    @Override // c1.InterfaceC0233b
    public final int d() {
        return this.f3553r.f3548q;
    }

    @Override // O0.c, O0.a
    public final boolean e(Boolean bool) {
        if (bool == this.f1252p) {
            return true;
        }
        this.f1252p = bool;
        this.f3554s.k(bool.booleanValue());
        return true;
    }

    @Override // c1.InterfaceC0233b
    public final boolean f() {
        return this.f3553r.f3549r;
    }

    @Override // c1.InterfaceC0233b
    public final String getId() {
        return this.f3553r.f3546o;
    }

    @Override // c1.InterfaceC0233b
    public final int getPosition() {
        return this.f3553r.f3547p;
    }

    public final void h(ArrayList arrayList) {
        C1912J c1912j = this.f3552q;
        c1912j.t(arrayList);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(c1912j);
        arrayList2.add(this);
        arrayList.add(new E0.b(arrayList2));
    }

    public final void j(ArrayList arrayList) {
        this.f3552q.u(arrayList);
        arrayList.add(new C0236e(this, this.f3554s));
    }
}
