package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class Pv {

    /* renamed from: a, reason: collision with root package name */
    public static final Lw f6611a;

    /* renamed from: b, reason: collision with root package name */
    public static final Jw f6612b;
    public static final C1355ww c;
    public static final C1269uw d;

    static {
        Zy a4 = AbstractC0415ax.a("type.googleapis.com/google.crypto.tink.AesEaxKey");
        f6611a = new Lw(Ov.class, C1475zn.f11662J);
        f6612b = new Jw(a4, C1475zn.f11663K);
        c = new C1355ww(Mv.class);
        d = new C1269uw(a4, C1475zn.f11664L);
    }

    public static Iv a(Jy jy) {
        int ordinal = jy.ordinal();
        if (ordinal == 1) {
            return Iv.f5765v;
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                return Iv.f5767x;
            }
            if (ordinal != 4) {
                throw new GeneralSecurityException(U.a.i("Unable to parse OutputPrefixType: ", jy.a()));
            }
        }
        return Iv.f5766w;
    }
}
