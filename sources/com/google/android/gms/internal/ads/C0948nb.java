package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import d3.AbstractC1654b;
import i2.AbstractC1717a;
import java.util.Arrays;
import org.json.JSONArray;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.nb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0948nb extends AbstractC1717a {
    public static final Parcelable.Creator<C0948nb> CREATOR = new C0295Ka(6);

    /* renamed from: o, reason: collision with root package name */
    public final String f9731o;

    /* renamed from: p, reason: collision with root package name */
    public final int f9732p;

    public C0948nb(String str, int i4) {
        this.f9731o = str;
        this.f9732p = i4;
    }

    public static C0948nb h(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        return new C0948nb(jSONArray.getJSONObject(0).optString("rb_type"), jSONArray.getJSONObject(0).optInt("rb_amount"));
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof C0948nb)) {
            C0948nb c0948nb = (C0948nb) obj;
            if (h2.y.m(this.f9731o, c0948nb.f9731o)) {
                if (h2.y.m(Integer.valueOf(this.f9732p), Integer.valueOf(c0948nb.f9732p))) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9731o, Integer.valueOf(this.f9732p)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int a02 = AbstractC1654b.a0(parcel, 20293);
        AbstractC1654b.V(parcel, 2, this.f9731o);
        AbstractC1654b.f0(parcel, 3, 4);
        parcel.writeInt(this.f9732p);
        AbstractC1654b.e0(parcel, a02);
    }
}
