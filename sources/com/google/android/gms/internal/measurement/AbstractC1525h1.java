package com.google.android.gms.internal.measurement;

import android.net.Uri;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.measurement.h1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1525h1 {

    /* renamed from: a, reason: collision with root package name */
    public static final r.e f11940a = new r.i(0);

    public static synchronized Uri a() {
        synchronized (AbstractC1525h1.class) {
            r.e eVar = f11940a;
            Uri uri = (Uri) eVar.get("com.google.android.gms.measurement");
            if (uri != null) {
                return uri;
            }
            Uri parse = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.measurement"))));
            eVar.put("com.google.android.gms.measurement", parse);
            return parse;
        }
    }
}
