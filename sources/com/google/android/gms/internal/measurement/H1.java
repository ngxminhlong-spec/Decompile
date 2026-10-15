package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class H1 implements Cloneable {

    /* renamed from: o, reason: collision with root package name */
    public final I1 f11738o;

    /* renamed from: p, reason: collision with root package name */
    public I1 f11739p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f11740q = false;

    public H1(I1 i12) {
        this.f11738o = i12;
        this.f11739p = (I1) i12.k(4);
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final H1 clone() {
        H1 h12 = (H1) this.f11738o.k(5);
        h12.b(e());
        return h12;
    }

    public final void b(I1 i12) {
        if (this.f11740q) {
            f();
            this.f11740q = false;
        }
        I1 i13 = this.f11739p;
        C1536j2.c.a(i13.getClass()).g(i13, i12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [com.google.android.gms.internal.ads.dz, java.lang.Object] */
    public final void c(byte[] bArr, int i4, A1 a12) {
        if (this.f11740q) {
            f();
            this.f11740q = false;
        }
        try {
            InterfaceC1549m2 a4 = C1536j2.c.a(this.f11739p.getClass());
            I1 i12 = this.f11739p;
            ?? obj = new Object();
            a12.getClass();
            a4.d(i12, bArr, 0, i4, obj);
        } catch (Q1 e4) {
            throw e4;
        } catch (IOException e5) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e5);
        } catch (IndexOutOfBoundsException unused) {
            throw Q1.c();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0026, code lost:
    
        if (r1 != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.measurement.I1 d() {
        /*
            r3 = this;
            com.google.android.gms.internal.measurement.I1 r0 = r3.e()
            r1 = 1
            java.lang.Object r2 = r0.k(r1)
            java.lang.Byte r2 = (java.lang.Byte) r2
            byte r2 = r2.byteValue()
            if (r2 != r1) goto L12
            goto L28
        L12:
            if (r2 == 0) goto L29
            com.google.android.gms.internal.measurement.j2 r1 = com.google.android.gms.internal.measurement.C1536j2.c
            java.lang.Class r2 = r0.getClass()
            com.google.android.gms.internal.measurement.m2 r1 = r1.a(r2)
            boolean r1 = r1.c(r0)
            r2 = 2
            r0.k(r2)
            if (r1 == 0) goto L29
        L28:
            return r0
        L29:
            J3.b r0 = new J3.b
            java.lang.String r1 = "Message was missing required fields.  (Lite runtime could not determine which fields were missing)."
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.H1.d():com.google.android.gms.internal.measurement.I1");
    }

    public final I1 e() {
        if (this.f11740q) {
            return this.f11739p;
        }
        I1 i12 = this.f11739p;
        C1536j2.c.a(i12.getClass()).b(i12);
        this.f11740q = true;
        return this.f11739p;
    }

    public final void f() {
        I1 i12 = (I1) this.f11739p.k(4);
        C1536j2.c.a(i12.getClass()).g(i12, this.f11739p);
        this.f11739p = i12;
    }
}
