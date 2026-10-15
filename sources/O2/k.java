package O2;

import V2.u;
import android.R;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.FloatEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import com.google.android.gms.internal.play_billing.B;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: B, reason: collision with root package name */
    public static final P.a f1438B = C2.a.c;

    /* renamed from: C, reason: collision with root package name */
    public static final int[] f1439C = {R.attr.state_pressed, R.attr.state_enabled};

    /* renamed from: D, reason: collision with root package name */
    public static final int[] f1440D = {R.attr.state_hovered, R.attr.state_focused, R.attr.state_enabled};

    /* renamed from: E, reason: collision with root package name */
    public static final int[] f1441E = {R.attr.state_focused, R.attr.state_enabled};

    /* renamed from: F, reason: collision with root package name */
    public static final int[] f1442F = {R.attr.state_hovered, R.attr.state_enabled};

    /* renamed from: G, reason: collision with root package name */
    public static final int[] f1443G = {R.attr.state_enabled};

    /* renamed from: H, reason: collision with root package name */
    public static final int[] f1444H = new int[0];

    /* renamed from: A, reason: collision with root package name */
    public g f1445A;

    /* renamed from: a, reason: collision with root package name */
    public V2.k f1446a;

    /* renamed from: b, reason: collision with root package name */
    public V2.g f1447b;
    public Drawable c;
    public b d;

    /* renamed from: e, reason: collision with root package name */
    public LayerDrawable f1448e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1449f;

    /* renamed from: h, reason: collision with root package name */
    public float f1451h;

    /* renamed from: i, reason: collision with root package name */
    public float f1452i;

    /* renamed from: j, reason: collision with root package name */
    public float f1453j;

    /* renamed from: k, reason: collision with root package name */
    public int f1454k;

    /* renamed from: l, reason: collision with root package name */
    public C2.d f1455l;

    /* renamed from: m, reason: collision with root package name */
    public C2.d f1456m;

    /* renamed from: n, reason: collision with root package name */
    public Animator f1457n;

    /* renamed from: o, reason: collision with root package name */
    public C2.d f1458o;

    /* renamed from: p, reason: collision with root package name */
    public C2.d f1459p;

    /* renamed from: q, reason: collision with root package name */
    public float f1460q;

    /* renamed from: s, reason: collision with root package name */
    public int f1462s;

    /* renamed from: u, reason: collision with root package name */
    public final FloatingActionButton f1464u;

    /* renamed from: v, reason: collision with root package name */
    public final x0.f f1465v;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1450g = true;

    /* renamed from: r, reason: collision with root package name */
    public float f1461r = 1.0f;

    /* renamed from: t, reason: collision with root package name */
    public int f1463t = 0;

    /* renamed from: w, reason: collision with root package name */
    public final Rect f1466w = new Rect();

    /* renamed from: x, reason: collision with root package name */
    public final RectF f1467x = new RectF();
    public final RectF y = new RectF();

    /* renamed from: z, reason: collision with root package name */
    public final Matrix f1468z = new Matrix();

    public k(FloatingActionButton floatingActionButton, x0.f fVar) {
        this.f1464u = floatingActionButton;
        this.f1465v = fVar;
        q2.e eVar = new q2.e(3);
        m mVar = (m) this;
        eVar.e(f1439C, c(new i(mVar, 1)));
        eVar.e(f1440D, c(new i(mVar, 0)));
        eVar.e(f1441E, c(new i(mVar, 0)));
        eVar.e(f1442F, c(new i(mVar, 0)));
        eVar.e(f1443G, c(new i(mVar, 2)));
        eVar.e(f1444H, c(new j(mVar)));
        this.f1460q = floatingActionButton.getRotation();
    }

    public static ValueAnimator c(j jVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(f1438B);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(jVar);
        valueAnimator.addUpdateListener(jVar);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    public final void a(float f4, Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.f1464u.getDrawable();
        if (drawable == null || this.f1462s == 0) {
            return;
        }
        float intrinsicWidth = drawable.getIntrinsicWidth();
        float intrinsicHeight = drawable.getIntrinsicHeight();
        RectF rectF = this.f1467x;
        rectF.set(0.0f, 0.0f, intrinsicWidth, intrinsicHeight);
        float f5 = this.f1462s;
        RectF rectF2 = this.y;
        rectF2.set(0.0f, 0.0f, f5, f5);
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        float f6 = this.f1462s / 2.0f;
        matrix.postScale(f4, f4, f6, f6);
    }

    public final AnimatorSet b(C2.d dVar, float f4, float f5, float f6) {
        ArrayList arrayList = new ArrayList();
        Property property = View.ALPHA;
        int i4 = 0;
        float[] fArr = {f4};
        FloatingActionButton floatingActionButton = this.f1464u;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) property, fArr);
        dVar.d("opacity").a(ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.SCALE_X, f5);
        dVar.d("scale").a(ofFloat2);
        int i5 = Build.VERSION.SDK_INT;
        if (i5 == 26) {
            f fVar = new f(i4);
            fVar.f1431b = new FloatEvaluator();
            ofFloat2.setEvaluator(fVar);
        }
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.SCALE_Y, f5);
        dVar.d("scale").a(ofFloat3);
        if (i5 == 26) {
            f fVar2 = new f(i4);
            fVar2.f1431b = new FloatEvaluator();
            ofFloat3.setEvaluator(fVar2);
        }
        arrayList.add(ofFloat3);
        Matrix matrix = this.f1468z;
        a(f6, matrix);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(floatingActionButton, new C2.c(), new e(this), new Matrix(matrix));
        dVar.d("iconScale").a(ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        B.E(animatorSet, arrayList);
        return animatorSet;
    }

    public abstract float d();

    public void e(Rect rect) {
        int sizeDimension = this.f1449f ? (this.f1454k - this.f1464u.getSizeDimension()) / 2 : 0;
        int max = Math.max(sizeDimension, (int) Math.ceil(this.f1450g ? d() + this.f1453j : 0.0f));
        int max2 = Math.max(sizeDimension, (int) Math.ceil(r1 * 1.5f));
        rect.set(max, max2, max, max2);
    }

    public abstract void f(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i4);

    public abstract void g();

    public abstract void h();

    public abstract void i(int[] iArr);

    public abstract void j(float f4, float f5, float f6);

    public final void k() {
    }

    public void l(ColorStateList colorStateList) {
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.setTintList(T2.a.a(colorStateList));
        }
    }

    public final void m(V2.k kVar) {
        this.f1446a = kVar;
        V2.g gVar = this.f1447b;
        if (gVar != null) {
            gVar.setShapeAppearanceModel(kVar);
        }
        Object obj = this.c;
        if (obj instanceof u) {
            ((u) obj).setShapeAppearanceModel(kVar);
        }
        b bVar = this.d;
        if (bVar != null) {
            bVar.f1424o = kVar;
            bVar.invalidateSelf();
        }
    }

    public abstract boolean n();

    public abstract void o();

    public final void p() {
        Rect rect = this.f1466w;
        e(rect);
        if (this.f1448e == null) {
            throw new NullPointerException("Didn't initialize content background");
        }
        boolean n4 = n();
        x0.f fVar = this.f1465v;
        if (n4) {
            FloatingActionButton.b((FloatingActionButton) fVar.f15212p, new InsetDrawable((Drawable) this.f1448e, rect.left, rect.top, rect.right, rect.bottom));
        } else {
            LayerDrawable layerDrawable = this.f1448e;
            if (layerDrawable != null) {
                FloatingActionButton.b((FloatingActionButton) fVar.f15212p, layerDrawable);
            } else {
                fVar.getClass();
            }
        }
        int i4 = rect.left;
        int i5 = rect.top;
        int i6 = rect.right;
        int i7 = rect.bottom;
        FloatingActionButton floatingActionButton = (FloatingActionButton) fVar.f15212p;
        floatingActionButton.f12433z.set(i4, i5, i6, i7);
        int i8 = floatingActionButton.f12431w;
        floatingActionButton.setPadding(i4 + i8, i5 + i8, i6 + i8, i7 + i8);
    }
}
