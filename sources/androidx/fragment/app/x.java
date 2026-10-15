package androidx.fragment.app;

import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class x implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f2940o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ I f2941p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ View f2942q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ AbstractComponentCallbacksC0157f f2943r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ArrayList f2944s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ ArrayList f2945t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ ArrayList f2946u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f2947v;

    public x(Object obj, I i4, View view, AbstractComponentCallbacksC0157f abstractComponentCallbacksC0157f, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
        this.f2940o = obj;
        this.f2941p = i4;
        this.f2942q = view;
        this.f2943r = abstractComponentCallbacksC0157f;
        this.f2944s = arrayList;
        this.f2945t = arrayList2;
        this.f2946u = arrayList3;
        this.f2947v = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        I i4 = this.f2941p;
        View view = this.f2942q;
        Object obj = this.f2940o;
        if (obj != null) {
            i4.l(obj, view);
            this.f2945t.addAll(B.f(i4, obj, this.f2943r, this.f2944s, view));
        }
        ArrayList arrayList = this.f2946u;
        if (arrayList != null) {
            Object obj2 = this.f2947v;
            if (obj2 != null) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(view);
                i4.m(obj2, arrayList, arrayList2);
            }
            arrayList.clear();
            arrayList.add(view);
        }
    }
}
