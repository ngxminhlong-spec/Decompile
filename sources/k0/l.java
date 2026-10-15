package k0;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.I;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class l extends I {
    @Override // androidx.fragment.app.I
    public final void a(Object obj, View view) {
        if (obj != null) {
            ((o) obj).b(view);
        }
    }

    @Override // androidx.fragment.app.I
    public final void b(Object obj, ArrayList arrayList) {
        o oVar = (o) obj;
        if (oVar == null) {
            return;
        }
        int i4 = 0;
        if (oVar instanceof t) {
            t tVar = (t) oVar;
            int size = tVar.f13555J.size();
            while (i4 < size) {
                b((i4 < 0 || i4 >= tVar.f13555J.size()) ? null : (o) tVar.f13555J.get(i4), arrayList);
                i4++;
            }
            return;
        }
        if (I.j(oVar.f13540q) && I.j(oVar.f13541r)) {
            int size2 = arrayList.size();
            while (i4 < size2) {
                oVar.b((View) arrayList.get(i4));
                i4++;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [k0.r, android.view.ViewTreeObserver$OnPreDrawListener, java.lang.Object, android.view.View$OnAttachStateChangeListener] */
    @Override // androidx.fragment.app.I
    public final void c(ViewGroup viewGroup, Object obj) {
        o oVar = (o) obj;
        ArrayList arrayList = s.f13554b;
        if (arrayList.contains(viewGroup)) {
            return;
        }
        WeakHashMap weakHashMap = H.A.f779a;
        if (viewGroup.isLaidOut()) {
            arrayList.add(viewGroup);
            o clone = oVar.clone();
            ArrayList arrayList2 = (ArrayList) s.a().get(viewGroup);
            if (arrayList2 != null && arrayList2.size() > 0) {
                int size = arrayList2.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj2 = arrayList2.get(i4);
                    i4++;
                    ((o) obj2).u(viewGroup);
                }
            }
            if (clone != null) {
                clone.h(viewGroup, true);
            }
            if (viewGroup.getTag(R.id.transition_current_scene) != null) {
                throw new ClassCastException();
            }
            viewGroup.setTag(R.id.transition_current_scene, null);
            if (clone != null) {
                ?? obj3 = new Object();
                obj3.f13551o = clone;
                obj3.f13552p = viewGroup;
                viewGroup.addOnAttachStateChangeListener(obj3);
                viewGroup.getViewTreeObserver().addOnPreDrawListener(obj3);
            }
        }
    }

    @Override // androidx.fragment.app.I
    public final boolean e(Object obj) {
        return obj instanceof o;
    }

    @Override // androidx.fragment.app.I
    public final Object g() {
        return null;
    }

    @Override // androidx.fragment.app.I
    public final Object k(Object obj, Object obj2, Object obj3) {
        t tVar = new t();
        if (obj != null) {
            tVar.G((o) obj);
        }
        if (obj2 != null) {
            tVar.G((o) obj2);
        }
        if (obj3 != null) {
            tVar.G((o) obj3);
        }
        return tVar;
    }

    @Override // androidx.fragment.app.I
    public final void l(Object obj, View view) {
        if (obj != null) {
            ((o) obj).w(view);
        }
    }

    @Override // androidx.fragment.app.I
    public final void m(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        o oVar = (o) obj;
        int i4 = 0;
        if (oVar instanceof t) {
            t tVar = (t) oVar;
            int size = tVar.f13555J.size();
            while (i4 < size) {
                m((i4 < 0 || i4 >= tVar.f13555J.size()) ? null : (o) tVar.f13555J.get(i4), arrayList, arrayList2);
                i4++;
            }
            return;
        }
        if (I.j(oVar.f13540q)) {
            ArrayList arrayList3 = oVar.f13541r;
            if (arrayList3.size() == arrayList.size() && arrayList3.containsAll(arrayList)) {
                int size2 = arrayList2 == null ? 0 : arrayList2.size();
                while (i4 < size2) {
                    oVar.b((View) arrayList2.get(i4));
                    i4++;
                }
                for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                    oVar.w((View) arrayList.get(size3));
                }
            }
        }
    }

    @Override // androidx.fragment.app.I
    public final void n(Object obj, View view, ArrayList arrayList) {
        ((o) obj).a(new j(view, arrayList));
    }

    @Override // androidx.fragment.app.I
    public final void o(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2, Object obj4, ArrayList arrayList3) {
        ((o) obj).a(new k(this, obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [o2.f, java.lang.Object] */
    @Override // androidx.fragment.app.I
    public final void p(Object obj, Rect rect) {
        if (obj != null) {
            ((o) obj).z(new Object());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [o2.f, java.lang.Object] */
    @Override // androidx.fragment.app.I
    public final void q(Object obj, View view) {
        if (view != null) {
            I.i(new Rect(), view);
            ((o) obj).z(new Object());
        }
    }

    @Override // androidx.fragment.app.I
    public final void r(Object obj, View view, ArrayList arrayList) {
        t tVar = (t) obj;
        ArrayList arrayList2 = tVar.f13541r;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            I.d(arrayList2, (View) arrayList.get(i4));
        }
        arrayList2.add(view);
        arrayList.add(view);
        b(tVar, arrayList);
    }

    @Override // androidx.fragment.app.I
    public final void s(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        t tVar = (t) obj;
        if (tVar != null) {
            ArrayList arrayList3 = tVar.f13541r;
            arrayList3.clear();
            arrayList3.addAll(arrayList2);
            m(tVar, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.I
    public final Object t(Object obj) {
        if (obj == null) {
            return null;
        }
        t tVar = new t();
        tVar.G((o) obj);
        return tVar;
    }
}
