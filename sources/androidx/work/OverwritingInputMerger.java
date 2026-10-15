package androidx.work;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import k.o;
import n0.g;
import n0.i;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class OverwritingInputMerger extends i {
    @Override // n0.i
    public final g a(ArrayList arrayList) {
        o oVar = new o(3);
        HashMap hashMap = new HashMap();
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            hashMap.putAll(Collections.unmodifiableMap(((g) obj).f14090a));
        }
        oVar.h(hashMap);
        g gVar = new g((HashMap) oVar.f13452p);
        g.b(gVar);
        return gVar;
    }
}
