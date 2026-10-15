package androidx.fragment.app;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class F extends I {
    public static boolean u(Transition transition) {
        return (I.j(transition.getTargetIds()) && I.j(transition.getTargetNames()) && I.j(transition.getTargetTypes())) ? false : true;
    }

    @Override // androidx.fragment.app.I
    public final void a(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).addTarget(view);
        }
    }

    @Override // androidx.fragment.app.I
    public final void b(Object obj, ArrayList arrayList) {
        Transition transition = (Transition) obj;
        if (transition == null) {
            return;
        }
        int i4 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i4 < transitionCount) {
                b(transitionSet.getTransitionAt(i4), arrayList);
                i4++;
            }
            return;
        }
        if (u(transition) || !I.j(transition.getTargets())) {
            return;
        }
        int size = arrayList.size();
        while (i4 < size) {
            transition.addTarget((View) arrayList.get(i4));
            i4++;
        }
    }

    @Override // androidx.fragment.app.I
    public final void c(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    @Override // androidx.fragment.app.I
    public final boolean e(Object obj) {
        return obj instanceof Transition;
    }

    @Override // androidx.fragment.app.I
    public final Object g() {
        return null;
    }

    @Override // androidx.fragment.app.I
    public final Object k(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.addTransition((Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.addTransition((Transition) obj3);
        }
        return transitionSet;
    }

    @Override // androidx.fragment.app.I
    public final void l(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).removeTarget(view);
        }
    }

    @Override // androidx.fragment.app.I
    public final void m(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        List<View> targets;
        Transition transition = (Transition) obj;
        int i4 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i4 < transitionCount) {
                m(transitionSet.getTransitionAt(i4), arrayList, arrayList2);
                i4++;
            }
            return;
        }
        if (u(transition) || (targets = transition.getTargets()) == null || targets.size() != arrayList.size() || !targets.containsAll(arrayList)) {
            return;
        }
        int size = arrayList2 == null ? 0 : arrayList2.size();
        while (i4 < size) {
            transition.addTarget((View) arrayList2.get(i4));
            i4++;
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            transition.removeTarget((View) arrayList.get(size2));
        }
    }

    @Override // androidx.fragment.app.I
    public final void n(Object obj, View view, ArrayList arrayList) {
        ((Transition) obj).addListener(new D(view, arrayList));
    }

    @Override // androidx.fragment.app.I
    public final void o(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2, Object obj4, ArrayList arrayList3) {
        ((Transition) obj).addListener(new E(this, obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // androidx.fragment.app.I
    public final void p(Object obj, Rect rect) {
        if (obj != null) {
            ((Transition) obj).setEpicenterCallback(new C(1, rect));
        }
    }

    @Override // androidx.fragment.app.I
    public final void q(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            I.i(rect, view);
            ((Transition) obj).setEpicenterCallback(new C(0, rect));
        }
    }

    @Override // androidx.fragment.app.I
    public final void r(Object obj, View view, ArrayList arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List<View> targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            I.d(targets, (View) arrayList.get(i4));
        }
        targets.add(view);
        arrayList.add(view);
        b(transitionSet, arrayList);
    }

    @Override // androidx.fragment.app.I
    public final void s(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            m(transitionSet, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.I
    public final Object t(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }
}
