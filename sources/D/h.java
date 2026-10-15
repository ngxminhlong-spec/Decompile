package D;

import android.os.LocaleList;
import java.util.Locale;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class h implements f {

    /* renamed from: a, reason: collision with root package name */
    public final LocaleList f527a;

    public h(Object obj) {
        this.f527a = g.g(obj);
    }

    @Override // D.f
    public final Object a() {
        return this.f527a;
    }

    public final boolean equals(Object obj) {
        boolean equals;
        equals = this.f527a.equals(((f) obj).a());
        return equals;
    }

    @Override // D.f
    public final Locale get() {
        Locale locale;
        locale = this.f527a.get(0);
        return locale;
    }

    public final int hashCode() {
        int hashCode;
        hashCode = this.f527a.hashCode();
        return hashCode;
    }

    public final String toString() {
        String localeList;
        localeList = this.f527a.toString();
        return localeList;
    }
}
