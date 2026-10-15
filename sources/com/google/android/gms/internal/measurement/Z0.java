package com.google.android.gms.internal.measurement;

import android.net.Uri;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class Z0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Uri f11859a = Uri.parse("content://com.google.android.gsf.gservices");

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f11860b;
    public static final Pattern c;
    public static final AtomicBoolean d;

    /* renamed from: e, reason: collision with root package name */
    public static HashMap f11861e;

    /* renamed from: f, reason: collision with root package name */
    public static final HashMap f11862f;

    /* renamed from: g, reason: collision with root package name */
    public static final HashMap f11863g;

    /* renamed from: h, reason: collision with root package name */
    public static final HashMap f11864h;

    /* renamed from: i, reason: collision with root package name */
    public static final HashMap f11865i;

    /* renamed from: j, reason: collision with root package name */
    public static Object f11866j;

    /* renamed from: k, reason: collision with root package name */
    public static final String[] f11867k;

    static {
        Uri.parse("content://com.google.android.gsf.gservices/prefix");
        f11860b = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
        c = Pattern.compile("^(0|false|f|off|no|n)$", 2);
        d = new AtomicBoolean();
        f11862f = new HashMap();
        f11863g = new HashMap();
        f11864h = new HashMap();
        f11865i = new HashMap();
        f11867k = new String[0];
    }

    public static void a(Object obj, String str, String str2) {
        synchronized (Z0.class) {
            try {
                if (obj == f11866j) {
                    f11861e.put(str, str2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
