package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class Vv {

    /* renamed from: a, reason: collision with root package name */
    public static final Lw f7309a;

    /* renamed from: b, reason: collision with root package name */
    public static final Jw f7310b;
    public static final C1355ww c;
    public static final C1269uw d;

    static {
        Zy a4 = AbstractC0415ax.a("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        f7309a = new Lw(Uv.class, C1475zn.f11667P);
        f7310b = new Jw(a4, C1475zn.f11668Q);
        c = new C1355ww(Tv.class);
        d = new C1269uw(a4, C1475zn.f11669R);
    }

    public static Iv a(Jy jy) {
        int ordinal = jy.ordinal();
        if (ordinal == 1) {
            return Iv.y;
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                return Iv.f5749A;
            }
            if (ordinal != 4) {
                throw new GeneralSecurityException(U.a.i("Unable to parse OutputPrefixType: ", jy.a()));
            }
        }
        return Iv.f5768z;
    }
}
