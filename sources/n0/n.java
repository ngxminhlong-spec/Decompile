package n0;

import android.content.Context;
import android.os.HandlerThread;
import android.util.Log;
import com.google.android.gms.internal.ads.Bh;
import com.google.android.gms.internal.ads.C0909mf;
import com.google.android.gms.internal.ads.HD;
import com.google.android.gms.internal.ads.InterfaceC1132ro;
import com.google.android.gms.internal.ads.Ls;
import com.google.android.gms.internal.ads.OC;
import com.google.android.gms.internal.ads.PC;
import o2.InterfaceC1891b;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class n implements Bh, InterfaceC1132ro, Ls, InterfaceC1891b {

    /* renamed from: q, reason: collision with root package name */
    public static n f14096q;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f14097o;

    /* renamed from: p, reason: collision with root package name */
    public int f14098p;

    public /* synthetic */ n(int i4, int i5) {
        this.f14097o = i5;
        this.f14098p = i4;
    }

    public /* synthetic */ n(OC oc, int i4) {
        this.f14097o = 8;
        this.f14098p = i4;
    }

    public /* synthetic */ n(OC oc, int i4, long j4) {
        this.f14097o = 7;
        this.f14098p = i4;
    }

    public /* synthetic */ n(OC oc, int i4, C0909mf c0909mf, C0909mf c0909mf2) {
        this.f14097o = 9;
        this.f14098p = i4;
    }

    public /* synthetic */ n(n nVar) {
        this.f14097o = 6;
        this.f14098p = nVar.f14098p;
    }

    public static synchronized n d() {
        n nVar;
        synchronized (n.class) {
            try {
                if (f14096q == null) {
                    f14096q = new n(3, 0);
                }
                nVar = f14096q;
            } catch (Throwable th) {
                throw th;
            }
        }
        return nVar;
    }

    public static String h(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        if (length >= 20) {
            sb.append(str.substring(0, 20));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }

    public void a(String str, String str2, Throwable... thArr) {
        if (this.f14098p <= 3) {
            if (thArr.length >= 1) {
                Log.d(str, str2, thArr[0]);
            } else {
                Log.d(str, str2);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.Ls
    public Object b() {
        switch (this.f14097o) {
            case 10:
                return new HandlerThread(HD.o("ExoPlayer:MediaCodecAsyncAdapter:", this.f14098p));
            default:
                return new HandlerThread(HD.o("ExoPlayer:MediaCodecQueueingThread:", this.f14098p));
        }
    }

    public void c(String str, String str2, Throwable... thArr) {
        if (this.f14098p <= 6) {
            if (thArr.length >= 1) {
                Log.e(str, str2, thArr[0]);
            } else {
                Log.e(str, str2);
            }
        }
    }

    public void e(String str, String str2, Throwable... thArr) {
        if (this.f14098p <= 4) {
            if (thArr.length >= 1) {
                Log.i(str, str2, thArr[0]);
            } else {
                Log.i(str, str2);
            }
        }
    }

    @Override // o2.InterfaceC1891b
    public int f(Context context, String str) {
        return this.f14098p;
    }

    @Override // o2.InterfaceC1891b
    public int g(Context context, String str, boolean z4) {
        return 0;
    }

    public void i(String str, String str2, Throwable... thArr) {
        if (this.f14098p <= 5) {
            if (thArr.length >= 1) {
                Log.w(str, str2, thArr[0]);
            } else {
                Log.w(str, str2);
            }
        }
    }

    public int j() {
        int i4 = this.f14098p;
        if (i4 == 2) {
            return 10;
        }
        if (i4 == 5) {
            return 11;
        }
        if (i4 == 29) {
            return 12;
        }
        if (i4 == 42) {
            return 16;
        }
        if (i4 != 22) {
            return i4 != 23 ? 0 : 15;
        }
        return 1073741824;
    }

    @Override // com.google.android.gms.internal.ads.Bh
    /* renamed from: l */
    public void mo3l(Object obj) {
        switch (this.f14097o) {
            case 4:
                ((P1.g) obj).L2(this.f14098p);
                return;
            case 5:
            case 6:
            default:
                ((PC) obj).j(this.f14098p);
                return;
            case 7:
                ((PC) obj).i0(this.f14098p);
                return;
            case 8:
                ((PC) obj).w(this.f14098p);
                return;
        }
    }
}
