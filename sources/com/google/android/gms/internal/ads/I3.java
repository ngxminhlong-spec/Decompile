package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.View;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class I3 {
    public static final String[] c = {"/aclk", "/pcs/click", "/dbm/clk"};

    /* renamed from: a, reason: collision with root package name */
    public final String[] f5530a = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};

    /* renamed from: b, reason: collision with root package name */
    public final G3 f5531b;

    public I3(G3 g32) {
        this.f5531b = g32;
    }

    public static Uri c(Uri uri, String str) {
        try {
            if (uri == null) {
                throw null;
            }
            try {
                if (uri.getHost().equals("ad.doubleclick.net")) {
                    if (uri.getPath().contains(";")) {
                        if (uri.toString().contains("dc_ms=")) {
                            throw new Exception("Parameter already exists: dc_ms");
                        }
                        String uri2 = uri.toString();
                        int indexOf = uri2.indexOf(";adurl");
                        if (indexOf != -1) {
                            int i4 = indexOf + 1;
                            return Uri.parse(uri2.substring(0, i4) + "dc_ms=" + str + ";" + uri2.substring(i4));
                        }
                        String encodedPath = uri.getEncodedPath();
                        int indexOf2 = uri2.indexOf(encodedPath);
                        return Uri.parse(uri2.substring(0, encodedPath.length() + indexOf2) + ";dc_ms=" + str + ";" + uri2.substring(indexOf2 + encodedPath.length()));
                    }
                }
            } catch (NullPointerException unused) {
            }
            if (uri.getQueryParameter("ms") != null) {
                throw new Exception("Query parameter already exists: ms");
            }
            String uri3 = uri.toString();
            int indexOf3 = uri3.indexOf("&adurl");
            if (indexOf3 == -1) {
                indexOf3 = uri3.indexOf("?adurl");
            }
            if (indexOf3 == -1) {
                return uri.buildUpon().appendQueryParameter("ms", str).build();
            }
            int i5 = indexOf3 + 1;
            return Uri.parse(uri3.substring(0, i5) + "ms=" + str + "&" + uri3.substring(i5));
        } catch (UnsupportedOperationException unused2) {
            throw new Exception("Provided Uri is not in a valid state");
        }
    }

    public final Uri a(Uri uri, Context context, View view, Activity activity) {
        try {
            return c(uri, this.f5531b.h(context, uri.getQueryParameter("ai"), view, activity));
        } catch (UnsupportedOperationException unused) {
            throw new Exception("Provided Uri is not in a valid state");
        }
    }

    public final boolean b(Uri uri) {
        uri.getClass();
        try {
            String host = uri.getHost();
            String[] strArr = this.f5530a;
            for (int i4 = 0; i4 < 3; i4++) {
                if (host.endsWith(strArr[i4])) {
                    return true;
                }
            }
        } catch (NullPointerException unused) {
        }
        return false;
    }
}
