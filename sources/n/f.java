package n;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class f implements Iterable {

    /* renamed from: o, reason: collision with root package name */
    public c f14067o;

    /* renamed from: p, reason: collision with root package name */
    public c f14068p;

    /* renamed from: q, reason: collision with root package name */
    public final WeakHashMap f14069q = new WeakHashMap();

    /* renamed from: r, reason: collision with root package name */
    public int f14070r = 0;

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0048, code lost:
    
        if (r3.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0050, code lost:
    
        if (((n.b) r7).hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0052, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0053, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r7 != r6) goto L4
            return r0
        L4:
            boolean r1 = r7 instanceof n.f
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            n.f r7 = (n.f) r7
            int r1 = r6.f14070r
            int r3 = r7.f14070r
            if (r1 == r3) goto L13
            return r2
        L13:
            java.util.Iterator r1 = r6.iterator()
            java.util.Iterator r7 = r7.iterator()
        L1b:
            r3 = r1
            n.b r3 = (n.b) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L44
            r4 = r7
            n.b r4 = (n.b) r4
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L44
            java.lang.Object r3 = r3.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r4.next()
            if (r3 != 0) goto L3b
            if (r4 != 0) goto L43
        L3b:
            if (r3 == 0) goto L1b
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L1b
        L43:
            return r2
        L44:
            boolean r1 = r3.hasNext()
            if (r1 != 0) goto L53
            n.b r7 = (n.b) r7
            boolean r7 = r7.hasNext()
            if (r7 != 0) goto L53
            return r0
        L53:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: n.f.equals(java.lang.Object):boolean");
    }

    public c g(Object obj) {
        c cVar = this.f14067o;
        while (cVar != null && !cVar.f14060o.equals(obj)) {
            cVar = cVar.f14062q;
        }
        return cVar;
    }

    public Object h(Object obj) {
        c g4 = g(obj);
        if (g4 == null) {
            return null;
        }
        this.f14070r--;
        WeakHashMap weakHashMap = this.f14069q;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((e) it.next()).a(g4);
            }
        }
        c cVar = g4.f14063r;
        if (cVar != null) {
            cVar.f14062q = g4.f14062q;
        } else {
            this.f14067o = g4.f14062q;
        }
        c cVar2 = g4.f14062q;
        if (cVar2 != null) {
            cVar2.f14063r = cVar;
        } else {
            this.f14068p = cVar;
        }
        g4.f14062q = null;
        g4.f14063r = null;
        return g4.f14061p;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int i4 = 0;
        while (true) {
            b bVar = (b) it;
            if (!bVar.hasNext()) {
                return i4;
            }
            i4 += ((Map.Entry) bVar.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        b bVar = new b(this.f14067o, this.f14068p, 0);
        this.f14069q.put(bVar, Boolean.FALSE);
        return bVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            b bVar = (b) it;
            if (!bVar.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) bVar.next()).toString());
            if (bVar.hasNext()) {
                sb.append(", ");
            }
        }
    }
}
