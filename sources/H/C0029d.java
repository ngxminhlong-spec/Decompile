package H;

import android.view.DisplayCutout;
import java.util.Objects;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: H.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0029d {

    /* renamed from: a, reason: collision with root package name */
    public final DisplayCutout f820a;

    public C0029d(DisplayCutout displayCutout) {
        this.f820a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0029d.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f820a, ((C0029d) obj).f820a);
    }

    public final int hashCode() {
        int hashCode;
        hashCode = this.f820a.hashCode();
        return hashCode;
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f820a + "}";
    }
}
