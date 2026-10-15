package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.qA, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1070qA implements Es {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ C1070qA f10319p = new C1070qA(0);

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ C1070qA f10320q = new C1070qA(1);

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f10321o;

    public /* synthetic */ C1070qA(int i4) {
        this.f10321o = i4;
    }

    @Override // com.google.android.gms.internal.ads.Es
    public final boolean l(Object obj) {
        switch (this.f10321o) {
            case 0:
                return ((Map.Entry) obj).getKey() != null;
            default:
                return ((String) obj) != null;
        }
    }
}
