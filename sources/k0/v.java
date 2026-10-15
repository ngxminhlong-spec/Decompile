package k0;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class v {

    /* renamed from: b, reason: collision with root package name */
    public final View f13562b;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f13561a = new HashMap();
    public final ArrayList c = new ArrayList();

    public v(View view) {
        this.f13562b = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.f13562b == vVar.f13562b && this.f13561a.equals(vVar.f13561a);
    }

    public final int hashCode() {
        return this.f13561a.hashCode() + (this.f13562b.hashCode() * 31);
    }

    public final String toString() {
        String h4 = n0.a.h(("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f13562b + "\n", "    values:");
        HashMap hashMap = this.f13561a;
        for (String str : hashMap.keySet()) {
            h4 = h4 + "    " + str + ": " + hashMap.get(str) + "\n";
        }
        return h4;
    }
}
