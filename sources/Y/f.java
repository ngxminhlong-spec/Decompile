package Y;

import H.Y;
import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.TopicsManager;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public final TopicsManager f2146a;

    public f(TopicsManager topicsManager) {
        S3.e.e(topicsManager, "mTopicsManager");
        this.f2146a = topicsManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x007e A[LOOP:0: B:11:0x0078->B:13:0x007e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object c(Y.f r6, Y.a r7, L3.d r8) {
        /*
            boolean r0 = r8 instanceof Y.e
            if (r0 == 0) goto L13
            r0 = r8
            Y.e r0 = (Y.e) r0
            int r1 = r0.f2145u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2145u = r1
            goto L18
        L13:
            Y.e r0 = new Y.e
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f2143s
            int r1 = r0.f2145u
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            Y.f r6 = r0.f2142r
            m2.AbstractC1806a.R(r8)
            goto L5f
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            m2.AbstractC1806a.R(r8)
            android.adservices.topics.GetTopicsRequest r7 = r6.a(r7)
            r0.f2142r = r6
            r0.f2145u = r2
            W3.c r8 = new W3.c
            L3.d r0 = m2.AbstractC1806a.B(r0)
            r8.<init>(r0)
            r8.l()
            android.adservices.topics.TopicsManager r0 = r6.f2146a
            X.b r1 = new X.b
            r2 = 0
            r1.<init>(r2)
            D.c r2 = new D.c
            r2.<init>(r8)
            H.Y.r(r0, r7, r1, r2)
            java.lang.Object r8 = r8.k()
            M3.a r7 = M3.a.f1150o
            if (r8 != r7) goto L5f
            return r7
        L5f:
            android.adservices.topics.GetTopicsResponse r7 = H.Y.i(r8)
            r6.getClass()
            java.lang.String r6 = "response"
            S3.e.e(r7, r6)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.List r7 = H.Y.m(r7)
            java.util.Iterator r7 = r7.iterator()
        L78:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L9b
            java.lang.Object r8 = r7.next()
            android.adservices.topics.Topic r8 = H.Y.j(r8)
            Y.c r0 = new Y.c
            long r2 = H.Y.c(r8)
            long r4 = H.Y.s(r8)
            int r1 = H.Y.b(r8)
            r0.<init>(r1, r2, r4)
            r6.add(r0)
            goto L78
        L9b:
            Y.b r7 = new Y.b
            r7.<init>(r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.f.c(Y.f, Y.a, L3.d):java.lang.Object");
    }

    public GetTopicsRequest a(a aVar) {
        GetTopicsRequest.Builder adsSdkName;
        GetTopicsRequest build;
        S3.e.e(aVar, "request");
        adsSdkName = Y.e().setAdsSdkName("com.google.android.gms.ads");
        build = adsSdkName.build();
        S3.e.d(build, "Builder()\n            .s…ame)\n            .build()");
        return build;
    }

    public Object b(a aVar, L3.d dVar) {
        return c(this, aVar, dVar);
    }
}
