package p1;

import c1.C0238g;
import c1.InterfaceC0233b;
import com.duracodefactory.logiccircuitsimulatorpro.view.BoardView;
import j1.C1729a;
import java.util.ArrayList;
import s1.InterfaceC1974d;
import t2.C1995b;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: p1.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1939z extends AbstractC1913K {

    /* renamed from: P, reason: collision with root package name */
    public final C0238g f14598P;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f14599Q;

    /* renamed from: R, reason: collision with root package name */
    public float f14600R;

    /* renamed from: S, reason: collision with root package name */
    public e1.e f14601S;

    /* renamed from: T, reason: collision with root package name */
    public String f14602T;

    /* renamed from: U, reason: collision with root package name */
    public boolean f14603U;

    public C1939z(long j4, C0238g c0238g, float f4, float f5, float f6, C1995b c1995b) {
        super(j4, f4, f5, c1995b);
        this.f14598P = c0238g;
        this.f14600R = f6;
        this.f14601S = new C1937x(this);
        this.f14602T = O(this.f14600R);
        H();
    }

    public static String O(float f4) {
        String str;
        if (f4 >= 1000.0f) {
            f4 /= 1000.0f;
            str = "kHZ";
        } else {
            str = "HZ";
        }
        if (f4 >= 1000.0f) {
            f4 /= 1000.0f;
            str = "MHZ";
        }
        if (f4 >= 1000.0f) {
            f4 /= 1000.0f;
            str = "GHZ";
        }
        return f4 + str;
    }

    @Override // p1.AbstractC1913K
    public final InterfaceC0233b D() {
        return this.f14598P;
    }

    @Override // p1.AbstractC1913K
    public ArrayList E() {
        return null;
    }

    public final void N(boolean z4, e1.d dVar) {
        C1995b c1995b = dVar.f12683R;
        if (z4 && !this.f14603U) {
            c1995b.p(this.f14601S);
            this.f14603U = true;
            return;
        }
        if (z4 || !this.f14603U) {
            return;
        }
        e1.e eVar = this.f14601S;
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
        this.f14603U = false;
    }

    public boolean P() {
        return this.f14599Q;
    }

    @Override // h1.AbstractC1698a
    public W0.a d(long j4) {
        return new T0.a(j4, this.f13122o, this.f13123p, this.f14600R);
    }

    @Override // h1.AbstractC1698a
    public O0.a m(String str) {
        return null;
    }

    @Override // h1.AbstractC1698a
    public final O0.a o(String str) {
        return this.f14598P.f3555q;
    }

    @Override // h1.AbstractC1698a
    public int r() {
        return 18;
    }

    @Override // h1.AbstractC1698a
    public void t(ArrayList arrayList) {
        this.f14598P.h(arrayList);
        arrayList.add(new E0.b(2, this));
        arrayList.add(new C1938y(this, this.f14601S, 0));
    }

    @Override // h1.AbstractC1698a
    public void u(ArrayList arrayList) {
        this.f14598P.k(arrayList);
        arrayList.add(new E0.b(0, new E0.b(2, this)));
        arrayList.add(new E0.b(0, new C1938y(this, this.f14601S, 0)));
    }

    @Override // h1.AbstractC1698a
    public j1.c x(int i4, int i5) {
        if (!s(i4, i5)) {
            return null;
        }
        C0238g c0238g = this.f14598P;
        if (!AbstractC1913K.I(c0238g, i4, i5)) {
            return new C1729a(this);
        }
        return new j1.b(1, this.f13117A, c0238g.f3556r.f3546o);
    }

    @Override // h1.AbstractC1698a
    public final void y(float f4, float f5) {
        this.f13122o = f4;
        this.f13123p = f5;
        M();
    }
}
