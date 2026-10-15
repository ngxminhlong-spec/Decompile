package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.tC, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1200tC {

    /* renamed from: a, reason: collision with root package name */
    public final long f10679a;

    /* renamed from: b, reason: collision with root package name */
    public final float f10680b;
    public final long c;

    public /* synthetic */ C1200tC(C1114rC c1114rC) {
        this.f10679a = c1114rC.f10466a;
        this.f10680b = c1114rC.f10467b;
        this.c = c1114rC.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1200tC)) {
            return false;
        }
        C1200tC c1200tC = (C1200tC) obj;
        return this.f10679a == c1200tC.f10679a && this.f10680b == c1200tC.f10680b && this.c == c1200tC.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f10679a), Float.valueOf(this.f10680b), Long.valueOf(this.c)});
    }
}
