package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import e.AbstractC1657a;
import java.util.Arrays;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class L {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f13648a;

    /* renamed from: b, reason: collision with root package name */
    public z0 f13649b;
    public z0 c;
    public z0 d;

    /* renamed from: e, reason: collision with root package name */
    public z0 f13650e;

    /* renamed from: f, reason: collision with root package name */
    public z0 f13651f;

    /* renamed from: g, reason: collision with root package name */
    public z0 f13652g;

    /* renamed from: h, reason: collision with root package name */
    public z0 f13653h;

    /* renamed from: i, reason: collision with root package name */
    public final N f13654i;

    /* renamed from: j, reason: collision with root package name */
    public int f13655j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f13656k = -1;

    /* renamed from: l, reason: collision with root package name */
    public Typeface f13657l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f13658m;

    public L(TextView textView) {
        this.f13648a = textView;
        this.f13654i = new N(textView);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [l.z0, java.lang.Object] */
    public static z0 c(Context context, r rVar, int i4) {
        ColorStateList i5;
        synchronized (rVar) {
            i5 = rVar.f13821a.i(context, i4);
        }
        if (i5 == null) {
            return null;
        }
        ?? obj = new Object();
        obj.d = true;
        obj.f13867a = i5;
        return obj;
    }

    public final void a(Drawable drawable, z0 z0Var) {
        if (drawable == null || z0Var == null) {
            return;
        }
        r.e(drawable, z0Var, this.f13648a.getDrawableState());
    }

    public final void b() {
        z0 z0Var = this.f13649b;
        TextView textView = this.f13648a;
        if (z0Var != null || this.c != null || this.d != null || this.f13650e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.f13649b);
            a(compoundDrawables[1], this.c);
            a(compoundDrawables[2], this.d);
            a(compoundDrawables[3], this.f13650e);
        }
        if (this.f13651f == null && this.f13652g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f13651f);
        a(compoundDrawablesRelative[2], this.f13652g);
    }

    /* JADX WARN: Code restructure failed: missing block: B:159:0x034d, code lost:
    
        if (r4 != null) goto L218;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(android.util.AttributeSet r26, int r27) {
        /*
            Method dump skipped, instructions count: 964
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.L.d(android.util.AttributeSet, int):void");
    }

    public final void e(Context context, int i4) {
        String string;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i4, AbstractC1657a.f12655w);
        q2.e eVar = new q2.e(context, obtainStyledAttributes);
        boolean hasValue = obtainStyledAttributes.hasValue(14);
        TextView textView = this.f13648a;
        if (hasValue) {
            textView.setAllCaps(obtainStyledAttributes.getBoolean(14, false));
        }
        int i5 = Build.VERSION.SDK_INT;
        if (obtainStyledAttributes.hasValue(0) && obtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        i(context, eVar);
        if (i5 >= 26 && obtainStyledAttributes.hasValue(13) && (string = obtainStyledAttributes.getString(13)) != null) {
            textView.setFontVariationSettings(string);
        }
        eVar.y();
        Typeface typeface = this.f13657l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f13655j);
        }
    }

    public final void f(int i4, int i5, int i6, int i7) {
        N n4 = this.f13654i;
        if (n4.j()) {
            DisplayMetrics displayMetrics = n4.f13673j.getResources().getDisplayMetrics();
            n4.k(TypedValue.applyDimension(i7, i4, displayMetrics), TypedValue.applyDimension(i7, i5, displayMetrics), TypedValue.applyDimension(i7, i6, displayMetrics));
            if (n4.h()) {
                n4.a();
            }
        }
    }

    public final void g(int[] iArr, int i4) {
        N n4 = this.f13654i;
        if (n4.j()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i4 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = n4.f13673j.getResources().getDisplayMetrics();
                    for (int i5 = 0; i5 < length; i5++) {
                        iArr2[i5] = Math.round(TypedValue.applyDimension(i4, iArr[i5], displayMetrics));
                    }
                }
                n4.f13669f = N.b(iArr2);
                if (!n4.i()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                n4.f13670g = false;
            }
            if (n4.h()) {
                n4.a();
            }
        }
    }

    public final void h(int i4) {
        N n4 = this.f13654i;
        if (n4.j()) {
            if (i4 == 0) {
                n4.f13666a = 0;
                n4.d = -1.0f;
                n4.f13668e = -1.0f;
                n4.c = -1.0f;
                n4.f13669f = new int[0];
                n4.f13667b = false;
                return;
            }
            if (i4 != 1) {
                throw new IllegalArgumentException(U.a.i("Unknown auto-size text type: ", i4));
            }
            DisplayMetrics displayMetrics = n4.f13673j.getResources().getDisplayMetrics();
            n4.k(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (n4.h()) {
                n4.a();
            }
        }
    }

    public final void i(Context context, q2.e eVar) {
        String string;
        Typeface create;
        Typeface create2;
        int i4 = this.f13655j;
        TypedArray typedArray = (TypedArray) eVar.f14710q;
        this.f13655j = typedArray.getInt(2, i4);
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 28) {
            int i6 = typedArray.getInt(11, -1);
            this.f13656k = i6;
            if (i6 != -1) {
                this.f13655j &= 2;
            }
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.f13658m = false;
                int i7 = typedArray.getInt(1, 1);
                if (i7 == 1) {
                    this.f13657l = Typeface.SANS_SERIF;
                    return;
                } else if (i7 == 2) {
                    this.f13657l = Typeface.SERIF;
                    return;
                } else {
                    if (i7 != 3) {
                        return;
                    }
                    this.f13657l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f13657l = null;
        int i8 = typedArray.hasValue(12) ? 12 : 10;
        int i9 = this.f13656k;
        int i10 = this.f13655j;
        if (!context.isRestricted()) {
            try {
                Typeface r4 = eVar.r(i8, this.f13655j, new K(this, i9, i10));
                if (r4 != null) {
                    if (i5 < 28 || this.f13656k == -1) {
                        this.f13657l = r4;
                    } else {
                        create2 = Typeface.create(Typeface.create(r4, 0), this.f13656k, (this.f13655j & 2) != 0);
                        this.f13657l = create2;
                    }
                }
                this.f13658m = this.f13657l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f13657l != null || (string = typedArray.getString(i8)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f13656k == -1) {
            this.f13657l = Typeface.create(string, this.f13655j);
        } else {
            create = Typeface.create(Typeface.create(string, 0), this.f13656k, (this.f13655j & 2) != 0);
            this.f13657l = create;
        }
    }
}
