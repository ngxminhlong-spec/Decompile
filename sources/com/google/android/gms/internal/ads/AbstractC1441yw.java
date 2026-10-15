package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.yw, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1441yw {

    /* renamed from: a, reason: collision with root package name */
    public final Class f11550a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f11551b;
    public final Class c;

    public AbstractC1441yw(Class cls, Fv... fvArr) {
        this.f11550a = cls;
        HashMap hashMap = new HashMap();
        for (int i4 = 0; i4 <= 0; i4++) {
            Fv fv = fvArr[i4];
            Class cls2 = fv.f5102a;
            if (hashMap.containsKey(cls2)) {
                throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive ".concat(String.valueOf(cls2.getCanonicalName())));
            }
            hashMap.put(cls2, fv);
        }
        this.c = fvArr[0].f5102a;
        this.f11551b = Collections.unmodifiableMap(hashMap);
    }

    public abstract Bs a();

    public abstract int b();

    public abstract AbstractC0417az c(AbstractC0886lz abstractC0886lz);

    public abstract String d();

    public abstract void e(AbstractC0417az abstractC0417az);

    public abstract int f();

    public final Object g(AbstractC0417az abstractC0417az, Class cls) {
        Fv fv = (Fv) this.f11551b.get(cls);
        if (fv != null) {
            return fv.a(abstractC0417az);
        }
        throw new IllegalArgumentException(U.a.k("Requested primitive class ", cls.getCanonicalName(), " not supported."));
    }
}
