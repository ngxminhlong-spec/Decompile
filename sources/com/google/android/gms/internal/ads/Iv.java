package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.JsonWriter;
import android.util.Log;
import com.google.android.gms.internal.measurement.C1509e0;
import java.util.IllegalFormatException;
import java.util.Locale;
import java.util.Map;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Iv implements InterfaceC0351Vb, InterfaceC1378xc, Bh {

    /* renamed from: A, reason: collision with root package name */
    public static final Iv f5749A;

    /* renamed from: B, reason: collision with root package name */
    public static final Iv f5750B;

    /* renamed from: C, reason: collision with root package name */
    public static final Iv f5751C;

    /* renamed from: D, reason: collision with root package name */
    public static final Iv f5752D;

    /* renamed from: E, reason: collision with root package name */
    public static final Iv f5753E;

    /* renamed from: F, reason: collision with root package name */
    public static final Iv f5754F;

    /* renamed from: G, reason: collision with root package name */
    public static final Iv f5755G;

    /* renamed from: H, reason: collision with root package name */
    public static final Iv f5756H;

    /* renamed from: I, reason: collision with root package name */
    public static final Iv f5757I;

    /* renamed from: J, reason: collision with root package name */
    public static final Iv f5758J;

    /* renamed from: K, reason: collision with root package name */
    public static final Iv f5759K;

    /* renamed from: q, reason: collision with root package name */
    public static final Iv f5760q;

    /* renamed from: r, reason: collision with root package name */
    public static final Iv f5761r;

    /* renamed from: s, reason: collision with root package name */
    public static final Iv f5762s;

    /* renamed from: t, reason: collision with root package name */
    public static final Iv f5763t;

    /* renamed from: u, reason: collision with root package name */
    public static final Iv f5764u;

    /* renamed from: v, reason: collision with root package name */
    public static final Iv f5765v;

    /* renamed from: w, reason: collision with root package name */
    public static final Iv f5766w;

    /* renamed from: x, reason: collision with root package name */
    public static final Iv f5767x;
    public static final Iv y;

    /* renamed from: z, reason: collision with root package name */
    public static final Iv f5768z;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f5769o;

    /* renamed from: p, reason: collision with root package name */
    public final String f5770p;

    static {
        int i4 = 0;
        f5760q = new Iv("SHA1", i4);
        f5761r = new Iv("SHA224", i4);
        f5762s = new Iv("SHA256", i4);
        f5763t = new Iv("SHA384", i4);
        f5764u = new Iv("SHA512", i4);
        int i5 = 1;
        f5765v = new Iv("TINK", i5);
        f5766w = new Iv("CRUNCHY", i5);
        f5767x = new Iv("NO_PREFIX", i5);
        int i6 = 2;
        y = new Iv("TINK", i6);
        f5768z = new Iv("CRUNCHY", i6);
        f5749A = new Iv("NO_PREFIX", i6);
        int i7 = 3;
        f5750B = new Iv("ASSUME_AES_GCM", i7);
        f5751C = new Iv("ASSUME_XCHACHA20POLY1305", i7);
        f5752D = new Iv("ASSUME_CHACHA20POLY1305", i7);
        f5753E = new Iv("ASSUME_AES_CTR_HMAC", i7);
        f5754F = new Iv("ASSUME_AES_EAX", i7);
        f5755G = new Iv("ASSUME_AES_GCM_SIV", i7);
        int i8 = 4;
        f5756H = new Iv("TINK", i8);
        f5757I = new Iv("CRUNCHY", i8);
        f5758J = new Iv("LEGACY", i8);
        f5759K = new Iv("NO_PREFIX", i8);
    }

    public Iv() {
        this.f5769o = 9;
        this.f5770p = (String) H6.f5411a.r();
    }

    public Iv(String str) {
        this.f5769o = 10;
        this.f5770p = ("UID: [" + Process.myUid() + "]  PID: [" + Process.myPid() + "] ").concat(str);
    }

    public /* synthetic */ Iv(String str, int i4) {
        this.f5769o = i4;
        this.f5770p = str;
    }

    public static Iv b(C1134rq c1134rq) {
        String str;
        c1134rq.f(2);
        int m4 = c1134rq.m();
        int i4 = m4 >> 1;
        int i5 = m4 & 1;
        int m5 = c1134rq.m() >> 3;
        if (i4 == 4 || i4 == 5 || i4 == 7) {
            str = "dvhe";
        } else if (i4 == 8) {
            str = "hev1";
        } else {
            if (i4 != 9) {
                return null;
            }
            str = "avc3";
        }
        int i6 = m5 | (i5 << 5);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".0");
        sb.append(i4);
        sb.append(i6 >= 10 ? "." : ".0");
        sb.append(i6);
        return new Iv(sb.toString(), 5);
    }

    public static String h(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e4) {
                Log.e("PlayCore", "Unable to format ".concat(str2), e4);
                str2 = str2 + " [" + TextUtils.join(", ", objArr) + "]";
            }
        }
        return n0.a.i(str, " : ", str2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0351Vb
    public void a(InterfaceC0609fe interfaceC0609fe) {
        C1509e0 c1509e0 = (C1509e0) ((BinderC0854l9) interfaceC0609fe).f9378o.f13386p;
        c1509e0.b(new com.google.android.gms.internal.measurement.T(c1509e0, this.f5770p, 1));
    }

    public String c(Map map) {
        Uri.Builder buildUpon = Uri.parse(this.f5770p).buildUpon();
        for (Map.Entry entry : map.entrySet()) {
            buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        return buildUpon.build().toString();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1378xc
    public void d(JsonWriter jsonWriter) {
        Object obj = C1421yc.f11357b;
        jsonWriter.name("params").beginObject();
        String str = this.f5770p;
        if (str != null) {
            jsonWriter.name("error_description").value(str);
        }
        jsonWriter.endObject();
    }

    public void e(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", h(this.f5770p, str, objArr));
        }
    }

    public void f(RemoteException remoteException, String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", h(this.f5770p, str, objArr), remoteException);
        }
    }

    public void g(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            Log.i("PlayCore", h(this.f5770p, str, objArr));
        }
    }

    @Override // com.google.android.gms.internal.ads.Bh
    /* renamed from: l */
    public void mo3l(Object obj) {
        ((Ih) obj).y(this.f5770p);
    }

    public String toString() {
        switch (this.f5769o) {
            case 0:
                return this.f5770p;
            case 1:
                return this.f5770p;
            case 2:
                return this.f5770p;
            case 3:
                return this.f5770p;
            case 4:
                return this.f5770p;
            default:
                return super.toString();
        }
    }
}
