package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Wy extends ThreadLocal {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0621fq f7579a;

    public Wy(C0621fq c0621fq) {
        this.f7579a = c0621fq;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        C0621fq c0621fq = this.f7579a;
        try {
            Uy uy = Uy.c;
            Mac mac = (Mac) uy.f7212a.o((String) c0621fq.f8748q);
            mac.init((SecretKeySpec) c0621fq.f8749r);
            return mac;
        } catch (GeneralSecurityException e4) {
            throw new IllegalStateException(e4);
        }
    }
}
