package x2;

import android.os.SystemClock;
import android.util.Pair;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class L0 extends T0 {
    public final HashMap d;

    /* renamed from: e, reason: collision with root package name */
    public final Q f15408e;

    /* renamed from: f, reason: collision with root package name */
    public final Q f15409f;

    /* renamed from: g, reason: collision with root package name */
    public final Q f15410g;

    /* renamed from: h, reason: collision with root package name */
    public final Q f15411h;

    /* renamed from: i, reason: collision with root package name */
    public final Q f15412i;

    public L0(X0 x02) {
        super(x02);
        this.d = new HashMap();
        T t4 = ((C2066c0) this.f1719a).f15567h;
        C2066c0.g(t4);
        this.f15408e = new Q(t4, "last_delete_stale", 0L);
        T t5 = ((C2066c0) this.f1719a).f15567h;
        C2066c0.g(t5);
        this.f15409f = new Q(t5, "backoff", 0L);
        T t6 = ((C2066c0) this.f1719a).f15567h;
        C2066c0.g(t6);
        this.f15410g = new Q(t6, "last_upload", 0L);
        T t7 = ((C2066c0) this.f1719a).f15567h;
        C2066c0.g(t7);
        this.f15411h = new Q(t7, "last_upload_attempt", 0L);
        T t8 = ((C2066c0) this.f1719a).f15567h;
        C2066c0.g(t8);
        this.f15412i = new Q(t8, "midnight_offset", 0L);
    }

    @Override // x2.T0
    public final void j() {
    }

    public final Pair k(String str) {
        K0 k02;
        g();
        C2066c0 c2066c0 = (C2066c0) this.f1719a;
        c2066c0.f15573n.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        HashMap hashMap = this.d;
        K0 k03 = (K0) hashMap.get(str);
        if (k03 != null && elapsedRealtime < k03.c) {
            return new Pair(k03.f15403a, Boolean.valueOf(k03.f15404b));
        }
        long m4 = c2066c0.f15566g.m(str, B.f15291b) + elapsedRealtime;
        try {
            L1.a a4 = L1.b.a(c2066c0.f15562a);
            boolean z4 = a4.f1076b;
            String str2 = a4.f1075a;
            k02 = str2 != null ? new K0(str2, z4, m4) : new K0("", z4, m4);
        } catch (Exception e4) {
            K k3 = c2066c0.f15568i;
            C2066c0.i(k3);
            k3.f15401m.b(e4, "Unable to get advertising id");
            k02 = new K0("", false, m4);
        }
        hashMap.put(str, k02);
        return new Pair(k02.f15403a, Boolean.valueOf(k02.f15404b));
    }

    public final String l(String str, boolean z4) {
        g();
        String str2 = z4 ? (String) k(str).first : "00000000-0000-0000-0000-000000000000";
        MessageDigest n4 = b1.n();
        if (n4 == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, n4.digest(str2.getBytes())));
    }
}
