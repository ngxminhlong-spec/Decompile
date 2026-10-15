package com.google.android.gms.internal.play_billing;

import java.util.Arrays;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.play_billing.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC1601a {
    f12176p("RESPONSE_CODE_UNSPECIFIED"),
    /* JADX INFO: Fake field, exist only in values array */
    EF18("SERVICE_TIMEOUT"),
    /* JADX INFO: Fake field, exist only in values array */
    EF27("FEATURE_NOT_SUPPORTED"),
    /* JADX INFO: Fake field, exist only in values array */
    EF36("SERVICE_DISCONNECTED"),
    /* JADX INFO: Fake field, exist only in values array */
    EF44("OK"),
    /* JADX INFO: Fake field, exist only in values array */
    EF52("USER_CANCELED"),
    /* JADX INFO: Fake field, exist only in values array */
    EF60("SERVICE_UNAVAILABLE"),
    /* JADX INFO: Fake field, exist only in values array */
    EF70("BILLING_UNAVAILABLE"),
    /* JADX INFO: Fake field, exist only in values array */
    EF83("ITEM_UNAVAILABLE"),
    /* JADX INFO: Fake field, exist only in values array */
    EF96("DEVELOPER_ERROR"),
    /* JADX INFO: Fake field, exist only in values array */
    EF109("ERROR"),
    /* JADX INFO: Fake field, exist only in values array */
    EF122("ITEM_ALREADY_OWNED"),
    /* JADX INFO: Fake field, exist only in values array */
    EF133("ITEM_NOT_OWNED"),
    /* JADX INFO: Fake field, exist only in values array */
    EF148("EXPIRED_OFFER_TOKEN"),
    /* JADX INFO: Fake field, exist only in values array */
    EF163("NETWORK_ERROR");


    /* renamed from: q, reason: collision with root package name */
    public static final C1625m f12177q;

    /* renamed from: o, reason: collision with root package name */
    public final int f12179o;

    /* JADX WARN: Type inference failed for: r0v3, types: [androidx.activity.result.c, java.lang.Object] */
    static {
        ?? obj = new Object();
        obj.f2432b = new Object[8];
        obj.f2431a = 0;
        for (EnumC1601a enumC1601a : values()) {
            Integer valueOf = Integer.valueOf(enumC1601a.f12179o);
            int i4 = obj.f2431a + 1;
            Object[] objArr = (Object[]) obj.f2432b;
            int length = objArr.length;
            int i5 = i4 + i4;
            if (i5 > length) {
                int i6 = length + (length >> 1) + 1;
                if (i6 < i5) {
                    int highestOneBit = Integer.highestOneBit(i5 - 1);
                    i6 = highestOneBit + highestOneBit;
                }
                obj.f2432b = Arrays.copyOf(objArr, i6 < 0 ? Integer.MAX_VALUE : i6);
            }
            Object[] objArr2 = (Object[]) obj.f2432b;
            int i7 = obj.f2431a;
            int i8 = i7 + i7;
            objArr2[i8] = valueOf;
            objArr2[i8 + 1] = enumC1601a;
            obj.f2431a = i7 + 1;
        }
        C1611f c1611f = (C1611f) obj.c;
        if (c1611f != null) {
            throw c1611f.a();
        }
        C1625m a4 = C1625m.a(obj.f2431a, (Object[]) obj.f2432b, obj);
        C1611f c1611f2 = (C1611f) obj.c;
        if (c1611f2 != null) {
            throw c1611f2.a();
        }
        f12177q = a4;
    }

    EnumC1601a(String str) {
        this.f12179o = r2;
    }
}
