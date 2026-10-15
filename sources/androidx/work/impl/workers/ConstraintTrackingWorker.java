package androidx.work.impl.workers;

import A0.a;
import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import c3.InterfaceFutureC0239a;
import java.util.List;
import n0.n;
import o0.l;
import s0.b;
import y0.j;
import z0.InterfaceC2132a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class ConstraintTrackingWorker extends ListenableWorker implements b {
    public static final String y = n.h("ConstraintTrkngWrkr");

    /* renamed from: t, reason: collision with root package name */
    public final WorkerParameters f3160t;

    /* renamed from: u, reason: collision with root package name */
    public final Object f3161u;

    /* renamed from: v, reason: collision with root package name */
    public volatile boolean f3162v;

    /* renamed from: w, reason: collision with root package name */
    public final j f3163w;

    /* renamed from: x, reason: collision with root package name */
    public ListenableWorker f3164x;

    /* JADX WARN: Type inference failed for: r1v3, types: [y0.j, java.lang.Object] */
    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f3160t = workerParameters;
        this.f3161u = new Object();
        this.f3162v = false;
        this.f3163w = new Object();
    }

    @Override // s0.b
    public final void c(List list) {
        n.d().a(y, String.format("Constraints changed for %s", list), new Throwable[0]);
        synchronized (this.f3161u) {
            this.f3162v = true;
        }
    }

    @Override // s0.b
    public final void e(List list) {
    }

    @Override // androidx.work.ListenableWorker
    public final InterfaceC2132a getTaskExecutor() {
        return l.N(getApplicationContext()).f14176o;
    }

    @Override // androidx.work.ListenableWorker
    public final boolean isRunInForeground() {
        ListenableWorker listenableWorker = this.f3164x;
        return listenableWorker != null && listenableWorker.isRunInForeground();
    }

    @Override // androidx.work.ListenableWorker
    public final void onStopped() {
        super.onStopped();
        ListenableWorker listenableWorker = this.f3164x;
        if (listenableWorker == null || listenableWorker.isStopped()) {
            return;
        }
        this.f3164x.stop();
    }

    @Override // androidx.work.ListenableWorker
    public final InterfaceFutureC0239a startWork() {
        getBackgroundExecutor().execute(new a(0, this));
        return this.f3163w;
    }
}
