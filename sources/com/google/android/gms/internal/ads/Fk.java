package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Fk {

    /* renamed from: e, reason: collision with root package name */
    public static final Fk f5070e = new Fk(-1, -1, -1);

    /* renamed from: a, reason: collision with root package name */
    public final int f5071a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5072b;
    public final int c;
    public final int d;

    public Fk(int i4, int i5, int i6) {
        this.f5071a = i4;
        this.f5072b = i5;
        this.c = i6;
        this.d = AbstractC0751is.d(i6) ? AbstractC0751is.r(i6, i5) : -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Fk)) {
            return false;
        }
        Fk fk = (Fk) obj;
        return this.f5071a == fk.f5071a && this.f5072b == fk.f5072b && this.c == fk.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f5071a), Integer.valueOf(this.f5072b), Integer.valueOf(this.c)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioFormat[sampleRate=");
        sb.append(this.f5071a);
        sb.append(", channelCount=");
        sb.append(this.f5072b);
        sb.append(", encoding=");
        return U.a.l(sb, this.c, "]");
    }
}
