package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.fF, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0604fF extends AbstractC0774jF {

    /* renamed from: j, reason: collision with root package name */
    public static final Ft f8695j = new C0667gt(UE.f7155q);

    /* renamed from: k, reason: collision with root package name */
    public static final Ft f8696k = new C0667gt(UE.f7156r);
    public final Object c;
    public final Context d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f8697e;

    /* renamed from: f, reason: collision with root package name */
    public ZE f8698f;

    /* renamed from: g, reason: collision with root package name */
    public final B0.c f8699g;

    /* renamed from: h, reason: collision with root package name */
    public C0644gC f8700h;

    /* renamed from: i, reason: collision with root package name */
    public final UC f8701i;

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, B0.c] */
    public C0604fF(Context context) {
        Spatializer spatializer;
        int immersiveAudioLevel;
        B0.c cVar;
        UC uc = new UC(11);
        int i4 = ZE.f7979t;
        ZE ze = new ZE(new YE(context));
        this.c = new Object();
        this.d = context.getApplicationContext();
        this.f8701i = uc;
        this.f8698f = ze;
        this.f8700h = C0644gC.f8792b;
        boolean e4 = AbstractC0751is.e(context);
        this.f8697e = e4;
        if (!e4 && AbstractC0751is.f9071a >= 32) {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            if (audioManager == null) {
                cVar = null;
            } else {
                spatializer = audioManager.getSpatializer();
                ?? obj = new Object();
                obj.f68p = spatializer;
                immersiveAudioLevel = spatializer.getImmersiveAudioLevel();
                obj.f67o = immersiveAudioLevel != 0;
                cVar = obj;
            }
            this.f8699g = cVar;
        }
        boolean z4 = this.f8698f.f7984o;
    }

    public static int c(C0976o2 c0976o2, String str, boolean z4) {
        if (!TextUtils.isEmpty(str) && str.equals(c0976o2.c)) {
            return 4;
        }
        String d = d(str);
        String d4 = d(c0976o2.c);
        if (d4 == null || d == null) {
            return (z4 && d4 == null) ? 1 : 0;
        }
        if (d4.startsWith(d) || d.startsWith(d4)) {
            return 3;
        }
        int i4 = AbstractC0751is.f9071a;
        return d4.split("-", 2)[0].equals(d.split("-", 2)[0]) ? 2 : 0;
    }

    public static String d(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    public static boolean f(int i4, boolean z4) {
        int i5 = i4 & 7;
        if (i5 != 4) {
            return z4 && i5 == 3;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v6, types: [com.google.android.gms.internal.ads.Gt] */
    public static final Pair h(int i4, C0733iF c0733iF, int[][][] iArr, InterfaceC0476cF interfaceC0476cF, Comparator comparator) {
        boolean z4;
        ?? arrayList;
        ArrayList arrayList2 = new ArrayList();
        for (int i5 = 0; i5 < 2; i5++) {
            if (i4 == c0733iF.f9040a[i5]) {
                RE re = c0733iF.f9041b[i5];
                for (int i6 = 0; i6 < re.f6797a; i6++) {
                    Gt p3 = interfaceC0476cF.p(i5, re.a(i6), iArr[i5][i6]);
                    boolean z5 = true;
                    boolean[] zArr = new boolean[1];
                    int i7 = 0;
                    while (i7 <= 0) {
                        int i8 = i7 + 1;
                        AbstractC0519dF abstractC0519dF = (AbstractC0519dF) p3.get(i7);
                        int a4 = abstractC0519dF.a();
                        if (zArr[i7] || a4 == 0) {
                            z4 = z5;
                        } else {
                            if (a4 == z5) {
                                arrayList = AbstractC1137rt.t(abstractC0519dF);
                            } else {
                                arrayList = new ArrayList();
                                arrayList.add(abstractC0519dF);
                                int i9 = i8;
                                while (i9 <= 0) {
                                    boolean z6 = z5;
                                    AbstractC0519dF abstractC0519dF2 = (AbstractC0519dF) p3.get(i9);
                                    if (abstractC0519dF2.a() == 2 && abstractC0519dF.b(abstractC0519dF2)) {
                                        arrayList.add(abstractC0519dF2);
                                        zArr[i9] = z6;
                                    }
                                    i9++;
                                    z5 = z6;
                                }
                            }
                            z4 = z5;
                            arrayList2.add(arrayList);
                        }
                        i7 = i8;
                        z5 = z4;
                    }
                }
            }
        }
        if (arrayList2.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList2, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            iArr2[i10] = ((AbstractC0519dF) list.get(i10)).f8483q;
        }
        AbstractC0519dF abstractC0519dF3 = (AbstractC0519dF) list.get(0);
        return Pair.create(new C0647gF(abstractC0519dF3.f8482p, iArr2), Integer.valueOf(abstractC0519dF3.f8481o));
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [com.google.android.gms.internal.ads.cF, java.lang.Object, B0.c] */
    /* JADX WARN: Type inference failed for: r13v3, types: [com.google.android.gms.internal.ads.Bt, java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.AbstractC0774jF
    public final Pair a(C0733iF c0733iF, int[][][] iArr, int[] iArr2) {
        ZE ze;
        int i4;
        boolean z4;
        String str;
        int i5;
        int i6;
        int[] iArr3;
        int length;
        TE te;
        int i7;
        UC uc;
        C0647gF[] c0647gFArr;
        int i8;
        int i9;
        B0.c cVar;
        synchronized (this.c) {
            try {
                ze = this.f8698f;
                if (ze.f7984o && AbstractC0751is.f9071a >= 32 && (cVar = this.f8699g) != null) {
                    Looper myLooper = Looper.myLooper();
                    Zf.C(myLooper);
                    if (((C0391aF) cVar.f70r) == null && ((Handler) cVar.f69q) == null) {
                        cVar.f70r = new C0391aF(this);
                        Handler handler = new Handler(myLooper);
                        cVar.f69q = handler;
                        ((Spatializer) cVar.f68p).addOnSpatializerStateChangedListener(new ExecutorC1319w2(handler, 2), (C0391aF) cVar.f70r);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        int i10 = 2;
        C0647gF[] c0647gFArr2 = new C0647gF[2];
        Pair h4 = h(2, c0733iF, iArr, new Qw(ze, iArr2, 5, false), UE.f7158t);
        int i11 = 0;
        if (h4 != null) {
            c0647gFArr2[((Integer) h4.second).intValue()] = (C0647gF) h4.first;
        }
        int i12 = 0;
        while (true) {
            i4 = 1;
            if (i12 >= 2) {
                z4 = false;
                break;
            }
            if (c0733iF.f9040a[i12] == 2 && c0733iF.f9041b[i12].f6797a > 0) {
                z4 = true;
                break;
            }
            i12++;
        }
        ?? obj = new Object();
        obj.f68p = this;
        obj.f69q = ze;
        obj.f67o = z4;
        obj.f70r = iArr2;
        Pair h5 = h(1, c0733iF, iArr, obj, UE.f7157s);
        if (h5 != null) {
            c0647gFArr2[((Integer) h5.second).intValue()] = (C0647gF) h5.first;
        }
        if (h5 == null) {
            str = null;
        } else {
            C0647gF c0647gF = (C0647gF) h5.first;
            str = c0647gF.f8801a.c[c0647gF.f8802b[0]].c;
        }
        int i13 = 3;
        Pair h6 = h(3, c0733iF, iArr, new Wl(11, ze, str), UE.f7159u);
        if (h6 != null) {
            c0647gFArr2[((Integer) h6.second).intValue()] = (C0647gF) h6.first;
        }
        int i14 = 0;
        while (i14 < i10) {
            int i15 = c0733iF.f9040a[i14];
            if (i15 == i10 || i15 == i4 || i15 == i13) {
                i9 = i11;
            } else {
                RE re = c0733iF.f9041b[i14];
                int[][] iArr4 = iArr[i14];
                C0997oh c0997oh = null;
                XE xe = null;
                for (int i16 = i11; i16 < re.f6797a; i16++) {
                    C0997oh a4 = re.a(i16);
                    int[] iArr5 = iArr4[i16];
                    for (int i17 = i11; i17 <= 0; i17 = 1) {
                        int i18 = i11;
                        if (f(iArr5[i18], ze.f7985p)) {
                            XE xe2 = new XE(a4.c[i18], iArr5[i18]);
                            if (xe == null || AbstractC0837kt.f9329a.d(xe2.f7624p, xe.f7624p).d(xe2.f7623o, xe.f7623o).a() > 0) {
                                c0997oh = a4;
                                xe = xe2;
                            }
                        }
                        i11 = i18;
                    }
                }
                i9 = i11;
                c0647gFArr2[i14] = c0997oh == null ? null : new C0647gF(c0997oh, new int[]{i9});
            }
            i14++;
            i11 = i9;
            i10 = 2;
            i4 = 1;
            i13 = 3;
        }
        int i19 = i11;
        HashMap hashMap = new HashMap();
        for (int i20 = i19; i20 < 2; i20++) {
            RE re2 = c0733iF.f9041b[i20];
            for (int i21 = i19; i21 < re2.f6797a; i21++) {
                if (ze.f9644i.get(re2.a(i21)) != null) {
                    throw new ClassCastException();
                }
            }
        }
        RE re3 = c0733iF.d;
        for (int i22 = i19; i22 < re3.f6797a; i22++) {
            if (ze.f9644i.get(re3.a(i22)) != null) {
                throw new ClassCastException();
            }
        }
        int i23 = i19;
        while (true) {
            int i24 = 2;
            if (i23 >= 2) {
                int i25 = i19;
                while (i25 < i24) {
                    RE re4 = c0733iF.f9041b[i25];
                    Map map = (Map) ze.f7987r.get(i25);
                    if (map != null && map.containsKey(re4)) {
                        Map map2 = (Map) ze.f7987r.get(i25);
                        if (map2 != null && map2.get(re4) != null) {
                            throw new ClassCastException();
                        }
                        c0647gFArr2[i25] = null;
                    }
                    i25++;
                    i24 = 2;
                }
                int i26 = i19;
                while (i26 < i24) {
                    int i27 = c0733iF.f9040a[i26];
                    if (ze.f7988s.get(i26) || ze.f9645j.contains(Integer.valueOf(i27))) {
                        c0647gFArr2[i26] = null;
                    }
                    i26++;
                    i24 = 2;
                }
                UC uc2 = this.f8701i;
                Zf.C(this.f9148b);
                ArrayList arrayList = new ArrayList();
                int i28 = 0;
                int i29 = 0;
                while (true) {
                    i6 = 1;
                    if (i29 >= 2) {
                        break;
                    }
                    C0647gF c0647gF2 = c0647gFArr2[i29];
                    if (c0647gF2 == null || c0647gF2.f8802b.length <= 1) {
                        arrayList.add(null);
                    } else {
                        AbstractC0880lt abstractC0880lt = new AbstractC0880lt(4);
                        abstractC0880lt.a(new SE(0L, 0L));
                        arrayList.add(abstractC0880lt);
                    }
                    i29++;
                }
                long[][] jArr = new long[2];
                int i30 = 0;
                while (i30 < 2) {
                    C0647gF c0647gF3 = c0647gFArr2[i30];
                    if (c0647gF3 == null) {
                        jArr[i30] = new long[i28];
                        i8 = i28;
                    } else {
                        int[] iArr6 = c0647gF3.f8802b;
                        i8 = i28;
                        jArr[i30] = new long[iArr6.length];
                        for (int i31 = i8; i31 < iArr6.length; i31++) {
                            long j4 = c0647gF3.f8801a.c[iArr6[i31]].f9809g;
                            long[] jArr2 = jArr[i30];
                            if (j4 == -1) {
                                j4 = 0;
                            }
                            jArr2[i31] = j4;
                        }
                        Arrays.sort(jArr[i30]);
                    }
                    i30++;
                    i28 = i8;
                }
                int i32 = i28;
                int[] iArr7 = new int[2];
                long[] jArr3 = new long[2];
                for (int i33 = i32; i33 < 2; i33++) {
                    long[] jArr4 = jArr[i33];
                    jArr3[i33] = jArr4.length == 0 ? 0L : jArr4[i32];
                }
                TE.d(arrayList, jArr3);
                Ct ct = new Ct(new TreeMap(Et.f4954p), new Object());
                int i34 = i32;
                for (i5 = 2; i34 < i5; i5 = 2) {
                    int length2 = jArr[i34].length;
                    if (length2 <= i6) {
                        uc = uc2;
                        i7 = i6;
                    } else {
                        double[] dArr = new double[length2];
                        i7 = i6;
                        int i35 = i32;
                        while (true) {
                            long[] jArr5 = jArr[i34];
                            double d = 0.0d;
                            if (i35 >= jArr5.length) {
                                break;
                            }
                            UC uc3 = uc2;
                            long j5 = jArr5[i35];
                            if (j5 != -1) {
                                d = Math.log(j5);
                            }
                            dArr[i35] = d;
                            i35++;
                            uc2 = uc3;
                        }
                        uc = uc2;
                        int i36 = length2 - 1;
                        double d4 = dArr[i36] - dArr[i32];
                        int i37 = i32;
                        while (i37 < i36) {
                            double d5 = dArr[i37];
                            i37++;
                            Double valueOf = Double.valueOf(d4 == 0.0d ? 1.0d : (((d5 + dArr[i37]) * 0.5d) - dArr[i32]) / d4);
                            double d6 = d4;
                            Integer valueOf2 = Integer.valueOf(i34);
                            Map map3 = ct.f4555r;
                            int[] iArr8 = iArr7;
                            Collection collection = (Collection) map3.get(valueOf);
                            if (collection == null) {
                                Collection b4 = ct.b();
                                c0647gFArr = c0647gFArr2;
                                if (!((ArrayList) b4).add(valueOf2)) {
                                    throw new AssertionError("New Collection violated the Collection spec");
                                }
                                ct.f4556s++;
                                map3.put(valueOf, b4);
                            } else {
                                c0647gFArr = c0647gFArr2;
                                if (collection.add(valueOf2)) {
                                    ct.f4556s++;
                                }
                            }
                            c0647gFArr2 = c0647gFArr;
                            d4 = d6;
                            iArr7 = iArr8;
                        }
                    }
                    i34++;
                    uc2 = uc;
                    i6 = i7;
                    c0647gFArr2 = c0647gFArr2;
                    iArr7 = iArr7;
                }
                UC uc4 = uc2;
                int[] iArr9 = iArr7;
                C0647gF[] c0647gFArr3 = c0647gFArr2;
                Zs zs = ct.f8173p;
                if (zs == null) {
                    zs = new Zs(0, ct);
                    ct.f8173p = zs;
                }
                AbstractC1137rt r4 = AbstractC1137rt.r(zs);
                for (int i38 = i32; i38 < r4.size(); i38++) {
                    int intValue = ((Integer) r4.get(i38)).intValue();
                    int i39 = iArr9[intValue] + 1;
                    iArr9[intValue] = i39;
                    jArr3[intValue] = jArr[intValue][i39];
                    TE.d(arrayList, jArr3);
                }
                for (int i40 = i32; i40 < 2; i40++) {
                    if (arrayList.get(i40) != null) {
                        long j6 = jArr3[i40];
                        jArr3[i40] = j6 + j6;
                    }
                }
                TE.d(arrayList, jArr3);
                Object[] objArr = new Object[4];
                int i41 = i32;
                int i42 = i41;
                while (i42 < arrayList.size()) {
                    C1009ot c1009ot = (C1009ot) arrayList.get(i42);
                    Gt f4 = c1009ot == null ? Gt.f5344s : c1009ot.f();
                    f4.getClass();
                    int i43 = i41 + 1;
                    int length3 = objArr.length;
                    if (length3 < i43) {
                        objArr = Arrays.copyOf(objArr, AbstractC0880lt.d(length3, i43));
                    }
                    objArr[i41] = f4;
                    i42++;
                    i41 = i43;
                }
                Gt q4 = AbstractC1137rt.q(i41, objArr);
                int i44 = 2;
                InterfaceC0690hF[] interfaceC0690hFArr = new InterfaceC0690hF[2];
                int i45 = i19;
                while (i45 < i44) {
                    C0647gF c0647gF4 = c0647gFArr3[i45];
                    if (c0647gF4 != null && (length = (iArr3 = c0647gF4.f8802b).length) != 0) {
                        if (length == 1) {
                            te = new TE(c0647gF4.f8801a, new int[]{iArr3[i19]});
                        } else {
                            C0997oh c0997oh2 = c0647gF4.f8801a;
                            AbstractC1137rt abstractC1137rt = (AbstractC1137rt) q4.get(i45);
                            uc4.getClass();
                            TE te2 = new TE(c0997oh2, iArr3);
                            AbstractC1137rt.r(abstractC1137rt);
                            te = te2;
                        }
                        interfaceC0690hFArr[i45] = te;
                    }
                    i45++;
                    i44 = 2;
                }
                KC[] kcArr = new KC[i44];
                for (int i46 = i19; i46 < i44; i46++) {
                    kcArr[i46] = (ze.f7988s.get(i46) || ze.f9645j.contains(Integer.valueOf(c0733iF.f9040a[i46])) || (c0733iF.f9040a[i46] != -2 && interfaceC0690hFArr[i46] == null)) ? null : KC.f5995a;
                }
                return Pair.create(kcArr, interfaceC0690hFArr);
            }
            if (hashMap.get(Integer.valueOf(c0733iF.f9040a[i23])) != null) {
                throw new ClassCastException();
            }
            i23++;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0774jF
    public final void b() {
        B0.c cVar;
        C0391aF c0391aF;
        synchronized (this.c) {
            try {
                if (AbstractC0751is.f9071a >= 32 && (cVar = this.f8699g) != null && (c0391aF = (C0391aF) cVar.f70r) != null && ((Handler) cVar.f69q) != null) {
                    ((Spatializer) cVar.f68p).removeOnSpatializerStateChangedListener(c0391aF);
                    ((Handler) cVar.f69q).removeCallbacksAndMessages(null);
                    cVar.f69q = null;
                    cVar.f70r = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f9147a = null;
        this.f9148b = null;
    }

    public final void e(YE ye) {
        boolean equals;
        ZE ze = new ZE(ye);
        synchronized (this.c) {
            equals = this.f8698f.equals(ze);
            this.f8698f = ze;
        }
        if (equals) {
            return;
        }
        if (ze.f7984o && this.d == null) {
            Wj.l("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
        C1029pC c1029pC = this.f9147a;
        if (c1029pC != null) {
            c1029pC.f9953v.c(10);
        }
    }

    public final void g() {
        boolean z4;
        C1029pC c1029pC;
        B0.c cVar;
        synchronized (this.c) {
            try {
                z4 = false;
                if (this.f8698f.f7984o && !this.f8697e && AbstractC0751is.f9071a >= 32 && (cVar = this.f8699g) != null && cVar.f67o) {
                    z4 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z4 || (c1029pC = this.f9147a) == null) {
            return;
        }
        c1029pC.f9953v.c(10);
    }
}
