package x2;

import android.text.TextUtils;
import com.google.android.gms.internal.measurement.C1582v0;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import k.C1748e;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class W extends b0.l0 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ X f15463h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(X x4) {
        super(20);
        this.f15463h = x4;
    }

    @Override // b0.l0
    public final Object c(Object obj) {
        C1582v0 c1582v0;
        String str = (String) obj;
        h2.y.e(str);
        X x4 = this.f15463h;
        x4.h();
        h2.y.e(str);
        if (TextUtils.isEmpty(str) || (c1582v0 = (C1582v0) x4.f15469h.get(str)) == null || c1582v0.l() == 0) {
            return null;
        }
        if (!x4.f15469h.containsKey(str) || x4.f15469h.get(str) == null) {
            x4.m(str);
        } else {
            x4.n(str, (C1582v0) x4.f15469h.get(str));
        }
        W w2 = x4.f15471j;
        w2.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        synchronized (((V2.e) w2.f3354g)) {
            Set<Map.Entry> entrySet = ((LinkedHashMap) ((C1748e) w2.f3351b).f13386p).entrySet();
            S3.e.d(entrySet, "map.entries");
            for (Map.Entry entry : entrySet) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return (com.google.android.gms.internal.measurement.E) linkedHashMap.get(str);
    }
}
