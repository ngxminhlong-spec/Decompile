package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class Sv {

    /* renamed from: a, reason: collision with root package name */
    public static final Lw f7021a;

    /* renamed from: b, reason: collision with root package name */
    public static final Jw f7022b;
    public static final C1355ww c;
    public static final C1269uw d;

    static {
        Zy a4 = AbstractC0415ax.a("type.googleapis.com/google.crypto.tink.AesGcmKey");
        f7021a = new Lw(Rv.class, C1475zn.f11665M);
        f7022b = new Jw(a4, C1475zn.N);
        c = new C1355ww(Qv.class);
        d = new C1269uw(a4, C1475zn.f11666O);
    }

    public static C0753iv a(Jy jy) {
        int ordinal = jy.ordinal();
        if (ordinal == 1) {
            return C0753iv.f9094w;
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                return C0753iv.y;
            }
            if (ordinal != 4) {
                throw new GeneralSecurityException(U.a.i("Unable to parse OutputPrefixType: ", jy.a()));
            }
        }
        return C0753iv.f9095x;
    }
}
