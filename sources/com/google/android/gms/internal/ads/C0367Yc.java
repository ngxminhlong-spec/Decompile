package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.Yc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0367Yc {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7831a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7832b;
    public final int c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7833e;

    /* renamed from: f, reason: collision with root package name */
    public final int f7834f;

    /* renamed from: g, reason: collision with root package name */
    public final int f7835g;

    /* renamed from: h, reason: collision with root package name */
    public final int f7836h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f7837i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f7838j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f7839k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f7840l;

    /* renamed from: m, reason: collision with root package name */
    public final long f7841m;

    /* renamed from: n, reason: collision with root package name */
    public final long f7842n;

    /* JADX WARN: Removed duplicated region for block: B:15:0x00c0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0367Yc(java.lang.String r4) {
        /*
            r3 = this;
            r3.<init>()
            r0 = 0
            if (r4 == 0) goto Lc
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> Lc
            r1.<init>(r4)     // Catch: org.json.JSONException -> Lc
            r0 = r1
        Lc:
            java.lang.String r4 = "aggressive_media_codec_release"
            com.google.android.gms.internal.ads.n6 r1 = com.google.android.gms.internal.ads.AbstractC1066q6.f10092D
            boolean r4 = a(r0, r4, r1)
            r3.f7831a = r4
            java.lang.String r4 = "byte_buffer_precache_limit"
            com.google.android.gms.internal.ads.n6 r1 = com.google.android.gms.internal.ads.AbstractC1066q6.f10234i
            int r4 = b(r0, r4, r1)
            r3.f7832b = r4
            java.lang.String r4 = "exo_cache_buffer_size"
            com.google.android.gms.internal.ads.n6 r1 = com.google.android.gms.internal.ads.AbstractC1066q6.f10271q
            int r4 = b(r0, r4, r1)
            r3.c = r4
            java.lang.String r4 = "exo_connect_timeout_millis"
            com.google.android.gms.internal.ads.n6 r1 = com.google.android.gms.internal.ads.AbstractC1066q6.f10214e
            int r4 = b(r0, r4, r1)
            r3.d = r4
            java.lang.String r4 = "exo_player_version"
            com.google.android.gms.internal.ads.n6 r1 = com.google.android.gms.internal.ads.AbstractC1066q6.d
            if (r0 == 0) goto L3e
            r0.getString(r4)     // Catch: org.json.JSONException -> L3e
            goto L48
        L3e:
            O1.r r4 = O1.r.d
            com.google.android.gms.internal.ads.p6 r4 = r4.c
            java.lang.Object r4 = r4.a(r1)
            java.lang.String r4 = (java.lang.String) r4
        L48:
            java.lang.String r4 = "exo_read_timeout_millis"
            com.google.android.gms.internal.ads.n6 r1 = com.google.android.gms.internal.ads.AbstractC1066q6.f10219f
            int r4 = b(r0, r4, r1)
            r3.f7833e = r4
            java.lang.String r4 = "load_check_interval_bytes"
            com.google.android.gms.internal.ads.n6 r1 = com.google.android.gms.internal.ads.AbstractC1066q6.f10224g
            int r4 = b(r0, r4, r1)
            r3.f7834f = r4
            java.lang.String r4 = "player_precache_limit"
            com.google.android.gms.internal.ads.n6 r1 = com.google.android.gms.internal.ads.AbstractC1066q6.f10229h
            int r4 = b(r0, r4, r1)
            r3.f7835g = r4
            java.lang.String r4 = "socket_receive_buffer_size"
            com.google.android.gms.internal.ads.n6 r1 = com.google.android.gms.internal.ads.AbstractC1066q6.f10239j
            int r4 = b(r0, r4, r1)
            r3.f7836h = r4
            java.lang.String r4 = "use_cache_data_source"
            com.google.android.gms.internal.ads.n6 r1 = com.google.android.gms.internal.ads.AbstractC1066q6.G3
            boolean r4 = a(r0, r4, r1)
            r3.f7837i = r4
            java.lang.String r4 = "min_retry_count"
            com.google.android.gms.internal.ads.n6 r1 = com.google.android.gms.internal.ads.AbstractC1066q6.f10244k
            b(r0, r4, r1)
            java.lang.String r4 = "treat_load_exception_as_non_fatal"
            com.google.android.gms.internal.ads.n6 r1 = com.google.android.gms.internal.ads.AbstractC1066q6.f10252m
            boolean r4 = a(r0, r4, r1)
            r3.f7838j = r4
            java.lang.String r4 = "enable_multiple_video_playback"
            com.google.android.gms.internal.ads.n6 r1 = com.google.android.gms.internal.ads.AbstractC1066q6.f10099E1
            boolean r4 = a(r0, r4, r1)
            r3.f7839k = r4
            java.lang.String r4 = "use_range_http_data_source"
            com.google.android.gms.internal.ads.n6 r1 = com.google.android.gms.internal.ads.AbstractC1066q6.f10108G1
            boolean r4 = a(r0, r4, r1)
            r3.f7840l = r4
            java.lang.String r4 = "range_http_data_source_high_water_mark"
            com.google.android.gms.internal.ads.n6 r1 = com.google.android.gms.internal.ads.AbstractC1066q6.f10112H1
            if (r0 == 0) goto Laa
            long r1 = r0.getLong(r4)     // Catch: org.json.JSONException -> Laa
            goto Lb8
        Laa:
            O1.r r4 = O1.r.d
            com.google.android.gms.internal.ads.p6 r4 = r4.c
            java.lang.Object r4 = r4.a(r1)
            java.lang.Long r4 = (java.lang.Long) r4
            long r1 = r4.longValue()
        Lb8:
            r3.f7841m = r1
            java.lang.String r4 = "range_http_data_source_low_water_mark"
            com.google.android.gms.internal.ads.n6 r1 = com.google.android.gms.internal.ads.AbstractC1066q6.f10116I1
            if (r0 == 0) goto Lc5
            long r0 = r0.getLong(r4)     // Catch: org.json.JSONException -> Lc5
            goto Ld3
        Lc5:
            O1.r r4 = O1.r.d
            com.google.android.gms.internal.ads.p6 r4 = r4.c
            java.lang.Object r4 = r4.a(r1)
            java.lang.Long r4 = (java.lang.Long) r4
            long r0 = r4.longValue()
        Ld3:
            r3.f7842n = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C0367Yc.<init>(java.lang.String):void");
    }

    public static final boolean a(JSONObject jSONObject, String str, C0937n6 c0937n6) {
        boolean booleanValue = ((Boolean) O1.r.d.c.a(c0937n6)).booleanValue();
        if (jSONObject != null) {
            try {
                return jSONObject.getBoolean(str);
            } catch (JSONException unused) {
            }
        }
        return booleanValue;
    }

    public static final int b(JSONObject jSONObject, String str, C0937n6 c0937n6) {
        if (jSONObject != null) {
            try {
                return jSONObject.getInt(str);
            } catch (JSONException unused) {
            }
        }
        return ((Integer) O1.r.d.c.a(c0937n6)).intValue();
    }
}
