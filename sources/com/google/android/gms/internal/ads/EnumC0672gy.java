package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.gy, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC0672gy implements Fz {
    f8887p("UNKNOWN_HASH"),
    f8888q("SHA1"),
    f8889r("SHA384"),
    f8890s("SHA256"),
    f8891t("SHA512"),
    f8892u("SHA224"),
    f8893v("UNRECOGNIZED");


    /* renamed from: o, reason: collision with root package name */
    public final int f8895o;

    EnumC0672gy(String str) {
        this.f8895o = r2;
    }

    @Override // java.lang.Enum
    public final String toString() {
        if (this != f8893v) {
            return Integer.toString(this.f8895o);
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
