package V;

import J3.f;
import N3.g;
import R3.o;
import android.net.Uri;
import android.view.InputEvent;
import m2.AbstractC1806a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class b extends g implements o {

    /* renamed from: s, reason: collision with root package name */
    public int f1824s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ d f1825t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Uri f1826u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ InputEvent f1827v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, Uri uri, InputEvent inputEvent, L3.d dVar2) {
        super(dVar2);
        this.f1825t = dVar;
        this.f1826u = uri;
        this.f1827v = inputEvent;
    }

    @Override // R3.o
    public final Object d(Object obj, Object obj2) {
        return ((b) e((L3.d) obj2)).f(f.f1032a);
    }

    @Override // N3.b
    public final L3.d e(L3.d dVar) {
        return new b(this.f1825t, this.f1826u, this.f1827v, dVar);
    }

    @Override // N3.b
    public final Object f(Object obj) {
        int i4 = this.f1824s;
        if (i4 == 0) {
            AbstractC1806a.R(obj);
            X.c cVar = this.f1825t.f1832a;
            this.f1824s = 1;
            Object c = cVar.c(this.f1826u, this.f1827v, this);
            M3.a aVar = M3.a.f1150o;
            if (c == aVar) {
                return aVar;
            }
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1806a.R(obj);
        }
        return f.f1032a;
    }
}
