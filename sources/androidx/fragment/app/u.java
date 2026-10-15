package androidx.fragment.app;

import android.view.animation.DecelerateInterpolator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class u extends androidx.lifecycle.s {

    /* renamed from: h, reason: collision with root package name */
    public static final V2.e f2917h = new V2.e(17);

    /* renamed from: f, reason: collision with root package name */
    public final boolean f2919f;
    public final HashSet c = new HashSet();
    public final HashMap d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f2918e = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    public boolean f2920g = false;

    public u(boolean z4) {
        this.f2919f = z4;
    }

    @Override // androidx.lifecycle.s
    public final void a() {
        DecelerateInterpolator decelerateInterpolator = s.f2883T;
        this.f2920g = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && u.class == obj.getClass()) {
            u uVar = (u) obj;
            if (this.c.equals(uVar.c) && this.d.equals(uVar.d) && this.f2918e.equals(uVar.f2918e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f2918e.hashCode() + ((this.d.hashCode() + (this.c.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.d.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.f2918e.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
