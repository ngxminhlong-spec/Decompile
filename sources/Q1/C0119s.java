package Q1;

import com.google.android.gms.internal.ads.AbstractC1230u;
import com.google.android.gms.internal.ads.B2;
import com.google.android.gms.internal.ads.C0258Da;
import com.google.android.gms.internal.ads.C1320w3;
import com.google.android.gms.internal.ads.C1421yc;
import com.google.android.gms.internal.ads.D2;
import java.io.UnsupportedEncodingException;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: Q1.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0119s extends D2 {

    /* renamed from: A, reason: collision with root package name */
    public final Object f1726A;

    /* renamed from: B, reason: collision with root package name */
    public final C0120t f1727B;

    /* renamed from: C, reason: collision with root package name */
    public final /* synthetic */ byte[] f1728C;

    /* renamed from: D, reason: collision with root package name */
    public final /* synthetic */ Map f1729D;

    /* renamed from: E, reason: collision with root package name */
    public final /* synthetic */ C1421yc f1730E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0119s(int i4, String str, C0120t c0120t, C0258Da c0258Da, byte[] bArr, Map map, C1421yc c1421yc) {
        super(i4, str, c0258Da);
        this.f1728C = bArr;
        this.f1729D = map;
        this.f1730E = c1421yc;
        this.f1726A = new Object();
        this.f1727B = c0120t;
    }

    @Override // com.google.android.gms.internal.ads.D2
    public final B0.c a(B2 b22) {
        String str;
        String str2;
        byte[] bArr = b22.f4023b;
        try {
            Map map = b22.c;
            String str3 = "ISO-8859-1";
            if (map != null && (str2 = (String) map.get("Content-Type")) != null) {
                String[] split = str2.split(";", 0);
                int i4 = 1;
                while (true) {
                    if (i4 >= split.length) {
                        break;
                    }
                    String[] split2 = split[i4].trim().split("=", 0);
                    if (split2.length == 2 && split2[0].equals("charset")) {
                        str3 = split2[1];
                        break;
                    }
                    i4++;
                }
            }
            str = new String(bArr, str3);
        } catch (UnsupportedEncodingException unused) {
            str = new String(bArr);
        }
        return new B0.c(str, AbstractC1230u.v(b22));
    }

    @Override // com.google.android.gms.internal.ads.D2
    public final Map c() {
        Map map = this.f1729D;
        return map == null ? Collections.EMPTY_MAP : map;
    }

    @Override // com.google.android.gms.internal.ads.D2
    public final void e(Object obj) {
        C0120t c0120t;
        String str = (String) obj;
        C1421yc c1421yc = this.f1730E;
        if (C1421yc.c() && str != null) {
            c1421yc.d("onNetworkResponseBody", new C1320w3(1, str.getBytes()));
        }
        synchronized (this.f1726A) {
            c0120t = this.f1727B;
        }
        c0120t.b(str);
    }

    @Override // com.google.android.gms.internal.ads.D2
    public final byte[] m() {
        byte[] bArr = this.f1728C;
        if (bArr == null) {
            return null;
        }
        return bArr;
    }
}
