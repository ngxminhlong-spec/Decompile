package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.os, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractRunnableC1008os implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final A2.i f9863o;

    public AbstractRunnableC1008os() {
        this.f9863o = null;
    }

    public AbstractRunnableC1008os(A2.i iVar) {
        this.f9863o = iVar;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Exception e4) {
            A2.i iVar = this.f9863o;
            if (iVar != null) {
                iVar.c(e4);
            }
        }
    }
}
