package o2;

import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractC1106r4;
import n2.BinderC1813b;
import n2.InterfaceC1812a;
import s2.AbstractC1980b;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: o2.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1899j extends AbstractC1106r4 {
    public final InterfaceC1812a W2(BinderC1813b binderC1813b, String str, int i4, BinderC1813b binderC1813b2) {
        Parcel Q3 = Q();
        AbstractC1980b.c(Q3, binderC1813b);
        Q3.writeString(str);
        Q3.writeInt(i4);
        AbstractC1980b.c(Q3, binderC1813b2);
        return U.a.o(O(Q3, 2));
    }

    public final InterfaceC1812a y3(BinderC1813b binderC1813b, String str, int i4, BinderC1813b binderC1813b2) {
        Parcel Q3 = Q();
        AbstractC1980b.c(Q3, binderC1813b);
        Q3.writeString(str);
        Q3.writeInt(i4);
        AbstractC1980b.c(Q3, binderC1813b2);
        return U.a.o(O(Q3, 3));
    }
}
