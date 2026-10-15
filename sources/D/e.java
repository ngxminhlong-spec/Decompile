package D;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class e implements f {

    /* renamed from: b, reason: collision with root package name */
    public static final Locale[] f525b = new Locale[0];

    /* renamed from: a, reason: collision with root package name */
    public final Locale[] f526a;

    static {
        new Locale("en", "XA");
        new Locale("ar", "XB");
        int i4 = d.f523b;
        String[] split = "en-Latn".split("-", -1);
        if (split.length > 2) {
            new Locale(split[0], split[1], split[2]);
        } else if (split.length > 1) {
            new Locale(split[0], split[1]);
        } else {
            if (split.length != 1) {
                throw new IllegalArgumentException("Can not parse language tag: [en-Latn]");
            }
            new Locale(split[0]);
        }
    }

    public e(Locale... localeArr) {
        if (localeArr.length == 0) {
            this.f526a = f525b;
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        for (int i4 = 0; i4 < localeArr.length; i4++) {
            Locale locale = localeArr[i4];
            if (locale == null) {
                throw new NullPointerException(U.a.h(i4, "list[", "] is null"));
            }
            if (!hashSet.contains(locale)) {
                Locale locale2 = (Locale) locale.clone();
                arrayList.add(locale2);
                locale2.getLanguage();
                String country = locale2.getCountry();
                if (country != null && !country.isEmpty()) {
                    locale2.getCountry();
                }
                hashSet.add(locale2);
            }
        }
        this.f526a = (Locale[]) arrayList.toArray(new Locale[0]);
    }

    @Override // D.f
    public final Object a() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        Locale[] localeArr = ((e) obj).f526a;
        Locale[] localeArr2 = this.f526a;
        if (localeArr2.length != localeArr.length) {
            return false;
        }
        for (int i4 = 0; i4 < localeArr2.length; i4++) {
            if (!localeArr2[i4].equals(localeArr[i4])) {
                return false;
            }
        }
        return true;
    }

    @Override // D.f
    public final Locale get() {
        Locale[] localeArr = this.f526a;
        if (localeArr.length > 0) {
            return localeArr[0];
        }
        return null;
    }

    public final int hashCode() {
        int i4 = 1;
        for (Locale locale : this.f526a) {
            i4 = (i4 * 31) + locale.hashCode();
        }
        return i4;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        int i4 = 0;
        while (true) {
            Locale[] localeArr = this.f526a;
            if (i4 >= localeArr.length) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(localeArr[i4]);
            if (i4 < localeArr.length - 1) {
                sb.append(',');
            }
            i4++;
        }
    }
}
