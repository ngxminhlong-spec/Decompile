package V;

import J3.f;
import N3.g;
import R3.o;
import android.net.Uri;
import m2.AbstractC1806a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class c extends g implements o {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f1828s;

    /* renamed from: t, reason: collision with root package name */
    public int f1829t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f1830u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f1831v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj, Object obj2, L3.d dVar, int i4) {
        super(dVar);
        this.f1828s = i4;
        this.f1830u = obj;
        this.f1831v = obj2;
    }

    @Override // R3.o
    public final Object d(Object obj, Object obj2) {
        L3.d dVar = (L3.d) obj2;
        switch (this.f1828s) {
            case 0:
                return ((c) e(dVar)).f(f.f1032a);
            default:
                return ((c) e(dVar)).f(f.f1032a);
        }
    }

    @Override // N3.b
    public final L3.d e(L3.d dVar) {
        switch (this.f1828s) {
            case 0:
                return new c((d) this.f1830u, (Uri) this.f1831v, dVar, 0);
            default:
                return new c((W.a) this.f1830u, (Y.a) this.f1831v, dVar, 1);
        }
    }

    @Override // N3.b
    public final Object f(Object obj) {
        switch (this.f1828s) {
            case 0:
                int i4 = this.f1829t;
                if (i4 == 0) {
                    AbstractC1806a.R(obj);
                    X.c cVar = ((d) this.f1830u).f1832a;
                    Uri uri = (Uri) this.f1831v;
                    this.f1829t = 1;
                    Object d = cVar.d(uri, this);
                    M3.a aVar = M3.a.f1150o;
                    if (d == aVar) {
                        return aVar;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1806a.R(obj);
                }
                return f.f1032a;
            default:
                int i5 = this.f1829t;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1806a.R(obj);
                    return obj;
                }
                AbstractC1806a.R(obj);
                Y.f fVar = ((W.a) this.f1830u).f1939a;
                Y.a aVar2 = (Y.a) this.f1831v;
                this.f1829t = 1;
                Object b4 = fVar.b(aVar2, this);
                M3.a aVar3 = M3.a.f1150o;
                return b4 == aVar3 ? aVar3 : b4;
        }
    }
}
