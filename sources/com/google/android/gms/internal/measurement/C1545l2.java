package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.measurement.l2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1545l2 {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC1571s1 f11965a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11966b;
    public final Object[] c;
    public final int d;

    public C1545l2(AbstractC1571s1 abstractC1571s1, String str, Object[] objArr) {
        this.f11965a = abstractC1571s1;
        this.f11966b = str;
        this.c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.d = charAt;
            return;
        }
        int i4 = charAt & 8191;
        int i5 = 13;
        int i6 = 1;
        while (true) {
            int i7 = i6 + 1;
            char charAt2 = str.charAt(i6);
            if (charAt2 < 55296) {
                this.d = i4 | (charAt2 << i5);
                return;
            } else {
                i4 |= (charAt2 & 8191) << i5;
                i5 += 13;
                i6 = i7;
            }
        }
    }
}
