package C0;

import java.util.Comparator;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class i0 implements Comparator {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f330o;

    public /* synthetic */ i0(int i4) {
        this.f330o = i4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x007b, code lost:
    
        if (r0 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:?, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:?, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0084, code lost:
    
        if (r0 != false) goto L36;
     */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int compare(java.lang.Object r7, java.lang.Object r8) {
        /*
            r6 = this;
            int r0 = r6.f330o
            r1 = 0
            r2 = 1
            r3 = -1
            switch(r0) {
                case 0: goto La9;
                case 1: goto L9c;
                case 2: goto L67;
                case 3: goto L49;
                case 4: goto L3c;
                case 5: goto L2f;
                case 6: goto L22;
                default: goto L8;
            }
        L8:
            android.view.View r7 = (android.view.View) r7
            android.view.View r8 = (android.view.View) r8
            java.util.WeakHashMap r0 = H.A.f779a
            float r7 = H.AbstractC0044t.f(r7)
            float r8 = H.AbstractC0044t.f(r8)
            int r0 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r0 <= 0) goto L1c
            r1 = r3
            goto L21
        L1c:
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 >= 0) goto L21
            r1 = r2
        L21:
            return r1
        L22:
            i1.d r7 = (i1.d) r7
            i1.d r8 = (i1.d) r8
            java.util.Date r8 = r8.f13262f
            java.util.Date r7 = r7.f13262f
            int r7 = r8.compareTo(r7)
            return r7
        L2f:
            i1.d r7 = (i1.d) r7
            i1.d r8 = (i1.d) r8
            java.util.Date r8 = r8.f13262f
            java.util.Date r7 = r7.f13262f
            int r7 = r8.compareTo(r7)
            return r7
        L3c:
            c1.c r7 = (c1.C0234c) r7
            c1.c r8 = (c1.C0234c) r8
            int r7 = r7.f3548q
            int r8 = r8.f3548q
            int r7 = java.lang.Integer.compare(r7, r8)
            return r7
        L49:
            l1.d r7 = (l1.C1797d) r7
            l1.d r8 = (l1.C1797d) r8
            long r0 = r8.f13945f
            long r2 = r8.f13944e
            long r0 = r0 + r2
            long r2 = r7.f13945f
            long r4 = r7.f13944e
            long r2 = r2 + r4
            int r0 = java.lang.Long.compare(r0, r2)
            if (r0 == 0) goto L5e
            goto L66
        L5e:
            java.util.Date r8 = r8.c
            java.util.Date r7 = r7.c
            int r0 = r8.compareTo(r7)
        L66:
            return r0
        L67:
            b0.k r7 = (b0.C0198k) r7
            b0.k r8 = (b0.C0198k) r8
            androidx.recyclerview.widget.RecyclerView r0 = r7.d
            if (r0 != 0) goto L71
            r4 = r2
            goto L72
        L71:
            r4 = r1
        L72:
            androidx.recyclerview.widget.RecyclerView r5 = r8.d
            if (r5 != 0) goto L78
            r5 = r2
            goto L79
        L78:
            r5 = r1
        L79:
            if (r4 == r5) goto L7e
            if (r0 != 0) goto L86
            goto L88
        L7e:
            boolean r0 = r7.f3331a
            boolean r4 = r8.f3331a
            if (r0 == r4) goto L8a
            if (r0 == 0) goto L88
        L86:
            r1 = r3
            goto L9b
        L88:
            r1 = r2
            goto L9b
        L8a:
            int r0 = r8.f3332b
            int r2 = r7.f3332b
            int r0 = r0 - r2
            if (r0 == 0) goto L93
            r1 = r0
            goto L9b
        L93:
            int r7 = r7.c
            int r8 = r8.c
            int r7 = r7 - r8
            if (r7 == 0) goto L9b
            r1 = r7
        L9b:
            return r1
        L9c:
            i1.d r7 = (i1.d) r7
            i1.d r8 = (i1.d) r8
            java.util.Date r8 = r8.f13262f
            java.util.Date r7 = r7.f13262f
            int r7 = r8.compareTo(r7)
            return r7
        La9:
            i1.d r7 = (i1.d) r7
            i1.d r8 = (i1.d) r8
            java.util.Date r8 = r8.f13262f
            java.util.Date r7 = r7.f13262f
            int r7 = r8.compareTo(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: C0.i0.compare(java.lang.Object, java.lang.Object):int");
    }
}
