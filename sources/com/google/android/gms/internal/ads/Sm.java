package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Sm implements Mu {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f7000o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Ap f7001p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C1434yp f7002q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ String f7003r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Nq f7004s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Ep f7005t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Um f7006u;

    public Sm(Um um, long j4, Ap ap, C1434yp c1434yp, String str, Nq nq, Ep ep) {
        this.f7006u = um;
        this.f7000o = j4;
        this.f7001p = ap;
        this.f7002q = c1434yp;
        this.f7003r = str;
        this.f7004s = nq;
        this.f7005t = ep;
    }

    @Override // com.google.android.gms.internal.ads.Mu
    /* renamed from: r */
    public final void mo4r(Object obj) {
        long j4;
        this.f7006u.f7176a.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f7000o;
        synchronized (this.f7006u) {
            try {
                Um um = this.f7006u;
                if (um.f7178e) {
                    um.f7177b.s(this.f7001p, this.f7002q, 0, null, elapsedRealtime);
                    j4 = elapsedRealtime;
                } else {
                    j4 = elapsedRealtime;
                }
                Um um2 = this.f7006u;
                if (um2.f7180g) {
                    return;
                }
                if (Um.h(um2, this.f7002q)) {
                    ((Tm) this.f7006u.d.get(this.f7002q)).d = j4;
                } else {
                    LinkedHashMap linkedHashMap = this.f7006u.d;
                    C1434yp c1434yp = this.f7002q;
                    linkedHashMap.put(c1434yp, new Tm(this.f7003r, c1434yp.f11509f0, 0, j4, null));
                }
                this.f7006u.f7179f.d(this.f7002q, j4, null, true);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0063 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.Mu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y(java.lang.Throwable r13) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.Sm.y(java.lang.Throwable):void");
    }
}
