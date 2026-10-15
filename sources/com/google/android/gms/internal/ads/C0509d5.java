package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import d3.AbstractC1654b;
import i2.AbstractC1717a;
import java.util.List;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.d5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0509d5 extends AbstractC1717a {
    public static final Parcelable.Creator<C0509d5> CREATOR = new C0375a(21);

    /* renamed from: o, reason: collision with root package name */
    public final String f8451o;

    /* renamed from: p, reason: collision with root package name */
    public final long f8452p;

    /* renamed from: q, reason: collision with root package name */
    public final String f8453q;

    /* renamed from: r, reason: collision with root package name */
    public final String f8454r;

    /* renamed from: s, reason: collision with root package name */
    public final String f8455s;

    /* renamed from: t, reason: collision with root package name */
    public final Bundle f8456t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f8457u;

    /* renamed from: v, reason: collision with root package name */
    public long f8458v;

    /* renamed from: w, reason: collision with root package name */
    public String f8459w;

    /* renamed from: x, reason: collision with root package name */
    public int f8460x;

    public C0509d5(String str, long j4, String str2, String str3, String str4, Bundle bundle, boolean z4, long j5, String str5, int i4) {
        this.f8451o = str;
        this.f8452p = j4;
        this.f8453q = str2 == null ? "" : str2;
        this.f8454r = str3 == null ? "" : str3;
        this.f8455s = str4 == null ? "" : str4;
        this.f8456t = bundle == null ? new Bundle() : bundle;
        this.f8457u = z4;
        this.f8458v = j5;
        this.f8459w = str5;
        this.f8460x = i4;
    }

    public static C0509d5 h(Uri uri) {
        try {
            if (!"gcache".equals(uri.getScheme())) {
                return null;
            }
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments.size() != 2) {
                Y9.s("Expected 2 path parts for namespace and id, found :" + pathSegments.size());
                return null;
            }
            String str = pathSegments.get(0);
            String str2 = pathSegments.get(1);
            String host = uri.getHost();
            String queryParameter = uri.getQueryParameter("url");
            boolean equals = "1".equals(uri.getQueryParameter("read_only"));
            String queryParameter2 = uri.getQueryParameter("expiration");
            long parseLong = queryParameter2 == null ? 0L : Long.parseLong(queryParameter2);
            Bundle bundle = new Bundle();
            for (String str3 : uri.getQueryParameterNames()) {
                if (str3.startsWith("tag.")) {
                    bundle.putString(str3.substring(4), uri.getQueryParameter(str3));
                }
            }
            return new C0509d5(queryParameter, parseLong, host, str, str2, bundle, equals, 0L, "", 0);
        } catch (NullPointerException e4) {
            e = e4;
            Y9.t("Unable to parse Uri into cache offering.", e);
            return null;
        } catch (NumberFormatException e5) {
            e = e5;
            Y9.t("Unable to parse Uri into cache offering.", e);
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int a02 = AbstractC1654b.a0(parcel, 20293);
        AbstractC1654b.V(parcel, 2, this.f8451o);
        AbstractC1654b.f0(parcel, 3, 8);
        parcel.writeLong(this.f8452p);
        AbstractC1654b.V(parcel, 4, this.f8453q);
        AbstractC1654b.V(parcel, 5, this.f8454r);
        AbstractC1654b.V(parcel, 6, this.f8455s);
        AbstractC1654b.R(parcel, 7, this.f8456t);
        AbstractC1654b.f0(parcel, 8, 4);
        parcel.writeInt(this.f8457u ? 1 : 0);
        long j4 = this.f8458v;
        AbstractC1654b.f0(parcel, 9, 8);
        parcel.writeLong(j4);
        AbstractC1654b.V(parcel, 10, this.f8459w);
        int i5 = this.f8460x;
        AbstractC1654b.f0(parcel, 11, 4);
        parcel.writeInt(i5);
        AbstractC1654b.e0(parcel, a02);
    }
}
