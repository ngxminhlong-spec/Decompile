package l0;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import java.util.ArrayList;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: p, reason: collision with root package name */
    public static final Matrix f13906p = new Matrix();

    /* renamed from: a, reason: collision with root package name */
    public final Path f13907a;

    /* renamed from: b, reason: collision with root package name */
    public final Path f13908b;
    public final Matrix c;
    public Paint d;

    /* renamed from: e, reason: collision with root package name */
    public Paint f13909e;

    /* renamed from: f, reason: collision with root package name */
    public PathMeasure f13910f;

    /* renamed from: g, reason: collision with root package name */
    public final h f13911g;

    /* renamed from: h, reason: collision with root package name */
    public float f13912h;

    /* renamed from: i, reason: collision with root package name */
    public float f13913i;

    /* renamed from: j, reason: collision with root package name */
    public float f13914j;

    /* renamed from: k, reason: collision with root package name */
    public float f13915k;

    /* renamed from: l, reason: collision with root package name */
    public int f13916l;

    /* renamed from: m, reason: collision with root package name */
    public String f13917m;

    /* renamed from: n, reason: collision with root package name */
    public Boolean f13918n;

    /* renamed from: o, reason: collision with root package name */
    public final r.e f13919o;

    /* JADX WARN: Type inference failed for: r0v4, types: [r.e, r.i] */
    public k() {
        this.c = new Matrix();
        this.f13912h = 0.0f;
        this.f13913i = 0.0f;
        this.f13914j = 0.0f;
        this.f13915k = 0.0f;
        this.f13916l = 255;
        this.f13917m = null;
        this.f13918n = null;
        this.f13919o = new r.i(0);
        this.f13911g = new h();
        this.f13907a = new Path();
        this.f13908b = new Path();
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [r.e, r.i] */
    public k(k kVar) {
        this.c = new Matrix();
        this.f13912h = 0.0f;
        this.f13913i = 0.0f;
        this.f13914j = 0.0f;
        this.f13915k = 0.0f;
        this.f13916l = 255;
        this.f13917m = null;
        this.f13918n = null;
        ?? iVar = new r.i(0);
        this.f13919o = iVar;
        this.f13911g = new h(kVar.f13911g, iVar);
        this.f13907a = new Path(kVar.f13907a);
        this.f13908b = new Path(kVar.f13908b);
        this.f13912h = kVar.f13912h;
        this.f13913i = kVar.f13913i;
        this.f13914j = kVar.f13914j;
        this.f13915k = kVar.f13915k;
        this.f13916l = kVar.f13916l;
        this.f13917m = kVar.f13917m;
        String str = kVar.f13917m;
        if (str != null) {
            iVar.put(str, this);
        }
        this.f13918n = kVar.f13918n;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(h hVar, Matrix matrix, Canvas canvas, int i4, int i5) {
        int i6;
        float f4;
        int i7;
        float f5;
        Matrix matrix2 = hVar.f13895a;
        ArrayList arrayList = hVar.f13896b;
        matrix2.set(matrix);
        Matrix matrix3 = hVar.f13895a;
        matrix3.preConcat(hVar.f13902j);
        canvas.save();
        char c = 0;
        int i8 = 0;
        while (i8 < arrayList.size()) {
            i iVar = (i) arrayList.get(i8);
            if (iVar instanceof h) {
                a((h) iVar, matrix3, canvas, i4, i5);
            } else if (iVar instanceof j) {
                j jVar = (j) iVar;
                float f6 = i4 / this.f13914j;
                float f7 = i5 / this.f13915k;
                float min = Math.min(f6, f7);
                Matrix matrix4 = this.c;
                matrix4.set(matrix3);
                matrix4.postScale(f6, f7);
                float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                matrix3.mapVectors(fArr);
                float hypot = (float) Math.hypot(fArr[c], fArr[1]);
                boolean z4 = c;
                i6 = i8;
                float hypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                float f8 = (fArr[z4 ? 1 : 0] * fArr[3]) - (fArr[1] * fArr[2]);
                float max = Math.max(hypot, hypot2);
                float abs = max > 0.0f ? Math.abs(f8) / max : 0.0f;
                if (abs != 0.0f) {
                    Path path = this.f13907a;
                    path.reset();
                    A.e[] eVarArr = jVar.f13904a;
                    if (eVarArr != null) {
                        A.e.b(eVarArr, path);
                    }
                    Path path2 = this.f13908b;
                    path2.reset();
                    if (jVar instanceof f) {
                        path2.setFillType(jVar.c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                        path2.addPath(path, matrix4);
                        canvas.clipPath(path2);
                    } else {
                        g gVar = (g) jVar;
                        float f9 = gVar.f13889i;
                        if (f9 != 0.0f || gVar.f13890j != 1.0f) {
                            float f10 = gVar.f13891k;
                            float f11 = (f9 + f10) % 1.0f;
                            float f12 = (gVar.f13890j + f10) % 1.0f;
                            if (this.f13910f == null) {
                                this.f13910f = new PathMeasure();
                            }
                            this.f13910f.setPath(path, z4);
                            float length = this.f13910f.getLength();
                            float f13 = f11 * length;
                            float f14 = f12 * length;
                            path.reset();
                            if (f13 > f14) {
                                this.f13910f.getSegment(f13, length, path, true);
                                f4 = 0.0f;
                                this.f13910f.getSegment(0.0f, f14, path, true);
                            } else {
                                f4 = 0.0f;
                                this.f13910f.getSegment(f13, f14, path, true);
                            }
                            path.rLineTo(f4, f4);
                        }
                        path2.addPath(path, matrix4);
                        androidx.activity.result.c cVar = gVar.f13886f;
                        if (((Shader) cVar.f2432b) == null && cVar.f2431a == 0) {
                            f5 = 255.0f;
                            i7 = 16777215;
                        } else {
                            if (this.f13909e == null) {
                                i7 = 16777215;
                                Paint paint = new Paint(1);
                                this.f13909e = paint;
                                paint.setStyle(Paint.Style.FILL);
                            } else {
                                i7 = 16777215;
                            }
                            Paint paint2 = this.f13909e;
                            Shader shader = (Shader) cVar.f2432b;
                            if (shader != null) {
                                shader.setLocalMatrix(matrix4);
                                paint2.setShader(shader);
                                paint2.setAlpha(Math.round(gVar.f13888h * 255.0f));
                                f5 = 255.0f;
                            } else {
                                paint2.setShader(null);
                                paint2.setAlpha(255);
                                int i9 = cVar.f2431a;
                                float f15 = gVar.f13888h;
                                PorterDuff.Mode mode = n.f13931x;
                                f5 = 255.0f;
                                paint2.setColor((i9 & i7) | (((int) (Color.alpha(i9) * f15)) << 24));
                            }
                            paint2.setColorFilter(null);
                            path2.setFillType(gVar.c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            canvas.drawPath(path2, paint2);
                        }
                        androidx.activity.result.c cVar2 = gVar.d;
                        if (((Shader) cVar2.f2432b) != null || cVar2.f2431a != 0) {
                            if (this.d == null) {
                                Paint paint3 = new Paint(1);
                                this.d = paint3;
                                paint3.setStyle(Paint.Style.STROKE);
                            }
                            Paint paint4 = this.d;
                            Paint.Join join = gVar.f13893m;
                            if (join != null) {
                                paint4.setStrokeJoin(join);
                            }
                            Paint.Cap cap = gVar.f13892l;
                            if (cap != null) {
                                paint4.setStrokeCap(cap);
                            }
                            paint4.setStrokeMiter(gVar.f13894n);
                            Shader shader2 = (Shader) cVar2.f2432b;
                            if (shader2 != null) {
                                shader2.setLocalMatrix(matrix4);
                                paint4.setShader(shader2);
                                paint4.setAlpha(Math.round(gVar.f13887g * f5));
                            } else {
                                paint4.setShader(null);
                                paint4.setAlpha(255);
                                int i10 = cVar2.f2431a;
                                float f16 = gVar.f13887g;
                                PorterDuff.Mode mode2 = n.f13931x;
                                paint4.setColor((i10 & i7) | (((int) (Color.alpha(i10) * f16)) << 24));
                            }
                            paint4.setColorFilter(null);
                            paint4.setStrokeWidth(gVar.f13885e * min * abs);
                            canvas.drawPath(path2, paint4);
                        }
                    }
                }
                i8 = i6 + 1;
                c = 0;
            }
            i6 = i8;
            i8 = i6 + 1;
            c = 0;
        }
        canvas.restore();
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.f13916l;
    }

    public void setAlpha(float f4) {
        setRootAlpha((int) (f4 * 255.0f));
    }

    public void setRootAlpha(int i4) {
        this.f13916l = i4;
    }
}
