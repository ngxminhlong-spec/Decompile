package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.v5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC1279v5 implements Fz {
    f10983p("AD_FORMAT_TYPE_UNSPECIFIED"),
    f10984q("BANNER"),
    f10985r("INTERSTITIAL"),
    f10986s("NATIVE_EXPRESS"),
    f10987t("NATIVE_CONTENT"),
    f10988u("NATIVE_APP_INSTALL"),
    f10989v("NATIVE_CUSTOM_TEMPLATE"),
    f10990w("DFP_BANNER"),
    f10991x("DFP_INTERSTITIAL"),
    y("REWARD_BASED_VIDEO_AD"),
    f10992z("BANNER_SEARCH_ADS");


    /* renamed from: o, reason: collision with root package name */
    public final int f10993o;

    EnumC1279v5(String str) {
        this.f10993o = r2;
    }

    public static EnumC1279v5 a(int i4) {
        switch (i4) {
            case 0:
                return f10983p;
            case 1:
                return f10984q;
            case 2:
                return f10985r;
            case 3:
                return f10986s;
            case 4:
                return f10987t;
            case 5:
                return f10988u;
            case 6:
                return f10989v;
            case 7:
                return f10990w;
            case 8:
                return f10991x;
            case 9:
                return y;
            case 10:
                return f10992z;
            default:
                return null;
        }
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f10993o);
    }
}
