package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.ex, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0585ex {

    /* renamed from: a, reason: collision with root package name */
    public static final Lw f8659a;

    /* renamed from: b, reason: collision with root package name */
    public static final Jw f8660b;
    public static final C1355ww c;
    public static final C1269uw d;

    static {
        Zy a4 = AbstractC0415ax.a("type.googleapis.com/google.crypto.tink.AesCmacKey");
        f8659a = new Lw(C0542dx.class, Yv.f7905B);
        f8660b = new Jw(a4, Yv.f7906C);
        c = new C1355ww(C0458bx.class);
        d = new C1269uw(a4, Yv.f7907D);
    }

    public static Iv a(Jy jy) {
        int ordinal = jy.ordinal();
        if (ordinal == 1) {
            return Iv.f5756H;
        }
        if (ordinal == 2) {
            return Iv.f5758J;
        }
        if (ordinal == 3) {
            return Iv.f5759K;
        }
        if (ordinal == 4) {
            return Iv.f5757I;
        }
        throw new GeneralSecurityException(U.a.i("Unable to parse OutputPrefixType: ", jy.a()));
    }
}
