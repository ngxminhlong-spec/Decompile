package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class Oz extends IOException {

    /* renamed from: o, reason: collision with root package name */
    public boolean f6544o;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.io.IOException, com.google.android.gms.internal.ads.Nz] */
    public static Nz a() {
        return new IOException("Protocol message tag had invalid wire type.");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.io.IOException, com.google.android.gms.internal.ads.Oz] */
    public static Oz b() {
        return new IOException("Protocol message had invalid UTF-8.");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.io.IOException, com.google.android.gms.internal.ads.Oz] */
    public static Oz c() {
        return new IOException("CodedInputStream encountered a malformed varint.");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.io.IOException, com.google.android.gms.internal.ads.Oz] */
    public static Oz d() {
        return new IOException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.io.IOException, com.google.android.gms.internal.ads.Oz] */
    public static Oz e() {
        return new IOException("Failed to parse the message.");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.io.IOException, com.google.android.gms.internal.ads.Oz] */
    public static Oz f() {
        return new IOException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
