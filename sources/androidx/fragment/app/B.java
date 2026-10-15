package androidx.fragment.app;

import H.AbstractC0044t;
import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class B {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f2747a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10};

    /* renamed from: b, reason: collision with root package name */
    public static final F f2748b = new Object();
    public static final I c;

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, androidx.fragment.app.F] */
    static {
        I i4 = null;
        try {
            i4 = (I) k0.l.class.getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        c = i4;
    }

    public static void a(ArrayList arrayList, r.e eVar, Collection collection) {
        for (int i4 = eVar.f14741q - 1; i4 >= 0; i4--) {
            View view = (View) eVar.i(i4);
            WeakHashMap weakHashMap = H.A.f779a;
            if (collection.contains(AbstractC0044t.e(view))) {
                arrayList.add(view);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0093, code lost:
    
        if (r1.f2830L == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x003b, code lost:
    
        if (r1.f2858x != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x003d, code lost:
    
        r12 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0056, code lost:
    
        r12 = true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ee A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r9v0, types: [androidx.fragment.app.A] */
    /* JADX WARN: Type inference failed for: r9v2, types: [androidx.fragment.app.A] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(androidx.fragment.app.C0152a r11, androidx.fragment.app.w r12, android.util.SparseArray r13, boolean r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.B.b(androidx.fragment.app.a, androidx.fragment.app.w, android.util.SparseArray, boolean, boolean):void");
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [r.e, r.i] */
    public static r.e c(r.e eVar, Object obj, A a4) {
        View view = a4.f2743a.f2835R;
        if (eVar.isEmpty() || obj == null || view == null) {
            eVar.clear();
            return null;
        }
        ?? iVar = new r.i(0);
        I.h(iVar, view);
        C0152a c0152a = a4.c;
        ArrayList arrayList = a4.f2744b ? c0152a.f2780o : c0152a.f2781p;
        if (arrayList != null) {
            iVar.l(arrayList);
            iVar.l(eVar.values());
        }
        for (int i4 = eVar.f14741q - 1; i4 >= 0; i4--) {
            if (!iVar.containsKey((String) eVar.i(i4))) {
                eVar.g(i4);
            }
        }
        return iVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [r.e, r.i] */
    public static r.e d(r.e eVar, Object obj, A a4) {
        if (eVar.isEmpty() || obj == null) {
            eVar.clear();
            return null;
        }
        AbstractComponentCallbacksC0157f abstractComponentCallbacksC0157f = a4.d;
        ?? iVar = new r.i(0);
        I.h(iVar, abstractComponentCallbacksC0157f.E());
        C0152a c0152a = a4.f2746f;
        iVar.l(a4.f2745e ? c0152a.f2781p : c0152a.f2780o);
        eVar.l(iVar.keySet());
        return iVar;
    }

    public static I e(AbstractComponentCallbacksC0157f abstractComponentCallbacksC0157f, AbstractComponentCallbacksC0157f abstractComponentCallbacksC0157f2) {
        ArrayList arrayList = new ArrayList();
        if (arrayList.isEmpty()) {
            return null;
        }
        int size = arrayList.size();
        int i4 = 0;
        while (true) {
            F f4 = f2748b;
            if (i4 >= size) {
                return f4;
            }
            if (!f4.e(arrayList.get(i4))) {
                I i5 = c;
                if (i5 != null) {
                    int size2 = arrayList.size();
                    for (int i6 = 0; i6 < size2; i6++) {
                        if (i5.e(arrayList.get(i6))) {
                        }
                    }
                    return i5;
                }
                throw new IllegalArgumentException("Invalid Transition types");
            }
            i4++;
        }
    }

    public static ArrayList f(I i4, Object obj, AbstractComponentCallbacksC0157f abstractComponentCallbacksC0157f, ArrayList arrayList, View view) {
        if (obj == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        View view2 = abstractComponentCallbacksC0157f.f2835R;
        if (view2 != null) {
            I.f(view2, arrayList2);
        }
        arrayList2.removeAll(arrayList);
        if (!arrayList2.isEmpty()) {
            arrayList2.add(view);
            i4.b(obj, arrayList2);
        }
        return arrayList2;
    }

    public static View g(r.e eVar, A a4, Object obj, boolean z4) {
        ArrayList arrayList;
        C0152a c0152a = a4.c;
        if (obj == null || eVar == null || (arrayList = c0152a.f2780o) == null || arrayList.isEmpty()) {
            return null;
        }
        return (View) eVar.get(z4 ? (String) c0152a.f2780o.get(0) : (String) c0152a.f2781p.get(0));
    }

    public static void h(I i4, Object obj, Object obj2, r.e eVar, boolean z4, C0152a c0152a) {
        ArrayList arrayList = c0152a.f2780o;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        View view = (View) eVar.get(z4 ? (String) c0152a.f2781p.get(0) : (String) c0152a.f2780o.get(0));
        i4.q(obj, view);
        if (obj2 != null) {
            i4.q(obj2, view);
        }
    }

    public static void i(int i4, ArrayList arrayList) {
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((View) arrayList.get(size)).setVisibility(i4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0243 A[LOOP:6: B:100:0x0241->B:101:0x0243, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0289  */
    /* JADX WARN: Type inference failed for: r11v0, types: [r.e, r.i] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void j(androidx.fragment.app.s r34, java.util.ArrayList r35, java.util.ArrayList r36, int r37, int r38, boolean r39) {
        /*
            Method dump skipped, instructions count: 1065
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.B.j(androidx.fragment.app.s, java.util.ArrayList, java.util.ArrayList, int, int, boolean):void");
    }
}
