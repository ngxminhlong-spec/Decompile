package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.fs, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0623fs {

    /* renamed from: a, reason: collision with root package name */
    public final String f8750a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8751b;

    public C0623fs(String str, String str2) {
        this.f8750a = str;
        this.f8751b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0623fs) {
            C0623fs c0623fs = (C0623fs) obj;
            String str = c0623fs.f8751b;
            String str2 = c0623fs.f8750a;
            String str3 = this.f8750a;
            if (str3 != null ? str3.equals(str2) : str2 == null) {
                String str4 = this.f8751b;
                if (str4 != null ? str4.equals(str) : str == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f8750a;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.f8751b;
        return (str2 != null ? str2.hashCode() : 0) ^ ((hashCode ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OverlayDisplayUpdateRequest{sessionToken=");
        sb.append(this.f8750a);
        sb.append(", appId=");
        return n0.a.j(sb, this.f8751b, "}");
    }
}
