package n0;

import android.net.Uri;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f14086a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f14087b;

    public e(Uri uri, boolean z4) {
        this.f14086a = uri;
        this.f14087b = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (this.f14087b == eVar.f14087b && this.f14086a.equals(eVar.f14086a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f14086a.hashCode() * 31) + (this.f14087b ? 1 : 0);
    }
}
