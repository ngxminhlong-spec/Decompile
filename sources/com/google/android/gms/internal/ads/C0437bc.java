package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Arrays;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.bc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0437bc {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f8255e = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f8256a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri[] f8257b;
    public final int[] c;
    public final long[] d;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
    }

    public C0437bc(int i4, int[] iArr, Uri[] uriArr, long[] jArr) {
        Zf.O(iArr.length == uriArr.length);
        this.f8256a = i4;
        this.c = iArr;
        this.f8257b = uriArr;
        this.d = jArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0437bc.class == obj.getClass()) {
            C0437bc c0437bc = (C0437bc) obj;
            if (this.f8256a == c0437bc.f8256a && Arrays.equals(this.f8257b, c0437bc.f8257b) && Arrays.equals(this.c, c0437bc.c) && Arrays.equals(this.d, c0437bc.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.d) + ((Arrays.hashCode(this.c) + (((((this.f8256a * 31) - 1) * 961) + Arrays.hashCode(this.f8257b)) * 31)) * 31)) * 961;
    }
}
