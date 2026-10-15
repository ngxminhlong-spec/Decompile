package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class Zv {

    /* renamed from: a, reason: collision with root package name */
    public static final Lw f8063a;

    /* renamed from: b, reason: collision with root package name */
    public static final Jw f8064b;
    public static final C1355ww c;
    public static final C1269uw d;

    static {
        Zy a4 = AbstractC0415ax.a("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        f8063a = new Lw(Xv.class, C1475zn.f11670S);
        f8064b = new Jw(a4, C1475zn.f11671T);
        c = new C1355ww(Wv.class);
        d = new C1269uw(a4, Yv.f7922p);
    }

    public static C0753iv a(Jy jy) {
        int ordinal = jy.ordinal();
        if (ordinal == 1) {
            return C0753iv.f9096z;
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                return C0753iv.f9084B;
            }
            if (ordinal != 4) {
                throw new GeneralSecurityException(U.a.i("Unable to parse OutputPrefixType: ", jy.a()));
            }
        }
        return C0753iv.f9083A;
    }
}
