package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Yz extends LinkedHashMap {

    /* renamed from: p, reason: collision with root package name */
    public static final Yz f7935p;

    /* renamed from: o, reason: collision with root package name */
    public boolean f7936o = true;

    static {
        Yz yz = new Yz();
        f7935p = yz;
        yz.f7936o = false;
    }

    public static int b(Object obj) {
        if (!(obj instanceof byte[])) {
            if (obj instanceof Fz) {
                throw new UnsupportedOperationException();
            }
            return obj.hashCode();
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        Charset charset = Mz.f6292a;
        int i4 = length;
        for (byte b4 : bArr) {
            i4 = (i4 * 31) + b4;
        }
        if (i4 == 0) {
            return 1;
        }
        return i4;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.LinkedHashMap, com.google.android.gms.internal.ads.Yz] */
    public final Yz a() {
        if (isEmpty()) {
            return new Yz();
        }
        ?? linkedHashMap = new LinkedHashMap(this);
        linkedHashMap.f7936o = true;
        return linkedHashMap;
    }

    public final void c() {
        if (!this.f7936o) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        c();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return isEmpty() ? Collections.EMPTY_SET : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this == map) {
            return true;
        }
        if (size() != map.size()) {
            return false;
        }
        for (Map.Entry entry : entrySet()) {
            if (!map.containsKey(entry.getKey())) {
                return false;
            }
            Object value = entry.getValue();
            Object obj2 = map.get(entry.getKey());
            if (!(((value instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i4 = 0;
        for (Map.Entry entry : entrySet()) {
            i4 += b(entry.getValue()) ^ b(entry.getKey());
        }
        return i4;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        c();
        Charset charset = Mz.f6292a;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        c();
        for (Object obj : map.keySet()) {
            Charset charset = Mz.f6292a;
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        c();
        return super.remove(obj);
    }
}
