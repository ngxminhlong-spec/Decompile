package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import java.io.PushbackInputStream;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.g5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0637g5 extends PushbackInputStream {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Op f8784o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0637g5(Op op, ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream) {
        super(autoCloseInputStream, 1);
        this.f8784o = op;
    }

    @Override // java.io.PushbackInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        A2.o.n((A2.o) this.f8784o.f6527r);
        super.close();
    }
}
