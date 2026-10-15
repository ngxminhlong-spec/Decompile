package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Lt implements Map, Serializable {

    /* renamed from: u, reason: collision with root package name */
    public static final Lt f6175u = new Lt(null, new Object[0], 0);

    /* renamed from: o, reason: collision with root package name */
    public transient It f6176o;

    /* renamed from: p, reason: collision with root package name */
    public transient Jt f6177p;

    /* renamed from: q, reason: collision with root package name */
    public transient Kt f6178q;

    /* renamed from: r, reason: collision with root package name */
    public final transient Object f6179r;

    /* renamed from: s, reason: collision with root package name */
    public final transient Object[] f6180s;

    /* renamed from: t, reason: collision with root package name */
    public final transient int f6181t;

    public Lt(Object obj, Object[] objArr, int i4) {
        this.f6179r = obj;
        this.f6180s = objArr;
        this.f6181t = i4;
    }

    public static Lt a(HashMap hashMap) {
        int size;
        Object[] objArr;
        int length;
        int size2;
        Set<Map.Entry> entrySet = hashMap.entrySet();
        boolean z4 = entrySet instanceof Collection;
        J2 j22 = new J2(z4 ? entrySet.size() : 4);
        if (z4 && (size2 = (size = entrySet.size()) + size) > (length = (objArr = (Object[]) j22.f5780q).length)) {
            j22.f5780q = Arrays.copyOf(objArr, AbstractC0880lt.d(length, size2));
        }
        for (Map.Entry entry : entrySet) {
            j22.a(entry.getKey(), entry.getValue());
        }
        return j22.k();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x019e  */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.Lt c(int r19, java.lang.Object[] r20, com.google.android.gms.internal.ads.J2 r21) {
        /*
            Method dump skipped, instructions count: 454
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.Lt.c(int, java.lang.Object[], com.google.android.gms.internal.ads.J2):com.google.android.gms.internal.ads.Lt");
    }

    @Override // java.util.Map
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final AbstractC1266ut entrySet() {
        It it = this.f6176o;
        if (it != null) {
            return it;
        }
        It it2 = new It(this, this.f6180s, this.f6181t);
        this.f6176o = it2;
        return it2;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        Kt kt = this.f6178q;
        if (kt == null) {
            kt = new Kt(this.f6180s, 1, this.f6181t);
            this.f6178q = kt;
        }
        return kt.contains(obj);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return Bs.I(obj, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x009f A[RETURN] */
    @Override // java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object get(java.lang.Object r10) {
        /*
            r9 = this;
            r0 = 0
            if (r10 != 0) goto L6
        L3:
            r10 = r0
            goto L9c
        L6:
            r1 = 1
            int r2 = r9.f6181t
            java.lang.Object[] r3 = r9.f6180s
            if (r2 != r1) goto L20
            r2 = 0
            r2 = r3[r2]
            r2.getClass()
            boolean r10 = r2.equals(r10)
            if (r10 == 0) goto L3
            r10 = r3[r1]
            r10.getClass()
            goto L9c
        L20:
            java.lang.Object r2 = r9.f6179r
            if (r2 != 0) goto L25
            goto L3
        L25:
            boolean r4 = r2 instanceof byte[]
            r5 = -1
            if (r4 == 0) goto L51
            r4 = r2
            byte[] r4 = (byte[]) r4
            int r2 = r4.length
            int r6 = r2 + (-1)
            int r2 = r10.hashCode()
            int r2 = com.google.android.gms.internal.ads.Bs.b(r2)
        L38:
            r2 = r2 & r6
            r5 = r4[r2]
            r7 = 255(0xff, float:3.57E-43)
            r5 = r5 & r7
            if (r5 != r7) goto L41
            goto L3
        L41:
            r7 = r3[r5]
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto L4e
            r10 = r5 ^ 1
            r10 = r3[r10]
            goto L9c
        L4e:
            int r2 = r2 + 1
            goto L38
        L51:
            boolean r4 = r2 instanceof short[]
            if (r4 == 0) goto L7d
            r4 = r2
            short[] r4 = (short[]) r4
            int r2 = r4.length
            int r6 = r2 + (-1)
            int r2 = r10.hashCode()
            int r2 = com.google.android.gms.internal.ads.Bs.b(r2)
        L63:
            r2 = r2 & r6
            short r5 = r4[r2]
            char r5 = (char) r5
            r7 = 65535(0xffff, float:9.1834E-41)
            if (r5 != r7) goto L6d
            goto L3
        L6d:
            r7 = r3[r5]
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto L7a
            r10 = r5 ^ 1
            r10 = r3[r10]
            goto L9c
        L7a:
            int r2 = r2 + 1
            goto L63
        L7d:
            int[] r2 = (int[]) r2
            int r4 = r2.length
            int r4 = r4 + r5
            int r6 = r10.hashCode()
            int r6 = com.google.android.gms.internal.ads.Bs.b(r6)
        L89:
            r6 = r6 & r4
            r7 = r2[r6]
            if (r7 != r5) goto L90
            goto L3
        L90:
            r8 = r3[r7]
            boolean r8 = r10.equals(r8)
            if (r8 == 0) goto La0
            r10 = r7 ^ 1
            r10 = r3[r10]
        L9c:
            if (r10 != 0) goto L9f
            return r0
        L9f:
            return r10
        La0:
            int r6 = r6 + 1
            goto L89
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.Lt.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return Bs.d(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        Jt jt = this.f6177p;
        if (jt != null) {
            return jt;
        }
        Jt jt2 = new Jt(this, new Kt(this.f6180s, 0, this.f6181t));
        this.f6177p = jt2;
        return jt2;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final int size() {
        return this.f6181t;
    }

    public final String toString() {
        int i4 = this.f6181t;
        Bs.n("size", i4);
        StringBuilder sb = new StringBuilder((int) Math.min(i4 * 8, 1073741824L));
        sb.append('{');
        Iterator it = ((It) entrySet()).iterator();
        boolean z4 = true;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!z4) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z4 = false;
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        Kt kt = this.f6178q;
        if (kt != null) {
            return kt;
        }
        Kt kt2 = new Kt(this.f6180s, 1, this.f6181t);
        this.f6178q = kt2;
        return kt2;
    }
}
