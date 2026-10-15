package com.google.android.gms.internal.ads;

import android.provider.Settings;
import android.util.Base64;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.e4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0550e4 extends AbstractCallableC0892m4 {

    /* renamed from: i, reason: collision with root package name */
    public static volatile Long f8552i;

    /* renamed from: k, reason: collision with root package name */
    public static volatile Long f8554k;

    /* renamed from: m, reason: collision with root package name */
    public static volatile String f8556m;

    /* renamed from: o, reason: collision with root package name */
    public static volatile Long f8558o;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f8560h;

    /* renamed from: j, reason: collision with root package name */
    public static final Object f8553j = new Object();

    /* renamed from: l, reason: collision with root package name */
    public static final Object f8555l = new Object();

    /* renamed from: n, reason: collision with root package name */
    public static final Object f8557n = new Object();

    /* renamed from: p, reason: collision with root package name */
    public static final Object f8559p = new Object();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0550e4(U3 u32, C0549e3 c0549e3, int i4, int i5) {
        super(u32, "ttuIHg/yfWDxJlotLoMLf9WBnVTbWFFKY03C8KHR8FAhIQHccw4LaDLJatYkpo23", "xLOAO7msIR4UFUyldUn5stL2wwbLdISu2CSlTLg4f6Q=", c0549e3, i4, 44);
        this.f8560h = i5;
        switch (i5) {
            case 1:
                super(u32, "1eWk7vHD3Ee+FybzKEoWLH07Pvdxo5flYR768ntLvpJZNSFjE7xgNzi+al9tiZC4", "w5tjCRfZfXWJzckDvIkXwf5aGJEVejLzfxhnwyqJH5E=", c0549e3, i4, 22);
                return;
            case 2:
                super(u32, "hMVcCX1S6+m7rVEDNdCHhVgXRFILMOQ9RgLSmTdPHeNgAU8CbmBsymKBuqLQcQaU", "3PwoDnm3HnsskB+3ZnJHoZ7BzV0InxUqaAwJBlSwKFs=", c0549e3, i4, 1);
                return;
            case 3:
            case 7:
            case 8:
            case 11:
            default:
                return;
            case 4:
                super(u32, "iibTgWRTbrwM2W7HZGJP5cjM0DLiCyA9TVVy1genRaa4nvgE3+CiRN/Fx87DVDsO", "iU9T/JU0akui7k4x/WtKPjyPVCtA+9ztaziSj2SwIy0=", c0549e3, i4, 89);
                return;
            case 5:
                super(u32, "Q+fOnDUQnIPH75lusFutOgWOI4DeJ6z7X13oo1pZ5m19Kfyi56UOJglWSBqO3AzA", "Hu+f/NX/SE2ncwqgjWboivCw8sh0xmVI9uGBmdlJpc4=", c0549e3, i4, 49);
                return;
            case 6:
                super(u32, "ZHFOx+FjaOsul7gEkIcfA8auDnyRWXmT0qbiHVEO6U1RLulNSOFK3tPEgm+pvQxr", "RSyr2AK130nKbepDTsaNV0Uv17TWUb4O6ebIiV3GgVs=", c0549e3, i4, 5);
                return;
            case 9:
                super(u32, "jjg2LREBZ6Uexk1F+/xvygfAXYATBvQHfsOfWOGMPQM53g793pJFEG1AwAYG3/Of", "aC7c3pDenGsdb0eFildzKOBrhobw8fKkmd52rTlBEKM=", c0549e3, i4, 12);
                return;
            case 10:
                super(u32, "zmLnsak1Fo/LHy30EeWswBCxcOoFKuH08l3DkSTUgzb476o6nI+C8ZUC+d8tLJwZ", "sK9i540XcONymgaiZVMKYXr1VbNcwMhjwo2LFhhSCFg=", c0549e3, i4, 3);
                return;
            case 12:
                super(u32, "4/SMeJXpDEQUjIN8ctjvaq+191KHQFpFbvfik3xx/Qb+eWbRMHKpllc1rI0p7EXQ", "Jz2tk/JKeGJKcc4wwXH5Pf6ZM64fYgV4wWxByPOgNQE=", c0549e3, i4, 51);
                return;
            case 13:
                super(u32, "1OxyLDHu2cwu0U7XKtDO3q+DghLeQ8xcTgpGCDWDuEeCcfs+HPxSt8kldIfiq1K0", "Ee4p/yPQz67p3LoSNbpt1G8K9rDuoWxBYT8E4CbWyr8=", c0549e3, i4, 48);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0550e4(U3 u32, String str, String str2, C0549e3 c0549e3, int i4, int i5, int i6) {
        super(u32, str, str2, c0549e3, i4, i5);
        this.f8560h = i6;
    }

    private final void c() {
        String str = (String) this.f9562e.invoke(null, null);
        synchronized (this.d) {
            C0549e3 c0549e3 = this.d;
            c0549e3.d();
            C0977o3.a0((C0977o3) c0549e3.f4561p, str);
        }
    }

    private final void d() {
        C0549e3 c0549e3 = this.d;
        c0549e3.d();
        C0977o3.x0((C0977o3) c0549e3.f4561p, -1L);
        C0549e3 c0549e32 = this.d;
        c0549e32.d();
        C0977o3.y0((C0977o3) c0549e32.f4561p, -1L);
        int[] iArr = (int[]) this.f9562e.invoke(null, this.f9560a.f7127a);
        synchronized (this.d) {
            try {
                C0549e3 c0549e33 = this.d;
                long j4 = iArr[0];
                c0549e33.d();
                C0977o3.x0((C0977o3) c0549e33.f4561p, j4);
                C0549e3 c0549e34 = this.d;
                long j5 = iArr[1];
                c0549e34.d();
                C0977o3.y0((C0977o3) c0549e34.f4561p, j5);
                int i4 = iArr[2];
                if (i4 != Integer.MIN_VALUE) {
                    C0549e3 c0549e35 = this.d;
                    c0549e35.d();
                    C0977o3.P((C0977o3) c0549e35.f4561p, i4);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void e() {
        if (f8552i == null) {
            synchronized (f8553j) {
                try {
                    if (f8552i == null) {
                        f8552i = (Long) this.f9562e.invoke(null, null);
                    }
                } finally {
                }
            }
        }
        synchronized (this.d) {
            C0549e3 c0549e3 = this.d;
            long longValue = f8552i.longValue();
            c0549e3.d();
            C0977o3.E((C0977o3) c0549e3.f4561p, longValue);
        }
    }

    private final void f() {
        if (this.f9560a.f7137m) {
            l();
            return;
        }
        synchronized (this.d) {
            C0549e3 c0549e3 = this.d;
            String str = (String) this.f9562e.invoke(null, this.f9560a.f7127a);
            c0549e3.d();
            C0977o3.b0((C0977o3) c0549e3.f4561p, str);
        }
    }

    private final void g() {
        if (f8554k == null) {
            synchronized (f8555l) {
                try {
                    if (f8554k == null) {
                        f8554k = (Long) this.f9562e.invoke(null, null);
                    }
                } finally {
                }
            }
        }
        synchronized (this.d) {
            C0549e3 c0549e3 = this.d;
            long longValue = f8554k.longValue();
            c0549e3.d();
            C0977o3.G0((C0977o3) c0549e3.f4561p, longValue);
        }
    }

    private final void h() {
        C0549e3 c0549e3 = this.d;
        c0549e3.d();
        C0977o3.u0((C0977o3) c0549e3.f4561p, "E");
        if (f8556m == null) {
            synchronized (f8557n) {
                try {
                    if (f8556m == null) {
                        f8556m = (String) this.f9562e.invoke(null, null);
                    }
                } finally {
                }
            }
        }
        synchronized (this.d) {
            C0549e3 c0549e32 = this.d;
            String str = f8556m;
            c0549e32.d();
            C0977o3.u0((C0977o3) c0549e32.f4561p, str);
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [com.google.android.gms.internal.ads.O3, com.google.android.gms.internal.ads.u] */
    private final void i() {
        Boolean bool = (Boolean) O1.r.d.c.a(AbstractC1066q6.f10246k2);
        bool.getClass();
        String str = (String) this.f9562e.invoke(null, this.f9560a.f7127a, bool);
        ?? abstractC1230u = new AbstractC1230u();
        abstractC1230u.f6433b = -1L;
        abstractC1230u.c = -1L;
        HashMap i4 = AbstractC1230u.i(str);
        if (i4 != null) {
            abstractC1230u.f6433b = ((Long) i4.get(0)).longValue();
            abstractC1230u.c = ((Long) i4.get(1)).longValue();
        }
        synchronized (this.d) {
            C0549e3 c0549e3 = this.d;
            long j4 = abstractC1230u.f6433b;
            c0549e3.d();
            C0977o3.w0((C0977o3) c0549e3.f4561p, j4);
            C0549e3 c0549e32 = this.d;
            long j5 = abstractC1230u.c;
            c0549e32.d();
            C0977o3.Q((C0977o3) c0549e32.f4561p, j5);
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [com.google.android.gms.internal.ads.S3, com.google.android.gms.internal.ads.u] */
    private final void j() {
        synchronized (this.d) {
            String str = (String) this.f9562e.invoke(null, null);
            ?? abstractC1230u = new AbstractC1230u();
            HashMap i4 = AbstractC1230u.i(str);
            if (i4 != null) {
                abstractC1230u.f6947b = (Long) i4.get(0);
                abstractC1230u.c = (Long) i4.get(1);
            }
            C0549e3 c0549e3 = this.d;
            long longValue = abstractC1230u.f6947b.longValue();
            c0549e3.d();
            C0977o3.I((C0977o3) c0549e3.f4561p, longValue);
            C0549e3 c0549e32 = this.d;
            long longValue2 = abstractC1230u.c.longValue();
            c0549e32.d();
            C0977o3.J((C0977o3) c0549e32.f4561p, longValue2);
        }
    }

    private final void k() {
        if (f8558o == null) {
            synchronized (f8559p) {
                try {
                    if (f8558o == null) {
                        f8558o = (Long) this.f9562e.invoke(null, null);
                    }
                } finally {
                }
            }
        }
        synchronized (this.d) {
            C0549e3 c0549e3 = this.d;
            long longValue = f8558o.longValue();
            c0549e3.d();
            C0977o3.v((C0977o3) c0549e3.f4561p, longValue);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC0892m4
    public final void a() {
        int i4;
        switch (this.f8560h) {
            case 0:
                e();
                return;
            case 1:
                g();
                return;
            case 2:
                h();
                return;
            case 3:
                k();
                return;
            case 4:
                c();
                return;
            case 5:
                C0549e3 c0549e3 = this.d;
                c0549e3.d();
                C0977o3.j0((C0977o3) c0549e3.f4561p, 3);
                try {
                    i4 = true != ((Boolean) this.f9562e.invoke(null, this.f9560a.f7127a)).booleanValue() ? 1 : 2;
                    c0549e3.d();
                    C0977o3.j0((C0977o3) c0549e3.f4561p, i4);
                    return;
                } catch (InvocationTargetException e4) {
                    if (!(e4.getTargetException() instanceof Settings.SettingNotFoundException)) {
                        throw e4;
                    }
                    return;
                }
            case 6:
                d();
                return;
            case 7:
                f();
                return;
            case 8:
                i4 = true != ((Boolean) this.f9562e.invoke(null, this.f9560a.f7127a)).booleanValue() ? 1 : 2;
                C0549e3 c0549e32 = this.d;
                c0549e32.d();
                C0977o3.m0((C0977o3) c0549e32.f4561p, i4);
                return;
            case 9:
                C0549e3 c0549e33 = this.d;
                c0549e33.d();
                C0977o3.A0((C0977o3) c0549e33.f4561p, -1L);
                long longValue = ((Long) this.f9562e.invoke(null, this.f9560a.f7127a)).longValue();
                c0549e33.d();
                C0977o3.A0((C0977o3) c0549e33.f4561p, longValue);
                return;
            case 10:
                i();
                return;
            case 11:
                C0549e3 c0549e34 = this.d;
                try {
                    i4 = true != ((Boolean) this.f9562e.invoke(null, this.f9560a.f7127a)).booleanValue() ? 1 : 2;
                    c0549e34.d();
                    C0977o3.l0((C0977o3) c0549e34.f4561p, i4);
                    return;
                } catch (InvocationTargetException unused) {
                    c0549e34.d();
                    C0977o3.l0((C0977o3) c0549e34.f4561p, 3);
                    return;
                }
            case 12:
                j();
                return;
            default:
                C0549e3 c0549e35 = this.d;
                c0549e35.d();
                C0977o3.i0((C0977o3) c0549e35.f4561p, 3);
                boolean booleanValue = ((Boolean) this.f9562e.invoke(null, this.f9560a.f7127a)).booleanValue();
                synchronized (this.d) {
                    try {
                        if (booleanValue) {
                            C0549e3 c0549e36 = this.d;
                            c0549e36.d();
                            C0977o3.i0((C0977o3) c0549e36.f4561p, 2);
                        } else {
                            C0549e3 c0549e37 = this.d;
                            c0549e37.d();
                            C0977o3.i0((C0977o3) c0549e37.f4561p, 1);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC0892m4
    public void b() {
        switch (this.f8560h) {
            case 7:
                U3 u32 = this.f9560a;
                if (u32.f7140p) {
                    super.b();
                    return;
                } else {
                    if (u32.f7137m) {
                        l();
                        return;
                    }
                    return;
                }
            default:
                super.b();
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC0892m4, java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() {
        switch (this.f8560h) {
            case 7:
                b();
                return null;
            default:
                return super.call();
        }
    }

    public void l() {
        Future future;
        U3 u32 = this.f9560a;
        L1.b bVar = null;
        if (u32.f7131g) {
            if (u32.f7130f == null && (future = u32.f7132h) != null) {
                try {
                    future.get(2000L, TimeUnit.MILLISECONDS);
                    u32.f7132h = null;
                } catch (InterruptedException | ExecutionException unused) {
                } catch (TimeoutException unused2) {
                    u32.f7132h.cancel(true);
                }
            }
            bVar = u32.f7130f;
        }
        if (bVar != null) {
            try {
                L1.a f4 = bVar.f();
                String str = f4.f1075a;
                char[] cArr = W3.f7341a;
                if (str != null && str.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
                    UUID fromString = UUID.fromString(str);
                    byte[] bArr = new byte[16];
                    ByteBuffer wrap = ByteBuffer.wrap(bArr);
                    wrap.putLong(fromString.getMostSignificantBits());
                    wrap.putLong(fromString.getLeastSignificantBits());
                    str = Base64.encodeToString(bArr, 11);
                }
                if (str != null) {
                    synchronized (this.d) {
                        C0549e3 c0549e3 = this.d;
                        c0549e3.d();
                        C0977o3.b0((C0977o3) c0549e3.f4561p, str);
                        C0549e3 c0549e32 = this.d;
                        boolean z4 = f4.f1076b;
                        c0549e32.d();
                        C0977o3.c0((C0977o3) c0549e32.f4561p, z4);
                        C0549e3 c0549e33 = this.d;
                        c0549e33.d();
                        C0977o3.o0((C0977o3) c0549e33.f4561p);
                    }
                }
            } catch (IOException unused3) {
            }
        }
    }
}
