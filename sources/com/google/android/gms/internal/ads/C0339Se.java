package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Map;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.Se, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0339Se {

    /* renamed from: a, reason: collision with root package name */
    public final Map f6986a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f6987b;

    public /* synthetic */ C0339Se(Map map, Map map2) {
        this.f6986a = map;
        this.f6987b = map2;
    }

    public Object a(Enum r32) {
        Object obj = this.f6986a.get(r32);
        if (obj != null) {
            return obj;
        }
        throw new GeneralSecurityException("Unable to convert proto enum: ".concat(String.valueOf(r32)));
    }
}
