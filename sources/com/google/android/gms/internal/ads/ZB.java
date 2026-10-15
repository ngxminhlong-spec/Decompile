package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class ZB extends AbstractC0318Od {

    /* renamed from: q, reason: collision with root package name */
    public final int f7972q;

    /* renamed from: r, reason: collision with root package name */
    public final String f7973r;

    /* renamed from: s, reason: collision with root package name */
    public final int f7974s;

    /* renamed from: t, reason: collision with root package name */
    public final C0976o2 f7975t;

    /* renamed from: u, reason: collision with root package name */
    public final int f7976u;

    /* renamed from: v, reason: collision with root package name */
    public final C1202tE f7977v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f7978w;

    static {
        Integer.toString(1001, 36);
        Integer.toString(1002, 36);
        Integer.toString(1003, 36);
        Integer.toString(1004, 36);
        Integer.toString(1005, 36);
        Integer.toString(1006, 36);
    }

    public ZB(int i4, Exception exc, int i5) {
        this(i4, exc, i5, null, -1, null, 4, false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ZB(int r14, java.lang.Throwable r15, int r16, java.lang.String r17, int r18, com.google.android.gms.internal.ads.C0976o2 r19, int r20, boolean r21) {
        /*
            r13 = this;
            r8 = r20
            if (r14 == 0) goto L58
            r0 = 1
            if (r14 == r0) goto Le
            java.lang.String r0 = "Unexpected runtime error"
            r5 = r17
            r6 = r18
            goto L5e
        Le:
            java.lang.String r1 = java.lang.String.valueOf(r19)
            int r2 = com.google.android.gms.internal.ads.AbstractC0751is.f9071a
            if (r8 == 0) goto L33
            if (r8 == r0) goto L30
            r0 = 2
            if (r8 == r0) goto L2d
            r0 = 3
            if (r8 == r0) goto L2a
            r0 = 4
            if (r8 != r0) goto L24
            java.lang.String r0 = "YES"
            goto L35
        L24:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            r14.<init>()
            throw r14
        L2a:
            java.lang.String r0 = "NO_EXCEEDS_CAPABILITIES"
            goto L35
        L2d:
            java.lang.String r0 = "NO_UNSUPPORTED_DRM"
            goto L35
        L30:
            java.lang.String r0 = "NO_UNSUPPORTED_TYPE"
            goto L35
        L33:
            java.lang.String r0 = "NO"
        L35:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r5 = r17
            r2.append(r5)
            java.lang.String r3 = " error, index="
            r2.append(r3)
            r6 = r18
            r2.append(r6)
            java.lang.String r3 = ", format="
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = ", format_supported="
            java.lang.String r0 = n0.a.j(r2, r1, r0)
            goto L5e
        L58:
            r5 = r17
            r6 = r18
            java.lang.String r0 = "Source error"
        L5e:
            r1 = 0
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L6b
            java.lang.String r1 = ": null"
            java.lang.String r0 = r0.concat(r1)
        L6b:
            r1 = r0
            r9 = 0
            long r10 = android.os.SystemClock.elapsedRealtime()
            r0 = r13
            r4 = r14
            r2 = r15
            r3 = r16
            r7 = r19
            r12 = r21
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ZB.<init>(int, java.lang.Throwable, int, java.lang.String, int, com.google.android.gms.internal.ads.o2, int, boolean):void");
    }

    public ZB(String str, Throwable th, int i4, int i5, String str2, int i6, C0976o2 c0976o2, int i7, C1202tE c1202tE, long j4, boolean z4) {
        super(str, th, i4, j4);
        boolean z5;
        if (!z4) {
            z5 = true;
        } else if (i5 == 1) {
            i5 = 1;
            z5 = true;
        } else {
            z5 = false;
        }
        Zf.O(z5);
        Zf.O(th != null);
        this.f7972q = i5;
        this.f7973r = str2;
        this.f7974s = i6;
        this.f7975t = c0976o2;
        this.f7976u = i7;
        this.f7977v = c1202tE;
        this.f7978w = z4;
    }

    public final ZB a(C1202tE c1202tE) {
        String message = getMessage();
        int i4 = AbstractC0751is.f9071a;
        return new ZB(message, getCause(), this.f6466o, this.f7972q, this.f7973r, this.f7974s, this.f7975t, this.f7976u, c1202tE, this.f6467p, this.f7978w);
    }
}
