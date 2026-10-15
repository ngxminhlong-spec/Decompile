package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class Cz implements Cloneable {

    /* renamed from: o, reason: collision with root package name */
    public final Dz f4560o;

    /* renamed from: p, reason: collision with root package name */
    public Dz f4561p;

    public Cz(Dz dz) {
        this.f4560o = dz;
        if (dz.r()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f4561p = dz.j();
    }

    public final void a(byte[] bArr, int i4, C1315vz c1315vz) {
        if (!this.f4561p.r()) {
            Dz j4 = this.f4560o.j();
            C0728iA.c.a(j4.getClass()).d(j4, this.f4561p);
            this.f4561p = j4;
        }
        try {
            C0728iA.c.a(this.f4561p.getClass()).j(this.f4561p, bArr, 0, i4, new C0544dz(c1315vz));
        } catch (Oz e4) {
            throw e4;
        } catch (IOException e5) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e5);
        } catch (IndexOutOfBoundsException unused) {
            throw Oz.f();
        }
    }

    public final Dz b() {
        Dz c = c();
        if (c.q()) {
            return c;
        }
        throw new C1112rA();
    }

    public final Dz c() {
        if (!this.f4561p.r()) {
            return this.f4561p;
        }
        Dz dz = this.f4561p;
        dz.getClass();
        C0728iA.c.a(dz.getClass()).b(dz);
        dz.n();
        return this.f4561p;
    }

    public final Object clone() {
        Cz cz = (Cz) this.f4560o.s(5, null);
        cz.f4561p = c();
        return cz;
    }

    public final void d() {
        if (this.f4561p.r()) {
            return;
        }
        Dz j4 = this.f4560o.j();
        C0728iA.c.a(j4.getClass()).d(j4, this.f4561p);
        this.f4561p = j4;
    }
}
