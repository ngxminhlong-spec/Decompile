package Q1;

import com.google.android.gms.internal.ads.AbstractC1230u;
import com.google.android.gms.internal.ads.B2;
import com.google.android.gms.internal.ads.C0272Fc;
import com.google.android.gms.internal.ads.C1320w3;
import com.google.android.gms.internal.ads.C1421yc;
import com.google.android.gms.internal.ads.D2;
import com.google.android.gms.internal.ads.Iv;
import java.util.Map;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: Q1.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0121u extends D2 {

    /* renamed from: A, reason: collision with root package name */
    public final C0272Fc f1731A;

    /* renamed from: B, reason: collision with root package name */
    public final C1421yc f1732B;

    public C0121u(String str, C0272Fc c0272Fc) {
        super(0, str, new x0.f(19, c0272Fc));
        this.f1731A = c0272Fc;
        C1421yc c1421yc = new C1421yc();
        this.f1732B = c1421yc;
        if (C1421yc.c()) {
            c1421yc.d("onNetworkRequest", new u0.g(str, "GET", null, null, 6));
        }
    }

    @Override // com.google.android.gms.internal.ads.D2
    public final B0.c a(B2 b22) {
        return new B0.c(b22, AbstractC1230u.v(b22));
    }

    @Override // com.google.android.gms.internal.ads.D2
    public final void e(Object obj) {
        B2 b22 = (B2) obj;
        Map map = b22.c;
        int i4 = b22.f4022a;
        C1421yc c1421yc = this.f1732B;
        c1421yc.getClass();
        if (C1421yc.c()) {
            c1421yc.d("onNetworkResponse", new B0.r(i4, map));
            if (i4 < 200 || i4 >= 300) {
                c1421yc.d("onNetworkRequestError", new Iv(null, 7));
            }
        }
        byte[] bArr = b22.f4023b;
        if (C1421yc.c() && bArr != null) {
            c1421yc.d("onNetworkResponseBody", new C1320w3(1, bArr));
        }
        this.f1731A.b(b22);
    }
}
