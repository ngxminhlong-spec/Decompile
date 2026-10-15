package androidx.work;

import J1.a;
import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Network;
import android.net.Uri;
import androidx.annotation.Keep;
import c3.InterfaceFutureC0239a;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import n0.g;
import n0.h;
import n0.u;
import t2.N;
import x0.p;
import x0.q;
import z0.InterfaceC2132a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class ListenableWorker {

    /* renamed from: o, reason: collision with root package name */
    public final Context f3120o;

    /* renamed from: p, reason: collision with root package name */
    public final WorkerParameters f3121p;

    /* renamed from: q, reason: collision with root package name */
    public volatile boolean f3122q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f3123r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f3124s;

    @Keep
    @SuppressLint({"BanKeepAnnotation"})
    public ListenableWorker(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        }
        if (workerParameters == null) {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        this.f3120o = context;
        this.f3121p = workerParameters;
    }

    public final Context getApplicationContext() {
        return this.f3120o;
    }

    public Executor getBackgroundExecutor() {
        return this.f3121p.f3130f;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [y0.j, java.lang.Object, c3.a] */
    public InterfaceFutureC0239a getForegroundInfoAsync() {
        ?? obj = new Object();
        obj.j(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return obj;
    }

    public final UUID getId() {
        return this.f3121p.f3127a;
    }

    public final g getInputData() {
        return this.f3121p.f3128b;
    }

    public final Network getNetwork() {
        return (Network) this.f3121p.d.f14711r;
    }

    public final int getRunAttemptCount() {
        return this.f3121p.f3129e;
    }

    public final Set<String> getTags() {
        return this.f3121p.c;
    }

    public InterfaceC2132a getTaskExecutor() {
        return this.f3121p.f3131g;
    }

    public final List<String> getTriggeredContentAuthorities() {
        return (List) this.f3121p.d.f14709p;
    }

    public final List<Uri> getTriggeredContentUris() {
        return (List) this.f3121p.d.f14710q;
    }

    public u getWorkerFactory() {
        return this.f3121p.f3132h;
    }

    public boolean isRunInForeground() {
        return this.f3124s;
    }

    public final boolean isStopped() {
        return this.f3122q;
    }

    public final boolean isUsed() {
        return this.f3123r;
    }

    public void onStopped() {
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, c3.a] */
    public final InterfaceFutureC0239a setForegroundAsync(h hVar) {
        this.f3124s = true;
        p pVar = this.f3121p.f3134j;
        Context applicationContext = getApplicationContext();
        UUID id = getId();
        pVar.getClass();
        ?? obj = new Object();
        ((t3.g) pVar.f15238a).c(new N(pVar, obj, id, hVar, applicationContext, 1));
        return obj;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, c3.a] */
    public InterfaceFutureC0239a setProgressAsync(g gVar) {
        q qVar = this.f3121p.f3133i;
        getApplicationContext();
        UUID id = getId();
        qVar.getClass();
        ?? obj = new Object();
        ((t3.g) qVar.f15241b).c(new a(qVar, id, gVar, obj, 11, false));
        return obj;
    }

    public void setRunInForeground(boolean z4) {
        this.f3124s = z4;
    }

    public final void setUsed() {
        this.f3123r = true;
    }

    public abstract InterfaceFutureC0239a startWork();

    public final void stop() {
        this.f3122q = true;
        onStopped();
    }
}
