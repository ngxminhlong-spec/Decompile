package Y3;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2239a = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "_next$volatile");

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2240b = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "_prev$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "_removedRef$volatile");
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003e, code lost:
    
        r6 = ((Y3.p) r6).f2249a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0046, code lost:
    
        if (r5.compareAndSet(r4, r3, r6) == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004e, code lost:
    
        if (r5.get(r4) == r3) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final Y3.j f() {
        /*
            r9 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = Y3.j.f2240b
            java.lang.Object r1 = r0.get(r9)
            Y3.j r1 = (Y3.j) r1
            r2 = 0
            r3 = r1
        La:
            r4 = r2
        Lb:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = Y3.j.f2239a
            java.lang.Object r6 = r5.get(r3)
            if (r6 != r9) goto L24
            if (r1 != r3) goto L16
            goto L2d
        L16:
            boolean r2 = r0.compareAndSet(r9, r1, r3)
            if (r2 == 0) goto L1d
            goto L2d
        L1d:
            java.lang.Object r2 = r0.get(r9)
            if (r2 == r1) goto L16
            goto L0
        L24:
            boolean r7 = r9.j()
            if (r7 == 0) goto L2b
            return r2
        L2b:
            if (r6 != 0) goto L2e
        L2d:
            return r3
        L2e:
            boolean r7 = r6 instanceof Y3.o
            if (r7 == 0) goto L38
            Y3.o r6 = (Y3.o) r6
            r6.a(r3)
            goto L0
        L38:
            boolean r7 = r6 instanceof Y3.p
            if (r7 == 0) goto L58
            if (r4 == 0) goto L51
            Y3.p r6 = (Y3.p) r6
            Y3.j r6 = r6.f2249a
        L42:
            boolean r7 = r5.compareAndSet(r4, r3, r6)
            if (r7 == 0) goto L4a
            r3 = r4
            goto La
        L4a:
            java.lang.Object r7 = r5.get(r4)
            if (r7 == r3) goto L42
            goto L0
        L51:
            java.lang.Object r3 = r0.get(r3)
            Y3.j r3 = (Y3.j) r3
            goto Lb
        L58:
            java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
            S3.e.c(r6, r4)
            r4 = r6
            Y3.j r4 = (Y3.j) r4
            r8 = r4
            r4 = r3
            r3 = r8
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: Y3.j.f():Y3.j");
    }

    public final void g(j jVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2240b;
            j jVar2 = (j) atomicReferenceFieldUpdater.get(jVar);
            if (h() != jVar) {
                return;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(jVar, jVar2, this)) {
                if (atomicReferenceFieldUpdater.get(jVar) != jVar2) {
                    break;
                }
            }
            if (j()) {
                jVar.f();
                return;
            }
            return;
        }
    }

    public final Object h() {
        while (true) {
            Object obj = f2239a.get(this);
            if (!(obj instanceof o)) {
                return obj;
            }
            ((o) obj).a(this);
        }
    }

    public final j i() {
        j jVar;
        Object h4 = h();
        p pVar = h4 instanceof p ? (p) h4 : null;
        if (pVar != null && (jVar = pVar.f2249a) != null) {
            return jVar;
        }
        S3.e.c(h4, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        return (j) h4;
    }

    public boolean j() {
        return h() instanceof p;
    }

    public String toString() {
        return new i(this) + '@' + W3.r.d(this);
    }
}
