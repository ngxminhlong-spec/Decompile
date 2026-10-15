package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Fv {

    /* renamed from: a, reason: collision with root package name */
    public final Class f5102a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5103b;

    public Fv(Class cls, int i4) {
        this.f5103b = i4;
        this.f5102a = cls;
    }

    public final Object a(AbstractC0417az abstractC0417az) {
        switch (this.f5103b) {
            case 0:
                Ex ex = (Ex) abstractC0417az;
                Fv[] fvArr = {new Fv(Vy.class, 1)};
                HashMap hashMap = new HashMap();
                for (int i4 = 0; i4 <= 0; i4++) {
                    Fv fv = fvArr[i4];
                    Class cls = fv.f5102a;
                    if (hashMap.containsKey(cls)) {
                        throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive ".concat(String.valueOf(cls.getCanonicalName())));
                    }
                    hashMap.put(cls, fv);
                }
                Class cls2 = fvArr[0].f5102a;
                Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
                Ix y = ex.y();
                Fv fv2 = (Fv) unmodifiableMap.get(Vy.class);
                if (fv2 != null) {
                    return new Ry((Vy) fv2.a(y), (InterfaceC1011ov) new C0714hx().g(ex.z(), InterfaceC1011ov.class), ex.z().z().v());
                }
                throw new IllegalArgumentException(U.a.k("Requested primitive class ", Vy.class.getCanonicalName(), " not supported."));
            case 1:
                Ix ix = (Ix) abstractC0417az;
                return new Oy(ix.y().v(), ix.z().h());
            case 2:
                Ox ox = (Ox) abstractC0417az;
                return new Py(ox.y().v(), ox.z().h());
            case 3:
                return new Qy(((Vx) abstractC0417az).y().h());
            case 4:
                return new C1098qw(((Zx) abstractC0417az).y().h());
            case 5:
                return new Bv(1, ((C0586ey) abstractC0417az).y().h());
            case 6:
                AbstractC0968nv.a(((Cy) abstractC0417az).y().y());
                throw null;
            case 7:
                AbstractC0968nv.a(((Gy) abstractC0417az).y().z());
                throw null;
            case 8:
                return new Bv(2, ((My) abstractC0417az).y().h());
            case 9:
                C1442yx c1442yx = (C1442yx) abstractC0417az;
                return new Xy(new C0882lv(c1442yx.z().h()), c1442yx.y().v());
            default:
                C0799jy c0799jy = (C0799jy) abstractC0417az;
                EnumC0672gy w2 = c0799jy.z().w();
                SecretKeySpec secretKeySpec = new SecretKeySpec(c0799jy.A().h(), "HMAC");
                int v4 = c0799jy.z().v();
                int ordinal = w2.ordinal();
                if (ordinal == 1) {
                    return new Xy(new C0621fq("HMACSHA1", secretKeySpec), v4);
                }
                if (ordinal == 2) {
                    return new Xy(new C0621fq("HMACSHA384", secretKeySpec), v4);
                }
                if (ordinal == 3) {
                    return new Xy(new C0621fq("HMACSHA256", secretKeySpec), v4);
                }
                if (ordinal == 4) {
                    return new Xy(new C0621fq("HMACSHA512", secretKeySpec), v4);
                }
                if (ordinal == 5) {
                    return new Xy(new C0621fq("HMACSHA224", secretKeySpec), v4);
                }
                throw new GeneralSecurityException("unknown hash");
        }
    }
}
