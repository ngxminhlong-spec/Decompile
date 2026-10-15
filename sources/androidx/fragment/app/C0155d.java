package androidx.fragment.app;

import android.view.View;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: androidx.fragment.app.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0155d extends o {

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ AbstractComponentCallbacksC0157f f2809p;

    public C0155d(AbstractComponentCallbacksC0157f abstractComponentCallbacksC0157f) {
        this.f2809p = abstractComponentCallbacksC0157f;
    }

    @Override // androidx.fragment.app.o
    public final View b(int i4) {
        View view = this.f2809p.f2835R;
        if (view != null) {
            return view.findViewById(i4);
        }
        throw new IllegalStateException("Fragment " + this + " does not have a view");
    }

    @Override // androidx.fragment.app.o
    public final boolean c() {
        return this.f2809p.f2835R != null;
    }
}
