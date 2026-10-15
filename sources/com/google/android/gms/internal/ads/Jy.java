package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public enum Jy implements Fz {
    f5942p("UNKNOWN_PREFIX"),
    f5943q("TINK"),
    f5944r("LEGACY"),
    f5945s("RAW"),
    f5946t("CRUNCHY"),
    f5947u("UNRECOGNIZED");


    /* renamed from: o, reason: collision with root package name */
    public final int f5949o;

    Jy(String str) {
        this.f5949o = r2;
    }

    public static Jy b(int i4) {
        if (i4 == 0) {
            return f5942p;
        }
        if (i4 == 1) {
            return f5943q;
        }
        if (i4 == 2) {
            return f5944r;
        }
        if (i4 == 3) {
            return f5945s;
        }
        if (i4 != 4) {
            return null;
        }
        return f5946t;
    }

    public final int a() {
        if (this != f5947u) {
            return this.f5949o;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
