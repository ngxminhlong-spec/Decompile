package D;

import android.os.Build;
import java.util.Locale;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f523b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final f f524a;

    static {
        Locale[] localeArr = new Locale[0];
        if (Build.VERSION.SDK_INT >= 24) {
            g.g(b.c(localeArr));
        } else {
            new e(localeArr);
        }
    }

    public d(f fVar) {
        this.f524a = fVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return this.f524a.equals(((d) obj).f524a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f524a.hashCode();
    }

    public final String toString() {
        return this.f524a.toString();
    }
}
