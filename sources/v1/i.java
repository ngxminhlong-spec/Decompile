package v1;

import java.util.ArrayList;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class i extends o {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f15066a;

    public i(ArrayList arrayList) {
        this.f15066a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        return this.f15066a.equals(((i) ((o) obj)).f15066a);
    }

    public final int hashCode() {
        return this.f15066a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "BatchedLogRequest{logRequests=" + this.f15066a + "}";
    }
}
