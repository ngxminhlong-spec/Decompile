package com.google.android.gms.internal.ads;

import android.os.IBinder;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.ds, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0537ds {

    /* renamed from: a, reason: collision with root package name */
    public final IBinder f8517a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8518b;
    public final int c;
    public final float d;

    /* renamed from: e, reason: collision with root package name */
    public final int f8519e;

    /* renamed from: f, reason: collision with root package name */
    public final String f8520f;

    public C0537ds(IBinder iBinder, String str, int i4, float f4, int i5, String str2) {
        this.f8517a = iBinder;
        this.f8518b = str;
        this.c = i4;
        this.d = f4;
        this.f8519e = i5;
        this.f8520f = str2;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0537ds) {
            C0537ds c0537ds = (C0537ds) obj;
            String str3 = c0537ds.f8520f;
            String str4 = c0537ds.f8518b;
            if (this.f8517a.equals(c0537ds.f8517a) && ((str = this.f8518b) != null ? str.equals(str4) : str4 == null) && this.c == c0537ds.c && Float.floatToIntBits(this.d) == Float.floatToIntBits(c0537ds.d) && this.f8519e == c0537ds.f8519e && ((str2 = this.f8520f) != null ? str2.equals(str3) : str3 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f8517a.hashCode() ^ 1000003;
        String str = this.f8518b;
        int hashCode2 = (((((((hashCode * 1000003) ^ 1237) * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.c) * 1000003) ^ Float.floatToIntBits(this.d);
        String str2 = this.f8520f;
        return ((((hashCode2 * 583896283) ^ this.f8519e) * (-721379959)) ^ (str2 != null ? str2.hashCode() : 0)) * 1000003;
    }

    public final String toString() {
        String obj = this.f8517a.toString();
        StringBuilder sb = new StringBuilder("OverlayDisplayShowRequest{windowToken=");
        sb.append(obj);
        sb.append(", stableSessionToken=false, appId=");
        sb.append(this.f8518b);
        sb.append(", layoutGravity=");
        sb.append(this.c);
        sb.append(", layoutVerticalMargin=");
        sb.append(this.d);
        sb.append(", displayMode=0, sessionToken=null, windowWidthPx=");
        sb.append(this.f8519e);
        sb.append(", deeplinkUrl=null, adFieldEnifd=");
        return n0.a.j(sb, this.f8520f, ", thirdPartyAuthCallerId=null}");
    }
}
