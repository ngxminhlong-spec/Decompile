package k0;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import o2.AbstractC1895f;
import v3.C2033d;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class t extends o {

    /* renamed from: L, reason: collision with root package name */
    public int f13557L;

    /* renamed from: J, reason: collision with root package name */
    public ArrayList f13555J = new ArrayList();

    /* renamed from: K, reason: collision with root package name */
    public boolean f13556K = true;

    /* renamed from: M, reason: collision with root package name */
    public boolean f13558M = false;
    public int N = 0;

    @Override // k0.o
    public final void A() {
        this.N |= 1;
        ArrayList arrayList = this.f13555J;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                ((o) this.f13555J.get(i4)).A();
            }
        }
    }

    @Override // k0.o
    public final void B(C2033d c2033d) {
        super.B(c2033d);
        this.N |= 4;
        if (this.f13555J != null) {
            for (int i4 = 0; i4 < this.f13555J.size(); i4++) {
                ((o) this.f13555J.get(i4)).B(c2033d);
            }
        }
    }

    @Override // k0.o
    public final void C() {
        this.N |= 2;
        int size = this.f13555J.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((o) this.f13555J.get(i4)).C();
        }
    }

    @Override // k0.o
    public final void D(long j4) {
        this.f13539p = j4;
    }

    @Override // k0.o
    public final String F(String str) {
        String F2 = super.F(str);
        for (int i4 = 0; i4 < this.f13555J.size(); i4++) {
            StringBuilder sb = new StringBuilder();
            sb.append(F2);
            sb.append("\n");
            sb.append(((o) this.f13555J.get(i4)).F(str + "  "));
            F2 = sb.toString();
        }
        return F2;
    }

    public final void G(o oVar) {
        this.f13555J.add(oVar);
        oVar.f13544u = this;
        if ((this.N & 1) != 0) {
            oVar.A();
        }
        if ((this.N & 2) != 0) {
            oVar.C();
        }
        if ((this.N & 4) != 0) {
            oVar.B(this.f13537F);
        }
        if ((this.N & 8) != 0) {
            oVar.z(this.f13536E);
        }
    }

    @Override // k0.o
    public final void b(View view) {
        for (int i4 = 0; i4 < this.f13555J.size(); i4++) {
            ((o) this.f13555J.get(i4)).b(view);
        }
        this.f13541r.add(view);
    }

    @Override // k0.o
    public final void d(v vVar) {
        View view = vVar.f13562b;
        if (s(view)) {
            ArrayList arrayList = this.f13555J;
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                o oVar = (o) obj;
                if (oVar.s(view)) {
                    oVar.d(vVar);
                    vVar.c.add(oVar);
                }
            }
        }
    }

    @Override // k0.o
    public final void f(v vVar) {
        int size = this.f13555J.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((o) this.f13555J.get(i4)).f(vVar);
        }
    }

    @Override // k0.o
    public final void g(v vVar) {
        View view = vVar.f13562b;
        if (s(view)) {
            ArrayList arrayList = this.f13555J;
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                o oVar = (o) obj;
                if (oVar.s(view)) {
                    oVar.g(vVar);
                    vVar.c.add(oVar);
                }
            }
        }
    }

    @Override // k0.o
    /* renamed from: j */
    public final o clone() {
        t tVar = (t) super.clone();
        tVar.f13555J = new ArrayList();
        int size = this.f13555J.size();
        for (int i4 = 0; i4 < size; i4++) {
            o clone = ((o) this.f13555J.get(i4)).clone();
            tVar.f13555J.add(clone);
            clone.f13544u = tVar;
        }
        return tVar;
    }

    @Override // k0.o
    public final void l(ViewGroup viewGroup, u0.g gVar, u0.g gVar2, ArrayList arrayList, ArrayList arrayList2) {
        long j4 = this.f13539p;
        int size = this.f13555J.size();
        for (int i4 = 0; i4 < size; i4++) {
            o oVar = (o) this.f13555J.get(i4);
            if (j4 > 0 && (this.f13556K || i4 == 0)) {
                long j5 = oVar.f13539p;
                if (j5 > 0) {
                    oVar.D(j5 + j4);
                } else {
                    oVar.D(j4);
                }
            }
            oVar.l(viewGroup, gVar, gVar2, arrayList, arrayList2);
        }
    }

    @Override // k0.o
    public final void u(ViewGroup viewGroup) {
        super.u(viewGroup);
        int size = this.f13555J.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((o) this.f13555J.get(i4)).u(viewGroup);
        }
    }

    @Override // k0.o
    public final void w(View view) {
        for (int i4 = 0; i4 < this.f13555J.size(); i4++) {
            ((o) this.f13555J.get(i4)).w(view);
        }
        this.f13541r.remove(view);
    }

    @Override // k0.o
    public final void x(View view) {
        super.x(view);
        int size = this.f13555J.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((o) this.f13555J.get(i4)).x(view);
        }
    }

    @Override // k0.o
    public final void y() {
        if (this.f13555J.isEmpty()) {
            E();
            m();
            return;
        }
        g gVar = new g();
        gVar.f13516b = this;
        ArrayList arrayList = this.f13555J;
        int size = arrayList.size();
        int i4 = 0;
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayList.get(i5);
            i5++;
            ((o) obj).a(gVar);
        }
        this.f13557L = this.f13555J.size();
        if (this.f13556K) {
            ArrayList arrayList2 = this.f13555J;
            int size2 = arrayList2.size();
            while (i4 < size2) {
                Object obj2 = arrayList2.get(i4);
                i4++;
                ((o) obj2).y();
            }
            return;
        }
        for (int i6 = 1; i6 < this.f13555J.size(); i6++) {
            ((o) this.f13555J.get(i6 - 1)).a(new g(1, (o) this.f13555J.get(i6)));
        }
        o oVar = (o) this.f13555J.get(0);
        if (oVar != null) {
            oVar.y();
        }
    }

    @Override // k0.o
    public final void z(AbstractC1895f abstractC1895f) {
        this.f13536E = abstractC1895f;
        this.N |= 8;
        int size = this.f13555J.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((o) this.f13555J.get(i4)).z(abstractC1895f);
        }
    }
}
