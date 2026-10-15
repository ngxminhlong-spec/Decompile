package x2;

import android.os.Bundle;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class L {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15405a = 0;

    /* renamed from: b, reason: collision with root package name */
    public long f15406b;
    public Object c;
    public Object d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f15407e;

    public L(long j4, Bundle bundle, String str, String str2) {
        this.c = str;
        this.d = str2;
        this.f15407e = bundle;
        this.f15406b = j4;
    }

    public static L c(C2096s c2096s) {
        String str = c2096s.f15781o;
        String str2 = c2096s.f15783q;
        return new L(c2096s.f15784r, c2096s.f15782p.h(), str, str2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x0118, code lost:
    
        if (r8 != null) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.google.android.gms.internal.measurement.E0 a(com.google.android.gms.internal.measurement.E0 r21, java.lang.String r22) {
        /*
            Method dump skipped, instructions count: 597
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x2.L.a(com.google.android.gms.internal.measurement.E0, java.lang.String):com.google.android.gms.internal.measurement.E0");
    }

    public C2096s b() {
        return new C2096s((String) this.c, new r(new Bundle((Bundle) this.f15407e)), (String) this.d, this.f15406b);
    }

    public String toString() {
        switch (this.f15405a) {
            case 0:
                String str = (String) this.d;
                String str2 = (String) this.c;
                String obj = ((Bundle) this.f15407e).toString();
                StringBuilder n4 = U.a.n("origin=", str, ",name=", str2, ",params=");
                n4.append(obj);
                return n4.toString();
            default:
                return super.toString();
        }
    }
}
