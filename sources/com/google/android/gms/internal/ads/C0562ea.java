package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.C1510e1;
import java.util.Map;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.ea, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0562ea extends C1510e1 {

    /* renamed from: s, reason: collision with root package name */
    public final Map f8609s;

    /* renamed from: t, reason: collision with root package name */
    public final Activity f8610t;

    /* renamed from: u, reason: collision with root package name */
    public final String f8611u;

    /* renamed from: v, reason: collision with root package name */
    public final long f8612v;

    /* renamed from: w, reason: collision with root package name */
    public final long f8613w;

    /* renamed from: x, reason: collision with root package name */
    public final String f8614x;
    public final String y;

    /* JADX WARN: Removed duplicated region for block: B:6:0x0041 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0562ea(com.google.android.gms.internal.ads.InterfaceC0308Md r4, java.util.Map r5) {
        /*
            r3 = this;
            r0 = 19
            r1 = 0
            java.lang.String r2 = "createCalendarEvent"
            r3.<init>(r4, r2, r0, r1)
            r3.f8609s = r5
            android.app.Activity r4 = r4.g()
            r3.f8610t = r4
            java.lang.String r4 = "description"
            java.lang.String r4 = r3.K(r4)
            r3.f8611u = r4
            java.lang.String r4 = "summary"
            java.lang.String r4 = r3.K(r4)
            r3.f8614x = r4
            java.lang.String r4 = "start_ticks"
            java.lang.Object r4 = r5.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            r0 = -1
            if (r4 != 0) goto L2e
        L2c:
            r4 = r0
            goto L32
        L2e:
            long r4 = java.lang.Long.parseLong(r4)     // Catch: java.lang.NumberFormatException -> L2c
        L32:
            r3.f8612v = r4
            java.lang.String r4 = "end_ticks"
            java.util.Map r5 = r3.f8609s
            java.lang.Object r4 = r5.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 != 0) goto L41
            goto L45
        L41:
            long r0 = java.lang.Long.parseLong(r4)     // Catch: java.lang.NumberFormatException -> L45
        L45:
            r3.f8613w = r0
            java.lang.String r4 = "location"
            java.lang.String r4 = r3.K(r4)
            r3.y = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C0562ea.<init>(com.google.android.gms.internal.ads.Md, java.util.Map):void");
    }

    public final String K(String str) {
        Map map = this.f8609s;
        return TextUtils.isEmpty((CharSequence) map.get(str)) ? "" : (String) map.get(str);
    }
}
