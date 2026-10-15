package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.fw, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0627fw extends Av {

    /* renamed from: a, reason: collision with root package name */
    public final String f8764a;

    /* renamed from: b, reason: collision with root package name */
    public final Iv f8765b;
    public final Av c;

    public C0627fw(String str, Iv iv, Av av) {
        this.f8764a = str;
        this.f8765b = iv;
        this.c = av;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1054pv
    public final boolean a() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0627fw)) {
            return false;
        }
        C0627fw c0627fw = (C0627fw) obj;
        return c0627fw.f8765b.equals(this.f8765b) && c0627fw.c.equals(this.c) && c0627fw.f8764a.equals(this.f8764a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{C0627fw.class, this.f8764a, this.f8765b, this.c});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f8765b);
        String valueOf2 = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder("LegacyKmsEnvelopeAead Parameters (kekUri: ");
        sb.append(this.f8764a);
        sb.append(", dekParsingStrategy: ");
        sb.append(valueOf);
        sb.append(", dekParametersForNewKeys: ");
        return n0.a.j(sb, valueOf2, ")");
    }
}
