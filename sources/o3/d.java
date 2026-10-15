package o3;

import java.util.concurrent.ExecutorService;
import k.o;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f14349o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ f f14350p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Runnable f14351q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ o f14352r;

    public /* synthetic */ d(f fVar, Runnable runnable, o oVar, int i4) {
        this.f14349o = i4;
        this.f14350p = fVar;
        this.f14351q = runnable;
        this.f14352r = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14349o) {
            case 0:
                ExecutorService executorService = this.f14350p.f14355o;
                final int i4 = 0;
                final Runnable runnable = this.f14351q;
                final o oVar = this.f14352r;
                executorService.execute(new Runnable() { // from class: o3.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i4) {
                            case 0:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e4) {
                                    ((h) oVar.f13452p).k(e4);
                                    throw e4;
                                }
                            case 1:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e5) {
                                    ((h) oVar.f13452p).k(e5);
                                    return;
                                }
                            default:
                                Runnable runnable2 = runnable;
                                h hVar = (h) oVar.f13452p;
                                try {
                                    runnable2.run();
                                    hVar.j(null);
                                    return;
                                } catch (Exception e6) {
                                    hVar.k(e6);
                                    return;
                                }
                        }
                    }
                });
                return;
            case 1:
                ExecutorService executorService2 = this.f14350p.f14355o;
                final int i5 = 2;
                final Runnable runnable2 = this.f14351q;
                final o oVar2 = this.f14352r;
                executorService2.execute(new Runnable() { // from class: o3.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i5) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e4) {
                                    ((h) oVar2.f13452p).k(e4);
                                    throw e4;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e5) {
                                    ((h) oVar2.f13452p).k(e5);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable2;
                                h hVar = (h) oVar2.f13452p;
                                try {
                                    runnable22.run();
                                    hVar.j(null);
                                    return;
                                } catch (Exception e6) {
                                    hVar.k(e6);
                                    return;
                                }
                        }
                    }
                });
                return;
            default:
                ExecutorService executorService3 = this.f14350p.f14355o;
                final int i6 = 1;
                final Runnable runnable3 = this.f14351q;
                final o oVar3 = this.f14352r;
                executorService3.execute(new Runnable() { // from class: o3.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i6) {
                            case 0:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e4) {
                                    ((h) oVar3.f13452p).k(e4);
                                    throw e4;
                                }
                            case 1:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e5) {
                                    ((h) oVar3.f13452p).k(e5);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable3;
                                h hVar = (h) oVar3.f13452p;
                                try {
                                    runnable22.run();
                                    hVar.j(null);
                                    return;
                                } catch (Exception e6) {
                                    hVar.k(e6);
                                    return;
                                }
                        }
                    }
                });
                return;
        }
    }
}
