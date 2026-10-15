package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.tF, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1203tF extends IOException {
    public C1203tF(Throwable th) {
        super("Unexpected " + th.getClass().getSimpleName() + ": " + th.getMessage(), th);
    }
}
