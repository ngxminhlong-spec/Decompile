package com.google.android.gms.internal.ads;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.f7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC0596f7 extends AbstractBinderC0852l7 {

    /* renamed from: w, reason: collision with root package name */
    public static final int f8679w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f8680x;

    /* renamed from: o, reason: collision with root package name */
    public final String f8681o;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f8682p;

    /* renamed from: q, reason: collision with root package name */
    public final ArrayList f8683q;

    /* renamed from: r, reason: collision with root package name */
    public final int f8684r;

    /* renamed from: s, reason: collision with root package name */
    public final int f8685s;

    /* renamed from: t, reason: collision with root package name */
    public final int f8686t;

    /* renamed from: u, reason: collision with root package name */
    public final int f8687u;

    /* renamed from: v, reason: collision with root package name */
    public final int f8688v;

    static {
        int rgb = Color.rgb(12, 174, 206);
        f8679w = Color.rgb(204, 204, 204);
        f8680x = rgb;
    }

    public BinderC0596f7(String str, List list, Integer num, Integer num2, Integer num3, int i4, int i5) {
        super("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
        this.f8682p = new ArrayList();
        this.f8683q = new ArrayList();
        this.f8681o = str;
        for (int i6 = 0; i6 < list.size(); i6++) {
            BinderC0682h7 binderC0682h7 = (BinderC0682h7) list.get(i6);
            this.f8682p.add(binderC0682h7);
            this.f8683q.add(binderC0682h7);
        }
        this.f8684r = num != null ? num.intValue() : f8679w;
        this.f8685s = num2 != null ? num2.intValue() : f8680x;
        this.f8686t = num3 != null ? num3.intValue() : 12;
        this.f8687u = i4;
        this.f8688v = i5;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0895m7
    public final ArrayList f() {
        return this.f8683q;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0895m7
    public final String h() {
        return this.f8681o;
    }
}
