package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseIntArray;
import java.util.ArrayDeque;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.kF, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0817kF implements InterfaceC0378a2 {

    /* renamed from: o, reason: collision with root package name */
    public int f9284o;

    /* renamed from: p, reason: collision with root package name */
    public final Object f9285p;

    /* renamed from: q, reason: collision with root package name */
    public final Object f9286q;

    /* renamed from: r, reason: collision with root package name */
    public final Object f9287r;

    /* renamed from: s, reason: collision with root package name */
    public Object f9288s;

    public C0817kF(M m4, M3 m32, byte[] bArr, Y[] yArr, int i4) {
        this.f9285p = m4;
        this.f9286q = m32;
        this.f9287r = bArr;
        this.f9288s = yArr;
        this.f9284o = i4;
    }

    public C0817kF(Op op, Sp sp, C1384xi c1384xi) {
        this.f9284o = 1;
        this.f9285p = op;
        this.f9286q = c1384xi;
        this.f9287r = new ArrayDeque();
        sp.f7010a = new C1384xi(23, this);
    }

    public C0817kF(C0506d2 c0506d2, int i4) {
        this.f9288s = c0506d2;
        this.f9285p = new X(5, new byte[5]);
        this.f9286q = new SparseArray();
        this.f9287r = new SparseIntArray();
        this.f9284o = i4;
    }

    public C0817kF(KC[] kcArr, InterfaceC0690hF[] interfaceC0690hFArr, C0486cj c0486cj, C0733iF c0733iF) {
        this.f9285p = kcArr;
        this.f9286q = (InterfaceC0690hF[]) interfaceC0690hFArr.clone();
        this.f9287r = c0486cj;
        this.f9288s = c0733iF;
        this.f9284o = kcArr.length;
    }

    public boolean a(C0817kF c0817kF, int i4) {
        return c0817kF != null && AbstractC0751is.c(((KC[]) this.f9285p)[i4], ((KC[]) c0817kF.f9285p)[i4]) && AbstractC0751is.c(((InterfaceC0690hF[]) this.f9286q)[i4], ((InterfaceC0690hF[]) c0817kF.f9286q)[i4]);
    }

    public boolean b(int i4) {
        return ((KC[]) this.f9285p)[i4] != null;
    }

    public synchronized void c(C0450bp c0450bp) {
        ((ArrayDeque) this.f9287r).add(c0450bp);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0378a2
    public void d(Sr sr, D d, C0591f2 c0591f2) {
    }

    public synchronized void e() {
        Zp zp;
        if (((Boolean) O1.r.d.c.a(AbstractC1066q6.x5)).booleanValue() && !N1.n.f1204A.f1209g.c().x().f9740j) {
            ((ArrayDeque) this.f9287r).clear();
            return;
        }
        if (g()) {
            while (!((ArrayDeque) this.f9287r).isEmpty()) {
                C0450bp c0450bp = (C0450bp) ((ArrayDeque) this.f9287r).pollFirst();
                if (c0450bp == null || ((zp = c0450bp.f8290g) != null && ((Op) this.f9285p).A(zp))) {
                    Xq xq = new Xq((Op) this.f9285p, (C1384xi) this.f9286q, c0450bp);
                    this.f9288s = xq;
                    xq.b(new C0831kn(this, c0450bp, 1, false));
                    return;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0115, code lost:
    
        if (r33.m() == 21) goto L25;
     */
    @Override // com.google.android.gms.internal.ads.InterfaceC0378a2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void f(com.google.android.gms.internal.ads.C1134rq r33) {
        /*
            Method dump skipped, instructions count: 836
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C0817kF.f(com.google.android.gms.internal.ads.rq):void");
    }

    public synchronized boolean g() {
        return ((Xq) this.f9288s) == null;
    }
}
