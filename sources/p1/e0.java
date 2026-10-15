package p1;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.Pair;
import android.util.TypedValue;
import c1.InterfaceC0233b;
import com.duracodefactory.logiccircuitsimulatorpro.view.BoardView;
import j1.C1729a;
import java.util.ArrayList;
import q1.AbstractC1955j;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class e0 extends AbstractC1913K {

    /* renamed from: P, reason: collision with root package name */
    public String f14517P;

    /* renamed from: Q, reason: collision with root package name */
    public int f14518Q;

    /* renamed from: R, reason: collision with root package name */
    public boolean f14519R;

    /* renamed from: S, reason: collision with root package name */
    public Paint f14520S;

    /* renamed from: T, reason: collision with root package name */
    public Paint f14521T;

    /* renamed from: U, reason: collision with root package name */
    public float f14522U;

    /* renamed from: V, reason: collision with root package name */
    public int f14523V;

    /* renamed from: W, reason: collision with root package name */
    public float f14524W;

    @Override // p1.AbstractC1913K
    public final Pair C() {
        int applyDimension = (int) TypedValue.applyDimension(5, this.f14518Q, ((BoardView) this.f13118B.f14883r).getResources().getDisplayMetrics());
        return new Pair(Integer.valueOf((int) (applyDimension * this.f14522U)), Integer.valueOf(applyDimension));
    }

    @Override // p1.AbstractC1913K
    public final InterfaceC0233b D() {
        return null;
    }

    @Override // p1.AbstractC1913K
    public final ArrayList E() {
        return null;
    }

    @Override // p1.AbstractC1913K
    public final void L() {
        O();
        super.L();
    }

    public final void N(int i4) {
        this.f14518Q = i4;
        int i5 = this.f14523V;
        if (i4 >= i5) {
            this.f14524W = i4 / i5;
            i4 = i5;
        }
        this.f14520S.setTextSize(TypedValue.applyDimension(5, i4, ((BoardView) this.f13118B.f14883r).getResources().getDisplayMetrics()));
        L();
    }

    public final void O() {
        this.f14522U = (this.f14520S.measureText(this.f14517P) * this.f14524W) / ((int) TypedValue.applyDimension(5, this.f14518Q, ((BoardView) this.f13118B.f14883r).getResources().getDisplayMetrics()));
    }

    @Override // h1.AbstractC1698a
    public final W0.a d(long j4) {
        return new a1.a(j4, this.f13122o, this.f13123p, this.f14517P, this.f14518Q, this.f14519R);
    }

    @Override // p1.AbstractC1913K, h1.AbstractC1698a
    public final void f(Canvas canvas, boolean z4, boolean z5) {
        Paint paint = this.f14520S;
        canvas.save();
        int i4 = this.f13121E;
        if (i4 != 0) {
            canvas.rotate(i4, this.f13122o, this.f13123p);
        }
        float f4 = this.f14524W;
        canvas.scale(f4, f4, this.f13122o - (G() / 2.0f), (F() / 2.0f) + this.f13123p);
        paint.setColor(!z4 ? AbstractC1955j.f14678f : AbstractC1955j.f14679g);
        canvas.drawText(this.f14517P, this.f13122o - (G() / 2.0f), (F() / 2.0f) + this.f13123p, paint);
        canvas.restore();
        if (z4) {
            canvas.drawRect(this.f14432O, this.f14521T);
        }
    }

    @Override // h1.AbstractC1698a
    public final O0.a m(String str) {
        return null;
    }

    @Override // h1.AbstractC1698a
    public final O0.a o(String str) {
        return null;
    }

    @Override // h1.AbstractC1698a
    public final int r() {
        return 50;
    }

    @Override // h1.AbstractC1698a
    public final void t(ArrayList arrayList) {
        arrayList.add(new E0.b(2, this));
    }

    @Override // h1.AbstractC1698a
    public final void u(ArrayList arrayList) {
        arrayList.add(new E0.b(0, new E0.b(2, this)));
    }

    @Override // h1.AbstractC1698a
    public final j1.c x(int i4, int i5) {
        if (s(i4, i5)) {
            return new C1729a(this);
        }
        return null;
    }

    @Override // h1.AbstractC1698a
    public final void y(float f4, float f5) {
        this.f13122o = f4;
        this.f13123p = f5;
        M();
    }
}
