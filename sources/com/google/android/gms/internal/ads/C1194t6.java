package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.t6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1194t6 {

    /* renamed from: b, reason: collision with root package name */
    public static final C1194t6 f10674b = new C1194t6(0);
    public static final C1194t6 c = new C1194t6(1);
    public static final C1194t6 d = new C1194t6(2);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10675a;

    public /* synthetic */ C1194t6(int i4) {
        this.f10675a = i4;
    }

    public static final String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int length = str.length();
        int i4 = 0;
        int i5 = 0;
        while (i5 < str.length() && str.charAt(i5) == ',') {
            i5++;
        }
        while (length > 0) {
            int i6 = length - 1;
            if (str.charAt(i6) != ',') {
                break;
            }
            length = i6;
        }
        if (length < i5) {
            return null;
        }
        if (i5 != 0) {
            i4 = i5;
        } else if (length == str.length()) {
            return str;
        }
        return str.substring(i4, length);
    }

    public final String a(String str, String str2) {
        switch (this.f10675a) {
            case 0:
                return str2;
            case 1:
                return str != null ? str : str2;
            default:
                String b4 = b(str);
                String b5 = b(str2);
                return TextUtils.isEmpty(b4) ? b5 : TextUtils.isEmpty(b5) ? b4 : n0.a.i(b4, ",", b5);
        }
    }
}
