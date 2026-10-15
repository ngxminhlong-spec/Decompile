package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.gw, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0670gw {

    /* renamed from: a, reason: collision with root package name */
    public static final Lw f8882a;

    /* renamed from: b, reason: collision with root package name */
    public static final Jw f8883b;
    public static final C1355ww c;
    public static final C1269uw d;

    static {
        Zy a4 = AbstractC0415ax.a("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        f8882a = new Lw(C0627fw.class, Yv.f7926t);
        f8883b = new Jw(a4, Yv.f7927u);
        c = new C1355ww(C0584ew.class);
        d = new C1269uw(a4, Yv.f7928v);
    }

    public static C0627fw a(Iy iy) {
        Iv iv;
        Object obj = Iv.f5755G;
        Iv iv2 = Iv.f5754F;
        Iv iv3 = Iv.f5753E;
        Iv iv4 = Iv.f5751C;
        Iv iv5 = Iv.f5752D;
        Iv iv6 = Iv.f5750B;
        C1100qy v4 = C1142ry.v();
        v4.f(iy.v().A());
        v4.g(iy.v().z());
        v4.e(Jy.f5945s);
        AbstractC1054pv h4 = Bs.h(((C1142ry) v4.b()).e());
        if (h4 instanceof Rv) {
            iv = iv6;
        } else if (h4 instanceof Xv) {
            iv = iv5;
        } else if (h4 instanceof C0797jw) {
            iv = iv4;
        } else if (h4 instanceof Jv) {
            iv = iv3;
        } else if (h4 instanceof Ov) {
            iv = iv2;
        } else {
            if (!(h4 instanceof Uv)) {
                throw new GeneralSecurityException("Unsupported DEK parameters when parsing ".concat(h4.toString()));
            }
            iv = obj;
        }
        String z4 = iy.z();
        Av av = (Av) h4;
        if (z4 == null) {
            throw new GeneralSecurityException("kekUri must be set");
        }
        if (av == null) {
            throw new GeneralSecurityException("dekParametersForNewKeys must be set");
        }
        if (av.a()) {
            throw new GeneralSecurityException("dekParametersForNewKeys must note have ID Requirements");
        }
        if ((iv.equals(iv6) && (av instanceof Rv)) || ((iv.equals(iv5) && (av instanceof Xv)) || ((iv.equals(iv4) && (av instanceof C0797jw)) || ((iv.equals(iv3) && (av instanceof Jv)) || ((iv.equals(iv2) && (av instanceof Ov)) || (iv.equals(obj) && (av instanceof Uv))))))) {
            return new C0627fw(z4, iv, av);
        }
        throw new GeneralSecurityException("Cannot use parsing strategy " + iv.f5770p + " when new keys are picked according to " + String.valueOf(av) + ".");
    }
}
