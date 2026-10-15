package x0;

import android.content.Context;
import androidx.work.ListenableWorker;
import z0.InterfaceC2132a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class o implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public static final String f15231u = n0.n.h("WorkForegroundRunnable");

    /* renamed from: o, reason: collision with root package name */
    public final y0.j f15232o = new Object();

    /* renamed from: p, reason: collision with root package name */
    public final Context f15233p;

    /* renamed from: q, reason: collision with root package name */
    public final w0.i f15234q;

    /* renamed from: r, reason: collision with root package name */
    public final ListenableWorker f15235r;

    /* renamed from: s, reason: collision with root package name */
    public final p f15236s;

    /* renamed from: t, reason: collision with root package name */
    public final InterfaceC2132a f15237t;

    /* JADX WARN: Type inference failed for: r0v0, types: [y0.j, java.lang.Object] */
    public o(Context context, w0.i iVar, ListenableWorker listenableWorker, p pVar, t3.g gVar) {
        this.f15233p = context;
        this.f15234q = iVar;
        this.f15235r = listenableWorker;
        this.f15236s = pVar;
        this.f15237t = gVar;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [y0.j, y0.h, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        if (!this.f15234q.f15129q || D.a.a()) {
            this.f15232o.i(null);
            return;
        }
        ?? obj = new Object();
        t3.g gVar = (t3.g) this.f15237t;
        ((A2.q) gVar.f14963q).execute(new n(this, obj, 0));
        obj.a(new n(this, obj, 1), (A2.q) gVar.f14963q);
    }
}
