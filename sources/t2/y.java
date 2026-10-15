package t2;

import java.util.Arrays;
import java.util.Set;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class y extends u implements Set {

    /* renamed from: p, reason: collision with root package name */
    public transient x f14946p;

    public static int l(int i4) {
        int max = Math.max(i4, 2);
        if (max >= 751619276) {
            if (max < 1073741824) {
                return 1073741824;
            }
            throw new IllegalArgumentException("collection too large");
        }
        int highestOneBit = Integer.highestOneBit(max - 1);
        do {
            highestOneBit += highestOneBit;
        } while (highestOneBit * 0.7d < max);
        return highestOneBit;
    }

    public static y n(int i4, Object... objArr) {
        if (i4 == 0) {
            return B.f14852w;
        }
        if (i4 == 1) {
            Object obj = objArr[0];
            obj.getClass();
            return new C(obj);
        }
        int l4 = l(i4);
        Object[] objArr2 = new Object[l4];
        int i5 = l4 - 1;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < i4; i8++) {
            Object obj2 = objArr[i8];
            if (obj2 == null) {
                throw new NullPointerException(U.a.i("at index ", i8));
            }
            int hashCode = obj2.hashCode();
            int rotateLeft = (int) (Integer.rotateLeft((int) (hashCode * (-862048943)), 15) * 461845907);
            while (true) {
                int i9 = rotateLeft & i5;
                Object obj3 = objArr2[i9];
                if (obj3 == null) {
                    objArr[i7] = obj2;
                    objArr2[i9] = obj2;
                    i6 += hashCode;
                    i7++;
                    break;
                }
                if (!obj3.equals(obj2)) {
                    rotateLeft++;
                }
            }
        }
        Arrays.fill(objArr, i7, i4, (Object) null);
        if (i7 == 1) {
            Object obj4 = objArr[0];
            obj4.getClass();
            return new C(obj4);
        }
        if (l(i7) < l4 / 2) {
            return n(i7, objArr);
        }
        if (i7 < 3) {
            objArr = Arrays.copyOf(objArr, i7);
        }
        return new B(i6, i5, i7, objArr, objArr2);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof y) && (this instanceof B) && (((y) obj) instanceof B) && hashCode() != obj.hashCode()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    return containsAll(set);
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public abstract int hashCode();
}
