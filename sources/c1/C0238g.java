package c1;

import java.util.ArrayList;
import p1.C1912J;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: c1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0238g extends O0.c implements InterfaceC0233b {

    /* renamed from: q, reason: collision with root package name */
    public final C1912J f3555q;

    /* renamed from: r, reason: collision with root package name */
    public final C0234c f3556r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f3557s;

    public C0238g(C1912J c1912j, C0234c c0234c) {
        this.f1252p = Boolean.FALSE;
        this.f3555q = c1912j;
        this.f3556r = c0234c;
    }

    @Override // c1.InterfaceC0233b
    public final C1912J b() {
        return this.f3555q;
    }

    @Override // c1.InterfaceC0233b
    public final int d() {
        return this.f3556r.f3548q;
    }

    @Override // c1.InterfaceC0233b
    public final boolean f() {
        return this.f3556r.f3549r;
    }

    @Override // c1.InterfaceC0233b
    public final String getId() {
        return this.f3556r.f3546o;
    }

    @Override // c1.InterfaceC0233b
    public final int getPosition() {
        return this.f3556r.f3547p;
    }

    public final void h(ArrayList arrayList) {
        C1912J c1912j = this.f3555q;
        c1912j.t(arrayList);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(c1912j);
        arrayList2.add(this);
        arrayList.add(new E0.b(arrayList2));
    }

    @Override // O0.a
    public final Boolean i() {
        return Boolean.valueOf(this.f3557s);
    }

    @Override // O0.c, O0.a
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final boolean e(Boolean bool) {
        this.f1252p = bool;
        O0.a aVar = this.f1251o;
        if (aVar != null) {
            return aVar.e(bool);
        }
        return true;
    }

    public final void k(ArrayList arrayList) {
        this.f3555q.u(arrayList);
    }
}
