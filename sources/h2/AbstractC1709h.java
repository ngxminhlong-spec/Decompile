package h2;

import android.accounts.Account;
import java.util.Collections;
import java.util.Set;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: h2.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1709h extends AbstractC1706e implements f2.c {

    /* renamed from: M, reason: collision with root package name */
    public final Set f13206M;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AbstractC1709h(android.content.Context r10, android.os.Looper r11, int r12, N1.l r13, f2.g r14, f2.h r15) {
        /*
            r9 = this;
            h2.I r3 = h2.I.a(r10)
            e2.e r4 = e2.e.d
            h2.y.i(r14)
            h2.y.i(r15)
            h2.k r6 = new h2.k
            r6.<init>(r14)
            h2.k r7 = new h2.k
            r7.<init>(r15)
            java.lang.Object r14 = r13.f1191r
            r8 = r14
            java.lang.String r8 = (java.lang.String) r8
            r0 = r9
            r1 = r10
            r2 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.Object r10 = r13.f1192s
            java.util.Set r10 = (java.util.Set) r10
            java.util.Iterator r11 = r10.iterator()
        L2a:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L45
            java.lang.Object r12 = r11.next()
            com.google.android.gms.common.api.Scope r12 = (com.google.android.gms.common.api.Scope) r12
            boolean r12 = r10.contains(r12)
            if (r12 == 0) goto L3d
            goto L2a
        L3d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "Expanding scopes is not permitted, use implied scopes instead"
            r10.<init>(r11)
            throw r10
        L45:
            r0.f13206M = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h2.AbstractC1709h.<init>(android.content.Context, android.os.Looper, int, N1.l, f2.g, f2.h):void");
    }

    @Override // f2.c
    public final Set c() {
        return l() ? this.f13206M : Collections.EMPTY_SET;
    }

    @Override // h2.AbstractC1706e
    public final Account p() {
        return null;
    }

    @Override // h2.AbstractC1706e
    public final Set s() {
        return this.f13206M;
    }
}
