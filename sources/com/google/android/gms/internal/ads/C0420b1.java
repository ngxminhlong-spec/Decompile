package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.b1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0420b1 extends AbstractC0505d1 {
    public final long c;
    public final ArrayList d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f8193e;

    public C0420b1(int i4, long j4) {
        super(i4);
        this.c = j4;
        this.d = new ArrayList();
        this.f8193e = new ArrayList();
    }

    public final C0420b1 d(int i4) {
        ArrayList arrayList = this.f8193e;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            C0420b1 c0420b1 = (C0420b1) arrayList.get(i5);
            if (c0420b1.f8436b == i4) {
                return c0420b1;
            }
        }
        return null;
    }

    public final C0462c1 e(int i4) {
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            C0462c1 c0462c1 = (C0462c1) arrayList.get(i5);
            if (c0462c1.f8436b == i4) {
                return c0462c1;
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0505d1
    public final String toString() {
        return AbstractC0505d1.c(this.f8436b) + " leaves: " + Arrays.toString(this.d.toArray()) + " containers: " + Arrays.toString(this.f8193e.toArray());
    }
}
