package b1;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import m2.AbstractC1806a;
import p1.C1916b;
import p1.S;
import p1.T;
import p1.Y;
import q1.AbstractC1954i;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: b1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0214a implements e {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f3451o;

    /* renamed from: p, reason: collision with root package name */
    public Drawable f3452p;

    /* renamed from: q, reason: collision with root package name */
    public float f3453q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f3454r;

    /* renamed from: s, reason: collision with root package name */
    public Y f3455s;

    public /* synthetic */ C0214a(int i4) {
        this.f3451o = i4;
    }

    @Override // b1.e
    public final void j(Canvas canvas) {
        switch (this.f3451o) {
            case 0:
                Drawable drawable = this.f3452p;
                boolean z4 = this.f3454r;
                C1916b c1916b = (C1916b) this.f3455s;
                float G3 = c1916b.G();
                float F2 = c1916b.F();
                int max = ((int) Math.max(G3, F2)) / 2;
                int i4 = max / 3;
                float f4 = this.f3453q;
                int i5 = (int) (i4 / f4);
                if (i5 > max) {
                    i4 = (int) (max * f4);
                    i5 = max;
                }
                int i6 = (int) (0.1f * G3);
                int i7 = (int) (0.2f * F2);
                if (z4) {
                    i6 = (int) (G3 - i6);
                }
                canvas.translate(i6, i7);
                AbstractC1806a.j(canvas, c1916b, z4);
                canvas.translate(-i6, -i7);
                float f5 = max;
                canvas.translate((int) ((G3 - f5) / 2.0f), (int) ((F2 - f5) / 2.0f));
                float[] fArr = c1916b.f14501V;
                float f6 = f5 / 100.0f;
                float f7 = fArr[0] * f6;
                float f8 = fArr[1] * f6;
                float f9 = i4 / 2;
                float f10 = i5 / 2;
                drawable.setBounds((int) (f7 - f9), (int) (f8 - f10), (int) (f7 + f9), (int) (f8 + f10));
                drawable.draw(canvas);
                canvas.translate(-r3, -r4);
                return;
            case 1:
                Drawable drawable2 = this.f3452p;
                S s4 = (S) this.f3455s;
                float G4 = s4.G();
                float F4 = s4.F();
                int i8 = (int) (0.28f * G4);
                int i9 = (int) (0.45f * F4);
                boolean z5 = this.f3454r;
                if (z5) {
                    i8 = (int) (G4 - i8);
                }
                canvas.translate(i8, i9);
                AbstractC1806a.j(canvas, s4, z5);
                canvas.translate(-i8, -i9);
                canvas.translate((int) (G4 / 1.95f), (int) (0.1f * F4));
                int i10 = (int) (G4 / 20.0f);
                int i11 = (int) (i10 / this.f3453q);
                drawable2.setBounds(-i10, (-i11) / 2, 0, i11 / 2);
                canvas.save();
                canvas.rotate(((s4.f14476U / 9.0f) * 270.0f) - 45.0f);
                drawable2.draw(canvas);
                canvas.restore();
                canvas.translate(-r4, -r5);
                int i12 = (int) (G4 / 2.8f);
                int i13 = (int) (F4 * 0.68f);
                canvas.translate(i12, i13);
                AbstractC1954i.d(canvas, s4.f14479X + " mBar", 0.0f, 0.0f, Paint.Align.LEFT);
                canvas.translate((float) (-i12), (float) (-i13));
                return;
            default:
                Drawable drawable3 = this.f3452p;
                T t4 = (T) this.f3455s;
                boolean z6 = t4.f14480T;
                float G5 = t4.G();
                float F5 = t4.F();
                int i14 = (int) (0.8f * G5);
                float f11 = i14;
                int i15 = (int) (f11 / this.f3453q);
                int i16 = (int) (0.1f * G5);
                boolean z7 = this.f3454r;
                if (z7) {
                    i16 = (int) (G5 - i16);
                }
                canvas.translate(i16, (int) (F5 * 0.3f));
                AbstractC1806a.j(canvas, t4, z7);
                canvas.translate(-i16, -r4);
                int i17 = (int) ((G5 - f11) / 2.0f);
                int i18 = (int) ((-i15) * 0.3f);
                if (z6) {
                    canvas.translate(i17, i18);
                    drawable3.setBounds(0, 0, i14, i15);
                    drawable3.draw(canvas);
                    canvas.translate(-i17, -i18);
                    return;
                }
                return;
        }
    }
}
