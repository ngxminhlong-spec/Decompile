package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Arrays;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.bh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0442bh {

    /* renamed from: b, reason: collision with root package name */
    public static final C0442bh f8264b = new C0442bh(new C0437bc[0]);
    public static final C0437bc c;

    /* renamed from: a, reason: collision with root package name */
    public final C0437bc[] f8265a;

    static {
        C0437bc c0437bc = new C0437bc(-1, new int[0], new Uri[0], new long[0]);
        int[] iArr = c0437bc.c;
        int length = iArr.length;
        int max = Math.max(0, length);
        int[] copyOf = Arrays.copyOf(iArr, max);
        Arrays.fill(copyOf, length, max, 0);
        long[] jArr = c0437bc.d;
        int length2 = jArr.length;
        int max2 = Math.max(0, length2);
        long[] copyOf2 = Arrays.copyOf(jArr, max2);
        Arrays.fill(copyOf2, length2, max2, -9223372036854775807L);
        c = new C0437bc(0, copyOf, (Uri[]) Arrays.copyOf(c0437bc.f8257b, 0), copyOf2);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    public C0442bh(C0437bc[] c0437bcArr) {
        this.f8265a = c0437bcArr;
    }

    public final C0437bc a(int i4) {
        return i4 < 0 ? c : this.f8265a[i4];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0442bh.class == obj.getClass()) {
            int i4 = AbstractC0751is.f9071a;
            if (Arrays.equals(this.f8265a, ((C0442bh) obj).f8265a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f8265a) + (((int) (-9223372036854775807L)) * 961);
    }

    public final String toString() {
        return n0.a.k("AdPlaybackState(adsId=null, adResumePositionUs=0, adGroups=[", "])");
    }
}
