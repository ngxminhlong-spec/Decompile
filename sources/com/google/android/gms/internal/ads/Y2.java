package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Y2 extends AbstractC1028pB {

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f7729w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Y2(String str, int i4) {
        super(str);
        this.f7729w = i4;
    }

    private final void e(ByteBuffer byteBuffer) {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1028pB
    public final void c(ByteBuffer byteBuffer) {
        switch (this.f7729w) {
            case 0:
                byteBuffer.position(byteBuffer.remaining() + byteBuffer.position());
                return;
            default:
                return;
        }
    }
}
