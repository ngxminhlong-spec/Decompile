package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.List;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.nt, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0966nt extends Ys implements Serializable {

    /* renamed from: o, reason: collision with root package name */
    public final Object f9780o;

    /* renamed from: p, reason: collision with root package name */
    public final Object f9781p;

    public C0966nt(Object obj, List list) {
        this.f9780o = obj;
        this.f9781p = list;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f9780o;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f9781p;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
