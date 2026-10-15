package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class Tt implements Iterator {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f7095o;

    public abstract byte a();

    @Override // java.util.Iterator
    public /* synthetic */ Object next() {
        return Byte.valueOf(a());
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f7095o) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }
}
