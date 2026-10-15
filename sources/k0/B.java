package k0;

import android.view.ViewGroup;
import android.view.WindowId;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class B {

    /* renamed from: a, reason: collision with root package name */
    public final WindowId f13501a;

    public B(ViewGroup viewGroup) {
        this.f13501a = viewGroup.getWindowId();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof B) && ((B) obj).f13501a.equals(this.f13501a);
    }

    public final int hashCode() {
        return this.f13501a.hashCode();
    }
}
