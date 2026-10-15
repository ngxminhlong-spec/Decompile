package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.ft, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0624ft extends AbstractMap implements Serializable {

    /* renamed from: x, reason: collision with root package name */
    public static final Object f8752x = new Object();

    /* renamed from: o, reason: collision with root package name */
    public transient Object f8753o;

    /* renamed from: p, reason: collision with root package name */
    public transient int[] f8754p;

    /* renamed from: q, reason: collision with root package name */
    public transient Object[] f8755q;

    /* renamed from: r, reason: collision with root package name */
    public transient Object[] f8756r;

    /* renamed from: s, reason: collision with root package name */
    public transient int f8757s = Math.min(Math.max(8, 1), 1073741823);

    /* renamed from: t, reason: collision with root package name */
    public transient int f8758t;

    /* renamed from: u, reason: collision with root package name */
    public transient C0496ct f8759u;

    /* renamed from: v, reason: collision with root package name */
    public transient C0496ct f8760v;

    /* renamed from: w, reason: collision with root package name */
    public transient Zs f8761w;

    public final Map a() {
        Object obj = this.f8753o;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public final void b(int i4, int i5) {
        Object obj = this.f8753o;
        obj.getClass();
        int[] iArr = this.f8754p;
        iArr.getClass();
        Object[] objArr = this.f8755q;
        objArr.getClass();
        Object[] objArr2 = this.f8756r;
        objArr2.getClass();
        int size = size();
        int i6 = size - 1;
        if (i4 >= i6) {
            objArr[i4] = null;
            objArr2[i4] = null;
            iArr[i4] = 0;
            return;
        }
        int i7 = i4 + 1;
        Object obj2 = objArr[i6];
        objArr[i4] = obj2;
        objArr2[i4] = objArr2[i6];
        objArr[i6] = null;
        objArr2[i6] = null;
        iArr[i4] = iArr[i6];
        iArr[i6] = 0;
        int v4 = Bs.v(obj2) & i5;
        int K2 = Bs.K(v4, obj);
        if (K2 == size) {
            Bs.a0(v4, i7, obj);
            return;
        }
        while (true) {
            int i8 = K2 - 1;
            int i9 = iArr[i8];
            int i10 = i9 & i5;
            if (i10 == size) {
                iArr[i8] = (i9 & (~i5)) | (i5 & i7);
                return;
            }
            K2 = i10;
        }
    }

    public final boolean c() {
        return this.f8753o == null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (c()) {
            return;
        }
        this.f8757s += 32;
        Map a4 = a();
        if (a4 != null) {
            this.f8757s = Math.min(Math.max(size(), 3), 1073741823);
            a4.clear();
            this.f8753o = null;
            this.f8758t = 0;
            return;
        }
        Object[] objArr = this.f8755q;
        objArr.getClass();
        Arrays.fill(objArr, 0, this.f8758t, (Object) null);
        Object[] objArr2 = this.f8756r;
        objArr2.getClass();
        Arrays.fill(objArr2, 0, this.f8758t, (Object) null);
        Object obj = this.f8753o;
        obj.getClass();
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        int[] iArr = this.f8754p;
        iArr.getClass();
        Arrays.fill(iArr, 0, this.f8758t, 0);
        this.f8758t = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map a4 = a();
        return a4 != null ? a4.containsKey(obj) : e(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map a4 = a();
        if (a4 != null) {
            return a4.containsValue(obj);
        }
        for (int i4 = 0; i4 < this.f8758t; i4++) {
            Object[] objArr = this.f8756r;
            objArr.getClass();
            if (Bs.r(obj, objArr[i4])) {
                return true;
            }
        }
        return false;
    }

    public final int d() {
        return (1 << (this.f8757s & 31)) - 1;
    }

    public final int e(Object obj) {
        if (c()) {
            return -1;
        }
        int v4 = Bs.v(obj);
        int d = d();
        Object obj2 = this.f8753o;
        obj2.getClass();
        int K2 = Bs.K(v4 & d, obj2);
        if (K2 != 0) {
            int i4 = ~d;
            int i5 = v4 & i4;
            do {
                int i6 = K2 - 1;
                int[] iArr = this.f8754p;
                iArr.getClass();
                int i7 = iArr[i6];
                if ((i7 & i4) == i5) {
                    Object[] objArr = this.f8755q;
                    objArr.getClass();
                    if (Bs.r(obj, objArr[i6])) {
                        return i6;
                    }
                }
                K2 = i7 & d;
            } while (K2 != 0);
        }
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        C0496ct c0496ct = this.f8760v;
        if (c0496ct != null) {
            return c0496ct;
        }
        C0496ct c0496ct2 = new C0496ct(0, this);
        this.f8760v = c0496ct2;
        return c0496ct2;
    }

    public final int f(int i4, int i5, int i6, int i7) {
        int i8 = i5 - 1;
        Object U4 = Bs.U(i5);
        if (i7 != 0) {
            Bs.a0(i6 & i8, i7 + 1, U4);
        }
        Object obj = this.f8753o;
        obj.getClass();
        int[] iArr = this.f8754p;
        iArr.getClass();
        for (int i9 = 0; i9 <= i4; i9++) {
            int K2 = Bs.K(i9, obj);
            while (K2 != 0) {
                int i10 = K2 - 1;
                int i11 = iArr[i10];
                int i12 = ((~i4) & i11) | i9;
                int i13 = i12 & i8;
                int K4 = Bs.K(i13, U4);
                Bs.a0(i13, K2, U4);
                iArr[i10] = ((~i8) & i12) | (K4 & i8);
                K2 = i11 & i4;
            }
        }
        this.f8753o = U4;
        this.f8757s = ((32 - Integer.numberOfLeadingZeros(i8)) & 31) | (this.f8757s & (-32));
        return i8;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map a4 = a();
        if (a4 != null) {
            return a4.get(obj);
        }
        int e4 = e(obj);
        if (e4 == -1) {
            return null;
        }
        Object[] objArr = this.f8756r;
        objArr.getClass();
        return objArr[e4];
    }

    public final Object h(Object obj) {
        if (!c()) {
            int d = d();
            Object obj2 = this.f8753o;
            obj2.getClass();
            int[] iArr = this.f8754p;
            iArr.getClass();
            Object[] objArr = this.f8755q;
            objArr.getClass();
            int w2 = Bs.w(obj, null, d, obj2, iArr, objArr, null);
            if (w2 != -1) {
                Object[] objArr2 = this.f8756r;
                objArr2.getClass();
                Object obj3 = objArr2[w2];
                b(w2, d);
                this.f8758t--;
                this.f8757s += 32;
                return obj3;
            }
        }
        return f8752x;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        C0496ct c0496ct = this.f8759u;
        if (c0496ct != null) {
            return c0496ct;
        }
        C0496ct c0496ct2 = new C0496ct(1, this);
        this.f8759u = c0496ct2;
        return c0496ct2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int i4;
        int i5 = 32;
        if (c()) {
            Bs.j0("Arrays already allocated", c());
            int i6 = this.f8757s;
            int max = Math.max(i6 + 1, 2);
            int highestOneBit = Integer.highestOneBit(max);
            if (max > highestOneBit && (highestOneBit = highestOneBit + highestOneBit) <= 0) {
                highestOneBit = 1073741824;
            }
            int max2 = Math.max(4, highestOneBit);
            this.f8753o = Bs.U(max2);
            this.f8757s = ((32 - Integer.numberOfLeadingZeros(max2 - 1)) & 31) | (this.f8757s & (-32));
            this.f8754p = new int[i6];
            this.f8755q = new Object[i6];
            this.f8756r = new Object[i6];
        }
        Map a4 = a();
        if (a4 != null) {
            return a4.put(obj, obj2);
        }
        int[] iArr = this.f8754p;
        iArr.getClass();
        Object[] objArr = this.f8755q;
        objArr.getClass();
        Object[] objArr2 = this.f8756r;
        objArr2.getClass();
        int i7 = this.f8758t;
        int i8 = i7 + 1;
        int v4 = Bs.v(obj);
        int d = d();
        int i9 = v4 & d;
        Object obj3 = this.f8753o;
        obj3.getClass();
        int K2 = Bs.K(i9, obj3);
        if (K2 == 0) {
            if (i8 > d) {
                d = f(d, (d + 1) * (d < 32 ? 4 : 2), v4, i7);
            } else {
                Object obj4 = this.f8753o;
                obj4.getClass();
                Bs.a0(i9, i8, obj4);
            }
            i4 = 1;
        } else {
            int i10 = ~d;
            int i11 = v4 & i10;
            int i12 = 0;
            while (true) {
                int i13 = K2 - 1;
                int i14 = iArr[i13];
                i4 = 1;
                int i15 = i14 & i10;
                int i16 = i5;
                if (i15 == i11 && Bs.r(obj, objArr[i13])) {
                    Object obj5 = objArr2[i13];
                    objArr2[i13] = obj2;
                    return obj5;
                }
                int i17 = i14 & d;
                int i18 = i12 + 1;
                if (i17 != 0) {
                    i12 = i18;
                    K2 = i17;
                    i5 = i16;
                } else {
                    if (i18 >= 9) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(d() + 1, 1.0f);
                        int i19 = isEmpty() ? -1 : 0;
                        while (i19 >= 0) {
                            Object[] objArr3 = this.f8755q;
                            objArr3.getClass();
                            Object obj6 = objArr3[i19];
                            Object[] objArr4 = this.f8756r;
                            objArr4.getClass();
                            linkedHashMap.put(obj6, objArr4[i19]);
                            int i20 = i19 + 1;
                            i19 = i20 < this.f8758t ? i20 : -1;
                        }
                        this.f8753o = linkedHashMap;
                        this.f8754p = null;
                        this.f8755q = null;
                        this.f8756r = null;
                        this.f8757s += 32;
                        return linkedHashMap.put(obj, obj2);
                    }
                    if (i8 > d) {
                        d = f(d, (d + 1) * (d < i16 ? 4 : 2), v4, i7);
                    } else {
                        iArr[i13] = (i8 & d) | i15;
                    }
                }
            }
        }
        int[] iArr2 = this.f8754p;
        iArr2.getClass();
        int length = iArr2.length;
        if (i8 > length) {
            int i21 = i4;
            int min = Math.min(1073741823, (Math.max(i21, length >>> 1) + length) | i21);
            if (min != length) {
                int[] iArr3 = this.f8754p;
                iArr3.getClass();
                this.f8754p = Arrays.copyOf(iArr3, min);
                Object[] objArr5 = this.f8755q;
                objArr5.getClass();
                this.f8755q = Arrays.copyOf(objArr5, min);
                Object[] objArr6 = this.f8756r;
                objArr6.getClass();
                this.f8756r = Arrays.copyOf(objArr6, min);
            }
        }
        int i22 = (~d) & v4;
        int[] iArr4 = this.f8754p;
        iArr4.getClass();
        iArr4[i7] = i22;
        Object[] objArr7 = this.f8755q;
        objArr7.getClass();
        objArr7[i7] = obj;
        Object[] objArr8 = this.f8756r;
        objArr8.getClass();
        objArr8[i7] = obj2;
        this.f8758t = i8;
        this.f8757s += 32;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map a4 = a();
        if (a4 != null) {
            return a4.remove(obj);
        }
        Object h4 = h(obj);
        if (h4 == f8752x) {
            return null;
        }
        return h4;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map a4 = a();
        return a4 != null ? a4.size() : this.f8758t;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Zs zs = this.f8761w;
        if (zs != null) {
            return zs;
        }
        Zs zs2 = new Zs(1, this);
        this.f8761w = zs2;
        return zs2;
    }
}
