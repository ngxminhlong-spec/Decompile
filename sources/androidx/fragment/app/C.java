package androidx.fragment.app;

import android.graphics.Rect;
import android.transition.Transition;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class C extends Transition.EpicenterCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2749a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Rect f2750b;

    public /* synthetic */ C(int i4, Rect rect) {
        this.f2749a = i4;
        this.f2750b = rect;
    }

    @Override // android.transition.Transition.EpicenterCallback
    public final Rect onGetEpicenter(Transition transition) {
        switch (this.f2749a) {
            case 0:
                return this.f2750b;
            default:
                Rect rect = this.f2750b;
                if (rect == null || rect.isEmpty()) {
                    return null;
                }
                return rect;
        }
    }
}
