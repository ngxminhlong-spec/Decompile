package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.Map;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.bk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0445bk implements InterfaceC1049pq {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f8276o = 1;

    /* renamed from: p, reason: collision with root package name */
    public final Object f8277p;

    /* renamed from: q, reason: collision with root package name */
    public final Object f8278q;

    public C0445bk(Rl rl, Sl sl) {
        this.f8277p = rl;
        this.f8278q = sl;
    }

    public C0445bk(C0764j5 c0764j5, Map map) {
        this.f8277p = map;
        this.f8278q = c0764j5;
    }

    private final void a(String str) {
    }

    private final void b(String str) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1049pq
    public final void O(String str) {
        int i4 = this.f8276o;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1049pq
    public final void r(EnumC0877lq enumC0877lq, String str, Throwable th) {
        switch (this.f8276o) {
            case 0:
                Map map = (Map) this.f8277p;
                if (map.containsKey(enumC0877lq)) {
                    ((C0764j5) this.f8278q).b(((C0402ak) map.get(enumC0877lq)).c);
                    return;
                }
                return;
            default:
                Rl rl = (Rl) this.f8277p;
                if (((Boolean) O1.r.d.c.a(AbstractC1066q6.r5)).booleanValue() && EnumC0877lq.f9486s == enumC0877lq && rl.c() != 0) {
                    N1.n.f1204A.f1212j.getClass();
                    long elapsedRealtime = SystemClock.elapsedRealtime() - rl.c();
                    synchronized (rl) {
                        synchronized (rl.f6840j) {
                            rl.f6835e = elapsedRealtime;
                        }
                    }
                    return;
                }
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1049pq
    public final void u(EnumC0877lq enumC0877lq, String str) {
        switch (this.f8276o) {
            case 0:
                Map map = (Map) this.f8277p;
                if (map.containsKey(enumC0877lq)) {
                    ((C0764j5) this.f8278q).b(((C0402ak) map.get(enumC0877lq)).f8157a);
                    return;
                }
                return;
            default:
                if (((Boolean) O1.r.d.c.a(AbstractC1066q6.r5)).booleanValue()) {
                    if (EnumC0877lq.f9486s == enumC0877lq) {
                        Rl rl = (Rl) this.f8277p;
                        N1.n.f1204A.f1212j.getClass();
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        synchronized (rl) {
                            synchronized (rl.f6839i) {
                                rl.d = elapsedRealtime;
                            }
                        }
                        return;
                    }
                    if (EnumC0877lq.N == enumC0877lq || EnumC0877lq.f9485r == enumC0877lq) {
                        Rl rl2 = (Rl) this.f8277p;
                        N1.n.f1204A.f1212j.getClass();
                        rl2.e(SystemClock.elapsedRealtime());
                        Sl sl = (Sl) this.f8278q;
                        ((C0258Da) sl.f5575b).h(new N1.d(sl, ((Rl) this.f8277p).d(), 6));
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1049pq
    public final void v(EnumC0877lq enumC0877lq, String str) {
        switch (this.f8276o) {
            case 0:
                Map map = (Map) this.f8277p;
                if (map.containsKey(enumC0877lq)) {
                    ((C0764j5) this.f8278q).b(((C0402ak) map.get(enumC0877lq)).f8158b);
                    return;
                }
                return;
            default:
                Rl rl = (Rl) this.f8277p;
                if (((Boolean) O1.r.d.c.a(AbstractC1066q6.r5)).booleanValue() && EnumC0877lq.f9486s == enumC0877lq && rl.c() != 0) {
                    N1.n.f1204A.f1212j.getClass();
                    long elapsedRealtime = SystemClock.elapsedRealtime() - rl.c();
                    synchronized (rl) {
                        synchronized (rl.f6840j) {
                            rl.f6835e = elapsedRealtime;
                        }
                    }
                    return;
                }
                return;
        }
    }
}
