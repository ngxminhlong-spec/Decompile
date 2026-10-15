package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public interface PD {
    void a(int i4);

    int b();

    void c(int i4, boolean z4);

    ByteBuffer d(int i4);

    MediaFormat e();

    void f(Bundle bundle);

    void g();

    void i(int i4, int i5, int i6, long j4);

    void j(Surface surface);

    int k(MediaCodec.BufferInfo bufferInfo);

    void l();

    void m(int i4, long j4);

    void n(int i4, PB pb, long j4);

    ByteBuffer v(int i4);
}
