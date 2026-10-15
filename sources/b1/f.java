package b1;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import p1.AbstractC1913K;
import p1.C1934u;
import p1.Z;
import q1.AbstractC1955j;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class f implements e {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f3472o;

    /* renamed from: p, reason: collision with root package name */
    public Drawable f3473p;

    /* renamed from: q, reason: collision with root package name */
    public Drawable f3474q;

    /* renamed from: r, reason: collision with root package name */
    public float f3475r;

    /* renamed from: s, reason: collision with root package name */
    public Drawable f3476s;

    /* renamed from: t, reason: collision with root package name */
    public Drawable f3477t;

    /* renamed from: u, reason: collision with root package name */
    public int f3478u;

    /* renamed from: v, reason: collision with root package name */
    public AbstractC1913K f3479v;

    public /* synthetic */ f(int i4) {
        this.f3472o = i4;
    }

    @Override // b1.e
    public final void j(Canvas canvas) {
        int i4;
        int i5;
        float f4;
        float f5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        switch (this.f3472o) {
            case 0:
                Drawable drawable = this.f3473p;
                Drawable drawable2 = this.f3474q;
                Drawable drawable3 = this.f3476s;
                Drawable drawable4 = this.f3477t;
                C1934u c1934u = (C1934u) this.f3479v;
                int i15 = c1934u.f14587R;
                if (i15 != this.f3478u) {
                    if (i15 == 0) {
                        i15 = AbstractC1955j.f14680h;
                    }
                    this.f3478u = i15;
                    drawable4.mutate().setTint(i15);
                    drawable2.mutate().setTint(i15);
                }
                boolean[] zArr = c1934u.f14586Q;
                float G3 = c1934u.G();
                float F2 = c1934u.F();
                int i16 = (int) (G3 / 2.0f);
                int i17 = (int) (F2 / 1.5f);
                float f6 = i16;
                float f7 = i17;
                int i18 = (int) ((F2 - f7) / 2.0f);
                int i19 = i16 / 5;
                int i20 = i16 - i19;
                int i21 = (int) ((i20 * 0.7d) / this.f3475r);
                int i22 = i17 / 2;
                int i23 = i22 - i19;
                canvas.translate((int) ((G3 - f6) / 2.0f), i18);
                int i24 = i19 / 2;
                if (zArr[0]) {
                    i4 = i23;
                    drawable2.setBounds(i24, 0, i24 + i20, i21);
                    drawable2.draw(canvas);
                } else {
                    i4 = i23;
                    drawable.setBounds(i24, 0, i24 + i20, i21);
                    drawable.draw(canvas);
                }
                int i25 = i16 - i21;
                int i26 = i21 / 4;
                int i27 = i24 + i26;
                if (zArr[1]) {
                    i5 = i17;
                    f4 = f6;
                    drawable4.setBounds(i25, i27, i25 + i21, i27 + i4);
                    drawable4.draw(canvas);
                } else {
                    i5 = i17;
                    f4 = f6;
                    drawable3.setBounds(i25, i27, i25 + i21, i27 + i4);
                    drawable3.draw(canvas);
                }
                int i28 = (i22 + i24) - i26;
                if (zArr[2]) {
                    f5 = f7;
                    drawable4.setBounds(i25, i28, i25 + i21, i28 + i4);
                    drawable4.draw(canvas);
                } else {
                    f5 = f7;
                    drawable3.setBounds(i25, i28, i25 + i21, i28 + i4);
                    drawable3.draw(canvas);
                }
                int i29 = i5 - i21;
                if (zArr[3]) {
                    i6 = i20;
                    drawable2.setBounds(i24, i29, i24 + i20, i29 + i21);
                    drawable2.draw(canvas);
                } else {
                    i6 = i20;
                    drawable.setBounds(i24, i29, i24 + i6, i29 + i21);
                    drawable.draw(canvas);
                }
                if (zArr[4]) {
                    i7 = 0;
                    drawable4.setBounds(0, i28, i21, i28 + i4);
                    drawable4.draw(canvas);
                } else {
                    i7 = 0;
                    drawable3.setBounds(0, i28, i21, i28 + i4);
                    drawable3.draw(canvas);
                }
                if (zArr[5]) {
                    drawable4.setBounds(i7, i27, i21, i27 + i4);
                    drawable4.draw(canvas);
                } else {
                    drawable3.setBounds(i7, i27, i21, i27 + i4);
                    drawable3.draw(canvas);
                }
                int i30 = i22 - (i21 / 2);
                if (zArr[6]) {
                    drawable2.setBounds(i24, i30, (i6 / 2) + i24, i30 + i21);
                    drawable2.draw(canvas);
                } else {
                    drawable.setBounds(i24, i30, (i6 / 2) + i24, i30 + i21);
                    drawable.draw(canvas);
                }
                int i31 = i16 / 2;
                if (zArr[7]) {
                    drawable2.setBounds(i31, i30, (i6 / 2) + i31, i30 + i21);
                    drawable2.draw(canvas);
                } else {
                    drawable.setBounds(i31, i30, (i6 / 2) + i31, i30 + i21);
                    drawable.draw(canvas);
                }
                float f8 = i19 / 2.0f;
                float f9 = i21;
                canvas.rotate(-18.0f, f8, f9);
                double d = i21;
                int i32 = (int) (1.5d * d);
                if (zArr[8]) {
                    drawable4.setBounds(i21, i32, ((int) (d * 0.8d)) + i21, i32 + i4);
                    drawable4.draw(canvas);
                } else {
                    drawable3.setBounds(i21, i32, ((int) (d * 0.8d)) + i21, i32 + i4);
                    drawable3.draw(canvas);
                }
                canvas.rotate(18.0f, f8, f9);
                int i33 = (int) (d * 1.1d);
                int i34 = (int) (i31 - (0.4d * d));
                if (zArr[9]) {
                    drawable4.setBounds(i34, i33, ((int) (d * 0.8d)) + i34, i33 + i4);
                    drawable4.draw(canvas);
                } else {
                    drawable3.setBounds(i34, i33, ((int) (d * 0.8d)) + i34, i33 + i4);
                    drawable3.draw(canvas);
                }
                float f10 = f4 - f8;
                canvas.rotate(18.0f, f10, f9);
                double d4 = d * 0.8d;
                int i35 = (int) (i25 - d4);
                if (zArr[10]) {
                    i8 = i18;
                    i9 = i32;
                    drawable4.setBounds(i35, i9, ((int) d4) + i35, i32 + i4);
                    drawable4.draw(canvas);
                } else {
                    i8 = i18;
                    i9 = i32;
                    drawable3.setBounds(i35, i9, ((int) d4) + i35, i9 + i4);
                    drawable3.draw(canvas);
                }
                canvas.rotate(-18.0f, f10, f9);
                float f11 = -i21;
                float f12 = f5 / 2.0f;
                canvas.scale(1.0f, -1.0f, f11, f12);
                canvas.rotate(-18.0f, f8, f9);
                if (zArr[13]) {
                    drawable4.setBounds(i21, i9, ((int) d4) + i21, i9 + i4);
                    drawable4.draw(canvas);
                } else {
                    drawable3.setBounds(i21, i9, ((int) d4) + i21, i9 + i4);
                    drawable3.draw(canvas);
                }
                canvas.rotate(18.0f, f8, f9);
                canvas.scale(1.0f, -1.0f, f11, f12);
                canvas.scale(1.0f, -1.0f, f11, f12);
                if (zArr[12]) {
                    drawable4.setBounds(i34, i33, ((int) d4) + i34, i33 + i4);
                    drawable4.draw(canvas);
                } else {
                    drawable3.setBounds(i34, i33, ((int) d4) + i34, i33 + i4);
                    drawable3.draw(canvas);
                }
                canvas.scale(1.0f, -1.0f, f11, f12);
                canvas.scale(1.0f, -1.0f, f11, f12);
                canvas.rotate(18.0f, f10, f9);
                if (zArr[11]) {
                    drawable4.setBounds(i35, i9, i35 + ((int) d4), i9 + i4);
                    drawable4.draw(canvas);
                } else {
                    drawable3.setBounds(i35, i9, i35 + ((int) d4), i9 + i4);
                    drawable3.draw(canvas);
                }
                canvas.rotate(-18.0f, f10, f9);
                canvas.scale(1.0f, -1.0f, f11, f12);
                canvas.translate(-r8, -i8);
                return;
            default:
                Drawable drawable5 = this.f3473p;
                Drawable drawable6 = this.f3474q;
                Drawable drawable7 = this.f3476s;
                Drawable drawable8 = this.f3477t;
                Z z4 = (Z) this.f3479v;
                int i36 = z4.f14492R;
                if (i36 != this.f3478u) {
                    if (i36 == 0) {
                        i36 = AbstractC1955j.f14680h;
                    }
                    this.f3478u = i36;
                    drawable8.mutate().setTint(i36);
                    drawable6.mutate().setTint(i36);
                }
                boolean[] zArr2 = z4.f14491Q;
                float G4 = z4.G();
                float F4 = z4.F();
                int i37 = (int) (G4 / 2.0f);
                int i38 = (int) (F4 / 1.5f);
                int i39 = i37 / 5;
                int i40 = i37 - i39;
                int i41 = (int) (i40 / this.f3475r);
                int i42 = i38 / 2;
                int i43 = i42 - i39;
                canvas.translate((int) ((G4 - i37) / 2.0f), (int) ((F4 - i38) / 2.0f));
                int i44 = i39 / 2;
                if (zArr2[0]) {
                    i10 = i37;
                    drawable6.setBounds(i44, 0, i44 + i40, i41);
                    drawable6.draw(canvas);
                } else {
                    i10 = i37;
                    drawable5.setBounds(i44, 0, i44 + i40, i41);
                    drawable5.draw(canvas);
                }
                int i45 = i10 - i41;
                int i46 = i41 / 4;
                int i47 = i44 + i46;
                if (zArr2[1]) {
                    i11 = i38;
                    i12 = i40;
                    drawable8.setBounds(i45, i47, i45 + i41, i47 + i43);
                    drawable8.draw(canvas);
                } else {
                    i11 = i38;
                    i12 = i40;
                    drawable7.setBounds(i45, i47, i45 + i41, i47 + i43);
                    drawable7.draw(canvas);
                }
                int i48 = (i42 + i44) - i46;
                if (zArr2[2]) {
                    i13 = i42;
                    drawable8.setBounds(i45, i48, i45 + i41, i48 + i43);
                    drawable8.draw(canvas);
                } else {
                    i13 = i42;
                    drawable7.setBounds(i45, i48, i45 + i41, i48 + i43);
                    drawable7.draw(canvas);
                }
                int i49 = i11 - i41;
                if (zArr2[3]) {
                    drawable6.setBounds(i44, i49, i44 + i12, i49 + i41);
                    drawable6.draw(canvas);
                } else {
                    drawable5.setBounds(i44, i49, i44 + i12, i49 + i41);
                    drawable5.draw(canvas);
                }
                if (zArr2[4]) {
                    i14 = 0;
                    drawable8.setBounds(0, i48, i41, i48 + i43);
                    drawable8.draw(canvas);
                } else {
                    i14 = 0;
                    drawable7.setBounds(0, i48, i41, i48 + i43);
                    drawable7.draw(canvas);
                }
                if (zArr2[5]) {
                    drawable8.setBounds(i14, i47, i41, i43 + i47);
                    drawable8.draw(canvas);
                } else {
                    drawable7.setBounds(i14, i47, i41, i43 + i47);
                    drawable7.draw(canvas);
                }
                int i50 = i13 - (i41 / 2);
                if (zArr2[6]) {
                    drawable6.setBounds(i44, i50, i44 + i12, i41 + i50);
                    drawable6.draw(canvas);
                } else {
                    drawable5.setBounds(i44, i50, i44 + i12, i41 + i50);
                    drawable5.draw(canvas);
                }
                canvas.translate(-r8, -r6);
                return;
        }
    }
}
