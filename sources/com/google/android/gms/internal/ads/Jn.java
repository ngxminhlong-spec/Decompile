package com.google.android.gms.internal.ads;

import t2.C2005l;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final /* synthetic */ class Jn implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f5903o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f5904p;

    /* renamed from: q, reason: collision with root package name */
    public Object f5905q;

    public /* synthetic */ Jn(int i4, Object obj, Object obj2) {
        this.f5903o = i4;
        this.f5905q = obj;
        this.f5904p = obj2;
    }

    public /* synthetic */ Jn(Object obj, Object obj2, int i4, boolean z4) {
        this.f5903o = i4;
        this.f5904p = obj;
        this.f5905q = obj2;
    }

    public Jn(o3.k kVar) {
        this.f5903o = 21;
        this.f5904p = kVar;
    }

    private final void a() {
        C0831kn c0831kn = (C0831kn) this.f5905q;
        synchronized (((VB) this.f5904p)) {
        }
        int i4 = AbstractC0751is.f9071a;
        VC vc = ((SurfaceHolderCallbackC0730iC) c0831kn.f9320q).f9035o.f9386E;
        vc.e(vc.f((C1202tE) vc.f7251r.f8076o), 1013, new C0558eC(26));
    }

    private final void b() {
        try {
            d();
        } catch (Error e4) {
            synchronized (((o3.k) this.f5904p).f14366p) {
                ((o3.k) this.f5904p).f14367q = 1;
                throw e4;
            }
        }
    }

    private final void c() {
        boolean booleanValue;
        C2005l c2005l = (C2005l) this.f5905q;
        String str = (String) this.f5904p;
        synchronized (t2.t.class) {
            if (t2.t.f14937a == null) {
                try {
                    c2005l.evaluateJavascript("(function(){})()", null);
                    t2.t.f14937a = Boolean.TRUE;
                } catch (IllegalStateException unused) {
                    t2.t.f14937a = Boolean.FALSE;
                }
            }
            booleanValue = t2.t.f14937a.booleanValue();
        }
        if (booleanValue) {
            c2005l.evaluateJavascript(str, null);
        } else {
            c2005l.loadUrl("javascript:".concat(str));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004c, code lost:
    
        r1 = r1 | java.lang.Thread.interrupted();
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004e, code lost:
    
        ((java.lang.Runnable) r10.f5905q).run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007a, code lost:
    
        r10.f5905q = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007c, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005d, code lost:
    
        o3.k.f14364t.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + ((java.lang.Runnable) r10.f5905q), (java.lang.Throwable) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0043, code lost:
    
        if (r1 == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d() {
        /*
            r10 = this;
            r0 = 0
            r1 = r0
        L2:
            java.lang.Object r2 = r10.f5904p     // Catch: java.lang.Throwable -> L58
            o3.k r2 = (o3.k) r2     // Catch: java.lang.Throwable -> L58
            java.util.ArrayDeque r2 = r2.f14366p     // Catch: java.lang.Throwable -> L58
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L58
            r3 = 1
            if (r0 != 0) goto L2c
            java.lang.Object r0 = r10.f5904p     // Catch: java.lang.Throwable -> L20
            o3.k r0 = (o3.k) r0     // Catch: java.lang.Throwable -> L20
            int r4 = r0.f14367q     // Catch: java.lang.Throwable -> L20
            r5 = 4
            if (r4 != r5) goto L22
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L46
        L18:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            goto L46
        L20:
            r0 = move-exception
            goto L7d
        L22:
            long r6 = r0.f14368r     // Catch: java.lang.Throwable -> L20
            r8 = 1
            long r6 = r6 + r8
            r0.f14368r = r6     // Catch: java.lang.Throwable -> L20
            r0.f14367q = r5     // Catch: java.lang.Throwable -> L20
            r0 = r3
        L2c:
            java.lang.Object r4 = r10.f5904p     // Catch: java.lang.Throwable -> L20
            o3.k r4 = (o3.k) r4     // Catch: java.lang.Throwable -> L20
            java.util.ArrayDeque r4 = r4.f14366p     // Catch: java.lang.Throwable -> L20
            java.lang.Object r4 = r4.poll()     // Catch: java.lang.Throwable -> L20
            java.lang.Runnable r4 = (java.lang.Runnable) r4     // Catch: java.lang.Throwable -> L20
            r10.f5905q = r4     // Catch: java.lang.Throwable -> L20
            if (r4 != 0) goto L47
            java.lang.Object r0 = r10.f5904p     // Catch: java.lang.Throwable -> L20
            o3.k r0 = (o3.k) r0     // Catch: java.lang.Throwable -> L20
            r0.f14367q = r3     // Catch: java.lang.Throwable -> L20
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L46
            goto L18
        L46:
            return
        L47:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L58
            r1 = r1 | r2
            r2 = 0
            java.lang.Object r3 = r10.f5905q     // Catch: java.lang.Throwable -> L5a java.lang.RuntimeException -> L5c
            java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L5a java.lang.RuntimeException -> L5c
            r3.run()     // Catch: java.lang.Throwable -> L5a java.lang.RuntimeException -> L5c
        L55:
            r10.f5905q = r2     // Catch: java.lang.Throwable -> L58
            goto L2
        L58:
            r0 = move-exception
            goto L7f
        L5a:
            r0 = move-exception
            goto L7a
        L5c:
            r3 = move-exception
            java.util.logging.Logger r4 = o3.k.f14364t     // Catch: java.lang.Throwable -> L5a
            java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L5a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5a
            r6.<init>()     // Catch: java.lang.Throwable -> L5a
            java.lang.String r7 = "Exception while executing runnable "
            r6.append(r7)     // Catch: java.lang.Throwable -> L5a
            java.lang.Object r7 = r10.f5905q     // Catch: java.lang.Throwable -> L5a
            java.lang.Runnable r7 = (java.lang.Runnable) r7     // Catch: java.lang.Throwable -> L5a
            r6.append(r7)     // Catch: java.lang.Throwable -> L5a
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L5a
            r4.log(r5, r6, r3)     // Catch: java.lang.Throwable -> L5a
            goto L55
        L7a:
            r10.f5905q = r2     // Catch: java.lang.Throwable -> L58
            throw r0     // Catch: java.lang.Throwable -> L58
        L7d:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            throw r0     // Catch: java.lang.Throwable -> L58
        L7f:
            if (r1 == 0) goto L88
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
        L88:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.Jn.d():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:245:0x065c A[Catch: all -> 0x0534, TryCatch #9 {all -> 0x0534, blocks: (B:232:0x0515, B:234:0x0531, B:237:0x0537, B:239:0x05fa, B:242:0x05ff, B:243:0x0606, B:245:0x065c, B:246:0x0668, B:247:0x068e), top: B:231:0x0515 }] */
    /* JADX WARN: Type inference failed for: r11v2, types: [com.google.android.gms.internal.ads.lC] */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r8v7, types: [com.google.android.gms.internal.ads.r4] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 1958
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.Jn.run():void");
    }

    public String toString() {
        switch (this.f5903o) {
            case 21:
                Runnable runnable = (Runnable) this.f5905q;
                if (runnable != null) {
                    return "SequentialExecutorWorker{running=" + runnable + "}";
                }
                StringBuilder sb = new StringBuilder("SequentialExecutorWorker{state=");
                int i4 = ((o3.k) this.f5904p).f14367q;
                sb.append(i4 != 1 ? i4 != 2 ? i4 != 3 ? i4 != 4 ? "null" : "RUNNING" : "QUEUED" : "QUEUING" : "IDLE");
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }
}
