package D3;

import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f673a;

    /* renamed from: b, reason: collision with root package name */
    public final d f674b;

    public c(Set set, d dVar) {
        this.f673a = a(set);
        this.f674b = dVar;
    }

    public static String a(Set set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            sb.append(aVar.f670a);
            sb.append('/');
            sb.append(aVar.f671b);
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }
}
