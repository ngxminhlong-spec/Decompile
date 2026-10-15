package r;

import java.util.ConcurrentModificationException;
import s.AbstractC1969a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f14737a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f14738b = new Object();

    public static final void a(j jVar) {
        int i4 = jVar.f14745r;
        int[] iArr = jVar.f14743p;
        Object[] objArr = jVar.f14744q;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            Object obj = objArr[i6];
            if (obj != f14738b) {
                if (i6 != i5) {
                    iArr[i5] = iArr[i6];
                    objArr[i5] = obj;
                    objArr[i6] = null;
                }
                i5++;
            }
        }
        jVar.f14742o = false;
        jVar.f14745r = i5;
    }

    public static final void b(f fVar, int i4) {
        fVar.f14730o = new int[i4];
        fVar.f14731p = new Object[i4];
    }

    public static final int c(f fVar, Object obj, int i4) {
        int i5 = fVar.f14732q;
        if (i5 == 0) {
            return -1;
        }
        try {
            int a4 = AbstractC1969a.a(i5, i4, fVar.f14730o);
            if (a4 < 0 || S3.e.a(obj, fVar.f14731p[a4])) {
                return a4;
            }
            int i6 = a4 + 1;
            while (i6 < i5 && fVar.f14730o[i6] == i4) {
                if (S3.e.a(obj, fVar.f14731p[i6])) {
                    return i6;
                }
                i6++;
            }
            for (int i7 = a4 - 1; i7 >= 0 && fVar.f14730o[i7] == i4; i7--) {
                if (S3.e.a(obj, fVar.f14731p[i7])) {
                    return i7;
                }
            }
            return ~i6;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }
}
