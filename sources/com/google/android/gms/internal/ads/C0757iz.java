package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.iz, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0757iz {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f9103g = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Uri f9104a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f9105b;
    public final long c;
    public final long d;

    /* renamed from: e, reason: collision with root package name */
    public final long f9106e;

    /* renamed from: f, reason: collision with root package name */
    public final int f9107f;

    static {
        AbstractC0861la.a("media3.datasource");
    }

    public C0757iz(Uri uri, long j4, long j5, long j6, int i4) {
        this(uri, j4 - j5, Collections.EMPTY_MAP, j5, j6, i4);
    }

    public C0757iz(Uri uri, long j4, Map map, long j5, long j6, int i4) {
        long j7 = j4 + j5;
        boolean z4 = false;
        Zf.O(j7 >= 0);
        Zf.O(j5 >= 0);
        if (j6 <= 0) {
            j6 = j6 == -1 ? -1L : j6;
            Zf.O(z4);
            this.f9104a = uri;
            this.f9105b = Collections.unmodifiableMap(new HashMap(map));
            this.d = j5;
            this.c = j7;
            this.f9106e = j6;
            this.f9107f = i4;
        }
        z4 = true;
        Zf.O(z4);
        this.f9104a = uri;
        this.f9105b = Collections.unmodifiableMap(new HashMap(map));
        this.d = j5;
        this.c = j7;
        this.f9106e = j6;
        this.f9107f = i4;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f9104a);
        StringBuilder sb = new StringBuilder("DataSpec[GET ");
        sb.append(valueOf);
        sb.append(", ");
        sb.append(this.d);
        sb.append(", ");
        sb.append(this.f9106e);
        sb.append(", null, ");
        return U.a.l(sb, this.f9107f, "]");
    }
}
