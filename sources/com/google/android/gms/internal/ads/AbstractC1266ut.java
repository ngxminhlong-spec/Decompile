package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Set;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.ut, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1266ut extends AbstractC0923mt implements Set {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f10952q = 0;

    /* renamed from: p, reason: collision with root package name */
    public transient AbstractC1137rt f10953p;

    public static int p(int i4) {
        int max = Math.max(i4, 2);
        if (max >= 751619276) {
            Bs.d0("collection too large", max < 1073741824);
            return 1073741824;
        }
        int highestOneBit = Integer.highestOneBit(max - 1);
        do {
            highestOneBit += highestOneBit;
        } while (highestOneBit * 0.7d < max);
        return highestOneBit;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.lt, com.google.android.gms.internal.ads.tt] */
    public static C1223tt r(int i4) {
        ?? abstractC0880lt = new AbstractC0880lt(i4);
        abstractC0880lt.d = new Object[p(i4)];
        return abstractC0880lt;
    }

    public static AbstractC1266ut s(C1175so c1175so, C1175so c1175so2, C1175so c1175so3, C1175so c1175so4, C0576eo c0576eo, Object... objArr) {
        Object[] objArr2 = new Object[12];
        objArr2[0] = c1175so;
        objArr2[1] = c1175so2;
        objArr2[2] = c1175so3;
        objArr2[3] = c1175so4;
        objArr2[4] = Ro.f6851b;
        objArr2[5] = c0576eo;
        System.arraycopy(objArr, 0, objArr2, 6, 6);
        return t(12, objArr2);
    }

    public static AbstractC1266ut t(int i4, Object... objArr) {
        if (i4 == 0) {
            return Mt.f6281x;
        }
        if (i4 == 1) {
            Object obj = objArr[0];
            obj.getClass();
            return new Rt(obj);
        }
        int p3 = p(i4);
        Object[] objArr2 = new Object[p3];
        int i5 = p3 - 1;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < i4; i8++) {
            Object obj2 = objArr[i8];
            if (obj2 == null) {
                throw new NullPointerException(U.a.i("at index ", i8));
            }
            int hashCode = obj2.hashCode();
            int b4 = Bs.b(hashCode);
            while (true) {
                int i9 = b4 & i5;
                Object obj3 = objArr2[i9];
                if (obj3 == null) {
                    objArr[i7] = obj2;
                    objArr2[i9] = obj2;
                    i6 += hashCode;
                    i7++;
                    break;
                }
                if (!obj3.equals(obj2)) {
                    b4++;
                }
            }
        }
        Arrays.fill(objArr, i7, i4, (Object) null);
        if (i7 == 1) {
            Object obj4 = objArr[0];
            obj4.getClass();
            return new Rt(obj4);
        }
        if (p(i7) < p3 / 2) {
            return t(i7, objArr);
        }
        int length = objArr.length;
        if (i7 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i7);
        }
        return new Mt(i6, i5, i7, objArr, objArr2);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof AbstractC1266ut) && (this instanceof Mt) && (((AbstractC1266ut) obj) instanceof Mt) && hashCode() != obj.hashCode()) {
            return false;
        }
        return Bs.T(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return Bs.d(this);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0923mt
    public AbstractC1137rt k() {
        AbstractC1137rt abstractC1137rt = this.f10953p;
        if (abstractC1137rt != null) {
            return abstractC1137rt;
        }
        AbstractC1137rt q4 = q();
        this.f10953p = q4;
        return q4;
    }

    public AbstractC1137rt q() {
        Object[] array = toArray(AbstractC0923mt.f9662o);
        C1052pt c1052pt = AbstractC1137rt.f10543p;
        return AbstractC1137rt.q(array.length, array);
    }
}
