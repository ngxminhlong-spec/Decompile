package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.q8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1068q8 {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f10317a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1137rt f10318b;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
    }

    public C1068q8(Uri uri, AbstractC1137rt abstractC1137rt) {
        List list = Collections.EMPTY_LIST;
        this.f10317a = uri;
        this.f10318b = abstractC1137rt;
        Object[] objArr = new Object[4];
        if (abstractC1137rt.size() <= 0) {
            AbstractC1137rt.q(0, objArr);
        } else {
            abstractC1137rt.get(0).getClass();
            throw new ClassCastException();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1068q8)) {
            return false;
        }
        C1068q8 c1068q8 = (C1068q8) obj;
        if (!this.f10317a.equals(c1068q8.f10317a)) {
            return false;
        }
        int i4 = AbstractC0751is.f9071a;
        Object obj2 = Collections.EMPTY_LIST;
        if (!obj2.equals(obj2) || !this.f10318b.equals(c1068q8.f10318b)) {
            return false;
        }
        Object obj3 = -9223372036854775807L;
        return obj3.equals(obj3);
    }

    public final int hashCode() {
        return (int) ((((this.f10318b.hashCode() + ((Collections.EMPTY_LIST.hashCode() + (this.f10317a.hashCode() * 923521)) * 961)) * 31) * 31) - Long.MAX_VALUE);
    }
}
