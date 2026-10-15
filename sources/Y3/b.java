package Y3;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class b extends o {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2223a = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_consensus$volatile");
    private volatile /* synthetic */ Object _consensus$volatile = a.f2220a;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        r1 = r0.get(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x001b, code lost:
    
        r1 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r1 != r2) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0019, code lost:
    
        if (r0.compareAndSet(r4, r2, r3) == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if (r0.get(r4) == r2) goto L17;
     */
    @Override // Y3.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.Object r5) {
        /*
            r4 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = Y3.b.f2223a
            java.lang.Object r1 = r0.get(r4)
            B0.a r2 = Y3.a.f2220a
            if (r1 != r2) goto L28
            B0.a r3 = r4.c(r5)
            java.lang.Object r1 = r0.get(r4)
            if (r1 == r2) goto L15
            goto L28
        L15:
            boolean r1 = r0.compareAndSet(r4, r2, r3)
            if (r1 == 0) goto L1d
            r1 = r3
            goto L28
        L1d:
            java.lang.Object r1 = r0.get(r4)
            if (r1 == r2) goto L15
            java.lang.Object r0 = r0.get(r4)
            r1 = r0
        L28:
            r4.b(r5, r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y3.b.a(java.lang.Object):java.lang.Object");
    }

    public abstract void b(Object obj, Object obj2);

    public abstract B0.a c(Object obj);
}
