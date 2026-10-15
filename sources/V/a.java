package V;

import J3.f;
import N3.g;
import R3.o;
import m2.AbstractC1806a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class a extends g implements o {

    /* renamed from: s, reason: collision with root package name */
    public int f1822s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ d f1823t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar, L3.d dVar2) {
        super(dVar2);
        this.f1823t = dVar;
    }

    @Override // R3.o
    public final Object d(Object obj, Object obj2) {
        return ((a) e((L3.d) obj2)).f(f.f1032a);
    }

    @Override // N3.b
    public final L3.d e(L3.d dVar) {
        return new a(this.f1823t, dVar);
    }

    @Override // N3.b
    public final Object f(Object obj) {
        int i4 = this.f1822s;
        if (i4 != 0) {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1806a.R(obj);
            return obj;
        }
        AbstractC1806a.R(obj);
        X.c cVar = this.f1823t.f1832a;
        this.f1822s = 1;
        Object b4 = cVar.b(this);
        M3.a aVar = M3.a.f1150o;
        return b4 == aVar ? aVar : b4;
    }
}
