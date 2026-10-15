package x2;

import java.util.HashSet;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: x2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2063b extends T0 {
    public String d;

    /* renamed from: e, reason: collision with root package name */
    public HashSet f15529e;

    /* renamed from: f, reason: collision with root package name */
    public r.e f15530f;

    /* renamed from: g, reason: collision with root package name */
    public Long f15531g;

    /* renamed from: h, reason: collision with root package name */
    public Long f15532h;

    @Override // x2.T0
    public final void j() {
    }

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:96)
        */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public final java.util.ArrayList k(java.lang.String r47, java.util.List r48, java.util.List r49, java.lang.Long r50, java.lang.Long r51) {
        /*
            Method dump skipped, instructions count: 3022
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x2.C2063b.k(java.lang.String, java.util.List, java.util.List, java.lang.Long, java.lang.Long):java.util.ArrayList");
    }

    public final e1 l(Integer num) {
        if (this.f15530f.containsKey(num)) {
            return (e1) this.f15530f.get(num);
        }
        e1 e1Var = new e1(this, this.d);
        this.f15530f.put(num, e1Var);
        return e1Var;
    }
}
