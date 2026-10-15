package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.be, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0439be {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f8260a = Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*\\s*<!DOCTYPE(\\s)+html(|(\\s)+[^>]*)>", 2);

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f8261b = Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*?\\s*<!DOCTYPE[^>]*>", 2);

    public static String a(String str, String... strArr) {
        StringBuilder sb = new StringBuilder();
        Matcher matcher = f8260a.matcher(str);
        int i4 = 0;
        if (matcher.find()) {
            int end = matcher.end();
            sb.append(str.substring(0, end));
            while (i4 <= 0) {
                String str2 = strArr[i4];
                if (str2 != null) {
                    sb.append(str2);
                }
                i4++;
            }
            sb.append(str.substring(end));
        } else {
            if (!f8261b.matcher(str).find()) {
                while (i4 <= 0) {
                    String str3 = strArr[i4];
                    if (str3 != null) {
                        sb.append(str3);
                    }
                    i4++;
                }
            }
            sb.append(str);
        }
        return sb.toString();
    }
}
