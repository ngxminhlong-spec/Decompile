package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Iterator;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.tt, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1223tt extends AbstractC0880lt {
    public Object[] d;

    /* renamed from: e, reason: collision with root package name */
    public int f10757e;

    @Override // com.google.android.gms.internal.ads.AbstractC0880lt
    public final /* bridge */ /* synthetic */ AbstractC0880lt b(Object obj) {
        f(obj);
        return this;
    }

    public final void f(Object obj) {
        obj.getClass();
        if (this.d != null) {
            int p3 = AbstractC1266ut.p(this.f9504b);
            int length = this.d.length;
            if (p3 <= length) {
                int hashCode = obj.hashCode();
                int b4 = Bs.b(hashCode);
                while (true) {
                    Object[] objArr = this.d;
                    int i4 = b4 & (length - 1);
                    Object obj2 = objArr[i4];
                    if (obj2 == null) {
                        objArr[i4] = obj;
                        this.f10757e += hashCode;
                        a(obj);
                        return;
                    } else if (obj2.equals(obj)) {
                        return;
                    } else {
                        b4 = i4 + 1;
                    }
                }
            }
        }
        this.d = null;
        a(obj);
    }

    public final void g(Iterable iterable) {
        iterable.getClass();
        if (this.d == null) {
            c(iterable);
            return;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            f(it.next());
        }
    }

    public final AbstractC1266ut h() {
        AbstractC1266ut t4;
        int i4 = this.f9504b;
        if (i4 == 0) {
            return Mt.f6281x;
        }
        if (i4 == 1) {
            Object obj = this.f9503a[0];
            obj.getClass();
            return new Rt(obj);
        }
        if (this.d == null || AbstractC1266ut.p(i4) != this.d.length) {
            t4 = AbstractC1266ut.t(this.f9504b, this.f9503a);
            this.f9504b = t4.size();
        } else {
            int i5 = this.f9504b;
            Object[] objArr = this.f9503a;
            int length = objArr.length;
            if (i5 < (length >> 1) + (length >> 2)) {
                objArr = Arrays.copyOf(objArr, i5);
            }
            t4 = new Mt(this.f10757e, r8.length - 1, this.f9504b, objArr, this.d);
        }
        this.c = true;
        this.d = null;
        return t4;
    }
}
