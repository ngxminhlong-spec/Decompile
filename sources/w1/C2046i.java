package w1;

import android.util.Base64;
import java.util.Arrays;
import t1.EnumC1992c;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: w1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2046i {

    /* renamed from: a, reason: collision with root package name */
    public final String f15151a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f15152b;
    public final EnumC1992c c;

    public C2046i(String str, byte[] bArr, EnumC1992c enumC1992c) {
        this.f15151a = str;
        this.f15152b = bArr;
        this.c = enumC1992c;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, t3.g] */
    public static t3.g a() {
        ?? obj = new Object();
        obj.f14963q = EnumC1992c.f14844o;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2046i) {
            C2046i c2046i = (C2046i) obj;
            if (this.f15151a.equals(c2046i.f15151a) && Arrays.equals(this.f15152b, c2046i.f15152b) && this.c.equals(c2046i.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f15151a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f15152b)) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        byte[] bArr = this.f15152b;
        String encodeToString = bArr == null ? "" : Base64.encodeToString(bArr, 2);
        StringBuilder sb = new StringBuilder("TransportContext(");
        sb.append(this.f15151a);
        sb.append(", ");
        sb.append(this.c);
        sb.append(", ");
        return n0.a.j(sb, encodeToString, ")");
    }
}
