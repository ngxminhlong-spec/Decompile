package b1;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import p1.AbstractC1913K;
import p1.C1921g;
import p1.C1939z;
import p1.b0;
import q1.AbstractC1954i;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: b1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0217d implements e {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f3467o;

    /* renamed from: p, reason: collision with root package name */
    public Drawable f3468p;

    /* renamed from: q, reason: collision with root package name */
    public Drawable f3469q;

    /* renamed from: r, reason: collision with root package name */
    public float f3470r;

    /* renamed from: s, reason: collision with root package name */
    public AbstractC1913K f3471s;

    public /* synthetic */ C0217d(int i4) {
        this.f3467o = i4;
    }

    @Override // b1.e
    public final void j(Canvas canvas) {
        switch (this.f3467o) {
            case 0:
                Drawable drawable = this.f3469q;
                Drawable drawable2 = this.f3468p;
                C1921g c1921g = (C1921g) this.f3471s;
                boolean z4 = c1921g.f14530Q;
                float G3 = c1921g.G();
                float F2 = c1921g.F();
                int max = ((int) Math.max(G3, F2)) / 2;
                float f4 = max;
                float f5 = this.f3470r;
                int i4 = (int) (f4 / f5);
                if (i4 > max) {
                    i4 = max;
                    max = (int) (f4 * f5);
                }
                canvas.translate((int) ((G3 - max) / 2.0f), (int) ((F2 - i4) / 2.0f));
                if (z4) {
                    drawable2.setBounds(0, 0, max, i4);
                    drawable2.draw(canvas);
                } else {
                    drawable.setBounds(0, 0, max, i4);
                    drawable.draw(canvas);
                }
                canvas.translate(-r4, -r2);
                return;
            case 1:
                Drawable drawable3 = this.f3468p;
                Drawable drawable4 = this.f3469q;
                C1939z c1939z = (C1939z) this.f3471s;
                boolean P4 = c1939z.P();
                float G4 = c1939z.G();
                float F4 = c1939z.F();
                int i5 = (int) (G4 / 1.5d);
                float f6 = i5;
                int i6 = (int) (f6 / this.f3470r);
                AbstractC1954i.d(canvas, c1939z.f14602T, G4 / 2.0f, F4 - (F4 / 5.0f), Paint.Align.CENTER);
                canvas.translate((int) ((G4 - f6) / 2.0f), (int) ((F4 - i6) / 3.0f));
                if (P4) {
                    drawable3.setBounds(0, 0, i5, i6);
                    drawable3.draw(canvas);
                } else {
                    drawable4.setBounds(0, 0, i5, i6);
                    drawable4.draw(canvas);
                }
                canvas.translate(-r7, -r10);
                return;
            default:
                Drawable drawable5 = this.f3469q;
                Drawable drawable6 = this.f3468p;
                b0 b0Var = (b0) this.f3471s;
                boolean z5 = b0Var.f14503Q;
                float G5 = b0Var.G();
                float F5 = b0Var.F();
                int max2 = ((int) Math.max(G5, F5)) / 2;
                float f7 = max2;
                float f8 = this.f3470r;
                int i7 = (int) (f7 / f8);
                if (i7 > max2) {
                    i7 = max2;
                    max2 = (int) (f7 * f8);
                }
                canvas.translate((int) ((G5 - max2) / 2.0f), (int) ((F5 - i7) / 2.0f));
                if (z5) {
                    drawable6.setBounds(0, 0, max2, i7);
                    drawable6.draw(canvas);
                } else {
                    drawable5.setBounds(0, 0, max2, i7);
                    drawable5.draw(canvas);
                }
                canvas.translate(-r4, -r2);
                return;
        }
    }
}
