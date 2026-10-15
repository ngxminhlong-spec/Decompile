package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.aC, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0388aC implements Ls, InterfaceC1132ro, ME {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f8086o;

    /* renamed from: p, reason: collision with root package name */
    public final Object f8087p;

    public C0388aC() {
        this.f8086o = 8;
        this.f8087p = new CopyOnWriteArrayList();
    }

    public /* synthetic */ C0388aC(int i4, Object obj) {
        this.f8086o = i4;
        this.f8087p = obj;
    }

    public /* synthetic */ C0388aC(OC oc, C0859lE c0859lE, C1074qE c1074qE, IOException iOException, boolean z4) {
        this.f8086o = 2;
        this.f8087p = iOException;
    }

    public /* synthetic */ C0388aC(OC oc, C0976o2 c0976o2, WB wb) {
        this.f8086o = 3;
        this.f8087p = c0976o2;
    }

    public /* synthetic */ C0388aC(OC oc, Object obj, long j4) {
        this.f8086o = 4;
        this.f8087p = obj;
    }

    @Override // com.google.android.gms.internal.ads.Ls
    public Object b() {
        return (C0249Bd) this.f8087p;
    }

    @Override // com.google.android.gms.internal.ads.ME
    public long c() {
        long j4 = Long.MAX_VALUE;
        for (ME me : (ME[]) this.f8087p) {
            long c = me.c();
            if (c != Long.MIN_VALUE) {
                j4 = Math.min(j4, c);
            }
        }
        if (j4 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j4;
    }

    @Override // com.google.android.gms.internal.ads.ME
    public void d(long j4) {
        for (ME me : (ME[]) this.f8087p) {
            me.d(j4);
        }
    }

    @Override // com.google.android.gms.internal.ads.ME
    public long e() {
        long j4 = Long.MAX_VALUE;
        for (ME me : (ME[]) this.f8087p) {
            long e4 = me.e();
            if (e4 != Long.MIN_VALUE) {
                j4 = Math.min(j4, e4);
            }
        }
        if (j4 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j4;
    }

    @Override // com.google.android.gms.internal.ads.ME
    public boolean k(C1200tC c1200tC) {
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7 = false;
        do {
            long e4 = e();
            if (e4 == Long.MIN_VALUE) {
                return z7;
            }
            ME[] meArr = (ME[]) this.f8087p;
            int length = meArr.length;
            int i4 = 0;
            z4 = false;
            while (i4 < length) {
                ME me = meArr[i4];
                long e5 = me.e();
                if (e5 != Long.MIN_VALUE) {
                    z5 = z7;
                    if (e5 <= c1200tC.f10679a) {
                        z6 = true;
                        if (e5 != e4 || z6) {
                            z4 |= me.k(c1200tC);
                        }
                        i4++;
                        z7 = z5;
                    }
                } else {
                    z5 = z7;
                }
                z6 = false;
                if (e5 != e4) {
                }
                z4 |= me.k(c1200tC);
                i4++;
                z7 = z5;
            }
            z7 |= z4;
        } while (z4);
        return z7;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1132ro
    /* renamed from: l */
    public void mo6l(Object obj) {
        PC pc = (PC) obj;
        switch (this.f8086o) {
            case 2:
                pc.g((IOException) this.f8087p);
                return;
            case 3:
                pc.e((C0976o2) this.f8087p);
                return;
            default:
                pc.m();
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.ME
    public boolean o() {
        for (ME me : (ME[]) this.f8087p) {
            if (me.o()) {
                return true;
            }
        }
        return false;
    }
}
