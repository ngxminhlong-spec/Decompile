package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Jj implements InterfaceC1457zB {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5889a;

    /* renamed from: b, reason: collision with root package name */
    public final Eg f5890b;

    public /* synthetic */ Jj(Eg eg, int i4) {
        this.f5889a = i4;
        this.f5890b = eg;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004c, code lost:
    
        if (android.text.TextUtils.isEmpty(r1) != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0038, code lost:
    
        if (android.text.TextUtils.isEmpty(r1) == false) goto L15;
     */
    @Override // com.google.android.gms.internal.ads.FB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c() {
        /*
            r4 = this;
            int r0 = r4.f5889a
            switch(r0) {
                case 0: goto L75;
                case 1: goto L62;
                default: goto L5;
            }
        L5:
            com.google.android.gms.internal.ads.Eg r0 = r4.f5890b
            com.google.android.gms.internal.ads.Jp r0 = r0.a()
            O1.U0 r0 = r0.d
            com.google.android.gms.internal.ads.n6 r1 = com.google.android.gms.internal.ads.AbstractC1066q6.u6
            O1.r r2 = O1.r.d
            com.google.android.gms.internal.ads.p6 r2 = r2.c
            java.lang.Object r1 = r2.a(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L4e
            java.lang.String r1 = r0.f1304L
            O1.N r0 = r0.f1299G
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            java.lang.String r3 = "request_id"
            if (r2 != 0) goto L3b
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: org.json.JSONException -> L3b
            r2.<init>(r1)     // Catch: org.json.JSONException -> L3b
            java.lang.String r1 = r2.getString(r3)     // Catch: org.json.JSONException -> L3b
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: org.json.JSONException -> L3b
            if (r2 != 0) goto L3b
            goto L5e
        L3b:
            if (r0 == 0) goto L4e
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L4e
            java.lang.String r0 = r0.f1282o     // Catch: org.json.JSONException -> L4e
            r1.<init>(r0)     // Catch: org.json.JSONException -> L4e
            java.lang.String r1 = r1.getString(r3)     // Catch: org.json.JSONException -> L4e
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch: org.json.JSONException -> L4e
            if (r0 == 0) goto L5e
        L4e:
            O1.p r0 = O1.C0081p.f1374f
            java.util.Random r0 = r0.f1377e
            int r0 = r0.nextInt()
            r1 = 2147483647(0x7fffffff, float:NaN)
            r0 = r0 & r1
            java.lang.String r1 = java.lang.String.valueOf(r0)
        L5e:
            com.google.android.gms.internal.ads.AbstractC0587ez.n(r1)
            return r1
        L62:
            com.google.android.gms.internal.ads.Eg r0 = r4.f5890b
            com.google.android.gms.internal.ads.Jp r0 = r0.a()
            n0.n r0 = r0.f5920o
            int r0 = r0.f14098p
            r1 = 3
            if (r0 != r1) goto L72
            java.lang.String r0 = "rewarded_interstitial"
            goto L74
        L72:
            java.lang.String r0 = "rewarded"
        L74:
            return r0
        L75:
            com.google.android.gms.internal.ads.Eg r0 = r4.f5890b
            com.google.android.gms.internal.ads.Jp r0 = r0.a()
            n0.n r0 = r0.f5920o
            int r0 = r0.f14098p
            r1 = 3
            if (r0 != r1) goto L85
            com.google.android.gms.internal.ads.k5 r0 = com.google.android.gms.internal.ads.EnumC0807k5.f9261A
            goto L87
        L85:
            com.google.android.gms.internal.ads.k5 r0 = com.google.android.gms.internal.ads.EnumC0807k5.f9270w
        L87:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.Jj.c():java.lang.Object");
    }
}
