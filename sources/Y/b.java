package Y;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final List f2138a;

    public b(List list) {
        S3.e.e(list, "topics");
        this.f2138a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        List list = this.f2138a;
        int size = list.size();
        List list2 = ((b) obj).f2138a;
        if (size != list2.size()) {
            return false;
        }
        return new HashSet(list).equals(new HashSet(list2));
    }

    public final int hashCode() {
        return Objects.hash(this.f2138a);
    }

    public final String toString() {
        return "Topics=" + this.f2138a;
    }
}
