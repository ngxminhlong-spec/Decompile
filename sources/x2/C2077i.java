package x2;

import android.os.Bundle;
import java.util.EnumMap;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: x2.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2077i {

    /* renamed from: b, reason: collision with root package name */
    public static final C2077i f15674b = new C2077i(null, null);

    /* renamed from: a, reason: collision with root package name */
    public final EnumMap f15675a;

    public C2077i(Boolean bool, Boolean bool2) {
        EnumMap enumMap = new EnumMap(EnumC2075h.class);
        this.f15675a = enumMap;
        enumMap.put((EnumMap) EnumC2075h.f15668p, (EnumC2075h) bool);
        enumMap.put((EnumMap) EnumC2075h.f15669q, (EnumC2075h) bool2);
    }

    public C2077i(EnumMap enumMap) {
        EnumMap enumMap2 = new EnumMap(EnumC2075h.class);
        this.f15675a = enumMap2;
        enumMap2.putAll(enumMap);
    }

    public static C2077i a(Bundle bundle) {
        if (bundle == null) {
            return f15674b;
        }
        EnumMap enumMap = new EnumMap(EnumC2075h.class);
        for (EnumC2075h enumC2075h : EnumC2075h.values()) {
            String string = bundle.getString(enumC2075h.f15672o);
            Boolean bool = null;
            if (string != null) {
                if (string.equals("granted")) {
                    bool = Boolean.TRUE;
                } else if (string.equals("denied")) {
                    bool = Boolean.FALSE;
                }
            }
            enumMap.put((EnumMap) enumC2075h, (EnumC2075h) bool);
        }
        return new C2077i(enumMap);
    }

    public static C2077i b(String str) {
        EnumMap enumMap = new EnumMap(EnumC2075h.class);
        if (str != null) {
            for (int i4 = 0; i4 < 2; i4++) {
                EnumC2075h enumC2075h = EnumC2075h.f15670r[i4];
                int i5 = i4 + 2;
                if (i5 < str.length()) {
                    char charAt = str.charAt(i5);
                    Boolean bool = null;
                    if (charAt != '-') {
                        if (charAt == '0') {
                            bool = Boolean.FALSE;
                        } else if (charAt == '1') {
                            bool = Boolean.TRUE;
                        }
                    }
                    enumMap.put((EnumMap) enumC2075h, (EnumC2075h) bool);
                }
            }
        }
        return new C2077i(enumMap);
    }

    public final C2077i c(C2077i c2077i) {
        EnumMap enumMap = new EnumMap(EnumC2075h.class);
        for (EnumC2075h enumC2075h : EnumC2075h.values()) {
            Boolean bool = (Boolean) this.f15675a.get(enumC2075h);
            Boolean bool2 = (Boolean) c2077i.f15675a.get(enumC2075h);
            if (bool == null) {
                bool = bool2;
            } else if (bool2 != null) {
                bool = Boolean.valueOf(bool.booleanValue() && bool2.booleanValue());
            }
            enumMap.put((EnumMap) enumC2075h, (EnumC2075h) bool);
        }
        return new C2077i(enumMap);
    }

    public final C2077i d(C2077i c2077i) {
        EnumMap enumMap = new EnumMap(EnumC2075h.class);
        for (EnumC2075h enumC2075h : EnumC2075h.values()) {
            Boolean bool = (Boolean) this.f15675a.get(enumC2075h);
            if (bool == null) {
                bool = (Boolean) c2077i.f15675a.get(enumC2075h);
            }
            enumMap.put((EnumMap) enumC2075h, (EnumC2075h) bool);
        }
        return new C2077i(enumMap);
    }

    public final String e() {
        StringBuilder sb = new StringBuilder("G1");
        for (int i4 = 0; i4 < 2; i4++) {
            Boolean bool = (Boolean) this.f15675a.get(EnumC2075h.f15670r[i4]);
            sb.append(bool == null ? '-' : bool.booleanValue() ? '1' : '0');
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2077i) {
            C2077i c2077i = (C2077i) obj;
            EnumC2075h[] values = EnumC2075h.values();
            int length = values.length;
            int i4 = 0;
            while (true) {
                boolean z4 = true;
                if (i4 >= length) {
                    return true;
                }
                EnumC2075h enumC2075h = values[i4];
                Boolean bool = (Boolean) this.f15675a.get(enumC2075h);
                boolean z5 = bool == null ? false : bool.booleanValue() ? true : 2;
                Boolean bool2 = (Boolean) c2077i.f15675a.get(enumC2075h);
                if (bool2 == null) {
                    z4 = false;
                } else if (!bool2.booleanValue()) {
                    z4 = 2;
                }
                if (z5 != z4) {
                    break;
                }
                i4++;
            }
        }
        return false;
    }

    public final boolean f(EnumC2075h enumC2075h) {
        Boolean bool = (Boolean) this.f15675a.get(enumC2075h);
        return bool == null || bool.booleanValue();
    }

    public final boolean g(C2077i c2077i, EnumC2075h... enumC2075hArr) {
        for (EnumC2075h enumC2075h : enumC2075hArr) {
            Boolean bool = (Boolean) this.f15675a.get(enumC2075h);
            Boolean bool2 = (Boolean) c2077i.f15675a.get(enumC2075h);
            Boolean bool3 = Boolean.FALSE;
            if (bool == bool3 && bool2 != bool3) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i4 = 17;
        for (Boolean bool : this.f15675a.values()) {
            int i5 = i4 * 31;
            i4 = i5 + (bool == null ? 0 : bool.booleanValue() ? 1 : 2);
        }
        return i4;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("settings: ");
        EnumC2075h[] values = EnumC2075h.values();
        int length = values.length;
        for (int i4 = 0; i4 < length; i4++) {
            EnumC2075h enumC2075h = values[i4];
            if (i4 != 0) {
                sb.append(", ");
            }
            sb.append(enumC2075h.name());
            sb.append("=");
            Boolean bool = (Boolean) this.f15675a.get(enumC2075h);
            if (bool == null) {
                sb.append("uninitialized");
            } else {
                sb.append(true != bool.booleanValue() ? "denied" : "granted");
            }
        }
        return sb.toString();
    }
}
