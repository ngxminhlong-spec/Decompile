package com.google.android.gms.internal.ads;

import H.AbstractC0044t;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import b0.C0169C;
import b0.C0188a;
import com.duracodefactory.logiccircuitsimulatorpro.MainActivity;
import d3.AbstractC1654b;
import e.AbstractC1657a;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.WeakHashMap;
import m2.AbstractC1806a;
import q1.C1951f;
import q1.C1952g;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Tw implements Ww {

    /* renamed from: a, reason: collision with root package name */
    public int f7098a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f7099b;
    public final Object c;
    public Object d;

    /* renamed from: e, reason: collision with root package name */
    public Object f7100e;

    /* renamed from: f, reason: collision with root package name */
    public Object f7101f;

    public Tw(int i4, MainActivity mainActivity, B0.b bVar, Handler handler, boolean[] zArr, B1.a aVar) {
        this.f7098a = i4;
        this.f7099b = mainActivity;
        this.c = bVar;
        this.d = handler;
        this.f7100e = zArr;
        this.f7101f = aVar;
    }

    public Tw(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i4, V2.k kVar, Rect rect) {
        com.google.android.gms.internal.play_billing.B.f(rect.left);
        com.google.android.gms.internal.play_billing.B.f(rect.top);
        com.google.android.gms.internal.play_billing.B.f(rect.right);
        com.google.android.gms.internal.play_billing.B.f(rect.bottom);
        this.f7099b = rect;
        this.c = colorStateList2;
        this.d = colorStateList;
        this.f7100e = colorStateList3;
        this.f7098a = i4;
        this.f7101f = kVar;
    }

    public Tw(View view) {
        this.f7098a = -1;
        this.f7099b = view;
        this.c = l.r.a();
    }

    public Tw(C0169C c0169c) {
        this.f7099b = new B0.r(30, 2);
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.f7098a = 0;
        this.f7100e = c0169c;
        this.f7101f = new D3.d(24, this);
    }

    public Tw(String str, AbstractC0886lz abstractC0886lz, int i4, Jy jy, Integer num) {
        this.f7099b = str;
        this.c = AbstractC0415ax.a(str);
        this.d = abstractC0886lz;
        this.f7098a = i4;
        this.f7100e = jy;
        this.f7101f = num;
    }

    public static Tw e(Context context, int i4) {
        if (!(i4 != 0)) {
            throw new IllegalArgumentException("Cannot create a CalendarItemStyle with a styleResId of 0");
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i4, B2.a.f147m);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(0, 0), obtainStyledAttributes.getDimensionPixelOffset(2, 0), obtainStyledAttributes.getDimensionPixelOffset(1, 0), obtainStyledAttributes.getDimensionPixelOffset(3, 0));
        ColorStateList u2 = AbstractC1654b.u(context, obtainStyledAttributes, 4);
        ColorStateList u4 = AbstractC1654b.u(context, obtainStyledAttributes, 9);
        ColorStateList u5 = AbstractC1654b.u(context, obtainStyledAttributes, 7);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        V2.k a4 = V2.k.a(context, obtainStyledAttributes.getResourceId(5, 0), obtainStyledAttributes.getResourceId(6, 0), new V2.a(0)).a();
        obtainStyledAttributes.recycle();
        return new Tw(u2, u4, u5, dimensionPixelSize, a4, rect);
    }

    public static Tw x(String str, AbstractC0886lz abstractC0886lz, int i4, Jy jy, Integer num) {
        if (jy == Jy.f5945s) {
            if (num != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        return new Tw(str, abstractC0886lz, i4, jy, num);
    }

    public void a() {
        View view = (View) this.f7099b;
        Drawable background = view.getBackground();
        if (background != null) {
            if (((l.z0) this.d) != null) {
                if (((l.z0) this.f7101f) == null) {
                    this.f7101f = new Object();
                }
                l.z0 z0Var = (l.z0) this.f7101f;
                z0Var.f13867a = null;
                z0Var.d = false;
                z0Var.f13868b = null;
                z0Var.c = false;
                WeakHashMap weakHashMap = H.A.f779a;
                ColorStateList b4 = AbstractC0044t.b(view);
                if (b4 != null) {
                    z0Var.d = true;
                    z0Var.f13867a = b4;
                }
                PorterDuff.Mode c = AbstractC0044t.c(view);
                if (c != null) {
                    z0Var.c = true;
                    z0Var.f13868b = c;
                }
                if (z0Var.d || z0Var.c) {
                    l.r.e(background, z0Var, view.getDrawableState());
                    return;
                }
            }
            l.z0 z0Var2 = (l.z0) this.f7100e;
            if (z0Var2 != null) {
                l.r.e(background, z0Var2, view.getDrawableState());
                return;
            }
            l.z0 z0Var3 = (l.z0) this.d;
            if (z0Var3 != null) {
                l.r.e(background, z0Var3, view.getDrawableState());
            }
        }
    }

    public boolean b(int i4) {
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            C0188a c0188a = (C0188a) arrayList.get(i5);
            int i6 = c0188a.f3228a;
            if (i6 != 8) {
                if (i6 == 1) {
                    int i7 = c0188a.f3229b;
                    int i8 = c0188a.d + i7;
                    while (i7 < i8) {
                        if (h(i7, i5 + 1) == i4) {
                            return true;
                        }
                        i7++;
                    }
                } else {
                    continue;
                }
            } else {
                if (h(c0188a.d, i5 + 1) == i4) {
                    return true;
                }
            }
        }
        return false;
    }

    public void c() {
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((C0169C) this.f7100e).a((C0188a) arrayList.get(i4));
        }
        s(arrayList);
        this.f7098a = 0;
    }

    public void d() {
        C0169C c0169c = (C0169C) this.f7100e;
        c();
        ArrayList arrayList = (ArrayList) this.c;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            C0188a c0188a = (C0188a) arrayList.get(i4);
            int i5 = c0188a.f3228a;
            if (i5 == 1) {
                c0169c.a(c0188a);
                c0169c.d(c0188a.f3229b, c0188a.d);
            } else if (i5 == 2) {
                c0169c.a(c0188a);
                int i6 = c0188a.f3229b;
                int i7 = c0188a.d;
                RecyclerView recyclerView = c0169c.f3174a;
                recyclerView.P(i6, i7, true);
                recyclerView.f3087w0 = true;
                recyclerView.f3081t0.c += i7;
            } else if (i5 == 4) {
                c0169c.a(c0188a);
                c0169c.c(c0188a.f3229b, c0188a.d, c0188a.c);
            } else if (i5 == 8) {
                c0169c.a(c0188a);
                c0169c.e(c0188a.f3229b, c0188a.d);
            }
        }
        s(arrayList);
        this.f7098a = 0;
    }

    public void f(C0188a c0188a) {
        int i4;
        B0.r rVar = (B0.r) this.f7099b;
        int i5 = c0188a.f3228a;
        if (i5 == 1 || i5 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int w2 = w(c0188a.f3229b, i5);
        int i6 = c0188a.f3229b;
        int i7 = c0188a.f3228a;
        if (i7 == 2) {
            i4 = 0;
        } else {
            if (i7 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + c0188a);
            }
            i4 = 1;
        }
        int i8 = 1;
        for (int i9 = 1; i9 < c0188a.d; i9++) {
            int w4 = w((i4 * i9) + c0188a.f3229b, c0188a.f3228a);
            int i10 = c0188a.f3228a;
            if (i10 == 2 ? w4 != w2 : !(i10 == 4 && w4 == w2 + 1)) {
                C0188a m4 = m(i10, w2, i8, c0188a.c);
                g(m4, i6);
                m4.c = null;
                rVar.j(m4);
                if (c0188a.f3228a == 4) {
                    i6 += i8;
                }
                i8 = 1;
                w2 = w4;
            } else {
                i8++;
            }
        }
        Object obj = c0188a.c;
        c0188a.c = null;
        rVar.j(c0188a);
        if (i8 > 0) {
            C0188a m5 = m(c0188a.f3228a, w2, i8, obj);
            g(m5, i6);
            m5.c = null;
            rVar.j(m5);
        }
    }

    public void g(C0188a c0188a, int i4) {
        C0169C c0169c = (C0169C) this.f7100e;
        c0169c.a(c0188a);
        int i5 = c0188a.f3228a;
        if (i5 != 2) {
            if (i5 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            c0169c.c(i4, c0188a.d, c0188a.c);
        } else {
            int i6 = c0188a.d;
            RecyclerView recyclerView = c0169c.f3174a;
            recyclerView.P(i4, i6, true);
            recyclerView.f3087w0 = true;
            recyclerView.f3081t0.c += i6;
        }
    }

    public int h(int i4, int i5) {
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        while (i5 < size) {
            C0188a c0188a = (C0188a) arrayList.get(i5);
            int i6 = c0188a.f3228a;
            if (i6 == 8) {
                int i7 = c0188a.f3229b;
                if (i7 == i4) {
                    i4 = c0188a.d;
                } else {
                    if (i7 < i4) {
                        i4--;
                    }
                    if (c0188a.d <= i4) {
                        i4++;
                    }
                }
            } else {
                int i8 = c0188a.f3229b;
                if (i8 > i4) {
                    continue;
                } else if (i6 == 2) {
                    int i9 = c0188a.d;
                    if (i4 < i8 + i9) {
                        return -1;
                    }
                    i4 -= i9;
                } else if (i6 == 1) {
                    i4 += c0188a.d;
                }
            }
            i5++;
        }
        return i4;
    }

    public ColorStateList i() {
        l.z0 z0Var = (l.z0) this.f7100e;
        if (z0Var != null) {
            return z0Var.f13867a;
        }
        return null;
    }

    public PorterDuff.Mode j() {
        l.z0 z0Var = (l.z0) this.f7100e;
        if (z0Var != null) {
            return z0Var.f13868b;
        }
        return null;
    }

    public boolean k() {
        return ((ArrayList) this.c).size() > 0;
    }

    public void l(AttributeSet attributeSet, int i4) {
        ColorStateList i5;
        View view = (View) this.f7099b;
        q2.e w2 = q2.e.w(view.getContext(), attributeSet, AbstractC1657a.f12657z, i4);
        TypedArray typedArray = (TypedArray) w2.f14710q;
        try {
            if (typedArray.hasValue(0)) {
                this.f7098a = typedArray.getResourceId(0, -1);
                l.r rVar = (l.r) this.c;
                Context context = view.getContext();
                int i6 = this.f7098a;
                synchronized (rVar) {
                    i5 = rVar.f13821a.i(context, i6);
                }
                if (i5 != null) {
                    t(i5);
                }
            }
            if (typedArray.hasValue(1)) {
                ColorStateList o4 = w2.o(1);
                WeakHashMap weakHashMap = H.A.f779a;
                AbstractC0044t.h(view, o4);
            }
            if (typedArray.hasValue(2)) {
                PorterDuff.Mode b4 = l.T.b(typedArray.getInt(2, -1), null);
                WeakHashMap weakHashMap2 = H.A.f779a;
                AbstractC0044t.i(view, b4);
            }
        } finally {
            w2.y();
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, b0.a] */
    public C0188a m(int i4, int i5, int i6, Object obj) {
        C0188a c0188a = (C0188a) ((B0.r) this.f7099b).h();
        if (c0188a != null) {
            c0188a.f3228a = i4;
            c0188a.f3229b = i5;
            c0188a.d = i6;
            c0188a.c = obj;
            return c0188a;
        }
        ?? obj2 = new Object();
        obj2.f3228a = i4;
        obj2.f3229b = i5;
        obj2.d = i6;
        obj2.c = obj;
        return obj2;
    }

    public void n(B0.d dVar) {
        MainActivity mainActivity = (MainActivity) this.f7099b;
        B0.b bVar = (B0.b) this.c;
        if (this.f7098a != AbstractC1806a.f14004M) {
            return;
        }
        if (dVar.f72b != 0) {
            com.google.android.gms.internal.play_billing.B.B(mainActivity);
            AbstractC1806a.f14006P = true;
            return;
        }
        B0.f fVar = new B0.f(0);
        fVar.f75p = "inapp";
        bVar.b(new B0.a(fVar), new C1951f(this));
        B0.f fVar2 = new B0.f(0);
        fVar2.f75p = "subs";
        bVar.b(new B0.a(fVar2), new C1952g(this));
        ArrayList arrayList = new ArrayList();
        arrayList.add("lcs_1.59_monthly");
        arrayList.add("lcs_2.99_new_sixmonths2");
        ArrayList arrayList2 = new ArrayList(arrayList);
        C0258Da c0258Da = new C0258Da(1, false);
        c0258Da.f4618p = "subs";
        c0258Da.f4619q = arrayList2;
        bVar.c(c0258Da, new C1951f(this));
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add("lcs_4.59_oneoff");
        arrayList3.add("lcs_10.99_oneoff_new");
        ArrayList arrayList4 = new ArrayList(arrayList3);
        C0258Da c0258Da2 = new C0258Da(1, false);
        c0258Da2.f4618p = "inapp";
        c0258Da2.f4619q = arrayList4;
        bVar.c(c0258Da2, new C1952g(this));
    }

    public void o() {
        this.f7098a = -1;
        t(null);
        a();
    }

    public void p(int i4) {
        ColorStateList colorStateList;
        this.f7098a = i4;
        l.r rVar = (l.r) this.c;
        if (rVar != null) {
            Context context = ((View) this.f7099b).getContext();
            synchronized (rVar) {
                colorStateList = rVar.f13821a.i(context, i4);
            }
        } else {
            colorStateList = null;
        }
        t(colorStateList);
        a();
    }

    public void q(C0188a c0188a) {
        C0169C c0169c = (C0169C) this.f7100e;
        ((ArrayList) this.d).add(c0188a);
        int i4 = c0188a.f3228a;
        if (i4 == 1) {
            c0169c.d(c0188a.f3229b, c0188a.d);
            return;
        }
        if (i4 == 2) {
            int i5 = c0188a.f3229b;
            int i6 = c0188a.d;
            RecyclerView recyclerView = c0169c.f3174a;
            recyclerView.P(i5, i6, false);
            recyclerView.f3087w0 = true;
            return;
        }
        if (i4 == 4) {
            c0169c.c(c0188a.f3229b, c0188a.d, c0188a.c);
        } else if (i4 == 8) {
            c0169c.e(c0188a.f3229b, c0188a.d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + c0188a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x00e3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00b1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0015 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0138 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x012b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void r() {
        /*
            Method dump skipped, instructions count: 704
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.Tw.r():void");
    }

    public void s(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            C0188a c0188a = (C0188a) arrayList.get(i4);
            c0188a.c = null;
            ((B0.r) this.f7099b).j(c0188a);
        }
        arrayList.clear();
    }

    public void t(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (((l.z0) this.d) == null) {
                this.d = new Object();
            }
            l.z0 z0Var = (l.z0) this.d;
            z0Var.f13867a = colorStateList;
            z0Var.d = true;
        } else {
            this.d = null;
        }
        a();
    }

    public void u(ColorStateList colorStateList) {
        if (((l.z0) this.f7100e) == null) {
            this.f7100e = new Object();
        }
        l.z0 z0Var = (l.z0) this.f7100e;
        z0Var.f13867a = colorStateList;
        z0Var.d = true;
        a();
    }

    public void v(PorterDuff.Mode mode) {
        if (((l.z0) this.f7100e) == null) {
            this.f7100e = new Object();
        }
        l.z0 z0Var = (l.z0) this.f7100e;
        z0Var.f13868b = mode;
        z0Var.c = true;
        a();
    }

    public int w(int i4, int i5) {
        int i6;
        int i7;
        B0.r rVar = (B0.r) this.f7099b;
        ArrayList arrayList = (ArrayList) this.d;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0188a c0188a = (C0188a) arrayList.get(size);
            int i8 = c0188a.f3228a;
            if (i8 == 8) {
                int i9 = c0188a.f3229b;
                int i10 = c0188a.d;
                if (i9 < i10) {
                    i7 = i9;
                    i6 = i10;
                } else {
                    i6 = i9;
                    i7 = i10;
                }
                if (i4 < i7 || i4 > i6) {
                    if (i4 < i9) {
                        if (i5 == 1) {
                            c0188a.f3229b = i9 + 1;
                            c0188a.d = i10 + 1;
                        } else if (i5 == 2) {
                            c0188a.f3229b = i9 - 1;
                            c0188a.d = i10 - 1;
                        }
                    }
                } else if (i7 == i9) {
                    if (i5 == 1) {
                        c0188a.d = i10 + 1;
                    } else if (i5 == 2) {
                        c0188a.d = i10 - 1;
                    }
                    i4++;
                } else {
                    if (i5 == 1) {
                        c0188a.f3229b = i9 + 1;
                    } else if (i5 == 2) {
                        c0188a.f3229b = i9 - 1;
                    }
                    i4--;
                }
            } else {
                int i11 = c0188a.f3229b;
                if (i11 <= i4) {
                    if (i8 == 1) {
                        i4 -= c0188a.d;
                    } else if (i8 == 2) {
                        i4 += c0188a.d;
                    }
                } else if (i5 == 1) {
                    c0188a.f3229b = i11 + 1;
                } else if (i5 == 2) {
                    c0188a.f3229b = i11 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            C0188a c0188a2 = (C0188a) arrayList.get(size2);
            if (c0188a2.f3228a == 8) {
                int i12 = c0188a2.d;
                if (i12 == c0188a2.f3229b || i12 < 0) {
                    arrayList.remove(size2);
                    c0188a2.c = null;
                    rVar.j(c0188a2);
                }
            } else if (c0188a2.d <= 0) {
                arrayList.remove(size2);
                c0188a2.c = null;
                rVar.j(c0188a2);
            }
        }
        return i4;
    }
}
