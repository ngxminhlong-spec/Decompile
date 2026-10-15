package b0;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: b0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0189b implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f3230o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ ArrayList f3231p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C0195h f3232q;

    public /* synthetic */ RunnableC0189b(C0195h c0195h, ArrayList arrayList, int i4) {
        this.f3230o = i4;
        this.f3232q = c0195h;
        this.f3231p = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3230o) {
            case 0:
                ArrayList arrayList = this.f3231p;
                int size = arrayList.size();
                int i4 = 0;
                while (true) {
                    C0195h c0195h = this.f3232q;
                    if (i4 >= size) {
                        arrayList.clear();
                        c0195h.f3286m.remove(arrayList);
                        return;
                    }
                    Object obj = arrayList.get(i4);
                    i4++;
                    C0194g c0194g = (C0194g) obj;
                    c0 c0Var = c0194g.f3275a;
                    int i5 = c0194g.f3276b;
                    int i6 = c0194g.c;
                    int i7 = c0194g.d;
                    int i8 = c0194g.f3277e;
                    c0195h.getClass();
                    View view = c0Var.f3244a;
                    int i9 = i7 - i5;
                    int i10 = i8 - i6;
                    if (i9 != 0) {
                        view.animate().translationX(0.0f);
                    }
                    if (i10 != 0) {
                        view.animate().translationY(0.0f);
                    }
                    ViewPropertyAnimator animate = view.animate();
                    c0195h.f3289p.add(c0Var);
                    animate.setDuration(c0195h.f3180e).setListener(new C0191d(c0195h, c0Var, i9, view, i10, animate)).start();
                }
            case 1:
                ArrayList arrayList2 = this.f3231p;
                int size2 = arrayList2.size();
                int i11 = 0;
                while (true) {
                    C0195h c0195h2 = this.f3232q;
                    if (i11 >= size2) {
                        arrayList2.clear();
                        c0195h2.f3287n.remove(arrayList2);
                        return;
                    }
                    Object obj2 = arrayList2.get(i11);
                    i11++;
                    C0193f c0193f = (C0193f) obj2;
                    ArrayList arrayList3 = c0195h2.f3291r;
                    long j4 = c0195h2.f3181f;
                    c0 c0Var2 = c0193f.f3269a;
                    View view2 = c0Var2 == null ? null : c0Var2.f3244a;
                    c0 c0Var3 = c0193f.f3270b;
                    View view3 = c0Var3 != null ? c0Var3.f3244a : null;
                    if (view2 != null) {
                        ViewPropertyAnimator duration = view2.animate().setDuration(j4);
                        arrayList3.add(c0193f.f3269a);
                        duration.translationX(c0193f.f3271e - c0193f.c);
                        duration.translationY(c0193f.f3272f - c0193f.d);
                        duration.alpha(0.0f).setListener(new C0192e(c0195h2, c0193f, duration, view2, 0)).start();
                    }
                    if (view3 != null) {
                        ViewPropertyAnimator animate2 = view3.animate();
                        arrayList3.add(c0193f.f3270b);
                        animate2.translationX(0.0f).translationY(0.0f).setDuration(j4).alpha(1.0f).setListener(new C0192e(c0195h2, c0193f, animate2, view3, 1)).start();
                    }
                }
            default:
                ArrayList arrayList4 = this.f3231p;
                int size3 = arrayList4.size();
                int i12 = 0;
                while (true) {
                    C0195h c0195h3 = this.f3232q;
                    if (i12 >= size3) {
                        arrayList4.clear();
                        c0195h3.f3285l.remove(arrayList4);
                        return;
                    }
                    Object obj3 = arrayList4.get(i12);
                    i12++;
                    c0 c0Var4 = (c0) obj3;
                    c0195h3.getClass();
                    View view4 = c0Var4.f3244a;
                    ViewPropertyAnimator animate3 = view4.animate();
                    c0195h3.f3288o.add(c0Var4);
                    animate3.alpha(1.0f).setDuration(c0195h3.c).setListener(new C0190c(c0195h3, c0Var4, view4, animate3, 1)).start();
                }
        }
    }
}
