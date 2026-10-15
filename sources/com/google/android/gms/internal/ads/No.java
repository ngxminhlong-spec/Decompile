package com.google.android.gms.internal.ads;

import O1.C0081p;
import android.content.Context;
import b0.RunnableC0203p;
import c3.InterfaceFutureC0239a;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class No implements Go {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6390a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f6391b;
    public final boolean c;
    public final ScheduledExecutorService d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f6392e;

    /* renamed from: f, reason: collision with root package name */
    public final Executor f6393f;

    public No(C1016p c1016p, Context context, ScheduledExecutorService scheduledExecutorService, C0260Dc c0260Dc, int i4, boolean z4, boolean z5) {
        this.f6392e = context;
        this.d = scheduledExecutorService;
        this.f6393f = c0260Dc;
        this.f6391b = z4;
        this.c = z5;
    }

    public No(C1035pc c1035pc, boolean z4, boolean z5, Su su, ScheduledExecutorService scheduledExecutorService) {
        this.f6392e = c1035pc;
        this.f6391b = z4;
        this.c = z5;
        this.f6393f = su;
        this.d = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.Go
    public final int b() {
        switch (this.f6390a) {
            case 0:
                return 40;
            default:
                return 50;
        }
    }

    @Override // com.google.android.gms.internal.ads.Go
    public final InterfaceFutureC0239a c() {
        switch (this.f6390a) {
            case 0:
                C0937n6 c0937n6 = AbstractC1066q6.J0;
                O1.r rVar = O1.r.d;
                if (!((Boolean) rVar.c.a(c0937n6)).booleanValue()) {
                    return Bs.f0(new Exception("Did not ad Ad ID into query param."));
                }
                Context context = (Context) this.f6392e;
                C0272Fc c0272Fc = new C0272Fc();
                C1335wc c1335wc = C0081p.f1374f.f1375a;
                int c = e2.f.f12753b.c(context, 12451000);
                if (c == 0 || c == 2) {
                    AbstractC0266Ec.f4897a.execute(new RunnableC0203p(12, context, c0272Fc));
                }
                Ku q4 = Ku.q(c0272Fc);
                final int i4 = 0;
                As as = new As(this) { // from class: com.google.android.gms.internal.ads.Mo

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ No f6273b;

                    {
                        this.f6273b = this;
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:13:0x004e, code lost:
                    
                        if (((java.lang.Boolean) O1.r.d.c.a(com.google.android.gms.internal.ads.AbstractC1066q6.f10085B2)).booleanValue() == false) goto L14;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:15:0x0066, code lost:
                    
                        r2 = com.google.android.gms.internal.ads.Wr.f((android.content.Context) r0.f6392e);
                        r9.getClass();
                        r5 = r9.f1075a;
                        r5.getClass();
                        r6 = ((android.content.Context) r0.f6392e).getPackageName();
                        r3 = ((java.lang.Long) O1.r.d.c.a(com.google.android.gms.internal.ads.AbstractC1066q6.f10113H2)).longValue();
                        r7 = r0.c;
                        r2.getClass();
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:16:0x0095, code lost:
                    
                        monitor-enter(com.google.android.gms.internal.ads.Wr.class);
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:18:0x0096, code lost:
                    
                        r0 = r2.a(r3, r5, r6, r7);
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:19:0x009a, code lost:
                    
                        monitor-exit(com.google.android.gms.internal.ads.Wr.class);
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:20:0x009b, code lost:
                    
                        r1 = r0;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a0, code lost:
                    
                        r0 = move-exception;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a3, code lost:
                    
                        N1.n.f1204A.f1209g.h("AdIdInfoSignalSource.getPaidV1", r0);
                        r1 = new N1.d(7);
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:33:0x0064, code lost:
                    
                        if (((java.lang.Boolean) O1.r.d.c.a(com.google.android.gms.internal.ads.AbstractC1066q6.f10090C2)).booleanValue() != false) goto L34;
                     */
                    @Override // com.google.android.gms.internal.ads.As
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object apply(java.lang.Object r9) {
                        /*
                            r8 = this;
                            int r0 = r2
                            switch(r0) {
                                case 0: goto L30;
                                default: goto L5;
                            }
                        L5:
                            com.google.android.gms.internal.ads.No r0 = r8.f6273b
                            java.lang.Throwable r9 = (java.lang.Throwable) r9
                            r0.getClass()
                            O1.p r9 = O1.C0081p.f1374f
                            com.google.android.gms.internal.ads.wc r9 = r9.f1375a
                            java.lang.Object r9 = r0.f6392e
                            android.content.Context r9 = (android.content.Context) r9
                            android.content.ContentResolver r9 = r9.getContentResolver()
                            r0 = 0
                            if (r9 != 0) goto L1d
                            r9 = r0
                            goto L23
                        L1d:
                            java.lang.String r1 = "android_id"
                            java.lang.String r9 = android.provider.Settings.Secure.getString(r9, r1)
                        L23:
                            com.google.android.gms.internal.ads.Pn r1 = new com.google.android.gms.internal.ads.Pn
                            N1.d r2 = new N1.d
                            r3 = 7
                            r2.<init>(r3)
                            r3 = 2
                            r1.<init>(r0, r9, r2, r3)
                            return r1
                        L30:
                            com.google.android.gms.internal.ads.No r0 = r8.f6273b
                            L1.a r9 = (L1.a) r9
                            N1.d r1 = new N1.d
                            r2 = 7
                            r1.<init>(r2)
                            boolean r2 = r0.f6391b
                            if (r2 != 0) goto L50
                            com.google.android.gms.internal.ads.n6 r2 = com.google.android.gms.internal.ads.AbstractC1066q6.f10085B2
                            O1.r r3 = O1.r.d
                            com.google.android.gms.internal.ads.p6 r3 = r3.c
                            java.lang.Object r2 = r3.a(r2)
                            java.lang.Boolean r2 = (java.lang.Boolean) r2
                            boolean r2 = r2.booleanValue()
                            if (r2 != 0) goto L66
                        L50:
                            boolean r2 = r0.f6391b
                            if (r2 == 0) goto Lb2
                            com.google.android.gms.internal.ads.n6 r2 = com.google.android.gms.internal.ads.AbstractC1066q6.f10090C2
                            O1.r r3 = O1.r.d
                            com.google.android.gms.internal.ads.p6 r3 = r3.c
                            java.lang.Object r2 = r3.a(r2)
                            java.lang.Boolean r2 = (java.lang.Boolean) r2
                            boolean r2 = r2.booleanValue()
                            if (r2 == 0) goto Lb2
                        L66:
                            java.lang.Object r1 = r0.f6392e     // Catch: java.lang.IllegalArgumentException -> La0 java.io.IOException -> La2
                            android.content.Context r1 = (android.content.Context) r1     // Catch: java.lang.IllegalArgumentException -> La0 java.io.IOException -> La2
                            com.google.android.gms.internal.ads.Wr r2 = com.google.android.gms.internal.ads.Wr.f(r1)     // Catch: java.lang.IllegalArgumentException -> La0 java.io.IOException -> La2
                            r9.getClass()     // Catch: java.lang.IllegalArgumentException -> La0 java.io.IOException -> La2
                            java.lang.String r5 = r9.f1075a     // Catch: java.lang.IllegalArgumentException -> La0 java.io.IOException -> La2
                            r5.getClass()     // Catch: java.lang.IllegalArgumentException -> La0 java.io.IOException -> La2
                            java.lang.Object r1 = r0.f6392e     // Catch: java.lang.IllegalArgumentException -> La0 java.io.IOException -> La2
                            android.content.Context r1 = (android.content.Context) r1     // Catch: java.lang.IllegalArgumentException -> La0 java.io.IOException -> La2
                            java.lang.String r6 = r1.getPackageName()     // Catch: java.lang.IllegalArgumentException -> La0 java.io.IOException -> La2
                            com.google.android.gms.internal.ads.n6 r1 = com.google.android.gms.internal.ads.AbstractC1066q6.f10113H2     // Catch: java.lang.IllegalArgumentException -> La0 java.io.IOException -> La2
                            O1.r r3 = O1.r.d     // Catch: java.lang.IllegalArgumentException -> La0 java.io.IOException -> La2
                            com.google.android.gms.internal.ads.p6 r3 = r3.c     // Catch: java.lang.IllegalArgumentException -> La0 java.io.IOException -> La2
                            java.lang.Object r1 = r3.a(r1)     // Catch: java.lang.IllegalArgumentException -> La0 java.io.IOException -> La2
                            java.lang.Long r1 = (java.lang.Long) r1     // Catch: java.lang.IllegalArgumentException -> La0 java.io.IOException -> La2
                            long r3 = r1.longValue()     // Catch: java.lang.IllegalArgumentException -> La0 java.io.IOException -> La2
                            boolean r7 = r0.c     // Catch: java.lang.IllegalArgumentException -> La0 java.io.IOException -> La2
                            r2.getClass()     // Catch: java.lang.IllegalArgumentException -> La0 java.io.IOException -> La2
                            java.lang.Class<com.google.android.gms.internal.ads.Wr> r1 = com.google.android.gms.internal.ads.Wr.class
                            monitor-enter(r1)     // Catch: java.lang.IllegalArgumentException -> La0 java.io.IOException -> La2
                            N1.d r0 = r2.a(r3, r5, r6, r7)     // Catch: java.lang.Throwable -> L9d
                            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9d
                            r1 = r0
                            goto Lb2
                        L9d:
                            r0 = move-exception
                            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9d
                            throw r0     // Catch: java.lang.IllegalArgumentException -> La0 java.io.IOException -> La2
                        La0:
                            r0 = move-exception
                            goto La3
                        La2:
                            r0 = move-exception
                        La3:
                            java.lang.String r1 = "AdIdInfoSignalSource.getPaidV1"
                            N1.n r2 = N1.n.f1204A
                            com.google.android.gms.internal.ads.pc r2 = r2.f1209g
                            r2.h(r1, r0)
                            N1.d r1 = new N1.d
                            r0 = 7
                            r1.<init>(r0)
                        Lb2:
                            com.google.android.gms.internal.ads.Pn r0 = new com.google.android.gms.internal.ads.Pn
                            r2 = 0
                            r3 = 2
                            r0.<init>(r9, r2, r1, r3)
                            return r0
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.Mo.apply(java.lang.Object):java.lang.Object");
                    }
                };
                Executor executor = this.f6393f;
                C1310vu m02 = Bs.m0(q4, as, executor);
                final int i5 = 1;
                return Bs.Z((Ku) Bs.o0(m02, ((Long) rVar.c.a(AbstractC1066q6.f10124K0)).longValue(), TimeUnit.MILLISECONDS, this.d), Throwable.class, new As(this) { // from class: com.google.android.gms.internal.ads.Mo

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ No f6273b;

                    {
                        this.f6273b = this;
                    }

                    @Override // com.google.android.gms.internal.ads.As
                    public final Object apply(Object obj) {
                        /*  JADX ERROR: Method code generation error
                            java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.IContainer.get(jadx.api.plugins.input.data.attributes.IJadxAttrType)" because "cont" is null
                            	at jadx.core.codegen.RegionGen.declareVars(RegionGen.java:70)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:65)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                            */
                        /*
                            this = this;
                            int r0 = r2
                            switch(r0) {
                                case 0: goto L30;
                                default: goto L5;
                            }
                        L5:
                            com.google.android.gms.internal.ads.No r0 = r8.f6273b
                            java.lang.Throwable r9 = (java.lang.Throwable) r9
                            r0.getClass()
                            O1.p r9 = O1.C0081p.f1374f
                            com.google.android.gms.internal.ads.wc r9 = r9.f1375a
                            java.lang.Object r9 = r0.f6392e
                            android.content.Context r9 = (android.content.Context) r9
                            android.content.ContentResolver r9 = r9.getContentResolver()
                            r0 = 0
                            if (r9 != 0) goto L1d
                            r9 = r0
                            goto L23
                        L1d:
                            java.lang.String r1 = "android_id"
                            java.lang.String r9 = android.provider.Settings.Secure.getString(r9, r1)
                        L23:
                            com.google.android.gms.internal.ads.Pn r1 = new com.google.android.gms.internal.ads.Pn
                            N1.d r2 = new N1.d
                            r3 = 7
                            r2.<init>(r3)
                            r3 = 2
                            r1.<init>(r0, r9, r2, r3)
                            return r1
                        L30:
                            com.google.android.gms.internal.ads.No r0 = r8.f6273b
                            L1.a r9 = (L1.a) r9
                            N1.d r1 = new N1.d
                            r2 = 7
                            r1.<init>(r2)
                            boolean r2 = r0.f6391b
                            if (r2 != 0) goto L50
                            com.google.android.gms.internal.ads.n6 r2 = com.google.android.gms.internal.ads.AbstractC1066q6.f10085B2
                            O1.r r3 = O1.r.d
                            com.google.android.gms.internal.ads.p6 r3 = r3.c
                            java.lang.Object r2 = r3.a(r2)
                            java.lang.Boolean r2 = (java.lang.Boolean) r2
                            boolean r2 = r2.booleanValue()
                            if (r2 != 0) goto L66
                        L50:
                            boolean r2 = r0.f6391b
                            if (r2 == 0) goto Lb2
                            com.google.android.gms.internal.ads.n6 r2 = com.google.android.gms.internal.ads.AbstractC1066q6.f10090C2
                            O1.r r3 = O1.r.d
                            com.google.android.gms.internal.ads.p6 r3 = r3.c
                            java.lang.Object r2 = r3.a(r2)
                            java.lang.Boolean r2 = (java.lang.Boolean) r2
                            boolean r2 = r2.booleanValue()
                            if (r2 == 0) goto Lb2
                        L66:
                            java.lang.Object r1 = r0.f6392e     // Catch: java.lang.IllegalArgumentException -> La0 java.io.IOException -> La2
                            android.content.Context r1 = (android.content.Context) r1     // Catch: java.lang.IllegalArgumentException -> La0 java.io.IOException -> La2
                            com.google.android.gms.internal.ads.Wr r2 = com.google.android.gms.internal.ads.Wr.f(r1)     // Catch: java.lang.IllegalArgumentException -> La0 java.io.IOException -> La2
                            r9.getClass()     // Catch: java.lang.IllegalArgumentException -> La0 java.io.IOException -> La2
                            java.lang.String r5 = r9.f1075a     // Catch: java.lang.IllegalArgumentException -> La0 java.io.IOException -> La2
                            r5.getClass()     // Catch: java.lang.IllegalArgumentException -> La0 java.io.IOException -> La2
                            java.lang.Object r1 = r0.f6392e     // Catch: java.lang.IllegalArgumentException -> La0 java.io.IOException -> La2
                            android.content.Context r1 = (android.content.Context) r1     // Catch: java.lang.IllegalArgumentException -> La0 java.io.IOException -> La2
                            java.lang.String r6 = r1.getPackageName()     // Catch: java.lang.IllegalArgumentException -> La0 java.io.IOException -> La2
                            com.google.android.gms.internal.ads.n6 r1 = com.google.android.gms.internal.ads.AbstractC1066q6.f10113H2     // Catch: java.lang.IllegalArgumentException -> La0 java.io.IOException -> La2
                            O1.r r3 = O1.r.d     // Catch: java.lang.IllegalArgumentException -> La0 java.io.IOException -> La2
                            com.google.android.gms.internal.ads.p6 r3 = r3.c     // Catch: java.lang.IllegalArgumentException -> La0 java.io.IOException -> La2
                            java.lang.Object r1 = r3.a(r1)     // Catch: java.lang.IllegalArgumentException -> La0 java.io.IOException -> La2
                            java.lang.Long r1 = (java.lang.Long) r1     // Catch: java.lang.IllegalArgumentException -> La0 java.io.IOException -> La2
                            long r3 = r1.longValue()     // Catch: java.lang.IllegalArgumentException -> La0 java.io.IOException -> La2
                            boolean r7 = r0.c     // Catch: java.lang.IllegalArgumentException -> La0 java.io.IOException -> La2
                            r2.getClass()     // Catch: java.lang.IllegalArgumentException -> La0 java.io.IOException -> La2
                            java.lang.Class<com.google.android.gms.internal.ads.Wr> r1 = com.google.android.gms.internal.ads.Wr.class
                            monitor-enter(r1)     // Catch: java.lang.IllegalArgumentException -> La0 java.io.IOException -> La2
                            N1.d r0 = r2.a(r3, r5, r6, r7)     // Catch: java.lang.Throwable -> L9d
                            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9d
                            r1 = r0
                            goto Lb2
                        L9d:
                            r0 = move-exception
                            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9d
                            throw r0     // Catch: java.lang.IllegalArgumentException -> La0 java.io.IOException -> La2
                        La0:
                            r0 = move-exception
                            goto La3
                        La2:
                            r0 = move-exception
                        La3:
                            java.lang.String r1 = "AdIdInfoSignalSource.getPaidV1"
                            N1.n r2 = N1.n.f1204A
                            com.google.android.gms.internal.ads.pc r2 = r2.f1209g
                            r2.h(r1, r0)
                            N1.d r1 = new N1.d
                            r0 = 7
                            r1.<init>(r0)
                        Lb2:
                            com.google.android.gms.internal.ads.Pn r0 = new com.google.android.gms.internal.ads.Pn
                            r2 = 0
                            r3 = 2
                            r0.<init>(r9, r2, r1, r3)
                            return r0
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.Mo.apply(java.lang.Object):java.lang.Object");
                    }
                }, executor);
            default:
                Su su = (Su) this.f6393f;
                if ((!((Boolean) O1.r.d.c.a(AbstractC1066q6.q6)).booleanValue() || !this.c) && this.f6391b) {
                    return Bs.Z(Bs.o0(Bs.m0(Pu.f6608p, C0932n1.f9708r, su), ((Long) AbstractC0426b7.f8206a.r()).longValue(), TimeUnit.MILLISECONDS, this.d), Exception.class, new C0563eb(8, this), su);
                }
                return Pu.f6608p;
        }
    }
}
