package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import c3.InterfaceFutureC0239a;
import g2.x;
import n0.m;
import y0.j;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class Worker extends ListenableWorker {

    /* renamed from: t, reason: collision with root package name */
    public j f3126t;

    @Keep
    @SuppressLint({"BanKeepAnnotation"})
    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public abstract m doWork();

    /* JADX WARN: Type inference failed for: r0v0, types: [y0.j, java.lang.Object] */
    @Override // androidx.work.ListenableWorker
    public final InterfaceFutureC0239a startWork() {
        this.f3126t = new Object();
        getBackgroundExecutor().execute(new x(4, this));
        return this.f3126t;
    }
}
