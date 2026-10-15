package o0;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import m2.AbstractC1806a;
import n0.n;
import n0.o;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class e extends AbstractC1806a {

    /* renamed from: s0, reason: collision with root package name */
    public static final String f14156s0 = n.h("WorkContinuationImpl");

    /* renamed from: n0, reason: collision with root package name */
    public final l f14157n0;

    /* renamed from: o0, reason: collision with root package name */
    public final List f14158o0;

    /* renamed from: p0, reason: collision with root package name */
    public final ArrayList f14159p0;

    /* renamed from: q0, reason: collision with root package name */
    public final ArrayList f14160q0 = new ArrayList();

    /* renamed from: r0, reason: collision with root package name */
    public boolean f14161r0;

    public e(l lVar, List list) {
        this.f14157n0 = lVar;
        this.f14158o0 = list;
        this.f14159p0 = new ArrayList(list.size());
        for (int i4 = 0; i4 < list.size(); i4++) {
            String uuid = ((o) list.get(i4)).f14099a.toString();
            this.f14159p0.add(uuid);
            this.f14160q0.add(uuid);
        }
    }

    public static HashSet V(e eVar) {
        HashSet hashSet = new HashSet();
        eVar.getClass();
        return hashSet;
    }
}
