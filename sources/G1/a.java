package G1;

import android.util.SparseArray;
import java.util.HashMap;
import t1.EnumC1992c;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final SparseArray f763a = new SparseArray();

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f764b;

    static {
        HashMap hashMap = new HashMap();
        f764b = hashMap;
        hashMap.put(EnumC1992c.f14844o, 0);
        hashMap.put(EnumC1992c.f14845p, 1);
        hashMap.put(EnumC1992c.f14846q, 2);
        for (EnumC1992c enumC1992c : hashMap.keySet()) {
            f763a.append(((Integer) f764b.get(enumC1992c)).intValue(), enumC1992c);
        }
    }

    public static int a(EnumC1992c enumC1992c) {
        Integer num = (Integer) f764b.get(enumC1992c);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + enumC1992c);
    }

    public static EnumC1992c b(int i4) {
        EnumC1992c enumC1992c = (EnumC1992c) f763a.get(i4);
        if (enumC1992c != null) {
            return enumC1992c;
        }
        throw new IllegalArgumentException(U.a.i("Unknown Priority for value ", i4));
    }
}
