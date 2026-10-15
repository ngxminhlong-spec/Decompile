package f0;

import Q1.H;
import java.util.LinkedHashSet;
import n.f;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: f0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1673a {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f12953a = new LinkedHashSet();

    public C1673a(H h4) {
        Object obj;
        f fVar = (f) h4.d;
        n.c g4 = fVar.g("androidx.savedstate.Restarter");
        if (g4 != null) {
            obj = g4.f14061p;
        } else {
            n.c cVar = new n.c("androidx.savedstate.Restarter", this);
            fVar.f14070r++;
            n.c cVar2 = fVar.f14068p;
            if (cVar2 == null) {
                fVar.f14067o = cVar;
                fVar.f14068p = cVar;
            } else {
                cVar2.f14062q = cVar;
                cVar.f14063r = cVar2;
                fVar.f14068p = cVar;
            }
            obj = null;
        }
        if (((C1673a) obj) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }
}
