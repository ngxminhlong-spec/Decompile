package O1;

import java.util.Comparator;
import java.util.List;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final /* synthetic */ class V0 implements Comparator {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ V0 f1317o = new Object();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        List list = H1.m.f876b;
        return list.indexOf((String) obj) - list.indexOf((String) obj2);
    }
}
