package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Iu implements Executor {

    /* renamed from: o, reason: collision with root package name */
    public static final Iu f5747o;

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ Iu[] f5748p;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, com.google.android.gms.internal.ads.Iu] */
    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f5747o = r02;
        f5748p = new Iu[]{r02};
    }

    public static Iu[] values() {
        return (Iu[]) f5748p.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
