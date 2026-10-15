package E;

import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public String f678a;

    /* renamed from: b, reason: collision with root package name */
    public String f679b;
    public List c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Objects.equals(this.f678a, cVar.f678a) && Objects.equals(this.f679b, cVar.f679b) && Objects.equals(this.c, cVar.c);
    }

    public final int hashCode() {
        return Objects.hash(this.f678a, this.f679b, this.c);
    }
}
