package com.google.android.gms.internal.ads;

import c3.InterfaceFutureC0239a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.eu, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractRunnableC0582eu extends Ju implements Runnable {

    /* renamed from: v, reason: collision with root package name */
    public InterfaceFutureC0239a f8656v;

    /* renamed from: w, reason: collision with root package name */
    public Class f8657w;

    /* renamed from: x, reason: collision with root package name */
    public Object f8658x;

    public AbstractRunnableC0582eu(InterfaceFutureC0239a interfaceFutureC0239a, Class cls, Object obj) {
        interfaceFutureC0239a.getClass();
        this.f8656v = interfaceFutureC0239a;
        this.f8657w = cls;
        this.f8658x = obj;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1138ru
    public final String d() {
        InterfaceFutureC0239a interfaceFutureC0239a = this.f8656v;
        Class cls = this.f8657w;
        Object obj = this.f8658x;
        String d = super.d();
        String k3 = interfaceFutureC0239a != null ? U.a.k("inputFuture=[", interfaceFutureC0239a.toString(), "], ") : "";
        if (cls == null || obj == null) {
            if (d != null) {
                return k3.concat(d);
            }
            return null;
        }
        return k3 + "exceptionType=[" + cls.toString() + "], fallback=[" + obj.toString() + "]";
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1138ru
    public final void e() {
        j(this.f8656v);
        this.f8656v = null;
        this.f8657w = null;
        this.f8658x = null;
    }

    public abstract Object r(Object obj, Throwable th);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007e  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r9 = this;
            c3.a r0 = r9.f8656v
            java.lang.Class r1 = r9.f8657w
            java.lang.Object r2 = r9.f8658x
            r3 = 0
            r4 = 1
            if (r0 != 0) goto Lc
            r5 = r4
            goto Ld
        Lc:
            r5 = r3
        Ld:
            if (r1 != 0) goto L11
            r6 = r4
            goto L12
        L11:
            r6 = r3
        L12:
            r5 = r5 | r6
            if (r2 != 0) goto L16
            r3 = r4
        L16:
            r3 = r3 | r5
            if (r3 != 0) goto Lad
            java.lang.Object r3 = r9.f10548o
            boolean r3 = r3 instanceof com.google.android.gms.internal.ads.C0625fu
            if (r3 == 0) goto L21
            goto Lad
        L21:
            r3 = 0
            r9.f8656v = r3
            boolean r4 = r0 instanceof com.google.android.gms.internal.ads.AbstractC0540dv     // Catch: java.lang.Error -> L30 java.lang.RuntimeException -> L32 java.util.concurrent.ExecutionException -> L34
            if (r4 == 0) goto L36
            r4 = r0
            com.google.android.gms.internal.ads.dv r4 = (com.google.android.gms.internal.ads.AbstractC0540dv) r4     // Catch: java.lang.Error -> L30 java.lang.RuntimeException -> L32 java.util.concurrent.ExecutionException -> L34
            java.lang.Throwable r4 = r4.b()     // Catch: java.lang.Error -> L30 java.lang.RuntimeException -> L32 java.util.concurrent.ExecutionException -> L34
            goto L37
        L30:
            r4 = move-exception
            goto L3e
        L32:
            r4 = move-exception
            goto L3e
        L34:
            r4 = move-exception
            goto L40
        L36:
            r4 = r3
        L37:
            if (r4 != 0) goto L3e
            java.lang.Object r5 = com.google.android.gms.internal.ads.Bs.p0(r0)     // Catch: java.lang.Error -> L30 java.lang.RuntimeException -> L32 java.util.concurrent.ExecutionException -> L34
            goto L78
        L3e:
            r5 = r3
            goto L78
        L40:
            java.lang.Throwable r5 = r4.getCause()
            if (r5 != 0) goto L76
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.Class r6 = r0.getClass()
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Future type "
            r7.<init>(r8)
            r7.append(r6)
            java.lang.String r6 = " threw "
            r7.append(r6)
            r7.append(r4)
            java.lang.String r4 = " without a cause"
            r7.append(r4)
            java.lang.String r4 = r7.toString()
            r5.<init>(r4)
        L76:
            r4 = r5
            goto L3e
        L78:
            if (r4 != 0) goto L7e
            r9.f(r5)
            return
        L7e:
            boolean r1 = r1.isInstance(r4)
            if (r1 == 0) goto Laa
            java.lang.Object r0 = r9.r(r2, r4)     // Catch: java.lang.Throwable -> L90
            r9.f8657w = r3
            r9.f8658x = r3
            r9.s(r0)
            return
        L90:
            r0 = move-exception
            boolean r1 = r0 instanceof java.lang.InterruptedException     // Catch: java.lang.Throwable -> La4
            if (r1 == 0) goto L9c
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> La4
            r1.interrupt()     // Catch: java.lang.Throwable -> La4
        L9c:
            r9.g(r0)     // Catch: java.lang.Throwable -> La4
            r9.f8657w = r3
            r9.f8658x = r3
            return
        La4:
            r0 = move-exception
            r9.f8657w = r3
            r9.f8658x = r3
            throw r0
        Laa:
            r9.k(r0)
        Lad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.AbstractRunnableC0582eu.run():void");
    }

    public abstract void s(Object obj);
}
