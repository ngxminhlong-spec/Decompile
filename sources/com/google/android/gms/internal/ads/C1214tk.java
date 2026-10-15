package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.ArrayList;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.tk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1214tk {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC1137rt f10721a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f10722b = new ArrayList();
    public ByteBuffer[] c = new ByteBuffer[0];
    public boolean d;

    public C1214tk(AbstractC1137rt abstractC1137rt) {
        this.f10721a = abstractC1137rt;
        Fk fk = Fk.f5070e;
        this.d = false;
    }

    public final void a() {
        ArrayList arrayList = this.f10722b;
        arrayList.clear();
        this.d = false;
        int i4 = 0;
        while (true) {
            AbstractC1137rt abstractC1137rt = this.f10721a;
            if (i4 >= abstractC1137rt.size()) {
                break;
            }
            InterfaceC0403al interfaceC0403al = (InterfaceC0403al) abstractC1137rt.get(i4);
            interfaceC0403al.e();
            if (interfaceC0403al.h()) {
                arrayList.add(interfaceC0403al);
            }
            i4++;
        }
        this.c = new ByteBuffer[arrayList.size()];
        for (int i5 = 0; i5 <= d(); i5++) {
            this.c[i5] = ((InterfaceC0403al) arrayList.get(i5)).c();
        }
    }

    public final boolean b() {
        return this.d && ((InterfaceC0403al) this.f10722b.get(d())).f() && !this.c[d()].hasRemaining();
    }

    public final boolean c() {
        return !this.f10722b.isEmpty();
    }

    public final int d() {
        return this.c.length - 1;
    }

    public final void e(ByteBuffer byteBuffer) {
        boolean z4;
        do {
            int i4 = 0;
            z4 = false;
            while (i4 <= d()) {
                int i5 = i4 + 1;
                if (!this.c[i4].hasRemaining()) {
                    ArrayList arrayList = this.f10722b;
                    InterfaceC0403al interfaceC0403al = (InterfaceC0403al) arrayList.get(i4);
                    if (!interfaceC0403al.f()) {
                        ByteBuffer byteBuffer2 = i4 > 0 ? this.c[i4 - 1] : byteBuffer.hasRemaining() ? byteBuffer : InterfaceC0403al.f8159a;
                        long remaining = byteBuffer2.remaining();
                        interfaceC0403al.a(byteBuffer2);
                        this.c[i4] = interfaceC0403al.c();
                        boolean z5 = true;
                        if (remaining - byteBuffer2.remaining() <= 0 && !this.c[i4].hasRemaining()) {
                            z5 = false;
                        }
                        z4 |= z5;
                    } else if (!this.c[i4].hasRemaining() && i4 < d()) {
                        ((InterfaceC0403al) arrayList.get(i5)).i();
                    }
                }
                i4 = i5;
            }
        } while (z4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1214tk)) {
            return false;
        }
        AbstractC1137rt abstractC1137rt = ((C1214tk) obj).f10721a;
        AbstractC1137rt abstractC1137rt2 = this.f10721a;
        if (abstractC1137rt2.size() != abstractC1137rt.size()) {
            return false;
        }
        for (int i4 = 0; i4 < abstractC1137rt2.size(); i4++) {
            if (abstractC1137rt2.get(i4) != abstractC1137rt.get(i4)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.f10721a.hashCode();
    }
}
