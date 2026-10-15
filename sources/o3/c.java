package o3;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import k.o;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements g {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f14343o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ f f14344p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Runnable f14345q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ long f14346r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f14347s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ TimeUnit f14348t;

    public /* synthetic */ c(f fVar, Runnable runnable, long j4, long j5, TimeUnit timeUnit, int i4) {
        this.f14343o = i4;
        this.f14344p = fVar;
        this.f14345q = runnable;
        this.f14346r = j4;
        this.f14347s = j5;
        this.f14348t = timeUnit;
    }

    @Override // o3.g
    public final ScheduledFuture b(o oVar) {
        switch (this.f14343o) {
            case 0:
                f fVar = this.f14344p;
                return fVar.f14356p.scheduleAtFixedRate(new d(fVar, this.f14345q, oVar, 0), this.f14346r, this.f14347s, this.f14348t);
            default:
                f fVar2 = this.f14344p;
                return fVar2.f14356p.scheduleWithFixedDelay(new d(fVar2, this.f14345q, oVar, 2), this.f14346r, this.f14347s, this.f14348t);
        }
    }
}
