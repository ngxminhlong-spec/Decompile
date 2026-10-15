package W1;

import android.util.Pair;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class g extends LinkedHashMap {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ h f1995o;

    public g(h hVar) {
        this.f1995o = hVar;
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        synchronized (this.f1995o) {
            try {
                int size = size();
                h hVar = this.f1995o;
                if (size <= hVar.f1996a) {
                    return false;
                }
                hVar.f1999f.add(new Pair((String) entry.getKey(), (String) ((Pair) entry.getValue()).second));
                return size() > this.f1995o.f1996a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
