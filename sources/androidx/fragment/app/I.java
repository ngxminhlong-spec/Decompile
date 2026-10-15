package androidx.fragment.app;

import H.AbstractC0044t;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class I {
    public static void d(List list, View view) {
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (list.get(i4) == view) {
                return;
            }
        }
        list.add(view);
        for (int i5 = size; i5 < list.size(); i5++) {
            View view2 = (View) list.get(i5);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i6 = 0; i6 < childCount; i6++) {
                    View childAt = viewGroup.getChildAt(i6);
                    int i7 = 0;
                    while (true) {
                        if (i7 >= size) {
                            list.add(childAt);
                            break;
                        } else if (list.get(i7) == childAt) {
                            break;
                        } else {
                            i7++;
                        }
                    }
                }
            }
        }
    }

    public static void f(View view, ArrayList arrayList) {
        if (view.getVisibility() == 0) {
            if (!(view instanceof ViewGroup)) {
                arrayList.add(view);
                return;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            int i4 = H.C.f782a;
            if (viewGroup.isTransitionGroup()) {
                arrayList.add(viewGroup);
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                f(viewGroup.getChildAt(i5), arrayList);
            }
        }
    }

    public static void h(r.e eVar, View view) {
        if (view.getVisibility() == 0) {
            WeakHashMap weakHashMap = H.A.f779a;
            String e4 = AbstractC0044t.e(view);
            if (e4 != null) {
                eVar.put(e4, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i4 = 0; i4 < childCount; i4++) {
                    h(eVar, viewGroup.getChildAt(i4));
                }
            }
        }
    }

    public static void i(Rect rect, View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i4 = iArr[0];
        rect.set(i4, iArr[1], view.getWidth() + i4, view.getHeight() + iArr[1]);
    }

    public static boolean j(List list) {
        return list == null || list.isEmpty();
    }

    public abstract void a(Object obj, View view);

    public abstract void b(Object obj, ArrayList arrayList);

    public abstract void c(ViewGroup viewGroup, Object obj);

    public abstract boolean e(Object obj);

    public abstract Object g();

    public abstract Object k(Object obj, Object obj2, Object obj3);

    public abstract void l(Object obj, View view);

    public abstract void m(Object obj, ArrayList arrayList, ArrayList arrayList2);

    public abstract void n(Object obj, View view, ArrayList arrayList);

    public abstract void o(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2, Object obj4, ArrayList arrayList3);

    public abstract void p(Object obj, Rect rect);

    public abstract void q(Object obj, View view);

    public abstract void r(Object obj, View view, ArrayList arrayList);

    public abstract void s(Object obj, ArrayList arrayList, ArrayList arrayList2);

    public abstract Object t(Object obj);
}
