package com.google.android.gms.internal.ads;

import android.app.Activity;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Vl {

    /* renamed from: a, reason: collision with root package name */
    public final Activity f7281a;

    /* renamed from: b, reason: collision with root package name */
    public final P1.a f7282b;
    public final String c;
    public final String d;

    public Vl(Activity activity, P1.a aVar, String str, String str2) {
        this.f7281a = activity;
        this.f7282b = aVar;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        P1.a aVar;
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof Vl) {
            Vl vl = (Vl) obj;
            String str3 = vl.d;
            String str4 = vl.c;
            P1.a aVar2 = vl.f7282b;
            if (this.f7281a.equals(vl.f7281a) && ((aVar = this.f7282b) != null ? aVar.equals(aVar2) : aVar2 == null) && ((str = this.c) != null ? str.equals(str4) : str4 == null) && ((str2 = this.d) != null ? str2.equals(str3) : str3 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f7281a.hashCode() ^ 1000003;
        P1.a aVar = this.f7282b;
        int hashCode2 = ((hashCode * 1000003) ^ (aVar == null ? 0 : aVar.hashCode())) * 1000003;
        String str = this.c;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.d;
        return hashCode3 ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder n4 = U.a.n("OfflineUtilsParams{activity=", this.f7281a.toString(), ", adOverlay=", String.valueOf(this.f7282b), ", gwsQueryId=");
        n4.append(this.c);
        n4.append(", uri=");
        return n0.a.j(n4, this.d, "}");
    }
}
