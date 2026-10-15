package h;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.StateSet;
import r.g;
import r.h;
import r.j;
import s.AbstractC1969a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: h.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1688b extends Drawable.ConstantState {

    /* renamed from: A, reason: collision with root package name */
    public boolean f13043A;

    /* renamed from: B, reason: collision with root package name */
    public ColorFilter f13044B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f13045C;

    /* renamed from: D, reason: collision with root package name */
    public ColorStateList f13046D;

    /* renamed from: E, reason: collision with root package name */
    public PorterDuff.Mode f13047E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f13048F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f13049G;

    /* renamed from: H, reason: collision with root package name */
    public int[][] f13050H;

    /* renamed from: I, reason: collision with root package name */
    public g f13051I;

    /* renamed from: J, reason: collision with root package name */
    public j f13052J;

    /* renamed from: a, reason: collision with root package name */
    public final C1691e f13053a;

    /* renamed from: b, reason: collision with root package name */
    public Resources f13054b;
    public int c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f13055e;

    /* renamed from: f, reason: collision with root package name */
    public SparseArray f13056f;

    /* renamed from: g, reason: collision with root package name */
    public Drawable[] f13057g;

    /* renamed from: h, reason: collision with root package name */
    public int f13058h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f13059i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f13060j;

    /* renamed from: k, reason: collision with root package name */
    public Rect f13061k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f13062l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f13063m;

    /* renamed from: n, reason: collision with root package name */
    public int f13064n;

    /* renamed from: o, reason: collision with root package name */
    public int f13065o;

    /* renamed from: p, reason: collision with root package name */
    public int f13066p;

    /* renamed from: q, reason: collision with root package name */
    public int f13067q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f13068r;

    /* renamed from: s, reason: collision with root package name */
    public int f13069s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f13070t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f13071u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f13072v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f13073w;

    /* renamed from: x, reason: collision with root package name */
    public int f13074x;
    public int y;

    /* renamed from: z, reason: collision with root package name */
    public int f13075z;

    public C1688b(C1688b c1688b, C1691e c1691e, Resources resources) {
        this.c = 160;
        this.f13059i = false;
        this.f13062l = false;
        this.f13073w = true;
        this.y = 0;
        this.f13075z = 0;
        this.f13053a = c1691e;
        this.f13054b = resources != null ? resources : c1688b != null ? c1688b.f13054b : null;
        int i4 = c1688b != null ? c1688b.c : 0;
        int i5 = C1691e.f13079H;
        i4 = resources != null ? resources.getDisplayMetrics().densityDpi : i4;
        int i6 = i4 != 0 ? i4 : 160;
        this.c = i6;
        if (c1688b != null) {
            this.d = c1688b.d;
            this.f13055e = c1688b.f13055e;
            this.f13071u = true;
            this.f13072v = true;
            this.f13059i = c1688b.f13059i;
            this.f13062l = c1688b.f13062l;
            this.f13073w = c1688b.f13073w;
            this.f13074x = c1688b.f13074x;
            this.y = c1688b.y;
            this.f13075z = c1688b.f13075z;
            this.f13043A = c1688b.f13043A;
            this.f13044B = c1688b.f13044B;
            this.f13045C = c1688b.f13045C;
            this.f13046D = c1688b.f13046D;
            this.f13047E = c1688b.f13047E;
            this.f13048F = c1688b.f13048F;
            this.f13049G = c1688b.f13049G;
            if (c1688b.c == i6) {
                if (c1688b.f13060j) {
                    this.f13061k = new Rect(c1688b.f13061k);
                    this.f13060j = true;
                }
                if (c1688b.f13063m) {
                    this.f13064n = c1688b.f13064n;
                    this.f13065o = c1688b.f13065o;
                    this.f13066p = c1688b.f13066p;
                    this.f13067q = c1688b.f13067q;
                    this.f13063m = true;
                }
            }
            if (c1688b.f13068r) {
                this.f13069s = c1688b.f13069s;
                this.f13068r = true;
            }
            if (c1688b.f13070t) {
                this.f13070t = true;
            }
            Drawable[] drawableArr = c1688b.f13057g;
            this.f13057g = new Drawable[drawableArr.length];
            this.f13058h = c1688b.f13058h;
            SparseArray sparseArray = c1688b.f13056f;
            if (sparseArray != null) {
                this.f13056f = sparseArray.clone();
            } else {
                this.f13056f = new SparseArray(this.f13058h);
            }
            int i7 = this.f13058h;
            for (int i8 = 0; i8 < i7; i8++) {
                Drawable drawable = drawableArr[i8];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.f13056f.put(i8, constantState);
                    } else {
                        this.f13057g[i8] = drawableArr[i8];
                    }
                }
            }
        } else {
            this.f13057g = new Drawable[10];
            this.f13058h = 0;
        }
        if (c1688b != null) {
            this.f13050H = c1688b.f13050H;
        } else {
            this.f13050H = new int[this.f13057g.length];
        }
        if (c1688b != null) {
            this.f13051I = c1688b.f13051I;
            this.f13052J = c1688b.f13052J;
        } else {
            this.f13051I = new g();
            this.f13052J = new j();
        }
    }

    public final int a(Drawable drawable) {
        int i4 = this.f13058h;
        if (i4 >= this.f13057g.length) {
            int i5 = i4 + 10;
            Drawable[] drawableArr = new Drawable[i5];
            System.arraycopy(this.f13057g, 0, drawableArr, 0, i4);
            this.f13057g = drawableArr;
            int[][] iArr = new int[i5];
            System.arraycopy(this.f13050H, 0, iArr, 0, i4);
            this.f13050H = iArr;
        }
        drawable.mutate();
        drawable.setVisible(false, true);
        drawable.setCallback(this.f13053a);
        this.f13057g[i4] = drawable;
        this.f13058h++;
        this.f13055e = drawable.getChangingConfigurations() | this.f13055e;
        this.f13068r = false;
        this.f13070t = false;
        this.f13061k = null;
        this.f13060j = false;
        this.f13063m = false;
        this.f13071u = false;
        return i4;
    }

    public final void b() {
        this.f13063m = true;
        c();
        int i4 = this.f13058h;
        Drawable[] drawableArr = this.f13057g;
        this.f13065o = -1;
        this.f13064n = -1;
        this.f13067q = 0;
        this.f13066p = 0;
        for (int i5 = 0; i5 < i4; i5++) {
            Drawable drawable = drawableArr[i5];
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (intrinsicWidth > this.f13064n) {
                this.f13064n = intrinsicWidth;
            }
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicHeight > this.f13065o) {
                this.f13065o = intrinsicHeight;
            }
            int minimumWidth = drawable.getMinimumWidth();
            if (minimumWidth > this.f13066p) {
                this.f13066p = minimumWidth;
            }
            int minimumHeight = drawable.getMinimumHeight();
            if (minimumHeight > this.f13067q) {
                this.f13067q = minimumHeight;
            }
        }
    }

    public final void c() {
        SparseArray sparseArray = this.f13056f;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i4 = 0; i4 < size; i4++) {
                int keyAt = this.f13056f.keyAt(i4);
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f13056f.valueAt(i4);
                Drawable[] drawableArr = this.f13057g;
                Drawable newDrawable = constantState.newDrawable(this.f13054b);
                newDrawable.setLayoutDirection(this.f13074x);
                Drawable mutate = newDrawable.mutate();
                mutate.setCallback(this.f13053a);
                drawableArr[keyAt] = mutate;
            }
            this.f13056f = null;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        int i4 = this.f13058h;
        Drawable[] drawableArr = this.f13057g;
        for (int i5 = 0; i5 < i4; i5++) {
            Drawable drawable = drawableArr[i5];
            if (drawable == null) {
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f13056f.get(i5);
                if (constantState != null && constantState.canApplyTheme()) {
                    return true;
                }
            } else if (drawable.canApplyTheme()) {
                return true;
            }
        }
        return false;
    }

    public final Drawable d(int i4) {
        int indexOfKey;
        Drawable drawable = this.f13057g[i4];
        if (drawable != null) {
            return drawable;
        }
        SparseArray sparseArray = this.f13056f;
        if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i4)) < 0) {
            return null;
        }
        Drawable newDrawable = ((Drawable.ConstantState) this.f13056f.valueAt(indexOfKey)).newDrawable(this.f13054b);
        newDrawable.setLayoutDirection(this.f13074x);
        Drawable mutate = newDrawable.mutate();
        mutate.setCallback(this.f13053a);
        this.f13057g[i4] = mutate;
        this.f13056f.removeAt(indexOfKey);
        if (this.f13056f.size() == 0) {
            this.f13056f = null;
        }
        return mutate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public final int e(int i4) {
        ?? r5;
        if (i4 < 0) {
            return 0;
        }
        j jVar = this.f13052J;
        int i5 = 0;
        int a4 = AbstractC1969a.a(jVar.f14745r, i4, jVar.f14743p);
        if (a4 >= 0 && (r5 = jVar.f14744q[a4]) != h.f14738b) {
            i5 = r5;
        }
        return i5.intValue();
    }

    public final int f(int[] iArr) {
        int[][] iArr2 = this.f13050H;
        int i4 = this.f13058h;
        for (int i5 = 0; i5 < i4; i5++) {
            if (StateSet.stateSetMatches(iArr2[i5], iArr)) {
                return i5;
            }
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.d | this.f13055e;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new C1691e(this, null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new C1691e(this, resources);
    }
}
