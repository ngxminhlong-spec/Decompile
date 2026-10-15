package b0;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: b0.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0168B implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f3172o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f3173p;

    public /* synthetic */ RunnableC0168B(RecyclerView recyclerView, int i4) {
        this.f3172o = i4;
        this.f3173p = recyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z4;
        int i4 = this.f3172o;
        RecyclerView recyclerView = this.f3173p;
        switch (i4) {
            case 0:
                if (!recyclerView.f3037G || recyclerView.isLayoutRequested()) {
                    return;
                }
                if (!recyclerView.f3033E) {
                    recyclerView.requestLayout();
                    return;
                } else if (recyclerView.f3043J) {
                    recyclerView.f3041I = true;
                    return;
                } else {
                    recyclerView.m();
                    return;
                }
            default:
                AbstractC0175I abstractC0175I = recyclerView.f3057b0;
                if (abstractC0175I != null) {
                    C0195h c0195h = (C0195h) abstractC0175I;
                    long j4 = c0195h.d;
                    ArrayList arrayList = c0195h.f3281h;
                    boolean isEmpty = arrayList.isEmpty();
                    ArrayList arrayList2 = c0195h.f3283j;
                    boolean isEmpty2 = arrayList2.isEmpty();
                    ArrayList arrayList3 = c0195h.f3284k;
                    boolean isEmpty3 = arrayList3.isEmpty();
                    ArrayList arrayList4 = c0195h.f3282i;
                    boolean isEmpty4 = arrayList4.isEmpty();
                    if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
                        int size = arrayList.size();
                        int i5 = 0;
                        while (i5 < size) {
                            Object obj = arrayList.get(i5);
                            int i6 = i5 + 1;
                            c0 c0Var = (c0) obj;
                            View view = c0Var.f3244a;
                            ViewPropertyAnimator animate = view.animate();
                            c0195h.f3290q.add(c0Var);
                            animate.setDuration(j4).alpha(0.0f).setListener(new C0190c(c0195h, c0Var, animate, view)).start();
                            i5 = i6;
                            arrayList = arrayList;
                            isEmpty = isEmpty;
                        }
                        boolean z5 = isEmpty;
                        arrayList.clear();
                        if (!isEmpty2) {
                            ArrayList arrayList5 = new ArrayList();
                            arrayList5.addAll(arrayList2);
                            c0195h.f3286m.add(arrayList5);
                            arrayList2.clear();
                            RunnableC0189b runnableC0189b = new RunnableC0189b(c0195h, arrayList5, 0);
                            if (z5) {
                                runnableC0189b.run();
                            } else {
                                View view2 = ((C0194g) arrayList5.get(0)).f3275a.f3244a;
                                WeakHashMap weakHashMap = H.A.f779a;
                                view2.postOnAnimationDelayed(runnableC0189b, j4);
                            }
                        }
                        if (!isEmpty3) {
                            ArrayList arrayList6 = new ArrayList();
                            arrayList6.addAll(arrayList3);
                            c0195h.f3287n.add(arrayList6);
                            arrayList3.clear();
                            RunnableC0189b runnableC0189b2 = new RunnableC0189b(c0195h, arrayList6, 1);
                            if (z5) {
                                runnableC0189b2.run();
                            } else {
                                View view3 = ((C0193f) arrayList6.get(0)).f3269a.f3244a;
                                WeakHashMap weakHashMap2 = H.A.f779a;
                                view3.postOnAnimationDelayed(runnableC0189b2, j4);
                            }
                        }
                        if (!isEmpty4) {
                            ArrayList arrayList7 = new ArrayList();
                            arrayList7.addAll(arrayList4);
                            c0195h.f3285l.add(arrayList7);
                            arrayList4.clear();
                            RunnableC0189b runnableC0189b3 = new RunnableC0189b(c0195h, arrayList7, 2);
                            if (!z5 || !isEmpty2 || !isEmpty3) {
                                if (z5) {
                                    j4 = 0;
                                }
                                long max = Math.max(!isEmpty2 ? c0195h.f3180e : 0L, isEmpty3 ? 0L : c0195h.f3181f) + j4;
                                z4 = false;
                                View view4 = ((c0) arrayList7.get(0)).f3244a;
                                WeakHashMap weakHashMap3 = H.A.f779a;
                                view4.postOnAnimationDelayed(runnableC0189b3, max);
                                recyclerView.f3092z0 = z4;
                                return;
                            }
                            runnableC0189b3.run();
                        }
                    }
                }
                z4 = false;
                recyclerView.f3092z0 = z4;
                return;
        }
    }
}
