package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class UD extends Exception {

    /* renamed from: o, reason: collision with root package name */
    public final String f7151o;

    /* renamed from: p, reason: collision with root package name */
    public final SD f7152p;

    /* renamed from: q, reason: collision with root package name */
    public final String f7153q;

    public UD(C0976o2 c0976o2, C0390aE c0390aE, int i4) {
        this("Decoder init failed: [" + i4 + "], " + c0976o2.toString(), c0390aE, c0976o2.f9813k, null, U.a.i("androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_neg_", Math.abs(i4)));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public UD(com.google.android.gms.internal.ads.C0976o2 r10, java.lang.Exception r11, com.google.android.gms.internal.ads.SD r12) {
        /*
            r9 = this;
            java.lang.String r0 = r12.f6957a
            java.lang.String r1 = r10.toString()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Decoder init failed: "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = ", "
            r2.append(r0)
            r2.append(r1)
            java.lang.String r4 = r2.toString()
            java.lang.String r6 = r10.f9813k
            int r10 = com.google.android.gms.internal.ads.AbstractC0751is.f9071a
            r0 = 21
            r1 = 0
            if (r10 < r0) goto L30
            boolean r10 = r11 instanceof android.media.MediaCodec.CodecException
            if (r10 == 0) goto L30
            r10 = r11
            android.media.MediaCodec$CodecException r10 = (android.media.MediaCodec.CodecException) r10
            java.lang.String r1 = r10.getDiagnosticInfo()
        L30:
            r3 = r9
            r5 = r11
            r7 = r12
            r8 = r1
            r3.<init>(r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.UD.<init>(com.google.android.gms.internal.ads.o2, java.lang.Exception, com.google.android.gms.internal.ads.SD):void");
    }

    public UD(String str, Throwable th, String str2, SD sd, String str3) {
        super(str, th);
        this.f7151o = str2;
        this.f7152p = sd;
        this.f7153q = str3;
    }
}
