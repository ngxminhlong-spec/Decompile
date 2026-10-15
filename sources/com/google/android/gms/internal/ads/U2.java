package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class U2 extends AbstractC1113rB {
    static {
        AbstractC0587ez.k(U2.class);
    }

    public U2(C0737id c0737id, T2 t22) {
        ByteBuffer byteBuffer = c0737id.f9044o;
        long limit = byteBuffer.limit();
        this.f10461p = c0737id;
        this.f10463r = c0737id.b();
        byteBuffer.position((int) (c0737id.b() + limit));
        this.f10464s = c0737id.b();
        this.f10460o = t22;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1113rB, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1113rB
    public final String toString() {
        String obj = this.f10461p.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 7);
        sb.append("model(");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
