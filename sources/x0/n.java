package x0;

import android.content.Context;
import androidx.work.ListenableWorker;
import java.util.UUID;
import t2.N;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class n implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f15228o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ y0.j f15229p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ o f15230q;

    public /* synthetic */ n(o oVar, y0.j jVar, int i4) {
        this.f15228o = i4;
        this.f15230q = oVar;
        this.f15229p = jVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, c3.a] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15228o) {
            case 0:
                this.f15229p.k(this.f15230q.f15235r.getForegroundInfoAsync());
                return;
            default:
                o oVar = this.f15230q;
                y0.j jVar = oVar.f15232o;
                ListenableWorker listenableWorker = oVar.f15235r;
                w0.i iVar = oVar.f15234q;
                try {
                    n0.h hVar = (n0.h) this.f15229p.get();
                    if (hVar == null) {
                        throw new IllegalStateException("Worker was marked important (" + iVar.c + ") but did not provide ForegroundInfo");
                    }
                    n0.n.d().a(o.f15231u, "Updating notification for " + iVar.c, new Throwable[0]);
                    listenableWorker.setRunInForeground(true);
                    p pVar = oVar.f15236s;
                    Context context = oVar.f15233p;
                    UUID id = listenableWorker.getId();
                    pVar.getClass();
                    ?? obj = new Object();
                    ((t3.g) pVar.f15238a).c(new N(pVar, obj, id, hVar, context, 1));
                    jVar.k(obj);
                    return;
                } catch (Throwable th) {
                    jVar.j(th);
                    return;
                }
        }
    }
}
