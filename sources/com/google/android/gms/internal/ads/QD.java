package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class QD extends Exception {

    /* renamed from: o, reason: collision with root package name */
    public final String f6653o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QD(IllegalStateException illegalStateException, SD sd) {
        super("Decoder failed: ".concat(String.valueOf(sd == null ? null : sd.f6957a)), illegalStateException);
        String str = null;
        if (AbstractC0751is.f9071a >= 21 && (illegalStateException instanceof MediaCodec.CodecException)) {
            str = ((MediaCodec.CodecException) illegalStateException).getDiagnosticInfo();
        }
        this.f6653o = str;
    }
}
