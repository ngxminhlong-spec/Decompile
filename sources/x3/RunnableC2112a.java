package x3;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: x3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC2112a implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f15865o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C2113b f15866p;

    public /* synthetic */ RunnableC2112a(C2113b c2113b, int i4) {
        this.f15865o = i4;
        this.f15866p = c2113b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0025, code lost:
    
        r4 = r0.f(r3);
        r5 = r0.c;
        r3 = r3.a();
        r3.f7964a = r4;
        r3.f7965b = 3;
        r3 = r3.a();
        r5.b(r3);
     */
    /* JADX WARN: Finally extract failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void a() {
        /*
            r7 = this;
            x3.b r0 = r7.f15866p
            r0.getClass()
            java.lang.Object r1 = x3.C2113b.f15867m
            monitor-enter(r1)
            d3.g r2 = r0.f15869a     // Catch: java.lang.Throwable -> L44
            r2.a()     // Catch: java.lang.Throwable -> L44
            android.content.Context r2 = r2.f12617a     // Catch: java.lang.Throwable -> L44
            com.google.android.gms.internal.ads.kn r2 = com.google.android.gms.internal.ads.C0831kn.l(r2)     // Catch: java.lang.Throwable -> L44
            y3.b r3 = r0.c     // Catch: java.lang.Throwable -> L3c
            y3.a r3 = r3.d()     // Catch: java.lang.Throwable -> L3c
            int r4 = r3.f15914b     // Catch: java.lang.Throwable -> L3c
            r5 = 2
            r6 = 1
            if (r4 == r5) goto L23
            if (r4 != r6) goto L22
            goto L23
        L22:
            r6 = 0
        L23:
            if (r6 == 0) goto L3e
            java.lang.String r4 = r0.f(r3)     // Catch: java.lang.Throwable -> L3c
            y3.b r5 = r0.c     // Catch: java.lang.Throwable -> L3c
            com.google.android.gms.internal.ads.Z8 r3 = r3.a()     // Catch: java.lang.Throwable -> L3c
            r3.f7964a = r4     // Catch: java.lang.Throwable -> L3c
            r4 = 3
            r3.f7965b = r4     // Catch: java.lang.Throwable -> L3c
            y3.a r3 = r3.a()     // Catch: java.lang.Throwable -> L3c
            r5.b(r3)     // Catch: java.lang.Throwable -> L3c
            goto L3e
        L3c:
            r0 = move-exception
            goto L56
        L3e:
            if (r2 == 0) goto L46
            r2.v()     // Catch: java.lang.Throwable -> L44
            goto L46
        L44:
            r0 = move-exception
            goto L5c
        L46:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L44
            r0.i(r3)
            java.util.concurrent.ThreadPoolExecutor r1 = r0.f15875i
            x3.a r2 = new x3.a
            r3 = 1
            r2.<init>(r0, r3)
            r1.execute(r2)
            return
        L56:
            if (r2 == 0) goto L5b
            r2.v()     // Catch: java.lang.Throwable -> L44
        L5b:
            throw r0     // Catch: java.lang.Throwable -> L44
        L5c:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L44
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: x3.RunnableC2112a.a():void");
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008a  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r10 = this;
            int r0 = r10.f15865o
            switch(r0) {
                case 0: goto Lac;
                default: goto L5;
            }
        L5:
            x3.b r0 = r10.f15866p
            r0.getClass()
            java.lang.Object r1 = x3.C2113b.f15867m
            monitor-enter(r1)
            d3.g r2 = r0.f15869a     // Catch: java.lang.Throwable -> L24
            r2.a()     // Catch: java.lang.Throwable -> L24
            android.content.Context r2 = r2.f12617a     // Catch: java.lang.Throwable -> L24
            com.google.android.gms.internal.ads.kn r2 = com.google.android.gms.internal.ads.C0831kn.l(r2)     // Catch: java.lang.Throwable -> L24
            y3.b r3 = r0.c     // Catch: java.lang.Throwable -> La3
            y3.a r3 = r3.d()     // Catch: java.lang.Throwable -> La3
            if (r2 == 0) goto L27
            r2.v()     // Catch: java.lang.Throwable -> L24
            goto L27
        L24:
            r0 = move-exception
            goto Laa
        L27:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L24
            int r1 = r3.f15914b     // Catch: x3.C2115d -> L9f
            r2 = 0
            r4 = 5
            r5 = 1
            if (r1 != r4) goto L31
            r6 = r5
            goto L32
        L31:
            r6 = r2
        L32:
            if (r6 != 0) goto L69
            r6 = 3
            if (r1 != r6) goto L38
            r2 = r5
        L38:
            if (r2 == 0) goto L3b
            goto L69
        L3b:
            x3.g r1 = r0.d     // Catch: x3.C2115d -> L9f
            r1.getClass()     // Catch: x3.C2115d -> L9f
            java.lang.String r2 = r3.c     // Catch: x3.C2115d -> L9f
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch: x3.C2115d -> L9f
            if (r2 == 0) goto L49
            goto L64
        L49:
            long r6 = r3.f15916f     // Catch: x3.C2115d -> L9f
            long r8 = r3.f15915e     // Catch: x3.C2115d -> L9f
            long r6 = r6 + r8
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: x3.C2115d -> L9f
            v3.d r1 = r1.f15883a     // Catch: x3.C2115d -> L9f
            r1.getClass()     // Catch: x3.C2115d -> L9f
            long r8 = java.lang.System.currentTimeMillis()     // Catch: x3.C2115d -> L9f
            long r1 = r2.toSeconds(r8)     // Catch: x3.C2115d -> L9f
            long r8 = x3.g.f15882b     // Catch: x3.C2115d -> L9f
            long r1 = r1 + r8
            int r1 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r1 >= 0) goto La2
        L64:
            y3.a r1 = r0.b(r3)     // Catch: x3.C2115d -> L9f
            goto L6d
        L69:
            y3.a r1 = r0.g(r3)     // Catch: x3.C2115d -> L9f
        L6d:
            r0.e(r1)
            r0.k(r3, r1)
            int r2 = r1.f15914b
            r3 = 4
            if (r2 != r3) goto L7d
            java.lang.String r2 = r1.f15913a
            r0.j(r2)
        L7d:
            int r2 = r1.f15914b
            if (r2 != r4) goto L8a
            x3.d r1 = new x3.d
            r1.<init>()
            r0.h()
            goto La2
        L8a:
            r3 = 2
            if (r2 == r3) goto L94
            if (r2 != r5) goto L90
            goto L94
        L90:
            r0.i(r1)
            goto La2
        L94:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."
            r1.<init>(r2)
            r0.h()
            goto La2
        L9f:
            r0.h()
        La2:
            return
        La3:
            r0 = move-exception
            if (r2 == 0) goto La9
            r2.v()     // Catch: java.lang.Throwable -> L24
        La9:
            throw r0     // Catch: java.lang.Throwable -> L24
        Laa:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L24
            throw r0
        Lac:
            r10.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x3.RunnableC2112a.run():void");
    }
}
