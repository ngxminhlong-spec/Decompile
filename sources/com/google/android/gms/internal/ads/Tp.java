package com.google.android.gms.internal.ads;

import java.util.LinkedList;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Tp {

    /* renamed from: b, reason: collision with root package name */
    public final int f7089b;
    public final int c;

    /* renamed from: a, reason: collision with root package name */
    public final LinkedList f7088a = new LinkedList();
    public final C0707hq d = new C0707hq();

    public Tp(int i4, int i5) {
        this.f7089b = i4;
        this.c = i5;
    }

    public final void a() {
        while (true) {
            LinkedList linkedList = this.f7088a;
            if (linkedList.isEmpty()) {
                return;
            }
            Yp yp = (Yp) linkedList.getFirst();
            N1.n.f1204A.f1212j.getClass();
            if (System.currentTimeMillis() - yp.d < this.c) {
                return;
            }
            C0707hq c0707hq = this.d;
            c0707hq.f8999f++;
            c0707hq.f8997b.f8872p++;
            linkedList.remove();
        }
    }
}
