package com.google.android.gms.internal.play_billing;

import java.io.IOException;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class M extends IOException {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f12153o = 0;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.io.IOException, com.google.android.gms.internal.play_billing.M] */
    public static M a() {
        return new IOException("Protocol message had invalid UTF-8.");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.io.IOException, com.google.android.gms.internal.play_billing.M] */
    public static M b() {
        return new IOException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.io.IOException, com.google.android.gms.internal.play_billing.M] */
    public static M c() {
        return new IOException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
