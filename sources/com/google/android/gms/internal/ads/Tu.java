package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Tu implements Executor {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Executor f7096o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Ju f7097p;

    public Tu(Executor executor, Ju ju) {
        this.f7096o = executor;
        this.f7097p = ju;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        try {
            this.f7096o.execute(runnable);
        } catch (RejectedExecutionException e4) {
            this.f7097p.g(e4);
        }
    }
}
