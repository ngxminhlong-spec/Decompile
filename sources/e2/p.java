package e2;

import java.util.Arrays;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class p extends o {

    /* renamed from: q, reason: collision with root package name */
    public final byte[] f12771q;

    public p(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f12771q = bArr;
    }

    @Override // e2.o
    public final byte[] C2() {
        return this.f12771q;
    }
}
