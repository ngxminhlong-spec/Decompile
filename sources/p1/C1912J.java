package p1;

import android.graphics.Canvas;
import com.duracodefactory.logiccircuitsimulatorpro.view.BoardView;
import h1.AbstractC1698a;
import j1.C1729a;
import java.util.ArrayList;
import q1.AbstractC1954i;
import q1.AbstractC1955j;
import t2.C1995b;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: p1.J, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1912J extends AbstractC1698a implements O0.a {

    /* renamed from: F, reason: collision with root package name */
    public final ArrayList f14419F;

    /* renamed from: G, reason: collision with root package name */
    public final ArrayList f14420G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f14421H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f14422I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f14423J;

    public C1912J(long j4, float f4, float f5, C1995b c1995b) {
        super(j4, f4, f5, c1995b);
        this.f14419F = new ArrayList();
        this.f14420G = new ArrayList();
        this.f13130w = 0;
        this.f13129v = 0;
        this.f13128u = 0;
        this.f13131x = 0;
        float f6 = this.f13123p;
        this.f13125r = f6;
        this.f13127t = f6;
        float f7 = this.f13122o;
        this.f13124q = f7;
        this.f13126s = f7;
    }

    @Override // O0.a
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public final Boolean i() {
        if (this.f14422I) {
            return Boolean.FALSE;
        }
        this.f14422I = true;
        ArrayList arrayList = this.f14419F;
        int size = arrayList.size();
        boolean z4 = false;
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            z4 = ((O0.a) obj).i().booleanValue();
            if (z4) {
                break;
            }
        }
        this.f14422I = false;
        return Boolean.valueOf(z4);
    }

    @Override // O0.a
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public final boolean e(Boolean bool) {
        if (this.f14423J) {
            return false;
        }
        this.f14423J = true;
        this.f14421H = bool.booleanValue() || i().booleanValue();
        ArrayList arrayList = this.f14419F;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            ((O0.a) obj).e(Boolean.valueOf(this.f14421H));
        }
        this.f14423J = false;
        return true;
    }

    @Override // O0.a
    public final void a(O0.a aVar) {
        if (aVar != null) {
            this.f14419F.remove(aVar);
        }
    }

    @Override // O0.a
    public final void c(O0.a aVar) {
        if (aVar != null) {
            ArrayList arrayList = this.f14419F;
            if (arrayList.contains(aVar)) {
                return;
            }
            arrayList.add(aVar);
        }
    }

    @Override // h1.AbstractC1698a
    public final W0.a d(long j4) {
        return new Y0.a(j4, this.f13122o, this.f13123p, false);
    }

    @Override // h1.AbstractC1698a
    public final void f(Canvas canvas, boolean z4, boolean z5) {
        ((BoardView) this.f13118B.f14883r).getClass();
        AbstractC1954i.b(canvas, this, z4, z4);
    }

    @Override // O0.a
    public final boolean g(O0.a aVar) {
        ArrayList arrayList = this.f14419F;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            if (aVar == ((O0.a) obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // h1.AbstractC1698a
    public final O0.a m(String str) {
        return this;
    }

    @Override // h1.AbstractC1698a
    public final O0.a o(String str) {
        return this;
    }

    @Override // h1.AbstractC1698a
    public final int r() {
        return 4;
    }

    @Override // h1.AbstractC1698a
    public void t(ArrayList arrayList) {
        arrayList.add(new E0.b(2, this));
    }

    @Override // h1.AbstractC1698a
    public void u(ArrayList arrayList) {
        ArrayList arrayList2 = this.f14419F;
        int size = arrayList2.size();
        int i4 = 0;
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayList2.get(i5);
            i5++;
            ArrayList arrayList3 = new ArrayList(2);
            arrayList3.add(this);
            arrayList3.add((O0.a) obj);
            arrayList.add(new E0.b(0, new E0.b(arrayList3)));
        }
        ArrayList arrayList4 = this.f14420G;
        int size2 = arrayList4.size();
        while (i4 < size2) {
            Object obj2 = arrayList4.get(i4);
            i4++;
            ((AbstractC1698a) obj2).u(arrayList);
        }
        arrayList.add(new E0.b(0, new E0.b(2, this)));
    }

    @Override // h1.AbstractC1698a
    public final j1.c x(int i4, int i5) {
        int i6 = AbstractC1955j.f14677e * 8;
        float f4 = i4;
        float f5 = this.f13122o;
        float f6 = i6;
        if (f4 <= f5 - f6 || f4 >= f5 + f6) {
            return null;
        }
        float f7 = i5;
        float f8 = this.f13123p;
        if (f7 <= f8 - f6 || f7 >= f8 + f6) {
            return null;
        }
        return new C1729a(this);
    }

    @Override // h1.AbstractC1698a
    public final void y(float f4, float f5) {
        this.f13122o = f4;
        this.f13123p = f5;
        this.f13125r = f5;
        this.f13127t = f5;
        this.f13124q = f4;
        this.f13126s = f4;
    }
}
