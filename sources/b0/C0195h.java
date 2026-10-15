package b0;

import H.C0034i;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: b0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0195h extends AbstractC0175I {

    /* renamed from: s, reason: collision with root package name */
    public static TimeInterpolator f3279s;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3280g;

    /* renamed from: h, reason: collision with root package name */
    public ArrayList f3281h;

    /* renamed from: i, reason: collision with root package name */
    public ArrayList f3282i;

    /* renamed from: j, reason: collision with root package name */
    public ArrayList f3283j;

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f3284k;

    /* renamed from: l, reason: collision with root package name */
    public ArrayList f3285l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f3286m;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList f3287n;

    /* renamed from: o, reason: collision with root package name */
    public ArrayList f3288o;

    /* renamed from: p, reason: collision with root package name */
    public ArrayList f3289p;

    /* renamed from: q, reason: collision with root package name */
    public ArrayList f3290q;

    /* renamed from: r, reason: collision with root package name */
    public ArrayList f3291r;

    public static void h(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((c0) arrayList.get(size)).f3244a.animate().cancel();
        }
    }

    /* JADX WARN: Type inference failed for: r12v8, types: [java.lang.Object, b0.f] */
    @Override // b0.AbstractC0175I
    public final boolean a(c0 c0Var, c0 c0Var2, C0034i c0034i, C0034i c0034i2) {
        int i4;
        int i5;
        int i6 = c0034i.f824a;
        int i7 = c0034i.f825b;
        if (c0Var2.p()) {
            int i8 = c0034i.f824a;
            i5 = c0034i.f825b;
            i4 = i8;
        } else {
            i4 = c0034i2.f824a;
            i5 = c0034i2.f825b;
        }
        if (c0Var == c0Var2) {
            return g(c0Var, i6, i7, i4, i5);
        }
        View view = c0Var.f3244a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        l(c0Var);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        View view2 = c0Var2.f3244a;
        l(c0Var2);
        view2.setTranslationX(-((int) ((i4 - i6) - translationX)));
        view2.setTranslationY(-((int) ((i5 - i7) - translationY)));
        view2.setAlpha(0.0f);
        ArrayList arrayList = this.f3284k;
        ?? obj = new Object();
        obj.f3269a = c0Var;
        obj.f3270b = c0Var2;
        obj.c = i6;
        obj.d = i7;
        obj.f3271e = i4;
        obj.f3272f = i5;
        arrayList.add(obj);
        return true;
    }

    @Override // b0.AbstractC0175I
    public final void d(c0 c0Var) {
        ArrayList arrayList = this.f3285l;
        ArrayList arrayList2 = this.f3286m;
        ArrayList arrayList3 = this.f3287n;
        View view = c0Var.f3244a;
        view.animate().cancel();
        ArrayList arrayList4 = this.f3283j;
        int size = arrayList4.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((C0194g) arrayList4.get(size)).f3275a == c0Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                c(c0Var);
                arrayList4.remove(size);
            }
        }
        j(this.f3284k, c0Var);
        if (this.f3281h.remove(c0Var)) {
            view.setAlpha(1.0f);
            c(c0Var);
        }
        if (this.f3282i.remove(c0Var)) {
            view.setAlpha(1.0f);
            c(c0Var);
        }
        for (int size2 = arrayList3.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList5 = (ArrayList) arrayList3.get(size2);
            j(arrayList5, c0Var);
            if (arrayList5.isEmpty()) {
                arrayList3.remove(size2);
            }
        }
        for (int size3 = arrayList2.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList6 = (ArrayList) arrayList2.get(size3);
            int size4 = arrayList6.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (((C0194g) arrayList6.get(size4)).f3275a == c0Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    c(c0Var);
                    arrayList6.remove(size4);
                    if (arrayList6.isEmpty()) {
                        arrayList2.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = arrayList.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList.get(size5);
            if (arrayList7.remove(c0Var)) {
                view.setAlpha(1.0f);
                c(c0Var);
                if (arrayList7.isEmpty()) {
                    arrayList.remove(size5);
                }
            }
        }
        this.f3290q.remove(c0Var);
        this.f3288o.remove(c0Var);
        this.f3291r.remove(c0Var);
        this.f3289p.remove(c0Var);
        i();
    }

    @Override // b0.AbstractC0175I
    public final void e() {
        ArrayList arrayList = this.f3287n;
        ArrayList arrayList2 = this.f3285l;
        ArrayList arrayList3 = this.f3286m;
        ArrayList arrayList4 = this.f3284k;
        ArrayList arrayList5 = this.f3282i;
        ArrayList arrayList6 = this.f3281h;
        ArrayList arrayList7 = this.f3283j;
        int size = arrayList7.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C0194g c0194g = (C0194g) arrayList7.get(size);
            View view = c0194g.f3275a.f3244a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            c(c0194g.f3275a);
            arrayList7.remove(size);
        }
        for (int size2 = arrayList6.size() - 1; size2 >= 0; size2--) {
            c((c0) arrayList6.get(size2));
            arrayList6.remove(size2);
        }
        int size3 = arrayList5.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            c0 c0Var = (c0) arrayList5.get(size3);
            c0Var.f3244a.setAlpha(1.0f);
            c(c0Var);
            arrayList5.remove(size3);
        }
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            C0193f c0193f = (C0193f) arrayList4.get(size4);
            c0 c0Var2 = c0193f.f3269a;
            if (c0Var2 != null) {
                k(c0193f, c0Var2);
            }
            c0 c0Var3 = c0193f.f3270b;
            if (c0Var3 != null) {
                k(c0193f, c0Var3);
            }
        }
        arrayList4.clear();
        if (f()) {
            for (int size5 = arrayList3.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList8 = (ArrayList) arrayList3.get(size5);
                for (int size6 = arrayList8.size() - 1; size6 >= 0; size6--) {
                    C0194g c0194g2 = (C0194g) arrayList8.get(size6);
                    View view2 = c0194g2.f3275a.f3244a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    c(c0194g2.f3275a);
                    arrayList8.remove(size6);
                    if (arrayList8.isEmpty()) {
                        arrayList3.remove(arrayList8);
                    }
                }
            }
            for (int size7 = arrayList2.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList9 = (ArrayList) arrayList2.get(size7);
                for (int size8 = arrayList9.size() - 1; size8 >= 0; size8--) {
                    c0 c0Var4 = (c0) arrayList9.get(size8);
                    c0Var4.f3244a.setAlpha(1.0f);
                    c(c0Var4);
                    arrayList9.remove(size8);
                    if (arrayList9.isEmpty()) {
                        arrayList2.remove(arrayList9);
                    }
                }
            }
            for (int size9 = arrayList.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    C0193f c0193f2 = (C0193f) arrayList10.get(size10);
                    c0 c0Var5 = c0193f2.f3269a;
                    if (c0Var5 != null) {
                        k(c0193f2, c0Var5);
                    }
                    c0 c0Var6 = c0193f2.f3270b;
                    if (c0Var6 != null) {
                        k(c0193f2, c0Var6);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList.remove(arrayList10);
                    }
                }
            }
            h(this.f3290q);
            h(this.f3289p);
            h(this.f3288o);
            h(this.f3291r);
            ArrayList arrayList11 = this.f3179b;
            if (arrayList11.size() > 0) {
                arrayList11.get(0).getClass();
                throw new ClassCastException();
            }
            arrayList11.clear();
        }
    }

    @Override // b0.AbstractC0175I
    public final boolean f() {
        return (this.f3282i.isEmpty() && this.f3284k.isEmpty() && this.f3283j.isEmpty() && this.f3281h.isEmpty() && this.f3289p.isEmpty() && this.f3290q.isEmpty() && this.f3288o.isEmpty() && this.f3291r.isEmpty() && this.f3286m.isEmpty() && this.f3285l.isEmpty() && this.f3287n.isEmpty()) ? false : true;
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, b0.g] */
    public final boolean g(c0 c0Var, int i4, int i5, int i6, int i7) {
        View view = c0Var.f3244a;
        int translationX = i4 + ((int) view.getTranslationX());
        int translationY = i5 + ((int) c0Var.f3244a.getTranslationY());
        l(c0Var);
        int i8 = i6 - translationX;
        int i9 = i7 - translationY;
        if (i8 == 0 && i9 == 0) {
            c(c0Var);
            return false;
        }
        if (i8 != 0) {
            view.setTranslationX(-i8);
        }
        if (i9 != 0) {
            view.setTranslationY(-i9);
        }
        ArrayList arrayList = this.f3283j;
        ?? obj = new Object();
        obj.f3275a = c0Var;
        obj.f3276b = translationX;
        obj.c = translationY;
        obj.d = i6;
        obj.f3277e = i7;
        arrayList.add(obj);
        return true;
    }

    public final void i() {
        if (f()) {
            return;
        }
        ArrayList arrayList = this.f3179b;
        if (arrayList.size() <= 0) {
            arrayList.clear();
        } else {
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }

    public final void j(ArrayList arrayList, c0 c0Var) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0193f c0193f = (C0193f) arrayList.get(size);
            if (k(c0193f, c0Var) && c0193f.f3269a == null && c0193f.f3270b == null) {
                arrayList.remove(c0193f);
            }
        }
    }

    public final boolean k(C0193f c0193f, c0 c0Var) {
        if (c0193f.f3270b == c0Var) {
            c0193f.f3270b = null;
        } else {
            if (c0193f.f3269a != c0Var) {
                return false;
            }
            c0193f.f3269a = null;
        }
        View view = c0Var.f3244a;
        View view2 = c0Var.f3244a;
        view.setAlpha(1.0f);
        view2.setTranslationX(0.0f);
        view2.setTranslationY(0.0f);
        c(c0Var);
        return true;
    }

    public final void l(c0 c0Var) {
        if (f3279s == null) {
            f3279s = new ValueAnimator().getInterpolator();
        }
        c0Var.f3244a.animate().setInterpolator(f3279s);
        d(c0Var);
    }
}
