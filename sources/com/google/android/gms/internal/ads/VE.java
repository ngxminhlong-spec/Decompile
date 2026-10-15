package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final /* synthetic */ class VE implements Es {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C0604fF f7260o;

    public /* synthetic */ VE(C0604fF c0604fF) {
        this.f7260o = c0604fF;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x002c, code lost:
    
        if (r2.equals("audio/eac3") != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x004b, code lost:
    
        if (com.google.android.gms.internal.ads.AbstractC0751is.f9071a < 32) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x004d, code lost:
    
        r2 = r0.f8699g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x004f, code lost:
    
        if (r2 == null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0053, code lost:
    
        if (r2.f67o != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0035, code lost:
    
        if (r2.equals("audio/ac4") != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x003e, code lost:
    
        if (r2.equals("audio/ac3") != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0047, code lost:
    
        if (r2.equals("audio/eac3-joc") != false) goto L27;
     */
    @Override // com.google.android.gms.internal.ads.Es
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean l(java.lang.Object r7) {
        /*
            r6 = this;
            com.google.android.gms.internal.ads.fF r0 = r6.f7260o
            com.google.android.gms.internal.ads.o2 r7 = (com.google.android.gms.internal.ads.C0976o2) r7
            java.lang.Object r1 = r0.c
            monitor-enter(r1)
            com.google.android.gms.internal.ads.ZE r2 = r0.f8698f     // Catch: java.lang.Throwable -> L56
            boolean r2 = r2.f7984o     // Catch: java.lang.Throwable -> L56
            r3 = 1
            if (r2 == 0) goto L87
            boolean r2 = r0.f8697e     // Catch: java.lang.Throwable -> L56
            if (r2 != 0) goto L87
            int r2 = r7.f9826x     // Catch: java.lang.Throwable -> L56
            r4 = 2
            if (r2 <= r4) goto L87
            java.lang.String r2 = r7.f9813k     // Catch: java.lang.Throwable -> L56
            r4 = 32
            if (r2 != 0) goto L1e
            goto L58
        L1e:
            int r5 = r2.hashCode()     // Catch: java.lang.Throwable -> L56
            switch(r5) {
                case -2123537834: goto L41;
                case 187078296: goto L38;
                case 187078297: goto L2f;
                case 1504578661: goto L26;
                default: goto L25;
            }
        L25:
            goto L58
        L26:
            java.lang.String r5 = "audio/eac3"
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L58
            goto L49
        L2f:
            java.lang.String r5 = "audio/ac4"
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L58
            goto L49
        L38:
            java.lang.String r5 = "audio/ac3"
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L58
            goto L49
        L41:
            java.lang.String r5 = "audio/eac3-joc"
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L58
        L49:
            int r2 = com.google.android.gms.internal.ads.AbstractC0751is.f9071a     // Catch: java.lang.Throwable -> L56
            if (r2 < r4) goto L87
            B0.c r2 = r0.f8699g     // Catch: java.lang.Throwable -> L56
            if (r2 == 0) goto L87
            boolean r2 = r2.f67o     // Catch: java.lang.Throwable -> L56
            if (r2 != 0) goto L58
            goto L87
        L56:
            r7 = move-exception
            goto L89
        L58:
            int r2 = com.google.android.gms.internal.ads.AbstractC0751is.f9071a     // Catch: java.lang.Throwable -> L56
            r5 = 0
            if (r2 < r4) goto L86
            B0.c r2 = r0.f8699g     // Catch: java.lang.Throwable -> L56
            if (r2 == 0) goto L86
            boolean r4 = r2.f67o     // Catch: java.lang.Throwable -> L56
            if (r4 == 0) goto L86
            java.lang.Object r2 = r2.f68p     // Catch: java.lang.Throwable -> L56
            android.media.Spatializer r2 = (android.media.Spatializer) r2     // Catch: java.lang.Throwable -> L56
            boolean r2 = I.b.j(r2)     // Catch: java.lang.Throwable -> L56
            if (r2 == 0) goto L86
            B0.c r2 = r0.f8699g     // Catch: java.lang.Throwable -> L56
            java.lang.Object r2 = r2.f68p     // Catch: java.lang.Throwable -> L56
            android.media.Spatializer r2 = (android.media.Spatializer) r2     // Catch: java.lang.Throwable -> L56
            boolean r2 = I.b.g(r2)     // Catch: java.lang.Throwable -> L56
            if (r2 == 0) goto L86
            B0.c r2 = r0.f8699g     // Catch: java.lang.Throwable -> L56
            com.google.android.gms.internal.ads.gC r0 = r0.f8700h     // Catch: java.lang.Throwable -> L56
            boolean r7 = r2.f(r0, r7)     // Catch: java.lang.Throwable -> L56
            if (r7 == 0) goto L86
            goto L87
        L86:
            r3 = r5
        L87:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L56
            return r3
        L89:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L56
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.VE.l(java.lang.Object):boolean");
    }
}
