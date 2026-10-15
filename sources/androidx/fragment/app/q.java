package androidx.fragment.app;

import java.util.ArrayList;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class q implements p {

    /* renamed from: a, reason: collision with root package name */
    public final int f2881a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f2882b;

    public q(s sVar, int i4) {
        this.f2882b = sVar;
        this.f2881a = i4;
    }

    @Override // androidx.fragment.app.p
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        s sVar = this.f2882b;
        AbstractComponentCallbacksC0157f abstractComponentCallbacksC0157f = sVar.f2891G;
        int i4 = this.f2881a;
        if (abstractComponentCallbacksC0157f == null || i4 >= 0 || !abstractComponentCallbacksC0157f.k().a0()) {
            return sVar.b0(arrayList, arrayList2, i4, 1);
        }
        return false;
    }
}
