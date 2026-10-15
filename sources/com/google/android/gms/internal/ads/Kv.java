package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class Kv {

    /* renamed from: a, reason: collision with root package name */
    public static final Lw f6079a;

    /* renamed from: b, reason: collision with root package name */
    public static final Jw f6080b;
    public static final C1355ww c;
    public static final C1269uw d;

    static {
        Zy a4 = AbstractC0415ax.a("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        f6079a = new Lw(Jv.class, C1475zn.f11659G);
        f6080b = new Jw(a4, C1475zn.f11660H);
        c = new C1355ww(Dv.class);
        d = new C1269uw(a4, C1475zn.f11661I);
    }

    public static Iv a(EnumC0672gy enumC0672gy) {
        int ordinal = enumC0672gy.ordinal();
        if (ordinal == 1) {
            return Iv.f5760q;
        }
        if (ordinal == 2) {
            return Iv.f5763t;
        }
        if (ordinal == 3) {
            return Iv.f5762s;
        }
        if (ordinal == 4) {
            return Iv.f5764u;
        }
        if (ordinal == 5) {
            return Iv.f5761r;
        }
        if (enumC0672gy != EnumC0672gy.f8893v) {
            throw new GeneralSecurityException(U.a.i("Unable to parse HashType: ", enumC0672gy.f8895o));
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static C0753iv b(Jy jy) {
        int ordinal = jy.ordinal();
        if (ordinal == 1) {
            return C0753iv.f9091t;
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                return C0753iv.f9093v;
            }
            if (ordinal != 4) {
                throw new GeneralSecurityException(U.a.i("Unable to parse OutputPrefixType: ", jy.a()));
            }
        }
        return C0753iv.f9092u;
    }
}
