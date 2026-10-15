package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.az, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0417az {
    protected int zza;

    /* JADX WARN: Multi-variable type inference failed */
    public static void d(Iterable iterable, List list) {
        Charset charset = Mz.f6292a;
        iterable.getClass();
        if (iterable instanceof Sz) {
            List f4 = ((Sz) iterable).f();
            Sz sz = (Sz) list;
            int size = list.size();
            for (Object obj : f4) {
                if (obj == null) {
                    String h4 = U.a.h(sz.size() - size, "Element at index ", " is null.");
                    int size2 = sz.size();
                    while (true) {
                        size2--;
                        if (size2 < size) {
                            break;
                        } else {
                            sz.remove(size2);
                        }
                    }
                    throw new NullPointerException(h4);
                }
                if (obj instanceof AbstractC0886lz) {
                    sz.m((AbstractC0886lz) obj);
                } else {
                    sz.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof InterfaceC0685hA) {
            list.addAll(iterable);
            return;
        }
        if (list instanceof ArrayList) {
            ((ArrayList) list).ensureCapacity(iterable.size() + list.size());
        }
        int size3 = list.size();
        for (Object obj2 : iterable) {
            if (obj2 == null) {
                String h5 = U.a.h(list.size() - size3, "Element at index ", " is null.");
                int size4 = list.size();
                while (true) {
                    size4--;
                    if (size4 < size3) {
                        break;
                    } else {
                        list.remove(size4);
                    }
                }
                throw new NullPointerException(h5);
            }
            list.add(obj2);
        }
    }

    public abstract void a(AbstractC1229tz abstractC1229tz);

    public abstract int b(InterfaceC0984oA interfaceC0984oA);

    public final C0800jz c() {
        try {
            int f4 = f();
            C0800jz c0800jz = AbstractC0886lz.f9510p;
            byte[] bArr = new byte[f4];
            Logger logger = AbstractC1229tz.c;
            C1101qz c1101qz = new C1101qz(f4, bArr);
            a(c1101qz);
            if (f4 - c1101qz.f10438g == 0) {
                return new C0800jz(bArr);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e4) {
            throw new RuntimeException(U.a.k("Serializing ", getClass().getName(), " to a ByteString threw an IOException (should never happen)."), e4);
        }
    }

    public final byte[] e() {
        try {
            int f4 = f();
            byte[] bArr = new byte[f4];
            Logger logger = AbstractC1229tz.c;
            C1101qz c1101qz = new C1101qz(f4, bArr);
            a(c1101qz);
            if (f4 - c1101qz.f10438g == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e4) {
            throw new RuntimeException(U.a.k("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e4);
        }
    }

    public abstract int f();
}
