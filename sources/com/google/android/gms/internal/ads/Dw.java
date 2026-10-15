package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Dw {

    /* renamed from: b, reason: collision with root package name */
    public static final Dw f4803b = new Dw();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f4804a = new HashMap();

    public final synchronized void a(Cw cw, Class cls) {
        try {
            Cw cw2 = (Cw) this.f4804a.get(cls);
            if (cw2 != null && !cw2.equals(cw)) {
                throw new GeneralSecurityException("Different key creator for parameters class already inserted");
            }
            this.f4804a.put(cls, cw);
        } catch (Throwable th) {
            throw th;
        }
    }
}
