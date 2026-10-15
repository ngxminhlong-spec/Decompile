package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.pE, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1031pE extends AbstractC0773jE {

    /* renamed from: k, reason: collision with root package name */
    public final AbstractC0560eE f9957k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f9958l;

    /* renamed from: m, reason: collision with root package name */
    public final Rg f9959m;

    /* renamed from: n, reason: collision with root package name */
    public final C1210tg f9960n;

    /* renamed from: o, reason: collision with root package name */
    public C0945nE f9961o;

    /* renamed from: p, reason: collision with root package name */
    public C0902mE f9962p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f9963q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f9964r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f9965s;

    public C1031pE(AbstractC0560eE abstractC0560eE, boolean z4) {
        boolean z5;
        this.f9957k = abstractC0560eE;
        if (z4) {
            abstractC0560eE.q();
            z5 = true;
        } else {
            z5 = false;
        }
        this.f9958l = z5;
        this.f9959m = new Rg();
        this.f9960n = new C1210tg();
        abstractC0560eE.d();
        this.f9961o = new C0945nE(new C0988oE(abstractC0560eE.c()), Rg.f6814n, C0945nE.f9728e);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0560eE
    public final void a(InterfaceC1159sE interfaceC1159sE) {
        C0902mE c0902mE = (C0902mE) interfaceC1159sE;
        InterfaceC1159sE interfaceC1159sE2 = c0902mE.f9608r;
        if (interfaceC1159sE2 != null) {
            AbstractC0560eE abstractC0560eE = c0902mE.f9607q;
            abstractC0560eE.getClass();
            abstractC0560eE.a(interfaceC1159sE2);
        }
        if (interfaceC1159sE == this.f9962p) {
            this.f9962p = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0560eE
    public final Z9 c() {
        return this.f9957k.c();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0560eE
    public final void d() {
        this.f9957k.d();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0560eE
    public final void j(NB nb) {
        this.f9146j = nb;
        this.f9145i = AbstractC0751is.y();
        if (this.f9958l) {
            return;
        }
        this.f9963q = true;
        t(null, this.f9957k);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0773jE, com.google.android.gms.internal.ads.AbstractC0560eE
    public final void m() {
        this.f9964r = false;
        this.f9963q = false;
        super.m();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0560eE
    public final void p(Z9 z9) {
        if (this.f9965s) {
            C0945nE c0945nE = this.f9961o;
            this.f9961o = new C0945nE(new IC(this.f9961o.f9283b, z9), c0945nE.c, c0945nE.d);
        } else {
            this.f9961o = new C0945nE(new C0988oE(z9), Rg.f6814n, C0945nE.f9728e);
        }
        this.f9957k.p(z9);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0560eE
    public final void q() {
        this.f9957k.q();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0560eE
    public final void r() {
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008e  */
    @Override // com.google.android.gms.internal.ads.AbstractC0773jE
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s(java.lang.Object r13, com.google.android.gms.internal.ads.AbstractC0560eE r14, com.google.android.gms.internal.ads.AbstractC0484ch r15) {
        /*
            r12 = this;
            r0 = r15
            r1 = r13
            java.lang.Void r1 = (java.lang.Void) r1
            boolean r1 = r12.f9964r
            r6 = 0
            if (r1 == 0) goto L21
            com.google.android.gms.internal.ads.nE r1 = r12.f9961o
            java.lang.Object r2 = r1.c
            java.lang.Object r1 = r1.d
            com.google.android.gms.internal.ads.nE r3 = new com.google.android.gms.internal.ads.nE
            r3.<init>(r15, r2, r1)
            r12.f9961o = r3
            com.google.android.gms.internal.ads.mE r0 = r12.f9962p
            if (r0 == 0) goto Lb6
            long r0 = r0.f9610t
            r12.y(r0)
            goto Lb6
        L21:
            boolean r1 = r15.o()
            if (r1 == 0) goto L44
            boolean r1 = r12.f9965s
            if (r1 == 0) goto L37
            com.google.android.gms.internal.ads.nE r1 = r12.f9961o
            java.lang.Object r2 = r1.c
            java.lang.Object r1 = r1.d
            com.google.android.gms.internal.ads.nE r3 = new com.google.android.gms.internal.ads.nE
            r3.<init>(r15, r2, r1)
            goto L40
        L37:
            java.lang.Object r1 = com.google.android.gms.internal.ads.Rg.f6814n
            java.lang.Object r2 = com.google.android.gms.internal.ads.C0945nE.f9728e
            com.google.android.gms.internal.ads.nE r3 = new com.google.android.gms.internal.ads.nE
            r3.<init>(r15, r1, r2)
        L40:
            r12.f9961o = r3
            goto Lb6
        L44:
            r1 = 0
            com.google.android.gms.internal.ads.Rg r2 = r12.f9959m
            r3 = 0
            r15.e(r1, r2, r3)
            java.lang.Object r7 = r2.f6816a
            com.google.android.gms.internal.ads.mE r5 = r12.f9962p
            if (r5 == 0) goto L6a
            long r8 = r5.f9606p
            com.google.android.gms.internal.ads.nE r10 = r12.f9961o
            com.google.android.gms.internal.ads.tE r5 = r5.f9605o
            java.lang.Object r5 = r5.f10688a
            com.google.android.gms.internal.ads.tg r11 = r12.f9960n
            r10.n(r5, r11)
            com.google.android.gms.internal.ads.nE r5 = r12.f9961o
            r5.e(r1, r2, r3)
            int r1 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r1 == 0) goto L6a
            r4 = r8
            goto L6b
        L6a:
            r4 = r3
        L6b:
            com.google.android.gms.internal.ads.tg r2 = r12.f9960n
            r3 = 0
            com.google.android.gms.internal.ads.Rg r1 = r12.f9959m
            android.util.Pair r1 = r0.l(r1, r2, r3, r4)
            java.lang.Object r2 = r1.first
            java.lang.Object r1 = r1.second
            java.lang.Long r1 = (java.lang.Long) r1
            long r3 = r1.longValue()
            boolean r1 = r12.f9965s
            if (r1 == 0) goto L8e
            com.google.android.gms.internal.ads.nE r1 = r12.f9961o
            java.lang.Object r2 = r1.c
            java.lang.Object r1 = r1.d
            com.google.android.gms.internal.ads.nE r5 = new com.google.android.gms.internal.ads.nE
            r5.<init>(r15, r2, r1)
            goto L93
        L8e:
            com.google.android.gms.internal.ads.nE r5 = new com.google.android.gms.internal.ads.nE
            r5.<init>(r15, r7, r2)
        L93:
            r12.f9961o = r5
            com.google.android.gms.internal.ads.mE r0 = r12.f9962p
            if (r0 == 0) goto Lb6
            r12.y(r3)
            com.google.android.gms.internal.ads.tE r0 = r0.f9605o
            java.lang.Object r1 = r0.f10688a
            com.google.android.gms.internal.ads.nE r2 = r12.f9961o
            java.lang.Object r2 = r2.d
            if (r2 == 0) goto Lb2
            java.lang.Object r2 = com.google.android.gms.internal.ads.C0945nE.f9728e
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto Lb2
            com.google.android.gms.internal.ads.nE r1 = r12.f9961o
            java.lang.Object r1 = r1.d
        Lb2:
            com.google.android.gms.internal.ads.tE r6 = r0.a(r1)
        Lb6:
            r0 = 1
            r12.f9965s = r0
            r12.f9964r = r0
            com.google.android.gms.internal.ads.nE r0 = r12.f9961o
            r12.k(r0)
            if (r6 == 0) goto Lca
            com.google.android.gms.internal.ads.mE r0 = r12.f9962p
            r0.getClass()
            r0.l(r6)
        Lca:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1031pE.s(java.lang.Object, com.google.android.gms.internal.ads.eE, com.google.android.gms.internal.ads.ch):void");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0773jE
    public final /* bridge */ /* synthetic */ void u(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0773jE
    public final /* synthetic */ void v(long j4, Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0773jE
    public final C1202tE w(Object obj, C1202tE c1202tE) {
        Object obj2 = this.f9961o.d;
        Object obj3 = c1202tE.f10688a;
        if (obj2 != null && obj2.equals(obj3)) {
            obj3 = C0945nE.f9728e;
        }
        return c1202tE.a(obj3);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0560eE
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public final C0902mE b(C1202tE c1202tE, C1058pz c1058pz, long j4) {
        C0902mE c0902mE = new C0902mE(c1202tE, c1058pz, j4);
        Zf.X(c0902mE.f9607q == null);
        AbstractC0560eE abstractC0560eE = this.f9957k;
        c0902mE.f9607q = abstractC0560eE;
        if (!this.f9964r) {
            this.f9962p = c0902mE;
            if (!this.f9963q) {
                this.f9963q = true;
                t(null, abstractC0560eE);
            }
            return c0902mE;
        }
        Object obj = c1202tE.f10688a;
        if (this.f9961o.d != null && obj.equals(C0945nE.f9728e)) {
            obj = this.f9961o.d;
        }
        c0902mE.l(c1202tE.a(obj));
        return c0902mE;
    }

    public final void y(long j4) {
        C0902mE c0902mE = this.f9962p;
        int a4 = this.f9961o.a(c0902mE.f9605o.f10688a);
        if (a4 == -1) {
            return;
        }
        C0945nE c0945nE = this.f9961o;
        C1210tg c1210tg = this.f9960n;
        c0945nE.d(a4, c1210tg, false);
        long j5 = c1210tg.d;
        if (j5 != -9223372036854775807L && j4 >= j5) {
            j4 = Math.max(0L, j5 - 1);
        }
        c0902mE.f9610t = j4;
    }
}
