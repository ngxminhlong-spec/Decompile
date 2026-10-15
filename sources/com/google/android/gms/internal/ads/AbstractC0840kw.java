package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.kw, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0840kw {

    /* renamed from: a, reason: collision with root package name */
    public static final Lw f9334a;

    /* renamed from: b, reason: collision with root package name */
    public static final Jw f9335b;
    public static final C1355ww c;
    public static final C1269uw d;

    static {
        Zy a4 = AbstractC0415ax.a("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        f9334a = new Lw(C0797jw.class, Yv.f7929w);
        f9335b = new Jw(a4, Yv.f7930x);
        c = new C1355ww(C0754iw.class);
        d = new C1269uw(a4, Yv.y);
    }

    public static C0753iv a(Jy jy) {
        int ordinal = jy.ordinal();
        if (ordinal == 1) {
            return C0753iv.f9085C;
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                return C0753iv.f9087E;
            }
            if (ordinal != 4) {
                throw new GeneralSecurityException(U.a.i("Unable to parse OutputPrefixType: ", jy.a()));
            }
        }
        return C0753iv.f9086D;
    }
}
