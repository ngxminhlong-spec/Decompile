package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.r1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1103r1 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f10447a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10448b;
    public final U c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f10449e;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
    
        if (r5.equals("cens") != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
    
        if (r5.equals("cenc") != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003e, code lost:
    
        if (r5.equals("cbcs") != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0049, code lost:
    
        r1 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0047, code lost:
    
        if (r5.equals("cbc1") != false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1103r1(boolean r4, java.lang.String r5, int r6, byte[] r7, int r8, int r9, byte[] r10) {
        /*
            r3 = this;
            r3.<init>()
            r0 = 0
            r1 = 1
            if (r6 != 0) goto L9
            r2 = r1
            goto La
        L9:
            r2 = r0
        La:
            if (r10 != 0) goto Ld
            r0 = r1
        Ld:
            r0 = r0 ^ r2
            com.google.android.gms.internal.ads.Zf.O(r0)
            r3.f10447a = r4
            r3.f10448b = r5
            r3.d = r6
            r3.f10449e = r10
            com.google.android.gms.internal.ads.U r4 = new com.google.android.gms.internal.ads.U
            if (r5 != 0) goto L1e
            goto L63
        L1e:
            int r6 = r5.hashCode()
            switch(r6) {
                case 3046605: goto L41;
                case 3046671: goto L38;
                case 3049879: goto L2f;
                case 3049895: goto L26;
                default: goto L25;
            }
        L25:
            goto L4b
        L26:
            java.lang.String r6 = "cens"
            boolean r6 = r5.equals(r6)
            if (r6 == 0) goto L4b
            goto L63
        L2f:
            java.lang.String r6 = "cenc"
            boolean r6 = r5.equals(r6)
            if (r6 == 0) goto L4b
            goto L63
        L38:
            java.lang.String r6 = "cbcs"
            boolean r6 = r5.equals(r6)
            if (r6 == 0) goto L4b
            goto L49
        L41:
            java.lang.String r6 = "cbc1"
            boolean r6 = r5.equals(r6)
            if (r6 == 0) goto L4b
        L49:
            r1 = 2
            goto L63
        L4b:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r10 = "Unsupported protection scheme type '"
            r6.<init>(r10)
            r6.append(r5)
            java.lang.String r5 = "'. Assuming AES-CTR crypto mode."
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            java.lang.String r6 = "TrackEncryptionBox"
            com.google.android.gms.internal.ads.Wj.l(r6, r5)
        L63:
            r4.<init>(r1, r8, r9, r7)
            r3.c = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1103r1.<init>(boolean, java.lang.String, int, byte[], int, int, byte[]):void");
    }
}
