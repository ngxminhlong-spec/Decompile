package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import android.util.Base64;
import c3.InterfaceFutureC0239a;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.ExecutionException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.Xe, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0364Xe implements Du {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ C0364Xe f7658b = new C0364Xe(0);
    public static final /* synthetic */ C0364Xe c = new C0364Xe(1);
    public static final /* synthetic */ C0364Xe d = new C0364Xe(2);

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ C0364Xe f7659e = new C0364Xe(3);

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ C0364Xe f7660f = new C0364Xe(4);

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ C0364Xe f7661g = new C0364Xe(5);

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ C0364Xe f7662h = new C0364Xe(6);

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ C0364Xe f7663i = new C0364Xe(7);

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ C0364Xe f7664j = new C0364Xe(8);

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ C0364Xe f7665k = new C0364Xe(9);

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ C0364Xe f7666l = new C0364Xe(10);

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ C0364Xe f7667m = new C0364Xe(11);

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ C0364Xe f7668n = new C0364Xe(12);

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ C0364Xe f7669o = new C0364Xe(13);

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ C0364Xe f7670p = new C0364Xe(14);

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ C0364Xe f7671q = new C0364Xe(15);

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ C0364Xe f7672r = new C0364Xe(16);

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ C0364Xe f7673s = new C0364Xe(17);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7674a;

    public /* synthetic */ C0364Xe(int i4) {
        this.f7674a = i4;
    }

    @Override // com.google.android.gms.internal.ads.Du
    public final InterfaceFutureC0239a l(Object obj) {
        InputStreamReader inputStreamReader;
        StringBuilder sb;
        char[] cArr;
        String str = null;
        int i4 = -1;
        int i5 = 5;
        int i6 = 1;
        int i7 = 0;
        switch (this.f7674a) {
            case 0:
                N1.n.f1204A.f1209g.h("GetTopicsApiWithRecordObservationActionHandler", (Throwable) obj);
                C1052pt c1052pt = AbstractC1137rt.f10543p;
                return Bs.h0(new Y.b(Gt.f5344s));
            case 1:
                return (InterfaceFutureC0239a) obj;
            case 2:
                return Bs.f0(((ExecutionException) obj).getCause());
            case 3:
                return Bs.f0(new Xk(5));
            case 4:
                return Pu.f6608p;
            case 5:
                Throwable th = (ExecutionException) obj;
                if (th.getCause() != null) {
                    th = th.getCause();
                }
                return Bs.f0(th);
            case 6:
                Throwable th2 = (ExecutionException) obj;
                if (th2.getCause() != null) {
                    th2 = th2.getCause();
                }
                return Bs.f0(th2);
            case 7:
                Throwable th3 = (ExecutionException) obj;
                if (th3.getCause() != null) {
                    th3 = th3.getCause();
                }
                return Bs.f0(th3);
            case 8:
                return Pu.f6608p;
            case 9:
                InputStream inputStream = (InputStream) obj;
                JSONObject jSONObject = new JSONObject();
                if (inputStream == null) {
                    return Bs.h0(jSONObject);
                }
                try {
                    Q1.N n4 = N1.n.f1204A.c;
                    inputStreamReader = new InputStreamReader(inputStream);
                    sb = new StringBuilder(8192);
                    cArr = new char[2048];
                } catch (IOException | JSONException e4) {
                    N1.n.f1204A.f1209g.h("AdsServiceSignalTask.startAdsServiceSignalTask", e4);
                }
                while (true) {
                    int read = inputStreamReader.read(cArr);
                    if (read == -1) {
                        jSONObject = new JSONObject(sb.toString());
                        return Bs.h0(jSONObject);
                    }
                    sb.append(cArr, 0, read);
                }
            case 10:
                Fl fl = (Fl) obj;
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("response", fl.f5073a);
                    JSONObject jSONObject3 = new JSONObject();
                    for (String str2 : fl.f5074b.keySet()) {
                        if (str2 != null) {
                            List<String> list = (List) fl.f5074b.get(str2);
                            JSONArray jSONArray = new JSONArray();
                            for (String str3 : list) {
                                if (str3 != null) {
                                    jSONArray.put(str3);
                                }
                            }
                            jSONObject3.put(str2, jSONArray);
                        }
                    }
                    jSONObject2.put("headers", jSONObject3);
                    Object obj2 = fl.c;
                    if (obj2 != null) {
                        jSONObject2.put("body", obj2);
                    }
                    jSONObject2.put("latency", fl.d);
                    return Bs.h0(new ByteArrayInputStream(jSONObject2.toString().getBytes(StandardCharsets.UTF_8)));
                } catch (JSONException e5) {
                    Y9.s("Error converting response to JSONObject: ".concat(String.valueOf(e5.getMessage())));
                    throw new JSONException("Parsing HTTP Response: ".concat(String.valueOf(e5.getCause())));
                }
            case 11:
                return Bs.h0(new ByteArrayInputStream(((JSONObject) obj).toString().getBytes(StandardCharsets.UTF_8)));
            case 12:
                return Bs.h0(new Tn((String) obj, i6));
            case 13:
                b2.b bVar = (b2.b) obj;
                if (bVar == null) {
                    return Bs.h0(new C0406ao(i4, i7, str));
                }
                return Bs.h0(new C0406ao(bVar.f3492b, i7, bVar.f3491a));
            case 14:
                return Pu.f6608p;
            case 15:
                GA v4 = HA.v();
                for (Y.c cVar : ((Y.b) obj).f2138a) {
                    EA v5 = FA.v();
                    int i8 = cVar.c;
                    v5.d();
                    ((FA) v5.f4561p).zzd = i8;
                    long j4 = cVar.f2140b;
                    v5.d();
                    ((FA) v5.f4561p).zze = j4;
                    long j5 = cVar.f2139a;
                    v5.d();
                    ((FA) v5.f4561p).zzf = j5;
                    FA fa = (FA) v5.b();
                    v4.d();
                    HA.w((HA) v4.f4561p, fa);
                }
                return Bs.h0(new C0406ao(i6, i6, Base64.encodeToString(((HA) v4.b()).e(), 1)));
            case 16:
                b2.b bVar2 = (b2.b) obj;
                int i9 = 2;
                if (bVar2 == null) {
                    return Bs.h0(new C0406ao(i4, i9, str));
                }
                return Bs.h0(new C0406ao(bVar2.f3492b, i9, bVar2.f3491a));
            case 17:
                return Pu.f6608p;
            case 18:
                Q1.I.x("Error during loading assets.", (Exception) obj);
                return Pu.f6608p;
            case 19:
                ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
                ParcelFileDescriptor parcelFileDescriptor = createPipe[0];
                AbstractC0266Ec.f4897a.execute(new Jn(i5, (InputStream) obj, createPipe[1]));
                return Bs.h0(parcelFileDescriptor);
            case 20:
                ParcelFileDescriptor[] createPipe2 = ParcelFileDescriptor.createPipe();
                ParcelFileDescriptor parcelFileDescriptor2 = createPipe2[0];
                AbstractC0266Ec.f4897a.execute(new Jn(i5, (InputStream) obj, createPipe2[1]));
                return Bs.h0(parcelFileDescriptor2);
            default:
                return Bs.h0("");
        }
    }
}
