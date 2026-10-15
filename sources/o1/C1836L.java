package o1;

import android.graphics.Canvas;
import android.graphics.Paint;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: o1.L, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1836L {

    /* renamed from: a, reason: collision with root package name */
    public float f14215a = 0.0f;

    /* renamed from: b, reason: collision with root package name */
    public int f14216b;
    public int c;
    public float[] d;

    /* renamed from: e, reason: collision with root package name */
    public float f14217e;

    /* renamed from: f, reason: collision with root package name */
    public float f14218f;

    /* renamed from: g, reason: collision with root package name */
    public float[] f14219g;

    public final void a(Canvas canvas, Paint paint, boolean z4) {
        float[] fArr;
        int strokeWidth = (int) paint.getStrokeWidth();
        if (z4) {
            this.f14215a += this.f14218f;
        }
        float f4 = this.f14215a;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            fArr = this.d;
            if (i5 >= fArr.length) {
                break;
            }
            fArr[i5] = (float) (Math.sin(f4) * this.c);
            f4 += this.f14217e;
            i5++;
        }
        float f5 = this.f14216b;
        float f6 = fArr[0];
        while (true) {
            float[] fArr2 = this.d;
            if (i4 >= fArr2.length) {
                canvas.drawLines(this.f14219g, paint);
                paint.setStrokeWidth(strokeWidth);
                return;
            }
            float[] fArr3 = this.f14219g;
            int i6 = i4 * 4;
            fArr3[i6] = f5;
            fArr3[i6 + 1] = f6;
            f5 = this.f14216b * i4;
            f6 = fArr2[i4];
            fArr3[i6 + 2] = f5;
            fArr3[i6 + 3] = f6;
            i4++;
        }
    }

    public final void b(int i4, int i5, int i6, int i7, float f4) {
        if (i4 == 0) {
            i4 = 1;
        }
        this.f14216b = i4;
        this.c = i6;
        float[] fArr = new float[i5 / i4];
        this.d = fArr;
        this.f14217e = (float) ((6.283185307179586d / i7) * i4);
        this.f14218f = f4;
        this.f14219g = new float[fArr.length * 4];
    }
}
