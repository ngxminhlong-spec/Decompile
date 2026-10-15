package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.qs, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1094qs implements A2.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10419a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ A2.i f10420b;
    public final /* synthetic */ Object c;

    public /* synthetic */ C1094qs(Object obj, A2.i iVar, int i4) {
        this.f10419a = i4;
        this.c = obj;
        this.f10420b = iVar;
    }

    @Override // A2.d
    public final void a(A2.h hVar) {
        switch (this.f10419a) {
            case 0:
                C1308vs c1308vs = (C1308vs) this.c;
                A2.i iVar = this.f10420b;
                synchronized (c1308vs.f11082f) {
                    c1308vs.f11081e.remove(iVar);
                }
                return;
            default:
                ((Map) ((Wl) this.c).f7564q).remove(this.f10420b);
                return;
        }
    }
}
