package k0;

import java.util.ArrayList;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class k extends p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f13521a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f13522b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ ArrayList d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f13523e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ArrayList f13524f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ l f13525g;

    public k(l lVar, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
        this.f13525g = lVar;
        this.f13521a = obj;
        this.f13522b = arrayList;
        this.c = obj2;
        this.d = arrayList2;
        this.f13523e = obj3;
        this.f13524f = arrayList3;
    }

    @Override // k0.p, k0.n
    public final void a() {
        l lVar = this.f13525g;
        Object obj = this.f13521a;
        if (obj != null) {
            lVar.m(obj, this.f13522b, null);
        }
        Object obj2 = this.c;
        if (obj2 != null) {
            lVar.m(obj2, this.d, null);
        }
        Object obj3 = this.f13523e;
        if (obj3 != null) {
            lVar.m(obj3, this.f13524f, null);
        }
    }

    @Override // k0.n
    public final void e(o oVar) {
        oVar.v(this);
    }
}
