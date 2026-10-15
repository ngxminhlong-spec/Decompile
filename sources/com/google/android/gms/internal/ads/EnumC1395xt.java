package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.xt, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1395xt implements Iterator {

    /* renamed from: o, reason: collision with root package name */
    public static final EnumC1395xt f11308o;

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ EnumC1395xt[] f11309p;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, com.google.android.gms.internal.ads.xt] */
    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f11308o = r02;
        f11309p = new EnumC1395xt[]{r02};
    }

    public static EnumC1395xt[] values() {
        return (EnumC1395xt[]) f11309p.clone();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        Bs.j0("no calls to next() since the last call to remove()", false);
    }
}
