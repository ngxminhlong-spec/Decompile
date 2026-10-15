package com.google.android.gms.internal.play_billing;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.play_billing.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1625m implements Map, Serializable {

    /* renamed from: u, reason: collision with root package name */
    public static final C1625m f12226u = new C1625m(null, new Object[0], 0);

    /* renamed from: o, reason: collision with root package name */
    public transient C1619j f12227o;

    /* renamed from: p, reason: collision with root package name */
    public transient C1621k f12228p;

    /* renamed from: q, reason: collision with root package name */
    public transient C1623l f12229q;

    /* renamed from: r, reason: collision with root package name */
    public final transient Object f12230r;

    /* renamed from: s, reason: collision with root package name */
    public final transient Object[] f12231s;

    /* renamed from: t, reason: collision with root package name */
    public final transient int f12232t;

    public C1625m(Object obj, Object[] objArr, int i4) {
        this.f12230r = obj;
        this.f12231s = objArr;
        this.f12232t = i4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01be  */
    /* JADX WARN: Type inference failed for: r16v10 */
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
    public static com.google.android.gms.internal.play_billing.C1625m a(int r19, java.lang.Object[] r20, androidx.activity.result.c r21) {
        /*
            Method dump skipped, instructions count: 494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.C1625m.a(int, java.lang.Object[], androidx.activity.result.c):com.google.android.gms.internal.play_billing.m");
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
        C1623l c1623l = this.f12229q;
        if (c1623l == null) {
            c1623l = new C1623l(this.f12231s, 1, this.f12232t);
            this.f12229q = c1623l;
        }
        return c1623l.contains(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        C1619j c1619j = this.f12227o;
        if (c1619j != null) {
            return c1619j;
        }
        C1619j c1619j2 = new C1619j(this, this.f12231s, this.f12232t);
        this.f12227o = c1619j2;
        return c1619j2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
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
            int r2 = r9.f12232t
            java.lang.Object[] r3 = r9.f12231s
            if (r2 != r1) goto L20
            r2 = 0
            r2 = r3[r2]
            java.util.Objects.requireNonNull(r2)
            boolean r10 = r2.equals(r10)
            if (r10 == 0) goto L3
            r10 = r3[r1]
            java.util.Objects.requireNonNull(r10)
            goto L9c
        L20:
            java.lang.Object r2 = r9.f12230r
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
            int r2 = com.google.android.gms.internal.play_billing.B.V(r2)
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
            int r2 = com.google.android.gms.internal.play_billing.B.V(r2)
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
            int r6 = com.google.android.gms.internal.play_billing.B.V(r6)
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.C1625m.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        C1619j c1619j = this.f12227o;
        if (c1619j == null) {
            c1619j = new C1619j(this, this.f12231s, this.f12232t);
            this.f12227o = c1619j;
        }
        Iterator it = c1619j.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i4 += next != null ? next.hashCode() : 0;
        }
        return i4;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        C1621k c1621k = this.f12228p;
        if (c1621k != null) {
            return c1621k;
        }
        C1621k c1621k2 = new C1621k(this, new C1623l(this.f12231s, 0, this.f12232t));
        this.f12228p = c1621k2;
        return c1621k2;
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
        return this.f12232t;
    }

    public final String toString() {
        int i4 = this.f12232t;
        if (i4 < 0) {
            throw new IllegalArgumentException(U.a.i("size cannot be negative but was: ", i4));
        }
        StringBuilder sb = new StringBuilder((int) Math.min(i4 * 8, 1073741824L));
        sb.append('{');
        Iterator it = ((C1619j) entrySet()).iterator();
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
        C1623l c1623l = this.f12229q;
        if (c1623l != null) {
            return c1623l;
        }
        C1623l c1623l2 = new C1623l(this.f12231s, 1, this.f12232t);
        this.f12229q = c1623l2;
        return c1623l2;
    }
}
