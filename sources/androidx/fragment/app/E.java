package androidx.fragment.app;

import android.transition.Transition;
import java.util.ArrayList;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class E implements Transition.TransitionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f2753a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f2754b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ ArrayList d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2755e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ArrayList f2756f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ F f2757g;

    public E(F f4, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
        this.f2757g = f4;
        this.f2753a = obj;
        this.f2754b = arrayList;
        this.c = obj2;
        this.d = arrayList2;
        this.f2755e = obj3;
        this.f2756f = arrayList3;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        F f4 = this.f2757g;
        Object obj = this.f2753a;
        if (obj != null) {
            f4.m(obj, this.f2754b, null);
        }
        Object obj2 = this.c;
        if (obj2 != null) {
            f4.m(obj2, this.d, null);
        }
        Object obj3 = this.f2755e;
        if (obj3 != null) {
            f4.m(obj3, this.f2756f, null);
        }
    }
}
