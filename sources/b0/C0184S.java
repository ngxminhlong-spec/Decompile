package b0;

import android.util.SparseArray;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: b0.S, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0184S {

    /* renamed from: a, reason: collision with root package name */
    public SparseArray f3201a;

    /* renamed from: b, reason: collision with root package name */
    public int f3202b;

    public final C0183Q a(int i4) {
        SparseArray sparseArray = this.f3201a;
        C0183Q c0183q = (C0183Q) sparseArray.get(i4);
        if (c0183q != null) {
            return c0183q;
        }
        C0183Q c0183q2 = new C0183Q();
        sparseArray.put(i4, c0183q2);
        return c0183q2;
    }
}
