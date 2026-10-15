package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.n1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0932n1 implements As {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ C0932n1 f9694b = new C0932n1(0);
    public static final /* synthetic */ C0932n1 c = new C0932n1(1);
    public static final /* synthetic */ C0932n1 d = new C0932n1(2);

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ C0932n1 f9695e = new C0932n1(3);

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ C0932n1 f9696f = new C0932n1(4);

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ C0932n1 f9697g = new C0932n1(5);

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ C0932n1 f9698h = new C0932n1(6);

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ C0932n1 f9699i = new C0932n1(7);

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ C0932n1 f9700j = new C0932n1(8);

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ C0932n1 f9701k = new C0932n1(9);

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ C0932n1 f9702l = new C0932n1(10);

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ C0932n1 f9703m = new C0932n1(11);

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ C0932n1 f9704n = new C0932n1(12);

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ C0932n1 f9705o = new C0932n1(13);

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ C0932n1 f9706p = new C0932n1(14);

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ C0932n1 f9707q = new C0932n1(15);

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ C0932n1 f9708r = new C0932n1(16);

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ C0932n1 f9709s = new C0932n1(17);

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ C0932n1 f9710t = new C0932n1(18);

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ C0932n1 f9711u = new C0932n1(19);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9712a;

    public /* synthetic */ C0932n1(int i4) {
        this.f9712a = i4;
    }

    @Override // com.google.android.gms.internal.ads.As
    public final Object apply(Object obj) {
        int i4 = 5;
        int i5 = 3;
        String str = null;
        switch (this.f9712a) {
            case 0:
                return (C1061q1) obj;
            case 1:
                Throwable th = (Throwable) obj;
                C0427b8 c0427b8 = AbstractC0554e8.f8561a;
                if (((Boolean) M6.f6218i.r()).booleanValue()) {
                    N1.n.f1204A.f1209g.h("prepareClickUrl.attestation1", th);
                }
                return "failure_click_attok";
            case 2:
                List list = C0291Jb.f5856l;
                return null;
            case 3:
                return "failure_click_attok";
            case 4:
                return new C0483cg((List) obj);
            case 5:
                return new C0483cg((Yf) obj);
            case 6:
                ArrayList arrayList = new ArrayList();
                for (BinderC0682h7 binderC0682h7 : (List) obj) {
                    if (binderC0682h7 != null) {
                        arrayList.add(binderC0682h7);
                    }
                }
                return arrayList;
            case 7:
                ArrayList arrayList2 = new ArrayList();
                for (C0742ij c0742ij : (List) obj) {
                    if (c0742ij != null) {
                        arrayList2.add(c0742ij);
                    }
                }
                return arrayList2;
            case 8:
                return Collections.singletonList(Bs.h0((C1427yi) obj));
            case 9:
                ArrayList arrayList3 = (ArrayList) obj;
                if (arrayList3.isEmpty()) {
                    return null;
                }
                return new Wn(1, arrayList3);
            case 10:
                b2.b bVar = (b2.b) obj;
                return new C0406ao(bVar.f3492b, 0, bVar.f3491a);
            case 11:
                W1.f fVar = (W1.f) obj;
                return fVar != null ? new Tn(fVar.f1993a, i5) : new Tn(str, i5);
            case 12:
                Y9.q("", (Exception) obj);
                return new Tn(str, i5);
            case 13:
                return new Tn((String) obj, 4);
            case 14:
                String str2 = (String) obj;
                if (str2 == null) {
                    return null;
                }
                return new Tn(str2, i4);
            case 15:
                return new Xn(5, (Bundle) obj);
            case 16:
                String str3 = (String) obj;
                if (str3 == null) {
                    return null;
                }
                return new Tn(str3, 6);
            case 17:
                return (C0706hp) obj;
            case 18:
                String str4 = ((Fp) obj).f5086a;
                return TextUtils.isEmpty(str4) ? "" : C1421yc.c() ? "fakeForAdDebugLog" : str4;
            case 19:
                String str5 = ((Fp) obj).f5087b;
                return TextUtils.isEmpty(str5) ? "" : C1421yc.c() ? "fakeForAdDebugLog" : str5;
            case 20:
                return (C1061q1) obj;
            default:
                return null;
        }
    }
}
