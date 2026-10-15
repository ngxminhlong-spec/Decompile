package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.measurement.C1510e1;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.fk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0615fk implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f8728o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C1510e1 f8729p;

    public /* synthetic */ RunnableC0615fk(C1510e1 c1510e1, int i4) {
        this.f8728o = i4;
        this.f8729p = c1510e1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8728o) {
            case 0:
                C1510e1 c1510e1 = this.f8729p;
                ((C0658gk) c1510e1.f11915q).f8857a.a((ConcurrentHashMap) c1510e1.f11914p, false);
                return;
            default:
                C1510e1 c1510e12 = this.f8729p;
                ((C0658gk) c1510e12.f11915q).f8857a.a((ConcurrentHashMap) c1510e12.f11914p, true);
                return;
        }
    }
}
