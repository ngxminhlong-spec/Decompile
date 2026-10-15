package com.google.android.gms.internal.ads;

import android.util.Pair;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final /* synthetic */ class BC implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f4038o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Qw f4039p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Pair f4040q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C0859lE f4041r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C1074qE f4042s;

    public /* synthetic */ BC(Qw qw, Pair pair, C0859lE c0859lE, C1074qE c1074qE, int i4) {
        this.f4038o = i4;
        this.f4039p = qw;
        this.f4040q = pair;
        this.f4041r = c0859lE;
        this.f4042s = c1074qE;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4038o) {
            case 0:
                VC vc = ((EC) this.f4039p.f6711q).f4861h;
                Pair pair = this.f4040q;
                vc.h(((Integer) pair.first).intValue(), (C1202tE) pair.second, this.f4041r, this.f4042s);
                return;
            case 1:
                VC vc2 = ((EC) this.f4039p.f6711q).f4861h;
                Pair pair2 = this.f4040q;
                vc2.c(((Integer) pair2.first).intValue(), (C1202tE) pair2.second, this.f4041r, this.f4042s);
                return;
            default:
                VC vc3 = ((EC) this.f4039p.f6711q).f4861h;
                Pair pair3 = this.f4040q;
                vc3.n(((Integer) pair3.first).intValue(), (C1202tE) pair3.second, this.f4041r, this.f4042s);
                return;
        }
    }
}
