package com.google.android.gms.internal.measurement;

import java.util.ArrayList;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.measurement.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1498c {

    /* renamed from: a, reason: collision with root package name */
    public C1493b f11889a;

    /* renamed from: b, reason: collision with root package name */
    public C1493b f11890b;
    public final ArrayList c;

    public C1498c() {
        this.f11889a = new C1493b("", 0L, null);
        this.f11890b = new C1493b("", 0L, null);
        this.c = new ArrayList();
    }

    public C1498c(C1493b c1493b) {
        this.f11889a = c1493b;
        this.f11890b = c1493b.clone();
        this.c = new ArrayList();
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        C1498c c1498c = new C1498c(this.f11889a.clone());
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            c1498c.c.add(((C1493b) obj).clone());
        }
        return c1498c;
    }
}
