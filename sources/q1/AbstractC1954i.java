package q1;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Typeface;
import c1.InterfaceC0233b;
import p1.C1912J;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: q1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1954i {

    /* renamed from: a, reason: collision with root package name */
    public static Paint f14671a;

    /* renamed from: b, reason: collision with root package name */
    public static Paint f14672b;
    public static Paint c;
    public static Paint d;

    /* renamed from: e, reason: collision with root package name */
    public static Paint f14673e;

    /* renamed from: f, reason: collision with root package name */
    public static final Matrix f14674f = new Matrix();

    public static void a(Canvas canvas, String str, float f4, float f5, Paint.Align align) {
        if (d == null) {
            Paint paint = new Paint();
            d = paint;
            paint.setColor(AbstractC1955j.f14685m);
            d.setTextSize(AbstractC1955j.f14684l);
            d.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
        }
        d.setTextAlign(align);
        canvas.drawText(str, f4, f5, d);
    }

    public static void b(Canvas canvas, C1912J c1912j, boolean z4, boolean z5) {
        if (z5) {
            canvas.save();
            canvas.scale(2.0f, 2.0f, c1912j.f13122o, c1912j.f13123p);
        }
        Paint paint = f14672b;
        if (paint == null) {
            paint = new Paint();
            f14672b = paint;
            paint.setStyle(Paint.Style.FILL_AND_STROKE);
            paint.setStrokeWidth(AbstractC1955j.c);
        }
        if (z4 || !c1912j.f14421H) {
            paint.setColor(z4 ? AbstractC1955j.f14679g : AbstractC1955j.f14678f);
        } else {
            paint.setColor(AbstractC1955j.f14680h);
        }
        canvas.drawCircle(c1912j.f13122o, c1912j.f13123p, AbstractC1955j.f14677e, paint);
        if (z5) {
            canvas.restore();
        }
    }

    public static void c(Canvas canvas, InterfaceC0233b interfaceC0233b, int i4, float f4, float f5, float f6, float f7) {
        int position = interfaceC0233b.getPosition();
        int i5 = AbstractC1955j.f14687o;
        float[] fArr = {interfaceC0233b.b().f13122o, interfaceC0233b.b().f13123p};
        Matrix matrix = f14674f;
        matrix.reset();
        matrix.preRotate(-i4, f4, f5);
        matrix.mapPoints(fArr);
        int b4 = Z.e.b(position);
        if (b4 == 0) {
            if (interfaceC0233b.f()) {
                d(canvas, interfaceC0233b.getId(), fArr[0], (f5 - (f7 / 2.0f)) + i5, Paint.Align.CENTER);
            }
        } else if (b4 == 1) {
            if (interfaceC0233b.f()) {
                d(canvas, interfaceC0233b.getId(), (f4 - (f6 / 2.0f)) + i5, fArr[1], Paint.Align.LEFT);
            }
        } else if (b4 == 2) {
            if (interfaceC0233b.f()) {
                d(canvas, interfaceC0233b.getId(), ((f6 / 2.0f) + f4) - i5, fArr[1], Paint.Align.RIGHT);
            }
        } else if (b4 == 3 && interfaceC0233b.f()) {
            d(canvas, interfaceC0233b.getId(), fArr[0], ((f7 / 2.0f) + f5) - i5, Paint.Align.CENTER);
        }
    }

    public static void d(Canvas canvas, String str, float f4, float f5, Paint.Align align) {
        if (f14673e == null) {
            Paint paint = new Paint();
            f14673e = paint;
            paint.setColor(AbstractC1955j.f14686n);
            f14673e.setTextSize(AbstractC1955j.f14687o);
            f14673e.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
        }
        float ascent = f5 - ((f14673e.ascent() + f14673e.descent()) / 2.0f);
        f14673e.setTextAlign(align);
        canvas.drawText(str, f4, ascent, f14673e);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0027 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int e(int r4, int r5) {
        /*
            r0 = 90
            r1 = 2
            r2 = 1
            r3 = 3
            if (r5 != r0) goto L10
            if (r4 != r1) goto La
            goto L2a
        La:
            if (r4 != r2) goto Ld
            goto L2b
        Ld:
            if (r4 != r3) goto L27
            goto L23
        L10:
            r0 = 180(0xb4, float:2.52E-43)
            if (r5 != r0) goto L1d
            if (r4 != r1) goto L17
            goto L2b
        L17:
            if (r4 != r2) goto L1a
            goto L23
        L1a:
            if (r4 != r3) goto L2a
            goto L27
        L1d:
            r0 = 270(0x10e, float:3.78E-43)
            if (r5 != r0) goto L2c
            if (r4 != r1) goto L25
        L23:
            r4 = 4
            return r4
        L25:
            if (r4 != r2) goto L28
        L27:
            return r1
        L28:
            if (r4 != r3) goto L2b
        L2a:
            return r2
        L2b:
            return r3
        L2c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.AbstractC1954i.e(int, int):int");
    }
}
