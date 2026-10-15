package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.lt, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0880lt {

    /* renamed from: a, reason: collision with root package name */
    public Object[] f9503a;

    /* renamed from: b, reason: collision with root package name */
    public int f9504b = 0;
    public boolean c;

    public AbstractC0880lt(int i4) {
        this.f9503a = new Object[i4];
    }

    public static int d(int i4, int i5) {
        int i6 = i4 + (i4 >> 1) + 1;
        if (i6 < i5) {
            int highestOneBit = Integer.highestOneBit(i5 - 1);
            i6 = highestOneBit + highestOneBit;
        }
        if (i6 < 0) {
            return Integer.MAX_VALUE;
        }
        return i6;
    }

    public final void a(Object obj) {
        obj.getClass();
        e(this.f9504b + 1);
        Object[] objArr = this.f9503a;
        int i4 = this.f9504b;
        this.f9504b = i4 + 1;
        objArr[i4] = obj;
    }

    public abstract AbstractC0880lt b(Object obj);

    public final void c(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            e(collection.size() + this.f9504b);
            if (collection instanceof AbstractC0923mt) {
                this.f9504b = ((AbstractC0923mt) collection).h(this.f9504b, this.f9503a);
                return;
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            b(it.next());
        }
    }

    public final void e(int i4) {
        Object[] objArr = this.f9503a;
        int length = objArr.length;
        if (length < i4) {
            this.f9503a = Arrays.copyOf(objArr, d(length, i4));
            this.c = false;
        } else if (this.c) {
            this.f9503a = (Object[]) objArr.clone();
            this.c = false;
        }
    }
}
