package androidx.fragment.app;

import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class z implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ I f2954o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ r.e f2955p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f2956q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ A f2957r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ArrayList f2958s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ View f2959t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ AbstractComponentCallbacksC0157f f2960u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ AbstractComponentCallbacksC0157f f2961v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ boolean f2962w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ ArrayList f2963x;
    public final /* synthetic */ Object y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Rect f2964z;

    public z(I i4, r.e eVar, Object obj, A a4, ArrayList arrayList, View view, AbstractComponentCallbacksC0157f abstractComponentCallbacksC0157f, AbstractComponentCallbacksC0157f abstractComponentCallbacksC0157f2, boolean z4, ArrayList arrayList2, Object obj2, Rect rect) {
        this.f2954o = i4;
        this.f2955p = eVar;
        this.f2956q = obj;
        this.f2957r = a4;
        this.f2958s = arrayList;
        this.f2959t = view;
        this.f2960u = abstractComponentCallbacksC0157f;
        this.f2961v = abstractComponentCallbacksC0157f2;
        this.f2962w = z4;
        this.f2963x = arrayList2;
        this.y = obj2;
        this.f2964z = rect;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r.e eVar = this.f2955p;
        Object obj = this.f2956q;
        A a4 = this.f2957r;
        r.e c = B.c(eVar, obj, a4);
        ArrayList arrayList = this.f2958s;
        if (c != null) {
            arrayList.addAll(c.values());
            arrayList.add(this.f2959t);
        }
        boolean z4 = this.f2962w;
        if (z4) {
            this.f2961v.getClass();
        } else {
            this.f2960u.getClass();
        }
        if (obj != null) {
            this.f2954o.s(obj, this.f2963x, arrayList);
            View g4 = B.g(c, a4, this.y, z4);
            if (g4 != null) {
                I.i(this.f2964z, g4);
            }
        }
    }
}
