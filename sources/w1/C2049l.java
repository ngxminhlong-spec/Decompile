package w1;

import java.util.Arrays;
import t1.C1991b;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: w1.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2049l {

    /* renamed from: a, reason: collision with root package name */
    public final C1991b f15159a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f15160b;

    public C2049l(C1991b c1991b, byte[] bArr) {
        if (c1991b == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.f15159a = c1991b;
        this.f15160b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2049l)) {
            return false;
        }
        C2049l c2049l = (C2049l) obj;
        if (this.f15159a.equals(c2049l.f15159a)) {
            return Arrays.equals(this.f15160b, c2049l.f15160b);
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f15159a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f15160b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f15159a + ", bytes=[...]}";
    }
}
