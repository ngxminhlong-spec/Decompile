package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.d1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0505d1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8435a = 1;

    /* renamed from: b, reason: collision with root package name */
    public int f8436b;

    public /* synthetic */ AbstractC0505d1() {
    }

    public AbstractC0505d1(int i4) {
        this.f8436b = i4;
    }

    public static int b(int i4) {
        return (i4 >> 24) & 255;
    }

    public static String c(int i4) {
        StringBuilder sb = new StringBuilder();
        sb.append((char) ((i4 >> 24) & 255));
        sb.append((char) ((i4 >> 16) & 255));
        sb.append((char) ((i4 >> 8) & 255));
        sb.append((char) (i4 & 255));
        return sb.toString();
    }

    public boolean a(int i4) {
        return (this.f8436b & i4) == i4;
    }

    public String toString() {
        switch (this.f8435a) {
            case 0:
                return c(this.f8436b);
            default:
                return super.toString();
        }
    }
}
