package com.google.android.gms.internal.ads;

import O1.C0081p;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import o2.AbstractC1895f;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.Zc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0372Zc {

    /* renamed from: a, reason: collision with root package name */
    public final Context f8002a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8003b;
    public final C0248Bc c;
    public final C1237u6 d;

    /* renamed from: e, reason: collision with root package name */
    public final C1323w6 f8004e;

    /* renamed from: f, reason: collision with root package name */
    public final C0.x0 f8005f;

    /* renamed from: g, reason: collision with root package name */
    public final long[] f8006g;

    /* renamed from: h, reason: collision with root package name */
    public final String[] f8007h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f8008i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f8009j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f8010k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f8011l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f8012m;

    /* renamed from: n, reason: collision with root package name */
    public AbstractC0322Pc f8013n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f8014o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f8015p;

    /* renamed from: q, reason: collision with root package name */
    public long f8016q;

    public C0372Zc(Context context, C0248Bc c0248Bc, String str, C1323w6 c1323w6, C1237u6 c1237u6) {
        q2.e eVar = new q2.e(4);
        eVar.C("min_1", Double.MIN_VALUE, 1.0d);
        eVar.C("1_5", 1.0d, 5.0d);
        eVar.C("5_10", 5.0d, 10.0d);
        eVar.C("10_20", 10.0d, 20.0d);
        eVar.C("20_30", 20.0d, 30.0d);
        eVar.C("30_max", 30.0d, Double.MAX_VALUE);
        this.f8005f = new C0.x0(eVar);
        this.f8008i = false;
        this.f8009j = false;
        this.f8010k = false;
        this.f8011l = false;
        this.f8016q = -1L;
        this.f8002a = context;
        this.c = c0248Bc;
        this.f8003b = str;
        this.f8004e = c1323w6;
        this.d = c1237u6;
        String str2 = (String) O1.r.d.c.a(AbstractC1066q6.f10290u);
        if (str2 == null) {
            this.f8007h = new String[0];
            this.f8006g = new long[0];
            return;
        }
        String[] split = TextUtils.split(str2, ",");
        int length = split.length;
        this.f8007h = new String[length];
        this.f8006g = new long[length];
        for (int i4 = 0; i4 < split.length; i4++) {
            try {
                this.f8006g[i4] = Long.parseLong(split[i4]);
            } catch (NumberFormatException e4) {
                Y9.t("Unable to parse frame hash target time number.", e4);
                this.f8006g[i4] = -1;
            }
        }
    }

    public final void a() {
        Bundle F2;
        if (!((Boolean) AbstractC0468c7.f8346a.r()).booleanValue() || this.f8014o) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("type", "native-player-metrics");
        bundle.putString("request", this.f8003b);
        bundle.putString("player", this.f8013n.s());
        C0.x0 x0Var = this.f8005f;
        String[] strArr = (String[]) x0Var.f451p;
        ArrayList arrayList = new ArrayList(strArr.length);
        int i4 = 0;
        while (i4 < strArr.length) {
            String str = strArr[i4];
            double[] dArr = (double[]) x0Var.f453r;
            double[] dArr2 = (double[]) x0Var.f452q;
            int[] iArr = (int[]) x0Var.f454s;
            double d = dArr[i4];
            double d4 = dArr2[i4];
            int i5 = iArr[i4];
            arrayList.add(new Q1.r(str, d, d4, i5 / x0Var.f450o, i5));
            i4++;
            x0Var = x0Var;
            strArr = strArr;
        }
        int size = arrayList.size();
        int i6 = 0;
        while (i6 < size) {
            Object obj = arrayList.get(i6);
            i6++;
            Q1.r rVar = (Q1.r) obj;
            bundle.putString("fps_c_".concat(String.valueOf(rVar.f1723a)), Integer.toString(rVar.f1725e));
            bundle.putString("fps_p_".concat(String.valueOf(rVar.f1723a)), Double.toString(rVar.d));
        }
        int i7 = 0;
        while (true) {
            long[] jArr = this.f8006g;
            if (i7 >= jArr.length) {
                break;
            }
            String str2 = this.f8007h[i7];
            if (str2 != null) {
                bundle.putString("fh_".concat(Long.valueOf(jArr[i7]).toString()), str2);
            }
            i7++;
        }
        final Q1.N n4 = N1.n.f1204A.c;
        String str3 = this.c.f4084o;
        AtomicReference atomicReference = n4.c;
        bundle.putString("device", Q1.N.E());
        C0937n6 c0937n6 = AbstractC1066q6.f10197a;
        O1.r rVar2 = O1.r.d;
        bundle.putString("eids", TextUtils.join(",", rVar2.f1379a.m()));
        boolean isEmpty = bundle.isEmpty();
        final Context context = this.f8002a;
        if (isEmpty) {
            Y9.m("Empty or null bundle.");
        } else {
            final String str4 = (String) rVar2.c.a(AbstractC1066q6.U8);
            if (!n4.d.getAndSet(true)) {
                SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: Q1.L
                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str5) {
                        N.this.c.set(AbstractC1895f.F(context, str4));
                    }
                };
                if (TextUtils.isEmpty(str4)) {
                    F2 = Bundle.EMPTY;
                } else {
                    PreferenceManager.getDefaultSharedPreferences(context).registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
                    F2 = AbstractC1895f.F(context, str4);
                }
                atomicReference.set(F2);
            }
            bundle.putAll((Bundle) atomicReference.get());
        }
        C1335wc c1335wc = C0081p.f1374f.f1375a;
        C1335wc.k(context, str3, bundle, new C0783ji(9, context, str3));
        this.f8014o = true;
    }

    public final void b(AbstractC0322Pc abstractC0322Pc) {
        if (this.f8010k && !this.f8011l) {
            if (Q1.I.y() && !this.f8011l) {
                Q1.I.w("VideoMetricsMixin first frame");
            }
            AbstractC1230u.l(this.f8004e, this.d, "vff2");
            this.f8011l = true;
        }
        N1.n.f1204A.f1212j.getClass();
        long nanoTime = System.nanoTime();
        if (this.f8012m && this.f8015p && this.f8016q != -1) {
            double nanos = TimeUnit.SECONDS.toNanos(1L) / (nanoTime - this.f8016q);
            C0.x0 x0Var = this.f8005f;
            x0Var.f450o++;
            int i4 = 0;
            while (true) {
                double[] dArr = (double[]) x0Var.f453r;
                if (i4 >= dArr.length) {
                    break;
                }
                double d = dArr[i4];
                if (d <= nanos && nanos < ((double[]) x0Var.f452q)[i4]) {
                    int[] iArr = (int[]) x0Var.f454s;
                    iArr[i4] = iArr[i4] + 1;
                }
                if (nanos < d) {
                    break;
                } else {
                    i4++;
                }
            }
        }
        this.f8015p = this.f8012m;
        this.f8016q = nanoTime;
        long longValue = ((Long) O1.r.d.c.a(AbstractC1066q6.f10294v)).longValue();
        long j4 = abstractC0322Pc.j();
        int i5 = 0;
        while (true) {
            String[] strArr = this.f8007h;
            if (i5 >= strArr.length) {
                return;
            }
            if (strArr[i5] == null && longValue > Math.abs(j4 - this.f8006g[i5])) {
                int i6 = 8;
                Bitmap bitmap = abstractC0322Pc.getBitmap(8, 8);
                long j5 = 63;
                int i7 = 0;
                long j6 = 0;
                while (i7 < i6) {
                    int i8 = 0;
                    while (i8 < i6) {
                        int pixel = bitmap.getPixel(i8, i7);
                        j6 |= (Color.green(pixel) + (Color.red(pixel) + Color.blue(pixel)) > 128 ? 1L : 0L) << ((int) j5);
                        j5--;
                        i8++;
                        i6 = 8;
                    }
                    i7++;
                    i6 = 8;
                }
                strArr[i5] = String.format("%016X", Long.valueOf(j6));
                return;
            }
            i5++;
        }
    }
}
