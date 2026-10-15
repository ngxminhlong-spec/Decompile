package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.measurement.s1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1571s1 {
    protected int zzb;

    public static void a(Iterable iterable, List list) {
        Charset charset = O1.f11796a;
        iterable.getClass();
        if (iterable instanceof T1) {
            List f4 = ((T1) iterable).f();
            T1 t12 = (T1) list;
            int size = list.size();
            for (Object obj : f4) {
                if (obj == null) {
                    String str = "Element at index " + (t12.size() - size) + " is null.";
                    int size2 = t12.size();
                    while (true) {
                        size2--;
                        if (size2 < size) {
                            break;
                        } else {
                            t12.remove(size2);
                        }
                    }
                    throw new NullPointerException(str);
                }
                if (obj instanceof C1591x1) {
                    t12.e((C1591x1) obj);
                } else {
                    t12.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof InterfaceC1531i2) {
            list.addAll((Collection) iterable);
            return;
        }
        if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) list).ensureCapacity(((Collection) iterable).size() + list.size());
        }
        int size3 = list.size();
        for (Object obj2 : iterable) {
            if (obj2 == null) {
                String str2 = "Element at index " + (list.size() - size3) + " is null.";
                int size4 = list.size();
                while (true) {
                    size4--;
                    if (size4 < size3) {
                        break;
                    } else {
                        list.remove(size4);
                    }
                }
                throw new NullPointerException(str2);
            }
            list.add(obj2);
        }
    }

    public final byte[] b() {
        try {
            int c = c();
            byte[] bArr = new byte[c];
            C1595y1 c1595y1 = new C1595y1(c, bArr);
            I1 i12 = (I1) this;
            InterfaceC1549m2 a4 = C1536j2.c.a(i12.getClass());
            C1599z1 c1599z1 = c1595y1.f12118b;
            if (c1599z1 == null) {
                c1599z1 = new C1599z1(c1595y1);
            }
            a4.e(i12, c1599z1);
            if (c - c1595y1.f12119e == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e4) {
            throw new RuntimeException(U.a.k("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e4);
        }
    }

    public abstract int c();
}
