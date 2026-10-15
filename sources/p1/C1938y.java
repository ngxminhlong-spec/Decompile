package p1;

import com.duracodefactory.logiccircuitsimulatorpro.view.BoardView;
import java.util.ArrayList;
import s1.InterfaceC1974d;
import t2.C1995b;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: p1.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1938y implements I0.c {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f14595o;

    /* renamed from: p, reason: collision with root package name */
    public final Object f14596p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ AbstractC1913K f14597q;

    public /* synthetic */ C1938y(AbstractC1913K abstractC1913K, Object obj, int i4) {
        this.f14595o = i4;
        this.f14597q = abstractC1913K;
        this.f14596p = obj;
    }

    @Override // I0.a
    public final boolean a(e1.d dVar) {
        InterfaceC1974d interfaceC1974d;
        switch (this.f14595o) {
            case 0:
                C1939z c1939z = (C1939z) this.f14597q;
                if (!c1939z.f14603U) {
                    dVar.f12683R.p((e1.e) this.f14596p);
                    c1939z.f14603U = true;
                }
                return true;
            default:
                Y y = (Y) this.f14597q;
                if (!y.f14487Q) {
                    C1995b c1995b = dVar.f12683R;
                    C1915a c1915a = (C1915a) this.f14596p;
                    ((e1.j) c1995b.f14884s).d(c1915a);
                    if (c1915a.a() == -1004 && (interfaceC1974d = ((BoardView) c1995b.f14883r).f3798D) != null) {
                        interfaceC1974d.g();
                    }
                    y.f14487Q = true;
                }
                return true;
        }
    }

    @Override // I0.a
    public final boolean b(e1.d dVar) {
        switch (this.f14595o) {
            case 0:
                C1939z c1939z = (C1939z) this.f14597q;
                if (!c1939z.f14603U) {
                    return true;
                }
                C1995b c1995b = dVar.f12683R;
                e1.e eVar = (e1.e) this.f14596p;
                e1.f fVar = (e1.f) c1995b.f14882q;
                ArrayList arrayList = fVar.f12701e;
                arrayList.remove(eVar);
                if (arrayList.isEmpty()) {
                    fVar.c = false;
                    fVar.f12699a = 0L;
                    fVar.f12703g = 0L;
                    fVar.f12704h = 1.0f;
                } else {
                    fVar.a();
                }
                BoardView boardView = (BoardView) c1995b.f14883r;
                f1.b bVar = boardView.f3807M;
                float f4 = boardView.f3806L.f12704h;
                bVar.getClass();
                InterfaceC1974d interfaceC1974d = boardView.f3798D;
                if (interfaceC1974d != null) {
                    interfaceC1974d.o();
                }
                c1939z.f14603U = false;
                return true;
            default:
                Y y = (Y) this.f14597q;
                if (!y.f14487Q) {
                    return true;
                }
                C1995b c1995b2 = dVar.f12683R;
                C1915a c1915a = (C1915a) this.f14596p;
                e1.j jVar = (e1.j) c1995b2.f14884s;
                jVar.getClass();
                if (c1915a.a() == -1004) {
                    e1.k kVar = jVar.f12727g;
                    ArrayList arrayList2 = kVar.f12734e;
                    arrayList2.remove(c1915a);
                    if (arrayList2.isEmpty()) {
                        kVar.b();
                    }
                }
                jVar.f12725e.remove(c1915a);
                y.f14487Q = false;
                return true;
        }
    }

    @Override // I0.a
    public final boolean c(e1.d dVar) {
        switch (this.f14595o) {
            case 0:
            default:
                a(dVar);
                return true;
        }
    }
}
