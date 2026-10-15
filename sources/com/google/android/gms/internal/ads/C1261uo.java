package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.uo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1261uo implements Fo {

    /* renamed from: a, reason: collision with root package name */
    public final N1.d f10942a;

    /* renamed from: b, reason: collision with root package name */
    public final N1.d f10943b;
    public final boolean c;
    public final boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f10944e = false;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f10945f;

    public C1261uo(N1.d dVar, N1.d dVar2, boolean z4, boolean z5, boolean z6) {
        this.f10942a = dVar;
        this.f10943b = dVar2;
        this.c = z4;
        this.d = z5;
        this.f10945f = z6;
    }

    public C1261uo(boolean z4) {
        this.f10945f = z4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0046, code lost:
    
        if (r7 < 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0048, code lost:
    
        r1.putString("paidv1_id_android", r6);
        r1.putLong("paidv1_creation_time_android", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0064, code lost:
    
        if (((java.lang.Boolean) O1.r.d.c.a(com.google.android.gms.internal.ads.AbstractC1066q6.f10297v2)).booleanValue() == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x007a, code lost:
    
        r4 = r9.f10943b;
        r5 = (java.lang.String) r4.f1158q;
        r6 = r4.f1157p;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0082, code lost:
    
        if (r5 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0086, code lost:
    
        if (r6 < 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0088, code lost:
    
        r1.putString("paidv2_id_android", r5);
        r1.putLong("paidv2_creation_time_android", r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0092, code lost:
    
        r1.putBoolean("paidv2_pub_option_android", r9.c);
        r1.putBoolean("paidv2_user_option_android", r9.d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0078, code lost:
    
        if (((java.lang.Boolean) O1.r.d.c.a(com.google.android.gms.internal.ads.AbstractC1066q6.f10306x2)).booleanValue() != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0038, code lost:
    
        if (((java.lang.Boolean) O1.r.d.c.a(com.google.android.gms.internal.ads.AbstractC1066q6.w2)).booleanValue() != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0024, code lost:
    
        if (((java.lang.Boolean) O1.r.d.c.a(com.google.android.gms.internal.ads.AbstractC1066q6.u2)).booleanValue() == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x003a, code lost:
    
        r5 = r9.f10942a;
        r6 = (java.lang.String) r5.f1158q;
        r7 = r5.f1157p;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0042, code lost:
    
        if (r6 == null) goto L17;
     */
    @Override // com.google.android.gms.internal.ads.Fo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.Object r10) {
        /*
            r9 = this;
            android.os.Bundle r10 = (android.os.Bundle) r10
            boolean r0 = r9.f10944e
            if (r0 == 0) goto L8
            goto La9
        L8:
            java.lang.String r0 = "pii"
            android.os.Bundle r1 = com.google.android.gms.internal.ads.Zf.d(r10, r0)
            r2 = 0
            boolean r4 = r9.f10945f
            if (r4 != 0) goto L26
            com.google.android.gms.internal.ads.n6 r5 = com.google.android.gms.internal.ads.AbstractC1066q6.u2
            O1.r r6 = O1.r.d
            com.google.android.gms.internal.ads.p6 r6 = r6.c
            java.lang.Object r5 = r6.a(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L3a
        L26:
            if (r4 == 0) goto L52
            com.google.android.gms.internal.ads.n6 r5 = com.google.android.gms.internal.ads.AbstractC1066q6.w2
            O1.r r6 = O1.r.d
            com.google.android.gms.internal.ads.p6 r6 = r6.c
            java.lang.Object r5 = r6.a(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L52
        L3a:
            N1.d r5 = r9.f10942a
            java.lang.Object r6 = r5.f1158q
            java.lang.String r6 = (java.lang.String) r6
            long r7 = r5.f1157p
            if (r6 == 0) goto L52
            int r5 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r5 < 0) goto L52
            java.lang.String r5 = "paidv1_id_android"
            r1.putString(r5, r6)
            java.lang.String r5 = "paidv1_creation_time_android"
            r1.putLong(r5, r7)
        L52:
            if (r4 != 0) goto L66
            com.google.android.gms.internal.ads.n6 r5 = com.google.android.gms.internal.ads.AbstractC1066q6.f10297v2
            O1.r r6 = O1.r.d
            com.google.android.gms.internal.ads.p6 r6 = r6.c
            java.lang.Object r5 = r6.a(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L7a
        L66:
            if (r4 == 0) goto La0
            com.google.android.gms.internal.ads.n6 r4 = com.google.android.gms.internal.ads.AbstractC1066q6.f10306x2
            O1.r r5 = O1.r.d
            com.google.android.gms.internal.ads.p6 r5 = r5.c
            java.lang.Object r4 = r5.a(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto La0
        L7a:
            N1.d r4 = r9.f10943b
            java.lang.Object r5 = r4.f1158q
            java.lang.String r5 = (java.lang.String) r5
            long r6 = r4.f1157p
            if (r5 == 0) goto L92
            int r2 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r2 < 0) goto L92
            java.lang.String r2 = "paidv2_id_android"
            r1.putString(r2, r5)
            java.lang.String r2 = "paidv2_creation_time_android"
            r1.putLong(r2, r6)
        L92:
            boolean r2 = r9.c
            java.lang.String r3 = "paidv2_pub_option_android"
            r1.putBoolean(r3, r2)
            boolean r2 = r9.d
            java.lang.String r3 = "paidv2_user_option_android"
            r1.putBoolean(r3, r2)
        La0:
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto La9
            r10.putBundle(r0, r1)
        La9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1261uo.a(java.lang.Object):void");
    }
}
