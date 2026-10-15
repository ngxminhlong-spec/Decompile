package V2;

import Q1.N;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.ads.AbstractC1066q6;
import com.google.android.gms.internal.ads.BinderC0489cm;
import com.google.android.gms.internal.ads.Bs;
import com.google.android.gms.internal.ads.C0248Bc;
import com.google.android.gms.internal.ads.C0272Fc;
import com.google.android.gms.internal.ads.C0284He;
import com.google.android.gms.internal.ads.C0333Rd;
import com.google.android.gms.internal.ads.C0347Uc;
import com.google.android.gms.internal.ads.C0348Ud;
import com.google.android.gms.internal.ads.C0396ae;
import com.google.android.gms.internal.ads.C0443bi;
import com.google.android.gms.internal.ads.C0640g8;
import com.google.android.gms.internal.ads.C1302vm;
import com.google.android.gms.internal.ads.C1434yp;
import com.google.android.gms.internal.ads.Cp;
import com.google.android.gms.internal.ads.InterfaceC0570ei;
import com.google.android.gms.internal.ads.Jp;
import com.google.android.gms.internal.ads.Nj;
import com.google.android.gms.internal.ads.Og;
import com.google.android.gms.internal.ads.Oj;
import com.google.android.gms.internal.ads.Vh;
import com.google.android.gms.internal.ads.X7;
import com.google.android.gms.internal.ads.Xj;
import com.google.android.gms.internal.ads.Y9;
import com.google.android.gms.internal.play_billing.B;
import java.util.ArrayList;
import java.util.BitSet;
import v3.C2033d;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class l implements InterfaceC0570ei {

    /* renamed from: o, reason: collision with root package name */
    public final boolean f1913o;

    /* renamed from: p, reason: collision with root package name */
    public final Object f1914p;

    /* renamed from: q, reason: collision with root package name */
    public final Object f1915q;

    /* renamed from: r, reason: collision with root package name */
    public final Object f1916r;

    /* renamed from: s, reason: collision with root package name */
    public final Parcelable f1917s;

    /* renamed from: t, reason: collision with root package name */
    public final Object f1918t;

    /* renamed from: u, reason: collision with root package name */
    public final Object f1919u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f1920v;

    /* renamed from: w, reason: collision with root package name */
    public final Object f1921w;

    /* renamed from: x, reason: collision with root package name */
    public final Object f1922x;

    public l() {
        this.f1914p = new t[4];
        this.f1915q = new Matrix[4];
        this.f1916r = new Matrix[4];
        this.f1917s = new PointF();
        this.f1918t = new Path();
        this.f1919u = new Path();
        this.f1920v = new t();
        this.f1921w = new float[2];
        this.f1922x = new float[2];
        this.f1913o = true;
        for (int i4 = 0; i4 < 4; i4++) {
            ((t[]) this.f1914p)[i4] = new t();
            ((Matrix[]) this.f1915q)[i4] = new Matrix();
            ((Matrix[]) this.f1916r)[i4] = new Matrix();
        }
    }

    public l(Context context, Oj oj, Jp jp, C0248Bc c0248Bc, C1434yp c1434yp, C0272Fc c0272Fc, C0348Ud c0348Ud, C0640g8 c0640g8, boolean z4, BinderC0489cm binderC0489cm) {
        this.f1914p = context;
        this.f1915q = oj;
        this.f1916r = jp;
        this.f1917s = c0248Bc;
        this.f1918t = c1434yp;
        this.f1919u = c0272Fc;
        this.f1920v = c0348Ud;
        this.f1921w = c0640g8;
        this.f1913o = z4;
        this.f1922x = binderC0489cm;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v5 */
    public void a(k kVar, float f4, RectF rectF, x0.f fVar, Path path) {
        int i4;
        boolean z4;
        float f5;
        boolean z5;
        Matrix[] matrixArr = (Matrix[]) this.f1916r;
        float[] fArr = (float[]) this.f1921w;
        t[] tVarArr = (t[]) this.f1914p;
        Matrix[] matrixArr2 = (Matrix[]) this.f1915q;
        path.rewind();
        Path path2 = (Path) this.f1918t;
        path2.rewind();
        Path path3 = (Path) this.f1919u;
        path3.rewind();
        path3.addRect(rectF, Path.Direction.CW);
        int i5 = 0;
        while (true) {
            z4 = 0;
            if (i5 >= 4) {
                break;
            }
            PointF pointF = (PointF) this.f1917s;
            c cVar = i5 != 1 ? i5 != 2 ? i5 != 3 ? kVar.f1906f : kVar.f1905e : kVar.f1908h : kVar.f1907g;
            B b4 = i5 != 1 ? i5 != 2 ? i5 != 3 ? kVar.f1904b : kVar.f1903a : kVar.d : kVar.c;
            t tVar = tVarArr[i5];
            b4.getClass();
            Matrix[] matrixArr3 = matrixArr;
            b4.w(tVar, f4, cVar.a(rectF));
            int i6 = i5 + 1;
            float f6 = i6 * 90;
            matrixArr2[i5].reset();
            if (i5 == 1) {
                pointF.set(rectF.right, rectF.bottom);
            } else if (i5 == 2) {
                pointF.set(rectF.left, rectF.bottom);
            } else if (i5 != 3) {
                pointF.set(rectF.right, rectF.top);
            } else {
                pointF.set(rectF.left, rectF.top);
            }
            matrixArr2[i5].setTranslate(pointF.x, pointF.y);
            matrixArr2[i5].preRotate(f6);
            t tVar2 = tVarArr[i5];
            fArr[0] = tVar2.f1935b;
            fArr[1] = tVar2.c;
            matrixArr2[i5].mapPoints(fArr);
            matrixArr3[i5].reset();
            matrixArr3[i5].setTranslate(fArr[0], fArr[1]);
            matrixArr3[i5].preRotate(f6);
            i5 = i6;
            matrixArr = matrixArr3;
        }
        Matrix[] matrixArr4 = matrixArr;
        int i7 = 0;
        for (i4 = 4; i7 < i4; i4 = 4) {
            t tVar3 = tVarArr[i7];
            tVar3.getClass();
            fArr[z4] = 0.0f;
            fArr[1] = tVar3.f1934a;
            matrixArr2[i7].mapPoints(fArr);
            if (i7 == 0) {
                path.moveTo(fArr[z4], fArr[1]);
            } else {
                path.lineTo(fArr[z4], fArr[1]);
            }
            tVarArr[i7].b(matrixArr2[i7], path);
            if (fVar != null) {
                t tVar4 = tVarArr[i7];
                Matrix matrix = matrixArr2[i7];
                g gVar = (g) fVar.f15212p;
                BitSet bitSet = gVar.f1883r;
                tVar4.getClass();
                f5 = 0.0f;
                bitSet.set(i7, z4);
                s[] sVarArr = gVar.f1881p;
                tVar4.a(tVar4.f1936e);
                sVarArr[i7] = new m(new ArrayList(tVar4.f1938g), matrix);
            } else {
                f5 = 0.0f;
            }
            t tVar5 = (t) this.f1920v;
            int i8 = i7 + 1;
            int i9 = i8 % 4;
            t tVar6 = tVarArr[i7];
            fArr[0] = tVar6.f1935b;
            fArr[1] = tVar6.c;
            matrixArr2[i7].mapPoints(fArr);
            float[] fArr2 = (float[]) this.f1922x;
            t tVar7 = tVarArr[i9];
            tVar7.getClass();
            fArr2[0] = f5;
            fArr2[1] = tVar7.f1934a;
            matrixArr2[i9].mapPoints(fArr2);
            t[] tVarArr2 = tVarArr;
            Matrix[] matrixArr5 = matrixArr2;
            float max = Math.max(((float) Math.hypot(fArr[0] - fArr2[0], fArr[1] - fArr2[1])) - 0.001f, f5);
            t tVar8 = tVarArr2[i7];
            fArr[0] = tVar8.f1935b;
            fArr[1] = tVar8.c;
            matrixArr5[i7].mapPoints(fArr);
            if (i7 == 1 || i7 == 3) {
                Math.abs(rectF.centerX() - fArr[0]);
            } else {
                Math.abs(rectF.centerY() - fArr[1]);
            }
            tVar5.d(0.0f, 270.0f, 0.0f);
            (i7 != 1 ? i7 != 2 ? i7 != 3 ? kVar.f1910j : kVar.f1909i : kVar.f1912l : kVar.f1911k).getClass();
            tVar5.c(max, 0.0f);
            Path path4 = new Path();
            tVar5.b(matrixArr4[i7], path4);
            if (this.f1913o && (b(path4, i7) || b(path4, i9))) {
                path4.op(path4, path3, Path.Op.DIFFERENCE);
                fArr[0] = 0.0f;
                fArr[1] = tVar5.f1934a;
                matrixArr4[i7].mapPoints(fArr);
                path2.moveTo(fArr[0], fArr[1]);
                tVar5.b(matrixArr4[i7], path2);
            } else {
                tVar5.b(matrixArr4[i7], path);
            }
            if (fVar != null) {
                Matrix matrix2 = matrixArr4[i7];
                g gVar2 = (g) fVar.f15212p;
                z5 = false;
                gVar2.f1883r.set(i7 + 4, false);
                s[] sVarArr2 = gVar2.f1882q;
                tVar5.a(tVar5.f1936e);
                sVarArr2[i7] = new m(new ArrayList(tVar5.f1938g), matrix2);
            } else {
                z5 = false;
            }
            i7 = i8;
            z4 = z5;
            tVarArr = tVarArr2;
            matrixArr2 = matrixArr5;
        }
        path.close();
        path2.close();
        if (path2.isEmpty()) {
            return;
        }
        path.op(path2, Path.Op.UNION);
    }

    public boolean b(Path path, int i4) {
        Path path2 = new Path();
        ((t[]) this.f1914p)[i4].b(((Matrix[]) this.f1915q)[i4], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        return !rectF.isEmpty() || (rectF.width() > 1.0f && rectF.height() > 1.0f);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0570ei
    public void j(boolean z4, Context context, Og og) {
        Jp jp = (Jp) this.f1916r;
        C0348Ud c0348Ud = (C0348Ud) this.f1920v;
        C1434yp c1434yp = (C1434yp) this.f1918t;
        C0640g8 c0640g8 = (C0640g8) this.f1921w;
        boolean z5 = this.f1913o;
        C0284He c0284He = (C0284He) Bs.q0((C0272Fc) this.f1919u);
        try {
            if (c0348Ud.f7167q.get()) {
                if (((Boolean) O1.r.d.c.a(AbstractC1066q6.f10088C0)).booleanValue()) {
                    c0348Ud = ((Oj) this.f1915q).a(jp.f5910e, null, null);
                    c0348Ud.A0("/reward", new X7(4, (Vh) c0284He.f5466x.c()));
                    C0347Uc c0347Uc = new C0347Uc(6, (byte) 0);
                    ((Nj) c0284He.y.c()).a(c0348Ud, true, z5 ? c0640g8 : null);
                    C0396ae c0396ae = c0348Ud.f7165o.f7464A;
                    c0396ae.f8147u = new Xj(8, c0347Uc, c0348Ud);
                    c0396ae.f8148v = new C1302vm(c0348Ud);
                    Cp cp = c1434yp.f11534s;
                    c0348Ud.J(cp.f4552b, cp.f4551a);
                }
            }
            C0348Ud c0348Ud2 = c0348Ud;
            c0348Ud2.y0(true);
            boolean z6 = false;
            boolean c = z5 ? c0640g8.c(false) : false;
            N n4 = N1.n.f1204A.c;
            boolean f4 = N.f((Context) this.f1914p);
            if (z5) {
                synchronized (c0640g8) {
                    z6 = c0640g8.f8788b;
                }
            }
            N1.h hVar = new N1.h(c, f4, z6, z5 ? c0640g8.a() : 0.0f, z4, c1434yp.f11488O, c1434yp.f11489P);
            if (og != null) {
                og.d();
            }
            C0443bi c0443bi = (C0443bi) c0284He.f5465w.c();
            C0248Bc c0248Bc = (C0248Bc) this.f1917s;
            int i4 = c1434yp.f11490Q;
            String str = c1434yp.f11476B;
            Cp cp2 = c1434yp.f11534s;
            C2033d.m(context, new AdOverlayInfoParcel(c0443bi, c0348Ud2, i4, c0248Bc, str, hVar, cp2.f4552b, cp2.f4551a, jp.f5911f, og, c1434yp.f11515i0 ? (BinderC0489cm) this.f1922x : null), true);
        } catch (C0333Rd e4) {
            Y9.q("", e4);
        }
    }
}
